package fr.unice.i3s.sigma.docgen.graphviz.ui

import scala.util.Failure
import scala.util.Success

import org.eclipse.jface.dialogs.IDialogConstants
import org.eclipse.jface.dialogs.MessageDialogWithToggle
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.dialogs.PreferencesUtil

import fr.unice.i3s.sigma.docgen.graphviz.common.GVDot
import fr.unice.i3s.sigma.docgen.graphviz.core.GraphvizCorePlugin
import fr.unice.i3s.sigma.scala.utils.SWTUtils.asyncExec

object GraphvizDiagnostics {

  def validate(dot: GVDot, shell: Shell): Boolean = {
    dot validate match {
      case Success(_) ⇒ true
      case Failure(e) ⇒ askToOpenPreferences(shell); false
    }
  }

  private[this] def askToOpenPreferences(shell: Shell) {
    asyncExec {
      val dialog = MessageDialogWithToggle
        .openYesNoQuestion(
          shell,
          "Sigma Graphviz diagnostics",
          "Your Sigma Graphwiz configuration does not seem to be correct. Do you want to check it now? Without it it will not be possible to generate class diagrams.",
          null, false, null, null);

      if (dialog.getReturnCode() == IDialogConstants.YES_ID) {
        val pref = PreferencesUtil
          .createPreferenceDialogOn(shell,
            GraphvizCorePlugin.GRAPHVIZ_PREFERENCE_PAGE_ID, null, null);

        if (pref != null) pref.open();
      }
    }
  }

}