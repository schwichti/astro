package org.schema;
/**
* A music recording (track), usually a single song.
*/
public interface IMusicRecording extends ICreativeWork{
	
	
	/**
	 * The composition this track is a recording of.
	 *
	 */
	
	public MusicComposition getRecordingOf() throws ClassCastException;
	
	public void setRecordingOf(MusicComposition value) throws ClassCastException;
	/**
	 * The album to which this recording belongs.
	 *
	 */
	
	public MusicAlbum getInAlbum() throws ClassCastException;
	
	public void setInAlbum(MusicAlbum value) throws ClassCastException;
	/**
	 * The artist that performed this album or recording.
	 *
	 */
	
	public MusicGroup getByArtist() throws ClassCastException;
	
	public void setByArtist(MusicGroup value) throws ClassCastException;
	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 *
	 */
	
	public Duration getDuration() throws ClassCastException;
	
	public void setDuration(Duration value) throws ClassCastException;
	/**
	 * The playlist to which this recording belongs.
	 *
	 */
	
	public MusicPlaylist getInPlaylist() throws ClassCastException;
	
	public void setInPlaylist(MusicPlaylist value) throws ClassCastException;
	/**
	 * The International Standard Recording Code for the recording.
	 *
	 */
	
	public String getIsrcCode() throws ClassCastException;
	
	public void setIsrcCode(String value) throws ClassCastException;
}
