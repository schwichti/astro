/**
 */
package de.upb.dbis.openapi.model.impl;

import de.upb.dbis.openapi.model.OpenapiPackage;
import de.upb.dbis.openapi.model.PrimitivesItems;
import de.upb.dbis.openapi.model.VendorExtension;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitives Items</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PrimitivesItemsImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PrimitivesItemsImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PrimitivesItemsImpl#getItems <em>Items</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PrimitivesItemsImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitivesItemsImpl extends MinimalEObjectImpl.Container implements PrimitivesItems {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected PrimitivesItems items;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitivesItemsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.PRIMITIVES_ITEMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PRIMITIVES_ITEMS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PRIMITIVES_ITEMS__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivesItems getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(PrimitivesItems newItems, NotificationChain msgs) {
		PrimitivesItems oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.PRIMITIVES_ITEMS__ITEMS, oldItems, newItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(PrimitivesItems newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PRIMITIVES_ITEMS__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PRIMITIVES_ITEMS__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PRIMITIVES_ITEMS__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.PRIMITIVES_ITEMS__VENDOR_EXTENSION);
		}
		return vendorExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenapiPackage.PRIMITIVES_ITEMS__ITEMS:
				return basicSetItems(null, msgs);
			case OpenapiPackage.PRIMITIVES_ITEMS__VENDOR_EXTENSION:
				return ((InternalEList<?>)getVendorExtension()).basicRemove(otherEnd, msgs);
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
			case OpenapiPackage.PRIMITIVES_ITEMS__TYPE:
				return getType();
			case OpenapiPackage.PRIMITIVES_ITEMS__FORMAT:
				return getFormat();
			case OpenapiPackage.PRIMITIVES_ITEMS__ITEMS:
				return getItems();
			case OpenapiPackage.PRIMITIVES_ITEMS__VENDOR_EXTENSION:
				return getVendorExtension();
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
			case OpenapiPackage.PRIMITIVES_ITEMS__TYPE:
				setType((String)newValue);
				return;
			case OpenapiPackage.PRIMITIVES_ITEMS__FORMAT:
				setFormat((String)newValue);
				return;
			case OpenapiPackage.PRIMITIVES_ITEMS__ITEMS:
				setItems((PrimitivesItems)newValue);
				return;
			case OpenapiPackage.PRIMITIVES_ITEMS__VENDOR_EXTENSION:
				getVendorExtension().clear();
				getVendorExtension().addAll((Collection<? extends VendorExtension>)newValue);
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
			case OpenapiPackage.PRIMITIVES_ITEMS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OpenapiPackage.PRIMITIVES_ITEMS__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case OpenapiPackage.PRIMITIVES_ITEMS__ITEMS:
				setItems((PrimitivesItems)null);
				return;
			case OpenapiPackage.PRIMITIVES_ITEMS__VENDOR_EXTENSION:
				getVendorExtension().clear();
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
			case OpenapiPackage.PRIMITIVES_ITEMS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OpenapiPackage.PRIMITIVES_ITEMS__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case OpenapiPackage.PRIMITIVES_ITEMS__ITEMS:
				return items != null;
			case OpenapiPackage.PRIMITIVES_ITEMS__VENDOR_EXTENSION:
				return vendorExtension != null && !vendorExtension.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", format: ");
		result.append(format);
		result.append(')');
		return result.toString();
	}

} //PrimitivesItemsImpl
