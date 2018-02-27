package org.schema;
/**
* A blog.
*/
public class Blog extends CreativeWork{
	
	
	/**
	* A posting that is part of this blog.
	 *
	 * Ranges: BlogPosting
	 */
	private BlogPosting _blogPost;
	
	public BlogPosting getBlogPost() throws ClassCastException{
		return (BlogPosting) _blogPost;
	}
	
	public void setBlogPost(BlogPosting value) throws ClassCastException{
		_blogPost = value;
	}
	/**
	* The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
	 *
	 * Ranges: Text
	 */
	private String _issn;
	
	public String getIssn() throws ClassCastException{
		return (String) _issn;
	}
	
	public void setIssn(String value) throws ClassCastException{
		_issn = value;
	}
	/**
	* The postings that are part of this blog.
	 *
	 * Ranges: BlogPosting
	 */
	private BlogPosting _blogPosts;
	
	public BlogPosting getBlogPosts() throws ClassCastException{
		return (BlogPosting) _blogPosts;
	}
	
	public void setBlogPosts(BlogPosting value) throws ClassCastException{
		_blogPosts = value;
	}
}
