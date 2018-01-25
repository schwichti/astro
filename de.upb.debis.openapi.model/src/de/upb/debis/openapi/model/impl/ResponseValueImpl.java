/**
 */
package de.upb.debis.openapi.model.impl;

import de.upb.debis.openapi.model.OpenapiPackage;
import de.upb.debis.openapi.model.Response;
import de.upb.debis.openapi.model.ResponseValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.upb.debis.openapi.model.impl.ResponseValueImpl#getPatternProperty <em>Pattern Property</em>}</li>
 *   <li>{@link de.upb.debis.openapi.model.impl.ResponseValueImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseValueImpl extends MinimalEObjectImpl.Container implements ResponseValue {
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
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Response response;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiPackage.Literals.RESPONSE_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE_VALUE__PATTERN_PROPERTY, oldPatternProperty, patternProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(Response newResponse, NotificationChain msgs) {
		Response oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE_VALUE__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Response newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE_VALUE__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiPackage.RESPONSE_VALUE__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiPackage.RESPONSE_VALUE__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenapiPackage.RESPONSE_VALUE__RESPONSE:
				return basicSetResponse(null, msgs);
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
			case OpenapiPackage.RESPONSE_VALUE__PATTERN_PROPERTY:
				return getPatternProperty();
			case OpenapiPackage.RESPONSE_VALUE__RESPONSE:
				return getResponse();
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
			case OpenapiPackage.RESPONSE_VALUE__PATTERN_PROPERTY:
				setPatternProperty((String)newValue);
				return;
			case OpenapiPackage.RESPONSE_VALUE__RESPONSE:
				setResponse((Response)newValue);
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
			case OpenapiPackage.RESPONSE_VALUE__PATTERN_PROPERTY:
				setPatternProperty(PATTERN_PROPERTY_EDEFAULT);
				return;
			case OpenapiPackage.RESPONSE_VALUE__RESPONSE:
				setResponse((Response)null);
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
			case OpenapiPackage.RESPONSE_VALUE__PATTERN_PROPERTY:
				return PATTERN_PROPERTY_EDEFAULT == null ? patternProperty != null : !PATTERN_PROPERTY_EDEFAULT.equals(patternProperty);
			case OpenapiPackage.RESPONSE_VALUE__RESPONSE:
				return response != null;
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

} //ResponseValueImpl
