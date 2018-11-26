package de.upb.dbis.owls;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

import logic.PetriNetResourceImpl;
import petrinet.PetriNet;

public class PetriNetResourceImplTest {

	@Before
	public void setup() {
		
	}
	
	@Test
	public void testDoLoad() {
		
//        ResourceSet resSet = new ResourceSetImpl();
//
//        Resource resource = resSet.getResource(URI.createURI("build/resources/test/petrinet.pnml"), true);
        
		PetriNet petrinet=null;
		try {
			petrinet = new PetriNetResourceImpl().doLoad(new FileInputStream(new File("build/resources/test/petrinet.pnml")), null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        PetriNet petrinet = (PetriNet) resource.getContents().get(0);
        
        assertNotNull(petrinet);
        assertTrue(petrinet.getPlaces().size()==2);
        assertTrue(petrinet.getArcs().size()==2);
        assertTrue(petrinet.getTransitions().size()==1);

	}

}
