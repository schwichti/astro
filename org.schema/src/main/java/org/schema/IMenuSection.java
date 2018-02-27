package org.schema;
/**
* A sub-grouping of food or drink items in a menu. E.g. courses (such as 'Dinner', 'Breakfast', etc.), specific type of dishes (such as 'Meat', 'Vegan', 'Drinks', etc.), or some other classification made by the menu provider.
*/
public interface IMenuSection extends ICreativeWork{
	
	
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
