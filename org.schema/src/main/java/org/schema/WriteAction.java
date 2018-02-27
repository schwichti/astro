package org.schema;
/**
* The act of authoring written creative content.
*/
public class WriteAction extends CreateAction{
	
	
	/**
	* The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/availableLanguage">availableLanguage</a>.
	 *
	 * Ranges: Text, Language
	 */
	private Object _inLanguage;
	
	public <T> T getInLanguage(Class<T> c) throws ClassCastException{
		return (T) _inLanguage;
	}
	
	public void setInLanguage(String value) throws ClassCastException{
		_inLanguage = value;
	}
	public void setInLanguage(Language value) throws ClassCastException{
		_inLanguage = value;
	}
	/**
	* A sub property of instrument. The language used on this action.
	 *
	 * Ranges: Language
	 */
	private Language _language;
	
	public Language getLanguage() throws ClassCastException{
		return (Language) _language;
	}
	
	public void setLanguage(Language value) throws ClassCastException{
		_language = value;
	}
}
