package org.schema;
/**
* A structured representation of food or drink items available from a FoodEstablishment.
*/
public interface IMenu extends ICreativeWork{
	
	
	/**
	 * A subgrouping of the menu (by dishes, course, serving time period, etc.).
	 *
	 */
	
	public MenuSection getHasMenuSection() throws ClassCastException;
	
	public void setHasMenuSection(MenuSection value) throws ClassCastException;
	/**
	 * A food or drink item contained in a menu or menu section.
	 *
	 */
	
	public MenuItem getHasMenuItem() throws ClassCastException;
	
	public void setHasMenuItem(MenuItem value) throws ClassCastException;
}
