package org.schema;
/**
* A type of financial product that typically requires the client to transfer funds to a financial service in return for potential beneficial financial return.
*/
public interface IInvestmentOrDeposit extends IFinancialProduct{
	
	
	/**
	 * The amount of money.
	 *
	 */
	
	public <T> T getAmount(Class<T> c) throws ClassCastException;
	
	public void setAmount(Float value) throws ClassCastException;
	public void setAmount(MonetaryAmount value) throws ClassCastException;
}
