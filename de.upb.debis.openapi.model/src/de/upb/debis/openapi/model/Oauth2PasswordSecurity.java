/**
 */
package de.upb.debis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oauth2 Password Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getFlow <em>Flow</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getScopes <em>Scopes</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getTokenUrl <em>Token Url</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.debis.openapi.model.OpenapiPackage#getOauth2PasswordSecurity()
 * @model
 * @generated
 */
public interface Oauth2PasswordSecurity extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOauth2PasswordSecurity_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see #setFlow(String)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOauth2PasswordSecurity_Flow()
	 * @model required="true"
	 * @generated
	 */
	String getFlow();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scopes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference.
	 * @see #setScopes(Oauth2Scopes)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOauth2PasswordSecurity_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	Oauth2Scopes getScopes();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getScopes <em>Scopes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scopes</em>' containment reference.
	 * @see #getScopes()
	 * @generated
	 */
	void setScopes(Oauth2Scopes value);

	/**
	 * Returns the value of the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Url</em>' attribute.
	 * @see #setTokenUrl(String)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOauth2PasswordSecurity_TokenUrl()
	 * @model required="true"
	 * @generated
	 */
	String getTokenUrl();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getTokenUrl <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Url</em>' attribute.
	 * @see #getTokenUrl()
	 * @generated
	 */
	void setTokenUrl(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOauth2PasswordSecurity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Oauth2PasswordSecurity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOauth2PasswordSecurity_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // Oauth2PasswordSecurity
