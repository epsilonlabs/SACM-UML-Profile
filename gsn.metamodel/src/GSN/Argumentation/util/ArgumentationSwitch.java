/**
 */
package GSN.Argumentation.util;

import GSN.Argumentation.*;

import GSN.Commons.ModelElement;
import GSN.Commons.SACMElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see GSN.Argumentation.ArgumentationPackage
 * @generated
 */
public class ArgumentationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArgumentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationSwitch() {
		if (modelPackage == null) {
			modelPackage = ArgumentationPackage.eINSTANCE;
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
			case ArgumentationPackage.ARGUMENTATION_ELEMENT: {
				ArgumentationElement argumentationElement = (ArgumentationElement)theEObject;
				T result = caseArgumentationElement(argumentationElement);
				if (result == null) result = caseModelElement(argumentationElement);
				if (result == null) result = caseSACMElement(argumentationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENT_PACKAGE: {
				ArgumentPackage argumentPackage = (ArgumentPackage)theEObject;
				T result = caseArgumentPackage(argumentPackage);
				if (result == null) result = caseArgumentationElement(argumentPackage);
				if (result == null) result = caseModelElement(argumentPackage);
				if (result == null) result = caseSACMElement(argumentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseArgumentPackage(module);
				if (result == null) result = caseArgumentationElement(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = caseSACMElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENT_PACKAGE_CITATION: {
				ArgumentPackageCitation argumentPackageCitation = (ArgumentPackageCitation)theEObject;
				T result = caseArgumentPackageCitation(argumentPackageCitation);
				if (result == null) result = caseArgumentPackage(argumentPackageCitation);
				if (result == null) result = caseArgumentationElement(argumentPackageCitation);
				if (result == null) result = caseModelElement(argumentPackageCitation);
				if (result == null) result = caseSACMElement(argumentPackageCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENT_PACKAGE_BINDING: {
				ArgumentPackageBinding argumentPackageBinding = (ArgumentPackageBinding)theEObject;
				T result = caseArgumentPackageBinding(argumentPackageBinding);
				if (result == null) result = caseArgumentPackage(argumentPackageBinding);
				if (result == null) result = caseArgumentationElement(argumentPackageBinding);
				if (result == null) result = caseModelElement(argumentPackageBinding);
				if (result == null) result = caseSACMElement(argumentPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseArgumentPackageBinding(contract);
				if (result == null) result = caseArgumentPackage(contract);
				if (result == null) result = caseArgumentationElement(contract);
				if (result == null) result = caseModelElement(contract);
				if (result == null) result = caseSACMElement(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENT_PACKAGE_INTERFACE: {
				ArgumentPackageInterface argumentPackageInterface = (ArgumentPackageInterface)theEObject;
				T result = caseArgumentPackageInterface(argumentPackageInterface);
				if (result == null) result = caseArgumentPackage(argumentPackageInterface);
				if (result == null) result = caseArgumentationElement(argumentPackageInterface);
				if (result == null) result = caseModelElement(argumentPackageInterface);
				if (result == null) result = caseSACMElement(argumentPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENT_ASSET: {
				ArgumentAsset argumentAsset = (ArgumentAsset)theEObject;
				T result = caseArgumentAsset(argumentAsset);
				if (result == null) result = caseArgumentationElement(argumentAsset);
				if (result == null) result = caseModelElement(argumentAsset);
				if (result == null) result = caseSACMElement(argumentAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseArgumentAsset(assertion);
				if (result == null) result = caseArgumentationElement(assertion);
				if (result == null) result = caseModelElement(assertion);
				if (result == null) result = caseSACMElement(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARTEFACT_ELEMENT_CITATION: {
				ArtefactElementCitation artefactElementCitation = (ArtefactElementCitation)theEObject;
				T result = caseArtefactElementCitation(artefactElementCitation);
				if (result == null) result = caseArgumentAsset(artefactElementCitation);
				if (result == null) result = caseArgumentationElement(artefactElementCitation);
				if (result == null) result = caseModelElement(artefactElementCitation);
				if (result == null) result = caseSACMElement(artefactElementCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.SOLUTION: {
				Solution solution = (Solution)theEObject;
				T result = caseSolution(solution);
				if (result == null) result = caseArtefactElementCitation(solution);
				if (result == null) result = caseArgumentAsset(solution);
				if (result == null) result = caseArgumentationElement(solution);
				if (result == null) result = caseModelElement(solution);
				if (result == null) result = caseSACMElement(solution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENT_ASSET_CITATION: {
				ArgumentAssetCitation argumentAssetCitation = (ArgumentAssetCitation)theEObject;
				T result = caseArgumentAssetCitation(argumentAssetCitation);
				if (result == null) result = caseArgumentAsset(argumentAssetCitation);
				if (result == null) result = caseArgumentationElement(argumentAssetCitation);
				if (result == null) result = caseModelElement(argumentAssetCitation);
				if (result == null) result = caseSACMElement(argumentAssetCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.AWAY_GOAL: {
				AwayGoal awayGoal = (AwayGoal)theEObject;
				T result = caseAwayGoal(awayGoal);
				if (result == null) result = caseArgumentAssetCitation(awayGoal);
				if (result == null) result = caseArgumentAsset(awayGoal);
				if (result == null) result = caseArgumentationElement(awayGoal);
				if (result == null) result = caseModelElement(awayGoal);
				if (result == null) result = caseSACMElement(awayGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.AWAY_SOLUTION: {
				AwaySolution awaySolution = (AwaySolution)theEObject;
				T result = caseAwaySolution(awaySolution);
				if (result == null) result = caseArgumentAssetCitation(awaySolution);
				if (result == null) result = caseArgumentAsset(awaySolution);
				if (result == null) result = caseArgumentationElement(awaySolution);
				if (result == null) result = caseModelElement(awaySolution);
				if (result == null) result = caseSACMElement(awaySolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.AWAY_CONTEXT: {
				AwayContext awayContext = (AwayContext)theEObject;
				T result = caseAwayContext(awayContext);
				if (result == null) result = caseArgumentAssetCitation(awayContext);
				if (result == null) result = caseArgumentAsset(awayContext);
				if (result == null) result = caseArgumentationElement(awayContext);
				if (result == null) result = caseModelElement(awayContext);
				if (result == null) result = caseSACMElement(awayContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.MODULE_REFERENCE: {
				ModuleReference moduleReference = (ModuleReference)theEObject;
				T result = caseModuleReference(moduleReference);
				if (result == null) result = caseArgumentPackageCitation(moduleReference);
				if (result == null) result = caseArgumentPackage(moduleReference);
				if (result == null) result = caseArgumentationElement(moduleReference);
				if (result == null) result = caseModelElement(moduleReference);
				if (result == null) result = caseSACMElement(moduleReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseAssertion(claim);
				if (result == null) result = caseArgumentAsset(claim);
				if (result == null) result = caseArgumentationElement(claim);
				if (result == null) result = caseModelElement(claim);
				if (result == null) result = caseSACMElement(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseClaim(goal);
				if (result == null) result = caseAssertion(goal);
				if (result == null) result = caseArgumentAsset(goal);
				if (result == null) result = caseArgumentationElement(goal);
				if (result == null) result = caseModelElement(goal);
				if (result == null) result = caseSACMElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.JUSTIFICATION: {
				Justification justification = (Justification)theEObject;
				T result = caseJustification(justification);
				if (result == null) result = caseClaim(justification);
				if (result == null) result = caseAssertion(justification);
				if (result == null) result = caseArgumentAsset(justification);
				if (result == null) result = caseArgumentationElement(justification);
				if (result == null) result = caseModelElement(justification);
				if (result == null) result = caseSACMElement(justification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSUMPTION: {
				Assumption assumption = (Assumption)theEObject;
				T result = caseAssumption(assumption);
				if (result == null) result = caseClaim(assumption);
				if (result == null) result = caseAssertion(assumption);
				if (result == null) result = caseArgumentAsset(assumption);
				if (result == null) result = caseArgumentationElement(assumption);
				if (result == null) result = caseModelElement(assumption);
				if (result == null) result = caseSACMElement(assumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENT_REASONING: {
				ArgumentReasoning argumentReasoning = (ArgumentReasoning)theEObject;
				T result = caseArgumentReasoning(argumentReasoning);
				if (result == null) result = caseArgumentAsset(argumentReasoning);
				if (result == null) result = caseArgumentationElement(argumentReasoning);
				if (result == null) result = caseModelElement(argumentReasoning);
				if (result == null) result = caseSACMElement(argumentReasoning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.STRATEGY: {
				Strategy strategy = (Strategy)theEObject;
				T result = caseStrategy(strategy);
				if (result == null) result = caseArgumentReasoning(strategy);
				if (result == null) result = caseArgumentAsset(strategy);
				if (result == null) result = caseArgumentationElement(strategy);
				if (result == null) result = caseModelElement(strategy);
				if (result == null) result = caseSACMElement(strategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseArgumentAsset(context);
				if (result == null) result = caseArgumentationElement(context);
				if (result == null) result = caseModelElement(context);
				if (result == null) result = caseSACMElement(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_RELATIONSHIP: {
				AssertedRelationship assertedRelationship = (AssertedRelationship)theEObject;
				T result = caseAssertedRelationship(assertedRelationship);
				if (result == null) result = caseAssertion(assertedRelationship);
				if (result == null) result = caseArgumentAsset(assertedRelationship);
				if (result == null) result = caseArgumentationElement(assertedRelationship);
				if (result == null) result = caseModelElement(assertedRelationship);
				if (result == null) result = caseSACMElement(assertedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_INFERENCE: {
				AssertedInference assertedInference = (AssertedInference)theEObject;
				T result = caseAssertedInference(assertedInference);
				if (result == null) result = caseAssertedRelationship(assertedInference);
				if (result == null) result = caseAssertion(assertedInference);
				if (result == null) result = caseArgumentAsset(assertedInference);
				if (result == null) result = caseArgumentationElement(assertedInference);
				if (result == null) result = caseModelElement(assertedInference);
				if (result == null) result = caseSACMElement(assertedInference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.SUPPORTED_BY: {
				SupportedBy supportedBy = (SupportedBy)theEObject;
				T result = caseSupportedBy(supportedBy);
				if (result == null) result = caseAssertedRelationship(supportedBy);
				if (result == null) result = caseAssertion(supportedBy);
				if (result == null) result = caseArgumentAsset(supportedBy);
				if (result == null) result = caseArgumentationElement(supportedBy);
				if (result == null) result = caseModelElement(supportedBy);
				if (result == null) result = caseSACMElement(supportedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_EVIDENCE: {
				AssertedEvidence assertedEvidence = (AssertedEvidence)theEObject;
				T result = caseAssertedEvidence(assertedEvidence);
				if (result == null) result = caseAssertedRelationship(assertedEvidence);
				if (result == null) result = caseAssertion(assertedEvidence);
				if (result == null) result = caseArgumentAsset(assertedEvidence);
				if (result == null) result = caseArgumentationElement(assertedEvidence);
				if (result == null) result = caseModelElement(assertedEvidence);
				if (result == null) result = caseSACMElement(assertedEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_CHALLENGE: {
				AssertedChallenge assertedChallenge = (AssertedChallenge)theEObject;
				T result = caseAssertedChallenge(assertedChallenge);
				if (result == null) result = caseAssertedRelationship(assertedChallenge);
				if (result == null) result = caseAssertion(assertedChallenge);
				if (result == null) result = caseArgumentAsset(assertedChallenge);
				if (result == null) result = caseArgumentationElement(assertedChallenge);
				if (result == null) result = caseModelElement(assertedChallenge);
				if (result == null) result = caseSACMElement(assertedChallenge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_COUNTER_EVIDENCE: {
				AssertedCounterEvidence assertedCounterEvidence = (AssertedCounterEvidence)theEObject;
				T result = caseAssertedCounterEvidence(assertedCounterEvidence);
				if (result == null) result = caseAssertedRelationship(assertedCounterEvidence);
				if (result == null) result = caseAssertion(assertedCounterEvidence);
				if (result == null) result = caseArgumentAsset(assertedCounterEvidence);
				if (result == null) result = caseArgumentationElement(assertedCounterEvidence);
				if (result == null) result = caseModelElement(assertedCounterEvidence);
				if (result == null) result = caseSACMElement(assertedCounterEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_CONTEXT: {
				AssertedContext assertedContext = (AssertedContext)theEObject;
				T result = caseAssertedContext(assertedContext);
				if (result == null) result = caseAssertedRelationship(assertedContext);
				if (result == null) result = caseAssertion(assertedContext);
				if (result == null) result = caseArgumentAsset(assertedContext);
				if (result == null) result = caseArgumentationElement(assertedContext);
				if (result == null) result = caseModelElement(assertedContext);
				if (result == null) result = caseSACMElement(assertedContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.IN_CONTEXT_OF: {
				InContextOf inContextOf = (InContextOf)theEObject;
				T result = caseInContextOf(inContextOf);
				if (result == null) result = caseAssertedContext(inContextOf);
				if (result == null) result = caseAssertedRelationship(inContextOf);
				if (result == null) result = caseAssertion(inContextOf);
				if (result == null) result = caseArgumentAsset(inContextOf);
				if (result == null) result = caseArgumentationElement(inContextOf);
				if (result == null) result = caseModelElement(inContextOf);
				if (result == null) result = caseSACMElement(inContextOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentationElement(ArgumentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackage(ArgumentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackageCitation(ArgumentPackageCitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackageBinding(ArgumentPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackageInterface(ArgumentPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentAsset(ArgumentAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artefact Element Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artefact Element Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactElementCitation(ArtefactElementCitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Asset Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Asset Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentAssetCitation(ArgumentAssetCitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayGoal(AwayGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwaySolution(AwaySolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayContext(AwayContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleReference(ModuleReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJustification(Justification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssumption(Assumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentReasoning(ArgumentReasoning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedRelationship(AssertedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedInference(AssertedInference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedBy(SupportedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedEvidence(AssertedEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedChallenge(AssertedChallenge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedCounterEvidence(AssertedCounterEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedContext(AssertedContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Context Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Context Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInContextOf(InContextOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACMElement(SACMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
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

} //ArgumentationSwitch
