package org.schema;
/**
* Instructions that explain how to achieve a result by performing a sequence of steps.
*/
public class HowTo extends CreativeWork{
	
	
	/**
	* The total time required to perform instructions or a direction (including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _totalTime;
	
	public Duration getTotalTime() throws ClassCastException{
		return (Duration) _totalTime;
	}
	
	public void setTotalTime(Duration value) throws ClassCastException{
		_totalTime = value;
	}
	/**
	* The length of time it takes to prepare the items to be used in instructions or a direction, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _prepTime;
	
	public Duration getPrepTime() throws ClassCastException{
		return (Duration) _prepTime;
	}
	
	public void setPrepTime(Duration value) throws ClassCastException{
		_prepTime = value;
	}
	/**
	* The quantity that results by performing instructions. For example, a paper airplane, 10 personalized candles.
	 *
	 * Ranges: Text, QuantitativeValue
	 */
	private Object _yield;
	
	public <T> T getYield(Class<T> c) throws ClassCastException{
		return (T) _yield;
	}
	
	public void setYield(String value) throws ClassCastException{
		_yield = value;
	}
	public void setYield(QuantitativeValue value) throws ClassCastException{
		_yield = value;
	}
	/**
	* A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.
	 *
	 * Ranges: Text, HowToTool
	 */
	private Object _tool;
	
	public <T> T getTool(Class<T> c) throws ClassCastException{
		return (T) _tool;
	}
	
	public void setTool(String value) throws ClassCastException{
		_tool = value;
	}
	public void setTool(HowToTool value) throws ClassCastException{
		_tool = value;
	}
	/**
	* The steps in the form of a single item (text, document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
	 *
	 * Ranges: ItemList, CreativeWork, Text
	 */
	private Object _steps;
	
	public <T> T getSteps(Class<T> c) throws ClassCastException{
		return (T) _steps;
	}
	
	public void setSteps(ItemList value) throws ClassCastException{
		_steps = value;
	}
	public void setSteps(CreativeWork value) throws ClassCastException{
		_steps = value;
	}
	public void setSteps(String value) throws ClassCastException{
		_steps = value;
	}
	/**
	* A sub-property of instrument. A supply consumed when performing instructions or a direction.
	 *
	 * Ranges: HowToSupply, Text
	 */
	private Object _supply;
	
	public <T> T getSupply(Class<T> c) throws ClassCastException{
		return (T) _supply;
	}
	
	public void setSupply(HowToSupply value) throws ClassCastException{
		_supply = value;
	}
	public void setSupply(String value) throws ClassCastException{
		_supply = value;
	}
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
	/**
	* The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _performTime;
	
	public Duration getPerformTime() throws ClassCastException{
		return (Duration) _performTime;
	}
	
	public void setPerformTime(Duration value) throws ClassCastException{
		_performTime = value;
	}
}
