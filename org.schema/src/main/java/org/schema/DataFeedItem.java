package org.schema;
/**
* A single item within a larger data feed.
*/
public class DataFeedItem extends Intangible{
	
	
	/**
	* The date on which the CreativeWork was created or the item was added to a DataFeed.
	 *
	 * Ranges: Date, DateTime
	 */
	private java.util.Date _dateCreated;
	
	public java.util.Date getDateCreated() throws ClassCastException{
		return (java.util.Date) _dateCreated;
	}
	
	public void setDateCreated(java.util.Date value) throws ClassCastException{
		_dateCreated = value;
	}
	/**
	* The datetime the item was removed from the DataFeed.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _dateDeleted;
	
	public java.util.Date getDateDeleted() throws ClassCastException{
		return (java.util.Date) _dateDeleted;
	}
	
	public void setDateDeleted(java.util.Date value) throws ClassCastException{
		_dateDeleted = value;
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
	* The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
	 *
	 * Ranges: Date, DateTime
	 */
	private java.util.Date _dateModified;
	
	public java.util.Date getDateModified() throws ClassCastException{
		return (java.util.Date) _dateModified;
	}
	
	public void setDateModified(java.util.Date value) throws ClassCastException{
		_dateModified = value;
	}
}
