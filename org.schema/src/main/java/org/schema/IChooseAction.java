package org.schema;
/**
* The act of expressing a preference from a set of options or a large or unbounded set of choices/options.
*/
public interface IChooseAction extends IAssessAction{
	
	
	/**
	 * A sub property of object. The options subject to this action.
	 *
	 */
	
	public <T> T getOption(Class<T> c) throws ClassCastException;
	
	public void setOption(String value) throws ClassCastException;
	public void setOption(Thing value) throws ClassCastException;
	/**
	 * A sub property of object. The options subject to this action.
	 *
	 */
	
	public <T> T getActionOption(Class<T> c) throws ClassCastException;
	
	public void setActionOption(Thing value) throws ClassCastException;
	public void setActionOption(String value) throws ClassCastException;
}
