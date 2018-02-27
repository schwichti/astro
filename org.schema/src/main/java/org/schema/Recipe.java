package org.schema;
/**
* A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via <a class="localLink" href="http://schema.org/suitableForDiet">suitableForDiet</a>. The <a class="localLink" href="http://schema.org/keywords">keywords</a> property can also be used to add more detail.
*/
public class Recipe extends HowTo{
	
	
	/**
	* A single ingredient used in the recipe, e.g. sugar, flour or garlic.
	 *
	 * Ranges: Text
	 */
	private String _recipeIngredient;
	
	public String getRecipeIngredient() throws ClassCastException{
		return (String) _recipeIngredient;
	}
	
	public void setRecipeIngredient(String value) throws ClassCastException{
		_recipeIngredient = value;
	}
	/**
	* The cuisine of the recipe (for example, French or Ethiopian).
	 *
	 * Ranges: Text
	 */
	private String _recipeCuisine;
	
	public String getRecipeCuisine() throws ClassCastException{
		return (String) _recipeCuisine;
	}
	
	public void setRecipeCuisine(String value) throws ClassCastException{
		_recipeCuisine = value;
	}
	/**
	* The quantity produced by the recipe (for example, number of people served, number of servings, etc).
	 *
	 * Ranges: QuantitativeValue, Text
	 */
	private Object _recipeYield;
	
	public <T> T getRecipeYield(Class<T> c) throws ClassCastException{
		return (T) _recipeYield;
	}
	
	public void setRecipeYield(QuantitativeValue value) throws ClassCastException{
		_recipeYield = value;
	}
	public void setRecipeYield(String value) throws ClassCastException{
		_recipeYield = value;
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
	* The method of cooking, such as Frying, Steaming, ...
	 *
	 * Ranges: Text
	 */
	private String _cookingMethod;
	
	public String getCookingMethod() throws ClassCastException{
		return (String) _cookingMethod;
	}
	
	public void setCookingMethod(String value) throws ClassCastException{
		_cookingMethod = value;
	}
	/**
	* The category of the recipe—for example, appetizer, entree, etc.
	 *
	 * Ranges: Text
	 */
	private String _recipeCategory;
	
	public String getRecipeCategory() throws ClassCastException{
		return (String) _recipeCategory;
	}
	
	public void setRecipeCategory(String value) throws ClassCastException{
		_recipeCategory = value;
	}
	/**
	* A step in making the recipe, in the form of a single item (document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
	 *
	 * Ranges: Text, CreativeWork, ItemList
	 */
	private Object _recipeInstructions;
	
	public <T> T getRecipeInstructions(Class<T> c) throws ClassCastException{
		return (T) _recipeInstructions;
	}
	
	public void setRecipeInstructions(String value) throws ClassCastException{
		_recipeInstructions = value;
	}
	public void setRecipeInstructions(CreativeWork value) throws ClassCastException{
		_recipeInstructions = value;
	}
	public void setRecipeInstructions(ItemList value) throws ClassCastException{
		_recipeInstructions = value;
	}
	/**
	* A single ingredient used in the recipe, e.g. sugar, flour or garlic.
	 *
	 * Ranges: Text
	 */
	private String _ingredients;
	
	public String getIngredients() throws ClassCastException{
		return (String) _ingredients;
	}
	
	public void setIngredients(String value) throws ClassCastException{
		_ingredients = value;
	}
	/**
	* The time it takes to actually cook the dish, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.
	 *
	 * Ranges: Duration
	 */
	private Duration _cookTime;
	
	public Duration getCookTime() throws ClassCastException{
		return (Duration) _cookTime;
	}
	
	public void setCookTime(Duration value) throws ClassCastException{
		_cookTime = value;
	}
}
