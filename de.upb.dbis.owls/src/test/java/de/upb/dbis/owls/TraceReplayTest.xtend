package de.upb.dbis.owls

import static org.junit.Assert.*
import org.junit.Test
import owls.OwlsFactory
import logic.TraceReplay

class TraceReplayTest {
	@Test def void testSequenceFlatPositive() {
		
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
		
		var replay = new TraceReplay();
		var trace = #["a", "b"];
		var can = replay.canReplay(trace, compositeprocess);
		
		assertTrue(can);
		
	}
	@Test def void testSequenceFlatNegative() {
		
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
		
		var replay = new TraceReplay();
		var trace = #["a", "a"];
		var can = replay.canReplay(trace, compositeprocess);
		
		assertFalse(can);
		
	}
	
	@Test def void testAnyOrderFlatPositive() {
		
		var a = OwlsFactory.eINSTANCE.createAtomicProcess();
		a.name = "a";
		var performA = OwlsFactory.eINSTANCE.createPerform();
		performA.process = a;
		
		var b = OwlsFactory.eINSTANCE.createAtomicProcess();
		b.name = "b";
		var performB = OwlsFactory.eINSTANCE.createPerform();
		performB.process = b;
		
		var compositeprocess = OwlsFactory.eINSTANCE.createCompositeProcess();
		var anyorder = OwlsFactory.eINSTANCE.createAnyOrder();
		anyorder.components.add(performA);
		anyorder.components.add(performB);
		compositeprocess.composedOf = anyorder;
				
		
		var replay = new TraceReplay();
		var trace = #["a", "b"];
		var can = replay.canReplay(trace, compositeprocess);
		
		assertTrue(can);
		
		trace = #["b", "a"];
		can = replay.canReplay(trace, compositeprocess);
		assertTrue(can);
		
	}
	
	@Test def void testAnyOrderFlatNegative() {
		
		var a = OwlsFactory.eINSTANCE.createAtomicProcess();
		a.name = "a";
		var performA = OwlsFactory.eINSTANCE.createPerform();
		performA.process = a;
		
		var b = OwlsFactory.eINSTANCE.createAtomicProcess();
		b.name = "b";
		var performB = OwlsFactory.eINSTANCE.createPerform();
		performB.process = b;
		
		var compositeprocess = OwlsFactory.eINSTANCE.createCompositeProcess();
		var anyorder = OwlsFactory.eINSTANCE.createAnyOrder();
		anyorder.components.add(performA);
		anyorder.components.add(performB);
		compositeprocess.composedOf = anyorder;
				
		
		var replay = new TraceReplay();
		var trace = #["a", "a"];
		var can = replay.canReplay(trace, compositeprocess);
		
		assertFalse(can);
		
		trace = #["b", "b"];
		can = replay.canReplay(trace, compositeprocess);
		assertFalse(can);
		
	}
	@Test def void testChoiceFlatPositve() {
		
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
		choice.components.add(performA);
		choice.components.add(performB);
		compositeprocess.composedOf = choice;
				
		
		var replay = new TraceReplay();
		var trace = #["a"];
		var can = replay.canReplay(trace, compositeprocess);
		
		assertTrue(can);
		
		trace = #["b"];
		can = replay.canReplay(trace, compositeprocess);
		assertTrue(can);
		
	}
	
	@Test def void testChoiceSequencePositive() {
		
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
		
		var d = OwlsFactory.eINSTANCE.createAtomicProcess();
		d.name = "d";
		var performD = OwlsFactory.eINSTANCE.createPerform();
		performD.process = d;		
		
		var compositeprocess = OwlsFactory.eINSTANCE.createCompositeProcess();
		var choice = OwlsFactory.eINSTANCE.createChoice();
		
		var sequenceA = OwlsFactory.eINSTANCE.createSequence();
		sequenceA.components.add(performA);
		sequenceA.components.add(performB);
		var sequenceB = OwlsFactory.eINSTANCE.createSequence();
		sequenceB.components.add(performC);
		sequenceB.components.add(performD);
		
		
		choice.components.add(sequenceA);
		choice.components.add(sequenceB);
		
		
		
		compositeprocess.composedOf = choice;
				
		
		var replay = new TraceReplay();
		var trace = #["a", "b"];
		var can = replay.canReplay(trace, compositeprocess);
		assertTrue(can);
		
		trace = #["c", "d"];
		can = replay.canReplay(trace, compositeprocess);
		assertTrue(can);
		
		trace = #["b", "a"];
		can = replay.canReplay(trace, compositeprocess);
		assertFalse(can);
		
		trace = #["a", "c"];
		can = replay.canReplay(trace, compositeprocess);
		assertFalse(can);
		
//		trace = #["a"];
//		can = replay.canReplay(trace, compositeprocess);
//		assertFalse(can);
		
		trace = #["a", "d"];
		can = replay.canReplay(trace, compositeprocess);
		assertFalse(can);
		
		trace = #["a", "b", "c"];
		can = replay.canReplay(trace, compositeprocess);
		assertFalse(can);					
		
	}	

}
