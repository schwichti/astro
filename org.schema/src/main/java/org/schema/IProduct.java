package org.schema;
/**
* Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
*/
public interface IProduct extends IThing{
	
	
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 */
	
	public AggregateRating getAggregateRating() throws ClassCastException;
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException;
	/**
	 * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.</p>
	 
	 <p>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
	 *
	 */
	
	public PropertyValue getAdditionalProperty() throws ClassCastException;
	
	public void setAdditionalProperty(PropertyValue value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin13() throws ClassCastException;
	
	public void setGtin13(String value) throws ClassCastException;
	/**
	 * The depth of the item.
	 *
	 */
	
	public <T> T getDepth(Class<T> c) throws ClassCastException;
	
	public void setDepth(QuantitativeValue value) throws ClassCastException;
	public void setDepth(Distance value) throws ClassCastException;
	/**
	 * A pointer to another, functionally similar product (or multiple products).
	 *
	 */
	
	public <T> T getIsSimilarTo(Class<T> c) throws ClassCastException;
	
	public void setIsSimilarTo(Product value) throws ClassCastException;
	public void setIsSimilarTo(Service value) throws ClassCastException;
	/**
	 * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 *
	 */
	
	public <T> T getCategory(Class<T> c) throws ClassCastException;
	
	public void setCategory(String value) throws ClassCastException;
	public void setCategory(Thing value) throws ClassCastException;
	/**
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
	 *
	 */
	
	public String getSku() throws ClassCastException;
	
	public void setSku(String value) throws ClassCastException;
	/**
	 * The product identifier, such as ISBN. For example: <code>meta itemprop="productID" content="isbn:123-456-789"</code>.
	 *
	 */
	
	public String getProductID() throws ClassCastException;
	
	public void setProductID(String value) throws ClassCastException;
	/**
	 * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
	 *
	 */
	
	public String getMpn() throws ClassCastException;
	
	public void setMpn(String value) throws ClassCastException;
	/**
	 * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
	 *
	 */
	
	public OfferItemCondition getItemCondition() throws ClassCastException;
	
	public void setItemCondition(OfferItemCondition value) throws ClassCastException;
	/**
	 * An intended audience, i.e. a group for whom something was created.
	 *
	 */
	
	public Audience getAudience() throws ClassCastException;
	
	public void setAudience(Audience value) throws ClassCastException;
	/**
	 * The date the item e.g. vehicle was purchased by the current owner.
	 *
	 */
	
	public java.util.Date getPurchaseDate() throws ClassCastException;
	
	public void setPurchaseDate(java.util.Date value) throws ClassCastException;
	/**
	 * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
	 *
	 */
	
	public Product getIsAccessoryOrSparePartFor() throws ClassCastException;
	
	public void setIsAccessoryOrSparePartFor(Product value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin12() throws ClassCastException;
	
	public void setGtin12(String value) throws ClassCastException;
	/**
	 * The color of the product.
	 *
	 */
	
	public String getColor() throws ClassCastException;
	
	public void setColor(String value) throws ClassCastException;
	/**
	 * A material that something is made from, e.g. leather, wool, cotton, paper.
	 *
	 */
	
	public <T> T getMaterial(Class<T> c) throws ClassCastException;
	
	public void setMaterial(String value) throws ClassCastException;
	public void setMaterial(Product value) throws ClassCastException;
	/**
	 * A review of the item.
	 *
	 */
	
	public Review getReview() throws ClassCastException;
	
	public void setReview(Review value) throws ClassCastException;
	/**
	 * The height of the item.
	 *
	 */
	
	public <T> T getHeight(Class<T> c) throws ClassCastException;
	
	public void setHeight(Distance value) throws ClassCastException;
	public void setHeight(QuantitativeValue value) throws ClassCastException;
	/**
	 * An associated logo.
	 *
	 */
	
	public <T> T getLogo(Class<T> c) throws ClassCastException;
	
	public void setLogo(ImageObject value) throws ClassCastException;
	public void setLogo(String value) throws ClassCastException;
	/**
	 * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 */
	
	public Offer getOffers() throws ClassCastException;
	
	public void setOffers(Offer value) throws ClassCastException;
	/**
	 * The manufacturer of the product.
	 *
	 */
	
	public Organization getManufacturer() throws ClassCastException;
	
	public void setManufacturer(Organization value) throws ClassCastException;
	/**
	 * A pointer to another, somehow related product (or multiple products).
	 *
	 */
	
	public <T> T getIsRelatedTo(Class<T> c) throws ClassCastException;
	
	public void setIsRelatedTo(Product value) throws ClassCastException;
	public void setIsRelatedTo(Service value) throws ClassCastException;
	/**
	 * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
	 *
	 */
	
	public <T> T getBrand(Class<T> c) throws ClassCastException;
	
	public void setBrand(Brand value) throws ClassCastException;
	public void setBrand(Organization value) throws ClassCastException;
	/**
	 * Review of the item.
	 *
	 */
	
	public Review getReviews() throws ClassCastException;
	
	public void setReviews(Review value) throws ClassCastException;
	/**
	 * An award won by or for this item.
	 *
	 */
	
	public String getAward() throws ClassCastException;
	
	public void setAward(String value) throws ClassCastException;
	/**
	 * The width of the item.
	 *
	 */
	
	public <T> T getWidth(Class<T> c) throws ClassCastException;
	
	public void setWidth(Distance value) throws ClassCastException;
	public void setWidth(QuantitativeValue value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin14() throws ClassCastException;
	
	public void setGtin14(String value) throws ClassCastException;
	/**
	 * The date of production of the item, e.g. vehicle.
	 *
	 */
	
	public java.util.Date getProductionDate() throws ClassCastException;
	
	public void setProductionDate(java.util.Date value) throws ClassCastException;
	/**
	 * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 */
	
	public String getGtin8() throws ClassCastException;
	
	public void setGtin8(String value) throws ClassCastException;
	/**
	 * Awards won by or for this item.
	 *
	 */
	
	public String getAwards() throws ClassCastException;
	
	public void setAwards(String value) throws ClassCastException;
	/**
	 * A pointer to another product (or multiple products) for which this product is a consumable.
	 *
	 */
	
	public Product getIsConsumableFor() throws ClassCastException;
	
	public void setIsConsumableFor(Product value) throws ClassCastException;
	/**
	 * The weight of the product or person.
	 *
	 */
	
	public QuantitativeValue getWeight() throws ClassCastException;
	
	public void setWeight(QuantitativeValue value) throws ClassCastException;
	/**
	 * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
	 *
	 */
	
	public java.util.Date getReleaseDate() throws ClassCastException;
	
	public void setReleaseDate(java.util.Date value) throws ClassCastException;
	/**
	 * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
	 *
	 */
	
	public <T> T getModel(Class<T> c) throws ClassCastException;
	
	public void setModel(ProductModel value) throws ClassCastException;
	public void setModel(String value) throws ClassCastException;
}
