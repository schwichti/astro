package org.schema;
/**
* A video file.
*/
public class VideoObject extends MediaObject{
	
	
	/**
	* If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
	 *
	 * Ranges: Text
	 */
	private String _transcript;
	
	public String getTranscript() throws ClassCastException{
		return (String) _transcript;
	}
	
	public void setTranscript(String value) throws ClassCastException{
		_transcript = value;
	}
	/**
	* An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _actors;
	
	public Person getActors() throws ClassCastException{
		return (Person) _actors;
	}
	
	public void setActors(Person value) throws ClassCastException{
		_actors = value;
	}
	/**
	* A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _directors;
	
	public Person getDirectors() throws ClassCastException{
		return (Person) _directors;
	}
	
	public void setDirectors(Person value) throws ClassCastException{
		_directors = value;
	}
	/**
	* An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _actor;
	
	public Person getActor() throws ClassCastException{
		return (Person) _actor;
	}
	
	public void setActor(Person value) throws ClassCastException{
		_actor = value;
	}
	/**
	* Thumbnail image for an image or video.
	 *
	 * Ranges: ImageObject
	 */
	private ImageObject _thumbnail;
	
	public ImageObject getThumbnail() throws ClassCastException{
		return (ImageObject) _thumbnail;
	}
	
	public void setThumbnail(ImageObject value) throws ClassCastException{
		_thumbnail = value;
	}
	/**
	* A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 * Ranges: Person
	 */
	private Person _director;
	
	public Person getDirector() throws ClassCastException{
		return (Person) _director;
	}
	
	public void setDirector(Person value) throws ClassCastException{
		_director = value;
	}
	/**
	* The composer of the soundtrack.
	 *
	 * Ranges: MusicGroup, Person
	 */
	private Object _musicBy;
	
	public <T> T getMusicBy(Class<T> c) throws ClassCastException{
		return (T) _musicBy;
	}
	
	public void setMusicBy(MusicGroup value) throws ClassCastException{
		_musicBy = value;
	}
	public void setMusicBy(Person value) throws ClassCastException{
		_musicBy = value;
	}
	/**
	* The frame size of the video.
	 *
	 * Ranges: Text
	 */
	private String _videoFrameSize;
	
	public String getVideoFrameSize() throws ClassCastException{
		return (String) _videoFrameSize;
	}
	
	public void setVideoFrameSize(String value) throws ClassCastException{
		_videoFrameSize = value;
	}
	/**
	* The caption for this object.
	 *
	 * Ranges: Text
	 */
	private String _caption;
	
	public String getCaption() throws ClassCastException{
		return (String) _caption;
	}
	
	public void setCaption(String value) throws ClassCastException{
		_caption = value;
	}
	/**
	* The quality of the video.
	 *
	 * Ranges: Text
	 */
	private String _videoQuality;
	
	public String getVideoQuality() throws ClassCastException{
		return (String) _videoQuality;
	}
	
	public void setVideoQuality(String value) throws ClassCastException{
		_videoQuality = value;
	}
}
