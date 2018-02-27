package org.schema;
/**
* A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
*/
public class BusinessAudience extends Audience{
	
	
	/**
	* The number of employees in an organization e.g. business.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _numberOfEmployees;
	
	public QuantitativeValue getNumberOfEmployees() throws ClassCastException{
		return (QuantitativeValue) _numberOfEmployees;
	}
	
	public void setNumberOfEmployees(QuantitativeValue value) throws ClassCastException{
		_numberOfEmployees = value;
	}
	/**
	* The age of the business.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _yearsInOperation;
	
	public QuantitativeValue getYearsInOperation() throws ClassCastException{
		return (QuantitativeValue) _yearsInOperation;
	}
	
	public void setYearsInOperation(QuantitativeValue value) throws ClassCastException{
		_yearsInOperation = value;
	}
	/**
	* The size of the business in annual revenue.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _yearlyRevenue;
	
	public QuantitativeValue getYearlyRevenue() throws ClassCastException{
		return (QuantitativeValue) _yearlyRevenue;
	}
	
	public void setYearlyRevenue(QuantitativeValue value) throws ClassCastException{
		_yearlyRevenue = value;
	}
}
