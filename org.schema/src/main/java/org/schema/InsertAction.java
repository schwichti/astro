package org.schema;
/**
* The act of adding at a specific location in an ordered collection.
*/
public class InsertAction extends AddAction{
	
	
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
}
