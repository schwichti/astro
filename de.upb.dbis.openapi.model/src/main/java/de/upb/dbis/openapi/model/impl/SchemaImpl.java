/**
 */
package de.upb.dbis.openapi.model.impl;

import de.upb.dbis.openapi.model.ExternalDocs;
import de.upb.dbis.openapi.model.OpenapiPackage;
import de.upb.dbis.openapi.model.Schema;
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
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SchemaImpl#getRefref <em>Refref</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SchemaImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SchemaImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SchemaImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SchemaImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SchemaImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SchemaImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {
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
	 * The default value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected String discriminator = DISCRIMINATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXml() <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected Xml xml;

	/**
	 * The cached value of the '{@link #getExternalDocs() <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocs()
	 * @generated
	 * @ordered
	 */
	protected ExternalDocs externalDocs;

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
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SCHEMA__REFREF, oldRefref, refref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SCHEMA__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscriminator() {
		return discriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminator(String newDiscriminator) {
		String oldDiscriminator = discriminator;
		discriminator = newDiscriminator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SCHEMA__DISCRIMINATOR, oldDiscriminator, discriminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SCHEMA__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml getXml() {
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXml(Xml newXml, NotificationChain msgs) {
		Xml oldXml = xml;
		xml = newXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.SCHEMA__XML, oldXml, newXml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml(Xml newXml) {
		if (newXml != xml) {
			NotificationChain msgs = null;
			if (xml != null)
				msgs = ((InternalEObject)xml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SCHEMA__XML, null, msgs);
			if (newXml != null)
				msgs = ((InternalEObject)newXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SCHEMA__XML, null, msgs);
			msgs = basicSetXml(newXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SCHEMA__XML, newXml, newXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocs getExternalDocs() {
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalDocs(ExternalDocs newExternalDocs, NotificationChain msgs) {
		ExternalDocs oldExternalDocs = externalDocs;
		externalDocs = newExternalDocs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.SCHEMA__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDocs(ExternalDocs newExternalDocs) {
		if (newExternalDocs != externalDocs) {
			NotificationChain msgs = null;
			if (externalDocs != null)
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SCHEMA__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SCHEMA__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SCHEMA__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.SCHEMA__VENDOR_EXTENSION);
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
			case OpenapiPackage.SCHEMA__XML:
				return basicSetXml(null, msgs);
			case OpenapiPackage.SCHEMA__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case OpenapiPackage.SCHEMA__VENDOR_EXTENSION:
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
			case OpenapiPackage.SCHEMA__REFREF:
				return getRefref();
			case OpenapiPackage.SCHEMA__FORMAT:
				return getFormat();
			case OpenapiPackage.SCHEMA__DISCRIMINATOR:
				return getDiscriminator();
			case OpenapiPackage.SCHEMA__READ_ONLY:
				return isReadOnly();
			case OpenapiPackage.SCHEMA__XML:
				return getXml();
			case OpenapiPackage.SCHEMA__EXTERNAL_DOCS:
				return getExternalDocs();
			case OpenapiPackage.SCHEMA__VENDOR_EXTENSION:
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
			case OpenapiPackage.SCHEMA__REFREF:
				setRefref((String)newValue);
				return;
			case OpenapiPackage.SCHEMA__FORMAT:
				setFormat((String)newValue);
				return;
			case OpenapiPackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator((String)newValue);
				return;
			case OpenapiPackage.SCHEMA__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case OpenapiPackage.SCHEMA__XML:
				setXml((Xml)newValue);
				return;
			case OpenapiPackage.SCHEMA__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case OpenapiPackage.SCHEMA__VENDOR_EXTENSION:
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
			case OpenapiPackage.SCHEMA__REFREF:
				setRefref(REFREF_EDEFAULT);
				return;
			case OpenapiPackage.SCHEMA__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case OpenapiPackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator(DISCRIMINATOR_EDEFAULT);
				return;
			case OpenapiPackage.SCHEMA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case OpenapiPackage.SCHEMA__XML:
				setXml((Xml)null);
				return;
			case OpenapiPackage.SCHEMA__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case OpenapiPackage.SCHEMA__VENDOR_EXTENSION:
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
			case OpenapiPackage.SCHEMA__REFREF:
				return REFREF_EDEFAULT == null ? refref != null : !REFREF_EDEFAULT.equals(refref);
			case OpenapiPackage.SCHEMA__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case OpenapiPackage.SCHEMA__DISCRIMINATOR:
				return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
			case OpenapiPackage.SCHEMA__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case OpenapiPackage.SCHEMA__XML:
				return xml != null;
			case OpenapiPackage.SCHEMA__EXTERNAL_DOCS:
				return externalDocs != null;
			case OpenapiPackage.SCHEMA__VENDOR_EXTENSION:
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
		result.append(" (refref: ");
		result.append(refref);
		result.append(", format: ");
		result.append(format);
		result.append(", discriminator: ");
		result.append(discriminator);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
