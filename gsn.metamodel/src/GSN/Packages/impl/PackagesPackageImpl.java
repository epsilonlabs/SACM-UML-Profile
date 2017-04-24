/**
 */
package GSN.Packages.impl;

import GSN.Argumentation.ArgumentationPackage;

import GSN.Argumentation.impl.ArgumentationPackageImpl;

import GSN.Artefact.ArtefactPackage;

import GSN.Artefact.impl.ArtefactPackageImpl;

import GSN.Commons.CommonsPackage;

import GSN.Commons.impl.CommonsPackageImpl;

import GSN.Packages.AssuranceCasePackage;
import GSN.Packages.AssuranceCasePackageCitation;
import GSN.Packages.AssuranceCasePackageInterface;
import GSN.Packages.PackagesFactory;
import GSN.Packages.PackagesPackage;

import GSN.Terminology.TerminologyPackage;

import GSN.Terminology.impl.TerminologyPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagesPackageImpl extends EPackageImpl implements PackagesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assuranceCasePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assuranceCasePackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assuranceCasePackageCitationEClass = null;

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
	 * @see GSN.Packages.PackagesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PackagesPackageImpl() {
		super(eNS_URI, PackagesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PackagesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PackagesPackage init() {
		if (isInited) return (PackagesPackage)EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI);

		// Obtain or create and register package
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PackagesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		TerminologyPackageImpl theTerminologyPackage = (TerminologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TerminologyPackage.eNS_URI) instanceof TerminologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TerminologyPackage.eNS_URI) : TerminologyPackage.eINSTANCE);
		ArgumentationPackageImpl theArgumentationPackage = (ArgumentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) instanceof ArgumentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) : ArgumentationPackage.eINSTANCE);
		ArtefactPackageImpl theArtefactPackage = (ArtefactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtefactPackage.eNS_URI) instanceof ArtefactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtefactPackage.eNS_URI) : ArtefactPackage.eINSTANCE);

		// Create package meta-data objects
		thePackagesPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theTerminologyPackage.createPackageContents();
		theArgumentationPackage.createPackageContents();
		theArtefactPackage.createPackageContents();

		// Initialize created meta-data
		thePackagesPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theTerminologyPackage.initializePackageContents();
		theArgumentationPackage.initializePackageContents();
		theArtefactPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePackagesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PackagesPackage.eNS_URI, thePackagesPackage);
		return thePackagesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssuranceCasePackage() {
		return assuranceCasePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_AssuranceCasePackageCitation() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_AssuranceCasePackage() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_Interface() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_ArgumentPackage() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_ArtefactPackage() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackage_TerminologyPackage() {
		return (EReference)assuranceCasePackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssuranceCasePackageInterface() {
		return assuranceCasePackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssuranceCasePackageCitation() {
		return assuranceCasePackageCitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCasePackageCitation_CitedPackage() {
		return (EReference)assuranceCasePackageCitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesFactory getPackagesFactory() {
		return (PackagesFactory)getEFactoryInstance();
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
		assuranceCasePackageEClass = createEClass(ASSURANCE_CASE_PACKAGE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__INTERFACE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE);
		createEReference(assuranceCasePackageEClass, ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE);

		assuranceCasePackageInterfaceEClass = createEClass(ASSURANCE_CASE_PACKAGE_INTERFACE);

		assuranceCasePackageCitationEClass = createEClass(ASSURANCE_CASE_PACKAGE_CITATION);
		createEReference(assuranceCasePackageCitationEClass, ASSURANCE_CASE_PACKAGE_CITATION__CITED_PACKAGE);
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

		// Obtain other dependent packages
		ArtefactPackage theArtefactPackage = (ArtefactPackage)EPackage.Registry.INSTANCE.getEPackage(ArtefactPackage.eNS_URI);
		ArgumentationPackage theArgumentationPackage = (ArgumentationPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI);
		TerminologyPackage theTerminologyPackage = (TerminologyPackage)EPackage.Registry.INSTANCE.getEPackage(TerminologyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assuranceCasePackageEClass.getESuperTypes().add(theArtefactPackage.getArtefactElement());
		assuranceCasePackageInterfaceEClass.getESuperTypes().add(this.getAssuranceCasePackage());
		assuranceCasePackageCitationEClass.getESuperTypes().add(this.getAssuranceCasePackage());

		// Initialize classes and features; add operations and parameters
		initEClass(assuranceCasePackageEClass, AssuranceCasePackage.class, "AssuranceCasePackage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssuranceCasePackage_AssuranceCasePackageCitation(), this.getAssuranceCasePackageCitation(), null, "assuranceCasePackageCitation", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_AssuranceCasePackage(), this.getAssuranceCasePackage(), null, "assuranceCasePackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_Interface(), this.getAssuranceCasePackageInterface(), null, "interface", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_ArgumentPackage(), theArgumentationPackage.getArgumentPackage(), null, "argumentPackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_ArtefactPackage(), theArtefactPackage.getArtefactPackage(), null, "artefactPackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCasePackage_TerminologyPackage(), theTerminologyPackage.getTerminologyPackage(), null, "terminologyPackage", null, 0, -1, AssuranceCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assuranceCasePackageInterfaceEClass, AssuranceCasePackageInterface.class, "AssuranceCasePackageInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assuranceCasePackageCitationEClass, AssuranceCasePackageCitation.class, "AssuranceCasePackageCitation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssuranceCasePackageCitation_CitedPackage(), this.getAssuranceCasePackage(), null, "citedPackage", null, 1, 1, AssuranceCasePackageCitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PackagesPackageImpl
