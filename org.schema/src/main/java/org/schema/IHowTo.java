package org.schema;
/**
* Instructions that explain how to achieve a result by performing a sequence of steps.
*/
public interface IHowTo extends ICreativeWork{
	
	
	/**
	 * The total time required to perform instructions or a direction (including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 */
	
	public Duration getTotalTime() throws ClassCastException;
	
	public void setTotalTime(Duration value) throws ClassCastException;
	/**
	 * The length of time it takes to prepare the items to be used in instructions or a direction, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 */
	
	public Duration getPrepTime() throws ClassCastException;
	
	public void setPrepTime(Duration value) throws ClassCastException;
	/**
	 * The quantity that results by performing instructions. For example, a paper airplane, 10 personalized candles.
	 *
	 */
	
	public <T> T getYield(Class<T> c) throws ClassCastException;
	
	public void setYield(String value) throws ClassCastException;
	public void setYield(QuantitativeValue value) throws ClassCastException;
	/**
	 * A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.
	 *
	 */
	
	public <T> T getTool(Class<T> c) throws ClassCastException;
	
	public void setTool(String value) throws ClassCastException;
	public void setTool(HowToTool value) throws ClassCastException;
	/**
	 * The steps in the form of a single item (text, document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
	 *
	 */
	
	public <T> T getSteps(Class<T> c) throws ClassCastException;
	
	public void setSteps(ItemList value) throws ClassCastException;
	public void setSteps(CreativeWork value) throws ClassCastException;
	public void setSteps(String value) throws ClassCastException;
	/**
	 * A sub-property of instrument. A supply consumed when performing instructions or a direction.
	 *
	 */
	
	public <T> T getSupply(Class<T> c) throws ClassCastException;
	
	public void setSupply(HowToSupply value) throws ClassCastException;
	public void setSupply(String value) throws ClassCastException;
	/**
	 * The estimated cost of the supply or supplies consumed when performing instructions.
	 *
	 */
	
	public <T> T getEstimatedCost(Class<T> c) throws ClassCastException;
	
	public void setEstimatedCost(MonetaryAmount value) throws ClassCastException;
	public void setEstimatedCost(String value) throws ClassCastException;
	/**
	 * The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 */
	
	public Duration getPerformTime() throws ClassCastException;
	
	public void setPerformTime(Duration value) throws ClassCastException;
}
