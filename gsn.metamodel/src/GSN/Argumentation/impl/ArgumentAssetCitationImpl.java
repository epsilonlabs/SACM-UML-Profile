/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentAsset;
import GSN.Argumentation.ArgumentAssetCitation;
import GSN.Argumentation.ArgumentationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Asset Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.ArgumentAssetCitationImpl#getCitedAsset <em>Cited Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArgumentAssetCitationImpl extends ArgumentAssetImpl implements ArgumentAssetCitation {
	/**
	 * The cached value of the '{@link #getCitedAsset() <em>Cited Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedAsset()
	 * @generated
	 * @ordered
	 */
	protected ArgumentAsset citedAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentAssetCitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ARGUMENT_ASSET_CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentAsset getCitedAsset() {
		if (citedAsset != null && citedAsset.eIsProxy()) {
			InternalEObject oldCitedAsset = (InternalEObject)citedAsset;
			citedAsset = (ArgumentAsset)eResolveProxy(oldCitedAsset);
			if (citedAsset != oldCitedAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentationPackage.ARGUMENT_ASSET_CITATION__CITED_ASSET, oldCitedAsset, citedAsset));
			}
		}
		return citedAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentAsset basicGetCitedAsset() {
		return citedAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedAsset(ArgumentAsset newCitedAsset) {
		ArgumentAsset oldCitedAsset = citedAsset;
		citedAsset = newCitedAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENT_ASSET_CITATION__CITED_ASSET, oldCitedAsset, citedAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ARGUMENT_ASSET_CITATION__CITED_ASSET:
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
			case ArgumentationPackage.ARGUMENT_ASSET_CITATION__CITED_ASSET:
				setCitedAsset((ArgumentAsset)newValue);
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
			case ArgumentationPackage.ARGUMENT_ASSET_CITATION__CITED_ASSET:
				setCitedAsset((ArgumentAsset)null);
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
			case ArgumentationPackage.ARGUMENT_ASSET_CITATION__CITED_ASSET:
				return citedAsset != null;
		}
		return super.eIsSet(featureID);
	}

} //ArgumentAssetCitationImpl
