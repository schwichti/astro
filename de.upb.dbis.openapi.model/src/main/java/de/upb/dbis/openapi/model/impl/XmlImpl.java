/**
 */
package de.upb.dbis.openapi.model.impl;

import de.upb.dbis.openapi.model.OpenapiPackage;
import de.upb.dbis.openapi.model.VendorExtension;
import de.upb.dbis.openapi.model.Xml;

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
 * An implementation of the model object '<em><b>Xml</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.impl.XmlImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.XmlImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.XmlImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.XmlImpl#isAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.XmlImpl#isWrapped <em>Wrapped</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.XmlImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlImpl extends MinimalEObjectImpl.Container implements Xml {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTRIBUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttribute()
	 * @generated
	 * @ordered
	 */
	protected boolean attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWrapped() <em>Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrapped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRAPPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWrapped() <em>Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrapped()
	 * @generated
	 * @ordered
	 */
	protected boolean wrapped = WRAPPED_EDEFAULT;

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
	protected XmlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.XML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.XML__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.XML__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.XML__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(boolean newAttribute) {
		boolean oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.XML__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWrapped() {
		return wrapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapped(boolean newWrapped) {
		boolean oldWrapped = wrapped;
		wrapped = newWrapped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.XML__WRAPPED, oldWrapped, wrapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.XML__VENDOR_EXTENSION);
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
			case OpenapiPackage.XML__VENDOR_EXTENSION:
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
			case OpenapiPackage.XML__NAME:
				return getName();
			case OpenapiPackage.XML__NAMESPACE:
				return getNamespace();
			case OpenapiPackage.XML__PREFIX:
				return getPrefix();
			case OpenapiPackage.XML__ATTRIBUTE:
				return isAttribute();
			case OpenapiPackage.XML__WRAPPED:
				return isWrapped();
			case OpenapiPackage.XML__VENDOR_EXTENSION:
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
			case OpenapiPackage.XML__NAME:
				setName((String)newValue);
				return;
			case OpenapiPackage.XML__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case OpenapiPackage.XML__PREFIX:
				setPrefix((String)newValue);
				return;
			case OpenapiPackage.XML__ATTRIBUTE:
				setAttribute((Boolean)newValue);
				return;
			case OpenapiPackage.XML__WRAPPED:
				setWrapped((Boolean)newValue);
				return;
			case OpenapiPackage.XML__VENDOR_EXTENSION:
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
			case OpenapiPackage.XML__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenapiPackage.XML__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case OpenapiPackage.XML__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case OpenapiPackage.XML__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case OpenapiPackage.XML__WRAPPED:
				setWrapped(WRAPPED_EDEFAULT);
				return;
			case OpenapiPackage.XML__VENDOR_EXTENSION:
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
			case OpenapiPackage.XML__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenapiPackage.XML__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case OpenapiPackage.XML__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case OpenapiPackage.XML__ATTRIBUTE:
				return attribute != ATTRIBUTE_EDEFAULT;
			case OpenapiPackage.XML__WRAPPED:
				return wrapped != WRAPPED_EDEFAULT;
			case OpenapiPackage.XML__VENDOR_EXTENSION:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(", wrapped: ");
		result.append(wrapped);
		result.append(')');
		return result.toString();
	}

} //XmlImpl
