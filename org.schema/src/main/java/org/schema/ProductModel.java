package org.schema;
/**
* A datasheet or vendor specification of a product (in the sense of a prototypical description).
*/
public class ProductModel extends Product{
	
	
	/**
	* A pointer from a newer variant of a product  to its previous, often discontinued predecessor.
	 *
	 * Ranges: ProductModel
	 */
	private ProductModel _successorOf;
	
	public ProductModel getSuccessorOf() throws ClassCastException{
		return (ProductModel) _successorOf;
	}
	
	public void setSuccessorOf(ProductModel value) throws ClassCastException{
		_successorOf = value;
	}
	/**
	* A pointer to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive.
	 *
	 * Ranges: ProductModel
	 */
	private ProductModel _isVariantOf;
	
	public ProductModel getIsVariantOf() throws ClassCastException{
		return (ProductModel) _isVariantOf;
	}
	
	public void setIsVariantOf(ProductModel value) throws ClassCastException{
		_isVariantOf = value;
	}
	/**
	* A pointer from a previous, often discontinued variant of the product to its newer variant.
	 *
	 * Ranges: ProductModel
	 */
	private ProductModel _predecessorOf;
	
	public ProductModel getPredecessorOf() throws ClassCastException{
		return (ProductModel) _predecessorOf;
	}
	
	public void setPredecessorOf(ProductModel value) throws ClassCastException{
		_predecessorOf = value;
	}
}
