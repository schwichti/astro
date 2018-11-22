/**
 */
package owls.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owls.ControlConstruct;
import owls.OwlsPackage;
import owls.RepeatUntil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Until</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owls.impl.RepeatUntilImpl#getUntilProcess <em>Until Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatUntilImpl extends IterateImpl implements RepeatUntil {
	/**
	 * The cached value of the '{@link #getUntilProcess() <em>Until Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilProcess()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct untilProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatUntilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.REPEAT_UNTIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getUntilProcess() {
		if (untilProcess != null && untilProcess.eIsProxy()) {
			InternalEObject oldUntilProcess = (InternalEObject)untilProcess;
			untilProcess = (ControlConstruct)eResolveProxy(oldUntilProcess);
			if (untilProcess != oldUntilProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.REPEAT_UNTIL__UNTIL_PROCESS, oldUntilProcess, untilProcess));
			}
		}
		return untilProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct basicGetUntilProcess() {
		return untilProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilProcess(ControlConstruct newUntilProcess) {
		ControlConstruct oldUntilProcess = untilProcess;
		untilProcess = newUntilProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.REPEAT_UNTIL__UNTIL_PROCESS, oldUntilProcess, untilProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.REPEAT_UNTIL__UNTIL_PROCESS:
				if (resolve) return getUntilProcess();
				return basicGetUntilProcess();
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
			case OwlsPackage.REPEAT_UNTIL__UNTIL_PROCESS:
				setUntilProcess((ControlConstruct)newValue);
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
			case OwlsPackage.REPEAT_UNTIL__UNTIL_PROCESS:
				setUntilProcess((ControlConstruct)null);
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
			case OwlsPackage.REPEAT_UNTIL__UNTIL_PROCESS:
				return untilProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //RepeatUntilImpl
