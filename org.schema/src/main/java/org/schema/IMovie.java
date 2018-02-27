package org.schema;
/**
* A movie.
*/
public interface IMovie extends ICreativeWork{
	
	
	/**
	 * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirectors() throws ClassCastException;
	
	public void setDirectors(Person value) throws ClassCastException;
	/**
	 * The composer of the soundtrack.
	 *
	 */
	
	public <T> T getMusicBy(Class<T> c) throws ClassCastException;
	
	public void setMusicBy(MusicGroup value) throws ClassCastException;
	public void setMusicBy(Person value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActors() throws ClassCastException;
	
	public void setActors(Person value) throws ClassCastException;
	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 *
	 */
	
	public Duration getDuration() throws ClassCastException;
	
	public void setDuration(Duration value) throws ClassCastException;
	/**
	 * The production company or studio responsible for the item e.g. series, video game, episode etc.
	 *
	 */
	
	public Organization getProductionCompany() throws ClassCastException;
	
	public void setProductionCompany(Organization value) throws ClassCastException;
	/**
	 * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>.
	 *
	 */
	
	public <T> T getSubtitleLanguage(Class<T> c) throws ClassCastException;
	
	public void setSubtitleLanguage(Language value) throws ClassCastException;
	public void setSubtitleLanguage(String value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirector() throws ClassCastException;
	
	public void setDirector(Person value) throws ClassCastException;
	/**
	 * The country of the principal offices of the production company or individual responsible for the movie or program.
	 *
	 */
	
	public Country getCountryOfOrigin() throws ClassCastException;
	
	public void setCountryOfOrigin(Country value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActor() throws ClassCastException;
	
	public void setActor(Person value) throws ClassCastException;
	/**
	 * The trailer of a movie or tv/radio series, season, episode, etc.
	 *
	 */
	
	public VideoObject getTrailer() throws ClassCastException;
	
	public void setTrailer(VideoObject value) throws ClassCastException;
}
