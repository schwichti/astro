package org.schema;
/**
* A DatedMoneySpecification represents monetary values with optional start and end dates. For example, this could represent an employee's salary over a specific period of time. <strong>Note:</strong> This type has been superseded by <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a> use of that type is recommended
*/
public class DatedMoneySpecification extends StructuredValue{
	
	
	/**
	* The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 * Ranges: DateTime, Date
	 */
	private java.util.Date _endDate;
	
	public java.util.Date getEndDate() throws ClassCastException{
		return (java.util.Date) _endDate;
	}
	
	public void setEndDate(java.util.Date value) throws ClassCastException{
		_endDate = value;
	}
	/**
	* The currency in which the monetary amount is expressed (in 3-letter <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> format).
	 *
	 * Ranges: Text
	 */
	private String _currency;
	
	public String getCurrency() throws ClassCastException{
		return (String) _currency;
	}
	
	public void setCurrency(String value) throws ClassCastException{
		_currency = value;
	}
	/**
	* The amount of money.
	 *
	 * Ranges: Number, MonetaryAmount
	 */
	private Object _amount;
	
	public <T> T getAmount(Class<T> c) throws ClassCastException{
		return (T) _amount;
	}
	
	public void setAmount(Float value) throws ClassCastException{
		_amount = value;
	}
	public void setAmount(MonetaryAmount value) throws ClassCastException{
		_amount = value;
	}
	/**
	* The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 *
	 * Ranges: Date, DateTime
	 */
	private java.util.Date _startDate;
	
	public java.util.Date getStartDate() throws ClassCastException{
		return (java.util.Date) _startDate;
	}
	
	public void setStartDate(java.util.Date value) throws ClassCastException{
		_startDate = value;
	}
}
