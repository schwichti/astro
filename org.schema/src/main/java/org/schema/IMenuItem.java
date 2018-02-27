package org.schema;
/**
* A food or drink item listed in a menu or menu section.
*/
public interface IMenuItem extends IIntangible{
	
	
	/**
	 * Nutrition information about the recipe or menu item.
	 *
	 */
	
	public NutritionInformation getNutrition() throws ClassCastException;
	
	public void setNutrition(NutritionInformation value) throws ClassCastException;
	/**
	 * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
	 *
	 */
	
	public Offer getOffers() throws ClassCastException;
	
	public void setOffers(Offer value) throws ClassCastException;
	/**
	 * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
	 *
	 */
	
	public RestrictedDiet getSuitableForDiet() throws ClassCastException;
	
	public void setSuitableForDiet(RestrictedDiet value) throws ClassCastException;
}
