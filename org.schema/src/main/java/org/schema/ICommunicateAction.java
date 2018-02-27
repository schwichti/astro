package org.schema;
/**
* The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.
*/
public interface ICommunicateAction extends IInteractAction{
	
	
	/**
	 * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="http://schema.org/availableLanguage">availableLanguage</a>.
	 *
	 */
	
	public <T> T getInLanguage(Class<T> c) throws ClassCastException;
	
	public void setInLanguage(String value) throws ClassCastException;
	public void setInLanguage(Language value) throws ClassCastException;
	/**
	 * The subject matter of the content.
	 *
	 */
	
	public Thing getAbout() throws ClassCastException;
	
	public void setAbout(Thing value) throws ClassCastException;
	/**
	 * A sub property of participant. The participant who is at the receiving end of the action.
	 *
	 */
	
	public <T> T getRecipient(Class<T> c) throws ClassCastException;
	
	public void setRecipient(ContactPoint value) throws ClassCastException;
	public void setRecipient(Person value) throws ClassCastException;
	public void setRecipient(Organization value) throws ClassCastException;
	public void setRecipient(Audience value) throws ClassCastException;
	/**
	 * A sub property of instrument. The language used on this action.
	 *
	 */
	
	public Language getLanguage() throws ClassCastException;
	
	public void setLanguage(Language value) throws ClassCastException;
}
