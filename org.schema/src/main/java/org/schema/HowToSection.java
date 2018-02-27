package org.schema;
/**
* A sub-grouping of steps in the instructions for how to achieve a result (e.g. steps for making a pie crust within a pie recipe).
*/
public class HowToSection extends ItemList{
	
	
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
}
