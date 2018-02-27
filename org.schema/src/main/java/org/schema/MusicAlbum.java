package org.schema;
/**
* A collection of music tracks.
*/
public class MusicAlbum extends MusicPlaylist{
	
	
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
	* Classification of the album by it's type of content: soundtrack, live album, studio album, etc.
	 *
	 * Ranges: MusicAlbumProductionType
	 */
	private MusicAlbumProductionType _albumProductionType;
	
	public MusicAlbumProductionType getAlbumProductionType() throws ClassCastException{
		return (MusicAlbumProductionType) _albumProductionType;
	}
	
	public void setAlbumProductionType(MusicAlbumProductionType value) throws ClassCastException{
		_albumProductionType = value;
	}
	/**
	* The kind of release which this album is: single, EP or album.
	 *
	 * Ranges: MusicAlbumReleaseType
	 */
	private MusicAlbumReleaseType _albumReleaseType;
	
	public MusicAlbumReleaseType getAlbumReleaseType() throws ClassCastException{
		return (MusicAlbumReleaseType) _albumReleaseType;
	}
	
	public void setAlbumReleaseType(MusicAlbumReleaseType value) throws ClassCastException{
		_albumReleaseType = value;
	}
	/**
	* A release of this album.
	 *
	 * Ranges: MusicRelease
	 */
	private MusicRelease _albumRelease;
	
	public MusicRelease getAlbumRelease() throws ClassCastException{
		return (MusicRelease) _albumRelease;
	}
	
	public void setAlbumRelease(MusicRelease value) throws ClassCastException{
		_albumRelease = value;
	}
}
