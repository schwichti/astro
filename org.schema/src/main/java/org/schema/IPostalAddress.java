package org.schema;
/**
* The mailing address.
*/
public interface IPostalAddress extends IContactPoint{
	
	
	/**
	 * The street address. For example, 1600 Amphitheatre Pkwy.
	 *
	 */
	
	public String getStreetAddress() throws ClassCastException;
	
	public void setStreetAddress(String value) throws ClassCastException;
	/**
	 * The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>.
	 *
	 */
	
	public <T> T getAddressCountry(Class<T> c) throws ClassCastException;
	
	public void setAddressCountry(Country value) throws ClassCastException;
	public void setAddressCountry(String value) throws ClassCastException;
	/**
	 * The region. For example, CA.
	 *
	 */
	
	public String getAddressRegion() throws ClassCastException;
	
	public void setAddressRegion(String value) throws ClassCastException;
	/**
	 * The postal code. For example, 94043.
	 *
	 */
	
	public String getPostalCode() throws ClassCastException;
	
	public void setPostalCode(String value) throws ClassCastException;
	/**
	 * The locality. For example, Mountain View.
	 *
	 */
	
	public String getAddressLocality() throws ClassCastException;
	
	public void setAddressLocality(String value) throws ClassCastException;
	/**
	 * The post office box number for PO box addresses.
	 *
	 */
	
	public String getPostOfficeBoxNumber() throws ClassCastException;
	
	public void setPostOfficeBoxNumber(String value) throws ClassCastException;
}
