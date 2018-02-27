package org.schema;
/**
* A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
*/
public interface IBusinessAudience extends IAudience{
	
	
	/**
	 * The number of employees in an organization e.g. business.
	 *
	 */
	
	public QuantitativeValue getNumberOfEmployees() throws ClassCastException;
	
	public void setNumberOfEmployees(QuantitativeValue value) throws ClassCastException;
	/**
	 * The age of the business.
	 *
	 */
	
	public QuantitativeValue getYearsInOperation() throws ClassCastException;
	
	public void setYearsInOperation(QuantitativeValue value) throws ClassCastException;
	/**
	 * The size of the business in annual revenue.
	 *
	 */
	
	public QuantitativeValue getYearlyRevenue() throws ClassCastException;
	
	public void setYearlyRevenue(QuantitativeValue value) throws ClassCastException;
}
