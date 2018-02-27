package org.schema;
/**
* A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry.
*/
public class FinancialProduct extends Service{
	
	
	/**
	* The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
	 *
	 * Ranges: QuantitativeValue, Number
	 */
	private Object _interestRate;
	
	public <T> T getInterestRate(Class<T> c) throws ClassCastException{
		return (T) _interestRate;
	}
	
	public void setInterestRate(QuantitativeValue value) throws ClassCastException{
		_interestRate = value;
	}
	public void setInterestRate(Float value) throws ClassCastException{
		_interestRate = value;
	}
	/**
	* The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
	 *
	 * Ranges: Number, QuantitativeValue
	 */
	private Object _annualPercentageRate;
	
	public <T> T getAnnualPercentageRate(Class<T> c) throws ClassCastException{
		return (T) _annualPercentageRate;
	}
	
	public void setAnnualPercentageRate(Float value) throws ClassCastException{
		_annualPercentageRate = value;
	}
	public void setAnnualPercentageRate(QuantitativeValue value) throws ClassCastException{
		_annualPercentageRate = value;
	}
	/**
	* Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
	 *
	 * Ranges: URL, Text
	 */
	private String _feesAndCommissionsSpecification;
	
	public String getFeesAndCommissionsSpecification() throws ClassCastException{
		return (String) _feesAndCommissionsSpecification;
	}
	
	public void setFeesAndCommissionsSpecification(String value) throws ClassCastException{
		_feesAndCommissionsSpecification = value;
	}
}
