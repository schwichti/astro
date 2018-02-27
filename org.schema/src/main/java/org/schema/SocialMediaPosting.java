package org.schema;
/**
* A post to a social media platform, including blog posts, tweets, Facebook posts, etc.
*/
public class SocialMediaPosting extends Article{
	
	
	/**
	* A CreativeWork such as an image, video, or audio clip shared as part of this posting.
	 *
	 * Ranges: CreativeWork
	 */
	private CreativeWork _sharedContent;
	
	public CreativeWork getSharedContent() throws ClassCastException{
		return (CreativeWork) _sharedContent;
	}
	
	public void setSharedContent(CreativeWork value) throws ClassCastException{
		_sharedContent = value;
	}
}
