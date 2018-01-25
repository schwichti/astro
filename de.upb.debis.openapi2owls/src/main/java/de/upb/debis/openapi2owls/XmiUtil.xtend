package de.upb.debis.openapi2owls;

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.io.IOException
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.impl.EcorePackageImpl
import java.io.File
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import java.util.HashMap
import org.eclipse.emf.ecore.xmi.XMIResource
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl

class XmiUtil {
	
	private ResourceSet resourceSet = new ResourceSetImpl();

	new(){
		
		
		EcorePackageImpl.init();

		registerExtension("ecore", new XMIResourceFactoryImpl());
		registerExtension("xmi", new XMIResourceFactoryImpl());
	}
	
	public def void registerExtension(String ext, ResourceFactoryImpl resourceFactory){
	    var reg = Resource.Factory.Registry.INSTANCE;
	    var m = reg.getExtensionToFactoryMap();
//	    m.put("ecore", new XMIResourceFactoryImpl());
//	    m.put("xmi", new XMIResourceFactoryImpl());
		m.put(ext, resourceFactory);
	}
	
	public def void registerURI(String nsURI, EPackage instance){
		resourceSet.getPackageRegistry().put(nsURI, instance);
		
	}
	public def EList<EObject> load(File ecoreFile){
		
		
		var resource = resourceSet.getResource(URI.createFileURI(ecoreFile.absolutePath), true);
	    return resource.getContents();
	}
	
	def write(EObject eobject, String filename){
		
		var content = new BasicEList<EObject>();
		content.add(eobject);
		
		write(content, filename);
		
	}
	
	def write(EList<EObject> contents, String filename){
	
	
//		var reg = Resource.Factory.Registry.INSTANCE;
//    	var m = reg.getExtensionToFactoryMap();
//	    m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        var resSet = new ResourceSetImpl();

        // create a resource
        var resource = resSet.createResource(URI
                        .createURI(filename));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        
        
//        OCLDelegateDomain.initialize(resSet) 
//        var diagnosis = Diagnostician.INSTANCE.validate(contents);
        
        
        resource.contents.addAll(contents);

        // now save the content.
        try {
        	
        		var opts = new HashMap<String, Object>();
				opts.put(XMIResource.OPTION_SCHEMA_LOCATION, true);
                resource.save(opts);
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
	

	}
}
