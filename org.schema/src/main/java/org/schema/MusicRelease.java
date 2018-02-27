package org.schema;
/**
* A MusicRelease is a specific release of a music album.
*/
public class MusicRelease extends MusicPlaylist{
	
	
	/**
	* Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).
	 *
	 * Ranges: MusicReleaseFormatType
	 */
	private MusicReleaseFormatType _musicReleaseFormat;
	
	public MusicReleaseFormatType getMusicReleaseFormat() throws ClassCastException{
		return (MusicReleaseFormatType) _musicReleaseFormat;
	}
	
	public void setMusicReleaseFormat(MusicReleaseFormatType value) throws ClassCastException{
		_musicReleaseFormat = value;
	}
	/**
	* The label that issued the release.
	 *
	 * Ranges: Organization
	 */
	private Organization _recordLabel;
	
	public Organization getRecordLabel() throws ClassCastException{
		return (Organization) _recordLabel;
	}
	
	public void setRecordLabel(Organization value) throws ClassCastException{
		_recordLabel = value;
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
	* The album this is a release of.
	 *
	 * Ranges: MusicAlbum
	 */
	private MusicAlbum _releaseOf;
	
	public MusicAlbum getReleaseOf() throws ClassCastException{
		return (MusicAlbum) _releaseOf;
	}
	
	public void setReleaseOf(MusicAlbum value) throws ClassCastException{
		_releaseOf = value;
	}
	/**
	* The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _creditedTo;
	
	public <T> T getCreditedTo(Class<T> c) throws ClassCastException{
		return (T) _creditedTo;
	}
	
	public void setCreditedTo(Person value) throws ClassCastException{
		_creditedTo = value;
	}
	public void setCreditedTo(Organization value) throws ClassCastException{
		_creditedTo = value;
	}
	/**
	* The catalog number for the release.
	 *
	 * Ranges: Text
	 */
	private String _catalogNumber;
	
	public String getCatalogNumber() throws ClassCastException{
		return (String) _catalogNumber;
	}
	
	public void setCatalogNumber(String value) throws ClassCastException{
		_catalogNumber = value;
	}
}
