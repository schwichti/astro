package de.upb.dbis.astro

import java.util.ArrayList
import java.util.HashMap
import java.util.TreeMap


class Alignment extends HashMap<String, TreeMap<Double, HashMap<Triple, FeatureVector>>>{
	
	public def Triple getBest(String uri){
		
		if(this.containsKey(uri) && !this.get(uri).isEmpty){
			
			var treemap = this.get(uri);
			var lastEntry = treemap.lastEntry;
			var value = lastEntry.value;
			var keyset = value.keySet;
			var first = keyset.iterator.next;
			
			return first;
		}
		
		return null;
	}
	
	public def put(String uri, Double score, Triple t, FeatureVector v){
		
		if(!containsKey(uri)){
			
			var map = new TreeMap<Double, HashMap<Triple, FeatureVector>>();
			this.put(uri, map);
		}
		
		var map = get(uri);
		
		if(!map.containsKey(score)){
			
			var set = new HashMap<Triple, FeatureVector>();
			set.put(t,v);
			map.put(score, set);
			
		}
		
		var set = map.get(score);
		set.put(t, v);
		
		map.put(score, set);
		put(uri, map);
		
	}
	
	public def ArrayList<Triple> flatten(String uri){
		
		var result = new ArrayList<Triple>();
		
		if(this.containsKey(uri)){
			for(Double d: this.get(uri).keySet){
				
				result.addAll(this.get(uri).get(d).keySet);
				
			}				
		}			
		
		return result;
	}

	
}