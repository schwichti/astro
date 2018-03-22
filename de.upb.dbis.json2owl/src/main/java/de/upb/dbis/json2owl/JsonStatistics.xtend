package de.upb.dbis.json2owl

import java.util.HashMap
import java.io.BufferedWriter
import java.io.FileWriter

class JsonStatistics {
	
	public static HashMap<String, Integer> term_frequency = new HashMap<String, Integer>();
	
	
	public static def void add(String term){
		
		if(term===null || term.equals("*")){
			return;
		}
		
		if(!term_frequency.containsKey(term)){
			
			term_frequency.put(term, 0);
		}
		
		var value = term_frequency.get(term);
		value++;
		term_frequency.put(term, value);
		
	}
	
	public static def void print(){
		
		var output = new BufferedWriter(new FileWriter("data/_termfrequency.csv",false));  //clears file every time
		
		for(String key:term_frequency.keySet){
			
			output.append('''"«key»";«term_frequency.get(key)»''');
			
			output.append("\n");	
		}
		
		
		output.close();
		
	}
}
