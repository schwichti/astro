package org.schema;
/**
* A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.</p>

<p><a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
*/
public interface IPublicationIssue extends ICreativeWork{
	
	
	/**
	 * The page on which the work ends; for example "138" or "xvi".
	 *
	 */
	
	public <T> T getPageEnd(Class<T> c) throws ClassCastException;
	
	public void setPageEnd(Integer value) throws ClassCastException;
	public void setPageEnd(String value) throws ClassCastException;
	/**
	 * Identifies the issue of publication; for example, "iii" or "2".
	 *
	 */
	
	public <T> T getIssueNumber(Class<T> c) throws ClassCastException;
	
	public void setIssueNumber(Integer value) throws ClassCastException;
	public void setIssueNumber(String value) throws ClassCastException;
	/**
	 * The page on which the work starts; for example "135" or "xiii".
	 *
	 */
	
	public <T> T getPageStart(Class<T> c) throws ClassCastException;
	
	public void setPageStart(Integer value) throws ClassCastException;
	public void setPageStart(String value) throws ClassCastException;
	/**
	 * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
	 *
	 */
	
	public String getPagination() throws ClassCastException;
	
	public void setPagination(String value) throws ClassCastException;
}
