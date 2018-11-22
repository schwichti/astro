/**
 */
package owls.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import owls.AnyOrder;
import owls.Choice;
import owls.CompositeProcess;
import owls.ControlConstruct;
import owls.ControlConstructBag;
import owls.ControlConstructList;
import owls.IfThenElse;
import owls.Iterate;
import owls.OwlsPackage;
import owls.Perform;
import owls.RepeatUntil;
import owls.RepeatWhile;
import owls.Sequence;
import owls.Split;
import owls.SplitJoin;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see owls.OwlsPackage
 * @generated
 */
public class OwlsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OwlsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OwlsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsSwitch<Adapter> modelSwitch =
		new OwlsSwitch<Adapter>() {
			@Override
			public Adapter caseProcess(owls.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseControlConstruct(ControlConstruct object) {
				return createControlConstructAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseSplit(Split object) {
				return createSplitAdapter();
			}
			@Override
			public Adapter caseSplitJoin(SplitJoin object) {
				return createSplitJoinAdapter();
			}
			@Override
			public Adapter caseAnyOrder(AnyOrder object) {
				return createAnyOrderAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseIfThenElse(IfThenElse object) {
				return createIfThenElseAdapter();
			}
			@Override
			public Adapter caseIterate(Iterate object) {
				return createIterateAdapter();
			}
			@Override
			public Adapter caseRepeatWhile(RepeatWhile object) {
				return createRepeatWhileAdapter();
			}
			@Override
			public Adapter caseRepeatUntil(RepeatUntil object) {
				return createRepeatUntilAdapter();
			}
			@Override
			public Adapter caseControlConstructBag(ControlConstructBag object) {
				return createControlConstructBagAdapter();
			}
			@Override
			public Adapter caseControlConstructList(ControlConstructList object) {
				return createControlConstructListAdapter();
			}
			@Override
			public Adapter caseCompositeProcess(CompositeProcess object) {
				return createCompositeProcessAdapter();
			}
			@Override
			public Adapter casePerform(Perform object) {
				return createPerformAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link owls.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.ControlConstruct <em>Control Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.ControlConstruct
	 * @generated
	 */
	public Adapter createControlConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.Split
	 * @generated
	 */
	public Adapter createSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.SplitJoin
	 * @generated
	 */
	public Adapter createSplitJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.AnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.AnyOrder
	 * @generated
	 */
	public Adapter createAnyOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.IfThenElse
	 * @generated
	 */
	public Adapter createIfThenElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.Iterate <em>Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.Iterate
	 * @generated
	 */
	public Adapter createIterateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.RepeatWhile <em>Repeat While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.RepeatWhile
	 * @generated
	 */
	public Adapter createRepeatWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.RepeatUntil
	 * @generated
	 */
	public Adapter createRepeatUntilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.ControlConstructBag <em>Control Construct Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.ControlConstructBag
	 * @generated
	 */
	public Adapter createControlConstructBagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.ControlConstructList <em>Control Construct List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.ControlConstructList
	 * @generated
	 */
	public Adapter createControlConstructListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.CompositeProcess <em>Composite Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.CompositeProcess
	 * @generated
	 */
	public Adapter createCompositeProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link owls.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see owls.Perform
	 * @generated
	 */
	public Adapter createPerformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OwlsAdapterFactory
