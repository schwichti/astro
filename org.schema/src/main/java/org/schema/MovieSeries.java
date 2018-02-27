package org.schema;
/**
* A series of movies. Included movies can be indicated with the hasPart property.
*/
public class MovieSeries extends CreativeWorkSeries{
	
	
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
}
