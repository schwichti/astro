package de.upb.dbis.owls;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

import logic.HenshinWrapper;
import logic.PetriNetResourceImpl;

public class HenshinWrapperTest {

	@Test
	public void testTransform() {
		

//		Registry reg = Resource.Factory.Registry.INSTANCE;
//	    Map<String, Object> m = reg.getExtensionToFactoryMap();
//	    m.put("pnml", new PetriNetResourceFactoryImpl());
//	    m.put("xmi", new XMIResourceFactoryImpl());
		
		File sourceModel = new File("build/resources/test/petrinet.pnml");
		File xmiModel = new File("build/resources/test/petrinet.xmi");
		
		File henshinModel = new File("build/resources/test/petrinet2owls.henshin");
		
		PetriNetResourceImpl petrinetResource = new PetriNetResourceImpl();
		
		
		try {
			petrinetResource.doLoad(new FileInputStream(sourceModel), null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		petrinetResource.doSave(xmiModel);
		
//        ResourceSet resSet = new ResourceSetImpl();
//        Resource resource = resSet.getResource(URI.createURI("build/resources/test/petrinet.pnml"), true);
//        PetriNet petrinet = (PetriNet)resource.getContents().get(0);
//        
//        ResourceSet resSet2 = new ResourceSetImpl();
//        Resource resource2 = resSet2.createResource(URI.createURI("build/resources/test/petrinet.xmi"));
//        resource2.getContents().add(petrinet);
//        
//        
//        try {
//        	Map options = new HashMap();
//        	options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
//        	//options.put(XMIResource.OPTION_SUPPRESS_XMI, Boolean.TRUE);
//        	options.put(XMIResource.OPTION_ENCODING, "UTF-8");
//        	options.put(XMIResource.VERSION_2_1_VALUE, "2.0");
//        	options.put(XMIResource.XMI_2_1_URI, "http://www.omg.org/XMI");
//        	
//			resource2.save(options);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        
        
		assertTrue(xmiModel.exists());
		assertTrue(henshinModel.exists());
		
		HenshinWrapper henshinWrapper = new HenshinWrapper();
		henshinWrapper.transform(xmiModel, henshinModel);
		
		
	}

}
