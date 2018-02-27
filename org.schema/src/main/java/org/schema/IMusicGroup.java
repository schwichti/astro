package org.schema;
/**
* A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
*/
public interface IMusicGroup extends IPerformingGroup{
	
	
	/**
	 * A member of a music group&#x2014;for example, John, Paul, George, or Ringo.
	 *
	 */
	
	public Person getMusicGroupMember() throws ClassCastException;
	
	public void setMusicGroupMember(Person value) throws ClassCastException;
	/**
	 * A music album.
	 *
	 */
	
	public MusicAlbum getAlbum() throws ClassCastException;
	
	public void setAlbum(MusicAlbum value) throws ClassCastException;
	/**
	 * A collection of music albums.
	 *
	 */
	
	public MusicAlbum getAlbums() throws ClassCastException;
	
	public void setAlbums(MusicAlbum value) throws ClassCastException;
	/**
	 * A music recording (track)&#x2014;usually a single song.
	 *
	 */
	
	public MusicRecording getTracks() throws ClassCastException;
	
	public void setTracks(MusicRecording value) throws ClassCastException;
	/**
	 * Genre of the creative work, broadcast channel or group.
	 *
	 */
	
	public String getGenre() throws ClassCastException;
	
	public void setGenre(String value) throws ClassCastException;
	/**
	 * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
	 *
	 */
	
	public <T> T getTrack(Class<T> c) throws ClassCastException;
	
	public void setTrack(ItemList value) throws ClassCastException;
	public void setTrack(MusicRecording value) throws ClassCastException;
}
