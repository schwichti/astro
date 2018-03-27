package de.upb.dbis.astro

import org.apache.lucene.analysis.Analyzer
import java.util.Map

class FieldConfiguration {
	
	/**
	 * Field id used to name index fields and query parts
	 */
	private String id;
	
	/**
	 * Indicates if an index field or query part 
	 */
	private boolean enabled;
	
	/**
	 * Weight (aka Lucene boost) for index fields and query parts.
	 */
	private float weight;
	
	/**
	 * The analyzer used for an index field or query part.
	 */
	private Analyzer analyzer;
	
	public def getId(){
		return id;
	}
	
	public def getEnabled(){
		return weight>0;
	}
	
	public def getWeight(){
		return weight;
	}
	
	public def getAnalyzer(){
		return analyzer;
	}
	
	new(String id, Map<String, Float> weights, Analyzer analyzer){
		
		this.id= id;
		this.weight = weight;
		this.analyzer = analyzer;
		//TODO check if key exists
		
		//this.weight = 1f;
		this.weight = weights.get(id);
	}
}