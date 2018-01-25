/**
 */
package de.upb.debis.openapi.model.impl;

import de.upb.debis.openapi.model.OpenapiPackage;
import de.upb.debis.openapi.model.VendorExtension;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vendor Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.impl.VendorExtensionImpl#getPatternProperty <em>Pattern Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VendorExtensionImpl extends MinimalEObjectImpl.Container implements VendorExtension {
	/**
	 * The default value of the '{@link #getPatternProperty() <em>Pattern Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternProperty() <em>Pattern Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperty()
	 * @generated
	 * @ordered
	 */
	protected String patternProperty = PATTERN_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendorExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.VENDOR_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPatternProperty() {
		return patternProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternProperty(String newPatternProperty) {
		String oldPatternProperty = patternProperty;
		patternProperty = newPatternProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.VENDOR_EXTENSION__PATTERN_PROPERTY, oldPatternProperty, patternProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenapiPackage.VENDOR_EXTENSION__PATTERN_PROPERTY:
				return getPatternProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenapiPackage.VENDOR_EXTENSION__PATTERN_PROPERTY:
				setPatternProperty((String)newValue);
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
			case OpenapiPackage.VENDOR_EXTENSION__PATTERN_PROPERTY:
				setPatternProperty(PATTERN_PROPERTY_EDEFAULT);
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
			case OpenapiPackage.VENDOR_EXTENSION__PATTERN_PROPERTY:
				return PATTERN_PROPERTY_EDEFAULT == null ? patternProperty != null : !PATTERN_PROPERTY_EDEFAULT.equals(patternProperty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (patternProperty: ");
		result.append(patternProperty);
		result.append(')');
		return result.toString();
	}

} //VendorExtensionImpl
