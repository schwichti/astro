package org.schema;
/**
* A software application designed specifically to work well on a mobile device such as a telephone.
*/
public interface IMobileApplication extends ISoftwareApplication{
	
	
	/**
	 * Specifies specific carrier(s) requirements for the application (e.g. an application may only work on a specific carrier network).
	 *
	 */
	
	public String getCarrierRequirements() throws ClassCastException;
	
	public void setCarrierRequirements(String value) throws ClassCastException;
}
