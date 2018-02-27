package org.schema;
/**
* A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
*/
public class WebPage extends CreativeWork{
	
	
	/**
	* A link related to this web page, for example to other related web pages.
	 *
	 * Ranges: URL
	 */
	private String _relatedLink;
	
	public String getRelatedLink() throws ClassCastException{
		return (String) _relatedLink;
	}
	
	public void setRelatedLink(String value) throws ClassCastException{
		_relatedLink = value;
	}
	/**
	* A set of links that can help a user understand and navigate a website hierarchy.
	 *
	 * Ranges: BreadcrumbList, Text
	 */
	private Object _breadcrumb;
	
	public <T> T getBreadcrumb(Class<T> c) throws ClassCastException{
		return (T) _breadcrumb;
	}
	
	public void setBreadcrumb(BreadcrumbList value) throws ClassCastException{
		_breadcrumb = value;
	}
	public void setBreadcrumb(String value) throws ClassCastException{
		_breadcrumb = value;
	}
	/**
	* Indicates the main image on the page.
	 *
	 * Ranges: ImageObject
	 */
	private ImageObject _primaryImageOfPage;
	
	public ImageObject getPrimaryImageOfPage() throws ClassCastException{
		return (ImageObject) _primaryImageOfPage;
	}
	
	public void setPrimaryImageOfPage(ImageObject value) throws ClassCastException{
		_primaryImageOfPage = value;
	}
	/**
	* Date on which the content on this web page was last reviewed for accuracy and/or completeness.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _lastReviewed;
	
	public java.util.Date getLastReviewed() throws ClassCastException{
		return (java.util.Date) _lastReviewed;
	}
	
	public void setLastReviewed(java.util.Date value) throws ClassCastException{
		_lastReviewed = value;
	}
	/**
	* People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _reviewedBy;
	
	public <T> T getReviewedBy(Class<T> c) throws ClassCastException{
		return (T) _reviewedBy;
	}
	
	public void setReviewedBy(Person value) throws ClassCastException{
		_reviewedBy = value;
	}
	public void setReviewedBy(Organization value) throws ClassCastException{
		_reviewedBy = value;
	}
	/**
	* One of the domain specialities to which this web page's content applies.
	 *
	 * Ranges: Specialty
	 */
	private Specialty _specialty;
	
	public Specialty getSpecialty() throws ClassCastException{
		return (Specialty) _specialty;
	}
	
	public void setSpecialty(Specialty value) throws ClassCastException{
		_specialty = value;
	}
	/**
	* The most significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
	 *
	 * Ranges: URL
	 */
	private String _significantLinks;
	
	public String getSignificantLinks() throws ClassCastException{
		return (String) _significantLinks;
	}
	
	public void setSignificantLinks(String value) throws ClassCastException{
		_significantLinks = value;
	}
	/**
	* One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
	 *
	 * Ranges: URL
	 */
	private String _significantLink;
	
	public String getSignificantLink() throws ClassCastException{
		return (String) _significantLink;
	}
	
	public void setSignificantLink(String value) throws ClassCastException{
		_significantLink = value;
	}
	/**
	* Indicates if this web page element is the main subject of the page.
	 *
	 * Ranges: WebPageElement
	 */
	private WebPageElement _mainContentOfPage;
	
	public WebPageElement getMainContentOfPage() throws ClassCastException{
		return (WebPageElement) _mainContentOfPage;
	}
	
	public void setMainContentOfPage(WebPageElement value) throws ClassCastException{
		_mainContentOfPage = value;
	}
}
