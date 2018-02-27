package org.schema;
/**
* Organization: Sports team.
*/
public class SportsTeam extends SportsOrganization{
	
	
	/**
	* A person that acts in a coaching role for a sports team.
	 *
	 * Ranges: Person
	 */
	private Person _coach;
	
	public Person getCoach() throws ClassCastException{
		return (Person) _coach;
	}
	
	public void setCoach(Person value) throws ClassCastException{
		_coach = value;
	}
	/**
	* A person that acts as performing member of a sports team; a player as opposed to a coach.
	 *
	 * Ranges: Person
	 */
	private Person _athlete;
	
	public Person getAthlete() throws ClassCastException{
		return (Person) _athlete;
	}
	
	public void setAthlete(Person value) throws ClassCastException{
		_athlete = value;
	}
}
