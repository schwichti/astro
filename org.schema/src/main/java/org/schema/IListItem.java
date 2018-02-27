package org.schema;
/**
* An list item, e.g. a step in a checklist or how-to description.
*/
public interface IListItem extends IIntangible{
	
	
	/**
	 * The position of an item in a series or sequence of items.
	 *
	 */
	
	public <T> T getPosition(Class<T> c) throws ClassCastException;
	
	public void setPosition(Integer value) throws ClassCastException;
	public void setPosition(String value) throws ClassCastException;
	/**
	 * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
	 *
	 */
	
	public Thing getItem() throws ClassCastException;
	
	public void setItem(Thing value) throws ClassCastException;
	/**
	 * A link to the ListItem that follows the current one.
	 *
	 */
	
	public ListItem getNextItem() throws ClassCastException;
	
	public void setNextItem(ListItem value) throws ClassCastException;
	/**
	 * A link to the ListItem that preceeds the current one.
	 *
	 */
	
	public ListItem getPreviousItem() throws ClassCastException;
	
	public void setPreviousItem(ListItem value) throws ClassCastException;
}
