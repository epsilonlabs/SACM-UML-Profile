/**
 */
package GSN.Artefact.impl;

import GSN.Artefact.ArtefactPackage;
import GSN.Artefact.ArtefactPackageCitation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.impl.ArtefactPackageCitationImpl#getCitedPackage <em>Cited Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtefactPackageCitationImpl extends ArtefactPackageImpl implements ArtefactPackageCitation {
	/**
	 * The cached value of the '{@link #getCitedPackage() <em>Cited Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedPackage()
	 * @generated
	 * @ordered
	 */
	protected ArtefactPackage citedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactPackageCitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtefactPackage.Literals.ARTEFACT_PACKAGE_CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactPackage getCitedPackage() {
		if (citedPackage != null && citedPackage.eIsProxy()) {
			InternalEObject oldCitedPackage = (InternalEObject)citedPackage;
			citedPackage = (ArtefactPackage)eResolveProxy(oldCitedPackage);
			if (citedPackage != oldCitedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArtefactPackage.ARTEFACT_PACKAGE_CITATION__CITED_PACKAGE, oldCitedPackage, citedPackage));
			}
		}
		return citedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactPackage basicGetCitedPackage() {
		return citedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedPackage(ArtefactPackage newCitedPackage) {
		ArtefactPackage oldCitedPackage = citedPackage;
		citedPackage = newCitedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtefactPackage.ARTEFACT_PACKAGE_CITATION__CITED_PACKAGE, oldCitedPackage, citedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT_PACKAGE_CITATION__CITED_PACKAGE:
				if (resolve) return getCitedPackage();
				return basicGetCitedPackage();
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
			case ArtefactPackage.ARTEFACT_PACKAGE_CITATION__CITED_PACKAGE:
				setCitedPackage((ArtefactPackage)newValue);
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
			case ArtefactPackage.ARTEFACT_PACKAGE_CITATION__CITED_PACKAGE:
				setCitedPackage((ArtefactPackage)null);
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
			case ArtefactPackage.ARTEFACT_PACKAGE_CITATION__CITED_PACKAGE:
				return citedPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtefactPackageCitationImpl
