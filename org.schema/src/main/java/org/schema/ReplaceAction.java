package org.schema;
/**
* The act of editing a recipient by replacing an old object with a new object.
*/
public class ReplaceAction extends UpdateAction{
	
	
	/**
	* A sub property of object. The object that replaces.
	 *
	 * Ranges: Thing
	 */
	private Thing _replacer;
	
	public Thing getReplacer() throws ClassCastException{
		return (Thing) _replacer;
	}
	
	public void setReplacer(Thing value) throws ClassCastException{
		_replacer = value;
	}
	/**
	* A sub property of object. The object that is being replaced.
	 *
	 * Ranges: Thing
	 */
	private Thing _replacee;
	
	public Thing getReplacee() throws ClassCastException{
		return (Thing) _replacee;
	}
	
	public void setReplacee(Thing value) throws ClassCastException{
		_replacee = value;
	}
}
