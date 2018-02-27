package org.schema;
/**
* An electronic file or document.
*/
public class DigitalDocument extends CreativeWork{
	
	
	/**
	* A permission related to the access to this document (e.g. permission to read or write an electronic document). For a public document, specify a grantee with an Audience with audienceType equal to "public".
	 *
	 * Ranges: DigitalDocumentPermission
	 */
	private DigitalDocumentPermission _hasDigitalDocumentPermission;
	
	public DigitalDocumentPermission getHasDigitalDocumentPermission() throws ClassCastException{
		return (DigitalDocumentPermission) _hasDigitalDocumentPermission;
	}
	
	public void setHasDigitalDocumentPermission(DigitalDocumentPermission value) throws ClassCastException{
		_hasDigitalDocumentPermission = value;
	}
}
