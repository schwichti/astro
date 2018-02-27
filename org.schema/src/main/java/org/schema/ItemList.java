package org.schema;
/**
* A list of items of any sort&#x2014;for example, Top 10 Movies About Weathermen, or Top 100 Party Songs. Not to be confused with HTML lists, which are often used only for formatting.
*/
public class ItemList extends Intangible{
	
	
	/**
	* For itemListElement values, you can use simple strings (e.g. "Peter", "Paul", "Mary"), existing entities, or use ListItem.</p>
	
	<p>Text values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.</p>
	
	<p>Note: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases.
	 *
	 * Ranges: Thing, ListItem, Text
	 */
	private Object _itemListElement;
	
	public <T> T getItemListElement(Class<T> c) throws ClassCastException{
		return (T) _itemListElement;
	}
	
	public void setItemListElement(Thing value) throws ClassCastException{
		_itemListElement = value;
	}
	public void setItemListElement(ListItem value) throws ClassCastException{
		_itemListElement = value;
	}
	public void setItemListElement(String value) throws ClassCastException{
		_itemListElement = value;
	}
	/**
	* The number of items in an ItemList. Note that some descriptions might not fully describe all items in a list (e.g., multi-page pagination); in such cases, the numberOfItems would be for the entire list.
	 *
	 * Ranges: Integer
	 */
	private Integer _numberOfItems;
	
	public Integer getNumberOfItems() throws ClassCastException{
		return (Integer) _numberOfItems;
	}
	
	public void setNumberOfItems(Integer value) throws ClassCastException{
		_numberOfItems = value;
	}
	/**
	* Type of ordering (e.g. Ascending, Descending, Unordered).
	 *
	 * Ranges: Text, ItemListOrderType
	 */
	private Object _itemListOrder;
	
	public <T> T getItemListOrder(Class<T> c) throws ClassCastException{
		return (T) _itemListOrder;
	}
	
	public void setItemListOrder(String value) throws ClassCastException{
		_itemListOrder = value;
	}
	public void setItemListOrder(ItemListOrderType value) throws ClassCastException{
		_itemListOrder = value;
	}
}
