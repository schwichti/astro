package de.upb.debis.astro

import java.util.LinkedHashMap
import java.util.Set

class FeatureVector {
	private LinkedHashMap<String, Double> instance = new LinkedHashMap<String, Double>();
	
	
	new() {
	}
	
	public def put(Feature s, double sigma){
		instance.put(s.class.name, sigma);
	}
	
	public def double get(Feature s){
		return instance.get(s.class.name);
	}
	
	public def double get(String classname){
		return instance.get(classname);
	}
	
	public def Set<String> features(){
		return instance.keySet;
	}
	
	override toString(){
		var buffer = new StringBuffer();
		
		for(var iter = instance.keySet.iterator; iter.hasNext;){
			
			var key = iter.next;
			var d = instance.get(key);
			
			buffer.append(d);
			
			if(iter.hasNext){
				buffer.append(",");
			}
		}
		return buffer.toString;
	}
	
	
	public def double[] values(){
		
		return this.instance.values;
		
	}

	
}