/**
 */
package de.upb.debis.openapi.model.impl;

import de.upb.debis.openapi.model.BodyParameter;
import de.upb.debis.openapi.model.ExternalDocs;
import de.upb.debis.openapi.model.FormDataParameterSubSchema;
import de.upb.debis.openapi.model.HeaderParameterSubSchema;
import de.upb.debis.openapi.model.JsonReference;
import de.upb.debis.openapi.model.OpenapiPackage;
import de.upb.debis.openapi.model.Operation;
import de.upb.debis.openapi.model.PathParameterSubSchema;
import de.upb.debis.openapi.model.QueryParameterSubSchema;
import de.upb.debis.openapi.model.Responses;
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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getBodyParameter <em>Body Parameter</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getHeaderParameterSubSchema <em>Header Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getFormDataParameterSubSchema <em>Form Data Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getQueryParameterSubSchema <em>Query Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getPathParameterSubSchema <em>Path Parameter Sub Schema</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getJsonReference <em>Json Reference</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.OperationImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The default value of the '{@link #getTags() <em>Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected static final String TAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected String tags = TAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

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
	 * The cached value of the '{@link #getExternalDocs() <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocs()
	 * @generated
	 * @ordered
	 */
	protected ExternalDocs externalDocs;

	/**
	 * The default value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected String operationId = OPERATION_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected Responses responses;

	/**
	 * The default value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPRECATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected boolean deprecated = DEPRECATED_EDEFAULT;

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
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTags(String newTags) {
		String oldTags = tags;
		tags = newTags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__TAGS, oldTags, tags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
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
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.OPERATION__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.OPERATION__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationId() {
		return operationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationId(String newOperationId) {
		String oldOperationId = operationId;
		operationId = newOperationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__OPERATION_ID, oldOperationId, operationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyParameter> getBodyParameter() {
		if (bodyParameter == null) {
			bodyParameter = new EObjectContainmentEList<BodyParameter>(BodyParameter.class, this, OpenapiPackage.OPERATION__BODY_PARAMETER);
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
			headerParameterSubSchema = new EObjectContainmentEList<HeaderParameterSubSchema>(HeaderParameterSubSchema.class, this, OpenapiPackage.OPERATION__HEADER_PARAMETER_SUB_SCHEMA);
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
			formDataParameterSubSchema = new EObjectContainmentEList<FormDataParameterSubSchema>(FormDataParameterSubSchema.class, this, OpenapiPackage.OPERATION__FORM_DATA_PARAMETER_SUB_SCHEMA);
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
			queryParameterSubSchema = new EObjectContainmentEList<QueryParameterSubSchema>(QueryParameterSubSchema.class, this, OpenapiPackage.OPERATION__QUERY_PARAMETER_SUB_SCHEMA);
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
			pathParameterSubSchema = new EObjectContainmentEList<PathParameterSubSchema>(PathParameterSubSchema.class, this, OpenapiPackage.OPERATION__PATH_PARAMETER_SUB_SCHEMA);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__JSON_REFERENCE, oldJsonReference, newJsonReference);
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
				msgs = ((InternalEObject)jsonReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.OPERATION__JSON_REFERENCE, null, msgs);
			if (newJsonReference != null)
				msgs = ((InternalEObject)newJsonReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.OPERATION__JSON_REFERENCE, null, msgs);
			msgs = basicSetJsonReference(newJsonReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__JSON_REFERENCE, newJsonReference, newJsonReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responses getResponses() {
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponses(Responses newResponses, NotificationChain msgs) {
		Responses oldResponses = responses;
		responses = newResponses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__RESPONSES, oldResponses, newResponses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponses(Responses newResponses) {
		if (newResponses != responses) {
			NotificationChain msgs = null;
			if (responses != null)
				msgs = ((InternalEObject)responses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.OPERATION__RESPONSES, null, msgs);
			if (newResponses != null)
				msgs = ((InternalEObject)newResponses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.OPERATION__RESPONSES, null, msgs);
			msgs = basicSetResponses(newResponses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__RESPONSES, newResponses, newResponses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecated(boolean newDeprecated) {
		boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OPERATION__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.OPERATION__VENDOR_EXTENSION);
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
			case OpenapiPackage.OPERATION__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case OpenapiPackage.OPERATION__BODY_PARAMETER:
				return ((InternalEList<?>)getBodyParameter()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.OPERATION__HEADER_PARAMETER_SUB_SCHEMA:
				return ((InternalEList<?>)getHeaderParameterSubSchema()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.OPERATION__FORM_DATA_PARAMETER_SUB_SCHEMA:
				return ((InternalEList<?>)getFormDataParameterSubSchema()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.OPERATION__QUERY_PARAMETER_SUB_SCHEMA:
				return ((InternalEList<?>)getQueryParameterSubSchema()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.OPERATION__PATH_PARAMETER_SUB_SCHEMA:
				return ((InternalEList<?>)getPathParameterSubSchema()).basicRemove(otherEnd, msgs);
			case OpenapiPackage.OPERATION__JSON_REFERENCE:
				return basicSetJsonReference(null, msgs);
			case OpenapiPackage.OPERATION__RESPONSES:
				return basicSetResponses(null, msgs);
			case OpenapiPackage.OPERATION__VENDOR_EXTENSION:
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
			case OpenapiPackage.OPERATION__TAGS:
				return getTags();
			case OpenapiPackage.OPERATION__SUMMARY:
				return getSummary();
			case OpenapiPackage.OPERATION__DESCRIPTION:
				return getDescription();
			case OpenapiPackage.OPERATION__EXTERNAL_DOCS:
				return getExternalDocs();
			case OpenapiPackage.OPERATION__OPERATION_ID:
				return getOperationId();
			case OpenapiPackage.OPERATION__BODY_PARAMETER:
				return getBodyParameter();
			case OpenapiPackage.OPERATION__HEADER_PARAMETER_SUB_SCHEMA:
				return getHeaderParameterSubSchema();
			case OpenapiPackage.OPERATION__FORM_DATA_PARAMETER_SUB_SCHEMA:
				return getFormDataParameterSubSchema();
			case OpenapiPackage.OPERATION__QUERY_PARAMETER_SUB_SCHEMA:
				return getQueryParameterSubSchema();
			case OpenapiPackage.OPERATION__PATH_PARAMETER_SUB_SCHEMA:
				return getPathParameterSubSchema();
			case OpenapiPackage.OPERATION__JSON_REFERENCE:
				return getJsonReference();
			case OpenapiPackage.OPERATION__RESPONSES:
				return getResponses();
			case OpenapiPackage.OPERATION__DEPRECATED:
				return isDeprecated();
			case OpenapiPackage.OPERATION__VENDOR_EXTENSION:
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
			case OpenapiPackage.OPERATION__TAGS:
				setTags((String)newValue);
				return;
			case OpenapiPackage.OPERATION__SUMMARY:
				setSummary((String)newValue);
				return;
			case OpenapiPackage.OPERATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenapiPackage.OPERATION__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case OpenapiPackage.OPERATION__OPERATION_ID:
				setOperationId((String)newValue);
				return;
			case OpenapiPackage.OPERATION__BODY_PARAMETER:
				getBodyParameter().clear();
				getBodyParameter().addAll((Collection<? extends BodyParameter>)newValue);
				return;
			case OpenapiPackage.OPERATION__HEADER_PARAMETER_SUB_SCHEMA:
				getHeaderParameterSubSchema().clear();
				getHeaderParameterSubSchema().addAll((Collection<? extends HeaderParameterSubSchema>)newValue);
				return;
			case OpenapiPackage.OPERATION__FORM_DATA_PARAMETER_SUB_SCHEMA:
				getFormDataParameterSubSchema().clear();
				getFormDataParameterSubSchema().addAll((Collection<? extends FormDataParameterSubSchema>)newValue);
				return;
			case OpenapiPackage.OPERATION__QUERY_PARAMETER_SUB_SCHEMA:
				getQueryParameterSubSchema().clear();
				getQueryParameterSubSchema().addAll((Collection<? extends QueryParameterSubSchema>)newValue);
				return;
			case OpenapiPackage.OPERATION__PATH_PARAMETER_SUB_SCHEMA:
				getPathParameterSubSchema().clear();
				getPathParameterSubSchema().addAll((Collection<? extends PathParameterSubSchema>)newValue);
				return;
			case OpenapiPackage.OPERATION__JSON_REFERENCE:
				setJsonReference((JsonReference)newValue);
				return;
			case OpenapiPackage.OPERATION__RESPONSES:
				setResponses((Responses)newValue);
				return;
			case OpenapiPackage.OPERATION__DEPRECATED:
				setDeprecated((Boolean)newValue);
				return;
			case OpenapiPackage.OPERATION__VENDOR_EXTENSION:
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
			case OpenapiPackage.OPERATION__TAGS:
				setTags(TAGS_EDEFAULT);
				return;
			case OpenapiPackage.OPERATION__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case OpenapiPackage.OPERATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenapiPackage.OPERATION__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case OpenapiPackage.OPERATION__OPERATION_ID:
				setOperationId(OPERATION_ID_EDEFAULT);
				return;
			case OpenapiPackage.OPERATION__BODY_PARAMETER:
				getBodyParameter().clear();
				return;
			case OpenapiPackage.OPERATION__HEADER_PARAMETER_SUB_SCHEMA:
				getHeaderParameterSubSchema().clear();
				return;
			case OpenapiPackage.OPERATION__FORM_DATA_PARAMETER_SUB_SCHEMA:
				getFormDataParameterSubSchema().clear();
				return;
			case OpenapiPackage.OPERATION__QUERY_PARAMETER_SUB_SCHEMA:
				getQueryParameterSubSchema().clear();
				return;
			case OpenapiPackage.OPERATION__PATH_PARAMETER_SUB_SCHEMA:
				getPathParameterSubSchema().clear();
				return;
			case OpenapiPackage.OPERATION__JSON_REFERENCE:
				setJsonReference((JsonReference)null);
				return;
			case OpenapiPackage.OPERATION__RESPONSES:
				setResponses((Responses)null);
				return;
			case OpenapiPackage.OPERATION__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case OpenapiPackage.OPERATION__VENDOR_EXTENSION:
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
			case OpenapiPackage.OPERATION__TAGS:
				return TAGS_EDEFAULT == null ? tags != null : !TAGS_EDEFAULT.equals(tags);
			case OpenapiPackage.OPERATION__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case OpenapiPackage.OPERATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenapiPackage.OPERATION__EXTERNAL_DOCS:
				return externalDocs != null;
			case OpenapiPackage.OPERATION__OPERATION_ID:
				return OPERATION_ID_EDEFAULT == null ? operationId != null : !OPERATION_ID_EDEFAULT.equals(operationId);
			case OpenapiPackage.OPERATION__BODY_PARAMETER:
				return bodyParameter != null && !bodyParameter.isEmpty();
			case OpenapiPackage.OPERATION__HEADER_PARAMETER_SUB_SCHEMA:
				return headerParameterSubSchema != null && !headerParameterSubSchema.isEmpty();
			case OpenapiPackage.OPERATION__FORM_DATA_PARAMETER_SUB_SCHEMA:
				return formDataParameterSubSchema != null && !formDataParameterSubSchema.isEmpty();
			case OpenapiPackage.OPERATION__QUERY_PARAMETER_SUB_SCHEMA:
				return queryParameterSubSchema != null && !queryParameterSubSchema.isEmpty();
			case OpenapiPackage.OPERATION__PATH_PARAMETER_SUB_SCHEMA:
				return pathParameterSubSchema != null && !pathParameterSubSchema.isEmpty();
			case OpenapiPackage.OPERATION__JSON_REFERENCE:
				return jsonReference != null;
			case OpenapiPackage.OPERATION__RESPONSES:
				return responses != null;
			case OpenapiPackage.OPERATION__DEPRECATED:
				return deprecated != DEPRECATED_EDEFAULT;
			case OpenapiPackage.OPERATION__VENDOR_EXTENSION:
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
		result.append(" (tags: ");
		result.append(tags);
		result.append(", summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", operationId: ");
		result.append(operationId);
		result.append(", deprecated: ");
		result.append(deprecated);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
