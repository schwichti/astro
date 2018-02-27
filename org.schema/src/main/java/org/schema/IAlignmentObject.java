package org.schema;
/**
* An intangible item that describes an alignment between a learning resource and a node in an educational framework.
*/
public interface IAlignmentObject extends IIntangible{
	
	
	/**
	 * The name of a node in an established educational framework.
	 *
	 */
	
	public String getTargetName() throws ClassCastException;
	
	public void setTargetName(String value) throws ClassCastException;
	/**
	 * The URL of a node in an established educational framework.
	 *
	 */
	
	public String getTargetUrl() throws ClassCastException;
	
	public void setTargetUrl(String value) throws ClassCastException;
	/**
	 * The framework to which the resource being described is aligned.
	 *
	 */
	
	public String getEducationalFramework() throws ClassCastException;
	
	public void setEducationalFramework(String value) throws ClassCastException;
	/**
	 * The description of a node in an established educational framework.
	 *
	 */
	
	public String getTargetDescription() throws ClassCastException;
	
	public void setTargetDescription(String value) throws ClassCastException;
	/**
	 * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationalLevel'.
	 *
	 */
	
	public String getAlignmentType() throws ClassCastException;
	
	public void setAlignmentType(String value) throws ClassCastException;
}
