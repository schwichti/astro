package org.schema;
/**
* Specifies a location feature by providing a structured value representing a feature of an accommodation as a property-value pair of varying degrees of formality.
*/
public class LocationFeatureSpecification extends PropertyValue{
	
	
	/**
	* The date when the item becomes valid.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _validFrom;
	
	public java.util.Date getValidFrom() throws ClassCastException{
		return (java.util.Date) _validFrom;
	}
	
	public void setValidFrom(java.util.Date value) throws ClassCastException{
		_validFrom = value;
	}
	/**
	* The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _validThrough;
	
	public java.util.Date getValidThrough() throws ClassCastException{
		return (java.util.Date) _validThrough;
	}
	
	public void setValidThrough(java.util.Date value) throws ClassCastException{
		_validThrough = value;
	}
	/**
	* The hours during which this service or contact is available.
	 *
	 * Ranges: OpeningHoursSpecification
	 */
	private OpeningHoursSpecification _hoursAvailable;
	
	public OpeningHoursSpecification getHoursAvailable() throws ClassCastException{
		return (OpeningHoursSpecification) _hoursAvailable;
	}
	
	public void setHoursAvailable(OpeningHoursSpecification value) throws ClassCastException{
		_hoursAvailable = value;
	}
}
