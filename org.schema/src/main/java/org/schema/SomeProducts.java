package org.schema;
/**
* A placeholder for multiple similar products of the same kind.
*/
public class SomeProducts extends Product{
	
	
	/**
	* The current approximate inventory level for the item or items.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _inventoryLevel;
	
	public QuantitativeValue getInventoryLevel() throws ClassCastException{
		return (QuantitativeValue) _inventoryLevel;
	}
	
	public void setInventoryLevel(QuantitativeValue value) throws ClassCastException{
		_inventoryLevel = value;
	}
}
