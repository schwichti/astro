package org.schema;
/**
* The act of participating in exertive activity for the purposes of improving health and fitness.
*/
public interface IExerciseAction extends IPlayAction{
	
	
	/**
	 * The distance travelled, e.g. exercising or travelling.
	 *
	 */
	
	public Distance getDistance() throws ClassCastException;
	
	public void setDistance(Distance value) throws ClassCastException;
	/**
	 * A sub property of location. The original location of the object or the agent before the action.
	 *
	 */
	
	public Place getFromLocation() throws ClassCastException;
	
	public void setFromLocation(Place value) throws ClassCastException;
	/**
	 * A sub property of location. The course where this action was taken.
	 *
	 */
	
	public Place getExerciseCourse() throws ClassCastException;
	
	public void setExerciseCourse(Place value) throws ClassCastException;
	/**
	 * A sub property of participant. The opponent on this action.
	 *
	 */
	
	public Person getOpponent() throws ClassCastException;
	
	public void setOpponent(Person value) throws ClassCastException;
	/**
	 * A sub property of location. The sports event where this action occurred.
	 *
	 */
	
	public SportsEvent getSportsEvent() throws ClassCastException;
	
	public void setSportsEvent(SportsEvent value) throws ClassCastException;
	/**
	 * A sub property of location. The sports activity location where this action occurred.
	 *
	 */
	
	public SportsActivityLocation getSportsActivityLocation() throws ClassCastException;
	
	public void setSportsActivityLocation(SportsActivityLocation value) throws ClassCastException;
	/**
	 * A sub property of location. The final location of the object or the agent after the action.
	 *
	 */
	
	public Place getToLocation() throws ClassCastException;
	
	public void setToLocation(Place value) throws ClassCastException;
	/**
	 * A sub property of participant. The sports team that participated on this action.
	 *
	 */
	
	public SportsTeam getSportsTeam() throws ClassCastException;
	
	public void setSportsTeam(SportsTeam value) throws ClassCastException;
	/**
	 * A sub property of location. The course where this action was taken.
	 *
	 */
	
	public Place getCourse() throws ClassCastException;
	
	public void setCourse(Place value) throws ClassCastException;
}
