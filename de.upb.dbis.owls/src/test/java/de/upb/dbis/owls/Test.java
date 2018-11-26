package de.upb.dbis.owls;

import logic.Logic;
import owls.AnyOrder;
import owls.CompositeProcess;
import owls.ControlConstruct;
import owls.OwlsFactory;
import owls.Perform;

public class Test {

	@org.junit.Test
	public void test() {
		
		CompositeProcess compositeProcess = OwlsFactory.eINSTANCE.createCompositeProcess();
		
		ControlConstruct baseConstruct = OwlsFactory.eINSTANCE.createControlConstruct();
		
		//Sequence sequence =  OwlsFactory.eINSTANCE.createSequence();
		AnyOrder sequence = OwlsFactory.eINSTANCE.createAnyOrder();
		
		Perform perform = OwlsFactory.eINSTANCE.createPerform();
		Perform perform2 = OwlsFactory.eINSTANCE.createPerform();
		
		sequence.getComponents().add(perform);
		sequence.getComponents().add(perform2);
		
		baseConstruct.getComposedOf().add(sequence);
		
		compositeProcess.setComposedOf(baseConstruct);
		
		Logic logic = new Logic();
		
		logic.generateTraces(compositeProcess);
		
		logic.mining();

		
		
		
	}
	
	

}
