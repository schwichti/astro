/**
 */
package de.upb.dbis.openapi.model.impl;

import de.upb.dbis.openapi.model.HeaderParameterSubSchema;
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
 * An implementation of the model object '<em><b>Header Parameter Sub Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.impl.HeaderParameterSubSchemaImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.HeaderParameterSubSchemaImpl#getIn <em>In</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.HeaderParameterSubSchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.HeaderParameterSubSchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.HeaderParameterSubSchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.HeaderParameterSubSchemaImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.HeaderParameterSubSchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.HeaderParameterSubSchemaImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderParameterSubSchemaImpl extends MinimalEObjectImpl.Container implements HeaderParameterSubSchema {
	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected String in = IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected HeaderParameterSubSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.HEADER_PARAMETER_SUB_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(String newIn) {
		String oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__FORMAT, oldFormat, format));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__ITEMS, oldItems, newItems);
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
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION);
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
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__ITEMS:
				return basicSetItems(null, msgs);
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION:
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
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__REQUIRED:
				return isRequired();
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__IN:
				return getIn();
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__DESCRIPTION:
				return getDescription();
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__NAME:
				return getName();
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__TYPE:
				return getType();
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__FORMAT:
				return getFormat();
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__ITEMS:
				return getItems();
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION:
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
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__IN:
				setIn((String)newValue);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__NAME:
				setName((String)newValue);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__TYPE:
				setType((String)newValue);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__FORMAT:
				setFormat((String)newValue);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__ITEMS:
				setItems((PrimitivesItems)newValue);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION:
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
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__IN:
				setIn(IN_EDEFAULT);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__ITEMS:
				setItems((PrimitivesItems)null);
				return;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION:
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
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__IN:
				return IN_EDEFAULT == null ? in != null : !IN_EDEFAULT.equals(in);
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__ITEMS:
				return items != null;
			case OpenapiPackage.HEADER_PARAMETER_SUB_SCHEMA__VENDOR_EXTENSION:
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
		result.append(" (required: ");
		result.append(required);
		result.append(", in: ");
		result.append(in);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", format: ");
		result.append(format);
		result.append(')');
		return result.toString();
	}

} //HeaderParameterSubSchemaImpl
