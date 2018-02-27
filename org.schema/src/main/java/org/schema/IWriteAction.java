package org.schema;
/**
* The act of authoring written creative content.
*/
public interface IWriteAction extends ICreateAction{
	
	
	/**
	 * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/availableLanguage">availableLanguage</a>.
	 *
	 */
	
	public <T> T getInLanguage(Class<T> c) throws ClassCastException;
	
	public void setInLanguage(String value) throws ClassCastException;
	public void setInLanguage(Language value) throws ClassCastException;
	/**
	 * A sub property of instrument. The language used on this action.
	 *
	 */
	
	public Language getLanguage() throws ClassCastException;
	
	public void setLanguage(Language value) throws ClassCastException;
}
