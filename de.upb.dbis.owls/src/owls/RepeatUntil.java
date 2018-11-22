/**
 */
package owls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Until</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owls.RepeatUntil#getUntilProcess <em>Until Process</em>}</li>
 * </ul>
 *
 * @see owls.OwlsPackage#getRepeatUntil()
 * @model
 * @generated
 */
public interface RepeatUntil extends Iterate {
	/**
	 * Returns the value of the '<em><b>Until Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Process</em>' reference.
	 * @see #setUntilProcess(ControlConstruct)
	 * @see owls.OwlsPackage#getRepeatUntil_UntilProcess()
	 * @model
	 * @generated
	 */
	ControlConstruct getUntilProcess();

	/**
	 * Sets the value of the '{@link owls.RepeatUntil#getUntilProcess <em>Until Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Process</em>' reference.
	 * @see #getUntilProcess()
	 * @generated
	 */
	void setUntilProcess(ControlConstruct value);

} // RepeatUntil
