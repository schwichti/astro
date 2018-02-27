package org.schema;
/**
* The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
*/
public class GeoShape extends StructuredValue{
	
	
	/**
	* A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
	 *
	 * Ranges: Text
	 */
	private String _polygon;
	
	public String getPolygon() throws ClassCastException{
		return (String) _polygon;
	}
	
	public void setPolygon(String value) throws ClassCastException{
		_polygon = value;
	}
	/**
	* A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
	 *
	 * Ranges: Text
	 */
	private String _line;
	
	public String getLine() throws ClassCastException{
		return (String) _line;
	}
	
	public void setLine(String value) throws ClassCastException{
		_line = value;
	}
	/**
	* A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
	 *
	 * Ranges: Text
	 */
	private String _box;
	
	public String getBox() throws ClassCastException{
		return (String) _box;
	}
	
	public void setBox(String value) throws ClassCastException{
		_box = value;
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
	* A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
	 *
	 * Ranges: Text
	 */
	private String _circle;
	
	public String getCircle() throws ClassCastException{
		return (String) _circle;
	}
	
	public void setCircle(String value) throws ClassCastException{
		_circle = value;
	}
}
