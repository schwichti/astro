package org.schema;
/**
* A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry.
*/
public interface IFinancialProduct extends IService{
	
	
	/**
	 * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
	 *
	 */
	
	public <T> T getInterestRate(Class<T> c) throws ClassCastException;
	
	public void setInterestRate(QuantitativeValue value) throws ClassCastException;
	public void setInterestRate(Float value) throws ClassCastException;
	/**
	 * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
	 *
	 */
	
	public <T> T getAnnualPercentageRate(Class<T> c) throws ClassCastException;
	
	public void setAnnualPercentageRate(Float value) throws ClassCastException;
	public void setAnnualPercentageRate(QuantitativeValue value) throws ClassCastException;
	/**
	 * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
	 *
	 */
	
	public String getFeesAndCommissionsSpecification() throws ClassCastException;
	
	public void setFeesAndCommissionsSpecification(String value) throws ClassCastException;
}
