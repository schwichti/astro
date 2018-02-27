package org.schema;
/**
* The act of producing/preparing food.
*/
public class CookAction extends CreateAction{
	
	
	/**
	* A sub property of instrument. The recipe/instructions used to perform the action.
	 *
	 * Ranges: Recipe
	 */
	private Recipe _recipe;
	
	public Recipe getRecipe() throws ClassCastException{
		return (Recipe) _recipe;
	}
	
	public void setRecipe(Recipe value) throws ClassCastException{
		_recipe = value;
	}
	/**
	* A sub property of location. The specific food establishment where the action occurred.
	 *
	 * Ranges: Place, FoodEstablishment
	 */
	private Object _foodEstablishment;
	
	public <T> T getFoodEstablishment(Class<T> c) throws ClassCastException{
		return (T) _foodEstablishment;
	}
	
	public void setFoodEstablishment(Place value) throws ClassCastException{
		_foodEstablishment = value;
	}
	public void setFoodEstablishment(FoodEstablishment value) throws ClassCastException{
		_foodEstablishment = value;
	}
	/**
	* A sub property of location. The specific food event where the action occurred.
	 *
	 * Ranges: FoodEvent
	 */
	private FoodEvent _foodEvent;
	
	public FoodEvent getFoodEvent() throws ClassCastException{
		return (FoodEvent) _foodEvent;
	}
	
	public void setFoodEvent(FoodEvent value) throws ClassCastException{
		_foodEvent = value;
	}
}
