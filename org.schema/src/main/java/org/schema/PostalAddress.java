package org.schema;
/**
* The mailing address.
*/
public class PostalAddress extends ContactPoint{
	
	
	/**
	* The street address. For example, 1600 Amphitheatre Pkwy.
	 *
	 * Ranges: Text
	 */
	private String _streetAddress;
	
	public String getStreetAddress() throws ClassCastException{
		return (String) _streetAddress;
	}
	
	public void setStreetAddress(String value) throws ClassCastException{
		_streetAddress = value;
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
	* The region. For example, CA.
	 *
	 * Ranges: Text
	 */
	private String _addressRegion;
	
	public String getAddressRegion() throws ClassCastException{
		return (String) _addressRegion;
	}
	
	public void setAddressRegion(String value) throws ClassCastException{
		_addressRegion = value;
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
	* The locality. For example, Mountain View.
	 *
	 * Ranges: Text
	 */
	private String _addressLocality;
	
	public String getAddressLocality() throws ClassCastException{
		return (String) _addressLocality;
	}
	
	public void setAddressLocality(String value) throws ClassCastException{
		_addressLocality = value;
	}
	/**
	* The post office box number for PO box addresses.
	 *
	 * Ranges: Text
	 */
	private String _postOfficeBoxNumber;
	
	public String getPostOfficeBoxNumber() throws ClassCastException{
		return (String) _postOfficeBoxNumber;
	}
	
	public void setPostOfficeBoxNumber(String value) throws ClassCastException{
		_postOfficeBoxNumber = value;
	}
}
