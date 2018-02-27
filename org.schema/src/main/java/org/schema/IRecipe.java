package org.schema;
/**
* A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via <a class="localLink" href="http://schema.org/suitableForDiet">suitableForDiet</a>. The <a class="localLink" href="http://schema.org/keywords">keywords</a> property can also be used to add more detail.
*/
public interface IRecipe extends IHowTo{
	
	
	/**
	 * A single ingredient used in the recipe, e.g. sugar, flour or garlic.
	 *
	 */
	
	public String getRecipeIngredient() throws ClassCastException;
	
	public void setRecipeIngredient(String value) throws ClassCastException;
	/**
	 * The cuisine of the recipe (for example, French or Ethiopian).
	 *
	 */
	
	public String getRecipeCuisine() throws ClassCastException;
	
	public void setRecipeCuisine(String value) throws ClassCastException;
	/**
	 * The quantity produced by the recipe (for example, number of people served, number of servings, etc).
	 *
	 */
	
	public <T> T getRecipeYield(Class<T> c) throws ClassCastException;
	
	public void setRecipeYield(QuantitativeValue value) throws ClassCastException;
	public void setRecipeYield(String value) throws ClassCastException;
	/**
	 * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
	 *
	 */
	
	public RestrictedDiet getSuitableForDiet() throws ClassCastException;
	
	public void setSuitableForDiet(RestrictedDiet value) throws ClassCastException;
	/**
	 * Nutrition information about the recipe or menu item.
	 *
	 */
	
	public NutritionInformation getNutrition() throws ClassCastException;
	
	public void setNutrition(NutritionInformation value) throws ClassCastException;
	/**
	 * The method of cooking, such as Frying, Steaming, ...
	 *
	 */
	
	public String getCookingMethod() throws ClassCastException;
	
	public void setCookingMethod(String value) throws ClassCastException;
	/**
	 * The category of the recipe—for example, appetizer, entree, etc.
	 *
	 */
	
	public String getRecipeCategory() throws ClassCastException;
	
	public void setRecipeCategory(String value) throws ClassCastException;
	/**
	 * A step in making the recipe, in the form of a single item (document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
	 *
	 */
	
	public <T> T getRecipeInstructions(Class<T> c) throws ClassCastException;
	
	public void setRecipeInstructions(String value) throws ClassCastException;
	public void setRecipeInstructions(CreativeWork value) throws ClassCastException;
	public void setRecipeInstructions(ItemList value) throws ClassCastException;
	/**
	 * A single ingredient used in the recipe, e.g. sugar, flour or garlic.
	 *
	 */
	
	public String getIngredients() throws ClassCastException;
	
	public void setIngredients(String value) throws ClassCastException;
	/**
	 * The time it takes to actually cook the dish, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 */
	
	public Duration getCookTime() throws ClassCastException;
	
	public void setCookTime(Duration value) throws ClassCastException;
}
