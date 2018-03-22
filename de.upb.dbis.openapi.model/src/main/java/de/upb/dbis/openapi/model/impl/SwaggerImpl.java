/**
 */
package de.upb.dbis.openapi.model.impl;

import de.upb.dbis.openapi.model.Definitions;
import de.upb.dbis.openapi.model.ExternalDocs;
import de.upb.dbis.openapi.model.Info;
import de.upb.dbis.openapi.model.OpenapiPackage;
import de.upb.dbis.openapi.model.ParameterDefinitions;
import de.upb.dbis.openapi.model.Paths;
import de.upb.dbis.openapi.model.ResponseDefinitions;
import de.upb.dbis.openapi.model.SecurityDefinitions;
import de.upb.dbis.openapi.model.Swagger;
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
 * An implementation of the model object '<em><b>Swagger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link de.upb.dbis.openapi.model.impl.SwaggerImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwaggerImpl extends MinimalEObjectImpl.Container implements Swagger {
	/**
	 * The default value of the '{@link #getSwagger() <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwagger()
	 * @generated
	 * @ordered
	 */
	protected static final String SWAGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwagger() <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwagger()
	 * @generated
	 * @ordered
	 */
	protected String swagger = SWAGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected Info info;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected Paths paths;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected Definitions definitions;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParameterDefinitions parameters;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected ResponseDefinitions responses;

	/**
	 * The cached value of the '{@link #getSecurityDefinitions() <em>Security Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected SecurityDefinitions securityDefinitions;

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
	protected SwaggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.SWAGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwagger() {
		return swagger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwagger(String newSwagger) {
		String oldSwagger = swagger;
		swagger = newSwagger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__SWAGGER, oldSwagger, swagger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(Info newInfo, NotificationChain msgs) {
		Info oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(Info newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paths getPaths() {
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaths(Paths newPaths, NotificationChain msgs) {
		Paths oldPaths = paths;
		paths = newPaths;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__PATHS, oldPaths, newPaths);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaths(Paths newPaths) {
		if (newPaths != paths) {
			NotificationChain msgs = null;
			if (paths != null)
				msgs = ((InternalEObject)paths).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__PATHS, null, msgs);
			if (newPaths != null)
				msgs = ((InternalEObject)newPaths).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__PATHS, null, msgs);
			msgs = basicSetPaths(newPaths, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__PATHS, newPaths, newPaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions getDefinitions() {
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(Definitions newDefinitions, NotificationChain msgs) {
		Definitions oldDefinitions = definitions;
		definitions = newDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__DEFINITIONS, oldDefinitions, newDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitions(Definitions newDefinitions) {
		if (newDefinitions != definitions) {
			NotificationChain msgs = null;
			if (definitions != null)
				msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__DEFINITIONS, null, msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__DEFINITIONS, null, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__DEFINITIONS, newDefinitions, newDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinitions getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParameterDefinitions newParameters, NotificationChain msgs) {
		ParameterDefinitions oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParameterDefinitions newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDefinitions getResponses() {
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponses(ResponseDefinitions newResponses, NotificationChain msgs) {
		ResponseDefinitions oldResponses = responses;
		responses = newResponses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__RESPONSES, oldResponses, newResponses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponses(ResponseDefinitions newResponses) {
		if (newResponses != responses) {
			NotificationChain msgs = null;
			if (responses != null)
				msgs = ((InternalEObject)responses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__RESPONSES, null, msgs);
			if (newResponses != null)
				msgs = ((InternalEObject)newResponses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__RESPONSES, null, msgs);
			msgs = basicSetResponses(newResponses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__RESPONSES, newResponses, newResponses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDefinitions getSecurityDefinitions() {
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityDefinitions(SecurityDefinitions newSecurityDefinitions, NotificationChain msgs) {
		SecurityDefinitions oldSecurityDefinitions = securityDefinitions;
		securityDefinitions = newSecurityDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__SECURITY_DEFINITIONS, oldSecurityDefinitions, newSecurityDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityDefinitions(SecurityDefinitions newSecurityDefinitions) {
		if (newSecurityDefinitions != securityDefinitions) {
			NotificationChain msgs = null;
			if (securityDefinitions != null)
				msgs = ((InternalEObject)securityDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__SECURITY_DEFINITIONS, null, msgs);
			if (newSecurityDefinitions != null)
				msgs = ((InternalEObject)newSecurityDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__SECURITY_DEFINITIONS, null, msgs);
			msgs = basicSetSecurityDefinitions(newSecurityDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__SECURITY_DEFINITIONS, newSecurityDefinitions, newSecurityDefinitions));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
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
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.SWAGGER__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.SWAGGER__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.SWAGGER__VENDOR_EXTENSION);
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
			case OpenapiPackage.SWAGGER__INFO:
				return basicSetInfo(null, msgs);
			case OpenapiPackage.SWAGGER__PATHS:
				return basicSetPaths(null, msgs);
			case OpenapiPackage.SWAGGER__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case OpenapiPackage.SWAGGER__PARAMETERS:
				return basicSetParameters(null, msgs);
			case OpenapiPackage.SWAGGER__RESPONSES:
				return basicSetResponses(null, msgs);
			case OpenapiPackage.SWAGGER__SECURITY_DEFINITIONS:
				return basicSetSecurityDefinitions(null, msgs);
			case OpenapiPackage.SWAGGER__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case OpenapiPackage.SWAGGER__VENDOR_EXTENSION:
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
			case OpenapiPackage.SWAGGER__SWAGGER:
				return getSwagger();
			case OpenapiPackage.SWAGGER__INFO:
				return getInfo();
			case OpenapiPackage.SWAGGER__HOST:
				return getHost();
			case OpenapiPackage.SWAGGER__BASE_PATH:
				return getBasePath();
			case OpenapiPackage.SWAGGER__PATHS:
				return getPaths();
			case OpenapiPackage.SWAGGER__DEFINITIONS:
				return getDefinitions();
			case OpenapiPackage.SWAGGER__PARAMETERS:
				return getParameters();
			case OpenapiPackage.SWAGGER__RESPONSES:
				return getResponses();
			case OpenapiPackage.SWAGGER__SECURITY_DEFINITIONS:
				return getSecurityDefinitions();
			case OpenapiPackage.SWAGGER__EXTERNAL_DOCS:
				return getExternalDocs();
			case OpenapiPackage.SWAGGER__VENDOR_EXTENSION:
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
			case OpenapiPackage.SWAGGER__SWAGGER:
				setSwagger((String)newValue);
				return;
			case OpenapiPackage.SWAGGER__INFO:
				setInfo((Info)newValue);
				return;
			case OpenapiPackage.SWAGGER__HOST:
				setHost((String)newValue);
				return;
			case OpenapiPackage.SWAGGER__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case OpenapiPackage.SWAGGER__PATHS:
				setPaths((Paths)newValue);
				return;
			case OpenapiPackage.SWAGGER__DEFINITIONS:
				setDefinitions((Definitions)newValue);
				return;
			case OpenapiPackage.SWAGGER__PARAMETERS:
				setParameters((ParameterDefinitions)newValue);
				return;
			case OpenapiPackage.SWAGGER__RESPONSES:
				setResponses((ResponseDefinitions)newValue);
				return;
			case OpenapiPackage.SWAGGER__SECURITY_DEFINITIONS:
				setSecurityDefinitions((SecurityDefinitions)newValue);
				return;
			case OpenapiPackage.SWAGGER__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case OpenapiPackage.SWAGGER__VENDOR_EXTENSION:
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
			case OpenapiPackage.SWAGGER__SWAGGER:
				setSwagger(SWAGGER_EDEFAULT);
				return;
			case OpenapiPackage.SWAGGER__INFO:
				setInfo((Info)null);
				return;
			case OpenapiPackage.SWAGGER__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case OpenapiPackage.SWAGGER__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case OpenapiPackage.SWAGGER__PATHS:
				setPaths((Paths)null);
				return;
			case OpenapiPackage.SWAGGER__DEFINITIONS:
				setDefinitions((Definitions)null);
				return;
			case OpenapiPackage.SWAGGER__PARAMETERS:
				setParameters((ParameterDefinitions)null);
				return;
			case OpenapiPackage.SWAGGER__RESPONSES:
				setResponses((ResponseDefinitions)null);
				return;
			case OpenapiPackage.SWAGGER__SECURITY_DEFINITIONS:
				setSecurityDefinitions((SecurityDefinitions)null);
				return;
			case OpenapiPackage.SWAGGER__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case OpenapiPackage.SWAGGER__VENDOR_EXTENSION:
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
			case OpenapiPackage.SWAGGER__SWAGGER:
				return SWAGGER_EDEFAULT == null ? swagger != null : !SWAGGER_EDEFAULT.equals(swagger);
			case OpenapiPackage.SWAGGER__INFO:
				return info != null;
			case OpenapiPackage.SWAGGER__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case OpenapiPackage.SWAGGER__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case OpenapiPackage.SWAGGER__PATHS:
				return paths != null;
			case OpenapiPackage.SWAGGER__DEFINITIONS:
				return definitions != null;
			case OpenapiPackage.SWAGGER__PARAMETERS:
				return parameters != null;
			case OpenapiPackage.SWAGGER__RESPONSES:
				return responses != null;
			case OpenapiPackage.SWAGGER__SECURITY_DEFINITIONS:
				return securityDefinitions != null;
			case OpenapiPackage.SWAGGER__EXTERNAL_DOCS:
				return externalDocs != null;
			case OpenapiPackage.SWAGGER__VENDOR_EXTENSION:
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
		result.append(" (swagger: ");
		result.append(swagger);
		result.append(", host: ");
		result.append(host);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(')');
		return result.toString();
	}

} //SwaggerImpl
