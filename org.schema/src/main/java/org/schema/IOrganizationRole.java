package org.schema;
/**
* A subclass of Role used to describe roles within organizations.
*/
public interface IOrganizationRole extends IRole{
	
	
	/**
	 * A number associated with a role in an organization, for example, the number on an athlete's jersey.
	 *
	 */
	
	public Float getNumberedPosition() throws ClassCastException;
	
	public void setNumberedPosition(Float value) throws ClassCastException;
}
