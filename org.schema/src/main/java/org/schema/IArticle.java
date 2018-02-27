package org.schema;
/**
* An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.</p>

<p>See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
*/
public interface IArticle extends ICreativeWork{
	
	
	/**
	 * The actual body of the article.
	 *
	 */
	
	public String getArticleBody() throws ClassCastException;
	
	public void setArticleBody(String value) throws ClassCastException;
	/**
	 * Articles may belong to one or more 'sections' in a magazine or newspaper, such as Sports, Lifestyle, etc.
	 *
	 */
	
	public String getArticleSection() throws ClassCastException;
	
	public void setArticleSection(String value) throws ClassCastException;
	/**
	 * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
	 *
	 */
	
	public String getPagination() throws ClassCastException;
	
	public void setPagination(String value) throws ClassCastException;
	/**
	 * The page on which the work starts; for example "135" or "xiii".
	 *
	 */
	
	public <T> T getPageStart(Class<T> c) throws ClassCastException;
	
	public void setPageStart(Integer value) throws ClassCastException;
	public void setPageStart(String value) throws ClassCastException;
	/**
	 * The page on which the work ends; for example "138" or "xvi".
	 *
	 */
	
	public <T> T getPageEnd(Class<T> c) throws ClassCastException;
	
	public void setPageEnd(Integer value) throws ClassCastException;
	public void setPageEnd(String value) throws ClassCastException;
	/**
	 * The number of words in the text of the Article.
	 *
	 */
	
	public Integer getWordCount() throws ClassCastException;
	
	public void setWordCount(Integer value) throws ClassCastException;
}
