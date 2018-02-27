package org.schema;
/**
* A set of characteristics describing parents, who can be interested in viewing some content.
*/
public class ParentAudience extends PeopleAudience{
	
	
	/**
	* Minimal age of the child.
	 *
	 * Ranges: Number
	 */
	private Float _childMinAge;
	
	public Float getChildMinAge() throws ClassCastException{
		return (Float) _childMinAge;
	}
	
	public void setChildMinAge(Float value) throws ClassCastException{
		_childMinAge = value;
	}
	/**
	* Maximal age of the child.
	 *
	 * Ranges: Number
	 */
	private Float _childMaxAge;
	
	public Float getChildMaxAge() throws ClassCastException{
		return (Float) _childMaxAge;
	}
	
	public void setChildMaxAge(Float value) throws ClassCastException{
		_childMaxAge = value;
	}
}
