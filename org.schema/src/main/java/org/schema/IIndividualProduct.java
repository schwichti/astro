package org.schema;
/**
* A single, identifiable product instance (e.g. a laptop with a particular serial number).
*/
public interface IIndividualProduct extends IProduct{
	
	
	/**
	 * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
	 *
	 */
	
	public String getSerialNumber() throws ClassCastException;
	
	public void setSerialNumber(String value) throws ClassCastException;
}
