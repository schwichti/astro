/**
 */
package owls;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see owls.OwlsPackage
 * @generated
 */
public interface OwlsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OwlsFactory eINSTANCE = owls.impl.OwlsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Control Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Construct</em>'.
	 * @generated
	 */
	ControlConstruct createControlConstruct();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split</em>'.
	 * @generated
	 */
	Split createSplit();

	/**
	 * Returns a new object of class '<em>Split Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Join</em>'.
	 * @generated
	 */
	SplitJoin createSplitJoin();

	/**
	 * Returns a new object of class '<em>Any Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Order</em>'.
	 * @generated
	 */
	AnyOrder createAnyOrder();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Then Else</em>'.
	 * @generated
	 */
	IfThenElse createIfThenElse();

	/**
	 * Returns a new object of class '<em>Iterate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterate</em>'.
	 * @generated
	 */
	Iterate createIterate();

	/**
	 * Returns a new object of class '<em>Repeat While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat While</em>'.
	 * @generated
	 */
	RepeatWhile createRepeatWhile();

	/**
	 * Returns a new object of class '<em>Repeat Until</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Until</em>'.
	 * @generated
	 */
	RepeatUntil createRepeatUntil();

	/**
	 * Returns a new object of class '<em>Composite Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Process</em>'.
	 * @generated
	 */
	CompositeProcess createCompositeProcess();

	/**
	 * Returns a new object of class '<em>Perform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform</em>'.
	 * @generated
	 */
	Perform createPerform();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OwlsPackage getOwlsPackage();

} //OwlsFactory
