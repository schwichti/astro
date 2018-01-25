/**
 */
package de.upb.debis.openapi.model.impl;

import de.upb.debis.openapi.model.Oauth2PasswordSecurity;
import de.upb.debis.openapi.model.Oauth2Scopes;
import de.upb.debis.openapi.model.OpenapiPackage;
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
 * An implementation of the model object '<em><b>Oauth2 Password Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl#getTokenUrl <em>Token Url</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.Oauth2PasswordSecurityImpl#getVendorExtension <em>Vendor Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Oauth2PasswordSecurityImpl extends MinimalEObjectImpl.Container implements Oauth2PasswordSecurity {
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
	 * The default value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected String flow = FLOW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected Oauth2Scopes scopes;

	/**
	 * The default value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenUrl() <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenUrl()
	 * @generated
	 * @ordered
	 */
	protected String tokenUrl = TOKEN_URL_EDEFAULT;

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
	protected Oauth2PasswordSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.OAUTH2_PASSWORD_SECURITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(String newFlow) {
		String oldFlow = flow;
		flow = newFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OAUTH2_PASSWORD_SECURITY__FLOW, oldFlow, flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oauth2Scopes getScopes() {
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopes(Oauth2Scopes newScopes, NotificationChain msgs) {
		Oauth2Scopes oldScopes = scopes;
		scopes = newScopes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.OAUTH2_PASSWORD_SECURITY__SCOPES, oldScopes, newScopes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopes(Oauth2Scopes newScopes) {
		if (newScopes != scopes) {
			NotificationChain msgs = null;
			if (scopes != null)
				msgs = ((InternalEObject)scopes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.OAUTH2_PASSWORD_SECURITY__SCOPES, null, msgs);
			if (newScopes != null)
				msgs = ((InternalEObject)newScopes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.OAUTH2_PASSWORD_SECURITY__SCOPES, null, msgs);
			msgs = basicSetScopes(newScopes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OAUTH2_PASSWORD_SECURITY__SCOPES, newScopes, newScopes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenUrl() {
		return tokenUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenUrl(String newTokenUrl) {
		String oldTokenUrl = tokenUrl;
		tokenUrl = newTokenUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TOKEN_URL, oldTokenUrl, tokenUrl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.OAUTH2_PASSWORD_SECURITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorExtension> getVendorExtension() {
		if (vendorExtension == null) {
			vendorExtension = new EObjectContainmentEList<VendorExtension>(VendorExtension.class, this, OpenapiPackage.OAUTH2_PASSWORD_SECURITY__VENDOR_EXTENSION);
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
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__SCOPES:
				return basicSetScopes(null, msgs);
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__VENDOR_EXTENSION:
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
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TYPE:
				return getType();
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__FLOW:
				return getFlow();
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__SCOPES:
				return getScopes();
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TOKEN_URL:
				return getTokenUrl();
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__DESCRIPTION:
				return getDescription();
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__VENDOR_EXTENSION:
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
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TYPE:
				setType((String)newValue);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__FLOW:
				setFlow((String)newValue);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__SCOPES:
				setScopes((Oauth2Scopes)newValue);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TOKEN_URL:
				setTokenUrl((String)newValue);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__VENDOR_EXTENSION:
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
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__FLOW:
				setFlow(FLOW_EDEFAULT);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__SCOPES:
				setScopes((Oauth2Scopes)null);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TOKEN_URL:
				setTokenUrl(TOKEN_URL_EDEFAULT);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__VENDOR_EXTENSION:
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
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__FLOW:
				return FLOW_EDEFAULT == null ? flow != null : !FLOW_EDEFAULT.equals(flow);
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__SCOPES:
				return scopes != null;
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__TOKEN_URL:
				return TOKEN_URL_EDEFAULT == null ? tokenUrl != null : !TOKEN_URL_EDEFAULT.equals(tokenUrl);
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenapiPackage.OAUTH2_PASSWORD_SECURITY__VENDOR_EXTENSION:
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
		result.append(", flow: ");
		result.append(flow);
		result.append(", tokenUrl: ");
		result.append(tokenUrl);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //Oauth2PasswordSecurityImpl
