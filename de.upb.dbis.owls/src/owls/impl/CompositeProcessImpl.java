/**
 */
package owls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owls.CompositeProcess;
import owls.ControlConstruct;
import owls.OwlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owls.impl.CompositeProcessImpl#getComposedOf <em>Composed Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeProcessImpl extends ProcessImpl implements CompositeProcess {
	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct composedOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.COMPOSITE_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getComposedOf() {
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposedOf(ControlConstruct newComposedOf, NotificationChain msgs) {
		ControlConstruct oldComposedOf = composedOf;
		composedOf = newComposedOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlsPackage.COMPOSITE_PROCESS__COMPOSED_OF, oldComposedOf, newComposedOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposedOf(ControlConstruct newComposedOf) {
		if (newComposedOf != composedOf) {
			NotificationChain msgs = null;
			if (composedOf != null)
				msgs = ((InternalEObject)composedOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.COMPOSITE_PROCESS__COMPOSED_OF, null, msgs);
			if (newComposedOf != null)
				msgs = ((InternalEObject)newComposedOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.COMPOSITE_PROCESS__COMPOSED_OF, null, msgs);
			msgs = basicSetComposedOf(newComposedOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.COMPOSITE_PROCESS__COMPOSED_OF, newComposedOf, newComposedOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.COMPOSITE_PROCESS__COMPOSED_OF:
				return basicSetComposedOf(null, msgs);
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
			case OwlsPackage.COMPOSITE_PROCESS__COMPOSED_OF:
				return getComposedOf();
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
			case OwlsPackage.COMPOSITE_PROCESS__COMPOSED_OF:
				setComposedOf((ControlConstruct)newValue);
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
			case OwlsPackage.COMPOSITE_PROCESS__COMPOSED_OF:
				setComposedOf((ControlConstruct)null);
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
			case OwlsPackage.COMPOSITE_PROCESS__COMPOSED_OF:
				return composedOf != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeProcessImpl
