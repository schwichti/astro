package org.schema;
/**
* A NewsArticle is an article whose content reports news, or provides background context and supporting materials for understanding the news.</p>

<p>A more detailed overview of <a href="/docs/news.html">schema.org News markup</a> is also available.
*/
public class NewsArticle extends Article{
	
	
	/**
	* A <a href="https://en.wikipedia.org/wiki/Dateline">dateline</a> is a brief piece of text included in news articles that describes where and when the story was written or filed though the date is often omitted. Sometimes only a placename is provided.
	 *
	 * Ranges: Text
	 */
	private String _dateline;
	
	public String getDateline() throws ClassCastException{
		return (String) _dateline;
	}
	
	public void setDateline(String value) throws ClassCastException{
		_dateline = value;
	}
	/**
	* If this NewsArticle appears in print, this field indicates the print section in which the article appeared.
	 *
	 * Ranges: Text
	 */
	private String _printSection;
	
	public String getPrintSection() throws ClassCastException{
		return (String) _printSection;
	}
	
	public void setPrintSection(String value) throws ClassCastException{
		_printSection = value;
	}
	/**
	* If this NewsArticle appears in print, this field indicates the name of the page on which the article is found. Please note that this field is intended for the exact page name (e.g. A5, B18).
	 *
	 * Ranges: Text
	 */
	private String _printPage;
	
	public String getPrintPage() throws ClassCastException{
		return (String) _printPage;
	}
	
	public void setPrintPage(String value) throws ClassCastException{
		_printPage = value;
	}
	/**
	* The number of the column in which the NewsArticle appears in the print edition.
	 *
	 * Ranges: Text
	 */
	private String _printColumn;
	
	public String getPrintColumn() throws ClassCastException{
		return (String) _printColumn;
	}
	
	public void setPrintColumn(String value) throws ClassCastException{
		_printColumn = value;
	}
	/**
	* The edition of the print product in which the NewsArticle appears.
	 *
	 * Ranges: Text
	 */
	private String _printEdition;
	
	public String getPrintEdition() throws ClassCastException{
		return (String) _printEdition;
	}
	
	public void setPrintEdition(String value) throws ClassCastException{
		_printEdition = value;
	}
}
