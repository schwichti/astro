package org.schema;
/**
* An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.</p>

<p>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
*/
public class Article extends CreativeWork{
	
	
	/**
	* The actual body of the article.
	 *
	 * Ranges: Text
	 */
	private String _articleBody;
	
	public String getArticleBody() throws ClassCastException{
		return (String) _articleBody;
	}
	
	public void setArticleBody(String value) throws ClassCastException{
		_articleBody = value;
	}
	/**
	* Articles may belong to one or more 'sections' in a magazine or newspaper, such as Sports, Lifestyle, etc.
	 *
	 * Ranges: Text
	 */
	private String _articleSection;
	
	public String getArticleSection() throws ClassCastException{
		return (String) _articleSection;
	}
	
	public void setArticleSection(String value) throws ClassCastException{
		_articleSection = value;
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
	* The number of words in the text of the Article.
	 *
	 * Ranges: Integer
	 */
	private Integer _wordCount;
	
	public Integer getWordCount() throws ClassCastException{
		return (Integer) _wordCount;
	}
	
	public void setWordCount(Integer value) throws ClassCastException{
		_wordCount = value;
	}
}
