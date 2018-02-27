package org.schema;
/**
* The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
*/
public interface IGeoShape extends IStructuredValue{
	
	
	/**
	 * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
	 *
	 */
	
	public String getPolygon() throws ClassCastException;
	
	public void setPolygon(String value) throws ClassCastException;
	/**
	 * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
	 *
	 */
	
	public String getLine() throws ClassCastException;
	
	public void setLine(String value) throws ClassCastException;
	/**
	 * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
	 *
	 */
	
	public String getBox() throws ClassCastException;
	
	public void setBox(String value) throws ClassCastException;
	/**
	 * Physical address of the item.
	 *
	 */
	
	public <T> T getAddress(Class<T> c) throws ClassCastException;
	
	public void setAddress(String value) throws ClassCastException;
	public void setAddress(PostalAddress value) throws ClassCastException;
	/**
	 * The postal code. For example, 94043.
	 *
	 */
	
	public String getPostalCode() throws ClassCastException;
	
	public void setPostalCode(String value) throws ClassCastException;
	/**
	 * The elevation of a location (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
	 *
	 */
	
	public <T> T getElevation(Class<T> c) throws ClassCastException;
	
	public void setElevation(Float value) throws ClassCastException;
	public void setElevation(String value) throws ClassCastException;
	/**
	 * The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>.
	 *
	 */
	
	public <T> T getAddressCountry(Class<T> c) throws ClassCastException;
	
	public void setAddressCountry(Country value) throws ClassCastException;
	public void setAddressCountry(String value) throws ClassCastException;
	/**
	 * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
	 *
	 */
	
	public String getCircle() throws ClassCastException;
	
	public void setCircle(String value) throws ClassCastException;
}
