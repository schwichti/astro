/**
 */
package owls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owls.ControlConstruct#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link owls.ControlConstruct#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see owls.OwlsPackage#getControlConstruct()
 * @model
 * @generated
 */
public interface ControlConstruct extends EObject {
	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' reference list.
	 * The list contents are of type {@link owls.ControlConstruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' reference list.
	 * @see owls.OwlsPackage#getControlConstruct_ComposedOf()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ControlConstruct> getComposedOf();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link owls.ControlConstruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see owls.OwlsPackage#getControlConstruct_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ControlConstruct> getComponents();

} // ControlConstruct
