package org.schema;
/**
* Nutritional information about the recipe.
*/
public interface INutritionInformation extends IStructuredValue{
	
	
	/**
	 * The number of grams of protein.
	 *
	 */
	
	public Mass getProteinContent() throws ClassCastException;
	
	public void setProteinContent(Mass value) throws ClassCastException;
	/**
	 * The number of grams of sugar.
	 *
	 */
	
	public Mass getSugarContent() throws ClassCastException;
	
	public void setSugarContent(Mass value) throws ClassCastException;
	/**
	 * The number of grams of unsaturated fat.
	 *
	 */
	
	public Mass getUnsaturatedFatContent() throws ClassCastException;
	
	public void setUnsaturatedFatContent(Mass value) throws ClassCastException;
	/**
	 * The number of calories.
	 *
	 */
	
	public Energy getCalories() throws ClassCastException;
	
	public void setCalories(Energy value) throws ClassCastException;
	/**
	 * The number of grams of saturated fat.
	 *
	 */
	
	public Mass getSaturatedFatContent() throws ClassCastException;
	
	public void setSaturatedFatContent(Mass value) throws ClassCastException;
	/**
	 * The serving size, in terms of the number of volume or mass.
	 *
	 */
	
	public String getServingSize() throws ClassCastException;
	
	public void setServingSize(String value) throws ClassCastException;
	/**
	 * The number of grams of fiber.
	 *
	 */
	
	public Mass getFiberContent() throws ClassCastException;
	
	public void setFiberContent(Mass value) throws ClassCastException;
	/**
	 * The number of grams of carbohydrates.
	 *
	 */
	
	public Mass getCarbohydrateContent() throws ClassCastException;
	
	public void setCarbohydrateContent(Mass value) throws ClassCastException;
	/**
	 * The number of grams of fat.
	 *
	 */
	
	public Mass getFatContent() throws ClassCastException;
	
	public void setFatContent(Mass value) throws ClassCastException;
	/**
	 * The number of grams of trans fat.
	 *
	 */
	
	public Mass getTransFatContent() throws ClassCastException;
	
	public void setTransFatContent(Mass value) throws ClassCastException;
	/**
	 * The number of milligrams of cholesterol.
	 *
	 */
	
	public Mass getCholesterolContent() throws ClassCastException;
	
	public void setCholesterolContent(Mass value) throws ClassCastException;
	/**
	 * The number of milligrams of sodium.
	 *
	 */
	
	public Mass getSodiumContent() throws ClassCastException;
	
	public void setSodiumContent(Mass value) throws ClassCastException;
}
