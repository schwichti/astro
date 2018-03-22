/**
 */
package de.upb.dbis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deterministic version of a JSON Schema object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.FileSchema#getFormat <em>Format</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FileSchema#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FileSchema#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FileSchema#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FileSchema#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFileSchema()
 * @model
 * @generated
 */
public interface FileSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFileSchema_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FileSchema#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFileSchema_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FileSchema#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFileSchema_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FileSchema#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Docs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Docs</em>' containment reference.
	 * @see #setExternalDocs(ExternalDocs)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFileSchema_ExternalDocs()
	 * @model containment="true"
	 * @generated
	 */
	ExternalDocs getExternalDocs();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FileSchema#getExternalDocs <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Docs</em>' containment reference.
	 * @see #getExternalDocs()
	 * @generated
	 */
	void setExternalDocs(ExternalDocs value);

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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFileSchema_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // FileSchema
