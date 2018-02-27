package org.schema;
/**
* Event type: Sports event.
*/
public class SportsEvent extends Event{
	
	
	/**
	* A competitor in a sports event.
	 *
	 * Ranges: Person, SportsTeam
	 */
	private Object _competitor;
	
	public <T> T getCompetitor(Class<T> c) throws ClassCastException{
		return (T) _competitor;
	}
	
	public void setCompetitor(Person value) throws ClassCastException{
		_competitor = value;
	}
	public void setCompetitor(SportsTeam value) throws ClassCastException{
		_competitor = value;
	}
	/**
	* The home team in a sports event.
	 *
	 * Ranges: Person, SportsTeam
	 */
	private Object _homeTeam;
	
	public <T> T getHomeTeam(Class<T> c) throws ClassCastException{
		return (T) _homeTeam;
	}
	
	public void setHomeTeam(Person value) throws ClassCastException{
		_homeTeam = value;
	}
	public void setHomeTeam(SportsTeam value) throws ClassCastException{
		_homeTeam = value;
	}
	/**
	* The away team in a sports event.
	 *
	 * Ranges: Person, SportsTeam
	 */
	private Object _awayTeam;
	
	public <T> T getAwayTeam(Class<T> c) throws ClassCastException{
		return (T) _awayTeam;
	}
	
	public void setAwayTeam(Person value) throws ClassCastException{
		_awayTeam = value;
	}
	public void setAwayTeam(SportsTeam value) throws ClassCastException{
		_awayTeam = value;
	}
}
