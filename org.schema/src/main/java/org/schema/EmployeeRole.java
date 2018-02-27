package org.schema;
/**
* A subclass of OrganizationRole used to describe employee relationships.
*/
public class EmployeeRole extends OrganizationRole{
	
	
	/**
	* The base salary of the job or of an employee in an EmployeeRole.
	 *
	 * Ranges: PriceSpecification, Number, MonetaryAmount
	 */
	private Object _baseSalary;
	
	public <T> T getBaseSalary(Class<T> c) throws ClassCastException{
		return (T) _baseSalary;
	}
	
	public void setBaseSalary(PriceSpecification value) throws ClassCastException{
		_baseSalary = value;
	}
	public void setBaseSalary(Float value) throws ClassCastException{
		_baseSalary = value;
	}
	public void setBaseSalary(MonetaryAmount value) throws ClassCastException{
		_baseSalary = value;
	}
	/**
	* The currency (coded using <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> ) used for the main salary information in this job posting or for this employee.
	 *
	 * Ranges: Text
	 */
	private String _salaryCurrency;
	
	public String getSalaryCurrency() throws ClassCastException{
		return (String) _salaryCurrency;
	}
	
	public void setSalaryCurrency(String value) throws ClassCastException{
		_salaryCurrency = value;
	}
}
