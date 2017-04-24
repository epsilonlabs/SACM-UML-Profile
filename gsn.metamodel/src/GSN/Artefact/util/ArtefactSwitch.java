/**
 */
package GSN.Artefact.util;

import GSN.Artefact.*;

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
 * @see GSN.Artefact.ArtefactPackage
 * @generated
 */
public class ArtefactSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArtefactPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactSwitch() {
		if (modelPackage == null) {
			modelPackage = ArtefactPackage.eINSTANCE;
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
			case ArtefactPackage.ARTEFACT_ELEMENT: {
				ArtefactElement artefactElement = (ArtefactElement)theEObject;
				T result = caseArtefactElement(artefactElement);
				if (result == null) result = caseModelElement(artefactElement);
				if (result == null) result = caseSACMElement(artefactElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_PACKAGE: {
				ArtefactPackage artefactPackage = (ArtefactPackage)theEObject;
				T result = caseArtefactPackage(artefactPackage);
				if (result == null) result = caseArtefactElement(artefactPackage);
				if (result == null) result = caseModelElement(artefactPackage);
				if (result == null) result = caseSACMElement(artefactPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_PACKAGE_CITATION: {
				ArtefactPackageCitation artefactPackageCitation = (ArtefactPackageCitation)theEObject;
				T result = caseArtefactPackageCitation(artefactPackageCitation);
				if (result == null) result = caseArtefactPackage(artefactPackageCitation);
				if (result == null) result = caseArtefactElement(artefactPackageCitation);
				if (result == null) result = caseModelElement(artefactPackageCitation);
				if (result == null) result = caseSACMElement(artefactPackageCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_PACKAGE_BINDING: {
				ArtefactPackageBinding artefactPackageBinding = (ArtefactPackageBinding)theEObject;
				T result = caseArtefactPackageBinding(artefactPackageBinding);
				if (result == null) result = caseArtefactPackage(artefactPackageBinding);
				if (result == null) result = caseArtefactElement(artefactPackageBinding);
				if (result == null) result = caseModelElement(artefactPackageBinding);
				if (result == null) result = caseSACMElement(artefactPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_PACKAGE_INTERFACE: {
				ArtefactPackageInterface artefactPackageInterface = (ArtefactPackageInterface)theEObject;
				T result = caseArtefactPackageInterface(artefactPackageInterface);
				if (result == null) result = caseArtefactPackage(artefactPackageInterface);
				if (result == null) result = caseArtefactElement(artefactPackageInterface);
				if (result == null) result = caseModelElement(artefactPackageInterface);
				if (result == null) result = caseSACMElement(artefactPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_ASSET: {
				ArtefactAsset artefactAsset = (ArtefactAsset)theEObject;
				T result = caseArtefactAsset(artefactAsset);
				if (result == null) result = caseArtefactElement(artefactAsset);
				if (result == null) result = caseModelElement(artefactAsset);
				if (result == null) result = caseSACMElement(artefactAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_ASSET_CITATION: {
				ArtefactAssetCitation artefactAssetCitation = (ArtefactAssetCitation)theEObject;
				T result = caseArtefactAssetCitation(artefactAssetCitation);
				if (result == null) result = caseArtefactAsset(artefactAssetCitation);
				if (result == null) result = caseArtefactElement(artefactAssetCitation);
				if (result == null) result = caseModelElement(artefactAssetCitation);
				if (result == null) result = caseSACMElement(artefactAssetCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT: {
				Artefact artefact = (Artefact)theEObject;
				T result = caseArtefact(artefact);
				if (result == null) result = caseArtefactAsset(artefact);
				if (result == null) result = caseArtefactElement(artefact);
				if (result == null) result = caseModelElement(artefact);
				if (result == null) result = caseSACMElement(artefact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_PROPERTY: {
				ArtefactProperty artefactProperty = (ArtefactProperty)theEObject;
				T result = caseArtefactProperty(artefactProperty);
				if (result == null) result = caseArtefactAsset(artefactProperty);
				if (result == null) result = caseArtefactElement(artefactProperty);
				if (result == null) result = caseModelElement(artefactProperty);
				if (result == null) result = caseSACMElement(artefactProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_EVENT: {
				ArtefactEvent artefactEvent = (ArtefactEvent)theEObject;
				T result = caseArtefactEvent(artefactEvent);
				if (result == null) result = caseArtefactAsset(artefactEvent);
				if (result == null) result = caseArtefactElement(artefactEvent);
				if (result == null) result = caseModelElement(artefactEvent);
				if (result == null) result = caseSACMElement(artefactEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseArtefactAsset(resource);
				if (result == null) result = caseArtefactElement(resource);
				if (result == null) result = caseModelElement(resource);
				if (result == null) result = caseSACMElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseArtefactAsset(activity);
				if (result == null) result = caseArtefactElement(activity);
				if (result == null) result = caseModelElement(activity);
				if (result == null) result = caseSACMElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.TECHNIQUE: {
				Technique technique = (Technique)theEObject;
				T result = caseTechnique(technique);
				if (result == null) result = caseArtefactAsset(technique);
				if (result == null) result = caseArtefactElement(technique);
				if (result == null) result = caseModelElement(technique);
				if (result == null) result = caseSACMElement(technique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = caseArtefactAsset(participant);
				if (result == null) result = caseArtefactElement(participant);
				if (result == null) result = caseModelElement(participant);
				if (result == null) result = caseSACMElement(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP: {
				ArtefactAssetRelationship artefactAssetRelationship = (ArtefactAssetRelationship)theEObject;
				T result = caseArtefactAssetRelationship(artefactAssetRelationship);
				if (result == null) result = caseArtefactAsset(artefactAssetRelationship);
				if (result == null) result = caseArtefactElement(artefactAssetRelationship);
				if (result == null) result = caseModelElement(artefactAssetRelationship);
				if (result == null) result = caseSACMElement(artefactAssetRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_RELATIONSHIP: {
				ArtefactRelationship artefactRelationship = (ArtefactRelationship)theEObject;
				T result = caseArtefactRelationship(artefactRelationship);
				if (result == null) result = caseArtefactAssetRelationship(artefactRelationship);
				if (result == null) result = caseArtefactAsset(artefactRelationship);
				if (result == null) result = caseArtefactElement(artefactRelationship);
				if (result == null) result = caseModelElement(artefactRelationship);
				if (result == null) result = caseSACMElement(artefactRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ACTIVITY_RELATIONSHIP: {
				ActivityRelationship activityRelationship = (ActivityRelationship)theEObject;
				T result = caseActivityRelationship(activityRelationship);
				if (result == null) result = caseArtefactAssetRelationship(activityRelationship);
				if (result == null) result = caseArtefactAsset(activityRelationship);
				if (result == null) result = caseArtefactElement(activityRelationship);
				if (result == null) result = caseModelElement(activityRelationship);
				if (result == null) result = caseSACMElement(activityRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_ACTIVITY_RELATIONSHIP: {
				ArtefactActivityRelationship artefactActivityRelationship = (ArtefactActivityRelationship)theEObject;
				T result = caseArtefactActivityRelationship(artefactActivityRelationship);
				if (result == null) result = caseArtefactAssetRelationship(artefactActivityRelationship);
				if (result == null) result = caseArtefactAsset(artefactActivityRelationship);
				if (result == null) result = caseArtefactElement(artefactActivityRelationship);
				if (result == null) result = caseModelElement(artefactActivityRelationship);
				if (result == null) result = caseSACMElement(artefactActivityRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_TECHNIQUE_RELATIONSHIP: {
				ArtefactTechniqueRelationship artefactTechniqueRelationship = (ArtefactTechniqueRelationship)theEObject;
				T result = caseArtefactTechniqueRelationship(artefactTechniqueRelationship);
				if (result == null) result = caseArtefactAssetRelationship(artefactTechniqueRelationship);
				if (result == null) result = caseArtefactAsset(artefactTechniqueRelationship);
				if (result == null) result = caseArtefactElement(artefactTechniqueRelationship);
				if (result == null) result = caseModelElement(artefactTechniqueRelationship);
				if (result == null) result = caseSACMElement(artefactTechniqueRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.PARTICIPANT_ROLE_RELATIONSHIP: {
				ParticipantRoleRelationship participantRoleRelationship = (ParticipantRoleRelationship)theEObject;
				T result = caseParticipantRoleRelationship(participantRoleRelationship);
				if (result == null) result = caseArtefactAssetRelationship(participantRoleRelationship);
				if (result == null) result = caseArtefactAsset(participantRoleRelationship);
				if (result == null) result = caseArtefactElement(participantRoleRelationship);
				if (result == null) result = caseModelElement(participantRoleRelationship);
				if (result == null) result = caseSACMElement(participantRoleRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtefactPackage.ARTEFACT_RESOURCE_RELATIONSHIP: {
				ArtefactResourceRelationship artefactResourceRelationship = (ArtefactResourceRelationship)theEObject;
				T result = caseArtefactResourceRelationship(artefactResourceRelationship);
				if (result == null) result = caseArtefactAssetRelationship(artefactResourceRelationship);
				if (result == null) result = caseArtefactAsset(artefactResourceRelationship);
				if (result == null) result = caseArtefactElement(artefactResourceRelationship);
				if (result == null) result = caseModelElement(artefactResourceRelationship);
				if (result == null) result = caseSACMElement(artefactResourceRelationship);
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
	public T caseArtefactElement(ArtefactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactPackage(ArtefactPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactPackageCitation(ArtefactPackageCitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactPackageBinding(ArtefactPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactPackageInterface(ArtefactPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactAsset(ArtefactAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactAssetCitation(ArtefactAssetCitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artefact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artefact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefact(Artefact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactProperty(ArtefactProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactEvent(ArtefactEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnique(Technique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactAssetRelationship(ArtefactAssetRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactRelationship(ArtefactRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityRelationship(ActivityRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactActivityRelationship(ArtefactActivityRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technique Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technique Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactTechniqueRelationship(ArtefactTechniqueRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Role Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Role Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRoleRelationship(ParticipantRoleRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtefactResourceRelationship(ArtefactResourceRelationship object) {
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

} //ArtefactSwitch
