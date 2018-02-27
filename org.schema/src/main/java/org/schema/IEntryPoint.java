package org.schema;
/**
* An entry point, within some Web-based protocol.
*/
public interface IEntryPoint extends IIntangible{
	
	
	/**
	 * An application that can complete the request.
	 *
	 */
	
	public SoftwareApplication getActionApplication() throws ClassCastException;
	
	public void setActionApplication(SoftwareApplication value) throws ClassCastException;
	/**
	 * An application that can complete the request.
	 *
	 */
	
	public SoftwareApplication getApplication() throws ClassCastException;
	
	public void setApplication(SoftwareApplication value) throws ClassCastException;
	/**
	 * An url template (RFC6570) that will be used to construct the target of the execution of the action.
	 *
	 */
	
	public String getUrlTemplate() throws ClassCastException;
	
	public void setUrlTemplate(String value) throws ClassCastException;
	/**
	 * The supported encoding type(s) for an EntryPoint request.
	 *
	 */
	
	public String getEncodingType() throws ClassCastException;
	
	public void setEncodingType(String value) throws ClassCastException;
	/**
	 * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
	 *
	 */
	
	public String getActionPlatform() throws ClassCastException;
	
	public void setActionPlatform(String value) throws ClassCastException;
	/**
	 * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
	 *
	 */
	
	public String getHttpMethod() throws ClassCastException;
	
	public void setHttpMethod(String value) throws ClassCastException;
	/**
	 * The supported content type(s) for an EntryPoint response.
	 *
	 */
	
	public String getContentType() throws ClassCastException;
	
	public void setContentType(String value) throws ClassCastException;
}
