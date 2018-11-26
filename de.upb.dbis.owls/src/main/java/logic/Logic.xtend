package logic

import java.util.ArrayList
import java.util.Collection
import java.util.List
import owls.AnyOrder
import owls.ControlConstruct
import owls.IfThenElse
import owls.Perform
import owls.Sequence
import java.io.File
import owls.CompositeProcess
import java.util.Date
import java.text.SimpleDateFormat
import java.io.FileWriter
import java.util.TimeZone
import java.lang.ProcessBuilder.Redirect
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl
import org.eclipse.emf.ecore.resource.Resource
import java.util.Map
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl

class Logic {
	
	private int level = 0;
	
	def void evaluation(){
		
		//1. generate traces from controlconstruct
		
		//2. mine petrinet with prom
		//see https://svn.win.tue.nl/repos/prom/Packages/AlphaMiner/Trunk/tests/src-test/org/processmining/tests/alphaminer/AlphaMinerTest.java

		
		//3. transform to owl-s service protocol
		
		//4. measure
	}
	
	def void mining(){
		var pb = new ProcessBuilder("cmd", "/C", "prom.bat", "-f", "prom.cli.alphaminer.txt");
		//var pb = new ProcessBuilder("cmd", "/C", "prom.bat", "-l");
		var dir = new File("./scripts");
		pb.directory(dir);
		//pb.redirectOutput(Redirect.INHERIT);
		//pb.redirectError(Redirect.INHERIT);
		var p = pb.start();
		p.waitFor();
		
		p.destroy();
		
		
	}
	

	
	/**
	 * Checks if a trace conforms to a CompositeProcess
	 */
	def boolean conforms(){
		
		return true;
	}
	
	def generateTraces(CompositeProcess cp){
		
		var traces = process(cp.composedOf);
		
		var i = 0L;
		var Date date;
		//2008-12-09T08:22:01.527+01:00
		
		var tz = TimeZone.getTimeZone("UTC");
		var dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
		dateFormat.setTimeZone(tz);
		
		var content = 
		'''
		<?xml version="1.0" encoding="UTF-8" ?>
		<log xes.version="1.0" xes.features="nested-attributes" openxes.version="1.0RC7" xmlns="http://www.xes-standard.org/">
			<extension name="Lifecycle" prefix="lifecycle" uri="http://www.xes-standard.org/lifecycle.xesext"/>
			<extension name="Organizational" prefix="org" uri="http://www.xes-standard.org/org.xesext"/>
			<extension name="Time" prefix="time" uri="http://www.xes-standard.org/time.xesext"/>
			<extension name="Concept" prefix="concept" uri="http://www.xes-standard.org/concept.xesext"/>
			<extension name="Semantic" prefix="semantic" uri="http://www.xes-standard.org/semantic.xesext"/>
			<global scope="trace">
				<string key="concept:name" value="__INVALID__"/>
			</global>
			<global scope="event">
				<string key="concept:name" value="__INVALID__"/>
				<string key="lifecycle:transition" value="complete"/>
			</global>
			<classifier name="Event Name" keys="concept:name"/>
			<string key="source" value="CPN Tools"/>
			<string key="concept:name" value="excercise7.mxml"/>
			<string key="lifecycle:model" value="standard"/>
			<string key="description" value="Log file created in CPN Tools"/>
			«FOR ArrayList<ControlConstruct> trace:traces»
			«{i = 0; ""}»
			<trace>
				<string key="concept:name" value="«trace.hashCode»"/>
				«FOR ControlConstruct event:trace»
				«{date = new Date((i++)*1000L); ""}»
				<event>
					<date key="time:timestamp" value="«dateFormat.format(date)»"/>
					<string key="concept:name" value="«event.hashCode»"/>
				</event>
				«ENDFOR»
			</trace>
			«ENDFOR»
		</log>
		'''
		
		var fw = new FileWriter(new File("trace.xes"), false);
		fw.write(content);
		fw.close;
		
	}
	
	def ArrayList<ArrayList<ControlConstruct>> process(ControlConstruct c) {
		return process(c, new ArrayList<ArrayList<ControlConstruct>>());
	}
	
	def ArrayList<ArrayList<ControlConstruct>> process(ControlConstruct c, ArrayList<ArrayList<ControlConstruct>> path_) {
		level++;
		var result = new ArrayList<ArrayList<ControlConstruct>>();
		var path = deepCopy(path_);
		
		if(path.empty){
			path.add(new ArrayList<ControlConstruct>());
		}
		
		for(ArrayList<ControlConstruct> p:path){
			p.add(c);
		}
		
		if (c instanceof Sequence) {
			var Sequence sequence = (c as Sequence)
			
			
			for(ControlConstruct comp : sequence.components){
				result = (process(comp, path));
				
			}
			
		} else if (c instanceof AnyOrder) {
			var AnyOrder anyOrder = (c as AnyOrder)
			
			for (List<ControlConstruct> permutations : permutate(anyOrder.components)) {
				
				var temp = new ArrayList<ArrayList<ControlConstruct>>(path);
				for(ControlConstruct comp : permutations){
					
					temp = process(comp, temp);
					
				}
				result.addAll(temp);
			}
		}
		else if (c instanceof IfThenElse) {
			var ifThenElse = (c as IfThenElse);
			result = (process(ifThenElse.then, path));
			result = (process(ifThenElse.^else, path));

		}
		else if(c instanceof Perform){
			result = path;
		}
		else if(c instanceof ControlConstruct){
			for(ControlConstruct comp : c.composedOf){
				result = (process(comp, path));
				
			}
		}

		level--;
		
		if(level===0){
			print(result);
		}
		
		return result;		
	}
	
	def private ArrayList<ArrayList<ControlConstruct>> deepCopy(ArrayList<ArrayList<ControlConstruct>> path){
		
		var result = new ArrayList<ArrayList<ControlConstruct>>();
		for(ArrayList<ControlConstruct> p:path){
			result.add(new ArrayList<ControlConstruct>(p));
		}
		
		return result;
	}
	
	def private print(ArrayList<ArrayList<ControlConstruct>> path){
		for(ArrayList<ControlConstruct> trace:path){
			
			var iter = trace.iterator;
			while(iter.hasNext){
				var next = iter.next;
				
				System.out.print(next.class.name);
				if(iter.hasNext){
					System.out.print(" -> ");
				}
			}
			System.out.print("\n");
			
		}
	}
	
	

	def private List<List<ControlConstruct>> permutate(List<ControlConstruct> list) {
		var List<List<ControlConstruct>> result = new ArrayList<List<ControlConstruct>>()
		result.add(new ArrayList<ControlConstruct>())
		for (var int i = 0; i < list.size(); i++) {
			var List<List<ControlConstruct>> current = new ArrayList<List<ControlConstruct>>()
			for (List<ControlConstruct> l : result) {
				for (var int j = 0; j < l.size() + 1; j++) {
					l.add(j, list.get(i))
					var List<ControlConstruct> temp = new ArrayList<ControlConstruct>(l)
					current.add(temp)
					l.remove(j)
				}
			}
			result = new ArrayList<List<ControlConstruct>>(current)
		}
		return result
	}
}
