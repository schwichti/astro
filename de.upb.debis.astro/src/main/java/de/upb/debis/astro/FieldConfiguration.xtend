package de.upb.debis.astro

import org.apache.lucene.analysis.Analyzer

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
		return enabled;
	}
	
	public def getWeight(){
		return weight;
	}
	
	public def getAnalyzer(){
		return analyzer;
	}
	
	new(String id, boolean enabled, float weight, Analyzer analyzer){
		
		this.id= id;
		this.enabled = enabled;
		this.weight = weight;
		this.analyzer = analyzer;
	}
}