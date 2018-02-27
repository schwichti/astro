package org.schema;
/**
* An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.
For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.
*/
public interface IAccommodation extends IPlace{
	
	
	/**
	 * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
	 *
	 */
	
	public <T> T getPetsAllowed(Class<T> c) throws ClassCastException;
	
	public void setPetsAllowed(String value) throws ClassCastException;
	public void setPetsAllowed(Boolean value) throws ClassCastException;
	/**
	 * The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
	 Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
	 *
	 */
	
	public <T> T getNumberOfRooms(Class<T> c) throws ClassCastException;
	
	public void setNumberOfRooms(QuantitativeValue value) throws ClassCastException;
	public void setNumberOfRooms(Float value) throws ClassCastException;
	/**
	 * The size of the accommodation, e.g. in square meter or squarefoot.
	 Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard
	 *
	 */
	
	public QuantitativeValue getFloorSize() throws ClassCastException;
	
	public void setFloorSize(QuantitativeValue value) throws ClassCastException;
	/**
	 * Indications regarding the permitted usage of the accommodation.
	 *
	 */
	
	public String getPermittedUsage() throws ClassCastException;
	
	public void setPermittedUsage(String value) throws ClassCastException;
	/**
	 * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
	 *
	 */
	
	public LocationFeatureSpecification getAmenityFeature() throws ClassCastException;
	
	public void setAmenityFeature(LocationFeatureSpecification value) throws ClassCastException;
}
