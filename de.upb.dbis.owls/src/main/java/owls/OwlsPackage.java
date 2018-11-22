/**
 */
package owls;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see owls.OwlsFactory
 * @model kind="package"
 * @generated
 */
public interface OwlsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "owls";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.daml.org/services/owl-s/1.1/Process.owl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "owls";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OwlsPackage eINSTANCE = owls.impl.OwlsPackageImpl.init();

	/**
	 * The meta object id for the '{@link owls.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.ProcessImpl
	 * @see owls.impl.OwlsPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link owls.impl.ControlConstructImpl <em>Control Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.ControlConstructImpl
	 * @see owls.impl.OwlsPackageImpl#getControlConstruct()
	 * @generated
	 */
	int CONTROL_CONSTRUCT = 1;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT__COMPOSED_OF = 0;

	/**
	 * The number of structural features of the '<em>Control Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Control Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link owls.ControlConstructList <em>Control Construct List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.ControlConstructList
	 * @see owls.impl.OwlsPackageImpl#getControlConstructList()
	 * @generated
	 */
	int CONTROL_CONSTRUCT_LIST = 12;

	/**
	 * The meta object id for the '{@link owls.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.SequenceImpl
	 * @see owls.impl.OwlsPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COMPOSED_OF = CONTROL_CONSTRUCT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = CONTROL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.SplitImpl
	 * @see owls.impl.OwlsPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 3;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__COMPOSED_OF = CONTROL_CONSTRUCT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = CONTROL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.SplitJoinImpl <em>Split Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.SplitJoinImpl
	 * @see owls.impl.OwlsPackageImpl#getSplitJoin()
	 * @generated
	 */
	int SPLIT_JOIN = 4;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN__COMPOSED_OF = CONTROL_CONSTRUCT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Split Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN_OPERATION_COUNT = CONTROL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.AnyOrderImpl <em>Any Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.AnyOrderImpl
	 * @see owls.impl.OwlsPackageImpl#getAnyOrder()
	 * @generated
	 */
	int ANY_ORDER = 5;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER__COMPOSED_OF = CONTROL_CONSTRUCT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Any Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Any Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ORDER_OPERATION_COUNT = CONTROL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.ChoiceImpl
	 * @see owls.impl.OwlsPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__COMPOSED_OF = CONTROL_CONSTRUCT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__COMPONENTS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = CONTROL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.IfThenElseImpl <em>If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.IfThenElseImpl
	 * @see owls.impl.OwlsPackageImpl#getIfThenElse()
	 * @generated
	 */
	int IF_THEN_ELSE = 7;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__COMPOSED_OF = CONTROL_CONSTRUCT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__THEN = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__ELSE = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_OPERATION_COUNT = CONTROL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.IterateImpl <em>Iterate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.IterateImpl
	 * @see owls.impl.OwlsPackageImpl#getIterate()
	 * @generated
	 */
	int ITERATE = 8;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE__COMPOSED_OF = CONTROL_CONSTRUCT__COMPOSED_OF;

	/**
	 * The number of structural features of the '<em>Iterate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iterate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_OPERATION_COUNT = CONTROL_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.RepeatWhileImpl <em>Repeat While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.RepeatWhileImpl
	 * @see owls.impl.OwlsPackageImpl#getRepeatWhile()
	 * @generated
	 */
	int REPEAT_WHILE = 9;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE__COMPOSED_OF = ITERATE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>While Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE__WHILE_PROCESS = ITERATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE_FEATURE_COUNT = ITERATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repeat While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_WHILE_OPERATION_COUNT = ITERATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.RepeatUntilImpl
	 * @see owls.impl.OwlsPackageImpl#getRepeatUntil()
	 * @generated
	 */
	int REPEAT_UNTIL = 10;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__COMPOSED_OF = ITERATE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Until Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__UNTIL_PROCESS = ITERATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL_FEATURE_COUNT = ITERATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repeat Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL_OPERATION_COUNT = ITERATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.ControlConstructBag <em>Control Construct Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.ControlConstructBag
	 * @see owls.impl.OwlsPackageImpl#getControlConstructBag()
	 * @generated
	 */
	int CONTROL_CONSTRUCT_BAG = 11;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_BAG__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Control Construct Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_BAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Control Construct Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_BAG_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_LIST__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Control Construct List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Control Construct List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_CONSTRUCT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link owls.impl.CompositeProcessImpl <em>Composite Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.CompositeProcessImpl
	 * @see owls.impl.OwlsPackageImpl#getCompositeProcess()
	 * @generated
	 */
	int COMPOSITE_PROCESS = 13;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS__COMPOSED_OF = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESS_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link owls.impl.PerformImpl <em>Perform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see owls.impl.PerformImpl
	 * @see owls.impl.OwlsPackageImpl#getPerform()
	 * @generated
	 */
	int PERFORM = 14;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__COMPOSED_OF = CONTROL_CONSTRUCT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__PROCESS = CONTROL_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FEATURE_COUNT = CONTROL_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Perform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_OPERATION_COUNT = CONTROL_CONSTRUCT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link owls.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see owls.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link owls.ControlConstruct <em>Control Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct</em>'.
	 * @see owls.ControlConstruct
	 * @generated
	 */
	EClass getControlConstruct();

	/**
	 * Returns the meta object for the reference list '{@link owls.ControlConstruct#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composed Of</em>'.
	 * @see owls.ControlConstruct#getComposedOf()
	 * @see #getControlConstruct()
	 * @generated
	 */
	EReference getControlConstruct_ComposedOf();

	/**
	 * Returns the meta object for class '{@link owls.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see owls.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link owls.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see owls.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for class '{@link owls.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Join</em>'.
	 * @see owls.SplitJoin
	 * @generated
	 */
	EClass getSplitJoin();

	/**
	 * Returns the meta object for class '{@link owls.AnyOrder <em>Any Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Order</em>'.
	 * @see owls.AnyOrder
	 * @generated
	 */
	EClass getAnyOrder();

	/**
	 * Returns the meta object for class '{@link owls.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see owls.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link owls.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else</em>'.
	 * @see owls.IfThenElse
	 * @generated
	 */
	EClass getIfThenElse();

	/**
	 * Returns the meta object for the reference '{@link owls.IfThenElse#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then</em>'.
	 * @see owls.IfThenElse#getThen()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Then();

	/**
	 * Returns the meta object for the reference '{@link owls.IfThenElse#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else</em>'.
	 * @see owls.IfThenElse#getElse()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Else();

	/**
	 * Returns the meta object for class '{@link owls.Iterate <em>Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate</em>'.
	 * @see owls.Iterate
	 * @generated
	 */
	EClass getIterate();

	/**
	 * Returns the meta object for class '{@link owls.RepeatWhile <em>Repeat While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat While</em>'.
	 * @see owls.RepeatWhile
	 * @generated
	 */
	EClass getRepeatWhile();

	/**
	 * Returns the meta object for the reference '{@link owls.RepeatWhile#getWhileProcess <em>While Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>While Process</em>'.
	 * @see owls.RepeatWhile#getWhileProcess()
	 * @see #getRepeatWhile()
	 * @generated
	 */
	EReference getRepeatWhile_WhileProcess();

	/**
	 * Returns the meta object for class '{@link owls.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Until</em>'.
	 * @see owls.RepeatUntil
	 * @generated
	 */
	EClass getRepeatUntil();

	/**
	 * Returns the meta object for the reference '{@link owls.RepeatUntil#getUntilProcess <em>Until Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Until Process</em>'.
	 * @see owls.RepeatUntil#getUntilProcess()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_UntilProcess();

	/**
	 * Returns the meta object for class '{@link owls.ControlConstructBag <em>Control Construct Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct Bag</em>'.
	 * @see owls.ControlConstructBag
	 * @generated
	 */
	EClass getControlConstructBag();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.ControlConstructBag#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see owls.ControlConstructBag#getComponents()
	 * @see #getControlConstructBag()
	 * @generated
	 */
	EReference getControlConstructBag_Components();

	/**
	 * Returns the meta object for class '{@link owls.ControlConstructList <em>Control Construct List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Construct List</em>'.
	 * @see owls.ControlConstructList
	 * @generated
	 */
	EClass getControlConstructList();

	/**
	 * Returns the meta object for the containment reference list '{@link owls.ControlConstructList#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see owls.ControlConstructList#getComponents()
	 * @see #getControlConstructList()
	 * @generated
	 */
	EReference getControlConstructList_Components();

	/**
	 * Returns the meta object for class '{@link owls.CompositeProcess <em>Composite Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Process</em>'.
	 * @see owls.CompositeProcess
	 * @generated
	 */
	EClass getCompositeProcess();

	/**
	 * Returns the meta object for the containment reference '{@link owls.CompositeProcess#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composed Of</em>'.
	 * @see owls.CompositeProcess#getComposedOf()
	 * @see #getCompositeProcess()
	 * @generated
	 */
	EReference getCompositeProcess_ComposedOf();

	/**
	 * Returns the meta object for class '{@link owls.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform</em>'.
	 * @see owls.Perform
	 * @generated
	 */
	EClass getPerform();

	/**
	 * Returns the meta object for the reference list '{@link owls.Perform#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process</em>'.
	 * @see owls.Perform#getProcess()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_Process();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OwlsFactory getOwlsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link owls.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.ProcessImpl
		 * @see owls.impl.OwlsPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link owls.impl.ControlConstructImpl <em>Control Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.ControlConstructImpl
		 * @see owls.impl.OwlsPackageImpl#getControlConstruct()
		 * @generated
		 */
		EClass CONTROL_CONSTRUCT = eINSTANCE.getControlConstruct();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONSTRUCT__COMPOSED_OF = eINSTANCE.getControlConstruct_ComposedOf();

		/**
		 * The meta object literal for the '{@link owls.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.SequenceImpl
		 * @see owls.impl.OwlsPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link owls.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.SplitImpl
		 * @see owls.impl.OwlsPackageImpl#getSplit()
		 * @generated
		 */
		EClass SPLIT = eINSTANCE.getSplit();

		/**
		 * The meta object literal for the '{@link owls.impl.SplitJoinImpl <em>Split Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.SplitJoinImpl
		 * @see owls.impl.OwlsPackageImpl#getSplitJoin()
		 * @generated
		 */
		EClass SPLIT_JOIN = eINSTANCE.getSplitJoin();

		/**
		 * The meta object literal for the '{@link owls.impl.AnyOrderImpl <em>Any Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.AnyOrderImpl
		 * @see owls.impl.OwlsPackageImpl#getAnyOrder()
		 * @generated
		 */
		EClass ANY_ORDER = eINSTANCE.getAnyOrder();

		/**
		 * The meta object literal for the '{@link owls.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.ChoiceImpl
		 * @see owls.impl.OwlsPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link owls.impl.IfThenElseImpl <em>If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.IfThenElseImpl
		 * @see owls.impl.OwlsPackageImpl#getIfThenElse()
		 * @generated
		 */
		EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__THEN = eINSTANCE.getIfThenElse_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

		/**
		 * The meta object literal for the '{@link owls.impl.IterateImpl <em>Iterate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.IterateImpl
		 * @see owls.impl.OwlsPackageImpl#getIterate()
		 * @generated
		 */
		EClass ITERATE = eINSTANCE.getIterate();

		/**
		 * The meta object literal for the '{@link owls.impl.RepeatWhileImpl <em>Repeat While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.RepeatWhileImpl
		 * @see owls.impl.OwlsPackageImpl#getRepeatWhile()
		 * @generated
		 */
		EClass REPEAT_WHILE = eINSTANCE.getRepeatWhile();

		/**
		 * The meta object literal for the '<em><b>While Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_WHILE__WHILE_PROCESS = eINSTANCE.getRepeatWhile_WhileProcess();

		/**
		 * The meta object literal for the '{@link owls.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.RepeatUntilImpl
		 * @see owls.impl.OwlsPackageImpl#getRepeatUntil()
		 * @generated
		 */
		EClass REPEAT_UNTIL = eINSTANCE.getRepeatUntil();

		/**
		 * The meta object literal for the '<em><b>Until Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_UNTIL__UNTIL_PROCESS = eINSTANCE.getRepeatUntil_UntilProcess();

		/**
		 * The meta object literal for the '{@link owls.ControlConstructBag <em>Control Construct Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.ControlConstructBag
		 * @see owls.impl.OwlsPackageImpl#getControlConstructBag()
		 * @generated
		 */
		EClass CONTROL_CONSTRUCT_BAG = eINSTANCE.getControlConstructBag();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONSTRUCT_BAG__COMPONENTS = eINSTANCE.getControlConstructBag_Components();

		/**
		 * The meta object literal for the '{@link owls.ControlConstructList <em>Control Construct List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.ControlConstructList
		 * @see owls.impl.OwlsPackageImpl#getControlConstructList()
		 * @generated
		 */
		EClass CONTROL_CONSTRUCT_LIST = eINSTANCE.getControlConstructList();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_CONSTRUCT_LIST__COMPONENTS = eINSTANCE.getControlConstructList_Components();

		/**
		 * The meta object literal for the '{@link owls.impl.CompositeProcessImpl <em>Composite Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.CompositeProcessImpl
		 * @see owls.impl.OwlsPackageImpl#getCompositeProcess()
		 * @generated
		 */
		EClass COMPOSITE_PROCESS = eINSTANCE.getCompositeProcess();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PROCESS__COMPOSED_OF = eINSTANCE.getCompositeProcess_ComposedOf();

		/**
		 * The meta object literal for the '{@link owls.impl.PerformImpl <em>Perform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see owls.impl.PerformImpl
		 * @see owls.impl.OwlsPackageImpl#getPerform()
		 * @generated
		 */
		EClass PERFORM = eINSTANCE.getPerform();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__PROCESS = eINSTANCE.getPerform_Process();

	}

} //OwlsPackage
