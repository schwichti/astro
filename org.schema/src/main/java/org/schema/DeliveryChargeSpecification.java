package org.schema;
/**
* The price for the delivery of an offer using a particular delivery method.
*/
public class DeliveryChargeSpecification extends PriceSpecification{
	
	
	/**
	* The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.</p>
	
	<p>See also <a class="localLink" href="http://schema.org/ineligibleRegion">ineligibleRegion</a>.
	 *
	 * Ranges: Place, GeoShape, Text
	 */
	private Object _eligibleRegion;
	
	public <T> T getEligibleRegion(Class<T> c) throws ClassCastException{
		return (T) _eligibleRegion;
	}
	
	public void setEligibleRegion(Place value) throws ClassCastException{
		_eligibleRegion = value;
	}
	public void setEligibleRegion(GeoShape value) throws ClassCastException{
		_eligibleRegion = value;
	}
	public void setEligibleRegion(String value) throws ClassCastException{
		_eligibleRegion = value;
	}
	/**
	* The delivery method(s) to which the delivery charge or payment charge specification applies.
	 *
	 * Ranges: DeliveryMethod
	 */
	private DeliveryMethod _appliesToDeliveryMethod;
	
	public DeliveryMethod getAppliesToDeliveryMethod() throws ClassCastException{
		return (DeliveryMethod) _appliesToDeliveryMethod;
	}
	
	public void setAppliesToDeliveryMethod(DeliveryMethod value) throws ClassCastException{
		_appliesToDeliveryMethod = value;
	}
	/**
	* The geographic area where a service or offered item is provided.
	 *
	 * Ranges: Text, AdministrativeArea, GeoShape, Place
	 */
	private Object _areaServed;
	
	public <T> T getAreaServed(Class<T> c) throws ClassCastException{
		return (T) _areaServed;
	}
	
	public void setAreaServed(String value) throws ClassCastException{
		_areaServed = value;
	}
	public void setAreaServed(AdministrativeArea value) throws ClassCastException{
		_areaServed = value;
	}
	public void setAreaServed(GeoShape value) throws ClassCastException{
		_areaServed = value;
	}
	public void setAreaServed(Place value) throws ClassCastException{
		_areaServed = value;
	}
	/**
	* The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.</p>
	
	<p>See also <a class="localLink" href="http://schema.org/eligibleRegion">eligibleRegion</a>.
	 *
	 * Ranges: Text, GeoShape, Place
	 */
	private Object _ineligibleRegion;
	
	public <T> T getIneligibleRegion(Class<T> c) throws ClassCastException{
		return (T) _ineligibleRegion;
	}
	
	public void setIneligibleRegion(String value) throws ClassCastException{
		_ineligibleRegion = value;
	}
	public void setIneligibleRegion(GeoShape value) throws ClassCastException{
		_ineligibleRegion = value;
	}
	public void setIneligibleRegion(Place value) throws ClassCastException{
		_ineligibleRegion = value;
	}
}
