package org.schema;
/**
* An over the air or online broadcast event.
*/
public class BroadcastEvent extends PublicationEvent{
	
	
	/**
	* The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
	 *
	 * Ranges: Text
	 */
	private String _videoFormat;
	
	public String getVideoFormat() throws ClassCastException{
		return (String) _videoFormat;
	}
	
	public void setVideoFormat(String value) throws ClassCastException{
		_videoFormat = value;
	}
	/**
	* True is the broadcast is of a live event.
	 *
	 * Ranges: Boolean
	 */
	private Boolean _isLiveBroadcast;
	
	public Boolean getIsLiveBroadcast() throws ClassCastException{
		return (Boolean) _isLiveBroadcast;
	}
	
	public void setIsLiveBroadcast(Boolean value) throws ClassCastException{
		_isLiveBroadcast = value;
	}
	/**
	* The event being broadcast such as a sporting event or awards ceremony.
	 *
	 * Ranges: Event
	 */
	private Event _broadcastOfEvent;
	
	public Event getBroadcastOfEvent() throws ClassCastException{
		return (Event) _broadcastOfEvent;
	}
	
	public void setBroadcastOfEvent(Event value) throws ClassCastException{
		_broadcastOfEvent = value;
	}
}
