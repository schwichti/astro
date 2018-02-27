package org.schema;
/**
* The geographic coordinates of a place or event.
*/
public class GeoCoordinates extends StructuredValue{
	
	
	/**
	* The latitude of a location. For example <code>37.42242</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
	 *
	 * Ranges: Text, Number
	 */
	private Object _latitude;
	
	public <T> T getLatitude(Class<T> c) throws ClassCastException{
		return (T) _latitude;
	}
	
	public void setLatitude(String value) throws ClassCastException{
		_latitude = value;
	}
	public void setLatitude(Float value) throws ClassCastException{
		_latitude = value;
	}
	/**
	* The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>.
	 *
	 * Ranges: Country, Text
	 */
	private Object _addressCountry;
	
	public <T> T getAddressCountry(Class<T> c) throws ClassCastException{
		return (T) _addressCountry;
	}
	
	public void setAddressCountry(Country value) throws ClassCastException{
		_addressCountry = value;
	}
	public void setAddressCountry(String value) throws ClassCastException{
		_addressCountry = value;
	}
	/**
	* Physical address of the item.
	 *
	 * Ranges: Text, PostalAddress
	 */
	private Object _address;
	
	public <T> T getAddress(Class<T> c) throws ClassCastException{
		return (T) _address;
	}
	
	public void setAddress(String value) throws ClassCastException{
		_address = value;
	}
	public void setAddress(PostalAddress value) throws ClassCastException{
		_address = value;
	}
	/**
	* The postal code. For example, 94043.
	 *
	 * Ranges: Text
	 */
	private String _postalCode;
	
	public String getPostalCode() throws ClassCastException{
		return (String) _postalCode;
	}
	
	public void setPostalCode(String value) throws ClassCastException{
		_postalCode = value;
	}
	/**
	* The elevation of a location (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
	 *
	 * Ranges: Number, Text
	 */
	private Object _elevation;
	
	public <T> T getElevation(Class<T> c) throws ClassCastException{
		return (T) _elevation;
	}
	
	public void setElevation(Float value) throws ClassCastException{
		_elevation = value;
	}
	public void setElevation(String value) throws ClassCastException{
		_elevation = value;
	}
	/**
	* The longitude of a location. For example <code>-122.08585</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
	 *
	 * Ranges: Number, Text
	 */
	private Object _longitude;
	
	public <T> T getLongitude(Class<T> c) throws ClassCastException{
		return (T) _longitude;
	}
	
	public void setLongitude(Float value) throws ClassCastException{
		_longitude = value;
	}
	public void setLongitude(String value) throws ClassCastException{
		_longitude = value;
	}
}
