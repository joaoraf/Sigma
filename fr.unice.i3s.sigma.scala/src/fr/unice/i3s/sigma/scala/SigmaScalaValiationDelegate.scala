package fr.unice.i3s.sigma.scala

import org.eclipse.emf.ecore.EClassifier
import fr.unice.i3s.sigma.delegates.SigmaValidationDelegate
import org.eclipse.emf.ecore.EClass

final class SigmaScalaValiationDelegate(target: EClass, domain: SigmaScalaDelegateDomain,
  constraint: String) extends SigmaValidationDelegate(target, domain, constraint) {

  override def getMethodSignature: String = {
    val selfType = domain.classifierTypeName(target)
    val name = getMethodName
    val typeParams = domain.classifierTypeParameters(target)

    s"def $name$typeParams(self: $selfType): Boolean"
  }

}