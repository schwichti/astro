/**
 */
package de.upb.dbis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General information about the API.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.Info#getTitle <em>Title</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Info#getVersion <em>Version</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Info#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Info#getTermsOfService <em>Terms Of Service</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Info#getContact <em>Contact</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Info#getLicense <em>License</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Info#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.dbis.openapi.model.OpenapiPackage#getInfo()
 * @model
 * @generated
 */
public interface Info extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique and precise title of the API.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getInfo_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Info#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A semantic version number of the API.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getInfo_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Info#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A longer description of the API. Should be different from the title.  GitHub Flavored Markdown is allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getInfo_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Info#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Terms Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The terms of service for the API.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terms Of Service</em>' attribute.
	 * @see #setTermsOfService(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getInfo_TermsOfService()
	 * @model
	 * @generated
	 */
	String getTermsOfService();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Info#getTermsOfService <em>Terms Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms Of Service</em>' attribute.
	 * @see #getTermsOfService()
	 * @generated
	 */
	void setTermsOfService(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(Contact)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getInfo_Contact()
	 * @model containment="true"
	 * @generated
	 */
	Contact getContact();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Info#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(Contact value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(License)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getInfo_License()
	 * @model containment="true"
	 * @generated
	 */
	License getLicense();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Info#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(License value);

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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getInfo_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // Info
