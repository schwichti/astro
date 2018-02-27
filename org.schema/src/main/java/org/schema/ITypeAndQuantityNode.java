package org.schema;
/**
* A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
*/
public interface ITypeAndQuantityNode extends IStructuredValue{
	
	
	/**
	 * The product that this structured value is referring to.
	 *
	 */
	
	public <T> T getTypeOfGood(Class<T> c) throws ClassCastException;
	
	public void setTypeOfGood(Service value) throws ClassCastException;
	public void setTypeOfGood(Product value) throws ClassCastException;
	/**
	 * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
	 *
	 */
	
	public BusinessFunction getBusinessFunction() throws ClassCastException;
	
	public void setBusinessFunction(BusinessFunction value) throws ClassCastException;
	/**
	 * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
	 *
	 */
	
	public String getUnitCode() throws ClassCastException;
	
	public void setUnitCode(String value) throws ClassCastException;
	/**
	 * The quantity of the goods included in the offer.
	 *
	 */
	
	public Float getAmountOfThisGood() throws ClassCastException;
	
	public void setAmountOfThisGood(Float value) throws ClassCastException;
	/**
	 * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
	 <a href='unitCode'>unitCode</a>.
	 *
	 */
	
	public String getUnitText() throws ClassCastException;
	
	public void setUnitText(String value) throws ClassCastException;
}
