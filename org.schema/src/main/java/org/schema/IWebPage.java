package org.schema;
/**
* A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
*/
public interface IWebPage extends ICreativeWork{
	
	
	/**
	 * A link related to this web page, for example to other related web pages.
	 *
	 */
	
	public String getRelatedLink() throws ClassCastException;
	
	public void setRelatedLink(String value) throws ClassCastException;
	/**
	 * A set of links that can help a user understand and navigate a website hierarchy.
	 *
	 */
	
	public <T> T getBreadcrumb(Class<T> c) throws ClassCastException;
	
	public void setBreadcrumb(BreadcrumbList value) throws ClassCastException;
	public void setBreadcrumb(String value) throws ClassCastException;
	/**
	 * Indicates the main image on the page.
	 *
	 */
	
	public ImageObject getPrimaryImageOfPage() throws ClassCastException;
	
	public void setPrimaryImageOfPage(ImageObject value) throws ClassCastException;
	/**
	 * Date on which the content on this web page was last reviewed for accuracy and/or completeness.
	 *
	 */
	
	public java.util.Date getLastReviewed() throws ClassCastException;
	
	public void setLastReviewed(java.util.Date value) throws ClassCastException;
	/**
	 * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
	 *
	 */
	
	public <T> T getReviewedBy(Class<T> c) throws ClassCastException;
	
	public void setReviewedBy(Person value) throws ClassCastException;
	public void setReviewedBy(Organization value) throws ClassCastException;
	/**
	 * One of the domain specialities to which this web page's content applies.
	 *
	 */
	
	public Specialty getSpecialty() throws ClassCastException;
	
	public void setSpecialty(Specialty value) throws ClassCastException;
	/**
	 * The most significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
	 *
	 */
	
	public String getSignificantLinks() throws ClassCastException;
	
	public void setSignificantLinks(String value) throws ClassCastException;
	/**
	 * One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
	 *
	 */
	
	public String getSignificantLink() throws ClassCastException;
	
	public void setSignificantLink(String value) throws ClassCastException;
	/**
	 * Indicates if this web page element is the main subject of the page.
	 *
	 */
	
	public WebPageElement getMainContentOfPage() throws ClassCastException;
	
	public void setMainContentOfPage(WebPageElement value) throws ClassCastException;
}
