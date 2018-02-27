package org.schema;
/**
* A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.
*/
public class WebSite extends CreativeWork{
	
	
	/**
	* The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
	 *
	 * Ranges: Text
	 */
	private String _issn;
	
	public String getIssn() throws ClassCastException{
		return (String) _issn;
	}
	
	public void setIssn(String value) throws ClassCastException{
		_issn = value;
	}
}
