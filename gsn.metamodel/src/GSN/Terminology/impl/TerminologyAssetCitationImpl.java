/**
 */
package GSN.Terminology.impl;

import GSN.Terminology.TerminologyAsset;
import GSN.Terminology.TerminologyAssetCitation;
import GSN.Terminology.TerminologyPackage;

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
 *   <li>{@link GSN.Terminology.impl.TerminologyAssetCitationImpl#getCitedElement <em>Cited Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TerminologyAssetCitationImpl extends ExpressionElementImpl implements TerminologyAssetCitation {
	/**
	 * The cached value of the '{@link #getCitedElement() <em>Cited Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedElement()
	 * @generated
	 * @ordered
	 */
	protected TerminologyAsset citedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyAssetCitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.TERMINOLOGY_ASSET_CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyAsset getCitedElement() {
		if (citedElement != null && citedElement.eIsProxy()) {
			InternalEObject oldCitedElement = (InternalEObject)citedElement;
			citedElement = (TerminologyAsset)eResolveProxy(oldCitedElement);
			if (citedElement != oldCitedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.TERMINOLOGY_ASSET_CITATION__CITED_ELEMENT, oldCitedElement, citedElement));
			}
		}
		return citedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyAsset basicGetCitedElement() {
		return citedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedElement(TerminologyAsset newCitedElement) {
		TerminologyAsset oldCitedElement = citedElement;
		citedElement = newCitedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.TERMINOLOGY_ASSET_CITATION__CITED_ELEMENT, oldCitedElement, citedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerminologyPackage.TERMINOLOGY_ASSET_CITATION__CITED_ELEMENT:
				if (resolve) return getCitedElement();
				return basicGetCitedElement();
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
			case TerminologyPackage.TERMINOLOGY_ASSET_CITATION__CITED_ELEMENT:
				setCitedElement((TerminologyAsset)newValue);
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
			case TerminologyPackage.TERMINOLOGY_ASSET_CITATION__CITED_ELEMENT:
				setCitedElement((TerminologyAsset)null);
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
			case TerminologyPackage.TERMINOLOGY_ASSET_CITATION__CITED_ELEMENT:
				return citedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyAssetCitationImpl
