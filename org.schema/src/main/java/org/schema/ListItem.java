package org.schema;
/**
* An list item, e.g. a step in a checklist or how-to description.
*/
public class ListItem extends Intangible{
	
	
	/**
	* The position of an item in a series or sequence of items.
	 *
	 * Ranges: Integer, Text
	 */
	private Object _position;
	
	public <T> T getPosition(Class<T> c) throws ClassCastException{
		return (T) _position;
	}
	
	public void setPosition(Integer value) throws ClassCastException{
		_position = value;
	}
	public void setPosition(String value) throws ClassCastException{
		_position = value;
	}
	/**
	* An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
	 *
	 * Ranges: Thing
	 */
	private Thing _item;
	
	public Thing getItem() throws ClassCastException{
		return (Thing) _item;
	}
	
	public void setItem(Thing value) throws ClassCastException{
		_item = value;
	}
	/**
	* A link to the ListItem that follows the current one.
	 *
	 * Ranges: ListItem
	 */
	private ListItem _nextItem;
	
	public ListItem getNextItem() throws ClassCastException{
		return (ListItem) _nextItem;
	}
	
	public void setNextItem(ListItem value) throws ClassCastException{
		_nextItem = value;
	}
	/**
	* A link to the ListItem that preceeds the current one.
	 *
	 * Ranges: ListItem
	 */
	private ListItem _previousItem;
	
	public ListItem getPreviousItem() throws ClassCastException{
		return (ListItem) _previousItem;
	}
	
	public void setPreviousItem(ListItem value) throws ClassCastException{
		_previousItem = value;
	}
}
