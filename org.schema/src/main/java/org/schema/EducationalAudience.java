package org.schema;
/**
* An EducationalAudience.
*/
public class EducationalAudience extends Audience{
	
	
	/**
	* An educationalRole of an EducationalAudience.
	 *
	 * Ranges: Text
	 */
	private String _educationalRole;
	
	public String getEducationalRole() throws ClassCastException{
		return (String) _educationalRole;
	}
	
	public void setEducationalRole(String value) throws ClassCastException{
		_educationalRole = value;
	}
}
