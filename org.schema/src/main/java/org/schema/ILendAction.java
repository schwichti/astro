package org.schema;
/**
* <p>The act of providing an object under an agreement that it will be returned at a later date. Reciprocal of BorrowAction.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/BorrowAction">BorrowAction</a>: Reciprocal of LendAction.</li>
</ul>
*/
public interface ILendAction extends ITransferAction{
	
	
	/**
	 * A sub property of participant. The person that borrows the object being lent.
	 *
	 */
	
	public Person getBorrower() throws ClassCastException;
	
	public void setBorrower(Person value) throws ClassCastException;
}
