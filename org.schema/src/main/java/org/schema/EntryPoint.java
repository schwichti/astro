package org.schema;
/**
* An entry point, within some Web-based protocol.
*/
public class EntryPoint extends Intangible{
	
	
	/**
	* An application that can complete the request.
	 *
	 * Ranges: SoftwareApplication
	 */
	private SoftwareApplication _actionApplication;
	
	public SoftwareApplication getActionApplication() throws ClassCastException{
		return (SoftwareApplication) _actionApplication;
	}
	
	public void setActionApplication(SoftwareApplication value) throws ClassCastException{
		_actionApplication = value;
	}
	/**
	* An application that can complete the request.
	 *
	 * Ranges: SoftwareApplication
	 */
	private SoftwareApplication _application;
	
	public SoftwareApplication getApplication() throws ClassCastException{
		return (SoftwareApplication) _application;
	}
	
	public void setApplication(SoftwareApplication value) throws ClassCastException{
		_application = value;
	}
	/**
	* An url template (RFC6570) that will be used to construct the target of the execution of the action.
	 *
	 * Ranges: Text
	 */
	private String _urlTemplate;
	
	public String getUrlTemplate() throws ClassCastException{
		return (String) _urlTemplate;
	}
	
	public void setUrlTemplate(String value) throws ClassCastException{
		_urlTemplate = value;
	}
	/**
	* The supported encoding type(s) for an EntryPoint request.
	 *
	 * Ranges: Text
	 */
	private String _encodingType;
	
	public String getEncodingType() throws ClassCastException{
		return (String) _encodingType;
	}
	
	public void setEncodingType(String value) throws ClassCastException{
		_encodingType = value;
	}
	/**
	* The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
	 *
	 * Ranges: Text, URL
	 */
	private String _actionPlatform;
	
	public String getActionPlatform() throws ClassCastException{
		return (String) _actionPlatform;
	}
	
	public void setActionPlatform(String value) throws ClassCastException{
		_actionPlatform = value;
	}
	/**
	* An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
	 *
	 * Ranges: Text
	 */
	private String _httpMethod;
	
	public String getHttpMethod() throws ClassCastException{
		return (String) _httpMethod;
	}
	
	public void setHttpMethod(String value) throws ClassCastException{
		_httpMethod = value;
	}
	/**
	* The supported content type(s) for an EntryPoint response.
	 *
	 * Ranges: Text
	 */
	private String _contentType;
	
	public String getContentType() throws ClassCastException{
		return (String) _contentType;
	}
	
	public void setContentType(String value) throws ClassCastException{
		_contentType = value;
	}
}
