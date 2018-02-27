package org.schema;
/**
* A permit issued by an organization, e.g. a parking pass.
*/
public interface IPermit extends IIntangible{
	
	
	/**
	 * The target audience for this permit.
	 *
	 */
	
	public Audience getPermitAudience() throws ClassCastException;
	
	public void setPermitAudience(Audience value) throws ClassCastException;
	/**
	 * The service through with the permit was granted.
	 *
	 */
	
	public Service getIssuedThrough() throws ClassCastException;
	
	public void setIssuedThrough(Service value) throws ClassCastException;
	/**
	 * The date when the item becomes valid.
	 *
	 */
	
	public java.util.Date getValidFrom() throws ClassCastException;
	
	public void setValidFrom(java.util.Date value) throws ClassCastException;
	/**
	 * The geographic area where the permit is valid.
	 *
	 */
	
	public AdministrativeArea getValidIn() throws ClassCastException;
	
	public void setValidIn(AdministrativeArea value) throws ClassCastException;
	/**
	 * The organization issuing the ticket or permit.
	 *
	 */
	
	public Organization getIssuedBy() throws ClassCastException;
	
	public void setIssuedBy(Organization value) throws ClassCastException;
	/**
	 * The time validity of the permit.
	 *
	 */
	
	public Duration getValidFor() throws ClassCastException;
	
	public void setValidFor(Duration value) throws ClassCastException;
	/**
	 * The date when the item is no longer valid.
	 *
	 */
	
	public java.util.Date getValidUntil() throws ClassCastException;
	
	public void setValidUntil(java.util.Date value) throws ClassCastException;
}
