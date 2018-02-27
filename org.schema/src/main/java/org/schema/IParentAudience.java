package org.schema;
/**
* A set of characteristics describing parents, who can be interested in viewing some content.
*/
public interface IParentAudience extends IPeopleAudience{
	
	
	/**
	 * Minimal age of the child.
	 *
	 */
	
	public Float getChildMinAge() throws ClassCastException;
	
	public void setChildMinAge(Float value) throws ClassCastException;
	/**
	 * Maximal age of the child.
	 *
	 */
	
	public Float getChildMaxAge() throws ClassCastException;
	
	public void setChildMaxAge(Float value) throws ClassCastException;
}
