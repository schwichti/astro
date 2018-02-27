package org.schema;
/**
* The price asked for a given offer by the respective organization or person.
*/
public class UnitPriceSpecification extends PriceSpecification{
	
	
	/**
	* This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
	 *
	 * Ranges: Number
	 */
	private Float _billingIncrement;
	
	public Float getBillingIncrement() throws ClassCastException{
		return (Float) _billingIncrement;
	}
	
	public void setBillingIncrement(Float value) throws ClassCastException{
		_billingIncrement = value;
	}
	/**
	* The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
	 *
	 * Ranges: URL, Text
	 */
	private String _unitCode;
	
	public String getUnitCode() throws ClassCastException{
		return (String) _unitCode;
	}
	
	public void setUnitCode(String value) throws ClassCastException{
		_unitCode = value;
	}
	/**
	* A short text or acronym indicating multiple price specifications for the same offer, e.g. SRP for the suggested retail price or INVOICE for the invoice price, mostly used in the car industry.
	 *
	 * Ranges: Text
	 */
	private String _priceType;
	
	public String getPriceType() throws ClassCastException{
		return (String) _priceType;
	}
	
	public void setPriceType(String value) throws ClassCastException{
		_priceType = value;
	}
	/**
	* A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
	<a href='unitCode'>unitCode</a>.
	 *
	 * Ranges: Text
	 */
	private String _unitText;
	
	public String getUnitText() throws ClassCastException{
		return (String) _unitText;
	}
	
	public void setUnitText(String value) throws ClassCastException{
		_unitText = value;
	}
	/**
	* The reference quantity for which a certain price applies, e.g. 1 EUR per 4 kWh of electricity. This property is a replacement for unitOfMeasurement for the advanced cases where the price does not relate to a standard unit.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _referenceQuantity;
	
	public QuantitativeValue getReferenceQuantity() throws ClassCastException{
		return (QuantitativeValue) _referenceQuantity;
	}
	
	public void setReferenceQuantity(QuantitativeValue value) throws ClassCastException{
		_referenceQuantity = value;
	}
}
