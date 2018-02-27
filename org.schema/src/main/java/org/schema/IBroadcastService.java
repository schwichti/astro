package org.schema;
/**
* A delivery service through which content is provided via broadcast over the air or online.
*/
public interface IBroadcastService extends IService{
	
	
	/**
	 * The media network(s) whose content is broadcast on this station.
	 *
	 */
	
	public Organization getBroadcastAffiliateOf() throws ClassCastException;
	
	public void setBroadcastAffiliateOf(Organization value) throws ClassCastException;
	/**
	 * The timezone in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> for which the service bases its broadcasts
	 *
	 */
	
	public String getBroadcastTimezone() throws ClassCastException;
	
	public void setBroadcastTimezone(String value) throws ClassCastException;
	/**
	 * The organization owning or operating the broadcast service.
	 *
	 */
	
	public Organization getBroadcaster() throws ClassCastException;
	
	public void setBroadcaster(Organization value) throws ClassCastException;
	/**
	 * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
	 *
	 */
	
	public BroadcastService getParentService() throws ClassCastException;
	
	public void setParentService(BroadcastService value) throws ClassCastException;
	/**
	 * The name displayed in the channel guide. For many US affiliates, it is the network name.
	 *
	 */
	
	public String getBroadcastDisplayName() throws ClassCastException;
	
	public void setBroadcastDisplayName(String value) throws ClassCastException;
	/**
	 * The area within which users can expect to reach the broadcast service.
	 *
	 */
	
	public Place getArea() throws ClassCastException;
	
	public void setArea(Place value) throws ClassCastException;
	/**
	 * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
	 *
	 */
	
	public String getVideoFormat() throws ClassCastException;
	
	public void setVideoFormat(String value) throws ClassCastException;
}
