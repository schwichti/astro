package org.schema;
/**
* An over the air or online broadcast event.
*/
public interface IBroadcastEvent extends IPublicationEvent{
	
	
	/**
	 * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
	 *
	 */
	
	public String getVideoFormat() throws ClassCastException;
	
	public void setVideoFormat(String value) throws ClassCastException;
	/**
	 * True is the broadcast is of a live event.
	 *
	 */
	
	public Boolean getIsLiveBroadcast() throws ClassCastException;
	
	public void setIsLiveBroadcast(Boolean value) throws ClassCastException;
	/**
	 * The event being broadcast such as a sporting event or awards ceremony.
	 *
	 */
	
	public Event getBroadcastOfEvent() throws ClassCastException;
	
	public void setBroadcastOfEvent(Event value) throws ClassCastException;
}
