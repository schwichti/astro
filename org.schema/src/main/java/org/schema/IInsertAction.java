package org.schema;
/**
* The act of adding at a specific location in an ordered collection.
*/
public interface IInsertAction extends IAddAction{
	
	
	/**
	 * A sub property of location. The final location of the object or the agent after the action.
	 *
	 */
	
	public Place getToLocation() throws ClassCastException;
	
	public void setToLocation(Place value) throws ClassCastException;
}
