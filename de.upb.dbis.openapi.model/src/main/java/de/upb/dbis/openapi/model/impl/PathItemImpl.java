/**
 */
package de.upb.dbis.openapi.model.impl;

import de.upb.dbis.openapi.model.BodyParameter;
import de.upb.dbis.openapi.model.FormDataParameterSubSchema;
import de.upb.dbis.openapi.model.HeaderParameterSubSchema;
import de.upb.dbis.openapi.model.JsonReference;
import de.upb.dbis.openapi.model.OpenapiPackage;
import de.upb.dbis.openapi.model.Operation;
import de.upb.dbis.openapi.model.PathItem;
import de.upb.dbis.openapi.model.PathParameterSubSchema;
import de.upb.dbis.openapi.model.QueryParameterSubSchema;
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
 * An implementation of the model object '<em><b>Path Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getPatternProperty <em>Pattern Property</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getGet <em>Get</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getPut <em>Put</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getPost <em>Post</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getHead <em>Head</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getPatch <em>Patch</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getBodyParameter <em>Body Parameter</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getHeaderParameterSubSchema <em>Header Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getFormDataParameterSubSchema <em>Form Data Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getQueryParameterSubSchema <em>Query Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getPathParameterSubSchema <em>Path Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getJsonReference <em>Json Reference</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.PathItemImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathItemImpl extends MinimalEObjectImpl.Container implements PathItem {
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
	 * The cached value of the '{@link #getGet() <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGet()
	 * @generated
	 * @ordered
	 */
	protected Operation get;

	/**
	 * The cached value of the '{@link #getPut() <em>Put</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPut()
	 * @generated
	 * @ordered
	 */
	protected Operation put;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected Operation post;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected Operation delete;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Operation options;

	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected Operation head;

	/**
	 * The cached value of the '{@link #getPatch() <em>Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatch()
	 * @generated
	 * @ordered
	 */
	protected Operation patch;

	/**
	 * The cached value of the '{@link #getBodyParameter() <em>Body Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyParameter> bodyParameter;

	/**
	 * The cached value of the '{@link #getHeaderParameterSubSchema() <em>Header Parameter Sub Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderParameterSubSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<HeaderParameterSubSchema> headerParameterSubSchema;

	/**
	 * The cached value of the '{@link #getFormDataParameterSubSchema() <em>Form Data Parameter Sub Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormDataParameterSubSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<FormDataParameterSubSchema> formDataParameterSubSchema;

	/**
	 * The cached value of the '{@link #getQueryParameterSubSchema() <em>Query Parameter Sub Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryParameterSubSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryParameterSubSchema> queryParameterSubSchema;

	/**
	 * The cached value of the '{@link #getPathParameterSubSchema() <em>Path Parameter Sub Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathParameterSubSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<PathParameterSubSchema> pathParameterSubSchema;

	/**
	 * The cached value of the '{@link #getJsonReference() <em>Json Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonReference()
	 * @generated
	 * @ordered
	 */
	protected JsonReference jsonReference;

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
	protected PathItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.PATH_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__PATTERN_PROPERTY, oldPatternProperty, patternProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getGet() {
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGet(Operation newGet, NotificationChain msgs) {
		Operation oldGet = get;
		get = newGet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__GET, oldGet, newGet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGet(Operation newGet) {
		if (newGet != get) {
			NotificationChain msgs = null;
			if (get != null)
				msgs = ((InternalEObject)get).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__GET, null, msgs);
			if (newGet != null)
				msgs = ((InternalEObject)newGet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__GET, null, msgs);
			msgs = basicSetGet(newGet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__GET, newGet, newGet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPut() {
		return put;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPut(Operation newPut, NotificationChain msgs) {
		Operation oldPut = put;
		put = newPut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__PUT, oldPut, newPut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPut(Operation newPut) {
		if (newPut != put) {
			NotificationChain msgs = null;
			if (put != null)
				msgs = ((InternalEObject)put).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__PUT, null, msgs);
			if (newPut != null)
				msgs = ((InternalEObject)newPut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__PUT, null, msgs);
			msgs = basicSetPut(newPut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__PUT, newPut, newPut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(Operation newPost, NotificationChain msgs) {
		Operation oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__POST, oldPost, newPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(Operation newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__POST, null, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__POST, null, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(Operation newDelete, NotificationChain msgs) {
		Operation oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__DELETE, oldDelete, newDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(Operation newDelete) {
		if (newDelete != delete) {
			NotificationChain msgs = null;
			if (delete != null)
				msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__DELETE, null, msgs);
			if (newDelete != null)
				msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__DELETE, null, msgs);
			msgs = basicSetDelete(newDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__DELETE, newDelete, newDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Operation newOptions, NotificationChain msgs) {
		Operation oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Operation newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(Operation newHead, NotificationChain msgs) {
		Operation oldHead = head;
		head = newHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__HEAD, oldHead, newHead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(Operation newHead) {
		if (newHead != head) {
			NotificationChain msgs = null;
			if (head != null)
				msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__HEAD, null, msgs);
			if (newHead != null)
				msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__HEAD, null, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__HEAD, newHead, newHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPatch() {
		return patch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatch(Operation newPatch, NotificationChain msgs) {
		Operation oldPatch = patch;
		patch = newPatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__PATCH, oldPatch, newPatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatch(Operation newPatch) {
		if (newPatch != patch) {
			NotificationChain msgs = null;
			if (patch != null)
				msgs = ((InternalEObject)patch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__PATCH, null, msgs);
			if (newPatch != null)
				msgs = ((InternalEObject)newPatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__PATCH, null, msgs);
			msgs = basicSetPatch(newPatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__PATCH, newPatch, newPatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyParameter> getBodyParameter() {
		if (bodyParameter == null) {
			bodyParameter = new EObjectContainmentEList<BodyParameter>(BodyParameter.class, this, OpenapiPackage.PATH_ITEM__BODY_PARAMETER);
		}
		return bodyParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderParameterSubSchema> getHeaderParameterSubSchema() {
		if (headerParameterSubSchema == null) {
			headerParameterSubSchema = new EObjectContainmentEList<HeaderParameterSubSchema>(HeaderParameterSubSchema.class, this, OpenapiPackage.PATH_ITEM__HEADER_PARAMETER_SUB_SCHEMA);
		}
		return headerParameterSubSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormDataParameterSubSchema> getFormDataParameterSubSchema() {
		if (formDataParameterSubSchema == null) {
			formDataParameterSubSchema = new EObjectContainmentEList<FormDataParameterSubSchema>(FormDataParameterSubSchema.class, this, OpenapiPackage.PATH_ITEM__FORM_DATA_PARAMETER_SUB_SCHEMA);
		}
		return formDataParameterSubSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryParameterSubSchema> getQueryParameterSubSchema() {
		if (queryParameterSubSchema == null) {
			queryParameterSubSchema = new EObjectContainmentEList<QueryParameterSubSchema>(QueryParameterSubSchema.class, this, OpenapiPackage.PATH_ITEM__QUERY_PARAMETER_SUB_SCHEMA);
		}
		return queryParameterSubSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathParameterSubSchema> getPathParameterSubSchema() {
		if (pathParameterSubSchema == null) {
			pathParameterSubSchema = new EObjectContainmentEList<PathParameterSubSchema>(PathParameterSubSchema.class, this, OpenapiPackage.PATH_ITEM__PATH_PARAMETER_SUB_SCHEMA);
		}
		return pathParameterSubSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonReference getJsonReference() {
		return jsonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsonReference(JsonReference newJsonReference, NotificationChain msgs) {
		JsonReference oldJsonReference = jsonReference;
		jsonReference = newJsonReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__JSON_REFERENCE, oldJsonReference, newJsonReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonReference(JsonReference newJsonReference) {
		if (newJsonReference != jsonReference) {
			NotificationChain msgs = null;
			if (jsonReference != null)
				msgs = ((InternalEObject)jsonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__JSON_REFERENCE, null, msgs);
			if (newJsonReference != null)
				msgs = ((InternalEObject)newJsonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.PATH_ITEM__JSON_REFERENCE, null, msgs);
			msgs = basicSetJsonReference(newJsonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.PATH_ITEM__JSON_REFERENCE, newJsonReference, newJsonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.PATH_ITEM__VENDOR_EXTENSION);
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
			case OpenapiPackage.PATH_ITEM__GET:
				return basicSetGet(null, msgs);
			case OpenapiPackage.PATH_ITEM__PUT:
				return basicSetPut(null, msgs);
			case OpenapiPackage.PATH_ITEM__POST:
				return basicSetPost(null, msgs);
			case OpenapiPackage.PATH_ITEM__DELETE:
				return basicSetDelete(null, msgs);
			case OpenapiPackage.PATH_ITEM__OPTIONS:
				return basicSetOptions(null, msgs);
			case OpenapiPackage.PATH_ITEM__HEAD:
				return basicSetHead(null, msgs);
			case OpenapiPackage.PATH_ITEM__PATCH:
				return basicSetPatch(null, msgs);
			case OpenapiPackage.PATH_ITEM__BODY_PARAMETER:
				return ((InternalEList<?>)getBodyParameter()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.PATH_ITEM__HEADER_PARAMETER_SUB_SCHEMA:
				return ((InternalEList<?>)getHeaderParameterSubSchema()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.PATH_ITEM__FORM_DATA_PARAMETER_SUB_SCHEMA:
				return ((InternalEList<?>)getFormDataParameterSubSchema()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.PATH_ITEM__QUERY_PARAMETER_SUB_SCHEMA:
				return ((InternalEList<?>)getQueryParameterSubSchema()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.PATH_ITEM__PATH_PARAMETER_SUB_SCHEMA:
				return ((InternalEList<?>)getPathParameterSubSchema()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.PATH_ITEM__JSON_REFERENCE:
				return basicSetJsonReference(null, msgs);
			case OpenapiPackage.PATH_ITEM__VENDOR_EXTENSION:
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
			case OpenapiPackage.PATH_ITEM__PATTERN_PROPERTY:
				return getPatternProperty();
			case OpenapiPackage.PATH_ITEM__GET:
				return getGet();
			case OpenapiPackage.PATH_ITEM__PUT:
				return getPut();
			case OpenapiPackage.PATH_ITEM__POST:
				return getPost();
			case OpenapiPackage.PATH_ITEM__DELETE:
				return getDelete();
			case OpenapiPackage.PATH_ITEM__OPTIONS:
				return getOptions();
			case OpenapiPackage.PATH_ITEM__HEAD:
				return getHead();
			case OpenapiPackage.PATH_ITEM__PATCH:
				return getPatch();
			case OpenapiPackage.PATH_ITEM__BODY_PARAMETER:
				return getBodyParameter();
			case OpenapiPackage.PATH_ITEM__HEADER_PARAMETER_SUB_SCHEMA:
				return getHeaderParameterSubSchema();
			case OpenapiPackage.PATH_ITEM__FORM_DATA_PARAMETER_SUB_SCHEMA:
				return getFormDataParameterSubSchema();
			case OpenapiPackage.PATH_ITEM__QUERY_PARAMETER_SUB_SCHEMA:
				return getQueryParameterSubSchema();
			case OpenapiPackage.PATH_ITEM__PATH_PARAMETER_SUB_SCHEMA:
				return getPathParameterSubSchema();
			case OpenapiPackage.PATH_ITEM__JSON_REFERENCE:
				return getJsonReference();
			case OpenapiPackage.PATH_ITEM__VENDOR_EXTENSION:
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
			case OpenapiPackage.PATH_ITEM__PATTERN_PROPERTY:
				setPatternProperty((String)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__GET:
				setGet((Operation)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__PUT:
				setPut((Operation)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__POST:
				setPost((Operation)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__DELETE:
				setDelete((Operation)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__OPTIONS:
				setOptions((Operation)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__HEAD:
				setHead((Operation)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__PATCH:
				setPatch((Operation)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__BODY_PARAMETER:
				getBodyParameter().clear();
				getBodyParameter().addAll((Collection<? extends BodyParameter>)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__HEADER_PARAMETER_SUB_SCHEMA:
				getHeaderParameterSubSchema().clear();
				getHeaderParameterSubSchema().addAll((Collection<? extends HeaderParameterSubSchema>)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__FORM_DATA_PARAMETER_SUB_SCHEMA:
				getFormDataParameterSubSchema().clear();
				getFormDataParameterSubSchema().addAll((Collection<? extends FormDataParameterSubSchema>)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__QUERY_PARAMETER_SUB_SCHEMA:
				getQueryParameterSubSchema().clear();
				getQueryParameterSubSchema().addAll((Collection<? extends QueryParameterSubSchema>)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__PATH_PARAMETER_SUB_SCHEMA:
				getPathParameterSubSchema().clear();
				getPathParameterSubSchema().addAll((Collection<? extends PathParameterSubSchema>)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__JSON_REFERENCE:
				setJsonReference((JsonReference)newValue);
				return;
			case OpenapiPackage.PATH_ITEM__VENDOR_EXTENSION:
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
			case OpenapiPackage.PATH_ITEM__PATTERN_PROPERTY:
				setPatternProperty(PATTERN_PROPERTY_EDEFAULT);
				return;
			case OpenapiPackage.PATH_ITEM__GET:
				setGet((Operation)null);
				return;
			case OpenapiPackage.PATH_ITEM__PUT:
				setPut((Operation)null);
				return;
			case OpenapiPackage.PATH_ITEM__POST:
				setPost((Operation)null);
				return;
			case OpenapiPackage.PATH_ITEM__DELETE:
				setDelete((Operation)null);
				return;
			case OpenapiPackage.PATH_ITEM__OPTIONS:
				setOptions((Operation)null);
				return;
			case OpenapiPackage.PATH_ITEM__HEAD:
				setHead((Operation)null);
				return;
			case OpenapiPackage.PATH_ITEM__PATCH:
				setPatch((Operation)null);
				return;
			case OpenapiPackage.PATH_ITEM__BODY_PARAMETER:
				getBodyParameter().clear();
				return;
			case OpenapiPackage.PATH_ITEM__HEADER_PARAMETER_SUB_SCHEMA:
				getHeaderParameterSubSchema().clear();
				return;
			case OpenapiPackage.PATH_ITEM__FORM_DATA_PARAMETER_SUB_SCHEMA:
				getFormDataParameterSubSchema().clear();
				return;
			case OpenapiPackage.PATH_ITEM__QUERY_PARAMETER_SUB_SCHEMA:
				getQueryParameterSubSchema().clear();
				return;
			case OpenapiPackage.PATH_ITEM__PATH_PARAMETER_SUB_SCHEMA:
				getPathParameterSubSchema().clear();
				return;
			case OpenapiPackage.PATH_ITEM__JSON_REFERENCE:
				setJsonReference((JsonReference)null);
				return;
			case OpenapiPackage.PATH_ITEM__VENDOR_EXTENSION:
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
			case OpenapiPackage.PATH_ITEM__PATTERN_PROPERTY:
				return PATTERN_PROPERTY_EDEFAULT == null ? patternProperty != null : !PATTERN_PROPERTY_EDEFAULT.equals(patternProperty);
			case OpenapiPackage.PATH_ITEM__GET:
				return get != null;
			case OpenapiPackage.PATH_ITEM__PUT:
				return put != null;
			case OpenapiPackage.PATH_ITEM__POST:
				return post != null;
			case OpenapiPackage.PATH_ITEM__DELETE:
				return delete != null;
			case OpenapiPackage.PATH_ITEM__OPTIONS:
				return options != null;
			case OpenapiPackage.PATH_ITEM__HEAD:
				return head != null;
			case OpenapiPackage.PATH_ITEM__PATCH:
				return patch != null;
			case OpenapiPackage.PATH_ITEM__BODY_PARAMETER:
				return bodyParameter != null && !bodyParameter.isEmpty();
			case OpenapiPackage.PATH_ITEM__HEADER_PARAMETER_SUB_SCHEMA:
				return headerParameterSubSchema != null && !headerParameterSubSchema.isEmpty();
			case OpenapiPackage.PATH_ITEM__FORM_DATA_PARAMETER_SUB_SCHEMA:
				return formDataParameterSubSchema != null && !formDataParameterSubSchema.isEmpty();
			case OpenapiPackage.PATH_ITEM__QUERY_PARAMETER_SUB_SCHEMA:
				return queryParameterSubSchema != null && !queryParameterSubSchema.isEmpty();
			case OpenapiPackage.PATH_ITEM__PATH_PARAMETER_SUB_SCHEMA:
				return pathParameterSubSchema != null && !pathParameterSubSchema.isEmpty();
			case OpenapiPackage.PATH_ITEM__JSON_REFERENCE:
				return jsonReference != null;
			case OpenapiPackage.PATH_ITEM__VENDOR_EXTENSION:
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
		result.append(" (patternProperty: ");
		result.append(patternProperty);
		result.append(')');
		return result.toString();
	}

} //PathItemImpl
