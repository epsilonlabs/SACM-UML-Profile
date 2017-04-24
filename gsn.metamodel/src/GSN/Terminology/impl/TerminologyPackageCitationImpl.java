/**
 */
package GSN.Terminology.impl;

import GSN.Terminology.TerminologyPackage;
import GSN.Terminology.TerminologyPackageCitation;

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
 *   <li>{@link GSN.Terminology.impl.TerminologyPackageCitationImpl#getCitedPackage <em>Cited Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TerminologyPackageCitationImpl extends TerminologyPackageImpl implements TerminologyPackageCitation {
	/**
	 * The cached value of the '{@link #getCitedPackage() <em>Cited Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedPackage()
	 * @generated
	 * @ordered
	 */
	protected TerminologyPackage citedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyPackageCitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.TERMINOLOGY_PACKAGE_CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackage getCitedPackage() {
		if (citedPackage != null && citedPackage.eIsProxy()) {
			InternalEObject oldCitedPackage = (InternalEObject)citedPackage;
			citedPackage = (TerminologyPackage)eResolveProxy(oldCitedPackage);
			if (citedPackage != oldCitedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologyPackage.TERMINOLOGY_PACKAGE_CITATION__CITED_PACKAGE, oldCitedPackage, citedPackage));
			}
		}
		return citedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackage basicGetCitedPackage() {
		return citedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedPackage(TerminologyPackage newCitedPackage) {
		TerminologyPackage oldCitedPackage = citedPackage;
		citedPackage = newCitedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologyPackage.TERMINOLOGY_PACKAGE_CITATION__CITED_PACKAGE, oldCitedPackage, citedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerminologyPackage.TERMINOLOGY_PACKAGE_CITATION__CITED_PACKAGE:
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
			case TerminologyPackage.TERMINOLOGY_PACKAGE_CITATION__CITED_PACKAGE:
				setCitedPackage((TerminologyPackage)newValue);
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
			case TerminologyPackage.TERMINOLOGY_PACKAGE_CITATION__CITED_PACKAGE:
				setCitedPackage((TerminologyPackage)null);
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
			case TerminologyPackage.TERMINOLOGY_PACKAGE_CITATION__CITED_PACKAGE:
				return citedPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyPackageCitationImpl
