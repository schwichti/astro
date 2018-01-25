/**
 */
package de.upb.debis.openapi.model.impl;

import de.upb.debis.openapi.model.Examples;
import de.upb.debis.openapi.model.FileSchema;
import de.upb.debis.openapi.model.Headers;
import de.upb.debis.openapi.model.OpenapiPackage;
import de.upb.debis.openapi.model.Response;
import de.upb.debis.openapi.model.Schema;
import de.upb.debis.openapi.model.VendorExtension;

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
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.impl.ResponseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.ResponseImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.ResponseImpl#getFileSchema <em>File Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.ResponseImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.ResponseImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.ResponseImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends MinimalEObjectImpl.Container implements Response {
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
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema schema;

	/**
	 * The cached value of the '{@link #getFileSchema() <em>File Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSchema()
	 * @generated
	 * @ordered
	 */
	protected FileSchema fileSchema;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected Headers headers;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected Examples examples;

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
	protected ResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.RESPONSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs) {
		Schema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE__SCHEMA, oldSchema, newSchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		if (newSchema != schema) {
			NotificationChain msgs = null;
			if (schema != null)
				msgs = ((InternalEObject)schema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE__SCHEMA, null, msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE__SCHEMA, null, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE__SCHEMA, newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSchema getFileSchema() {
		return fileSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSchema(FileSchema newFileSchema, NotificationChain msgs) {
		FileSchema oldFileSchema = fileSchema;
		fileSchema = newFileSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE__FILE_SCHEMA, oldFileSchema, newFileSchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSchema(FileSchema newFileSchema) {
		if (newFileSchema != fileSchema) {
			NotificationChain msgs = null;
			if (fileSchema != null)
				msgs = ((InternalEObject)fileSchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE__FILE_SCHEMA, null, msgs);
			if (newFileSchema != null)
				msgs = ((InternalEObject)newFileSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE__FILE_SCHEMA, null, msgs);
			msgs = basicSetFileSchema(newFileSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE__FILE_SCHEMA, newFileSchema, newFileSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Headers getHeaders() {
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaders(Headers newHeaders, NotificationChain msgs) {
		Headers oldHeaders = headers;
		headers = newHeaders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE__HEADERS, oldHeaders, newHeaders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaders(Headers newHeaders) {
		if (newHeaders != headers) {
			NotificationChain msgs = null;
			if (headers != null)
				msgs = ((InternalEObject)headers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE__HEADERS, null, msgs);
			if (newHeaders != null)
				msgs = ((InternalEObject)newHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE__HEADERS, null, msgs);
			msgs = basicSetHeaders(newHeaders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE__HEADERS, newHeaders, newHeaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Examples getExamples() {
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExamples(Examples newExamples, NotificationChain msgs) {
		Examples oldExamples = examples;
		examples = newExamples;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE__EXAMPLES, oldExamples, newExamples);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamples(Examples newExamples) {
		if (newExamples != examples) {
			NotificationChain msgs = null;
			if (examples != null)
				msgs = ((InternalEObject)examples).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE__EXAMPLES, null, msgs);
			if (newExamples != null)
				msgs = ((InternalEObject)newExamples).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE__EXAMPLES, null, msgs);
			msgs = basicSetExamples(newExamples, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE__EXAMPLES, newExamples, newExamples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.RESPONSE__VENDOR_EXTENSION);
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
			case OpenapiPackage.RESPONSE__SCHEMA:
				return basicSetSchema(null, msgs);
			case OpenapiPackage.RESPONSE__FILE_SCHEMA:
				return basicSetFileSchema(null, msgs);
			case OpenapiPackage.RESPONSE__HEADERS:
				return basicSetHeaders(null, msgs);
			case OpenapiPackage.RESPONSE__EXAMPLES:
				return basicSetExamples(null, msgs);
			case OpenapiPackage.RESPONSE__VENDOR_EXTENSION:
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
			case OpenapiPackage.RESPONSE__DESCRIPTION:
				return getDescription();
			case OpenapiPackage.RESPONSE__SCHEMA:
				return getSchema();
			case OpenapiPackage.RESPONSE__FILE_SCHEMA:
				return getFileSchema();
			case OpenapiPackage.RESPONSE__HEADERS:
				return getHeaders();
			case OpenapiPackage.RESPONSE__EXAMPLES:
				return getExamples();
			case OpenapiPackage.RESPONSE__VENDOR_EXTENSION:
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
			case OpenapiPackage.RESPONSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenapiPackage.RESPONSE__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case OpenapiPackage.RESPONSE__FILE_SCHEMA:
				setFileSchema((FileSchema)newValue);
				return;
			case OpenapiPackage.RESPONSE__HEADERS:
				setHeaders((Headers)newValue);
				return;
			case OpenapiPackage.RESPONSE__EXAMPLES:
				setExamples((Examples)newValue);
				return;
			case OpenapiPackage.RESPONSE__VENDOR_EXTENSION:
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
			case OpenapiPackage.RESPONSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenapiPackage.RESPONSE__SCHEMA:
				setSchema((Schema)null);
				return;
			case OpenapiPackage.RESPONSE__FILE_SCHEMA:
				setFileSchema((FileSchema)null);
				return;
			case OpenapiPackage.RESPONSE__HEADERS:
				setHeaders((Headers)null);
				return;
			case OpenapiPackage.RESPONSE__EXAMPLES:
				setExamples((Examples)null);
				return;
			case OpenapiPackage.RESPONSE__VENDOR_EXTENSION:
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
			case OpenapiPackage.RESPONSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenapiPackage.RESPONSE__SCHEMA:
				return schema != null;
			case OpenapiPackage.RESPONSE__FILE_SCHEMA:
				return fileSchema != null;
			case OpenapiPackage.RESPONSE__HEADERS:
				return headers != null;
			case OpenapiPackage.RESPONSE__EXAMPLES:
				return examples != null;
			case OpenapiPackage.RESPONSE__VENDOR_EXTENSION:
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
