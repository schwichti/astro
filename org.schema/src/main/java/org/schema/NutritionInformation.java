package org.schema;
/**
* Nutritional information about the recipe.
*/
public class NutritionInformation extends StructuredValue{
	
	
	/**
	* The number of grams of protein.
	 *
	 * Ranges: Mass
	 */
	private Mass _proteinContent;
	
	public Mass getProteinContent() throws ClassCastException{
		return (Mass) _proteinContent;
	}
	
	public void setProteinContent(Mass value) throws ClassCastException{
		_proteinContent = value;
	}
	/**
	* The number of grams of sugar.
	 *
	 * Ranges: Mass
	 */
	private Mass _sugarContent;
	
	public Mass getSugarContent() throws ClassCastException{
		return (Mass) _sugarContent;
	}
	
	public void setSugarContent(Mass value) throws ClassCastException{
		_sugarContent = value;
	}
	/**
	* The number of grams of unsaturated fat.
	 *
	 * Ranges: Mass
	 */
	private Mass _unsaturatedFatContent;
	
	public Mass getUnsaturatedFatContent() throws ClassCastException{
		return (Mass) _unsaturatedFatContent;
	}
	
	public void setUnsaturatedFatContent(Mass value) throws ClassCastException{
		_unsaturatedFatContent = value;
	}
	/**
	* The number of calories.
	 *
	 * Ranges: Energy
	 */
	private Energy _calories;
	
	public Energy getCalories() throws ClassCastException{
		return (Energy) _calories;
	}
	
	public void setCalories(Energy value) throws ClassCastException{
		_calories = value;
	}
	/**
	* The number of grams of saturated fat.
	 *
	 * Ranges: Mass
	 */
	private Mass _saturatedFatContent;
	
	public Mass getSaturatedFatContent() throws ClassCastException{
		return (Mass) _saturatedFatContent;
	}
	
	public void setSaturatedFatContent(Mass value) throws ClassCastException{
		_saturatedFatContent = value;
	}
	/**
	* The serving size, in terms of the number of volume or mass.
	 *
	 * Ranges: Text
	 */
	private String _servingSize;
	
	public String getServingSize() throws ClassCastException{
		return (String) _servingSize;
	}
	
	public void setServingSize(String value) throws ClassCastException{
		_servingSize = value;
	}
	/**
	* The number of grams of fiber.
	 *
	 * Ranges: Mass
	 */
	private Mass _fiberContent;
	
	public Mass getFiberContent() throws ClassCastException{
		return (Mass) _fiberContent;
	}
	
	public void setFiberContent(Mass value) throws ClassCastException{
		_fiberContent = value;
	}
	/**
	* The number of grams of carbohydrates.
	 *
	 * Ranges: Mass
	 */
	private Mass _carbohydrateContent;
	
	public Mass getCarbohydrateContent() throws ClassCastException{
		return (Mass) _carbohydrateContent;
	}
	
	public void setCarbohydrateContent(Mass value) throws ClassCastException{
		_carbohydrateContent = value;
	}
	/**
	* The number of grams of fat.
	 *
	 * Ranges: Mass
	 */
	private Mass _fatContent;
	
	public Mass getFatContent() throws ClassCastException{
		return (Mass) _fatContent;
	}
	
	public void setFatContent(Mass value) throws ClassCastException{
		_fatContent = value;
	}
	/**
	* The number of grams of trans fat.
	 *
	 * Ranges: Mass
	 */
	private Mass _transFatContent;
	
	public Mass getTransFatContent() throws ClassCastException{
		return (Mass) _transFatContent;
	}
	
	public void setTransFatContent(Mass value) throws ClassCastException{
		_transFatContent = value;
	}
	/**
	* The number of milligrams of cholesterol.
	 *
	 * Ranges: Mass
	 */
	private Mass _cholesterolContent;
	
	public Mass getCholesterolContent() throws ClassCastException{
		return (Mass) _cholesterolContent;
	}
	
	public void setCholesterolContent(Mass value) throws ClassCastException{
		_cholesterolContent = value;
	}
	/**
	* The number of milligrams of sodium.
	 *
	 * Ranges: Mass
	 */
	private Mass _sodiumContent;
	
	public Mass getSodiumContent() throws ClassCastException{
		return (Mass) _sodiumContent;
	}
	
	public void setSodiumContent(Mass value) throws ClassCastException{
		_sodiumContent = value;
	}
}
