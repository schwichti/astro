package org.schema;
/**
* The price asked for a given offer by the respective organization or person.
*/
public interface IUnitPriceSpecification extends IPriceSpecification{
	
	
	/**
	 * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
	 *
	 */
	
	public Float getBillingIncrement() throws ClassCastException;
	
	public void setBillingIncrement(Float value) throws ClassCastException;
	/**
	 * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
	 *
	 */
	
	public String getUnitCode() throws ClassCastException;
	
	public void setUnitCode(String value) throws ClassCastException;
	/**
	 * A short text or acronym indicating multiple price specifications for the same offer, e.g. SRP for the suggested retail price or INVOICE for the invoice price, mostly used in the car industry.
	 *
	 */
	
	public String getPriceType() throws ClassCastException;
	
	public void setPriceType(String value) throws ClassCastException;
	/**
	 * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
	 <a href='unitCode'>unitCode</a>.
	 *
	 */
	
	public String getUnitText() throws ClassCastException;
	
	public void setUnitText(String value) throws ClassCastException;
	/**
	 * The reference quantity for which a certain price applies, e.g. 1 EUR per 4 kWh of electricity. This property is a replacement for unitOfMeasurement for the advanced cases where the price does not relate to a standard unit.
	 *
	 */
	
	public QuantitativeValue getReferenceQuantity() throws ClassCastException;
	
	public void setReferenceQuantity(QuantitativeValue value) throws ClassCastException;
}
