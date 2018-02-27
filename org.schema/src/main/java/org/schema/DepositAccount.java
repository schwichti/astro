package org.schema;
/**
* A type of Bank Account with a main purpose of depositing funds to gain interest or other benefits.
*/
public class DepositAccount extends BankAccount implements IInvestmentOrDeposit{
	
	
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
