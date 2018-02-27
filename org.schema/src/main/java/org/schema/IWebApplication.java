package org.schema;
/**
* Web applications.
*/
public interface IWebApplication extends ISoftwareApplication{
	
	
	/**
	 * Specifies browser requirements in human-readable text. For example, 'requires HTML5 support'.
	 *
	 */
	
	public String getBrowserRequirements() throws ClassCastException;
	
	public void setBrowserRequirements(String value) throws ClassCastException;
}
