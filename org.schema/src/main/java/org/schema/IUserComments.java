package org.schema;
/**
* UserInteraction and its subtypes is an old way of talking about users interacting with pages. It is generally better to use <a class="localLink" href="http://schema.org/Action">Action</a>-based vocabulary, alongside types such as <a class="localLink" href="http://schema.org/Comment">Comment</a>.
*/
public interface IUserComments extends IUserInteraction{
	
	
	/**
	 * Specifies the CreativeWork associated with the UserComment.
	 *
	 */
	
	public CreativeWork getDiscusses() throws ClassCastException;
	
	public void setDiscusses(CreativeWork value) throws ClassCastException;
	/**
	 * The URL at which a reply may be posted to the specified UserComment.
	 *
	 */
	
	public String getReplyToUrl() throws ClassCastException;
	
	public void setReplyToUrl(String value) throws ClassCastException;
	/**
	 * The time at which the UserComment was made.
	 *
	 */
	
	public java.util.Date getCommentTime() throws ClassCastException;
	
	public void setCommentTime(java.util.Date value) throws ClassCastException;
	/**
	 * The text of the UserComment.
	 *
	 */
	
	public String getCommentText() throws ClassCastException;
	
	public void setCommentText(String value) throws ClassCastException;
	/**
	 * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
	 *
	 */
	
	public <T> T getCreator(Class<T> c) throws ClassCastException;
	
	public void setCreator(Person value) throws ClassCastException;
	public void setCreator(Organization value) throws ClassCastException;
}
