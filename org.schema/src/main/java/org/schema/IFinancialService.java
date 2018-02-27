package org.schema;
/**
* Financial services business.
*/
public interface IFinancialService extends ILocalBusiness{
	
	
	/**
	 * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
	 *
	 */
	
	public String getFeesAndCommissionsSpecification() throws ClassCastException;
	
	public void setFeesAndCommissionsSpecification(String value) throws ClassCastException;
}
