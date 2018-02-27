package org.schema;
/**
* A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
*/
public class TypeAndQuantityNode extends StructuredValue{
	
	
	/**
	* The product that this structured value is referring to.
	 *
	 * Ranges: Service, Product
	 */
	private Object _typeOfGood;
	
	public <T> T getTypeOfGood(Class<T> c) throws ClassCastException{
		return (T) _typeOfGood;
	}
	
	public void setTypeOfGood(Service value) throws ClassCastException{
		_typeOfGood = value;
	}
	public void setTypeOfGood(Product value) throws ClassCastException{
		_typeOfGood = value;
	}
	/**
	* The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
	 *
	 * Ranges: BusinessFunction
	 */
	private BusinessFunction _businessFunction;
	
	public BusinessFunction getBusinessFunction() throws ClassCastException{
		return (BusinessFunction) _businessFunction;
	}
	
	public void setBusinessFunction(BusinessFunction value) throws ClassCastException{
		_businessFunction = value;
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
	* The quantity of the goods included in the offer.
	 *
	 * Ranges: Number
	 */
	private Float _amountOfThisGood;
	
	public Float getAmountOfThisGood() throws ClassCastException{
		return (Float) _amountOfThisGood;
	}
	
	public void setAmountOfThisGood(Float value) throws ClassCastException{
		_amountOfThisGood = value;
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
}
