package org.schema;
/**
* A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates.
*/
public class LiveBlogPosting extends BlogPosting{
	
	
	/**
	* The time when the live blog will begin covering the Event. Note that coverage may begin before the Event's start time. The LiveBlogPosting may also be created before coverage begins.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _coverageStartTime;
	
	public java.util.Date getCoverageStartTime() throws ClassCastException{
		return (java.util.Date) _coverageStartTime;
	}
	
	public void setCoverageStartTime(java.util.Date value) throws ClassCastException{
		_coverageStartTime = value;
	}
	/**
	* The time when the live blog will stop covering the Event. Note that coverage may continue after the Event concludes.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _coverageEndTime;
	
	public java.util.Date getCoverageEndTime() throws ClassCastException{
		return (java.util.Date) _coverageEndTime;
	}
	
	public void setCoverageEndTime(java.util.Date value) throws ClassCastException{
		_coverageEndTime = value;
	}
	/**
	* An update to the LiveBlog.
	 *
	 * Ranges: BlogPosting
	 */
	private BlogPosting _liveBlogUpdate;
	
	public BlogPosting getLiveBlogUpdate() throws ClassCastException{
		return (BlogPosting) _liveBlogUpdate;
	}
	
	public void setLiveBlogUpdate(BlogPosting value) throws ClassCastException{
		_liveBlogUpdate = value;
	}
}
