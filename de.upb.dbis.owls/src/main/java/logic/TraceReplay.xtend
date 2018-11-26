package logic

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Queue
import owls.AnyOrder
import owls.Choice
import owls.CompositeProcess
import owls.ControlConstruct
import owls.Perform
import owls.Sequence

class TraceReplay {


	/**
	 * @return List of covered traces
	 */
	public def List<List<String>> canReplay2(List<List<String>> traces, CompositeProcess process){
		
		
		
		return null;
	}	

	public def boolean canReplay(List<String> trace, CompositeProcess process){
		
		restart();
		current = process.composedOf;

		for(String operationId:trace){
			if(proceedCut(operationId)){
				
			}
			else{
				return false;
			}
		}
		
		return true;
	}
	


	
	private HashMap<AnyOrder, List<ControlConstruct>> anyOrderComplete;
	private ControlConstruct current = null;
	
	private def restart(){
		anyOrderComplete = new HashMap<AnyOrder, List<ControlConstruct>>();
	}
	
	private def List<ControlConstruct> getCompletion(AnyOrder anyorder){
		
		if(!anyOrderComplete.containsKey(anyorder)){
			anyOrderComplete.put(anyorder, new ArrayList<ControlConstruct>());
		}
		return anyOrderComplete.get(anyorder);
	}
	
	public def void moveUp(ControlConstruct container, ControlConstruct child){
		
		if(container instanceof Sequence){
			var index = container.components.indexOf(child);
			
			if(index+1 < container.components.size){
				var next = findNext(container.components.get(index+1));
				current = next.get(0);
			}
			else{
				if(container.eContainer instanceof ControlConstruct){
					
					moveUp(container.eContainer as ControlConstruct, container);
				}
				
			}
		}
		else if(container instanceof AnyOrder){
			var list = getCompletion(container);
			list.add(child);
			anyOrderComplete.put(container,list);
			if(container.components.size === getCompletion(container).size){
				if(container.eContainer instanceof ControlConstruct){
					moveUp(container.eContainer as ControlConstruct, container);
				}
			}
			else{
				current = container;
			}
		}
		else if(container instanceof Choice){
			if(container.eContainer instanceof ControlConstruct){
				moveUp(container.eContainer as ControlConstruct, container);
				
			}
		}
	}
	
	public def List<ControlConstruct> findNext(ControlConstruct c){
		
		var result = new ArrayList<ControlConstruct>();
		
		if(c instanceof Perform){
			result.add(c);
		}
		else if(c instanceof Sequence){
			
			var next = findNext(c.components.get(0));
			
			if(!next.empty){
				
				result.addAll(next);
			}
			else{
				//error
			}
			
		}
		else if(c instanceof AnyOrder || c instanceof Choice){
			
			for(ControlConstruct x: c.components){
				
				var next = findNext(x);
				if(!next.empty){
					
					result.addAll(next);
				}
			}
		}
		
		return result;
	}
	
	public def boolean proceedCut(String operationId){	
		
		if(current instanceof Perform){
			if(operationId.equals(current.process.name)){
				moveUp(current.eContainer as ControlConstruct, current);
				return true;
			}
			else{
				return false;
			}
			
		}
		if(current instanceof Sequence){
			
			var next = findNext(current);
			current = next.get(0);
			
			if(operationId.equals((current as Perform).process.name)){
				moveUp(current.eContainer as ControlConstruct, current);
				return true;
			}
			else{
				return false;
			}
			
		}			
		else if(current instanceof AnyOrder){
			
			var remaining = new ArrayList<ControlConstruct>(current.components);
			remaining.removeAll(getCompletion(current));
			
			var candidates = new ArrayList<ControlConstruct>(); 
			for(ControlConstruct c: remaining){
				 var next = findNext(c);
				 if(!next.empty){
				 	
					 candidates.addAll(next);
				 }
				 else{
				 	//error
				 }
			}
			
			for(ControlConstruct c: candidates){
				if(operationId.equals((c as Perform).process.name)){
					
					var list = getCompletion(current);
					list.add(c);
					anyOrderComplete.put(current,list);
					
					if(list.size === current.components.size){
						if(current.eContainer instanceof ControlConstruct){
							
							moveUp(current.eContainer as ControlConstruct, c);
						}
					}
					
					return true;
				}
			}
			return false;
			
		}
		else if(current instanceof Choice){
			
			var candidates = new ArrayList<ControlConstruct>(); 
			for(ControlConstruct c: current.components){
				var next = findNext(c);
				if(!next.empty){
					candidates.addAll(next);
				}
				else{
					//error
				}
			}
			for(ControlConstruct c: candidates){
				if(operationId.equals((c as Perform).process.name)){
					
					if(c.eContainer instanceof ControlConstruct){
						moveUp(c.eContainer as ControlConstruct, c);
					}
					return true;
				}
			}			
			return false;
		}
	}
	

}