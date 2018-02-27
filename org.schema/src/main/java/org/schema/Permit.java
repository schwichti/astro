package org.schema;
/**
* A permit issued by an organization, e.g. a parking pass.
*/
public class Permit extends Intangible{
	
	
	/**
	* The target audience for this permit.
	 *
	 * Ranges: Audience
	 */
	private Audience _permitAudience;
	
	public Audience getPermitAudience() throws ClassCastException{
		return (Audience) _permitAudience;
	}
	
	public void setPermitAudience(Audience value) throws ClassCastException{
		_permitAudience = value;
	}
	/**
	* The service through with the permit was granted.
	 *
	 * Ranges: Service
	 */
	private Service _issuedThrough;
	
	public Service getIssuedThrough() throws ClassCastException{
		return (Service) _issuedThrough;
	}
	
	public void setIssuedThrough(Service value) throws ClassCastException{
		_issuedThrough = value;
	}
	/**
	* The date when the item becomes valid.
	 *
	 * Ranges: DateTime
	 */
	private java.util.Date _validFrom;
	
	public java.util.Date getValidFrom() throws ClassCastException{
		return (java.util.Date) _validFrom;
	}
	
	public void setValidFrom(java.util.Date value) throws ClassCastException{
		_validFrom = value;
	}
	/**
	* The geographic area where the permit is valid.
	 *
	 * Ranges: AdministrativeArea
	 */
	private AdministrativeArea _validIn;
	
	public AdministrativeArea getValidIn() throws ClassCastException{
		return (AdministrativeArea) _validIn;
	}
	
	public void setValidIn(AdministrativeArea value) throws ClassCastException{
		_validIn = value;
	}
	/**
	* The organization issuing the ticket or permit.
	 *
	 * Ranges: Organization
	 */
	private Organization _issuedBy;
	
	public Organization getIssuedBy() throws ClassCastException{
		return (Organization) _issuedBy;
	}
	
	public void setIssuedBy(Organization value) throws ClassCastException{
		_issuedBy = value;
	}
	/**
	* The time validity of the permit.
	 *
	 * Ranges: Duration
	 */
	private Duration _validFor;
	
	public Duration getValidFor() throws ClassCastException{
		return (Duration) _validFor;
	}
	
	public void setValidFor(Duration value) throws ClassCastException{
		_validFor = value;
	}
	/**
	* The date when the item is no longer valid.
	 *
	 * Ranges: Date
	 */
	private java.util.Date _validUntil;
	
	public java.util.Date getValidUntil() throws ClassCastException{
		return (java.util.Date) _validUntil;
	}
	
	public void setValidUntil(java.util.Date value) throws ClassCastException{
		_validUntil = value;
	}
}
