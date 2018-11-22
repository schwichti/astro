/**
 */
package owls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Construct List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link owls.ControlConstructList#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see owls.OwlsPackage#getControlConstructList()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ControlConstructList extends EObject {
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
	 * @see owls.OwlsPackage#getControlConstructList_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ControlConstruct> getComponents();

} // ControlConstructList
