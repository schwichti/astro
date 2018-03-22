/**
 */
package de.upb.dbis.openapi.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendor Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any property starting with x- is valid.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.VendorExtension#getPatternProperty <em>Pattern Property</em>}</li>
 * </ul>
 *
 * @see de.upb.dbis.openapi.model.OpenapiPackage#getVendorExtension()
 * @model
 * @generated
 */
public interface VendorExtension extends EObject {
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
	 * @see de.upb.dbis.openapi.model.OpenapiPackage#getVendorExtension_PatternProperty()
	 * @model
	 * @generated
	 */
	String getPatternProperty();

	/**
	 * Sets the value of the '{@link de.upb.dbis.openapi.model.VendorExtension#getPatternProperty <em>Pattern Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Property</em>' attribute.
	 * @see #getPatternProperty()
	 * @generated
	 */
	void setPatternProperty(String value);

} // VendorExtension
