package org.schema;
/**
* A media episode (e.g. TV, radio, video game) which can be part of a series or season.
*/
public class Episode extends CreativeWork{
	
	
	/**
	* Position of the episode within an ordered group of episodes.
	 *
	 * Ranges: Text, Integer
	 */
	private Object _episodeNumber;
	
	public <T> T getEpisodeNumber(Class<T> c) throws ClassCastException{
		return (T) _episodeNumber;
	}
	
	public void setEpisodeNumber(String value) throws ClassCastException{
		_episodeNumber = value;
	}
	public void setEpisodeNumber(Integer value) throws ClassCastException{
		_episodeNumber = value;
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
	* The season to which this episode belongs.
	 *
	 * Ranges: CreativeWorkSeason
	 */
	private CreativeWorkSeason _partOfSeason;
	
	public CreativeWorkSeason getPartOfSeason() throws ClassCastException{
		return (CreativeWorkSeason) _partOfSeason;
	}
	
	public void setPartOfSeason(CreativeWorkSeason value) throws ClassCastException{
		_partOfSeason = value;
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
}
