package org.schema;
/**
* A collection of music tracks.
*/
public interface IMusicAlbum extends IMusicPlaylist{
	
	
	/**
	 * The artist that performed this album or recording.
	 *
	 */
	
	public MusicGroup getByArtist() throws ClassCastException;
	
	public void setByArtist(MusicGroup value) throws ClassCastException;
	/**
	 * Classification of the album by it's type of content: soundtrack, live album, studio album, etc.
	 *
	 */
	
	public MusicAlbumProductionType getAlbumProductionType() throws ClassCastException;
	
	public void setAlbumProductionType(MusicAlbumProductionType value) throws ClassCastException;
	/**
	 * The kind of release which this album is: single, EP or album.
	 *
	 */
	
	public MusicAlbumReleaseType getAlbumReleaseType() throws ClassCastException;
	
	public void setAlbumReleaseType(MusicAlbumReleaseType value) throws ClassCastException;
	/**
	 * A release of this album.
	 *
	 */
	
	public MusicRelease getAlbumRelease() throws ClassCastException;
	
	public void setAlbumRelease(MusicRelease value) throws ClassCastException;
}
