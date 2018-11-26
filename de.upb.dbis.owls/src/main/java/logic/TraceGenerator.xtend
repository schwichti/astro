package logic

import java.io.File
import java.io.FileWriter
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Date
import java.util.List
import java.util.TimeZone
import owls.AnyOrder
import owls.CompositeProcess
import owls.ControlConstruct
import owls.IfThenElse
import owls.Perform
import owls.Sequence
import java.util.LinkedList
import owls.Choice
import java.util.HashMap
import java.util.LinkedHashMap

class TraceGenerator {


	public def List<List<String>> generateTraces(CompositeProcess cp, String tracePath) {

		var traces = process2(cp.composedOf);
		
//		var List<List<String>> filteredTraces = new ArrayList<List<String>>();
//		for(List<ControlConstruct> trace:traces){
//			
//			var t = new ArrayList<String>();
//			for(ControlConstruct c:trace){
//				
//				if(c instanceof Perform){
//					
//				}
//			}
//			
//			if(trace instanceof Perform){
//				t.add(trace.process.name);
//			}
//			
//			var x = trace.filter[c|c instanceof Perform].map[p|(p as Perform).process.name].toList;
//			var filteredTrace = new ArrayList<String>(x);
//			filteredTraces.add(filteredTrace);
//		}

		var result = new ArrayList<List<String>>();
		
		for(List<Perform> trace:traces){
			
			result.add(trace.map[p|p.process.name]);
		}

		var i = 0L;
		var Date date;
		// 2008-12-09T08:22:01.527+01:00
		var tz = TimeZone.getTimeZone("UTC");
		var dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
		dateFormat.setTimeZone(tz);

		var content = '''
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
				«FOR List<Perform> trace : traces»
					«{i = 0; ""}»
					<trace>
						<string key="concept:name" value="«trace.hashCode»"/>
						«FOR Perform event:trace»
							«{date = new Date((i++)*1000L); ""}»
							<event>
								<date key="time:timestamp" value="«dateFormat.format(date)»"/>
								<string key="concept:name" value="«event.process.name»"/>
							</event>
						«ENDFOR»
					</trace>
				«ENDFOR»
			</log>
		'''

		var fw = new FileWriter(new File(tracePath), false);
		fw.write(content);
		fw.close;
		
		
		return result;

	}

	def ArrayList<ArrayList<ControlConstruct>> process(ControlConstruct c) {
		return process(c, new ArrayList<ArrayList<ControlConstruct>>());
	}
	
	def LinkedList<LinkedList<Perform>> process2(ControlConstruct c) {
		
		
		var LinkedList<LinkedList<Perform>> result = new LinkedList<LinkedList<Perform>>();
		
		if(c instanceof Perform){
			
			var trace = new LinkedList<Perform>();		
			
			trace.add(c);
			result.add(trace);
			return result;
		}
		else if(c instanceof Sequence){
			
			var pathsPerComponent = new LinkedList<LinkedList<Perform>>();
			for(ControlConstruct child:c.components){
				
				var paths = process2(child);
				pathsPerComponent.addAll(paths);
				
			}
			
			var temp = pathsPerComponent.get(0);
			temp = new LinkedList<Perform>(temp);
			result.add(temp);
			
			for(var i=1;i<pathsPerComponent.size;i++){
				
				var bucket = pathsPerComponent.get(i);
				
				for(LinkedList<Perform> k : result){
					
					k.addAll(bucket);
				}
			}

		}
		else if(c instanceof AnyOrder){
			
			var pathsPerComponent = new LinkedHashMap<ControlConstruct, LinkedList<LinkedList<Perform>>>();
			for(ControlConstruct child:c.components){
				
				var paths = process2(child);
				pathsPerComponent.put(child, paths);
				
			}
			
			var premutations = permutate(c.components);
			for(List<ControlConstruct> permutation: premutations){
				
				var temp = new LinkedList<LinkedList<Perform>>();
				
				temp.addAll(deepCopy2(pathsPerComponent.get(permutation.get(0))));
				
				var permutationCopy = new ArrayList<ControlConstruct>(permutation);
				permutationCopy.remove(permutation.get(0));
							
				
				//for(var i=1;i<pathsPerComponent.size;i++){
				for(ControlConstruct cc:permutationCopy){	
					var bucket = pathsPerComponent.get(cc);
					
					for(LinkedList<Perform> k : temp){
						
						for(LinkedList<Perform> l : bucket){
							
							k.addAll(l);
						}		
						
					}
				}	
				
				result.addAll(temp);			
			}
			
			


		}		
		else if(c instanceof Choice){
			
			for(ControlConstruct child:c.components){
				
				var paths = process2(child);
				paths = deepCopy2(paths);
				
				result.addAll(paths);
			}
		}

	
		
		return result;
	}

	def ArrayList<ArrayList<ControlConstruct>> process(ControlConstruct c,
		ArrayList<ArrayList<ControlConstruct>> path_) {
			
		var result = new ArrayList<ArrayList<ControlConstruct>>();
		var path = deepCopy(path_);

		if (path.empty) {
			path.add(new ArrayList<ControlConstruct>());
		}

		for (ArrayList<ControlConstruct> p : path) {
			p.add(c);
		}

		if (c instanceof Sequence) {
			var Sequence sequence = (c as Sequence)
			
			
			for (ControlConstruct comp : sequence.components) {
				var temp = process(comp, path);
				
				var newOnly = temp.subList(0, path.size) as ArrayList<ArrayList<ControlConstruct>>;
				
				
				result.addAll();

			}

		} else if (c instanceof AnyOrder) {
			var AnyOrder anyOrder = (c as AnyOrder)

			for (List<ControlConstruct> permutations : permutate(anyOrder.components)) {

				var temp = new ArrayList<ArrayList<ControlConstruct>>(path);
				for (ControlConstruct comp : permutations) {

					temp = process(comp, temp);

				}
				result.addAll(temp);
			}
		} else if (c instanceof IfThenElse) {
			var ifThenElse = (c as IfThenElse);
			result = (process(ifThenElse.then, path));
			result = (process(ifThenElse.^else, path));

		} else if (c instanceof Perform) {
			result = path;
		} else if (c instanceof ControlConstruct) {
			for (ControlConstruct comp : c.composedOf) {
				result = process(comp, path);

			}
		}


		return result;
	}

	def private ArrayList<ArrayList<ControlConstruct>> deepCopy(ArrayList<ArrayList<ControlConstruct>> path) {

		var result = new ArrayList<ArrayList<ControlConstruct>>();
		for (ArrayList<ControlConstruct> p : path) {
			result.add(new ArrayList<ControlConstruct>(p));
		}

		return result;
	}
	
	def private LinkedList<LinkedList<Perform>> deepCopy2(LinkedList<LinkedList<Perform>> path) {

		var result = new LinkedList<LinkedList<Perform>>();
		for (LinkedList<Perform> p : path) {
			result.add(new LinkedList<Perform>(p));
		}

		return result;
	}	

	def private print(ArrayList<ArrayList<ControlConstruct>> path) {
		for (ArrayList<ControlConstruct> trace : path) {

			var iter = trace.iterator;
			while (iter.hasNext) {
				var next = iter.next;

				System.out.print(next.class.name);
				if (iter.hasNext) {
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
