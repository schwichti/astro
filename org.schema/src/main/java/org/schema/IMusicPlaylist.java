package org.schema;
/**
* A collection of music tracks in playlist form.
*/
public interface IMusicPlaylist extends ICreativeWork{
	
	
	/**
	 * A music recording (track)&#x2014;usually a single song.
	 *
	 */
	
	public MusicRecording getTracks() throws ClassCastException;
	
	public void setTracks(MusicRecording value) throws ClassCastException;
	/**
	 * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
	 *
	 */
	
	public <T> T getTrack(Class<T> c) throws ClassCastException;
	
	public void setTrack(ItemList value) throws ClassCastException;
	public void setTrack(MusicRecording value) throws ClassCastException;
	/**
	 * The number of tracks in this album or playlist.
	 *
	 */
	
	public Integer getNumTracks() throws ClassCastException;
	
	public void setNumTracks(Integer value) throws ClassCastException;
}
