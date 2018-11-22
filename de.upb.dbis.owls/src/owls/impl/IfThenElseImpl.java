/**
 */
package owls.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import owls.ControlConstruct;
import owls.IfThenElse;
import owls.OwlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owls.impl.IfThenElseImpl#getThen <em>Then</em>}</li>
 *   <li>{@link owls.impl.IfThenElseImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfThenElseImpl extends ControlConstructImpl implements IfThenElse {
	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlConstruct> then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlConstruct> else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.IF_THEN_ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlConstruct> getThen() {
		if (then == null) {
			then = new EObjectResolvingEList<ControlConstruct>(ControlConstruct.class, this, OwlsPackage.IF_THEN_ELSE__THEN);
		}
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlConstruct> getElse() {
		if (else_ == null) {
			else_ = new EObjectResolvingEList<ControlConstruct>(ControlConstruct.class, this, OwlsPackage.IF_THEN_ELSE__ELSE);
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.IF_THEN_ELSE__THEN:
				return getThen();
			case OwlsPackage.IF_THEN_ELSE__ELSE:
				return getElse();
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
			case OwlsPackage.IF_THEN_ELSE__THEN:
				getThen().clear();
				getThen().addAll((Collection<? extends ControlConstruct>)newValue);
				return;
			case OwlsPackage.IF_THEN_ELSE__ELSE:
				getElse().clear();
				getElse().addAll((Collection<? extends ControlConstruct>)newValue);
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
			case OwlsPackage.IF_THEN_ELSE__THEN:
				getThen().clear();
				return;
			case OwlsPackage.IF_THEN_ELSE__ELSE:
				getElse().clear();
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
			case OwlsPackage.IF_THEN_ELSE__THEN:
				return then != null && !then.isEmpty();
			case OwlsPackage.IF_THEN_ELSE__ELSE:
				return else_ != null && !else_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfThenElseImpl
