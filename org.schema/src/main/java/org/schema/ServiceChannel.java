package org.schema;
/**
* A means for accessing a service, e.g. a government office location, web site, or phone number.
*/
public class ServiceChannel extends Intangible{
	
	
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
	* The service provided by this channel.
	 *
	 * Ranges: Service
	 */
	private Service _providesService;
	
	public Service getProvidesService() throws ClassCastException{
		return (Service) _providesService;
	}
	
	public void setProvidesService(Service value) throws ClassCastException{
		_providesService = value;
	}
	/**
	* The number to access the service by text message.
	 *
	 * Ranges: ContactPoint
	 */
	private ContactPoint _serviceSmsNumber;
	
	public ContactPoint getServiceSmsNumber() throws ClassCastException{
		return (ContactPoint) _serviceSmsNumber;
	}
	
	public void setServiceSmsNumber(ContactPoint value) throws ClassCastException{
		_serviceSmsNumber = value;
	}
	/**
	* The phone number to use to access the service.
	 *
	 * Ranges: ContactPoint
	 */
	private ContactPoint _servicePhone;
	
	public ContactPoint getServicePhone() throws ClassCastException{
		return (ContactPoint) _servicePhone;
	}
	
	public void setServicePhone(ContactPoint value) throws ClassCastException{
		_servicePhone = value;
	}
	/**
	* The address for accessing the service by mail.
	 *
	 * Ranges: PostalAddress
	 */
	private PostalAddress _servicePostalAddress;
	
	public PostalAddress getServicePostalAddress() throws ClassCastException{
		return (PostalAddress) _servicePostalAddress;
	}
	
	public void setServicePostalAddress(PostalAddress value) throws ClassCastException{
		_servicePostalAddress = value;
	}
	/**
	* The website to access the service.
	 *
	 * Ranges: URL
	 */
	private String _serviceUrl;
	
	public String getServiceUrl() throws ClassCastException{
		return (String) _serviceUrl;
	}
	
	public void setServiceUrl(String value) throws ClassCastException{
		_serviceUrl = value;
	}
	/**
	* The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
	 *
	 * Ranges: Place
	 */
	private Place _serviceLocation;
	
	public Place getServiceLocation() throws ClassCastException{
		return (Place) _serviceLocation;
	}
	
	public void setServiceLocation(Place value) throws ClassCastException{
		_serviceLocation = value;
	}
	/**
	* Estimated processing time for the service using this channel.
	 *
	 * Ranges: Duration
	 */
	private Duration _processingTime;
	
	public Duration getProcessingTime() throws ClassCastException{
		return (Duration) _processingTime;
	}
	
	public void setProcessingTime(Duration value) throws ClassCastException{
		_processingTime = value;
	}
}
