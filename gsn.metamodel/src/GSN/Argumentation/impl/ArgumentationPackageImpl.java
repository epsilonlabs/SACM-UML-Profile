/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentAsset;
import GSN.Argumentation.ArgumentAssetCitation;
import GSN.Argumentation.ArgumentPackage;
import GSN.Argumentation.ArgumentPackageBinding;
import GSN.Argumentation.ArgumentPackageCitation;
import GSN.Argumentation.ArgumentPackageInterface;
import GSN.Argumentation.ArgumentReasoning;
import GSN.Argumentation.ArgumentationElement;
import GSN.Argumentation.ArgumentationFactory;
import GSN.Argumentation.ArgumentationPackage;
import GSN.Argumentation.ArtefactElementCitation;
import GSN.Argumentation.AssertedChallenge;
import GSN.Argumentation.AssertedContext;
import GSN.Argumentation.AssertedCounterEvidence;
import GSN.Argumentation.AssertedEvidence;
import GSN.Argumentation.AssertedInference;
import GSN.Argumentation.AssertedRelationship;
import GSN.Argumentation.Assertion;
import GSN.Argumentation.Assumption;
import GSN.Argumentation.AwayContext;
import GSN.Argumentation.AwayGoal;
import GSN.Argumentation.AwaySolution;
import GSN.Argumentation.Claim;
import GSN.Argumentation.Context;
import GSN.Argumentation.Contract;
import GSN.Argumentation.Goal;
import GSN.Argumentation.InContextOf;
import GSN.Argumentation.Justification;
import GSN.Argumentation.Module;
import GSN.Argumentation.ModuleReference;
import GSN.Argumentation.Solution;
import GSN.Argumentation.Strategy;
import GSN.Argumentation.SupportedBy;

import GSN.Artefact.ArtefactPackage;

import GSN.Artefact.impl.ArtefactPackageImpl;

import GSN.Commons.CommonsPackage;

import GSN.Commons.impl.CommonsPackageImpl;

import GSN.Packages.PackagesPackage;

import GSN.Packages.impl.PackagesPackageImpl;

import GSN.Terminology.TerminologyPackage;

