package org.schema;
/**
* A software application designed specifically to work well on a mobile device such as a telephone.
*/
public class MobileApplication extends SoftwareApplication{
	
	
	/**
	* Specifies specific carrier(s) requirements for the application (e.g. an application may only work on a specific carrier network).
	 *
	 * Ranges: Text
	 */
	private String _carrierRequirements;
	
	public String getCarrierRequirements() throws ClassCastException{
		return (String) _carrierRequirements;
	}
	
	public void setCarrierRequirements(String value) throws ClassCastException{
		_carrierRequirements = value;
	}
}
