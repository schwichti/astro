package logic

import owls.CompositeProcess
import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class Evaluation {
	
	def CompositeProcess load(String sourcePath){
		
		var file = new File(sourcePath);
		
		if(file.exists){
			var reg = Resource.Factory.Registry.INSTANCE;
		    var m = reg.getExtensionToFactoryMap();
		    m.put("xmi", new XMIResourceFactoryImpl());
			
			var resSet = new ResourceSetImpl();
			var resource = resSet.getResource(URI.createURI(sourcePath), true);
			
			return resource.contents.get(0) as CompositeProcess;//TODO root object should be Service
		}
		
		return null;
	}
	
	def void run(String sourcePath, String tracePath, String pnmlPath, String petrinetXmi, String henshinPath, String targetPath){
		
		//Configure File paths here: .henshin, trace.xes, petrinet.xmi, petrinet.pnml, target.xmi, source.xmi
		
		var compositeProcess = load(sourcePath);
		
		//1. generate traces from controlconstruct
		var tracegenerator = new TraceGenerator();
		var traces = tracegenerator.generateTraces(compositeProcess, tracePath);
		
		//2. mine petrinet with prom
		//see https://svn.win.tue.nl/repos/prom/Packages/AlphaMiner/Trunk/tests/src-test/org/processmining/tests/alphaminer/AlphaMinerTest.java
		var promWrapper = new PromWrapper();
		promWrapper.minePetriNet(); 
		
		//3. transform to owl-s service protocol
		var henshinWrapper = new HenshinWrapper();
		henshinWrapper.transform(petrinetXmi, henshinPath);
		var compositeProcessPrime = load(targetPath);
		
		
		var traceReplay = new TraceReplay();
		traceReplay.canReplayTraces(traces, compositeProcessPrime)
		
		var truePositives = traceReplay.compatibleTraces;
		var totalTraces = traceReplay.totalTraces;
		
		var precision = truePositives / totalTraces;
		//because totalTraces are all positive cases, precision and recall are equivalent here  
		
		var controlConstructsOriginal = countControlConstructs(compositeProcess);
		
		var controlConstructsSynthesized = countControlConstructs(compositeProcessPrime);
		
		//soundness validator
						
		//4. measure
		
		var result = '''
		#total traces: «totalTraces»
		#true positives: «truePositives»
		precision: «precision»
		#nodes original: «controlConstructsOriginal»
		#nodes synthesized: «controlConstructsSynthesized»
		synthesized is sound: <not tested yet>
		'''
		System.out.println(result);
	}
	
	private def int countControlConstructs(CompositeProcess process){
		var result = 0;
		
		var iter = process.composedOf.eAllContents;
		
		while(iter.hasNext){
			result = result +1 ;
		}

		return result;		
	}
	

}
