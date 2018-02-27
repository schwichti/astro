package org.schema;
/**
* A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
*/
public class MusicGroup extends PerformingGroup{
	
	
	/**
	* A member of a music group&#x2014;for example, John, Paul, George, or Ringo.
	 *
	 * Ranges: Person
	 */
	private Person _musicGroupMember;
	
	public Person getMusicGroupMember() throws ClassCastException{
		return (Person) _musicGroupMember;
	}
	
	public void setMusicGroupMember(Person value) throws ClassCastException{
		_musicGroupMember = value;
	}
	/**
	* A music album.
	 *
	 * Ranges: MusicAlbum
	 */
	private MusicAlbum _album;
	
	public MusicAlbum getAlbum() throws ClassCastException{
		return (MusicAlbum) _album;
	}
	
	public void setAlbum(MusicAlbum value) throws ClassCastException{
		_album = value;
	}
	/**
	* A collection of music albums.
	 *
	 * Ranges: MusicAlbum
	 */
	private MusicAlbum _albums;
	
	public MusicAlbum getAlbums() throws ClassCastException{
		return (MusicAlbum) _albums;
	}
	
	public void setAlbums(MusicAlbum value) throws ClassCastException{
		_albums = value;
	}
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
}
