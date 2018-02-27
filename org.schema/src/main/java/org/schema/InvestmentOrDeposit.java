package org.schema;
/**
* A type of financial product that typically requires the client to transfer funds to a financial service in return for potential beneficial financial return.
*/
public class InvestmentOrDeposit extends FinancialProduct{
	
	
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
}
