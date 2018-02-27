package org.schema;
/**
* An intangible item that describes an alignment between a learning resource and a node in an educational framework.
*/
public class AlignmentObject extends Intangible{
	
	
	/**
	* The name of a node in an established educational framework.
	 *
	 * Ranges: Text
	 */
	private String _targetName;
	
	public String getTargetName() throws ClassCastException{
		return (String) _targetName;
	}
	
	public void setTargetName(String value) throws ClassCastException{
		_targetName = value;
	}
	/**
	* The URL of a node in an established educational framework.
	 *
	 * Ranges: URL
	 */
	private String _targetUrl;
	
	public String getTargetUrl() throws ClassCastException{
		return (String) _targetUrl;
	}
	
	public void setTargetUrl(String value) throws ClassCastException{
		_targetUrl = value;
	}
	/**
	* The framework to which the resource being described is aligned.
	 *
	 * Ranges: Text
	 */
	private String _educationalFramework;
	
	public String getEducationalFramework() throws ClassCastException{
		return (String) _educationalFramework;
	}
	
	public void setEducationalFramework(String value) throws ClassCastException{
		_educationalFramework = value;
	}
	/**
	* The description of a node in an established educational framework.
	 *
	 * Ranges: Text
	 */
	private String _targetDescription;
	
	public String getTargetDescription() throws ClassCastException{
		return (String) _targetDescription;
	}
	
	public void setTargetDescription(String value) throws ClassCastException{
		_targetDescription = value;
	}
	/**
	* A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationalLevel'.
	 *
	 * Ranges: Text
	 */
	private String _alignmentType;
	
	public String getAlignmentType() throws ClassCastException{
		return (String) _alignmentType;
	}
	
	public void setAlignmentType(String value) throws ClassCastException{
		_alignmentType = value;
	}
}
