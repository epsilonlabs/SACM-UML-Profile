/**
 */
package GSN.Packages.impl;

import GSN.Packages.AssuranceCasePackage;
import GSN.Packages.AssuranceCasePackageCitation;
import GSN.Packages.PackagesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assurance Case Package Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Packages.impl.AssuranceCasePackageCitationImpl#getCitedPackage <em>Cited Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssuranceCasePackageCitationImpl extends AssuranceCasePackageImpl implements AssuranceCasePackageCitation {
	/**
	 * The cached value of the '{@link #getCitedPackage() <em>Cited Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedPackage()
	 * @generated
	 * @ordered
	 */
	protected AssuranceCasePackage citedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssuranceCasePackageCitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagesPackage.Literals.ASSURANCE_CASE_PACKAGE_CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCasePackage getCitedPackage() {
		if (citedPackage != null && citedPackage.eIsProxy()) {
			InternalEObject oldCitedPackage = (InternalEObject)citedPackage;
			citedPackage = (AssuranceCasePackage)eResolveProxy(oldCitedPackage);
			if (citedPackage != oldCitedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PackagesPackage.ASSURANCE_CASE_PACKAGE_CITATION__CITED_PACKAGE, oldCitedPackage, citedPackage));
			}
		}
		return citedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCasePackage basicGetCitedPackage() {
		return citedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedPackage(AssuranceCasePackage newCitedPackage) {
		AssuranceCasePackage oldCitedPackage = citedPackage;
		citedPackage = newCitedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagesPackage.ASSURANCE_CASE_PACKAGE_CITATION__CITED_PACKAGE, oldCitedPackage, citedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagesPackage.ASSURANCE_CASE_PACKAGE_CITATION__CITED_PACKAGE:
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
			case PackagesPackage.ASSURANCE_CASE_PACKAGE_CITATION__CITED_PACKAGE:
				setCitedPackage((AssuranceCasePackage)newValue);
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
			case PackagesPackage.ASSURANCE_CASE_PACKAGE_CITATION__CITED_PACKAGE:
				setCitedPackage((AssuranceCasePackage)null);
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
			case PackagesPackage.ASSURANCE_CASE_PACKAGE_CITATION__CITED_PACKAGE:
				return citedPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //AssuranceCasePackageCitationImpl
