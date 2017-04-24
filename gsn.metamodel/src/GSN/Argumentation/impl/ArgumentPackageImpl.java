/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentAsset;
import GSN.Argumentation.ArgumentPackage;
import GSN.Argumentation.ArgumentPackageCitation;
import GSN.Argumentation.ArgumentPackageInterface;
import GSN.Argumentation.ArgumentationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.ArgumentPackageImpl#getArgumentAsset <em>Argument Asset</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.ArgumentPackageImpl#getArgumentPackage <em>Argument Package</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.ArgumentPackageImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.ArgumentPackageImpl#getArgumentPackageCitation <em>Argument Package Citation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArgumentPackageImpl extends ArgumentationElementImpl implements ArgumentPackage {
	/**
	 * The cached value of the '{@link #getArgumentAsset() <em>Argument Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentAsset> argumentAsset;

	/**
	 * The cached value of the '{@link #getArgumentPackage() <em>Argument Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentPackage> argumentPackage;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentPackageInterface> interface_;

	/**
	 * The cached value of the '{@link #getArgumentPackageCitation() <em>Argument Package Citation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentPackageCitation()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentPackageCitation> argumentPackageCitation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ARGUMENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentAsset> getArgumentAsset() {
		if (argumentAsset == null) {
			argumentAsset = new EObjectContainmentEList<ArgumentAsset>(ArgumentAsset.class, this, ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_ASSET);
		}
		return argumentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentPackage> getArgumentPackage() {
		if (argumentPackage == null) {
			argumentPackage = new EObjectContainmentEList<ArgumentPackage>(ArgumentPackage.class, this, ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE);
		}
		return argumentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentPackageInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<ArgumentPackageInterface>(ArgumentPackageInterface.class, this, ArgumentationPackage.ARGUMENT_PACKAGE__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentPackageCitation> getArgumentPackageCitation() {
		if (argumentPackageCitation == null) {
			argumentPackageCitation = new EObjectContainmentEList<ArgumentPackageCitation>(ArgumentPackageCitation.class, this, ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION);
		}
		return argumentPackageCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_ASSET:
				return ((InternalEList<?>)getArgumentAsset()).basicRemove(otherEnd, msgs);
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE:
				return ((InternalEList<?>)getArgumentPackage()).basicRemove(otherEnd, msgs);
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION:
				return ((InternalEList<?>)getArgumentPackageCitation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_ASSET:
				return getArgumentAsset();
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE:
				return getArgumentPackage();
			case ArgumentationPackage.ARGUMENT_PACKAGE__INTERFACE:
				return getInterface();
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION:
				return getArgumentPackageCitation();
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
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_ASSET:
				getArgumentAsset().clear();
				getArgumentAsset().addAll((Collection<? extends ArgumentAsset>)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE:
				getArgumentPackage().clear();
				getArgumentPackage().addAll((Collection<? extends ArgumentPackage>)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_PACKAGE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends ArgumentPackageInterface>)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION:
				getArgumentPackageCitation().clear();
				getArgumentPackageCitation().addAll((Collection<? extends ArgumentPackageCitation>)newValue);
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
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_ASSET:
				getArgumentAsset().clear();
				return;
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE:
				getArgumentPackage().clear();
				return;
			case ArgumentationPackage.ARGUMENT_PACKAGE__INTERFACE:
				getInterface().clear();
				return;
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION:
				getArgumentPackageCitation().clear();
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
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_ASSET:
				return argumentAsset != null && !argumentAsset.isEmpty();
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE:
				return argumentPackage != null && !argumentPackage.isEmpty();
			case ArgumentationPackage.ARGUMENT_PACKAGE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case ArgumentationPackage.ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION:
				return argumentPackageCitation != null && !argumentPackageCitation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentPackageImpl
