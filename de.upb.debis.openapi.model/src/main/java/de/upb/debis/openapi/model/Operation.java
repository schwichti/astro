/**
 */
package de.upb.debis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getTags <em>Tags</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getSummary <em>Summary</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getBodyParameter <em>Body Parameter</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getHeaderParameterSubSchema <em>Header Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getFormDataParameterSubSchema <em>Form Data Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getQueryParameterSubSchema <em>Query Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getPathParameterSubSchema <em>Path Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getJsonReference <em>Json Reference</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getResponses <em>Responses</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Operation#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute.
	 * @see #setTags(String)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_Tags()
	 * @model
	 * @generated
	 */
	String getTags();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Operation#getTags <em>Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' attribute.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief summary of the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Operation#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A longer description of the operation, GitHub Flavored Markdown is allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Operation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_ExternalDocs()
	 * @model containment="true"
	 * @generated
	 */
	ExternalDocs getExternalDocs();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Operation#getExternalDocs <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Docs</em>' containment reference.
	 * @see #getExternalDocs()
	 * @generated
	 */
	void setExternalDocs(ExternalDocs value);

	/**
	 * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier of the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Id</em>' attribute.
	 * @see #setOperationId(String)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_OperationId()
	 * @model
	 * @generated
	 */
	String getOperationId();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Operation#getOperationId <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Id</em>' attribute.
	 * @see #getOperationId()
	 * @generated
	 */
	void setOperationId(String value);

	/**
	 * Returns the value of the '<em><b>Body Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.debis.openapi.model.BodyParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Parameter</em>' containment reference list.
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_BodyParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<BodyParameter> getBodyParameter();

	/**
	 * Returns the value of the '<em><b>Header Parameter Sub Schema</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.debis.openapi.model.HeaderParameterSubSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Parameter Sub Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Parameter Sub Schema</em>' containment reference list.
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_HeaderParameterSubSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeaderParameterSubSchema> getHeaderParameterSubSchema();

	/**
	 * Returns the value of the '<em><b>Form Data Parameter Sub Schema</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.debis.openapi.model.FormDataParameterSubSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Data Parameter Sub Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Data Parameter Sub Schema</em>' containment reference list.
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_FormDataParameterSubSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormDataParameterSubSchema> getFormDataParameterSubSchema();

	/**
	 * Returns the value of the '<em><b>Query Parameter Sub Schema</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.debis.openapi.model.QueryParameterSubSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Parameter Sub Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Parameter Sub Schema</em>' containment reference list.
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_QueryParameterSubSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryParameterSubSchema> getQueryParameterSubSchema();

	/**
	 * Returns the value of the '<em><b>Path Parameter Sub Schema</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.debis.openapi.model.PathParameterSubSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Parameter Sub Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Parameter Sub Schema</em>' containment reference list.
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_PathParameterSubSchema()
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
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_JsonReference()
	 * @model containment="true"
	 * @generated
	 */
	JsonReference getJsonReference();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Operation#getJsonReference <em>Json Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Reference</em>' containment reference.
	 * @see #getJsonReference()
	 * @generated
	 */
	void setJsonReference(JsonReference value);

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference.
	 * @see #setResponses(Responses)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_Responses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Responses getResponses();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Operation#getResponses <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responses</em>' containment reference.
	 * @see #getResponses()
	 * @generated
	 */
	void setResponses(Responses value);

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(boolean)
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_Deprecated()
	 * @model
	 * @generated
	 */
	boolean isDeprecated();

	/**
	 * Sets the value of the '{@link de.upb.debis.openapi.model.Operation#isDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #isDeprecated()
	 * @generated
	 */
	void setDeprecated(boolean value);

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
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getOperation_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // Operation
