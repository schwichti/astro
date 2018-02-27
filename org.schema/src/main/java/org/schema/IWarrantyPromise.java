package org.schema;
/**
* A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
*/
public interface IWarrantyPromise extends IStructuredValue{
	
	
	/**
	 * The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days.
	 *
	 */
	
	public QuantitativeValue getDurationOfWarranty() throws ClassCastException;
	
	public void setDurationOfWarranty(QuantitativeValue value) throws ClassCastException;
	/**
	 * The scope of the warranty promise.
	 *
	 */
	
	public WarrantyScope getWarrantyScope() throws ClassCastException;
	
	public void setWarrantyScope(WarrantyScope value) throws ClassCastException;
}
