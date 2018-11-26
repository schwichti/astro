/**
 */
package owls.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import owls.ControlConstruct;
import owls.OwlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link owls.impl.ControlConstructImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link owls.impl.ControlConstructImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlConstructImpl extends MinimalEObjectImpl.Container implements ControlConstruct {
	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlConstruct> composedOf;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlConstruct> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.CONTROL_CONSTRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlConstruct> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectResolvingEList<ControlConstruct>(ControlConstruct.class, this, OwlsPackage.CONTROL_CONSTRUCT__COMPOSED_OF);
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlConstruct> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ControlConstruct>(ControlConstruct.class, this, OwlsPackage.CONTROL_CONSTRUCT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.CONTROL_CONSTRUCT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case OwlsPackage.CONTROL_CONSTRUCT__COMPOSED_OF:
				return getComposedOf();
			case OwlsPackage.CONTROL_CONSTRUCT__COMPONENTS:
				return getComponents();
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
			case OwlsPackage.CONTROL_CONSTRUCT__COMPOSED_OF:
				getComposedOf().clear();
				getComposedOf().addAll((Collection<? extends ControlConstruct>)newValue);
				return;
			case OwlsPackage.CONTROL_CONSTRUCT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ControlConstruct>)newValue);
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
			case OwlsPackage.CONTROL_CONSTRUCT__COMPOSED_OF:
				getComposedOf().clear();
				return;
			case OwlsPackage.CONTROL_CONSTRUCT__COMPONENTS:
				getComponents().clear();
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
			case OwlsPackage.CONTROL_CONSTRUCT__COMPOSED_OF:
				return composedOf != null && !composedOf.isEmpty();
			case OwlsPackage.CONTROL_CONSTRUCT__COMPONENTS:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlConstructImpl
