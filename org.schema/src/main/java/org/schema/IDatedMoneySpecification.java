package org.schema;
/**
* A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time. <strong>Note:</strong> This type has been superseded by <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a> use of that type is recommended
*/
public interface IDatedMoneySpecification extends IStructuredValue{
	
	
	/**
	 * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 */
	
	public java.util.Date getEndDate() throws ClassCastException;
	
	public void setEndDate(java.util.Date value) throws ClassCastException;
	/**
	 * The currency in which the monetary amount is expressed (in 3-letter <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> format).
	 *
	 */
	
	public String getCurrency() throws ClassCastException;
	
	public void setCurrency(String value) throws ClassCastException;
	/**
	 * The amount of money.
	 *
	 */
	
	public <T> T getAmount(Class<T> c) throws ClassCastException;
	
	public void setAmount(Float value) throws ClassCastException;
	public void setAmount(MonetaryAmount value) throws ClassCastException;
	/**
	 * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 */
	
	public java.util.Date getStartDate() throws ClassCastException;
	
	public void setStartDate(java.util.Date value) throws ClassCastException;
}
