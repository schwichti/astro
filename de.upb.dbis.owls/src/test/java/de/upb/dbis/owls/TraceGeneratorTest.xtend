package de.upb.dbis.owls

import static org.junit.Assert.*
import org.junit.Test
import logic.TraceGenerator
import owls.OwlsFactory

class TraceGeneratorTest {
	@Test def void testSequence() {
		
		var a = OwlsFactory.eINSTANCE.createAtomicProcess();
		a.name = "a";
		var performA = OwlsFactory.eINSTANCE.createPerform();
		performA.process = a;
		
		var b = OwlsFactory.eINSTANCE.createAtomicProcess();
		b.name = "b";
		var performB = OwlsFactory.eINSTANCE.createPerform();
		performB.process = b;
		
		var compositeprocess = OwlsFactory.eINSTANCE.createCompositeProcess();
		var sequence = OwlsFactory.eINSTANCE.createSequence();
		compositeprocess.composedOf = sequence;
				
		sequence.components.add(performA);
		sequence.components.add(performB);
		
		var traceGenerator = new TraceGenerator();
		traceGenerator.process2(compositeprocess.composedOf);
		var traces = traceGenerator.generateTraces(compositeprocess, "build/resources/test/trace.xes");

		assertEquals(#[#["a","b"]], traces);
		assertNotEquals(#[#["b","a"]], traces);		
	}
	
	@Test def void testChoice() {
		
		var a = OwlsFactory.eINSTANCE.createAtomicProcess();
		a.name = "a";
		var performA = OwlsFactory.eINSTANCE.createPerform();
		performA.process = a;
		
		var b = OwlsFactory.eINSTANCE.createAtomicProcess();
		b.name = "b";
		var performB = OwlsFactory.eINSTANCE.createPerform();
		performB.process = b;
		
		var compositeprocess = OwlsFactory.eINSTANCE.createCompositeProcess();
		var choice = OwlsFactory.eINSTANCE.createChoice();
		compositeprocess.composedOf = choice;
				
		choice.components.add(performA);
		choice.components.add(performB);
		
		var traceGenerator = new TraceGenerator();
		traceGenerator.process2(compositeprocess.composedOf);
		var traces = traceGenerator.generateTraces(compositeprocess, "build/resources/test/trace.xes");

		assertEquals(#[#["a"],#["b"]], traces);		
	}
	
	@Test def void testAnyOrder() {
		
		var a = OwlsFactory.eINSTANCE.createAtomicProcess();
		a.name = "a";
		var performA = OwlsFactory.eINSTANCE.createPerform();
		performA.process = a;
		
		var b = OwlsFactory.eINSTANCE.createAtomicProcess();
		b.name = "b";
		var performB = OwlsFactory.eINSTANCE.createPerform();
		performB.process = b;
		
		var c = OwlsFactory.eINSTANCE.createAtomicProcess();
		c.name = "c";
		var performC = OwlsFactory.eINSTANCE.createPerform();
		performC.process = c;
		
		var compositeprocess = OwlsFactory.eINSTANCE.createCompositeProcess();
		var anyOrder = OwlsFactory.eINSTANCE.createAnyOrder();
		compositeprocess.composedOf = anyOrder;
				
		anyOrder.components.add(performA);
		anyOrder.components.add(performB);
		anyOrder.components.add(performC);
		
		var traceGenerator = new TraceGenerator();
		traceGenerator.process2(compositeprocess.composedOf);
		var traces = traceGenerator.generateTraces(compositeprocess, "build/resources/test/trace.xes");



		assertEquals(#[#["c", "b", "a"], #["b", "c", "a"], #["b", "a", "c"], #["c", "a", "b"], #["a", "c", "b"], #["a", "b", "c"]], traces);		
	}	
}