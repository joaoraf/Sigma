package fr.unice.i3s.sigma.docgen.graphviz.core

import java.io.File
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.ecore.EPackage
import fr.unice.i3s.sigma.docgen.graphviz.common.GVOutputType
import fr.unice.i3s.sigma.docgen.common.ClassDiagram
import fr.unice.i3s.sigma.util.IOUtils.using
import fr.unice.i3s.sigma.util.PlatformUtils;
import fr.unice.i3s.sigma.docgen.graphviz.common.GVDot

// TODO: get rid of the file here
class GenerateClassDiagramJob(val pkg: EPackage, val output: File, val outputType: GVOutputType, dot: GVDot)
  extends Job("Generate Class Diagram") {

  require(pkg != null)
  require(output != null)
  require(dot != null)

  setPriority(Job.LONG)
  setUser(true)

  override def run(monitor: IProgressMonitor): IStatus = {
    try doRun(monitor)
    catch {
      case e: Throwable ⇒ PlatformUtils.createError("Unable to save class diagram", e)
    }

    Status.OK_STATUS
  }

  def doRun(monitor: IProgressMonitor) {
    monitor beginTask ("Generating class diagram", 1)

    val dotFile = File.createTempFile("sigma-docgen-classdiagram", ".dot")

    using(dotFile) { writer ⇒
      val digram = new ClassDiagram {
        rootElement = pkg
      }
      digram >> writer
    }

    dot.generate(dotFile, output, outputType)
    dotFile.delete

    monitor.done
  }

}