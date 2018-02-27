package org.schema;
/**
* A media season e.g. tv, radio, video game etc.
*/
public interface ICreativeWorkSeason extends ICreativeWork{
	
	
	/**
	 * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 */
	
	public java.util.Date getStartDate() throws ClassCastException;
	
	public void setStartDate(java.util.Date value) throws ClassCastException;
	/**
	 * The production company or studio responsible for the item e.g. series, video game, episode etc.
	 *
	 */
	
	public Organization getProductionCompany() throws ClassCastException;
	
	public void setProductionCompany(Organization value) throws ClassCastException;
	/**
	 * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
	 *
	 */
	
	public Person getDirector() throws ClassCastException;
	
	public void setDirector(Person value) throws ClassCastException;
	/**
	 * An episode of a TV/radio series or season.
	 *
	 */
	
	public Episode getEpisodes() throws ClassCastException;
	
	public void setEpisodes(Episode value) throws ClassCastException;
	/**
	 * The series to which this episode or season belongs.
	 *
	 */
	
	public CreativeWorkSeries getPartOfSeries() throws ClassCastException;
	
	public void setPartOfSeries(CreativeWorkSeries value) throws ClassCastException;
	/**
	 * Position of the season within an ordered group of seasons.
	 *
	 */
	
	public <T> T getSeasonNumber(Class<T> c) throws ClassCastException;
	
	public void setSeasonNumber(String value) throws ClassCastException;
	public void setSeasonNumber(Integer value) throws ClassCastException;
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
	 * An episode of a tv, radio or game media within a series or season.
	 *
	 */
	
	public Episode getEpisode() throws ClassCastException;
	
	public void setEpisode(Episode value) throws ClassCastException;
	/**
	 * The trailer of a movie or tv/radio series, season, episode, etc.
	 *
	 */
	
	public VideoObject getTrailer() throws ClassCastException;
	
	public void setTrailer(VideoObject value) throws ClassCastException;
	/**
	 * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 */
	
	public java.util.Date getEndDate() throws ClassCastException;
	
	public void setEndDate(java.util.Date value) throws ClassCastException;
}
