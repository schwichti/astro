package org.schema;
/**
* A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.</p>

<p><a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
*/
public class PublicationIssue extends CreativeWork{
	
	
	/**
	* The page on which the work ends; for example "138" or "xvi".
	 *
	 * Ranges: Integer, Text
	 */
	private Object _pageEnd;
	
	public <T> T getPageEnd(Class<T> c) throws ClassCastException{
		return (T) _pageEnd;
	}
	
	public void setPageEnd(Integer value) throws ClassCastException{
		_pageEnd = value;
	}
	public void setPageEnd(String value) throws ClassCastException{
		_pageEnd = value;
	}
	/**
	* Identifies the issue of publication; for example, "iii" or "2".
	 *
	 * Ranges: Integer, Text
	 */
	private Object _issueNumber;
	
	public <T> T getIssueNumber(Class<T> c) throws ClassCastException{
		return (T) _issueNumber;
	}
	
	public void setIssueNumber(Integer value) throws ClassCastException{
		_issueNumber = value;
	}
	public void setIssueNumber(String value) throws ClassCastException{
		_issueNumber = value;
	}
	/**
	* The page on which the work starts; for example "135" or "xiii".
	 *
	 * Ranges: Integer, Text
	 */
	private Object _pageStart;
	
	public <T> T getPageStart(Class<T> c) throws ClassCastException{
		return (T) _pageStart;
	}
	
	public void setPageStart(Integer value) throws ClassCastException{
		_pageStart = value;
	}
	public void setPageStart(String value) throws ClassCastException{
		_pageStart = value;
	}
	/**
	* Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
	 *
	 * Ranges: Text
	 */
	private String _pagination;
	
	public String getPagination() throws ClassCastException{
		return (String) _pagination;
	}
	
	public void setPagination(String value) throws ClassCastException{
		_pagination = value;
	}
}
