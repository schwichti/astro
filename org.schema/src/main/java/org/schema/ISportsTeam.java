package org.schema;
/**
* Organization: Sports team.
*/
public interface ISportsTeam extends ISportsOrganization{
	
	
	/**
	 * A person that acts in a coaching role for a sports team.
	 *
	 */
	
	public Person getCoach() throws ClassCastException;
	
	public void setCoach(Person value) throws ClassCastException;
	/**
	 * A person that acts as performing member of a sports team; a player as opposed to a coach.
	 *
	 */
	
	public Person getAthlete() throws ClassCastException;
	
	public void setAthlete(Person value) throws ClassCastException;
}
