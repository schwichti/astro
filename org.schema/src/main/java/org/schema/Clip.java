package org.schema;
/**
* A short TV or radio program or a segment/part of a program.
*/
public class Clip extends CreativeWork{
	
	
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
	* Position of the clip within an ordered group of clips.
	 *
	 * Ranges: Integer, Text
	 */
	private Object _clipNumber;
	
	public <T> T getClipNumber(Class<T> c) throws ClassCastException{
		return (T) _clipNumber;
	}
	
	public void setClipNumber(Integer value) throws ClassCastException{
		_clipNumber = value;
	}
	public void setClipNumber(String value) throws ClassCastException{
		_clipNumber = value;
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
	* The episode to which this clip belongs.
	 *
	 * Ranges: Episode
	 */
	private Episode _partOfEpisode;
	
	public Episode getPartOfEpisode() throws ClassCastException{
		return (Episode) _partOfEpisode;
	}
	
	public void setPartOfEpisode(Episode value) throws ClassCastException{
		_partOfEpisode = value;
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
}
