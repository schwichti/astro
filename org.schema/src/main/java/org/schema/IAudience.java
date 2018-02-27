package org.schema;
/**
* Intended audience for an item, i.e. the group for whom the item was created.
*/
public interface IAudience extends IIntangible{
	
	
	/**
	 * The geographic area associated with the audience.
	 *
	 */
	
	public AdministrativeArea getGeographicArea() throws ClassCastException;
	
	public void setGeographicArea(AdministrativeArea value) throws ClassCastException;
	/**
	 * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
	 *
	 */
	
	public String getAudienceType() throws ClassCastException;
	
	public void setAudienceType(String value) throws ClassCastException;
}
