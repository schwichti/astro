package org.schema;
/**
* An electronic file or document.
*/
public interface IDigitalDocument extends ICreativeWork{
	
	
	/**
	 * A permission related to the access to this document (e.g. permission to read or write an electronic document). For a public document, specify a grantee with an Audience with audienceType equal to "public".
	 *
	 */
	
	public DigitalDocumentPermission getHasDigitalDocumentPermission() throws ClassCastException;
	
	public void setHasDigitalDocumentPermission(DigitalDocumentPermission value) throws ClassCastException;
}
