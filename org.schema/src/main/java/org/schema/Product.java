package org.schema;
/**
* Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.
*/
public class Product extends Thing{
	
	
	/**
	* The overall rating, based on a collection of reviews or ratings, of the item.
	 *
	 * Ranges: AggregateRating
	 */
	private AggregateRating _aggregateRating;
	
	public AggregateRating getAggregateRating() throws ClassCastException{
		return (AggregateRating) _aggregateRating;
	}
	
	public void setAggregateRating(AggregateRating value) throws ClassCastException{
		_aggregateRating = value;
	}
	/**
	* A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.</p>
	
	<p>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
	 *
	 * Ranges: PropertyValue
	 */
	private PropertyValue _additionalProperty;
	
	public PropertyValue getAdditionalProperty() throws ClassCastException{
		return (PropertyValue) _additionalProperty;
	}
	
	public void setAdditionalProperty(PropertyValue value) throws ClassCastException{
		_additionalProperty = value;
	}
	/**
	* The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 * Ranges: Text
	 */
	private String _gtin13;
	
	public String getGtin13() throws ClassCastException{
		return (String) _gtin13;
	}
	
	public void setGtin13(String value) throws ClassCastException{
		_gtin13 = value;
	}
	/**
	* The depth of the item.
	 *
	 * Ranges: QuantitativeValue, Distance
	 */
	private Object _depth;
	
	public <T> T getDepth(Class<T> c) throws ClassCastException{
		return (T) _depth;
	}
	
	public void setDepth(QuantitativeValue value) throws ClassCastException{
		_depth = value;
	}
	public void setDepth(Distance value) throws ClassCastException{
		_depth = value;
	}
	/**
	* A pointer to another, functionally similar product (or multiple products).
	 *
	 * Ranges: Product, Service
	 */
	private Object _isSimilarTo;
	
	public <T> T getIsSimilarTo(Class<T> c) throws ClassCastException{
		return (T) _isSimilarTo;
	}
	
	public void setIsSimilarTo(Product value) throws ClassCastException{
		_isSimilarTo = value;
	}
	public void setIsSimilarTo(Service value) throws ClassCastException{
		_isSimilarTo = value;
	}
	/**
	* A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 *
	 * Ranges: Text, Thing
	 */
	private Object _category;
	
	public <T> T getCategory(Class<T> c) throws ClassCastException{
		return (T) _category;
	}
	
	public void setCategory(String value) throws ClassCastException{
		_category = value;
	}
	public void setCategory(Thing value) throws ClassCastException{
		_category = value;
	}
	/**
	* The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
	 *
	 * Ranges: Text
	 */
	private String _sku;
	
	public String getSku() throws ClassCastException{
		return (String) _sku;
	}
	
	public void setSku(String value) throws ClassCastException{
		_sku = value;
	}
	/**
	* The product identifier, such as ISBN. For example: <code>meta itemprop="productID" content="isbn:123-456-789"</code>.
	 *
	 * Ranges: Text
	 */
	private String _productID;
	
	public String getProductID() throws ClassCastException{
		return (String) _productID;
	}
	
	public void setProductID(String value) throws ClassCastException{
		_productID = value;
	}
	/**
	* The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
	 *
	 * Ranges: Text
	 */
	private String _mpn;
	
	public String getMpn() throws ClassCastException{
		return (String) _mpn;
	}
	
	public void setMpn(String value) throws ClassCastException{
		_mpn = value;
	}
	/**
	* A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
	 *
	 * Ranges: OfferItemCondition
	 */
	private OfferItemCondition _itemCondition;
	
	public OfferItemCondition getItemCondition() throws ClassCastException{
		return (OfferItemCondition) _itemCondition;
	}
	
	public void setItemCondition(OfferItemCondition value) throws ClassCastException{
		_itemCondition = value;
	}
	/**
	* An intended audience, i.e. a group for whom something was created.
	 *
	 * Ranges: Audience
	 */
	private Audience _audience;
	
