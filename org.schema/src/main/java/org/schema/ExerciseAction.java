package org.schema;
/**
* The act of participating in exertive activity for the purposes of improving health and fitness.
*/
public class ExerciseAction extends PlayAction{
	
	
	/**
	* The distance travelled, e.g. exercising or travelling.
	 *
	 * Ranges: Distance
	 */
	private Distance _distance;
	
	public Distance getDistance() throws ClassCastException{
		return (Distance) _distance;
	}
	
	public void setDistance(Distance value) throws ClassCastException{
		_distance = value;
	}
	/**
	* A sub property of location. The original location of the object or the agent before the action.
	 *
	 * Ranges: Place
	 */
	private Place _fromLocation;
	
	public Place getFromLocation() throws ClassCastException{
		return (Place) _fromLocation;
	}
	
	public void setFromLocation(Place value) throws ClassCastException{
		_fromLocation = value;
	}
	/**
	* A sub property of location. The course where this action was taken.
	 *
	 * Ranges: Place
	 */
	private Place _exerciseCourse;
	
	public Place getExerciseCourse() throws ClassCastException{
		return (Place) _exerciseCourse;
	}
	
	public void setExerciseCourse(Place value) throws ClassCastException{
		_exerciseCourse = value;
	}
	/**
	* A sub property of participant. The opponent on this action.
	 *
	 * Ranges: Person
	 */
	private Person _opponent;
	
	public Person getOpponent() throws ClassCastException{
		return (Person) _opponent;
	}
	
	public void setOpponent(Person value) throws ClassCastException{
		_opponent = value;
	}
	/**
	* A sub property of location. The sports event where this action occurred.
	 *
	 * Ranges: SportsEvent
	 */
	private SportsEvent _sportsEvent;
	
	public SportsEvent getSportsEvent() throws ClassCastException{
		return (SportsEvent) _sportsEvent;
	}
	
	public void setSportsEvent(SportsEvent value) throws ClassCastException{
		_sportsEvent = value;
	}
	/**
	* A sub property of location. The sports activity location where this action occurred.
	 *
	 * Ranges: SportsActivityLocation
	 */
	private SportsActivityLocation _sportsActivityLocation;
	
	public SportsActivityLocation getSportsActivityLocation() throws ClassCastException{
		return (SportsActivityLocation) _sportsActivityLocation;
	}
	
	public void setSportsActivityLocation(SportsActivityLocation value) throws ClassCastException{
		_sportsActivityLocation = value;
	}
	/**
	* A sub property of location. The final location of the object or the agent after the action.
	 *
	 * Ranges: Place
	 */
	private Place _toLocation;
	
	public Place getToLocation() throws ClassCastException{
		return (Place) _toLocation;
	}
	
	public void setToLocation(Place value) throws ClassCastException{
		_toLocation = value;
	}
	/**
	* A sub property of participant. The sports team that participated on this action.
	 *
	 * Ranges: SportsTeam
	 */
	private SportsTeam _sportsTeam;
	
	public SportsTeam getSportsTeam() throws ClassCastException{
		return (SportsTeam) _sportsTeam;
	}
	
	public void setSportsTeam(SportsTeam value) throws ClassCastException{
		_sportsTeam = value;
	}
	/**
	* A sub property of location. The course where this action was taken.
	 *
	 * Ranges: Place
	 */
	private Place _course;
	
	public Place getCourse() throws ClassCastException{
		return (Place) _course;
	}
	
	public void setCourse(Place value) throws ClassCastException{
		_course = value;
	}
}
