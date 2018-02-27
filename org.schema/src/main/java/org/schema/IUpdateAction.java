package org.schema;
/**
* The act of managing by changing/editing the state of the object.
*/
public interface IUpdateAction extends IAction{
	
	
	/**
	 * A sub property of object. The collection target of the action.
	 *
	 */
	
	public Thing getTargetCollection() throws ClassCastException;
	
	public void setTargetCollection(Thing value) throws ClassCastException;
	/**
	 * A sub property of object. The collection target of the action.
	 *
	 */
	
	public Thing getCollection() throws ClassCastException;
	
	public void setCollection(Thing value) throws ClassCastException;
}
