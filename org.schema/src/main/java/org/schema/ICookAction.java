package org.schema;
/**
* The act of producing/preparing food.
*/
public interface ICookAction extends ICreateAction{
	
	
	/**
	 * A sub property of instrument. The recipe/instructions used to perform the action.
	 *
	 */
	
	public Recipe getRecipe() throws ClassCastException;
	
	public void setRecipe(Recipe value) throws ClassCastException;
	/**
	 * A sub property of location. The specific food establishment where the action occurred.
	 *
	 */
	
	public <T> T getFoodEstablishment(Class<T> c) throws ClassCastException;
	
	public void setFoodEstablishment(Place value) throws ClassCastException;
	public void setFoodEstablishment(FoodEstablishment value) throws ClassCastException;
	/**
	 * A sub property of location. The specific food event where the action occurred.
	 *
	 */
	
	public FoodEvent getFoodEvent() throws ClassCastException;
	
	public void setFoodEvent(FoodEvent value) throws ClassCastException;
}
