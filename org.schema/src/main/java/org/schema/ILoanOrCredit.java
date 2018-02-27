package org.schema;
/**
* A financial product for the loaning of an amount of money under agreed terms and charges.
*/
public interface ILoanOrCredit extends IFinancialProduct{
	
	
	/**
	 * The duration of the loan or credit agreement.
	 *
	 */
	
	public QuantitativeValue getLoanTerm() throws ClassCastException;
	
	public void setLoanTerm(QuantitativeValue value) throws ClassCastException;
	/**
	 * The amount of money.
	 *
	 */
	
	public <T> T getAmount(Class<T> c) throws ClassCastException;
	
	public void setAmount(Float value) throws ClassCastException;
	public void setAmount(MonetaryAmount value) throws ClassCastException;
	/**
	 * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
	 *
	 */
	
	public <T> T getRequiredCollateral(Class<T> c) throws ClassCastException;
	
	public void setRequiredCollateral(Thing value) throws ClassCastException;
	public void setRequiredCollateral(String value) throws ClassCastException;
}
