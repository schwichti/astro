package org.schema;
/**
* An item used as either a tool or supply when performing the instructions for how to to achieve a result.
*/
public class HowToItem extends ListItem{
	
	
	/**
	* The required quantity of the item(s).
	 *
	 * Ranges: Number, Text, QuantitativeValue
	 */
	private Object _requiredQuantity;
	
	public <T> T getRequiredQuantity(Class<T> c) throws ClassCastException{
		return (T) _requiredQuantity;
	}
	
	public void setRequiredQuantity(Float value) throws ClassCastException{
		_requiredQuantity = value;
	}
	public void setRequiredQuantity(String value) throws ClassCastException{
		_requiredQuantity = value;
	}
	public void setRequiredQuantity(QuantitativeValue value) throws ClassCastException{
		_requiredQuantity = value;
	}
}
