package org.schema;
/**
* <p>The act of providing an object under an agreement that it will be returned at a later date. Reciprocal of BorrowAction.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/BorrowAction">BorrowAction</a>: Reciprocal of LendAction.</li>
</ul>
*/
public class LendAction extends TransferAction{
	
	
	/**
	* A sub property of participant. The person that borrows the object being lent.
	 *
	 * Ranges: Person
	 */
	private Person _borrower;
	
	public Person getBorrower() throws ClassCastException{
		return (Person) _borrower;
	}
	
	public void setBorrower(Person value) throws ClassCastException{
		_borrower = value;
	}
}
