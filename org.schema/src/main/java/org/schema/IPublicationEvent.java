package org.schema;
/**
* A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media.
*/
public interface IPublicationEvent extends IEvent{
	
	
	/**
	 * A flag to signal that the item, event, or place is accessible for free.
	 *
	 */
	
	public Boolean getFree() throws ClassCastException;
	
	public void setFree(Boolean value) throws ClassCastException;
	/**
	 * A broadcast service associated with the publication event.
	 *
	 */
	
	public BroadcastService getPublishedOn() throws ClassCastException;
	
	public void setPublishedOn(BroadcastService value) throws ClassCastException;
	/**
	 * A flag to signal that the item, event, or place is accessible for free.
	 *
	 */
	
	public Boolean getIsAccessibleForFree() throws ClassCastException;
	
	public void setIsAccessibleForFree(Boolean value) throws ClassCastException;
}
