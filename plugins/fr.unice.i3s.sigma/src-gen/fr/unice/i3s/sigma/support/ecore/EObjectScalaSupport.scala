package fr.unice.i3s.sigma.support.ecore

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import org.eclipse.emf.ecore.EObject;

trait EObjectScalaSupport extends EMFScalaSupport {
  type EObject = org.eclipse.emf.ecore.EObject
  
  protected implicit val _eobjectProxyBuilder = new EMFProxyBuilder[EObject](EcorePackageScalaSupport._ecoreBuilder)
  
  object EObject {
    def apply(): EObject = {
      val _instance = EcorePackageScalaSupport._ecoreBuilder.create[EObject]
      
      
      _instance
    }
  }
}

object EObjectScalaSupport extends EObjectScalaSupport
