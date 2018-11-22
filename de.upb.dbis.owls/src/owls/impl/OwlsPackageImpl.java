/**
 */
package owls.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import owls.AnyOrder;
import owls.Choice;
import owls.CompositeProcess;
import owls.ControlConstruct;
import owls.ControlConstructBag;
import owls.ControlConstructList;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlsPackageImpl extends EPackageImpl implements OwlsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifThenElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatWhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatUntilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlConstructBagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlConstructListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see owls.OwlsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OwlsPackageImpl() {
		super(eNS_URI, OwlsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OwlsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OwlsPackage init() {
		if (isInited) return (OwlsPackage)EPackage.Registry.INSTANCE.getEPackage(OwlsPackage.eNS_URI);

		// Obtain or create and register package
		OwlsPackageImpl theOwlsPackage = (OwlsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OwlsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OwlsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOwlsPackage.createPackageContents();

		// Initialize created meta-data
		theOwlsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOwlsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OwlsPackage.eNS_URI, theOwlsPackage);
		return theOwlsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlConstruct() {
		return controlConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConstruct_ComposedOf() {
		return (EReference)controlConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplit() {
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitJoin() {
		return splitJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyOrder() {
		return anyOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfThenElse() {
		return ifThenElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElse_Then() {
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElse_Else() {
		return (EReference)ifThenElseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterate() {
		return iterateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatWhile() {
		return repeatWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatWhile_WhileProcess() {
		return (EReference)repeatWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatUntil() {
		return repeatUntilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatUntil_UntilProcess() {
		return (EReference)repeatUntilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlConstructBag() {
		return controlConstructBagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConstructBag_Components() {
		return (EReference)controlConstructBagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlConstructList() {
		return controlConstructListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlConstructList_Components() {
		return (EReference)controlConstructListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeProcess() {
		return compositeProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeProcess_ComposedOf() {
		return (EReference)compositeProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerform() {
		return performEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerform_Process() {
		return (EReference)performEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsFactory getOwlsFactory() {
		return (OwlsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		processEClass = createEClass(PROCESS);

		controlConstructEClass = createEClass(CONTROL_CONSTRUCT);
		createEReference(controlConstructEClass, CONTROL_CONSTRUCT__COMPOSED_OF);

		sequenceEClass = createEClass(SEQUENCE);

		splitEClass = createEClass(SPLIT);

		splitJoinEClass = createEClass(SPLIT_JOIN);

		anyOrderEClass = createEClass(ANY_ORDER);

		choiceEClass = createEClass(CHOICE);

		ifThenElseEClass = createEClass(IF_THEN_ELSE);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__THEN);
		createEReference(ifThenElseEClass, IF_THEN_ELSE__ELSE);

		iterateEClass = createEClass(ITERATE);

		repeatWhileEClass = createEClass(REPEAT_WHILE);
		createEReference(repeatWhileEClass, REPEAT_WHILE__WHILE_PROCESS);

		repeatUntilEClass = createEClass(REPEAT_UNTIL);
		createEReference(repeatUntilEClass, REPEAT_UNTIL__UNTIL_PROCESS);

		controlConstructBagEClass = createEClass(CONTROL_CONSTRUCT_BAG);
		createEReference(controlConstructBagEClass, CONTROL_CONSTRUCT_BAG__COMPONENTS);

		controlConstructListEClass = createEClass(CONTROL_CONSTRUCT_LIST);
		createEReference(controlConstructListEClass, CONTROL_CONSTRUCT_LIST__COMPONENTS);

		compositeProcessEClass = createEClass(COMPOSITE_PROCESS);
		createEReference(compositeProcessEClass, COMPOSITE_PROCESS__COMPOSED_OF);

		performEClass = createEClass(PERFORM);
		createEReference(performEClass, PERFORM__PROCESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sequenceEClass.getESuperTypes().add(this.getControlConstructList());
		splitEClass.getESuperTypes().add(this.getControlConstruct());
		splitEClass.getESuperTypes().add(this.getControlConstructBag());
		splitJoinEClass.getESuperTypes().add(this.getControlConstruct());
		splitJoinEClass.getESuperTypes().add(this.getControlConstructBag());
		anyOrderEClass.getESuperTypes().add(this.getControlConstruct());
		anyOrderEClass.getESuperTypes().add(this.getControlConstructBag());
		choiceEClass.getESuperTypes().add(this.getControlConstruct());
		choiceEClass.getESuperTypes().add(this.getControlConstructBag());
		ifThenElseEClass.getESuperTypes().add(this.getControlConstruct());
		iterateEClass.getESuperTypes().add(this.getControlConstruct());
		repeatWhileEClass.getESuperTypes().add(this.getIterate());
		repeatUntilEClass.getESuperTypes().add(this.getIterate());
		compositeProcessEClass.getESuperTypes().add(this.getProcess());
		performEClass.getESuperTypes().add(this.getControlConstruct());

		// Initialize classes, features, and operations; add parameters
		initEClass(processEClass, owls.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlConstructEClass, ControlConstruct.class, "ControlConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlConstruct_ComposedOf(), this.getControlConstruct(), null, "composedOf", null, 0, -1, ControlConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitEClass, Split.class, "Split", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitJoinEClass, SplitJoin.class, "SplitJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyOrderEClass, AnyOrder.class, "AnyOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifThenElseEClass, IfThenElse.class, "IfThenElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfThenElse_Then(), this.getControlConstruct(), null, "then", null, 0, -1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElse_Else(), this.getControlConstruct(), null, "else", null, 0, -1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iterateEClass, Iterate.class, "Iterate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatWhileEClass, RepeatWhile.class, "RepeatWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatWhile_WhileProcess(), this.getControlConstruct(), null, "whileProcess", null, 0, 1, RepeatWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatUntilEClass, RepeatUntil.class, "RepeatUntil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatUntil_UntilProcess(), this.getControlConstruct(), null, "untilProcess", null, 0, 1, RepeatUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlConstructBagEClass, ControlConstructBag.class, "ControlConstructBag", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlConstructBag_Components(), this.getControlConstruct(), null, "components", null, 0, -1, ControlConstructBag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controlConstructListEClass, ControlConstructList.class, "ControlConstructList", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlConstructList_Components(), this.getControlConstruct(), null, "components", null, 0, -1, ControlConstructList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeProcessEClass, CompositeProcess.class, "CompositeProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeProcess_ComposedOf(), this.getControlConstruct(), null, "composedOf", null, 0, 1, CompositeProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performEClass, Perform.class, "Perform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerform_Process(), this.getProcess(), null, "process", null, 0, -1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OwlsPackageImpl
