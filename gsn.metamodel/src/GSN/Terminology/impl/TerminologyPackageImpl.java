/**
 */
package GSN.Terminology.impl;

import GSN.Argumentation.ArgumentationPackage;

import GSN.Argumentation.impl.ArgumentationPackageImpl;

import GSN.Artefact.ArtefactPackage;

import GSN.Artefact.impl.ArtefactPackageImpl;

import GSN.Commons.CommonsPackage;

import GSN.Commons.impl.CommonsPackageImpl;

import GSN.Packages.PackagesPackage;

import GSN.Packages.impl.PackagesPackageImpl;

import GSN.Terminology.Category;
import GSN.Terminology.Expression;
import GSN.Terminology.ExpressionElement;
import GSN.Terminology.Role;
import GSN.Terminology.Term;
import GSN.Terminology.TerminologyAsset;
import GSN.Terminology.TerminologyAssetCitation;
import GSN.Terminology.TerminologyElement;
import GSN.Terminology.TerminologyFactory;
import GSN.Terminology.TerminologyPackage;
import GSN.Terminology.TerminologyPackageCitation;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Terminology.impl.TerminologyPackageImpl#getTerminologyAsset <em>Terminology Asset</em>}</li>
 *   <li>{@link GSN.Terminology.impl.TerminologyPackageImpl#getTerminologyPackage <em>Terminology Package</em>}</li>
 *   <li>{@link GSN.Terminology.impl.TerminologyPackageImpl#getTerminologyPackageCitation <em>Terminology Package Citation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TerminologyPackageImpl extends TerminologyElementImpl implements TerminologyPackage {
	/**
	 * The cached value of the '{@link #getTerminologyAsset() <em>Terminology Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyAsset> terminologyAsset;

	/**
	 * The cached value of the '{@link #getTerminologyPackage() <em>Terminology Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyPackage> terminologyPackage;

	/**
	 * The cached value of the '{@link #getTerminologyPackageCitation() <em>Terminology Package Citation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyPackageCitation()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyPackageCitation> terminologyPackageCitation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.TERMINOLOGY_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyPackage> getTerminologyPackage() {
		if (terminologyPackage == null) {
			terminologyPackage = new EObjectContainmentEList<TerminologyPackage>(TerminologyPackage.class, this, TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE);
		}
		return terminologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyPackageCitation> getTerminologyPackageCitation() {
		if (terminologyPackageCitation == null) {
			terminologyPackageCitation = new EObjectContainmentEList<TerminologyPackageCitation>(TerminologyPackageCitation.class, this, TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE_CITATION);
		}
		return terminologyPackageCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_ASSET:
				return ((InternalEList<?>)getTerminologyAsset()).basicRemove(otherEnd, msgs);
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE:
				return ((InternalEList<?>)getTerminologyPackage()).basicRemove(otherEnd, msgs);
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE_CITATION:
				return ((InternalEList<?>)getTerminologyPackageCitation()).basicRemove(otherEnd, msgs);
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
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_ASSET:
				return getTerminologyAsset();
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE:
				return getTerminologyPackage();
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE_CITATION:
				return getTerminologyPackageCitation();
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
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_ASSET:
				getTerminologyAsset().clear();
				getTerminologyAsset().addAll((Collection<? extends TerminologyAsset>)newValue);
				return;
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE:
				getTerminologyPackage().clear();
				getTerminologyPackage().addAll((Collection<? extends TerminologyPackage>)newValue);
				return;
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE_CITATION:
				getTerminologyPackageCitation().clear();
				getTerminologyPackageCitation().addAll((Collection<? extends TerminologyPackageCitation>)newValue);
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
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_ASSET:
				getTerminologyAsset().clear();
				return;
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE:
				getTerminologyPackage().clear();
				return;
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE_CITATION:
				getTerminologyPackageCitation().clear();
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
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_ASSET:
				return terminologyAsset != null && !terminologyAsset.isEmpty();
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE:
				return terminologyPackage != null && !terminologyPackage.isEmpty();
			case TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_PACKAGE_CITATION:
				return terminologyPackageCitation != null && !terminologyPackageCitation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyAsset> getTerminologyAsset() {
		if (terminologyAsset == null) {
			terminologyAsset = new EObjectContainmentEList<TerminologyAsset>(TerminologyAsset.class, this, TerminologyPackage.TERMINOLOGY_PACKAGE__TERMINOLOGY_ASSET);
		}
		return terminologyAsset;
	}

} //TerminologyPackageImpl
