package org.schema;
/**
* A video file.
*/
public interface IVideoObject extends IMediaObject{
	
	
	/**
	 * If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
	 *
	 */
	
	public String getTranscript() throws ClassCastException;
	
	public void setTranscript(String value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActors() throws ClassCastException;
	
	public void setActors(Person value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirectors() throws ClassCastException;
	
	public void setDirectors(Person value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActor() throws ClassCastException;
	
	public void setActor(Person value) throws ClassCastException;
	/**
	 * Thumbnail image for an image or video.
	 *
	 */
	
	public ImageObject getThumbnail() throws ClassCastException;
	
	public void setThumbnail(ImageObject value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirector() throws ClassCastException;
	
	public void setDirector(Person value) throws ClassCastException;
	/**
	 * The composer of the soundtrack.
	 *
	 */
	
	public <T> T getMusicBy(Class<T> c) throws ClassCastException;
	
	public void setMusicBy(MusicGroup value) throws ClassCastException;
	public void setMusicBy(Person value) throws ClassCastException;
	/**
	 * The frame size of the video.
	 *
	 */
	
	public String getVideoFrameSize() throws ClassCastException;
	
	public void setVideoFrameSize(String value) throws ClassCastException;
	/**
	 * The caption for this object.
	 *
	 */
	
	public String getCaption() throws ClassCastException;
	
	public void setCaption(String value) throws ClassCastException;
	/**
	 * The quality of the video.
	 *
	 */
	
	public String getVideoQuality() throws ClassCastException;
	
	public void setVideoQuality(String value) throws ClassCastException;
}
