package org.schema;
/**
* A permission for a particular person or group to access a particular file.
*/
public interface IDigitalDocumentPermission extends IIntangible{
	
	
	/**
	 * The type of permission granted the person, organization, or audience.
	 *
	 */
	
	public DigitalDocumentPermissionType getPermissionType() throws ClassCastException;
	
	public void setPermissionType(DigitalDocumentPermissionType value) throws ClassCastException;
	/**
	 * The person, organization, contact point, or audience that has been granted this permission.
	 *
	 */
	
	public <T> T getGrantee(Class<T> c) throws ClassCastException;
	
	public void setGrantee(Person value) throws ClassCastException;
	public void setGrantee(Audience value) throws ClassCastException;
	public void setGrantee(Organization value) throws ClassCastException;
	public void setGrantee(ContactPoint value) throws ClassCastException;
}
