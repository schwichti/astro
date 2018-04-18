package de.upb.dbis.openapi.json

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI

class JsonResourceFactoryImpl extends ResourceFactoryImpl {
  override Resource createResource(URI uri)
  {
    return new JsonResourceImpl(uri);
  }		
}