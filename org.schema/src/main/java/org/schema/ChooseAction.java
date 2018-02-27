package org.schema;
/**
* The act of expressing a preference from a set of options or a large or unbounded set of choices/options.
*/
public class ChooseAction extends AssessAction{
	
	
	/**
	* A sub property of object. The options subject to this action.
	 *
	 * Ranges: Text, Thing
	 */
	private Object _option;
	
	public <T> T getOption(Class<T> c) throws ClassCastException{
		return (T) _option;
	}
	
	public void setOption(String value) throws ClassCastException{
		_option = value;
	}
	public void setOption(Thing value) throws ClassCastException{
		_option = value;
	}
	/**
	* A sub property of object. The options subject to this action.
	 *
	 * Ranges: Thing, Text
	 */
	private Object _actionOption;
	
	public <T> T getActionOption(Class<T> c) throws ClassCastException{
		return (T) _actionOption;
	}
	
	public void setActionOption(Thing value) throws ClassCastException{
		_actionOption = value;
	}
	public void setActionOption(String value) throws ClassCastException{
		_actionOption = value;
	}
}
