package org.schema;
/**
* A media episode (e.g. TV, radio, video game) which can be part of a series or season.
*/
public interface IEpisode extends ICreativeWork{
	
	
	/**
	 * Position of the episode within an ordered group of episodes.
	 *
	 */
	
	public <T> T getEpisodeNumber(Class<T> c) throws ClassCastException;
	
	public void setEpisodeNumber(String value) throws ClassCastException;
	public void setEpisodeNumber(Integer value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActors() throws ClassCastException;
	
	public void setActors(Person value) throws ClassCastException;
	/**
	 * The season to which this episode belongs.
	 *
	 */
	
	public CreativeWorkSeason getPartOfSeason() throws ClassCastException;
	
	public void setPartOfSeason(CreativeWorkSeason value) throws ClassCastException;
	/**
	 * The trailer of a movie or tv/radio series, season, episode, etc.
	 *
	 */
	
	public VideoObject getTrailer() throws ClassCastException;
	
	public void setTrailer(VideoObject value) throws ClassCastException;
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
	 * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirectors() throws ClassCastException;
	
	public void setDirectors(Person value) throws ClassCastException;
	/**
	 * The production company or studio responsible for the item e.g. series, video game, episode etc.
	 *
	 */
	
	public Organization getProductionCompany() throws ClassCastException;
	
	public void setProductionCompany(Organization value) throws ClassCastException;
	/**
	 * The series to which this episode or season belongs.
	 *
	 */
	
	public CreativeWorkSeries getPartOfSeries() throws ClassCastException;
	
	public void setPartOfSeries(CreativeWorkSeries value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActor() throws ClassCastException;
	
	public void setActor(Person value) throws ClassCastException;
}
