package org.schema;
/**
* An EducationalAudience.
*/
public interface IEducationalAudience extends IAudience{
	
	
	/**
	 * An educationalRole of an EducationalAudience.
	 *
	 */
	
	public String getEducationalRole() throws ClassCastException;
	
	public void setEducationalRole(String value) throws ClassCastException;
}
