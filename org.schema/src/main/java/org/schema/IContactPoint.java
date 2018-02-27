package org.schema;
/**
* A contact point&#x2014;for example, a Customer Complaints department.
*/
public interface IContactPoint extends IStructuredValue{
	
	
	/**
	 * The hours during which this service or contact is available.
	 *
	 */
	
	public OpeningHoursSpecification getHoursAvailable() throws ClassCastException;
	
	public void setHoursAvailable(OpeningHoursSpecification value) throws ClassCastException;
	/**
	 * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
	 *
	 */
	
	public String getContactType() throws ClassCastException;
	
	public void setContactType(String value) throws ClassCastException;
	/**
	 * The telephone number.
	 *
	 */
	
	public String getTelephone() throws ClassCastException;
	
	public void setTelephone(String value) throws ClassCastException;
	/**
	 * The geographic area where the service is provided.
	 *
	 */
	
	public <T> T getServiceArea(Class<T> c) throws ClassCastException;
	
	public void setServiceArea(GeoShape value) throws ClassCastException;
	public void setServiceArea(Place value) throws ClassCastException;
	public void setServiceArea(AdministrativeArea value) throws ClassCastException;
	/**
	 * The geographic area where a service or offered item is provided.
	 *
	 */
	
	public <T> T getAreaServed(Class<T> c) throws ClassCastException;
	
	public void setAreaServed(String value) throws ClassCastException;
	public void setAreaServed(AdministrativeArea value) throws ClassCastException;
	public void setAreaServed(GeoShape value) throws ClassCastException;
	public void setAreaServed(Place value) throws ClassCastException;
	/**
	 * The fax number.
	 *
	 */
	
	public String getFaxNumber() throws ClassCastException;
	
	public void setFaxNumber(String value) throws ClassCastException;
	/**
	 * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
	 *
	 */
	
	public ContactPointOption getContactOption() throws ClassCastException;
	
	public void setContactOption(ContactPointOption value) throws ClassCastException;
	/**
	 * A language someone may use with or at the item, service or place. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/inLanguage">inLanguage</a>
	 *
	 */
	
	public <T> T getAvailableLanguage(Class<T> c) throws ClassCastException;
	
	public void setAvailableLanguage(Language value) throws ClassCastException;
	public void setAvailableLanguage(String value) throws ClassCastException;
	/**
	 * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
	 *
	 */
	
	public <T> T getProductSupported(Class<T> c) throws ClassCastException;
	
	public void setProductSupported(String value) throws ClassCastException;
	public void setProductSupported(Product value) throws ClassCastException;
	/**
	 * Email address.
	 *
	 */
	
	public String getEmail() throws ClassCastException;
	
	public void setEmail(String value) throws ClassCastException;
}
