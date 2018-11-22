/**
 */
package owls;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owls.IfThenElse#getThen <em>Then</em>}</li>
 *   <li>{@link owls.IfThenElse#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see owls.OwlsPackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends ControlConstruct {
	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference.
	 * @see #setThen(ControlConstruct)
	 * @see owls.OwlsPackage#getIfThenElse_Then()
	 * @model required="true"
	 * @generated
	 */
	ControlConstruct getThen();

	/**
	 * Sets the value of the '{@link owls.IfThenElse#getThen <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(ControlConstruct value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(ControlConstruct)
	 * @see owls.OwlsPackage#getIfThenElse_Else()
	 * @model required="true"
	 * @generated
	 */
	ControlConstruct getElse();

	/**
	 * Sets the value of the '{@link owls.IfThenElse#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(ControlConstruct value);

} // IfThenElse
