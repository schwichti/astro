package org.schema;
/**
* A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
*/
public class BroadcastChannel extends Intangible{
	
	
	/**
	* The BroadcastService offered on this channel.
	 *
	 * Ranges: BroadcastService
	 */
	private BroadcastService _providesBroadcastService;
	
	public BroadcastService getProvidesBroadcastService() throws ClassCastException{
		return (BroadcastService) _providesBroadcastService;
	}
	
	public void setProvidesBroadcastService(BroadcastService value) throws ClassCastException{
		_providesBroadcastService = value;
	}
	/**
	* The type of service required to have access to the channel (e.g. Standard or Premium).
	 *
	 * Ranges: Text
	 */
	private String _broadcastServiceTier;
	
	public String getBroadcastServiceTier() throws ClassCastException{
		return (String) _broadcastServiceTier;
	}
	
	public void setBroadcastServiceTier(String value) throws ClassCastException{
		_broadcastServiceTier = value;
	}
	/**
	* The CableOrSatelliteService offering the channel.
	 *
	 * Ranges: CableOrSatelliteService
	 */
	private CableOrSatelliteService _inBroadcastLineup;
	
	public CableOrSatelliteService getInBroadcastLineup() throws ClassCastException{
		return (CableOrSatelliteService) _inBroadcastLineup;
	}
	
	public void setInBroadcastLineup(CableOrSatelliteService value) throws ClassCastException{
		_inBroadcastLineup = value;
	}
	/**
	* Genre of the creative work, broadcast channel or group.
	 *
	 * Ranges: URL, Text
	 */
	private String _genre;
	
	public String getGenre() throws ClassCastException{
		return (String) _genre;
	}
	
	public void setGenre(String value) throws ClassCastException{
		_genre = value;
	}
	/**
	* The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
	 *
	 * Ranges: Text
	 */
	private String _broadcastChannelId;
	
	public String getBroadcastChannelId() throws ClassCastException{
		return (String) _broadcastChannelId;
	}
	
	public void setBroadcastChannelId(String value) throws ClassCastException{
		_broadcastChannelId = value;
	}
}
