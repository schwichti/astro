package org.schema;
/**
* Specifies a location feature by providing a structured value representing a feature of an accommodation as a property-value pair of varying degrees of formality.
*/
public interface ILocationFeatureSpecification extends IPropertyValue{
	
	
	/**
	 * The date when the item becomes valid.
	 *
	 */
	
	public java.util.Date getValidFrom() throws ClassCastException;
	
	public void setValidFrom(java.util.Date value) throws ClassCastException;
	/**
	 * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
	 *
	 */
	
	public java.util.Date getValidThrough() throws ClassCastException;
	
	public void setValidThrough(java.util.Date value) throws ClassCastException;
	/**
	 * The hours during which this service or contact is available.
	 *
	 */
	
	public OpeningHoursSpecification getHoursAvailable() throws ClassCastException;
	
	public void setHoursAvailable(OpeningHoursSpecification value) throws ClassCastException;
}
