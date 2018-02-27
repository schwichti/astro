package org.schema;
/**
* A delivery service through which content is provided via broadcast over the air or online.
*/
public class BroadcastService extends Service{
	
	
	/**
	* The media network(s) whose content is broadcast on this station.
	 *
	 * Ranges: Organization
	 */
	private Organization _broadcastAffiliateOf;
	
	public Organization getBroadcastAffiliateOf() throws ClassCastException{
		return (Organization) _broadcastAffiliateOf;
	}
	
	public void setBroadcastAffiliateOf(Organization value) throws ClassCastException{
		_broadcastAffiliateOf = value;
	}
	/**
	* The timezone in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> for which the service bases its broadcasts
	 *
	 * Ranges: Text
	 */
	private String _broadcastTimezone;
	
	public String getBroadcastTimezone() throws ClassCastException{
		return (String) _broadcastTimezone;
	}
	
	public void setBroadcastTimezone(String value) throws ClassCastException{
		_broadcastTimezone = value;
	}
	/**
	* The organization owning or operating the broadcast service.
	 *
	 * Ranges: Organization
	 */
	private Organization _broadcaster;
	
	public Organization getBroadcaster() throws ClassCastException{
		return (Organization) _broadcaster;
	}
	
	public void setBroadcaster(Organization value) throws ClassCastException{
		_broadcaster = value;
	}
	/**
	* A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
	 *
	 * Ranges: BroadcastService
	 */
	private BroadcastService _parentService;
	
	public BroadcastService getParentService() throws ClassCastException{
		return (BroadcastService) _parentService;
	}
	
	public void setParentService(BroadcastService value) throws ClassCastException{
		_parentService = value;
	}
	/**
	* The name displayed in the channel guide. For many US affiliates, it is the network name.
	 *
	 * Ranges: Text
	 */
	private String _broadcastDisplayName;
	
	public String getBroadcastDisplayName() throws ClassCastException{
		return (String) _broadcastDisplayName;
	}
	
	public void setBroadcastDisplayName(String value) throws ClassCastException{
		_broadcastDisplayName = value;
	}
	/**
	* The area within which users can expect to reach the broadcast service.
	 *
	 * Ranges: Place
	 */
	private Place _area;
	
	public Place getArea() throws ClassCastException{
		return (Place) _area;
	}
	
	public void setArea(Place value) throws ClassCastException{
		_area = value;
	}
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
}
