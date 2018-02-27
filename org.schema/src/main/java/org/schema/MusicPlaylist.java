package org.schema;
/**
* A collection of music tracks in playlist form.
*/
public class MusicPlaylist extends CreativeWork{
	
	
	/**
	* A music recording (track)&#x2014;usually a single song.
	 *
	 * Ranges: MusicRecording
	 */
	private MusicRecording _tracks;
	
	public MusicRecording getTracks() throws ClassCastException{
		return (MusicRecording) _tracks;
	}
	
	public void setTracks(MusicRecording value) throws ClassCastException{
		_tracks = value;
	}
	/**
	* A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
	 *
	 * Ranges: ItemList, MusicRecording
	 */
	private Object _track;
	
	public <T> T getTrack(Class<T> c) throws ClassCastException{
		return (T) _track;
	}
	
	public void setTrack(ItemList value) throws ClassCastException{
		_track = value;
	}
	public void setTrack(MusicRecording value) throws ClassCastException{
		_track = value;
	}
	/**
	* The number of tracks in this album or playlist.
	 *
	 * Ranges: Integer
	 */
	private Integer _numTracks;
	
	public Integer getNumTracks() throws ClassCastException{
		return (Integer) _numTracks;
	}
	
	public void setNumTracks(Integer value) throws ClassCastException{
		_numTracks = value;
	}
}
