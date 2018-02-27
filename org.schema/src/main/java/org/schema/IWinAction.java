package org.schema;
/**
* The act of achieving victory in a competitive activity.
*/
public interface IWinAction extends IAchieveAction{
	
	
	/**
	 * A sub property of participant. The loser of the action.
	 *
	 */
	
	public Person getLoser() throws ClassCastException;
	
	public void setLoser(Person value) throws ClassCastException;
}
