package org.schema;
/**
* A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.
*/
public interface ITechArticle extends IArticle{
	
	
	/**
	 * Proficiency needed for this content; expected values: 'Beginner', 'Expert'.
	 *
	 */
	
	public String getProficiencyLevel() throws ClassCastException;
	
	public void setProficiencyLevel(String value) throws ClassCastException;
	/**
	 * Prerequisites needed to fulfill steps in article.
	 *
	 */
	
	public String getDependencies() throws ClassCastException;
	
	public void setDependencies(String value) throws ClassCastException;
}
