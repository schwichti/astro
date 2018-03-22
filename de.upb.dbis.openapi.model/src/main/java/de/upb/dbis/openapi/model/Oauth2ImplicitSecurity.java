/**
 */
package de.upb.dbis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oauth2 Implicit Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getFlow <em>Flow</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getScopes <em>Scopes</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.dbis.openapi.model.OpenapiPackage#getOauth2ImplicitSecurity()
 * @model
 * @generated
 */
public interface Oauth2ImplicitSecurity extends EObject {
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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getOauth2ImplicitSecurity_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getType <em>Type</em>}' attribute.
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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getOauth2ImplicitSecurity_Flow()
	 * @model required="true"
	 * @generated
	 */
	String getFlow();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getFlow <em>Flow</em>}' attribute.
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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getOauth2ImplicitSecurity_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	Oauth2Scopes getScopes();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getScopes <em>Scopes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scopes</em>' containment reference.
	 * @see #getScopes()
	 * @generated
	 */
	void setScopes(Oauth2Scopes value);

	/**
	 * Returns the value of the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Url</em>' attribute.
	 * @see #setAuthorizationUrl(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getOauth2ImplicitSecurity_AuthorizationUrl()
	 * @model required="true"
	 * @generated
	 */
	String getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getAuthorizationUrl <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Url</em>' attribute.
	 * @see #getAuthorizationUrl()
	 * @generated
	 */
	void setAuthorizationUrl(String value);

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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getOauth2ImplicitSecurity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Oauth2ImplicitSecurity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Extension</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.dbis.openapi.model.VendorExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Extension</em>' containment reference list.
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getOauth2ImplicitSecurity_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // Oauth2ImplicitSecurity
