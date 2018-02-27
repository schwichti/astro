package org.schema;
/**
* The act of participating in an exchange of goods and services for monetary compensation. An agent trades an object, product or service with a participant in exchange for a one time or periodic payment.
*/
public class TradeAction extends Action{
	
	
	/**
	* <p>The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.</p>
	
	<p>Usage guidelines:</p>
	
	<ul>
	<li>Use the <a class="localLink" href="http://schema.org/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
	  including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '$' in the value.</li>
	<li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
	<li>Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.</li>
	<li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
	</ul>
	 *
	 * Ranges: Text, Number
	 */
	private Object _price;
	
	public <T> T getPrice(Class<T> c) throws ClassCastException{
		return (T) _price;
	}
	
	public void setPrice(String value) throws ClassCastException{
		_price = value;
	}
	public void setPrice(Float value) throws ClassCastException{
		_price = value;
	}
	/**
	* One or more detailed price specifications, indicating the unit price and delivery or payment charges.
	 *
	 * Ranges: PriceSpecification
	 */
	private PriceSpecification _priceSpecification;
	
	public PriceSpecification getPriceSpecification() throws ClassCastException{
		return (PriceSpecification) _priceSpecification;
	}
	
	public void setPriceSpecification(PriceSpecification value) throws ClassCastException{
		_priceSpecification = value;
	}
}
