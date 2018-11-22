/**
 */
package owls;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owls.CompositeProcess#getComposedOf <em>Composed Of</em>}</li>
 * </ul>
 *
 * @see owls.OwlsPackage#getCompositeProcess()
 * @model
 * @generated
 */
public interface CompositeProcess extends owls.Process {
	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference.
	 * @see #setComposedOf(ControlConstruct)
	 * @see owls.OwlsPackage#getCompositeProcess_ComposedOf()
	 * @model containment="true"
	 * @generated
	 */
	ControlConstruct getComposedOf();

	/**
	 * Sets the value of the '{@link owls.CompositeProcess#getComposedOf <em>Composed Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed Of</em>' containment reference.
	 * @see #getComposedOf()
	 * @generated
	 */
	void setComposedOf(ControlConstruct value);

} // CompositeProcess
