package org.schema;
/**
* A placeholder for multiple similar products of the same kind.
*/
public interface ISomeProducts extends IProduct{
	
	
	/**
	 * The current approximate inventory level for the item or items.
	 *
	 */
	
	public QuantitativeValue getInventoryLevel() throws ClassCastException;
	
	public void setInventoryLevel(QuantitativeValue value) throws ClassCastException;
}
