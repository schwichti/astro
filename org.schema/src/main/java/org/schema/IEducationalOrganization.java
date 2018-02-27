package org.schema;
/**
* An educational organization.
*/
public interface IEducationalOrganization extends IOrganization{
	
	
	/**
	 * Alumni of an organization.
	 *
	 */
	
	public Person getAlumni() throws ClassCastException;
	
	public void setAlumni(Person value) throws ClassCastException;
}
