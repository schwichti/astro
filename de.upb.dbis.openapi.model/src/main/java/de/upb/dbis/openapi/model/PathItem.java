/**
 */
package de.upb.dbis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getPatternProperty <em>Pattern Property</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getGet <em>Get</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getPut <em>Put</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getPost <em>Post</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getDelete <em>Delete</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getOptions <em>Options</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getHead <em>Head</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getPatch <em>Patch</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getBodyParameter <em>Body Parameter</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getHeaderParameterSubSchema <em>Header Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getFormDataParameterSubSchema <em>Form Data Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getQueryParameterSubSchema <em>Query Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getPathParameterSubSchema <em>Path Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getJsonReference <em>Json Reference</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.PathItem#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem()
 * @model
 * @generated
 */
public interface PathItem extends EObject {
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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_PatternProperty()
	 * @model
	 * @generated
	 */
	String getPatternProperty();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.PathItem#getPatternProperty <em>Pattern Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Property</em>' attribute.
	 * @see #getPatternProperty()
	 * @generated
	 */
	void setPatternProperty(String value);

	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get</em>' containment reference.
	 * @see #setGet(Operation)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_Get()
	 * @model containment="true"
	 * @generated
	 */
	Operation getGet();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.PathItem#getGet <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' containment reference.
	 * @see #getGet()
	 * @generated
	 */
	void setGet(Operation value);

	/**
	 * Returns the value of the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Put</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Put</em>' containment reference.
	 * @see #setPut(Operation)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_Put()
	 * @model containment="true"
	 * @generated
	 */
	Operation getPut();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.PathItem#getPut <em>Put</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put</em>' containment reference.
	 * @see #getPut()
	 * @generated
	 */
	void setPut(Operation value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(Operation)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_Post()
	 * @model containment="true"
	 * @generated
	 */
	Operation getPost();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.PathItem#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(Operation value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(Operation)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_Delete()
	 * @model containment="true"
	 * @generated
	 */
	Operation getDelete();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.PathItem#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(Operation value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Operation)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_Options()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOptions();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.PathItem#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Operation value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(Operation)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_Head()
	 * @model containment="true"
	 * @generated
	 */
	Operation getHead();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.PathItem#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Operation value);

	/**
	 * Returns the value of the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patch</em>' containment reference.
	 * @see #setPatch(Operation)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_Patch()
	 * @model containment="true"
	 * @generated
	 */
	Operation getPatch();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.PathItem#getPatch <em>Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patch</em>' containment reference.
	 * @see #getPatch()
	 * @generated
	 */
	void setPatch(Operation value);

	/**
	 * Returns the value of the '<em><b>Body Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.dbis.openapi.model.BodyParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Parameter</em>' containment reference list.
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_BodyParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<BodyParameter> getBodyParameter();

	/**
	 * Returns the value of the '<em><b>Header Parameter Sub Schema</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.dbis.openapi.model.HeaderParameterSubSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Parameter Sub Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Parameter Sub Schema</em>' containment reference list.
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_HeaderParameterSubSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeaderParameterSubSchema> getHeaderParameterSubSchema();

	/**
	 * Returns the value of the '<em><b>Form Data Parameter Sub Schema</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.dbis.openapi.model.FormDataParameterSubSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Data Parameter Sub Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Data Parameter Sub Schema</em>' containment reference list.
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_FormDataParameterSubSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormDataParameterSubSchema> getFormDataParameterSubSchema();

	/**
	 * Returns the value of the '<em><b>Query Parameter Sub Schema</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.dbis.openapi.model.QueryParameterSubSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Parameter Sub Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Parameter Sub Schema</em>' containment reference list.
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_QueryParameterSubSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryParameterSubSchema> getQueryParameterSubSchema();

	/**
	 * Returns the value of the '<em><b>Path Parameter Sub Schema</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.dbis.openapi.model.PathParameterSubSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Parameter Sub Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Parameter Sub Schema</em>' containment reference list.
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_PathParameterSubSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathParameterSubSchema> getPathParameterSubSchema();

	/**
	 * Returns the value of the '<em><b>Json Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Reference</em>' containment reference.
	 * @see #setJsonReference(JsonReference)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_JsonReference()
	 * @model containment="true"
	 * @generated
	 */
	JsonReference getJsonReference();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.PathItem#getJsonReference <em>Json Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Reference</em>' containment reference.
	 * @see #getJsonReference()
	 * @generated
	 */
	void setJsonReference(JsonReference value);

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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getPathItem_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // PathItem
