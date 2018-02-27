package org.schema;
/**
* A post to a social media platform, including blog posts, tweets, Facebook posts, etc.
*/
public interface ISocialMediaPosting extends IArticle{
	
	
	/**
	 * A CreativeWork such as an image, video, or audio clip shared as part of this posting.
	 *
	 */
	
	public CreativeWork getSharedContent() throws ClassCastException;
	
	public void setSharedContent(CreativeWork value) throws ClassCastException;
}