	public Audience getAudience() throws ClassCastException{
		return (Audience) _audience;
	}
	
	public void setAudience(Audience value) throws ClassCastException{
		_audience = value;
	}
	/**
	* The date the item e.g. vehicle was purchased by the current owner.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _purchaseDate;
	
	public java.util.Date getPurchaseDate() throws ClassCastException{
		return (java.util.Date) _purchaseDate;
	}
	
	public void setPurchaseDate(java.util.Date value) throws ClassCastException{
		_purchaseDate = value;
	}
	/**
	* A pointer to another product (or multiple products) for which this product is an accessory or spare part.
	 *
	 * Ranges: Product
	 */
	private Product _isAccessoryOrSparePartFor;
	
	public Product getIsAccessoryOrSparePartFor() throws ClassCastException{
		return (Product) _isAccessoryOrSparePartFor;
	}
	
	public void setIsAccessoryOrSparePartFor(Product value) throws ClassCastException{
		_isAccessoryOrSparePartFor = value;
	}
	/**
	* The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 * Ranges: Text
	 */
	private String _gtin12;
	
	public String getGtin12() throws ClassCastException{
		return (String) _gtin12;
	}
	
	public void setGtin12(String value) throws ClassCastException{
		_gtin12 = value;
	}
	/**
	* The color of the product.
	 *
	 * Ranges: Text
	 */
	private String _color;
	
	public String getColor() throws ClassCastException{
		return (String) _color;
	}
	
	public void setColor(String value) throws ClassCastException{
		_color = value;
	}
	/**
	* A material that something is made from, e.g. leather, wool, cotton, paper.
	 *
	 * Ranges: URL, Text, Product
	 */
	private Object _material;
	
	public <T> T getMaterial(Class<T> c) throws ClassCastException{
		return (T) _material;
	}
	
	public void setMaterial(String value) throws ClassCastException{
		_material = value;
	}
	public void setMaterial(Product value) throws ClassCastException{
		_material = value;
	}
	/**
	* A review of the item.
	 *
	 * Ranges: Review
	 */
	private Review _review;
	
	public Review getReview() throws ClassCastException{
		return (Review) _review;
	}
	
	public void setReview(Review value) throws ClassCastException{
		_review = value;
	}
	/**
	* The height of the item.
	 *
	 * Ranges: Distance, QuantitativeValue
	 */
	private Object _height;
	
	public <T> T getHeight(Class<T> c) throws ClassCastException{
		return (T) _height;
	}
	
	public void setHeight(Distance value) throws ClassCastException{
		_height = value;
	}
	public void setHeight(QuantitativeValue value) throws ClassCastException{
		_height = value;
	}
	/**
	* An associated logo.
	 *
	 * Ranges: ImageObject, URL
	 */
	private Object _logo;
	
	public <T> T getLogo(Class<T> c) throws ClassCastException{
		return (T) _logo;
	}
	
