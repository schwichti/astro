package org.schema;
/**
* The most generic type of item.
*/
public class Thing{
	
	
	/**
	* A description of the item.
	 *
	 * Ranges: Text
	 */
	private String _description;
	
	public String getDescription() throws ClassCastException{
		return (String) _description;
	}
	
	public void setDescription(String value) throws ClassCastException{
		_description = value;
	}
	/**
	* An image of the item. This can be a <a class="localLink" href="http://schema.org/URL">URL</a> or a fully described <a class="localLink" href="http://schema.org/ImageObject">ImageObject</a>.
	 *
	 * Ranges: ImageObject, URL
	 */
	private Object _image;
	
	public <T> T getImage(Class<T> c) throws ClassCastException{
		return (T) _image;
	}
	
	public void setImage(ImageObject value) throws ClassCastException{
		_image = value;
	}
	public void setImage(String value) throws ClassCastException{
		_image = value;
	}
	/**
	* A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
	 *
	 * Ranges: Text
	 */
	private String _disambiguatingDescription;
	
	public String getDisambiguatingDescription() throws ClassCastException{
		return (String) _disambiguatingDescription;
	}
	
	public void setDisambiguatingDescription(String value) throws ClassCastException{
		_disambiguatingDescription = value;
	}
	/**
	* URL of the item.
	 *
	 * Ranges: URL
	 */
	private String _url;
	
	public String getUrl() throws ClassCastException{
		return (String) _url;
	}
	
	public void setUrl(String value) throws ClassCastException{
		_url = value;
	}
	/**
	* Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See <a href="/docs/datamodel.html#mainEntityBackground">background notes</a> for details.
	 *
	 * Ranges: URL, CreativeWork
	 */
	private Object _mainEntityOfPage;
	
	public <T> T getMainEntityOfPage(Class<T> c) throws ClassCastException{
		return (T) _mainEntityOfPage;
	}
	
	public void setMainEntityOfPage(String value) throws ClassCastException{
		_mainEntityOfPage = value;
	}
	public void setMainEntityOfPage(CreativeWork value) throws ClassCastException{
		_mainEntityOfPage = value;
	}
	/**
	* Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
	 *
	 * Ranges: Action
	 */
	private Action _potentialAction;
	
	public Action getPotentialAction() throws ClassCastException{
		return (Action) _potentialAction;
	}
	
	public void setPotentialAction(Action value) throws ClassCastException{
		_potentialAction = value;
	}
	/**
	* The name of the item.
	 *
	 * Ranges: Text
	 */
	private String _name;
	
	public String getName() throws ClassCastException{
		return (String) _name;
	}
	
	public void setName(String value) throws ClassCastException{
		_name = value;
	}
	/**
	* An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
	 *
	 * Ranges: URL
	 */
	private String _additionalType;
	
	public String getAdditionalType() throws ClassCastException{
		return (String) _additionalType;
	}
	
	public void setAdditionalType(String value) throws ClassCastException{
		_additionalType = value;
	}
	/**
	* URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
	 *
	 * Ranges: URL
	 */
	private String _sameAs;
	
	public String getSameAs() throws ClassCastException{
		return (String) _sameAs;
	}
	
	public void setSameAs(String value) throws ClassCastException{
		_sameAs = value;
	}
	/**
	* The identifier property represents any kind of identifier for any kind of <a class="localLink" href="http://schema.org/Thing">Thing</a>, such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See <a href="/docs/datamodel.html#identifierBg">background notes</a> for more details.
	 *
	 * Ranges: URL, PropertyValue, Text
	 */
	private Object _identifier;
	
	public <T> T getIdentifier(Class<T> c) throws ClassCastException{
		return (T) _identifier;
	}
	
	public void setIdentifier(String value) throws ClassCastException{
		_identifier = value;
	}
	public void setIdentifier(PropertyValue value) throws ClassCastException{
		_identifier = value;
	}
	/**
	* An alias for the item.
	 *
	 * Ranges: Text
	 */
	private String _alternateName;
	
	public String getAlternateName() throws ClassCastException{
		return (String) _alternateName;
	}
	
	public void setAlternateName(String value) throws ClassCastException{
		_alternateName = value;
	}
}
