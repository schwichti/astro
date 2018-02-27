package org.schema;
/**
* The price for the delivery of an offer using a particular delivery method.
*/
public interface IDeliveryChargeSpecification extends IPriceSpecification{
	
	
	/**
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.</p>
	 
	 <p>See also <a class="localLink" href="http://schema.org/ineligibleRegion">ineligibleRegion</a>.
	 *
	 */
	
	public <T> T getEligibleRegion(Class<T> c) throws ClassCastException;
	
	public void setEligibleRegion(Place value) throws ClassCastException;
	public void setEligibleRegion(GeoShape value) throws ClassCastException;
	public void setEligibleRegion(String value) throws ClassCastException;
	/**
	 * The delivery method(s) to which the delivery charge or payment charge specification applies.
	 *
	 */
	
	public DeliveryMethod getAppliesToDeliveryMethod() throws ClassCastException;
	
	public void setAppliesToDeliveryMethod(DeliveryMethod value) throws ClassCastException;
	/**
	 * The geographic area where a service or offered item is provided.
	 *
	 */
	
	public <T> T getAreaServed(Class<T> c) throws ClassCastException;
	
	public void setAreaServed(String value) throws ClassCastException;
	public void setAreaServed(AdministrativeArea value) throws ClassCastException;
	public void setAreaServed(GeoShape value) throws ClassCastException;
	public void setAreaServed(Place value) throws ClassCastException;
	/**
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.</p>
	 
	 <p>See also <a class="localLink" href="http://schema.org/eligibleRegion">eligibleRegion</a>.
	 *
	 */
	
	public <T> T getIneligibleRegion(Class<T> c) throws ClassCastException;
	
	public void setIneligibleRegion(String value) throws ClassCastException;
	public void setIneligibleRegion(GeoShape value) throws ClassCastException;
	public void setIneligibleRegion(Place value) throws ClassCastException;
}
