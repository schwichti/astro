package org.schema;
/**
* A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the <a class="localLink" href="http://schema.org/text">text</a> property, and its topic via <a class="localLink" href="http://schema.org/about">about</a>, properties shared with all CreativeWorks.
*/
public interface IComment extends ICreativeWork{
	
	
	/**
	 * The parent of a question, answer or item in general.
	 *
	 */
	
	public Question getParentItem() throws ClassCastException;
	
	public void setParentItem(Question value) throws ClassCastException;
	/**
	 * The number of upvotes this question, answer or comment has received from the community.
	 *
	 */
	
	public Integer getUpvoteCount() throws ClassCastException;
	
	public void setUpvoteCount(Integer value) throws ClassCastException;
	/**
	 * The number of downvotes this question, answer or comment has received from the community.
	 *
	 */
	
	public Integer getDownvoteCount() throws ClassCastException;
	
	public void setDownvoteCount(Integer value) throws ClassCastException;
}
