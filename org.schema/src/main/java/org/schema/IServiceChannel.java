package org.schema;
/**
* A means for accessing a service, e.g. a government office location, web site, or phone number.
*/
public interface IServiceChannel extends IIntangible{
	
	
	/**
	 * A language someone may use with or at the item, service or place. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/inLanguage">inLanguage</a>
	 *
	 */
	
	public <T> T getAvailableLanguage(Class<T> c) throws ClassCastException;
	
	public void setAvailableLanguage(Language value) throws ClassCastException;
	public void setAvailableLanguage(String value) throws ClassCastException;
	/**
	 * The service provided by this channel.
	 *
	 */
	
	public Service getProvidesService() throws ClassCastException;
	
	public void setProvidesService(Service value) throws ClassCastException;
	/**
	 * The number to access the service by text message.
	 *
	 */
	
	public ContactPoint getServiceSmsNumber() throws ClassCastException;
	
	public void setServiceSmsNumber(ContactPoint value) throws ClassCastException;
	/**
	 * The phone number to use to access the service.
	 *
	 */
	
	public ContactPoint getServicePhone() throws ClassCastException;
	
	public void setServicePhone(ContactPoint value) throws ClassCastException;
	/**
	 * The address for accessing the service by mail.
	 *
	 */
	
	public PostalAddress getServicePostalAddress() throws ClassCastException;
	
	public void setServicePostalAddress(PostalAddress value) throws ClassCastException;
	/**
	 * The website to access the service.
	 *
	 */
	
	public String getServiceUrl() throws ClassCastException;
	
	public void setServiceUrl(String value) throws ClassCastException;
	/**
	 * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
	 *
	 */
	
	public Place getServiceLocation() throws ClassCastException;
	
	public void setServiceLocation(Place value) throws ClassCastException;
	/**
	 * Estimated processing time for the service using this channel.
	 *
	 */
	
	public Duration getProcessingTime() throws ClassCastException;
	
	public void setProcessingTime(Duration value) throws ClassCastException;
}
