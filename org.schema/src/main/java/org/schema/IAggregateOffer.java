package org.schema;
/**
* When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
*/
public interface IAggregateOffer extends IOffer{
	
	
	/**
	 * The lowest price of all offers available.
	 *
	 */
	
	public <T> T getLowPrice(Class<T> c) throws ClassCastException;
	
	public void setLowPrice(Float value) throws ClassCastException;
	public void setLowPrice(String value) throws ClassCastException;
	/**
	 * The number of offers for the product.
	 *
	 */
	
	public Integer getOfferCount() throws ClassCastException;
	
	public void setOfferCount(Integer value) throws ClassCastException;
	/**
	 * The highest price of all offers available.
	 *
	 */
	
	public <T> T getHighPrice(Class<T> c) throws ClassCastException;
	
	public void setHighPrice(Float value) throws ClassCastException;
	public void setHighPrice(String value) throws ClassCastException;
	/**
	 * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 */
	
	public Offer getOffers() throws ClassCastException;
	
	public void setOffers(Offer value) throws ClassCastException;
}
