package org.schema;
/**
* A subclass of Role used to describe roles within organizations.
*/
public class OrganizationRole extends Role{
	
	
	/**
	* A number associated with a role in an organization, for example, the number on an athlete's jersey.
	 *
	 * Ranges: Number
	 */
	private Float _numberedPosition;
	
	public Float getNumberedPosition() throws ClassCastException{
		return (Float) _numberedPosition;
	}
	
	public void setNumberedPosition(Float value) throws ClassCastException{
		_numberedPosition = value;
	}
}
