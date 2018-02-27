package org.schema;
/**
* Intended audience for an item, i.e. the group for whom the item was created.
*/
public class Audience extends Intangible{
	
	
	/**
	* The geographic area associated with the audience.
	 *
	 * Ranges: AdministrativeArea
	 */
	private AdministrativeArea _geographicArea;
	
	public AdministrativeArea getGeographicArea() throws ClassCastException{
		return (AdministrativeArea) _geographicArea;
	}
	
	public void setGeographicArea(AdministrativeArea value) throws ClassCastException{
		_geographicArea = value;
	}
	/**
	* The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
	 *
	 * Ranges: Text
	 */
	private String _audienceType;
	
	public String getAudienceType() throws ClassCastException{
		return (String) _audienceType;
	}
	
	public void setAudienceType(String value) throws ClassCastException{
		_audienceType = value;
	}
}
