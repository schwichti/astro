/**
 */
package de.upb.dbis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Data Parameter Sub Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#isRequired <em>Required</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getIn <em>In</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#isAllowEmptyValue <em>Allow Empty Value</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getFormat <em>Format</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getItems <em>Items</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema()
 * @model
 * @generated
 */
public interface FormDataParameterSubSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether or not this parameter is required or optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the location of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema_In()
	 * @model
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief description of the parameter. This could contain examples of use.  GitHub Flavored Markdown is allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Allow Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * allows sending a parameter by name only or with an empty value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Empty Value</em>' attribute.
	 * @see #setAllowEmptyValue(boolean)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema_AllowEmptyValue()
	 * @model
	 * @generated
	 */
	boolean isAllowEmptyValue();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#isAllowEmptyValue <em>Allow Empty Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Empty Value</em>' attribute.
	 * @see #isAllowEmptyValue()
	 * @generated
	 */
	void setAllowEmptyValue(boolean value);

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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(PrimitivesItems)
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema_Items()
	 * @model containment="true"
	 * @generated
	 */
	PrimitivesItems getItems();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.FormDataParameterSubSchema#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(PrimitivesItems value);

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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getFormDataParameterSubSchema_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

} // FormDataParameterSubSchema
