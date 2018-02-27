package org.schema;
/**
* A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.
*/
public class TechArticle extends Article{
	
	
	/**
	* Proficiency needed for this content; expected values: 'Beginner', 'Expert'.
	 *
	 * Ranges: Text
	 */
	private String _proficiencyLevel;
	
	public String getProficiencyLevel() throws ClassCastException{
		return (String) _proficiencyLevel;
	}
	
	public void setProficiencyLevel(String value) throws ClassCastException{
		_proficiencyLevel = value;
	}
	/**
	* Prerequisites needed to fulfill steps in article.
	 *
	 * Ranges: Text
	 */
	private String _dependencies;
	
	public String getDependencies() throws ClassCastException{
		return (String) _dependencies;
	}
	
	public void setDependencies(String value) throws ClassCastException{
		_dependencies = value;
	}
}
