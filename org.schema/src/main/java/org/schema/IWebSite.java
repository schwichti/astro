package org.schema;
/**
* A WebSite is a set of related web pages and other items typically served from a single web domain and accessible via URLs.
*/
public interface IWebSite extends ICreativeWork{
	
	
	/**
	 * The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
	 *
	 */
	
	public String getIssn() throws ClassCastException;
	
	public void setIssn(String value) throws ClassCastException;
}
