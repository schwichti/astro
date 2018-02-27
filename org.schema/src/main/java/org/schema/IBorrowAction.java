package org.schema;
/**
* <p>The act of obtaining an object under an agreement to return it at a later date. Reciprocal of LendAction.</p>

<p>Related actions:</p>

<ul>
<li><a class="localLink" href="http://schema.org/LendAction">LendAction</a>: Reciprocal of BorrowAction.</li>
</ul>
*/
public interface IBorrowAction extends ITransferAction{
	
	
	/**
	 * A sub property of participant. The person that lends the object being borrowed.
	 *
	 */
	
	public <T> T getLender(Class<T> c) throws ClassCastException;
	
	public void setLender(Person value) throws ClassCastException;
	public void setLender(Organization value) throws ClassCastException;
}
