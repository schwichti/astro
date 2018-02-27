package org.schema;
/**
* <p>A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.</p>

<pre><code>  &lt;br/&gt;&lt;br/&gt;See also &lt;a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html"&gt;blog post&lt;/a&gt;.
</code></pre>
*/
public class PublicationVolume extends CreativeWork{
	
	
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
	* Identifies the volume of publication or multi-part work; for example, "iii" or "2".
	 *
	 * Ranges: Integer, Text
	 */
	private Object _volumeNumber;
	
	public <T> T getVolumeNumber(Class<T> c) throws ClassCastException{
		return (T) _volumeNumber;
	}
	
	public void setVolumeNumber(Integer value) throws ClassCastException{
		_volumeNumber = value;
	}
	public void setVolumeNumber(String value) throws ClassCastException{
		_volumeNumber = value;
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
