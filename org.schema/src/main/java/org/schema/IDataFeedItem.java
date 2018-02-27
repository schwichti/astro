package org.schema;
/**
* A single item within a larger data feed.
*/
public interface IDataFeedItem extends IIntangible{
	
	
	/**
	 * The date on which the CreativeWork was created or the item was added to a DataFeed.
	 *
	 */
	
	public java.util.Date getDateCreated() throws ClassCastException;
	
	public void setDateCreated(java.util.Date value) throws ClassCastException;
	/**
	 * The datetime the item was removed from the DataFeed.
	 *
	 */
	
	public java.util.Date getDateDeleted() throws ClassCastException;
	
	public void setDateDeleted(java.util.Date value) throws ClassCastException;
	/**
	 * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
	 *
	 */
	
	public Thing getItem() throws ClassCastException;
	
	public void setItem(Thing value) throws ClassCastException;
	/**
	 * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
	 *
	 */
	
	public java.util.Date getDateModified() throws ClassCastException;
	
	public void setDateModified(java.util.Date value) throws ClassCastException;
}
