package org.schema;
/**
* An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.
For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.
*/
public class Accommodation extends Place{
	
	
	/**
	* Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
	 *
	 * Ranges: Text, Boolean
	 */
	private Object _petsAllowed;
	
	public <T> T getPetsAllowed(Class<T> c) throws ClassCastException{
		return (T) _petsAllowed;
	}
	
	public void setPetsAllowed(String value) throws ClassCastException{
		_petsAllowed = value;
	}
	public void setPetsAllowed(Boolean value) throws ClassCastException{
		_petsAllowed = value;
	}
	/**
	* The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
	Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
	 *
	 * Ranges: QuantitativeValue, Number
	 */
	private Object _numberOfRooms;
	
	public <T> T getNumberOfRooms(Class<T> c) throws ClassCastException{
		return (T) _numberOfRooms;
	}
	
	public void setNumberOfRooms(QuantitativeValue value) throws ClassCastException{
		_numberOfRooms = value;
	}
	public void setNumberOfRooms(Float value) throws ClassCastException{
		_numberOfRooms = value;
	}
	/**
	* The size of the accommodation, e.g. in square meter or squarefoot.
	Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _floorSize;
	
	public QuantitativeValue getFloorSize() throws ClassCastException{
		return (QuantitativeValue) _floorSize;
	}
	
	public void setFloorSize(QuantitativeValue value) throws ClassCastException{
		_floorSize = value;
	}
	/**
	* Indications regarding the permitted usage of the accommodation.
	 *
	 * Ranges: Text
	 */
	private String _permittedUsage;
	
	public String getPermittedUsage() throws ClassCastException{
		return (String) _permittedUsage;
	}
	
	public void setPermittedUsage(String value) throws ClassCastException{
		_permittedUsage = value;
	}
	/**
	* An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
	 *
	 * Ranges: LocationFeatureSpecification
	 */
	private LocationFeatureSpecification _amenityFeature;
	
	public LocationFeatureSpecification getAmenityFeature() throws ClassCastException{
		return (LocationFeatureSpecification) _amenityFeature;
	}
	
	public void setAmenityFeature(LocationFeatureSpecification value) throws ClassCastException{
		_amenityFeature = value;
	}
}
