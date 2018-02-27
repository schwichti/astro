package org.schema;
/**
* A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the <a class="localLink" href="http://schema.org/text">text</a> property, and its topic via <a class="localLink" href="http://schema.org/about">about</a>, properties shared with all CreativeWorks.
*/
public class Comment extends CreativeWork{
	
	
	/**
	* The parent of a question, answer or item in general.
	 *
	 * Ranges: Question
	 */
	private Question _parentItem;
	
	public Question getParentItem() throws ClassCastException{
		return (Question) _parentItem;
	}
	
	public void setParentItem(Question value) throws ClassCastException{
		_parentItem = value;
	}
	/**
	* The number of upvotes this question, answer or comment has received from the community.
	 *
	 * Ranges: Integer
	 */
	private Integer _upvoteCount;
	
	public Integer getUpvoteCount() throws ClassCastException{
		return (Integer) _upvoteCount;
	}
	
	public void setUpvoteCount(Integer value) throws ClassCastException{
		_upvoteCount = value;
	}
	/**
	* The number of downvotes this question, answer or comment has received from the community.
	 *
	 * Ranges: Integer
	 */
	private Integer _downvoteCount;
	
	public Integer getDownvoteCount() throws ClassCastException{
		return (Integer) _downvoteCount;
	}
	
	public void setDownvoteCount(Integer value) throws ClassCastException{
		_downvoteCount = value;
	}
}
