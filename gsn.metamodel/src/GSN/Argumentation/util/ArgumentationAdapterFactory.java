/**
 */
package GSN.Argumentation.util;

import GSN.Argumentation.*;

import GSN.Commons.ModelElement;
import GSN.Commons.SACMElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see GSN.Argumentation.ArgumentationPackage
 * @generated
 */
public class ArgumentationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArgumentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArgumentationPackage.eINSTANCE;
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
	protected ArgumentationSwitch<Adapter> modelSwitch =
		new ArgumentationSwitch<Adapter>() {
			@Override
			public Adapter caseArgumentationElement(ArgumentationElement object) {
				return createArgumentationElementAdapter();
			}
			@Override
			public Adapter caseArgumentPackage(ArgumentPackage object) {
				return createArgumentPackageAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseArgumentPackageCitation(ArgumentPackageCitation object) {
				return createArgumentPackageCitationAdapter();
			}
			@Override
			public Adapter caseArgumentPackageBinding(ArgumentPackageBinding object) {
				return createArgumentPackageBindingAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
			@Override
			public Adapter caseArgumentPackageInterface(ArgumentPackageInterface object) {
				return createArgumentPackageInterfaceAdapter();
			}
			@Override
			public Adapter caseArgumentAsset(ArgumentAsset object) {
				return createArgumentAssetAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseArtefactElementCitation(ArtefactElementCitation object) {
				return createArtefactElementCitationAdapter();
			}
			@Override
			public Adapter caseSolution(Solution object) {
				return createSolutionAdapter();
			}
			@Override
			public Adapter caseArgumentAssetCitation(ArgumentAssetCitation object) {
				return createArgumentAssetCitationAdapter();
			}
			@Override
			public Adapter caseAwayGoal(AwayGoal object) {
				return createAwayGoalAdapter();
			}
			@Override
			public Adapter caseAwaySolution(AwaySolution object) {
				return createAwaySolutionAdapter();
			}
			@Override
			public Adapter caseAwayContext(AwayContext object) {
				return createAwayContextAdapter();
			}
			@Override
			public Adapter caseModuleReference(ModuleReference object) {
				return createModuleReferenceAdapter();
			}
			@Override
			public Adapter caseClaim(Claim object) {
				return createClaimAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseJustification(Justification object) {
				return createJustificationAdapter();
			}
			@Override
			public Adapter caseAssumption(Assumption object) {
				return createAssumptionAdapter();
			}
			@Override
			public Adapter caseArgumentReasoning(ArgumentReasoning object) {
				return createArgumentReasoningAdapter();
			}
			@Override
			public Adapter caseStrategy(Strategy object) {
				return createStrategyAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseAssertedRelationship(AssertedRelationship object) {
				return createAssertedRelationshipAdapter();
			}
			@Override
			public Adapter caseAssertedInference(AssertedInference object) {
				return createAssertedInferenceAdapter();
			}
			@Override
			public Adapter caseSupportedBy(SupportedBy object) {
				return createSupportedByAdapter();
			}
			@Override
			public Adapter caseAssertedEvidence(AssertedEvidence object) {
				return createAssertedEvidenceAdapter();
			}
			@Override
			public Adapter caseAssertedChallenge(AssertedChallenge object) {
				return createAssertedChallengeAdapter();
			}
			@Override
			public Adapter caseAssertedCounterEvidence(AssertedCounterEvidence object) {
				return createAssertedCounterEvidenceAdapter();
			}
			@Override
			public Adapter caseAssertedContext(AssertedContext object) {
				return createAssertedContextAdapter();
			}
			@Override
			public Adapter caseInContextOf(InContextOf object) {
				return createInContextOfAdapter();
			}
			@Override
			public Adapter caseSACMElement(SACMElement object) {
				return createSACMElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ArgumentationElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ArgumentationElement
	 * @generated
	 */
	public Adapter createArgumentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ArgumentPackage
	 * @generated
	 */
	public Adapter createArgumentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ArgumentPackageCitation <em>Argument Package Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ArgumentPackageCitation
	 * @generated
	 */
	public Adapter createArgumentPackageCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ArgumentPackageBinding <em>Argument Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ArgumentPackageBinding
	 * @generated
	 */
	public Adapter createArgumentPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ArgumentPackageInterface <em>Argument Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ArgumentPackageInterface
	 * @generated
	 */
	public Adapter createArgumentPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ArgumentAsset <em>Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ArgumentAsset
	 * @generated
	 */
	public Adapter createArgumentAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ArtefactElementCitation <em>Artefact Element Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ArtefactElementCitation
	 * @generated
	 */
	public Adapter createArtefactElementCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Solution
	 * @generated
	 */
	public Adapter createSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ArgumentAssetCitation <em>Argument Asset Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ArgumentAssetCitation
	 * @generated
	 */
	public Adapter createArgumentAssetCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.AwayGoal
	 * @generated
	 */
	public Adapter createAwayGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.AwaySolution
	 * @generated
	 */
	public Adapter createAwaySolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.AwayContext
	 * @generated
	 */
	public Adapter createAwayContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ModuleReference <em>Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ModuleReference
	 * @generated
	 */
	public Adapter createModuleReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Claim
	 * @generated
	 */
	public Adapter createClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Justification
	 * @generated
	 */
	public Adapter createJustificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Assumption
	 * @generated
	 */
	public Adapter createAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.ArgumentReasoning
	 * @generated
	 */
	public Adapter createArgumentReasoningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Strategy
	 * @generated
	 */
	public Adapter createStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.AssertedRelationship <em>Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.AssertedRelationship
	 * @generated
	 */
	public Adapter createAssertedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.AssertedInference
	 * @generated
	 */
	public Adapter createAssertedInferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.SupportedBy
	 * @generated
	 */
	public Adapter createSupportedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.AssertedEvidence <em>Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.AssertedEvidence
	 * @generated
	 */
	public Adapter createAssertedEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.AssertedChallenge <em>Asserted Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.AssertedChallenge
	 * @generated
	 */
	public Adapter createAssertedChallengeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.AssertedCounterEvidence <em>Asserted Counter Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.AssertedCounterEvidence
	 * @generated
	 */
	public Adapter createAssertedCounterEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.AssertedContext
	 * @generated
	 */
	public Adapter createAssertedContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Argumentation.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Argumentation.InContextOf
	 * @generated
	 */
	public Adapter createInContextOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Commons.SACMElement <em>SACM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Commons.SACMElement
	 * @generated
	 */
	public Adapter createSACMElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Commons.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Commons.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
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

} //ArgumentationAdapterFactory
