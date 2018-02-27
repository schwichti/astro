package org.schema;
/**
* A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates.
*/
public interface ILiveBlogPosting extends IBlogPosting{
	
	
	/**
	 * The time when the live blog will begin covering the Event. Note that coverage may begin before the Event's start time. The LiveBlogPosting may also be created before coverage begins.
	 *
	 */
	
	public java.util.Date getCoverageStartTime() throws ClassCastException;
	
	public void setCoverageStartTime(java.util.Date value) throws ClassCastException;
	/**
	 * The time when the live blog will stop covering the Event. Note that coverage may continue after the Event concludes.
	 *
	 */
	
	public java.util.Date getCoverageEndTime() throws ClassCastException;
	
	public void setCoverageEndTime(java.util.Date value) throws ClassCastException;
	/**
	 * An update to the LiveBlog.
	 *
	 */
	
	public BlogPosting getLiveBlogUpdate() throws ClassCastException;
	
	public void setLiveBlogUpdate(BlogPosting value) throws ClassCastException;
}
