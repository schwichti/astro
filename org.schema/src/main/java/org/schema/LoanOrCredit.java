package org.schema;
/**
* A financial product for the loaning of an amount of money under agreed terms and charges.
*/
public class LoanOrCredit extends FinancialProduct{
	
	
	/**
	* The duration of the loan or credit agreement.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _loanTerm;
	
	public QuantitativeValue getLoanTerm() throws ClassCastException{
		return (QuantitativeValue) _loanTerm;
	}
	
	public void setLoanTerm(QuantitativeValue value) throws ClassCastException{
		_loanTerm = value;
	}
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
	/**
	* Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)
	 *
	 * Ranges: Thing, Text
	 */
	private Object _requiredCollateral;
	
	public <T> T getRequiredCollateral(Class<T> c) throws ClassCastException{
		return (T) _requiredCollateral;
	}
	
	public void setRequiredCollateral(Thing value) throws ClassCastException{
		_requiredCollateral = value;
	}
	public void setRequiredCollateral(String value) throws ClassCastException{
		_requiredCollateral = value;
	}
}
