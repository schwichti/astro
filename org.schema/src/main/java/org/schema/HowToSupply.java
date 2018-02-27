package org.schema;
/**
* A supply consumed when performing the instructions for how to achieve a result.
*/
public class HowToSupply extends HowToItem{
	
	
	/**
	* The estimated cost of the supply or supplies consumed when performing instructions.
	 *
	 * Ranges: MonetaryAmount, Text
	 */
	private Object _estimatedCost;
	
	public <T> T getEstimatedCost(Class<T> c) throws ClassCastException{
		return (T) _estimatedCost;
	}
	
	public void setEstimatedCost(MonetaryAmount value) throws ClassCastException{
		_estimatedCost = value;
	}
	public void setEstimatedCost(String value) throws ClassCastException{
		_estimatedCost = value;
	}
}
