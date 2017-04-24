/**
 */
package GSN.Artefact.impl;

import GSN.Artefact.ArtefactAsset;
import GSN.Artefact.ArtefactAssetRelationship;
import GSN.Artefact.ArtefactPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.impl.ArtefactAssetRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link GSN.Artefact.impl.ArtefactAssetRelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtefactAssetRelationshipImpl extends ArtefactAssetImpl implements ArtefactAssetRelationship {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactAsset> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactAsset> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactAssetRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtefactPackage.Literals.ARTEFACT_ASSET_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactAsset> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<ArtefactAsset>(ArtefactAsset.class, this, ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactAsset> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<ArtefactAsset>(ArtefactAsset.class, this, ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__SOURCE:
				return getSource();
			case ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__TARGET:
				return getTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ArtefactAsset>)newValue);
				return;
			case ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ArtefactAsset>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__SOURCE:
				getSource().clear();
				return;
			case ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__TARGET:
				getTarget().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
			case ArtefactPackage.ARTEFACT_ASSET_RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtefactAssetRelationshipImpl
