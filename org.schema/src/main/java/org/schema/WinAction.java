package org.schema;
/**
* The act of achieving victory in a competitive activity.
*/
public class WinAction extends AchieveAction{
	
	
	/**
	* A sub property of participant. The loser of the action.
	 *
	 * Ranges: Person
	 */
	private Person _loser;
	
	public Person getLoser() throws ClassCastException{
		return (Person) _loser;
	}
	
	public void setLoser(Person value) throws ClassCastException{
		_loser = value;
	}
}
