/**
 */
package de.upb.dbis.openapi.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.ResponseValue#getPatternProperty <em>Pattern Property</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.ResponseValue#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponseValue()
 * @model
 * @generated
 */
public interface ResponseValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Property</em>' attribute.
	 * @see #setPatternProperty(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponseValue_PatternProperty()
	 * @model
	 * @generated
	 */
	String getPatternProperty();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.ResponseValue#getPatternProperty <em>Pattern Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Property</em>' attribute.
	 * @see #getPatternProperty()
	 * @generated
	 */
	void setPatternProperty(String value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Response)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponseValue_Response()
	 * @model containment="true"
	 * @generated
	 */
	Response getResponse();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.ResponseValue#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Response value);

} // ResponseValue