import GSN.Terminology.impl.TerminologyPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class ArgumentationPackageImpl extends EPackageImpl implements ArgumentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentPackageCitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artefactElementCitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentAssetCitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awaySolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentReasoningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedInferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedChallengeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedCounterEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inContextOfEClass = null;

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
	 * @see GSN.Argumentation.ArgumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArgumentationPackageImpl() {
		super(eNS_URI, ArgumentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArgumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArgumentationPackage init() {
		if (isInited) return (ArgumentationPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI);

		// Obtain or create and register package
		ArgumentationPackageImpl theArgumentationPackage = (ArgumentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArgumentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArgumentationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI) : CommonsPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		TerminologyPackageImpl theTerminologyPackage = (TerminologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TerminologyPackage.eNS_URI) instanceof TerminologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TerminologyPackage.eNS_URI) : TerminologyPackage.eINSTANCE);
		ArtefactPackageImpl theArtefactPackage = (ArtefactPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtefactPackage.eNS_URI) instanceof ArtefactPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtefactPackage.eNS_URI) : ArtefactPackage.eINSTANCE);

		// Create package meta-data objects
		theArgumentationPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theTerminologyPackage.createPackageContents();
		theArtefactPackage.createPackageContents();

		// Initialize created meta-data
		theArgumentationPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theTerminologyPackage.initializePackageContents();
		theArtefactPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArgumentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArgumentationPackage.eNS_URI, theArgumentationPackage);
		return theArgumentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentationElement() {
		return argumentationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentationElement_Content() {
		return (EAttribute)argumentationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentPackage() {
		return argumentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentPackage_ArgumentAsset() {
		return (EReference)argumentPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentPackage_ArgumentPackage() {
		return (EReference)argumentPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentPackage_Interface() {
		return (EReference)argumentPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentPackage_ArgumentPackageCitation() {
		return (EReference)argumentPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Module() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentPackageCitation() {
		return argumentPackageCitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentPackageCitation_CitedPackage() {
		return (EReference)argumentPackageCitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentPackageBinding() {
		return argumentPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentPackageBinding_ParticipantPackage() {
		return (EReference)argumentPackageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentPackageInterface() {
		return argumentPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentAsset() {
		return argumentAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtefactElementCitation() {
		return artefactElementCitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtefactElementCitation_ExternalReference() {
		return (EAttribute)artefactElementCitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtefactElementCitation_CitedArtefact() {
		return (EReference)artefactElementCitationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolution_IsPublic() {
		return (EAttribute)solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentAssetCitation() {
		return argumentAssetCitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentAssetCitation_CitedAsset() {
		return (EReference)argumentAssetCitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwayGoal() {
		return awayGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwayGoal_AwayGoal() {
		return (EReference)awayGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwayGoal_ModuleIdentifier() {
		return (EAttribute)awayGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwaySolution() {
		return awaySolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwaySolution_AwaySolution() {
		return (EReference)awaySolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwaySolution_ModuleIdentifier() {
		return (EAttribute)awaySolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwayContext() {
		return awayContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwayContext_AwayContext() {
		return (EReference)awayContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwayContext_ModuleIdentifier() {
		return (EAttribute)awayContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleReference() {
		return moduleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleReference_Module() {
		return (EReference)moduleReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_Assumed() {
		return (EAttribute)claimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Roles() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_IsPublic() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Undeveloped() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_ToBeSupportedByContract() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJustification() {
		return justificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentReasoning() {
		return argumentReasoningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentReasoning_Structure() {
		return (EReference)argumentReasoningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_Undeveloped() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_IsPublic() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_RefersToExternalMaterial() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedRelationship() {
		return assertedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertedRelationship_Source() {
		return (EReference)assertedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertedRelationship_Target() {
		return (EReference)assertedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertedRelationship_Requires() {
		return (EAttribute)assertedRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertedRelationship_Many() {
		return (EAttribute)assertedRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertedRelationship_Optional() {
		return (EAttribute)assertedRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedInference() {
		return assertedInferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedBy() {
		return supportedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedEvidence() {
		return assertedEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedChallenge() {
		return assertedChallengeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedCounterEvidence() {
		return assertedCounterEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedContext() {
		return assertedContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInContextOf() {
		return inContextOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFactory getArgumentationFactory() {
		return (ArgumentationFactory)getEFactoryInstance();
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
		argumentationElementEClass = createEClass(ARGUMENTATION_ELEMENT);
		createEAttribute(argumentationElementEClass, ARGUMENTATION_ELEMENT__CONTENT);

		argumentPackageEClass = createEClass(ARGUMENT_PACKAGE);
		createEReference(argumentPackageEClass, ARGUMENT_PACKAGE__ARGUMENT_ASSET);
		createEReference(argumentPackageEClass, ARGUMENT_PACKAGE__ARGUMENT_PACKAGE);
		createEReference(argumentPackageEClass, ARGUMENT_PACKAGE__INTERFACE);
		createEReference(argumentPackageEClass, ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODULE);

		argumentPackageCitationEClass = createEClass(ARGUMENT_PACKAGE_CITATION);
		createEReference(argumentPackageCitationEClass, ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE);

		argumentPackageBindingEClass = createEClass(ARGUMENT_PACKAGE_BINDING);
		createEReference(argumentPackageBindingEClass, ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE);

		contractEClass = createEClass(CONTRACT);

		argumentPackageInterfaceEClass = createEClass(ARGUMENT_PACKAGE_INTERFACE);

		argumentAssetEClass = createEClass(ARGUMENT_ASSET);

		assertionEClass = createEClass(ASSERTION);

		artefactElementCitationEClass = createEClass(ARTEFACT_ELEMENT_CITATION);
		createEAttribute(artefactElementCitationEClass, ARTEFACT_ELEMENT_CITATION__EXTERNAL_REFERENCE);
		createEReference(artefactElementCitationEClass, ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT);

		solutionEClass = createEClass(SOLUTION);
		createEAttribute(solutionEClass, SOLUTION__IS_PUBLIC);

		argumentAssetCitationEClass = createEClass(ARGUMENT_ASSET_CITATION);
		createEReference(argumentAssetCitationEClass, ARGUMENT_ASSET_CITATION__CITED_ASSET);

		awayGoalEClass = createEClass(AWAY_GOAL);
		createEReference(awayGoalEClass, AWAY_GOAL__AWAY_GOAL);
		createEAttribute(awayGoalEClass, AWAY_GOAL__MODULE_IDENTIFIER);

		awaySolutionEClass = createEClass(AWAY_SOLUTION);
		createEReference(awaySolutionEClass, AWAY_SOLUTION__AWAY_SOLUTION);
		createEAttribute(awaySolutionEClass, AWAY_SOLUTION__MODULE_IDENTIFIER);

		awayContextEClass = createEClass(AWAY_CONTEXT);
		createEReference(awayContextEClass, AWAY_CONTEXT__AWAY_CONTEXT);
		createEAttribute(awayContextEClass, AWAY_CONTEXT__MODULE_IDENTIFIER);

		moduleReferenceEClass = createEClass(MODULE_REFERENCE);
		createEReference(moduleReferenceEClass, MODULE_REFERENCE__MODULE);

		claimEClass = createEClass(CLAIM);
		createEAttribute(claimEClass, CLAIM__ASSUMED);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__ROLES);
		createEAttribute(goalEClass, GOAL__IS_PUBLIC);
		createEAttribute(goalEClass, GOAL__UNDEVELOPED);
		createEAttribute(goalEClass, GOAL__TO_BE_SUPPORTED_BY_CONTRACT);

		justificationEClass = createEClass(JUSTIFICATION);

		assumptionEClass = createEClass(ASSUMPTION);

		argumentReasoningEClass = createEClass(ARGUMENT_REASONING);
		createEReference(argumentReasoningEClass, ARGUMENT_REASONING__STRUCTURE);

		strategyEClass = createEClass(STRATEGY);
		createEAttribute(strategyEClass, STRATEGY__UNDEVELOPED);

		contextEClass = createEClass(CONTEXT);
		createEAttribute(contextEClass, CONTEXT__IS_PUBLIC);
		createEAttribute(contextEClass, CONTEXT__REFERS_TO_EXTERNAL_MATERIAL);

		assertedRelationshipEClass = createEClass(ASSERTED_RELATIONSHIP);
		createEReference(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__SOURCE);
		createEReference(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__TARGET);
		createEAttribute(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__REQUIRES);
		createEAttribute(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__MANY);
		createEAttribute(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__OPTIONAL);

		assertedInferenceEClass = createEClass(ASSERTED_INFERENCE);

		supportedByEClass = createEClass(SUPPORTED_BY);

		assertedEvidenceEClass = createEClass(ASSERTED_EVIDENCE);

		assertedChallengeEClass = createEClass(ASSERTED_CHALLENGE);

		assertedCounterEvidenceEClass = createEClass(ASSERTED_COUNTER_EVIDENCE);

		assertedContextEClass = createEClass(ASSERTED_CONTEXT);

		inContextOfEClass = createEClass(IN_CONTEXT_OF);
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
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		ArtefactPackage theArtefactPackage = (ArtefactPackage)EPackage.Registry.INSTANCE.getEPackage(ArtefactPackage.eNS_URI);
		TerminologyPackage theTerminologyPackage = (TerminologyPackage)EPackage.Registry.INSTANCE.getEPackage(TerminologyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		argumentationElementEClass.getESuperTypes().add(theCommonsPackage.getModelElement());
		argumentPackageEClass.getESuperTypes().add(this.getArgumentationElement());
		moduleEClass.getESuperTypes().add(this.getArgumentPackage());
		argumentPackageCitationEClass.getESuperTypes().add(this.getArgumentPackage());
		argumentPackageBindingEClass.getESuperTypes().add(this.getArgumentPackage());
		contractEClass.getESuperTypes().add(this.getArgumentPackageBinding());
		argumentPackageInterfaceEClass.getESuperTypes().add(this.getArgumentPackage());
		argumentAssetEClass.getESuperTypes().add(this.getArgumentationElement());
		assertionEClass.getESuperTypes().add(this.getArgumentAsset());
		artefactElementCitationEClass.getESuperTypes().add(this.getArgumentAsset());
		solutionEClass.getESuperTypes().add(this.getArtefactElementCitation());
		argumentAssetCitationEClass.getESuperTypes().add(this.getArgumentAsset());
		awayGoalEClass.getESuperTypes().add(this.getArgumentAssetCitation());
		awaySolutionEClass.getESuperTypes().add(this.getArgumentAssetCitation());
		awayContextEClass.getESuperTypes().add(this.getArgumentAssetCitation());
		moduleReferenceEClass.getESuperTypes().add(this.getArgumentPackageCitation());
		claimEClass.getESuperTypes().add(this.getAssertion());
		goalEClass.getESuperTypes().add(this.getClaim());
		justificationEClass.getESuperTypes().add(this.getClaim());
		assumptionEClass.getESuperTypes().add(this.getClaim());
		argumentReasoningEClass.getESuperTypes().add(this.getArgumentAsset());
		strategyEClass.getESuperTypes().add(this.getArgumentReasoning());
		contextEClass.getESuperTypes().add(this.getArgumentAsset());
		assertedRelationshipEClass.getESuperTypes().add(this.getAssertion());
		assertedInferenceEClass.getESuperTypes().add(this.getAssertedRelationship());
		supportedByEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedEvidenceEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedChallengeEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedCounterEvidenceEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedContextEClass.getESuperTypes().add(this.getAssertedRelationship());
		inContextOfEClass.getESuperTypes().add(this.getAssertedContext());

		// Initialize classes and features; add operations and parameters
		initEClass(argumentationElementEClass, ArgumentationElement.class, "ArgumentationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgumentationElement_Content(), ecorePackage.getEString(), "content", null, 0, 1, ArgumentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentPackageEClass, ArgumentPackage.class, "ArgumentPackage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentPackage_ArgumentAsset(), this.getArgumentAsset(), null, "argumentAsset", null, 0, -1, ArgumentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentPackage_ArgumentPackage(), this.getArgumentPackage(), null, "argumentPackage", null, 0, -1, ArgumentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentPackage_Interface(), this.getArgumentPackageInterface(), null, "interface", null, 0, -1, ArgumentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentPackage_ArgumentPackageCitation(), this.getArgumentPackageCitation(), null, "argumentPackageCitation", null, 0, -1, ArgumentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Module(), this.getModule(), null, "module", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentPackageCitationEClass, ArgumentPackageCitation.class, "ArgumentPackageCitation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentPackageCitation_CitedPackage(), this.getArgumentPackage(), null, "citedPackage", null, 1, 1, ArgumentPackageCitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentPackageBindingEClass, ArgumentPackageBinding.class, "ArgumentPackageBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentPackageBinding_ParticipantPackage(), this.getArgumentPackage(), null, "participantPackage", null, 2, -1, ArgumentPackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentPackageInterfaceEClass, ArgumentPackageInterface.class, "ArgumentPackageInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentAssetEClass, ArgumentAsset.class, "ArgumentAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(artefactElementCitationEClass, ArtefactElementCitation.class, "ArtefactElementCitation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtefactElementCitation_ExternalReference(), ecorePackage.getEString(), "externalReference", null, 0, 1, ArtefactElementCitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtefactElementCitation_CitedArtefact(), theArtefactPackage.getArtefactElement(), null, "citedArtefact", null, 0, 1, ArtefactElementCitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolution_IsPublic(), ecorePackage.getEBooleanObject(), "isPublic", "false", 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentAssetCitationEClass, ArgumentAssetCitation.class, "ArgumentAssetCitation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentAssetCitation_CitedAsset(), this.getArgumentAsset(), null, "citedAsset", null, 1, 1, ArgumentAssetCitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awayGoalEClass, AwayGoal.class, "AwayGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwayGoal_AwayGoal(), this.getGoal(), null, "awayGoal", null, 0, 1, AwayGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwayGoal_ModuleIdentifier(), ecorePackage.getEString(), "moduleIdentifier", null, 0, 1, AwayGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awaySolutionEClass, AwaySolution.class, "AwaySolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwaySolution_AwaySolution(), this.getSolution(), null, "awaySolution", null, 0, 1, AwaySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwaySolution_ModuleIdentifier(), ecorePackage.getEString(), "moduleIdentifier", null, 0, 1, AwaySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awayContextEClass, AwayContext.class, "AwayContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwayContext_AwayContext(), this.getContext(), null, "awayContext", null, 0, 1, AwayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwayContext_ModuleIdentifier(), ecorePackage.getEString(), "moduleIdentifier", null, 0, 1, AwayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleReferenceEClass, ModuleReference.class, "ModuleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleReference_Module(), this.getModule(), null, "module", null, 0, 1, ModuleReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claimEClass, Claim.class, "Claim", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClaim_Assumed(), ecorePackage.getEBooleanObject(), "assumed", null, 0, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_Roles(), theTerminologyPackage.getRole(), null, "roles", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_IsPublic(), ecorePackage.getEBooleanObject(), "isPublic", "false", 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Undeveloped(), ecorePackage.getEBooleanObject(), "undeveloped", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_ToBeSupportedByContract(), ecorePackage.getEBooleanObject(), "toBeSupportedByContract", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentReasoningEClass, ArgumentReasoning.class, "ArgumentReasoning", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentReasoning_Structure(), this.getArgumentPackage(), null, "structure", null, 0, 1, ArgumentReasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrategy_Undeveloped(), ecorePackage.getEBooleanObject(), "undeveloped", null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContext_IsPublic(), ecorePackage.getEBooleanObject(), "isPublic", "false", 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_RefersToExternalMaterial(), ecorePackage.getEBooleanObject(), "refersToExternalMaterial", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertedRelationshipEClass, AssertedRelationship.class, "AssertedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertedRelationship_Source(), this.getArgumentAsset(), null, "source", null, 0, -1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertedRelationship_Target(), this.getArgumentAsset(), null, "target", null, 0, -1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertedRelationship_Requires(), ecorePackage.getEIntegerObject(), "requires", "-1", 0, 1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertedRelationship_Many(), ecorePackage.getEBooleanObject(), "many", "false", 0, 1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertedRelationship_Optional(), ecorePackage.getEBooleanObject(), "optional", "false", 0, 1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertedInferenceEClass, AssertedInference.class, "AssertedInference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supportedByEClass, SupportedBy.class, "SupportedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedEvidenceEClass, AssertedEvidence.class, "AssertedEvidence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedChallengeEClass, AssertedChallenge.class, "AssertedChallenge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedCounterEvidenceEClass, AssertedCounterEvidence.class, "AssertedCounterEvidence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedContextEClass, AssertedContext.class, "AssertedContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inContextOfEClass, InContextOf.class, "InContextOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ArgumentationPackageImpl
