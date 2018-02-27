package org.schema;
/**
* The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.
*/
public class TransferAction extends Action{
	
	
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
