package org.schema;
/**
* UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use <a class="localLink" href="http://schema.org/Action">Action</a>-based vocabulary, alongside types such as <a class="localLink" href="http://schema.org/Comment">Comment</a>.
*/
public class UserComments extends UserInteraction{
	
	
	/**
	* Specifies the CreativeWork associated with the UserComment.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _discusses;
	
	public CreativeWork getDiscusses() throws ClassCastException{
		return (CreativeWork) _discusses;
	}
	
	public void setDiscusses(CreativeWork value) throws ClassCastException{
		_discusses = value;
	}
	/**
	* The URL at which a reply may be posted to the specified UserComment.
	 *
	 * Ranges: URL
	 */
	private String _replyToUrl;
	
	public String getReplyToUrl() throws ClassCastException{
		return (String) _replyToUrl;
	}
	
	public void setReplyToUrl(String value) throws ClassCastException{
		_replyToUrl = value;
	}
	/**
	* The time at which the UserComment was made.
	 *
	 * Ranges: Date, DateTime
	 */
	private java.util.Date _commentTime;
	
	public java.util.Date getCommentTime() throws ClassCastException{
		return (java.util.Date) _commentTime;
	}
	
	public void setCommentTime(java.util.Date value) throws ClassCastException{
		_commentTime = value;
	}
	/**
	* The text of the UserComment.
	 *
	 * Ranges: Text
	 */
	private String _commentText;
	
	public String getCommentText() throws ClassCastException{
		return (String) _commentText;
	}
	
	public void setCommentText(String value) throws ClassCastException{
		_commentText = value;
	}
	/**
	* The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _creator;
	
	public <T> T getCreator(Class<T> c) throws ClassCastException{
		return (T) _creator;
	}
	
	public void setCreator(Person value) throws ClassCastException{
		_creator = value;
	}
	public void setCreator(Organization value) throws ClassCastException{
		_creator = value;
	}
}
