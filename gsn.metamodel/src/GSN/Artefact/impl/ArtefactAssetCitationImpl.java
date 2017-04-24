/**
 */
package GSN.Artefact.impl;

import GSN.Artefact.ArtefactAsset;
import GSN.Artefact.ArtefactAssetCitation;
import GSN.Artefact.ArtefactPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.impl.ArtefactAssetCitationImpl#getCitedAsset <em>Cited Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtefactAssetCitationImpl extends ArtefactAssetImpl implements ArtefactAssetCitation {
	/**
	 * The cached value of the '{@link #getCitedAsset() <em>Cited Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedAsset()
	 * @generated
	 * @ordered
	 */
	protected ArtefactAsset citedAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactAssetCitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtefactPackage.Literals.ARTEFACT_ASSET_CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactAsset getCitedAsset() {
		if (citedAsset != null && citedAsset.eIsProxy()) {
			InternalEObject oldCitedAsset = (InternalEObject)citedAsset;
			citedAsset = (ArtefactAsset)eResolveProxy(oldCitedAsset);
			if (citedAsset != oldCitedAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtefactPackage.ARTEFACT_ASSET_CITATION__CITED_ASSET, oldCitedAsset, citedAsset));
			}
		}
		return citedAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactAsset basicGetCitedAsset() {
		return citedAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedAsset(ArtefactAsset newCitedAsset) {
		ArtefactAsset oldCitedAsset = citedAsset;
		citedAsset = newCitedAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtefactPackage.ARTEFACT_ASSET_CITATION__CITED_ASSET, oldCitedAsset, citedAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT_ASSET_CITATION__CITED_ASSET:
				if (resolve) return getCitedAsset();
				return basicGetCitedAsset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT_ASSET_CITATION__CITED_ASSET:
				setCitedAsset((ArtefactAsset)newValue);
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
			case ArtefactPackage.ARTEFACT_ASSET_CITATION__CITED_ASSET:
				setCitedAsset((ArtefactAsset)null);
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
			case ArtefactPackage.ARTEFACT_ASSET_CITATION__CITED_ASSET:
				return citedAsset != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtefactAssetCitationImpl
