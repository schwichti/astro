package org.schema;
/**
* A contact point&#x2014;for example, a Customer Complaints department.
*/
public class ContactPoint extends StructuredValue{
	
	
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
	/**
	* A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
	 *
	 * Ranges: Text
	 */
	private String _contactType;
	
	public String getContactType() throws ClassCastException{
		return (String) _contactType;
	}
	
	public void setContactType(String value) throws ClassCastException{
		_contactType = value;
	}
	/**
	* The telephone number.
	 *
	 * Ranges: Text
	 */
	private String _telephone;
	
	public String getTelephone() throws ClassCastException{
		return (String) _telephone;
	}
	
	public void setTelephone(String value) throws ClassCastException{
		_telephone = value;
	}
	/**
	* The geographic area where the service is provided.
	 *
	 * Ranges: GeoShape, Place, AdministrativeArea
	 */
	private Object _serviceArea;
	
	public <T> T getServiceArea(Class<T> c) throws ClassCastException{
		return (T) _serviceArea;
	}
	
	public void setServiceArea(GeoShape value) throws ClassCastException{
		_serviceArea = value;
	}
	public void setServiceArea(Place value) throws ClassCastException{
		_serviceArea = value;
	}
	public void setServiceArea(AdministrativeArea value) throws ClassCastException{
		_serviceArea = value;
	}
	/**
	* The geographic area where a service or offered item is provided.
	 *
	 * Ranges: Text, AdministrativeArea, GeoShape, Place
	 */
	private Object _areaServed;
	
	public <T> T getAreaServed(Class<T> c) throws ClassCastException{
		return (T) _areaServed;
	}
	
	public void setAreaServed(String value) throws ClassCastException{
		_areaServed = value;
	}
	public void setAreaServed(AdministrativeArea value) throws ClassCastException{
		_areaServed = value;
	}
	public void setAreaServed(GeoShape value) throws ClassCastException{
		_areaServed = value;
	}
	public void setAreaServed(Place value) throws ClassCastException{
		_areaServed = value;
	}
	/**
	* The fax number.
	 *
	 * Ranges: Text
	 */
	private String _faxNumber;
	
	public String getFaxNumber() throws ClassCastException{
		return (String) _faxNumber;
	}
	
	public void setFaxNumber(String value) throws ClassCastException{
		_faxNumber = value;
	}
	/**
	* An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
	 *
	 * Ranges: ContactPointOption
	 */
	private ContactPointOption _contactOption;
	
	public ContactPointOption getContactOption() throws ClassCastException{
		return (ContactPointOption) _contactOption;
	}
	
	public void setContactOption(ContactPointOption value) throws ClassCastException{
		_contactOption = value;
	}
	/**
	* A language someone may use with or at the item, service or place. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/inLanguage">inLanguage</a>
	 *
	 * Ranges: Language, Text
	 */
	private Object _availableLanguage;
	
	public <T> T getAvailableLanguage(Class<T> c) throws ClassCastException{
		return (T) _availableLanguage;
	}
	
	public void setAvailableLanguage(Language value) throws ClassCastException{
		_availableLanguage = value;
	}
	public void setAvailableLanguage(String value) throws ClassCastException{
		_availableLanguage = value;
	}
	/**
	* The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
	 *
	 * Ranges: Text, Product
	 */
	private Object _productSupported;
	
	public <T> T getProductSupported(Class<T> c) throws ClassCastException{
		return (T) _productSupported;
	}
	
	public void setProductSupported(String value) throws ClassCastException{
		_productSupported = value;
	}
	public void setProductSupported(Product value) throws ClassCastException{
		_productSupported = value;
	}
	/**
	* Email address.
	 *
	 * Ranges: Text
	 */
	private String _email;
	
	public String getEmail() throws ClassCastException{
		return (String) _email;
	}
	
	public void setEmail(String value) throws ClassCastException{
		_email = value;
	}
}
