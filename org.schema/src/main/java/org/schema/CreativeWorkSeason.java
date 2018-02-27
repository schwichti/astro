package org.schema;
/**
* A media season e.g. tv, radio, video game etc.
*/
public class CreativeWorkSeason extends CreativeWork{
	
	
	/**
	* The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 * Ranges: Date, DateTime
	 */
	private java.util.Date _startDate;
	
	public java.util.Date getStartDate() throws ClassCastException{
		return (java.util.Date) _startDate;
	}
	
	public void setStartDate(java.util.Date value) throws ClassCastException{
		_startDate = value;
	}
	/**
	* The production company or studio responsible for the item e.g. series, video game, episode etc.
	 *
	 * Ranges: Organization
	 */
	private Organization _productionCompany;
	
	public Organization getProductionCompany() throws ClassCastException{
		return (Organization) _productionCompany;
	}
	
	public void setProductionCompany(Organization value) throws ClassCastException{
		_productionCompany = value;
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
	* An episode of a TV/radio series or season.
	 *
	 * Ranges: Episode
	 */
	private Episode _episodes;
	
	public Episode getEpisodes() throws ClassCastException{
		return (Episode) _episodes;
	}
	
	public void setEpisodes(Episode value) throws ClassCastException{
		_episodes = value;
	}
	/**
	* The series to which this episode or season belongs.
	 *
	 * Ranges: CreativeWorkSeries
	 */
	private CreativeWorkSeries _partOfSeries;
	
	public CreativeWorkSeries getPartOfSeries() throws ClassCastException{
		return (CreativeWorkSeries) _partOfSeries;
	}
	
	public void setPartOfSeries(CreativeWorkSeries value) throws ClassCastException{
		_partOfSeries = value;
	}
	/**
	* Position of the season within an ordered group of seasons.
	 *
	 * Ranges: Text, Integer
	 */
	private Object _seasonNumber;
	
	public <T> T getSeasonNumber(Class<T> c) throws ClassCastException{
		return (T) _seasonNumber;
	}
	
	public void setSeasonNumber(String value) throws ClassCastException{
		_seasonNumber = value;
	}
	public void setSeasonNumber(Integer value) throws ClassCastException{
		_seasonNumber = value;
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
	* The number of episodes in this season or series.
	 *
	 * Ranges: Integer
	 */
	private Integer _numberOfEpisodes;
	
	public Integer getNumberOfEpisodes() throws ClassCastException{
		return (Integer) _numberOfEpisodes;
	}
	
	public void setNumberOfEpisodes(Integer value) throws ClassCastException{
		_numberOfEpisodes = value;
	}
	/**
	* An episode of a tv, radio or game media within a series or season.
	 *
	 * Ranges: Episode
	 */
	private Episode _episode;
	
	public Episode getEpisode() throws ClassCastException{
		return (Episode) _episode;
	}
	
	public void setEpisode(Episode value) throws ClassCastException{
		_episode = value;
	}
	/**
	* The trailer of a movie or tv/radio series, season, episode, etc.
	 *
	 * Ranges: VideoObject
	 */
	private VideoObject _trailer;
	
	public VideoObject getTrailer() throws ClassCastException{
		return (VideoObject) _trailer;
	}
	
	public void setTrailer(VideoObject value) throws ClassCastException{
		_trailer = value;
	}
	/**
	* The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 * Ranges: DateTime, Date
	 */
	private java.util.Date _endDate;
	
	public java.util.Date getEndDate() throws ClassCastException{
		return (java.util.Date) _endDate;
	}
	
	public void setEndDate(java.util.Date value) throws ClassCastException{
		_endDate = value;
	}
}
