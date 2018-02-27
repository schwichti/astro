package org.schema;
/**
* <p>A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.</p>

<pre><code>  &lt;br/&gt;&lt;br/&gt;See also &lt;a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html"&gt;blog post&lt;/a&gt;.
</code></pre>
*/
public interface IPublicationVolume extends ICreativeWork{
	
	
	/**
	 * The page on which the work ends; for example "138" or "xvi".
	 *
	 */
	
	public <T> T getPageEnd(Class<T> c) throws ClassCastException;
	
	public void setPageEnd(Integer value) throws ClassCastException;
	public void setPageEnd(String value) throws ClassCastException;
	/**
	 * Identifies the volume of publication or multi-part work; for example, "iii" or "2".
	 *
	 */
	
	public <T> T getVolumeNumber(Class<T> c) throws ClassCastException;
	
	public void setVolumeNumber(Integer value) throws ClassCastException;
	public void setVolumeNumber(String value) throws ClassCastException;
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
