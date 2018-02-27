package org.schema;
/**
* A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
*/
public class WarrantyPromise extends StructuredValue{
	
	
	/**
	* The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _durationOfWarranty;
	
	public QuantitativeValue getDurationOfWarranty() throws ClassCastException{
		return (QuantitativeValue) _durationOfWarranty;
	}
	
	public void setDurationOfWarranty(QuantitativeValue value) throws ClassCastException{
		_durationOfWarranty = value;
	}
	/**
	* The scope of the warranty promise.
	 *
	 * Ranges: WarrantyScope
	 */
	private WarrantyScope _warrantyScope;
	
	public WarrantyScope getWarrantyScope() throws ClassCastException{
		return (WarrantyScope) _warrantyScope;
	}
	
	public void setWarrantyScope(WarrantyScope value) throws ClassCastException{
		_warrantyScope = value;
	}
}
