/**
 */
package de.upb.debis.openapi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paths</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relative paths to the individual endpoints. They must be relative to the 'basePath'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.Paths#getVendorExtension <em>Vendor Extension</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.Paths#getPathItem <em>Path Item</em>}</li>
 * </ul>
 *
 * @see de.upb.debis.openapi.model.OpenapiPackage#getPaths()
 * @model
 * @generated
 */
public interface Paths extends EObject {
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
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getPaths_VendorExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendorExtension> getVendorExtension();

	/**
	 * Returns the value of the '<em><b>Path Item</b></em>' containment reference list.
	 * The list contents are of type {@link de.upb.debis.openapi.model.PathItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Item</em>' containment reference list.
	 * @see de.upb.debis.openapi.model.OpenapiPackage#getPaths_PathItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathItem> getPathItem();

} // Paths
