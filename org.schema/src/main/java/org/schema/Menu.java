package org.schema;
/**
* A structured representation of food or drink items available from a FoodEstablishment.
*/
public class Menu extends CreativeWork{
	
	
	/**
	* A subgrouping of the menu (by dishes, course, serving time period, etc.).
	 *
	 * Ranges: MenuSection
	 */
	private MenuSection _hasMenuSection;
	
	public MenuSection getHasMenuSection() throws ClassCastException{
		return (MenuSection) _hasMenuSection;
	}
	
	public void setHasMenuSection(MenuSection value) throws ClassCastException{
		_hasMenuSection = value;
	}
	/**
	* A food or drink item contained in a menu or menu section.
	 *
	 * Ranges: MenuItem
	 */
	private MenuItem _hasMenuItem;
	
	public MenuItem getHasMenuItem() throws ClassCastException{
		return (MenuItem) _hasMenuItem;
	}
	
	public void setHasMenuItem(MenuItem value) throws ClassCastException{
		_hasMenuItem = value;
	}
}
