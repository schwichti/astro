package org.schema;
/**
* A permission for a particular person or group to access a particular file.
*/
public class DigitalDocumentPermission extends Intangible{
	
	
	/**
	* The type of permission granted the person, organization, or audience.
	 *
	 * Ranges: DigitalDocumentPermissionType
	 */
	private DigitalDocumentPermissionType _permissionType;
	
	public DigitalDocumentPermissionType getPermissionType() throws ClassCastException{
		return (DigitalDocumentPermissionType) _permissionType;
	}
	
	public void setPermissionType(DigitalDocumentPermissionType value) throws ClassCastException{
		_permissionType = value;
	}
	/**
	* The person, organization, contact point, or audience that has been granted this permission.
	 *
	 * Ranges: Person, Audience, Organization, ContactPoint
	 */
	private Object _grantee;
	
	public <T> T getGrantee(Class<T> c) throws ClassCastException{
		return (T) _grantee;
	}
	
	public void setGrantee(Person value) throws ClassCastException{
		_grantee = value;
	}
	public void setGrantee(Audience value) throws ClassCastException{
		_grantee = value;
	}
	public void setGrantee(Organization value) throws ClassCastException{
		_grantee = value;
	}
	public void setGrantee(ContactPoint value) throws ClassCastException{
		_grantee = value;
	}
}
