/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentPackage;
import GSN.Argumentation.ArgumentPackageCitation;
import GSN.Argumentation.ArgumentationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Package Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.ArgumentPackageCitationImpl#getCitedPackage <em>Cited Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArgumentPackageCitationImpl extends ArgumentPackageImpl implements ArgumentPackageCitation {
	/**
	 * The cached value of the '{@link #getCitedPackage() <em>Cited Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedPackage()
	 * @generated
	 * @ordered
	 */
	protected ArgumentPackage citedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentPackageCitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ARGUMENT_PACKAGE_CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackage getCitedPackage() {
		if (citedPackage != null && citedPackage.eIsProxy()) {
			InternalEObject oldCitedPackage = (InternalEObject)citedPackage;
			citedPackage = (ArgumentPackage)eResolveProxy(oldCitedPackage);
			if (citedPackage != oldCitedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentationPackage.ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE, oldCitedPackage, citedPackage));
			}
		}
		return citedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackage basicGetCitedPackage() {
		return citedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedPackage(ArgumentPackage newCitedPackage) {
		ArgumentPackage oldCitedPackage = citedPackage;
		citedPackage = newCitedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE, oldCitedPackage, citedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE:
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
			case ArgumentationPackage.ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE:
				setCitedPackage((ArgumentPackage)newValue);
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
			case ArgumentationPackage.ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE:
				setCitedPackage((ArgumentPackage)null);
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
			case ArgumentationPackage.ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE:
				return citedPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //ArgumentPackageCitationImpl
