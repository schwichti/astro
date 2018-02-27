package org.schema;
/**
* A supply consumed when performing the instructions for how to achieve a result.
*/
public interface IHowToSupply extends IHowToItem{
	
	
	/**
	 * The estimated cost of the supply or supplies consumed when performing instructions.
	 *
	 */
	
	public <T> T getEstimatedCost(Class<T> c) throws ClassCastException;
	
	public void setEstimatedCost(MonetaryAmount value) throws ClassCastException;
	public void setEstimatedCost(String value) throws ClassCastException;
}
