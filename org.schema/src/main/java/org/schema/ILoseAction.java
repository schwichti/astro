package org.schema;
/**
* The act of being defeated in a competitive activity.
*/
public interface ILoseAction extends IAchieveAction{
	
	
	/**
	 * A sub property of participant. The winner of the action.
	 *
	 */
	
	public Person getWinner() throws ClassCastException;
	
	public void setWinner(Person value) throws ClassCastException;
}
