package org.schema;
/**
* A MusicRelease is a specific release of a music album.
*/
public interface IMusicRelease extends IMusicPlaylist{
	
	
	/**
	 * Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.).
	 *
	 */
	
	public MusicReleaseFormatType getMusicReleaseFormat() throws ClassCastException;
	
	public void setMusicReleaseFormat(MusicReleaseFormatType value) throws ClassCastException;
	/**
	 * The label that issued the release.
	 *
	 */
	
	public Organization getRecordLabel() throws ClassCastException;
	
	public void setRecordLabel(Organization value) throws ClassCastException;
	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 *
	 */
	
	public Duration getDuration() throws ClassCastException;
	
	public void setDuration(Duration value) throws ClassCastException;
	/**
	 * The album this is a release of.
	 *
	 */
	
	public MusicAlbum getReleaseOf() throws ClassCastException;
	
	public void setReleaseOf(MusicAlbum value) throws ClassCastException;
	/**
	 * The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga.
	 *
	 */
	
	public <T> T getCreditedTo(Class<T> c) throws ClassCastException;
	
	public void setCreditedTo(Person value) throws ClassCastException;
	public void setCreditedTo(Organization value) throws ClassCastException;
	/**
	 * The catalog number for the release.
	 *
	 */
	
	public String getCatalogNumber() throws ClassCastException;
	
	public void setCatalogNumber(String value) throws ClassCastException;
}
