/**
 */
package owls.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see owls.OwlsPackage
 * @generated
 */
public class OwlsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OwlsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsSwitch() {
		if (modelPackage == null) {
			modelPackage = OwlsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OwlsPackage.PROCESS: {
				owls.Process process = (owls.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.CONTROL_CONSTRUCT: {
				ControlConstruct controlConstruct = (ControlConstruct)theEObject;
				T result = caseControlConstruct(controlConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseControlConstructList(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.SPLIT: {
				Split split = (Split)theEObject;
				T result = caseSplit(split);
				if (result == null) result = caseControlConstruct(split);
				if (result == null) result = caseControlConstructBag(split);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.SPLIT_JOIN: {
				SplitJoin splitJoin = (SplitJoin)theEObject;
				T result = caseSplitJoin(splitJoin);
				if (result == null) result = caseControlConstruct(splitJoin);
				if (result == null) result = caseControlConstructBag(splitJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.ANY_ORDER: {
				AnyOrder anyOrder = (AnyOrder)theEObject;
				T result = caseAnyOrder(anyOrder);
				if (result == null) result = caseControlConstruct(anyOrder);
				if (result == null) result = caseControlConstructBag(anyOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseControlConstruct(choice);
				if (result == null) result = caseControlConstructBag(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.IF_THEN_ELSE: {
				IfThenElse ifThenElse = (IfThenElse)theEObject;
				T result = caseIfThenElse(ifThenElse);
				if (result == null) result = caseControlConstruct(ifThenElse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.ITERATE: {
				Iterate iterate = (Iterate)theEObject;
				T result = caseIterate(iterate);
				if (result == null) result = caseControlConstruct(iterate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.REPEAT_WHILE: {
				RepeatWhile repeatWhile = (RepeatWhile)theEObject;
				T result = caseRepeatWhile(repeatWhile);
				if (result == null) result = caseIterate(repeatWhile);
				if (result == null) result = caseControlConstruct(repeatWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.REPEAT_UNTIL: {
				RepeatUntil repeatUntil = (RepeatUntil)theEObject;
				T result = caseRepeatUntil(repeatUntil);
				if (result == null) result = caseIterate(repeatUntil);
				if (result == null) result = caseControlConstruct(repeatUntil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.CONTROL_CONSTRUCT_BAG: {
				ControlConstructBag controlConstructBag = (ControlConstructBag)theEObject;
				T result = caseControlConstructBag(controlConstructBag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.CONTROL_CONSTRUCT_LIST: {
				ControlConstructList controlConstructList = (ControlConstructList)theEObject;
				T result = caseControlConstructList(controlConstructList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.COMPOSITE_PROCESS: {
				CompositeProcess compositeProcess = (CompositeProcess)theEObject;
				T result = caseCompositeProcess(compositeProcess);
				if (result == null) result = caseProcess(compositeProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OwlsPackage.PERFORM: {
				Perform perform = (Perform)theEObject;
				T result = casePerform(perform);
				if (result == null) result = caseControlConstruct(perform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(owls.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlConstruct(ControlConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplit(Split object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitJoin(SplitJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyOrder(AnyOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Then Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfThenElse(IfThenElse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterate(Iterate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatWhile(RepeatWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatUntil(RepeatUntil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Construct Bag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Construct Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlConstructBag(ControlConstructBag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Construct List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Construct List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlConstructList(ControlConstructList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeProcess(CompositeProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerform(Perform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OwlsSwitch
