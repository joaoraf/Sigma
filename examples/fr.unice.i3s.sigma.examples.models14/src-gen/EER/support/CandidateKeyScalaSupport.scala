package EER.support

import EER.Attribute;
import EER.CandidateKey;

import fr.unice.i3s.sigma.support.EMFProxyBuilder;
import fr.unice.i3s.sigma.support.EMFScalaSupport;

import org.eclipse.emf.common.util.EList;

trait CandidateKeyScalaSupport extends EMFScalaSupport {
  type CandidateKey = EER.CandidateKey
  
  protected implicit val _candidatekeyProxyBuilder = new EMFProxyBuilder[CandidateKey](EERPackageScalaSupport._eerBuilder)
  
  object CandidateKey {
    def apply(attributes: EList[Attribute] = null, name: String = null): CandidateKey = {
      val _instance = EERPackageScalaSupport._eerBuilder.create[CandidateKey]
      
      if (attributes != null) _instance.getAttributes.addAll(attributes)
      if (name != null) _instance.setName(name)
      
      _instance
    }
  }
}

object CandidateKeyScalaSupport extends CandidateKeyScalaSupport