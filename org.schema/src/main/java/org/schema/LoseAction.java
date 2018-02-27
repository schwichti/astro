package org.schema;
/**
* The act of being defeated in a competitive activity.
*/
public class LoseAction extends AchieveAction{
	
	
	/**
	* A sub property of participant. The winner of the action.
	 *
	 * Ranges: Person
	 */
	private Person _winner;
	
	public Person getWinner() throws ClassCastException{
		return (Person) _winner;
	}
	
	public void setWinner(Person value) throws ClassCastException{
		_winner = value;
	}
}
