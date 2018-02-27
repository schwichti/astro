package org.schema;
/**
* The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.
*/
public class CommunicateAction extends InteractAction{
	
	
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
	* The subject matter of the content.
	 *
	 * Ranges: Thing
	 */
	private Thing _about;
	
	public Thing getAbout() throws ClassCastException{
		return (Thing) _about;
	}
	
	public void setAbout(Thing value) throws ClassCastException{
		_about = value;
	}
	/**
	* A sub property of participant. The participant who is at the receiving end of the action.
	 *
	 * Ranges: ContactPoint, Person, Organization, Audience
	 */
	private Object _recipient;
	
	public <T> T getRecipient(Class<T> c) throws ClassCastException{
		return (T) _recipient;
	}
	
	public void setRecipient(ContactPoint value) throws ClassCastException{
		_recipient = value;
	}
	public void setRecipient(Person value) throws ClassCastException{
		_recipient = value;
	}
	public void setRecipient(Organization value) throws ClassCastException{
		_recipient = value;
	}
	public void setRecipient(Audience value) throws ClassCastException{
		_recipient = value;
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
