package org.schema;
/**
* A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
*/
public interface IBroadcastChannel extends IIntangible{
	
	
	/**
	 * The BroadcastService offered on this channel.
	 *
	 */
	
	public BroadcastService getProvidesBroadcastService() throws ClassCastException;
	
	public void setProvidesBroadcastService(BroadcastService value) throws ClassCastException;
	/**
	 * The type of service required to have access to the channel (e.g. Standard or Premium).
	 *
	 */
	
	public String getBroadcastServiceTier() throws ClassCastException;
	
	public void setBroadcastServiceTier(String value) throws ClassCastException;
	/**
	 * The CableOrSatelliteService offering the channel.
	 *
	 */
	
	public CableOrSatelliteService getInBroadcastLineup() throws ClassCastException;
	
	public void setInBroadcastLineup(CableOrSatelliteService value) throws ClassCastException;
	/**
	 * Genre of the creative work, broadcast channel or group.
	 *
	 */
	
	public String getGenre() throws ClassCastException;
	
	public void setGenre(String value) throws ClassCastException;
	/**
	 * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
	 *
	 */
	
	public String getBroadcastChannelId() throws ClassCastException;
	
	public void setBroadcastChannelId(String value) throws ClassCastException;
}
