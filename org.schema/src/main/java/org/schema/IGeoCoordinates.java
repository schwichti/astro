package org.schema;
/**
* The geographic coordinates of a place or event.
*/
public interface IGeoCoordinates extends IStructuredValue{
	
	
	/**
	 * The latitude of a location. For example <code>37.42242</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
	 *
	 */
	
	public <T> T getLatitude(Class<T> c) throws ClassCastException;
	
	public void setLatitude(String value) throws ClassCastException;
	public void setLatitude(Float value) throws ClassCastException;
	/**
	 * The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>.
	 *
	 */
	
	public <T> T getAddressCountry(Class<T> c) throws ClassCastException;
	
	public void setAddressCountry(Country value) throws ClassCastException;
	public void setAddressCountry(String value) throws ClassCastException;
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
	 * The longitude of a location. For example <code>-122.08585</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
	 *
	 */
	
	public <T> T getLongitude(Class<T> c) throws ClassCastException;
	
	public void setLongitude(Float value) throws ClassCastException;
	public void setLongitude(String value) throws ClassCastException;
}
