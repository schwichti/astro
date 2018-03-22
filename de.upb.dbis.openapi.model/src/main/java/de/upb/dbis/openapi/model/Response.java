/**
 */
package de.upb.dbis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.Response#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Response#getSchema <em>Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Response#getFileSchema <em>File Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Response#getHeaders <em>Headers</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Response#getExamples <em>Examples</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.Response#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject {
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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponse_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Response#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(Schema)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponse_Schema()
	 * @model containment="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Response#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>File Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Schema</em>' containment reference.
	 * @see #setFileSchema(FileSchema)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponse_FileSchema()
	 * @model containment="true"
	 * @generated
	 */
	FileSchema getFileSchema();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Response#getFileSchema <em>File Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Schema</em>' containment reference.
	 * @see #getFileSchema()
	 * @generated
	 */
	void setFileSchema(FileSchema value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference.
	 * @see #setHeaders(Headers)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponse_Headers()
	 * @model containment="true"
	 * @generated
	 */
	Headers getHeaders();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Response#getHeaders <em>Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' containment reference.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(Headers value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference.
	 * @see #setExamples(Examples)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponse_Examples()
	 * @model containment="true"
	 * @generated
	 */
	Examples getExamples();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.Response#getExamples <em>Examples</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examples</em>' containment reference.
	 * @see #getExamples()
	 * @generated
	 */
	void setExamples(Examples value);

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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getResponse_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // Response
