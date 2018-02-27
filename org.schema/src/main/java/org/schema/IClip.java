package org.schema;
/**
* A short TV or radio program or a segment/part of a program.
*/
public interface IClip extends ICreativeWork{
	
	
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActor() throws ClassCastException;
	
	public void setActor(Person value) throws ClassCastException;
	/**
	 * The composer of the soundtrack.
	 *
	 */
	
	public <T> T getMusicBy(Class<T> c) throws ClassCastException;
	
	public void setMusicBy(MusicGroup value) throws ClassCastException;
	public void setMusicBy(Person value) throws ClassCastException;
	/**
	 * The season to which this episode belongs.
	 *
	 */
	
	public CreativeWorkSeason getPartOfSeason() throws ClassCastException;
	
	public void setPartOfSeason(CreativeWorkSeason value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirectors() throws ClassCastException;
	
	public void setDirectors(Person value) throws ClassCastException;
	/**
	 * Position of the clip within an ordered group of clips.
	 *
	 */
	
	public <T> T getClipNumber(Class<T> c) throws ClassCastException;
	
	public void setClipNumber(Integer value) throws ClassCastException;
	public void setClipNumber(String value) throws ClassCastException;
	/**
	 * The series to which this episode or season belongs.
	 *
	 */
	
	public CreativeWorkSeries getPartOfSeries() throws ClassCastException;
	
	public void setPartOfSeries(CreativeWorkSeries value) throws ClassCastException;
	/**
	 * The episode to which this clip belongs.
	 *
	 */
	
	public Episode getPartOfEpisode() throws ClassCastException;
	
	public void setPartOfEpisode(Episode value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirector() throws ClassCastException;
	
	public void setDirector(Person value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActors() throws ClassCastException;
	
	public void setActors(Person value) throws ClassCastException;
}
