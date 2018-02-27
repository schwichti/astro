package org.schema;
/**
* A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.
*/
public interface ILocalBusiness extends IPlace, IOrganization{
	
	
	/**
	 * <p>The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.</p>
	 
	 <ul>
	 <li>Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.</li>
	 <li>Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>. </li>
	 <li>Here is an example: <code>&lt;time itemprop="openingHours" datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>.</li>
	 <li>If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.</li>
	 </ul>
	 *
	 */
	
	public String getOpeningHours() throws ClassCastException;
	
	public void setOpeningHours(String value) throws ClassCastException;
	/**
	 * The currency accepted (in <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 currency format</a>).
	 *
	 */
	
	public String getCurrenciesAccepted() throws ClassCastException;
	
	public void setCurrenciesAccepted(String value) throws ClassCastException;
	/**
	 * The price range of the business, for example <code>$$$</code>.
	 *
	 */
	
	public String getPriceRange() throws ClassCastException;
	
	public void setPriceRange(String value) throws ClassCastException;
	/**
	 * Cash, credit card, etc.
	 *
	 */
	
	public String getPaymentAccepted() throws ClassCastException;
	
	public void setPaymentAccepted(String value) throws ClassCastException;
	/**
	 * The larger organization that this local business is a branch of, if any. Not to be confused with (anatomical)<a class="localLink" href="http://schema.org/branch">branch</a>.
	 *
	 */
	
	public Organization getBranchOf() throws ClassCastException;
	
	public void setBranchOf(Organization value) throws ClassCastException;
}
