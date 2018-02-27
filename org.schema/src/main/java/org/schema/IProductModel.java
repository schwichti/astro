package org.schema;
/**
* A datasheet or vendor specification of a product (in the sense of a prototypical description).
*/
public interface IProductModel extends IProduct{
	
	
	/**
	 * A pointer from a newer variant of a product  to its previous, often discontinued predecessor.
	 *
	 */
	
	public ProductModel getSuccessorOf() throws ClassCastException;
	
	public void setSuccessorOf(ProductModel value) throws ClassCastException;
	/**
	 * A pointer to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive.
	 *
	 */
	
	public ProductModel getIsVariantOf() throws ClassCastException;
	
	public void setIsVariantOf(ProductModel value) throws ClassCastException;
	/**
	 * A pointer from a previous, often discontinued variant of the product to its newer variant.
	 *
	 */
	
	public ProductModel getPredecessorOf() throws ClassCastException;
	
	public void setPredecessorOf(ProductModel value) throws ClassCastException;
}
