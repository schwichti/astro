package org.schema;
/**
* A subclass of OrganizationRole used to describe employee relationships.
*/
public interface IEmployeeRole extends IOrganizationRole{
	
	
	/**
	 * The base salary of the job or of an employee in an EmployeeRole.
	 *
	 */
	
	public <T> T getBaseSalary(Class<T> c) throws ClassCastException;
	
	public void setBaseSalary(PriceSpecification value) throws ClassCastException;
	public void setBaseSalary(Float value) throws ClassCastException;
	public void setBaseSalary(MonetaryAmount value) throws ClassCastException;
	/**
	 * The currency (coded using <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> ) used for the main salary information in this job posting or for this employee.
	 *
	 */
	
	public String getSalaryCurrency() throws ClassCastException;
	
	public void setSalaryCurrency(String value) throws ClassCastException;
}
