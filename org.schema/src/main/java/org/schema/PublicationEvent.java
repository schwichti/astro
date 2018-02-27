package org.schema;
/**
* A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media.
*/
public class PublicationEvent extends Event{
	
	
	/**
	* A flag to signal that the item, event, or place is accessible for free.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _free;
	
	public Boolean getFree() throws ClassCastException{
		return (Boolean) _free;
	}
	
	public void setFree(Boolean value) throws ClassCastException{
		_free = value;
	}
	/**
	* A broadcast service associated with the publication event.
	 *
	 * Ranges: BroadcastService
	 */
	private BroadcastService _publishedOn;
	
	public BroadcastService getPublishedOn() throws ClassCastException{
		return (BroadcastService) _publishedOn;
	}
	
	public void setPublishedOn(BroadcastService value) throws ClassCastException{
		_publishedOn = value;
	}
	/**
	* A flag to signal that the item, event, or place is accessible for free.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _isAccessibleForFree;
	
	public Boolean getIsAccessibleForFree() throws ClassCastException{
		return (Boolean) _isAccessibleForFree;
	}
	
	public void setIsAccessibleForFree(Boolean value) throws ClassCastException{
		_isAccessibleForFree = value;
	}
}
