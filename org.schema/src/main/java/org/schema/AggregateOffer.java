package org.schema;
/**
* When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
*/
public class AggregateOffer extends Offer{
	
	
	/**
	* The lowest price of all offers available.
	 *
	 * Ranges: Number, Text
	 */
	private Object _lowPrice;
	
	public <T> T getLowPrice(Class<T> c) throws ClassCastException{
		return (T) _lowPrice;
	}
	
	public void setLowPrice(Float value) throws ClassCastException{
		_lowPrice = value;
	}
	public void setLowPrice(String value) throws ClassCastException{
		_lowPrice = value;
	}
	/**
	* The number of offers for the product.
	 *
	 * Ranges: Integer
	 */
	private Integer _offerCount;
	
	public Integer getOfferCount() throws ClassCastException{
		return (Integer) _offerCount;
	}
	
	public void setOfferCount(Integer value) throws ClassCastException{
		_offerCount = value;
	}
	/**
	* The highest price of all offers available.
	 *
	 * Ranges: Number, Text
	 */
	private Object _highPrice;
	
	public <T> T getHighPrice(Class<T> c) throws ClassCastException{
		return (T) _highPrice;
	}
	
	public void setHighPrice(Float value) throws ClassCastException{
		_highPrice = value;
	}
	public void setHighPrice(String value) throws ClassCastException{
		_highPrice = value;
	}
	/**
	* An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 * Ranges: Offer
	 */
	private Offer _offers;
	
	public Offer getOffers() throws ClassCastException{
		return (Offer) _offers;
	}
	
	public void setOffers(Offer value) throws ClassCastException{
		_offers = value;
	}
}
