package de.upb.dbis.astro.optimization

import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map
import org.deeplearning4j.arbiter.optimize.api.ParameterSpace

class VectorSpace implements ParameterSpace<Map<String, Integer>>{
	
	public LinkedHashMap<String, ParameterSpace> nestedSpaces = new LinkedHashMap<String, ParameterSpace>();
	/*
	
	private int min =0;
	private int max = 10;
	
	new(int min, int max){
		
		this.min = min;
		this.max = max;
		
	}
	
	*/
	
	override collectLeaves() {
		//return Collections.singletonList(this as ParameterSpace);
		System.out.println("x");	
		return new ArrayList<ParameterSpace>(nestedSpaces.values);
	}
	
	override getNestedSpaces() {
		//return Collections.emptyMap();
		return nestedSpaces;
	}
	
	override getValue(double[] parameterValues) {
		
		var candidate = new HashMap<String, Integer>();
		
		var i=0;
		for(String key:nestedSpaces.keySet){
			
			var random = parameterValues.get(i);
			
			var component = nestedSpaces.get(key).getValue(#[random]) as Integer;
			
			candidate.put(key,component);
		}
		
		return candidate;
	}
	
	override isLeaf() {
		return false;
	}
	
	override numParameters() {
		return nestedSpaces.size;
	}
	
	override setIndices(int... indices) {
		
		var i = 0;
		for(key:nestedSpaces.keySet){
			var space = nestedSpaces.get(key);
			
			space.setIndices(indices.get(i++));
			
		}
		
	}
	
	
}