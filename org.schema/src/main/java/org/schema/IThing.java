package org.schema;
/**
* The most generic type of item.
*/
public interface IThing{
	
	
	/**
	 * A description of the item.
	 *
	 */
	
	public String getDescription() throws ClassCastException;
	
	public void setDescription(String value) throws ClassCastException;
	/**
	 * An image of the item. This can be a <a class="localLink" href="http://schema.org/URL">URL</a> or a fully described <a class="localLink" href="http://schema.org/ImageObject">ImageObject</a>.
	 *
	 */
	
	public <T> T getImage(Class<T> c) throws ClassCastException;
	
	public void setImage(ImageObject value) throws ClassCastException;
	public void setImage(String value) throws ClassCastException;
	/**
	 * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
	 *
	 */
	
	public String getDisambiguatingDescription() throws ClassCastException;
	
	public void setDisambiguatingDescription(String value) throws ClassCastException;
	/**
	 * URL of the item.
	 *
	 */
	
	public String getUrl() throws ClassCastException;
	
	public void setUrl(String value) throws ClassCastException;
	/**
	 * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See <a href="/docs/datamodel.html#mainEntityBackground">background notes</a> for details.
	 *
	 */
	
	public <T> T getMainEntityOfPage(Class<T> c) throws ClassCastException;
	
	public void setMainEntityOfPage(String value) throws ClassCastException;
	public void setMainEntityOfPage(CreativeWork value) throws ClassCastException;
	/**
	 * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
	 *
	 */
	
	public Action getPotentialAction() throws ClassCastException;
	
	public void setPotentialAction(Action value) throws ClassCastException;
	/**
	 * The name of the item.
	 *
	 */
	
	public String getName() throws ClassCastException;
	
	public void setName(String value) throws ClassCastException;
	/**
	 * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
	 *
	 */
	
	public String getAdditionalType() throws ClassCastException;
	
	public void setAdditionalType(String value) throws ClassCastException;
	/**
	 * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
	 *
	 */
	
	public String getSameAs() throws ClassCastException;
	
	public void setSameAs(String value) throws ClassCastException;
	/**
	 * The identifier property represents any kind of identifier for any kind of <a class="localLink" href="http://schema.org/Thing">Thing</a>, such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See <a href="/docs/datamodel.html#identifierBg">background notes</a> for more details.
	 *
	 */
	
	public <T> T getIdentifier(Class<T> c) throws ClassCastException;
	
	public void setIdentifier(String value) throws ClassCastException;
	public void setIdentifier(PropertyValue value) throws ClassCastException;
	/**
	 * An alias for the item.
	 *
	 */
	
	public String getAlternateName() throws ClassCastException;
	
	public void setAlternateName(String value) throws ClassCastException;
}
