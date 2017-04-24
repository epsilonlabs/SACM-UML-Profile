/**
 */
package GSN.Artefact.util;

import GSN.Artefact.*;

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
 * @see GSN.Artefact.ArtefactPackage
 * @generated
 */
public class ArtefactAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArtefactPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArtefactPackage.eINSTANCE;
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
	protected ArtefactSwitch<Adapter> modelSwitch =
		new ArtefactSwitch<Adapter>() {
			@Override
			public Adapter caseArtefactElement(ArtefactElement object) {
				return createArtefactElementAdapter();
			}
			@Override
			public Adapter caseArtefactPackage(ArtefactPackage object) {
				return createArtefactPackageAdapter();
			}
			@Override
			public Adapter caseArtefactPackageCitation(ArtefactPackageCitation object) {
				return createArtefactPackageCitationAdapter();
			}
			@Override
			public Adapter caseArtefactPackageBinding(ArtefactPackageBinding object) {
				return createArtefactPackageBindingAdapter();
			}
			@Override
			public Adapter caseArtefactPackageInterface(ArtefactPackageInterface object) {
				return createArtefactPackageInterfaceAdapter();
			}
			@Override
			public Adapter caseArtefactAsset(ArtefactAsset object) {
				return createArtefactAssetAdapter();
			}
			@Override
			public Adapter caseArtefactAssetCitation(ArtefactAssetCitation object) {
				return createArtefactAssetCitationAdapter();
			}
			@Override
			public Adapter caseArtefact(Artefact object) {
				return createArtefactAdapter();
			}
			@Override
			public Adapter caseArtefactProperty(ArtefactProperty object) {
				return createArtefactPropertyAdapter();
			}
			@Override
			public Adapter caseArtefactEvent(ArtefactEvent object) {
				return createArtefactEventAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseTechnique(Technique object) {
				return createTechniqueAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseArtefactAssetRelationship(ArtefactAssetRelationship object) {
				return createArtefactAssetRelationshipAdapter();
			}
			@Override
			public Adapter caseArtefactRelationship(ArtefactRelationship object) {
				return createArtefactRelationshipAdapter();
			}
			@Override
			public Adapter caseActivityRelationship(ActivityRelationship object) {
				return createActivityRelationshipAdapter();
			}
			@Override
			public Adapter caseArtefactActivityRelationship(ArtefactActivityRelationship object) {
				return createArtefactActivityRelationshipAdapter();
			}
			@Override
			public Adapter caseArtefactTechniqueRelationship(ArtefactTechniqueRelationship object) {
				return createArtefactTechniqueRelationshipAdapter();
			}
			@Override
			public Adapter caseParticipantRoleRelationship(ParticipantRoleRelationship object) {
				return createParticipantRoleRelationshipAdapter();
			}
			@Override
			public Adapter caseArtefactResourceRelationship(ArtefactResourceRelationship object) {
				return createArtefactResourceRelationshipAdapter();
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
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactElement
	 * @generated
	 */
	public Adapter createArtefactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactPackage
	 * @generated
	 */
	public Adapter createArtefactPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactPackageCitation <em>Package Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactPackageCitation
	 * @generated
	 */
	public Adapter createArtefactPackageCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactPackageBinding <em>Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactPackageBinding
	 * @generated
	 */
	public Adapter createArtefactPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactPackageInterface <em>Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactPackageInterface
	 * @generated
	 */
	public Adapter createArtefactPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactAsset
	 * @generated
	 */
	public Adapter createArtefactAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactAssetCitation <em>Asset Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactAssetCitation
	 * @generated
	 */
	public Adapter createArtefactAssetCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.Artefact
	 * @generated
	 */
	public Adapter createArtefactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactProperty
	 * @generated
	 */
	public Adapter createArtefactPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactEvent
	 * @generated
	 */
	public Adapter createArtefactEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.Technique <em>Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.Technique
	 * @generated
	 */
	public Adapter createTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactAssetRelationship <em>Asset Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactAssetRelationship
	 * @generated
	 */
	public Adapter createArtefactAssetRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactRelationship
	 * @generated
	 */
	public Adapter createArtefactRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ActivityRelationship <em>Activity Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ActivityRelationship
	 * @generated
	 */
	public Adapter createActivityRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactActivityRelationship <em>Activity Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactActivityRelationship
	 * @generated
	 */
	public Adapter createArtefactActivityRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactTechniqueRelationship <em>Technique Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactTechniqueRelationship
	 * @generated
	 */
	public Adapter createArtefactTechniqueRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ParticipantRoleRelationship <em>Participant Role Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ParticipantRoleRelationship
	 * @generated
	 */
	public Adapter createParticipantRoleRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GSN.Artefact.ArtefactResourceRelationship <em>Resource Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GSN.Artefact.ArtefactResourceRelationship
	 * @generated
	 */
	public Adapter createArtefactResourceRelationshipAdapter() {
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

} //ArtefactAdapterFactory
