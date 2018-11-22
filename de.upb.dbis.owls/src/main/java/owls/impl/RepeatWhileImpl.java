/**
 */
package owls.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import owls.ControlConstruct;
import owls.OwlsPackage;
import owls.RepeatWhile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owls.impl.RepeatWhileImpl#getWhileProcess <em>While Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatWhileImpl extends IterateImpl implements RepeatWhile {
	/**
	 * The cached value of the '{@link #getWhileProcess() <em>While Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileProcess()
	 * @generated
	 * @ordered
	 */
	protected ControlConstruct whileProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatWhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.REPEAT_WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct getWhileProcess() {
		if (whileProcess != null && whileProcess.eIsProxy()) {
			InternalEObject oldWhileProcess = (InternalEObject)whileProcess;
			whileProcess = (ControlConstruct)eResolveProxy(oldWhileProcess);
			if (whileProcess != oldWhileProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.REPEAT_WHILE__WHILE_PROCESS, oldWhileProcess, whileProcess));
			}
		}
		return whileProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct basicGetWhileProcess() {
		return whileProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhileProcess(ControlConstruct newWhileProcess) {
		ControlConstruct oldWhileProcess = whileProcess;
		whileProcess = newWhileProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.REPEAT_WHILE__WHILE_PROCESS, oldWhileProcess, whileProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.REPEAT_WHILE__WHILE_PROCESS:
				if (resolve) return getWhileProcess();
				return basicGetWhileProcess();
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
			case OwlsPackage.REPEAT_WHILE__WHILE_PROCESS:
				setWhileProcess((ControlConstruct)newValue);
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
			case OwlsPackage.REPEAT_WHILE__WHILE_PROCESS:
				setWhileProcess((ControlConstruct)null);
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
			case OwlsPackage.REPEAT_WHILE__WHILE_PROCESS:
				return whileProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //RepeatWhileImpl
