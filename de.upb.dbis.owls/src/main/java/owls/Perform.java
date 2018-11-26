/**
 */
package owls;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owls.Perform#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see owls.OwlsPackage#getPerform()
 * @model
 * @generated
 */
public interface Perform extends ControlConstruct {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(owls.Process)
	 * @see owls.OwlsPackage#getPerform_Process()
	 * @model
	 * @generated
	 */
	owls.Process getProcess();

	/**
	 * Sets the value of the '{@link owls.Perform#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(owls.Process value);

} // Perform
