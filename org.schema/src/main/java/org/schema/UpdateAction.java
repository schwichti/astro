package org.schema;
/**
* The act of managing by changing/editing the state of the object.
*/
public class UpdateAction extends Action{
	
	
	/**
	* A sub property of object. The collection target of the action.
	 *
	 * Ranges: Thing
	 */
	private Thing _targetCollection;
	
	public Thing getTargetCollection() throws ClassCastException{
		return (Thing) _targetCollection;
	}
	
	public void setTargetCollection(Thing value) throws ClassCastException{
		_targetCollection = value;
	}
	/**
	* A sub property of object. The collection target of the action.
	 *
	 * Ranges: Thing
	 */
	private Thing _collection;
	
	public Thing getCollection() throws ClassCastException{
		return (Thing) _collection;
	}
	
	public void setCollection(Thing value) throws ClassCastException{
		_collection = value;
	}
}
