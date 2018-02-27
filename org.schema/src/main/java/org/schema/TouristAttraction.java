package org.schema;
/**
* A tourist attraction.  In principle any Thing can be a <a class="localLink" href="http://schema.org/TouristAttraction">TouristAttraction</a>, from a <a class="localLink" href="http://schema.org/Mountain">Mountain</a> and <a class="localLink" href="http://schema.org/LandmarksOrHistoricalBuildings">LandmarksOrHistoricalBuildings</a> to a <a class="localLink" href="http://schema.org/LocalBusiness">LocalBusiness</a>.  This Type can be used on its own to describe a general <a class="localLink" href="http://schema.org/TourstAttraction">TourstAttraction</a>, or be used as an <a class="localLink" href="http://schema.org/additionalType">additionalType</a> to add tourist attraction properties to any other type.  (See examples below)
*/
public class TouristAttraction extends Place{
	
	
	/**
	* Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc.
	 *
	 * Ranges: Text, Audience
	 */
	private Object _touristType;
	
	public <T> T getTouristType(Class<T> c) throws ClassCastException{
		return (T) _touristType;
	}
	
	public void setTouristType(String value) throws ClassCastException{
		_touristType = value;
	}
	public void setTouristType(Audience value) throws ClassCastException{
		_touristType = value;
	}
	/**
	* A language someone may use with or at the item, service or place. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/inLanguage">inLanguage</a>
	 *
	 * Ranges: Language, Text
	 */
	private Object _availableLanguage;
	
	public <T> T getAvailableLanguage(Class<T> c) throws ClassCastException{
		return (T) _availableLanguage;
	}
	
	public void setAvailableLanguage(Language value) throws ClassCastException{
		_availableLanguage = value;
	}
	public void setAvailableLanguage(String value) throws ClassCastException{
		_availableLanguage = value;
	}
}
