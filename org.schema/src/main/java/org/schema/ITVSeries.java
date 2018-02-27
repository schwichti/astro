package org.schema;
/**
* CreativeWorkSeries dedicated to TV broadcast and associated online delivery.
*/
public interface ITVSeries extends ICreativeWork, ICreativeWorkSeries{
	
	
	/**
	 * The production company or studio responsible for the item e.g. series, video game, episode etc.
	 *
	 */
	
	public Organization getProductionCompany() throws ClassCastException;
	
	public void setProductionCompany(Organization value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActor() throws ClassCastException;
	
	public void setActor(Person value) throws ClassCastException;
	/**
	 * The number of episodes in this season or series.
	 *
	 */
	
	public Integer getNumberOfEpisodes() throws ClassCastException;
	
	public void setNumberOfEpisodes(Integer value) throws ClassCastException;
	/**
	 * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getActors() throws ClassCastException;
	
	public void setActors(Person value) throws ClassCastException;
	/**
	 * A season in a media series.
	 *
	 */
	
	public CreativeWorkSeason getSeason() throws ClassCastException;
	
	public void setSeason(CreativeWorkSeason value) throws ClassCastException;
	/**
	 * An episode of a TV/radio series or season.
	 *
	 */
	
	public Episode getEpisodes() throws ClassCastException;
	
	public void setEpisodes(Episode value) throws ClassCastException;
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
	 * The country of the principal offices of the production company or individual responsible for the movie or program.
	 *
	 */
	
	public Country getCountryOfOrigin() throws ClassCastException;
	
	public void setCountryOfOrigin(Country value) throws ClassCastException;
	/**
	 * The trailer of a movie or tv/radio series, season, episode, etc.
	 *
	 */
	
	public VideoObject getTrailer() throws ClassCastException;
	
	public void setTrailer(VideoObject value) throws ClassCastException;
	/**
	 * An episode of a tv, radio or game media within a series or season.
	 *
	 */
	
	public Episode getEpisode() throws ClassCastException;
	
	public void setEpisode(Episode value) throws ClassCastException;
	/**
	 * A season that is part of the media series.
	 *
	 */
	
	public CreativeWorkSeason getContainsSeason() throws ClassCastException;
	
	public void setContainsSeason(CreativeWorkSeason value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirectors() throws ClassCastException;
	
	public void setDirectors(Person value) throws ClassCastException;
	/**
	 * The number of seasons in this series.
	 *
	 */
	
	public Integer getNumberOfSeasons() throws ClassCastException;
	
	public void setNumberOfSeasons(Integer value) throws ClassCastException;
	/**
	 * A season in a media series.
	 *
	 */
	
	public CreativeWorkSeason getSeasons() throws ClassCastException;
	
	public void setSeasons(CreativeWorkSeason value) throws ClassCastException;
}
