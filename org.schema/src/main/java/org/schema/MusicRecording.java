package org.schema;
/**
* A music recording (track), usually a single song.
*/
public class MusicRecording extends CreativeWork{
	
	
	/**
	* The composition this track is a recording of.
	 *
	 * Ranges: MusicComposition
	 */
	private MusicComposition _recordingOf;
	
	public MusicComposition getRecordingOf() throws ClassCastException{
		return (MusicComposition) _recordingOf;
	}
	
	public void setRecordingOf(MusicComposition value) throws ClassCastException{
		_recordingOf = value;
	}
	/**
	* The album to which this recording belongs.
	 *
	 * Ranges: MusicAlbum
	 */
	private MusicAlbum _inAlbum;
	
	public MusicAlbum getInAlbum() throws ClassCastException{
		return (MusicAlbum) _inAlbum;
	}
	
	public void setInAlbum(MusicAlbum value) throws ClassCastException{
		_inAlbum = value;
	}
	/**
	* The artist that performed this album or recording.
	 *
	 * Ranges: MusicGroup
	 */
	private MusicGroup _byArtist;
	
	public MusicGroup getByArtist() throws ClassCastException{
		return (MusicGroup) _byArtist;
	}
	
	public void setByArtist(MusicGroup value) throws ClassCastException{
		_byArtist = value;
	}
	/**
	* The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _duration;
	
	public Duration getDuration() throws ClassCastException{
		return (Duration) _duration;
	}
	
	public void setDuration(Duration value) throws ClassCastException{
		_duration = value;
	}
	/**
	* The playlist to which this recording belongs.
	 *
	 * Ranges: MusicPlaylist
	 */
	private MusicPlaylist _inPlaylist;
	
	public MusicPlaylist getInPlaylist() throws ClassCastException{
		return (MusicPlaylist) _inPlaylist;
	}
	
	public void setInPlaylist(MusicPlaylist value) throws ClassCastException{
		_inPlaylist = value;
	}
	/**
	* The International Standard Recording Code for the recording.
	 *
	 * Ranges: Text
	 */
	private String _isrcCode;
	
	public String getIsrcCode() throws ClassCastException{
		return (String) _isrcCode;
	}
	
	public void setIsrcCode(String value) throws ClassCastException{
		_isrcCode = value;
	}
}
