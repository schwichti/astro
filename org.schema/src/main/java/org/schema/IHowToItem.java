package org.schema;
/**
* An item used as either a tool or supply when performing the instructions for how to to achieve a result.
*/
public interface IHowToItem extends IListItem{
	
	
	/**
	 * The required quantity of the item(s).
	 *
	 */
	
	public <T> T getRequiredQuantity(Class<T> c) throws ClassCastException;
	
	public void setRequiredQuantity(Float value) throws ClassCastException;
	public void setRequiredQuantity(String value) throws ClassCastException;
	public void setRequiredQuantity(QuantitativeValue value) throws ClassCastException;
}
