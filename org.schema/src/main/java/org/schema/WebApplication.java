package org.schema;
/**
* Web applications.
*/
public class WebApplication extends SoftwareApplication{
	
	
	/**
	* Specifies browser requirements in human-readable text. For example, 'requires HTML5 support'.
	 *
	 * Ranges: Text
	 */
	private String _browserRequirements;
	
	public String getBrowserRequirements() throws ClassCastException{
		return (String) _browserRequirements;
	}
	
	public void setBrowserRequirements(String value) throws ClassCastException{
		_browserRequirements = value;
	}
}
