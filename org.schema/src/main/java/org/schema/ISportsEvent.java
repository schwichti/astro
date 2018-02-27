package org.schema;
/**
* Event type: Sports event.
*/
public interface ISportsEvent extends IEvent{
	
	
	/**
	 * A competitor in a sports event.
	 *
	 */
	
	public <T> T getCompetitor(Class<T> c) throws ClassCastException;
	
	public void setCompetitor(Person value) throws ClassCastException;
	public void setCompetitor(SportsTeam value) throws ClassCastException;
	/**
	 * The home team in a sports event.
	 *
	 */
	
	public <T> T getHomeTeam(Class<T> c) throws ClassCastException;
	
	public void setHomeTeam(Person value) throws ClassCastException;
	public void setHomeTeam(SportsTeam value) throws ClassCastException;
	/**
	 * The away team in a sports event.
	 *
	 */
	
	public <T> T getAwayTeam(Class<T> c) throws ClassCastException;
	
	public void setAwayTeam(Person value) throws ClassCastException;
	public void setAwayTeam(SportsTeam value) throws ClassCastException;
}
