/**
 */
package owls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owls.RepeatWhile#getWhileProcess <em>While Process</em>}</li>
 * </ul>
 *
 * @see owls.OwlsPackage#getRepeatWhile()
 * @model
 * @generated
 */
public interface RepeatWhile extends Iterate {
	/**
	 * Returns the value of the '<em><b>While Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Process</em>' reference.
	 * @see #setWhileProcess(ControlConstruct)
	 * @see owls.OwlsPackage#getRepeatWhile_WhileProcess()
	 * @model
	 * @generated
	 */
	ControlConstruct getWhileProcess();

	/**
	 * Sets the value of the '{@link owls.RepeatWhile#getWhileProcess <em>While Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Process</em>' reference.
	 * @see #getWhileProcess()
	 * @generated
	 */
	void setWhileProcess(ControlConstruct value);

} // RepeatWhile
