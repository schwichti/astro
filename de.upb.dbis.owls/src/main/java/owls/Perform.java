/**
 */
package owls;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Process</b></em>' reference list.
	 * The list contents are of type {@link owls.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference list.
	 * @see owls.OwlsPackage#getPerform_Process()
	 * @model
	 * @generated
	 */
	EList<owls.Process> getProcess();

} // Perform
