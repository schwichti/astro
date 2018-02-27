package org.schema;
/**
* A NewsArticle is an article whose content reports news, or provides background context and supporting materials for understanding the news.</p>

<p>A more detailed overview of <a href="/docs/news.html">schema.org News markup</a> is also available.
*/
public interface INewsArticle extends IArticle{
	
	
	/**
	 * A <a href="https://en.wikipedia.org/wiki/Dateline">dateline</a> is a brief piece of text included in news articles that describes where and when the story was written or filed though the date is often omitted. Sometimes only a placename is provided.
	 *
	 */
	
	public String getDateline() throws ClassCastException;
	
	public void setDateline(String value) throws ClassCastException;
	/**
	 * If this NewsArticle appears in print, this field indicates the print section in which the article appeared.
	 *
	 */
	
	public String getPrintSection() throws ClassCastException;
	
	public void setPrintSection(String value) throws ClassCastException;
	/**
	 * If this NewsArticle appears in print, this field indicates the name of the page on which the article is found. Please note that this field is intended for the exact page name (e.g. A5, B18).
	 *
	 */
	
	public String getPrintPage() throws ClassCastException;
	
	public void setPrintPage(String value) throws ClassCastException;
	/**
	 * The number of the column in which the NewsArticle appears in the print edition.
	 *
	 */
	
	public String getPrintColumn() throws ClassCastException;
	
	public void setPrintColumn(String value) throws ClassCastException;
	/**
	 * The edition of the print product in which the NewsArticle appears.
	 *
	 */
	
	public String getPrintEdition() throws ClassCastException;
	
	public void setPrintEdition(String value) throws ClassCastException;
}