	public void setLogo(ImageObject value) throws ClassCastException{
		_logo = value;
	}
	public void setLogo(String value) throws ClassCastException{
		_logo = value;
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
	/**
	* The manufacturer of the product.
	 *
	 * Ranges: Organization
	 */
	private Organization _manufacturer;
	
	public Organization getManufacturer() throws ClassCastException{
		return (Organization) _manufacturer;
	}
	
	public void setManufacturer(Organization value) throws ClassCastException{
		_manufacturer = value;
	}
	/**
	* A pointer to another, somehow related product (or multiple products).
	 *
	 * Ranges: Product, Service
	 */
	private Object _isRelatedTo;
	
	public <T> T getIsRelatedTo(Class<T> c) throws ClassCastException{
		return (T) _isRelatedTo;
	}
	
	public void setIsRelatedTo(Product value) throws ClassCastException{
		_isRelatedTo = value;
	}
	public void setIsRelatedTo(Service value) throws ClassCastException{
		_isRelatedTo = value;
	}
	/**
	* The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
	 *
	 * Ranges: Brand, Organization
	 */
	private Object _brand;
	
	public <T> T getBrand(Class<T> c) throws ClassCastException{
		return (T) _brand;
	}
	
	public void setBrand(Brand value) throws ClassCastException{
		_brand = value;
	}
	public void setBrand(Organization value) throws ClassCastException{
		_brand = value;
	}
	/**
	* Review of the item.
	 *
	 * Ranges: Review
	 */
	private Review _reviews;
	
	public Review getReviews() throws ClassCastException{
		return (Review) _reviews;
	}
	
	public void setReviews(Review value) throws ClassCastException{
		_reviews = value;
	}
	/**
	* An award won by or for this item.
	 *
	 * Ranges: Text
	 */
	private String _award;
	
	public String getAward() throws ClassCastException{
		return (String) _award;
	}
	
	public void setAward(String value) throws ClassCastException{
		_award = value;
	}
	/**
	* The width of the item.
	 *
	 * Ranges: Distance, QuantitativeValue
	 */
	private Object _width;
	
	public <T> T getWidth(Class<T> c) throws ClassCastException{
		return (T) _width;
	}
	
	public void setWidth(Distance value) throws ClassCastException{
		_width = value;
	}
	public void setWidth(QuantitativeValue value) throws ClassCastException{
		_width = value;
	}
	/**
	* The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 * Ranges: Text
	 */
	private String _gtin14;
	
	public String getGtin14() throws ClassCastException{
		return (String) _gtin14;
	}
	
	public void setGtin14(String value) throws ClassCastException{
		_gtin14 = value;
	}
	/**
	* The date of production of the item, e.g. vehicle.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _productionDate;
	
	public java.util.Date getProductionDate() throws ClassCastException{
		return (java.util.Date) _productionDate;
	}
	
	public void setProductionDate(java.util.Date value) throws ClassCastException{
		_productionDate = value;
	}
	/**
	* The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
	 *
	 * Ranges: Text
	 */
	private String _gtin8;
	
	public String getGtin8() throws ClassCastException{
		return (String) _gtin8;
	}
	
	public void setGtin8(String value) throws ClassCastException{
		_gtin8 = value;
	}
	/**
	* Awards won by or for this item.
	 *
	 * Ranges: Text
	 */
	private String _awards;
	
	public String getAwards() throws ClassCastException{
		return (String) _awards;
	}
	
	public void setAwards(String value) throws ClassCastException{
		_awards = value;
	}
	/**
	* A pointer to another product (or multiple products) for which this product is a consumable.
	 *
	 * Ranges: Product
	 */
	private Product _isConsumableFor;
	
	public Product getIsConsumableFor() throws ClassCastException{
		return (Product) _isConsumableFor;
	}
	
	public void setIsConsumableFor(Product value) throws ClassCastException{
		_isConsumableFor = value;
	}
	/**
	* The weight of the product or person.
	 *
	 * Ranges: QuantitativeValue
	 */
	private QuantitativeValue _weight;
	
	public QuantitativeValue getWeight() throws ClassCastException{
		return (QuantitativeValue) _weight;
	}
	
	public void setWeight(QuantitativeValue value) throws ClassCastException{
		_weight = value;
	}
	/**
	* The release date of a product or product model. This can be used to distinguish the exact variant of a product.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _releaseDate;
	
	public java.util.Date getReleaseDate() throws ClassCastException{
		return (java.util.Date) _releaseDate;
	}
	
	public void setReleaseDate(java.util.Date value) throws ClassCastException{
		_releaseDate = value;
	}
	/**
	* The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
	 *
	 * Ranges: ProductModel, Text
	 */
	private Object _model;
	
	public <T> T getModel(Class<T> c) throws ClassCastException{
		return (T) _model;
	}
	
	public void setModel(ProductModel value) throws ClassCastException{
		_model = value;
	}
	public void setModel(String value) throws ClassCastException{
		_model = value;
	}
}
