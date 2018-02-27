package org.schema;
/**
* CreativeWorkSeries dedicated to radio broadcast and associated online delivery.
*/
public class RadioSeries extends CreativeWorkSeries{
	
	
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
	* A season in a media series.
	 *
	 * Ranges: CreativeWorkSeason
	 */
	private CreativeWorkSeason _seasons;
	
	public CreativeWorkSeason getSeasons() throws ClassCastException{
		return (CreativeWorkSeason) _seasons;
	}
	
	public void setSeasons(CreativeWorkSeason value) throws ClassCastException{
		_seasons = value;
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
	* The number of seasons in this series.
	 *
	 * Ranges: Integer
	 */
	private Integer _numberOfSeasons;
	
	public Integer getNumberOfSeasons() throws ClassCastException{
		return (Integer) _numberOfSeasons;
	}
	
	public void setNumberOfSeasons(Integer value) throws ClassCastException{
		_numberOfSeasons = value;
	}
	/**
	* A season in a media series.
	 *
	 * Ranges: CreativeWorkSeason
	 */
	private CreativeWorkSeason _season;
	
	public CreativeWorkSeason getSeason() throws ClassCastException{
		return (CreativeWorkSeason) _season;
	}
	
	public void setSeason(CreativeWorkSeason value) throws ClassCastException{
		_season = value;
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
	* A season that is part of the media series.
	 *
	 * Ranges: CreativeWorkSeason
	 */
	private CreativeWorkSeason _containsSeason;
	
	public CreativeWorkSeason getContainsSeason() throws ClassCastException{
		return (CreativeWorkSeason) _containsSeason;
	}
	
	public void setContainsSeason(CreativeWorkSeason value) throws ClassCastException{
		_containsSeason = value;
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
}
