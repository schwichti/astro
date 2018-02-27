package org.schema;
/**
* A blog.
*/
public interface IBlog extends ICreativeWork{
	
	
	/**
	 * A posting that is part of this blog.
	 *
	 */
	
	public BlogPosting getBlogPost() throws ClassCastException;
	
	public void setBlogPost(BlogPosting value) throws ClassCastException;
	/**
	 * The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
	 *
	 */
	
	public String getIssn() throws ClassCastException;
	
	public void setIssn(String value) throws ClassCastException;
	/**
	 * The postings that are part of this blog.
	 *
	 */
	
	public BlogPosting getBlogPosts() throws ClassCastException;
	
	public void setBlogPosts(BlogPosting value) throws ClassCastException;
}
