package org.schema;
/**
* A compound price specification is one that bundles multiple prices that all apply in combination for different dimensions of consumption. Use the name property of the attached unit price specification for indicating the dimension of a price component (e.g. "electricity" or "final cleaning").
*/
public interface ICompoundPriceSpecification extends IPriceSpecification{
	
	
	/**
	 * This property links to all <a class="localLink" href="http://schema.org/UnitPriceSpecification">UnitPriceSpecification</a> nodes that apply in parallel for the <a class="localLink" href="http://schema.org/CompoundPriceSpecification">CompoundPriceSpecification</a> node.
	 *
	 */
	
	public UnitPriceSpecification getPriceComponent() throws ClassCastException;
	
	public void setPriceComponent(UnitPriceSpecification value) throws ClassCastException;
}
