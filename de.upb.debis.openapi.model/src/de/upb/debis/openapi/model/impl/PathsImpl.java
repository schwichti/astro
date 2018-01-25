/**
 */
package de.upb.debis.openapi.model.impl;

import de.upb.debis.openapi.model.OpenapiPackage;
import de.upb.debis.openapi.model.PathItem;
import de.upb.debis.openapi.model.Paths;
import de.upb.debis.openapi.model.VendorExtension;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paths</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.impl.PathsImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.PathsImpl#getPathItem <em>Path Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathsImpl extends MinimalEObjectImpl.Container implements Paths {
	/**
	 * The cached value of the '{@link #getVendorExtension() <em>Vendor Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<VendorExtension> vendorExtension;

	/**
	 * The cached value of the '{@link #getPathItem() <em>Path Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathItem()
	 * @generated
	 * @ordered
	 */
	protected EList<PathItem> pathItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.PATHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.PATHS__VENDOR_EXTENSION);
		}
		return vendorExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathItem> getPathItem() {
		if (pathItem == null) {
			pathItem = new EObjectContainmentEList<PathItem>(PathItem.class, this, OpenapiPackage.PATHS__PATH_ITEM);
		}
		return pathItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenapiPackage.PATHS__VENDOR_EXTENSION:
				return ((InternalEList<?>)getVendorExtension()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.PATHS__PATH_ITEM:
				return ((InternalEList<?>)getPathItem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenapiPackage.PATHS__VENDOR_EXTENSION:
				return getVendorExtension();
			case OpenapiPackage.PATHS__PATH_ITEM:
				return getPathItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenapiPackage.PATHS__VENDOR_EXTENSION:
				getVendorExtension().clear();
				getVendorExtension().addAll((Collection<? extends VendorExtension>)newValue);
				return;
			case OpenapiPackage.PATHS__PATH_ITEM:
				getPathItem().clear();
				getPathItem().addAll((Collection<? extends PathItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenapiPackage.PATHS__VENDOR_EXTENSION:
				getVendorExtension().clear();
				return;
			case OpenapiPackage.PATHS__PATH_ITEM:
				getPathItem().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenapiPackage.PATHS__VENDOR_EXTENSION:
				return vendorExtension != null && !vendorExtension.isEmpty();
			case OpenapiPackage.PATHS__PATH_ITEM:
				return pathItem != null && !pathItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PathsImpl
