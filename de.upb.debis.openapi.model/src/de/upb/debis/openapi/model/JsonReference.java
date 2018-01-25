/**
 */
package de.upb.debis.openapi.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.JsonReference#getRefref <em>Refref</em>}</li>
 * </ul>
 *
 * @see de.upb.debis.openapi.model.OpenapiPackage#getJsonReference()
 * @model
 * @generated
 */
public interface JsonReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Refref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refref</em>' attribute.
	 * @see #setRefref(String)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getJsonReference_Refref()
	 * @model required="true"
	 * @generated
	 */
	String getRefref();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.JsonReference#getRefref <em>Refref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refref</em>' attribute.
	 * @see #getRefref()
	 * @generated
	 */
	void setRefref(String value);

} // JsonReference
