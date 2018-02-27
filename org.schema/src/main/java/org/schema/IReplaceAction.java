package org.schema;
/**
* The act of editing a recipient by replacing an old object with a new object.
*/
public interface IReplaceAction extends IUpdateAction{
	
	
	/**
	 * A sub property of object. The object that replaces.
	 *
	 */
	
	public Thing getReplacer() throws ClassCastException;
	
	public void setReplacer(Thing value) throws ClassCastException;
	/**
	 * A sub property of object. The object that is being replaced.
	 *
	 */
	
	public Thing getReplacee() throws ClassCastException;
	
	public void setReplacee(Thing value) throws ClassCastException;
}
