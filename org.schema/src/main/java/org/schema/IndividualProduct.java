package org.schema;
/**
* A single, identifiable product instance (e.g. a laptop with a particular serial number).
*/
public class IndividualProduct extends Product{
	
	
	/**
	* The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
	 *
	 * Ranges: Text
	 */
	private String _serialNumber;
	
	public String getSerialNumber() throws ClassCastException{
		return (String) _serialNumber;
	}
	
	public void setSerialNumber(String value) throws ClassCastException{
		_serialNumber = value;
	}
}
