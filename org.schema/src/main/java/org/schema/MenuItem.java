package org.schema;
/**
* A food or drink item listed in a menu or menu section.
*/
public class MenuItem extends Intangible{
	
	
	/**
	* Nutrition information about the recipe or menu item.
	 *
	 * Ranges: NutritionInformation
	 */
	private NutritionInformation _nutrition;
	
	public NutritionInformation getNutrition() throws ClassCastException{
		return (NutritionInformation) _nutrition;
	}
	
	public void setNutrition(NutritionInformation value) throws ClassCastException{
		_nutrition = value;
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
	* Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
	 *
	 * Ranges: RestrictedDiet
	 */
	private RestrictedDiet _suitableForDiet;
	
	public RestrictedDiet getSuitableForDiet() throws ClassCastException{
		return (RestrictedDiet) _suitableForDiet;
	}
	
	public void setSuitableForDiet(RestrictedDiet value) throws ClassCastException{
		_suitableForDiet = value;
	}
}
