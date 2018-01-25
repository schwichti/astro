/**
 */
package de.upb.debis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Response objects names can either be any valid HTTP status code or 'default'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.Responses#getResponseValue <em>Response Value</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Responses#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.debis.openapi.model.OpenapiPackage#getResponses()
 * @model
 * @generated
 */
public interface Responses extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Value</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.debis.openapi.model.ResponseValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Value</em>' containment reference list.
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getResponses_ResponseValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResponseValue> getResponseValue();

	/**
	 * Returns the value of the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.debis.openapi.model.VendorExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Extension</em>' containment reference list.
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getResponses_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // Responses
