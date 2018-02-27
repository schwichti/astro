package org.schema;
/**
* <p>The act of obtaining an object under an agreement to return it at a later date. Reciprocal of LendAction.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/LendAction">LendAction</a>: Reciprocal of BorrowAction.</li>
</ul>
*/
public class BorrowAction extends TransferAction{
	
	
	/**
	* A sub property of participant. The person that lends the object being borrowed.
	 *
	 * Ranges: Person, Organization
	 */
	private Object _lender;
	
	public <T> T getLender(Class<T> c) throws ClassCastException{
		return (T) _lender;
	}
	
	public void setLender(Person value) throws ClassCastException{
		_lender = value;
	}
	public void setLender(Organization value) throws ClassCastException{
		_lender = value;
	}
}
