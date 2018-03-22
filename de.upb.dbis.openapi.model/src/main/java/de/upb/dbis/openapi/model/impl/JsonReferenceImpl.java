/**
 */
package de.upb.dbis.openapi.model.impl;

import de.upb.dbis.openapi.model.JsonReference;
import de.upb.dbis.openapi.model.OpenapiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.impl.JsonReferenceImpl#getRefref <em>Refref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonReferenceImpl extends MinimalEObjectImpl.Container implements JsonReference {
	/**
	 * The default value of the '{@link #getRefref() <em>Refref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefref()
	 * @generated
	 * @ordered
	 */
	protected static final String REFREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefref() <em>Refref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefref()
	 * @generated
	 * @ordered
	 */
	protected String refref = REFREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.JSON_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefref() {
		return refref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefref(String newRefref) {
		String oldRefref = refref;
		refref = newRefref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.JSON_REFERENCE__REFREF, oldRefref, refref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenapiPackage.JSON_REFERENCE__REFREF:
				return getRefref();
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
			case OpenapiPackage.JSON_REFERENCE__REFREF:
				setRefref((String)newValue);
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
			case OpenapiPackage.JSON_REFERENCE__REFREF:
				setRefref(REFREF_EDEFAULT);
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
			case OpenapiPackage.JSON_REFERENCE__REFREF:
				return REFREF_EDEFAULT == null ? refref != null : !REFREF_EDEFAULT.equals(refref);
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
		result.append(" (refref: ");
		result.append(refref);
		result.append(')');
		return result.toString();
	}

} //JsonReferenceImpl
