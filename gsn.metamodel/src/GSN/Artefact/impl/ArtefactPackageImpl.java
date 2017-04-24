/**
 */
package GSN.Artefact.impl;

import GSN.Argumentation.ArgumentationPackage;

import GSN.Argumentation.impl.ArgumentationPackageImpl;

import GSN.Artefact.Activity;
import GSN.Artefact.ActivityRelationship;
import GSN.Artefact.Artefact;
import GSN.Artefact.ArtefactActivityRelationship;
import GSN.Artefact.ArtefactAsset;
import GSN.Artefact.ArtefactAssetCitation;
import GSN.Artefact.ArtefactAssetRelationship;
import GSN.Artefact.ArtefactElement;
import GSN.Artefact.ArtefactEvent;
import GSN.Artefact.ArtefactFactory;
import GSN.Artefact.ArtefactPackage;
import GSN.Artefact.ArtefactPackageBinding;
import GSN.Artefact.ArtefactPackageCitation;
import GSN.Artefact.ArtefactPackageInterface;
import GSN.Artefact.ArtefactProperty;
import GSN.Artefact.ArtefactRelationship;
import GSN.Artefact.ArtefactResourceRelationship;
import GSN.Artefact.ArtefactTechniqueRelationship;
import GSN.Artefact.Participant;
import GSN.Artefact.ParticipantRoleRelationship;
import GSN.Artefact.Resource;
import GSN.Artefact.Technique;

import GSN.Commons.CommonsPackage;

import GSN.Commons.impl.CommonsPackageImpl;

import GSN.Packages.PackagesPackage;

import GSN.Packages.impl.PackagesPackageImpl;

import GSN.Terminology.TerminologyPackage;

import GSN.Terminology.impl.TerminologyPackageImpl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.impl.ArtefactPackageImpl#getArtefactPackageCitation <em>Artefact Package Citation</em>}</li>
 *   <li>{@link GSN.Artefact.impl.ArtefactPackageImpl#getArtefactAsset <em>Artefact Asset</em>}</li>
 *   <li>{@link GSN.Artefact.impl.ArtefactPackageImpl#getArtefactPackage <em>Artefact Package</em>}</li>
 *   <li>{@link GSN.Artefact.impl.ArtefactPackageImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtefactPackageImpl extends ArtefactElementImpl implements ArtefactPackage {
	/**
	 * The cached value of the '{@link #getArtefactPackageCitation() <em>Artefact Package Citation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefactPackageCitation()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactPackageCitation> artefactPackageCitation;

	/**
	 * The cached value of the '{@link #getArtefactAsset() <em>Artefact Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefactAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactAsset> artefactAsset;

	/**
	 * The cached value of the '{@link #getArtefactPackage() <em>Artefact Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefactPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactPackage> artefactPackage;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactPackageInterface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtefactPackage.Literals.ARTEFACT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactPackage> getArtefactPackage() {
		if (artefactPackage == null) {
			artefactPackage = new EObjectContainmentEList<ArtefactPackage>(ArtefactPackage.class, this, ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE);
		}
		return artefactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactPackageInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<ArtefactPackageInterface>(ArtefactPackageInterface.class, this, ArtefactPackage.ARTEFACT_PACKAGE__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE_CITATION:
				return ((InternalEList<?>)getArtefactPackageCitation()).basicRemove(otherEnd, msgs);
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_ASSET:
				return ((InternalEList<?>)getArtefactAsset()).basicRemove(otherEnd, msgs);
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE:
				return ((InternalEList<?>)getArtefactPackage()).basicRemove(otherEnd, msgs);
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
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE_CITATION:
				return getArtefactPackageCitation();
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_ASSET:
				return getArtefactAsset();
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE:
				return getArtefactPackage();
			case ArtefactPackage.ARTEFACT_PACKAGE__INTERFACE:
				return getInterface();
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
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE_CITATION:
				getArtefactPackageCitation().clear();
				getArtefactPackageCitation().addAll((Collection<? extends ArtefactPackageCitation>)newValue);
				return;
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_ASSET:
				getArtefactAsset().clear();
				getArtefactAsset().addAll((Collection<? extends ArtefactAsset>)newValue);
				return;
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE:
				getArtefactPackage().clear();
				getArtefactPackage().addAll((Collection<? extends ArtefactPackage>)newValue);
				return;
			case ArtefactPackage.ARTEFACT_PACKAGE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends ArtefactPackageInterface>)newValue);
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
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE_CITATION:
				getArtefactPackageCitation().clear();
				return;
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_ASSET:
				getArtefactAsset().clear();
				return;
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE:
				getArtefactPackage().clear();
				return;
			case ArtefactPackage.ARTEFACT_PACKAGE__INTERFACE:
				getInterface().clear();
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
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE_CITATION:
				return artefactPackageCitation != null && !artefactPackageCitation.isEmpty();
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_ASSET:
				return artefactAsset != null && !artefactAsset.isEmpty();
			case ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE:
				return artefactPackage != null && !artefactPackage.isEmpty();
			case ArtefactPackage.ARTEFACT_PACKAGE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactPackageCitation> getArtefactPackageCitation() {
		if (artefactPackageCitation == null) {
			artefactPackageCitation = new EObjectContainmentEList<ArtefactPackageCitation>(ArtefactPackageCitation.class, this, ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_PACKAGE_CITATION);
		}
		return artefactPackageCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactAsset> getArtefactAsset() {
		if (artefactAsset == null) {
			artefactAsset = new EObjectContainmentEList<ArtefactAsset>(ArtefactAsset.class, this, ArtefactPackage.ARTEFACT_PACKAGE__ARTEFACT_ASSET);
		}
		return artefactAsset;
	}

} //ArtefactPackageImpl
