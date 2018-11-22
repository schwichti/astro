/**
 */
package owls.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import owls.AnyOrder;
import owls.Choice;
import owls.CompositeProcess;
import owls.ControlConstruct;
import owls.IfThenElse;
import owls.Iterate;
import owls.OwlsFactory;
import owls.OwlsPackage;
import owls.Perform;
import owls.RepeatUntil;
import owls.RepeatWhile;
import owls.Sequence;
import owls.Split;
import owls.SplitJoin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlsFactoryImpl extends EFactoryImpl implements OwlsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OwlsFactory init() {
		try {
			OwlsFactory theOwlsFactory = (OwlsFactory)EPackage.Registry.INSTANCE.getEFactory(OwlsPackage.eNS_URI);
			if (theOwlsFactory != null) {
				return theOwlsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OwlsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OwlsPackage.PROCESS: return createProcess();
			case OwlsPackage.CONTROL_CONSTRUCT: return createControlConstruct();
			case OwlsPackage.SEQUENCE: return createSequence();
			case OwlsPackage.SPLIT: return createSplit();
			case OwlsPackage.SPLIT_JOIN: return createSplitJoin();
			case OwlsPackage.ANY_ORDER: return createAnyOrder();
			case OwlsPackage.CHOICE: return createChoice();
			case OwlsPackage.IF_THEN_ELSE: return createIfThenElse();
			case OwlsPackage.ITERATE: return createIterate();
			case OwlsPackage.REPEAT_WHILE: return createRepeatWhile();
			case OwlsPackage.REPEAT_UNTIL: return createRepeatUntil();
			case OwlsPackage.COMPOSITE_PROCESS: return createCompositeProcess();
			case OwlsPackage.PERFORM: return createPerform();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public owls.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlConstruct createControlConstruct() {
		ControlConstructImpl controlConstruct = new ControlConstructImpl();
		return controlConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split createSplit() {
		SplitImpl split = new SplitImpl();
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitJoin createSplitJoin() {
		SplitJoinImpl splitJoin = new SplitJoinImpl();
		return splitJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyOrder createAnyOrder() {
		AnyOrderImpl anyOrder = new AnyOrderImpl();
		return anyOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenElse createIfThenElse() {
		IfThenElseImpl ifThenElse = new IfThenElseImpl();
		return ifThenElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterate createIterate() {
		IterateImpl iterate = new IterateImpl();
		return iterate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatWhile createRepeatWhile() {
		RepeatWhileImpl repeatWhile = new RepeatWhileImpl();
		return repeatWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatUntil createRepeatUntil() {
		RepeatUntilImpl repeatUntil = new RepeatUntilImpl();
		return repeatUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeProcess createCompositeProcess() {
		CompositeProcessImpl compositeProcess = new CompositeProcessImpl();
		return compositeProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perform createPerform() {
		PerformImpl perform = new PerformImpl();
		return perform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsPackage getOwlsPackage() {
		return (OwlsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OwlsPackage getPackage() {
		return OwlsPackage.eINSTANCE;
	}

} //OwlsFactoryImpl
