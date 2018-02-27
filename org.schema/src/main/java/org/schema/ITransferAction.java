package org.schema;
/**
* The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.
*/
public interface ITransferAction extends IAction{
	
	
	/**
	 * A sub property of location. The original location of the object or the agent before the action.
	 *
	 */
	
	public Place getFromLocation() throws ClassCastException;
	
	public void setFromLocation(Place value) throws ClassCastException;
	/**
	 * A sub property of location. The final location of the object or the agent after the action.
	 *
	 */
	
	public Place getToLocation() throws ClassCastException;
	
	public void setToLocation(Place value) throws ClassCastException;
}
