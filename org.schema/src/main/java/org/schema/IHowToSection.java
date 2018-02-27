package org.schema;
/**
* A sub-grouping of steps in the instructions for how to achieve a result (e.g. steps for making a pie crust within a pie recipe).
*/
public interface IHowToSection extends IItemList{
	
	
	/**
	 * The steps in the form of a single item (text, document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
	 *
	 */
	
	public <T> T getSteps(Class<T> c) throws ClassCastException;
	
	public void setSteps(ItemList value) throws ClassCastException;
	public void setSteps(CreativeWork value) throws ClassCastException;
	public void setSteps(String value) throws ClassCastException;
}
