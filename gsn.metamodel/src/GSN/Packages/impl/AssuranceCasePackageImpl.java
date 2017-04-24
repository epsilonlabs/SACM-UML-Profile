/**
 */
package GSN.Packages.impl;

import GSN.Argumentation.ArgumentPackage;

import GSN.Artefact.ArtefactPackage;

import GSN.Artefact.impl.ArtefactElementImpl;

import GSN.Packages.AssuranceCasePackage;
import GSN.Packages.AssuranceCasePackageCitation;
import GSN.Packages.AssuranceCasePackageInterface;
import GSN.Packages.PackagesPackage;

import GSN.Terminology.TerminologyPackage;

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
 * An implementation of the model object '<em><b>Assurance Case Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Packages.impl.AssuranceCasePackageImpl#getAssuranceCasePackageCitation <em>Assurance Case Package Citation</em>}</li>
 *   <li>{@link GSN.Packages.impl.AssuranceCasePackageImpl#getAssuranceCasePackage <em>Assurance Case Package</em>}</li>
 *   <li>{@link GSN.Packages.impl.AssuranceCasePackageImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link GSN.Packages.impl.AssuranceCasePackageImpl#getArgumentPackage <em>Argument Package</em>}</li>
 *   <li>{@link GSN.Packages.impl.AssuranceCasePackageImpl#getArtefactPackage <em>Artefact Package</em>}</li>
 *   <li>{@link GSN.Packages.impl.AssuranceCasePackageImpl#getTerminologyPackage <em>Terminology Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssuranceCasePackageImpl extends ArtefactElementImpl implements AssuranceCasePackage {
	/**
	 * The cached value of the '{@link #getAssuranceCasePackageCitation() <em>Assurance Case Package Citation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceCasePackageCitation()
	 * @generated
	 * @ordered
	 */
	protected EList<AssuranceCasePackageCitation> assuranceCasePackageCitation;

	/**
	 * The cached value of the '{@link #getAssuranceCasePackage() <em>Assurance Case Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceCasePackage()
	 * @generated
	 * @ordered
	 */
	protected EList<AssuranceCasePackage> assuranceCasePackage;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<AssuranceCasePackageInterface> interface_;

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
	 * The cached value of the '{@link #getArtefactPackage() <em>Artefact Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefactPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactPackage> artefactPackage;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssuranceCasePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagesPackage.Literals.ASSURANCE_CASE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssuranceCasePackageCitation> getAssuranceCasePackageCitation() {
		if (assuranceCasePackageCitation == null) {
			assuranceCasePackageCitation = new EObjectContainmentEList<AssuranceCasePackageCitation>(AssuranceCasePackageCitation.class, this, PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION);
		}
		return assuranceCasePackageCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssuranceCasePackage> getAssuranceCasePackage() {
		if (assuranceCasePackage == null) {
			assuranceCasePackage = new EObjectContainmentEList<AssuranceCasePackage>(AssuranceCasePackage.class, this, PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE);
		}
		return assuranceCasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssuranceCasePackageInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<AssuranceCasePackageInterface>(AssuranceCasePackageInterface.class, this, PackagesPackage.ASSURANCE_CASE_PACKAGE__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentPackage> getArgumentPackage() {
		if (argumentPackage == null) {
			argumentPackage = new EObjectContainmentEList<ArgumentPackage>(ArgumentPackage.class, this, PackagesPackage.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE);
		}
		return argumentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactPackage> getArtefactPackage() {
		if (artefactPackage == null) {
			artefactPackage = new EObjectContainmentEList<ArtefactPackage>(ArtefactPackage.class, this, PackagesPackage.ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE);
		}
		return artefactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyPackage> getTerminologyPackage() {
		if (terminologyPackage == null) {
			terminologyPackage = new EObjectContainmentEList<TerminologyPackage>(TerminologyPackage.class, this, PackagesPackage.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE);
		}
		return terminologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION:
				return ((InternalEList<?>)getAssuranceCasePackageCitation()).basicRemove(otherEnd, msgs);
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				return ((InternalEList<?>)getAssuranceCasePackage()).basicRemove(otherEnd, msgs);
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				return ((InternalEList<?>)getArgumentPackage()).basicRemove(otherEnd, msgs);
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE:
				return ((InternalEList<?>)getArtefactPackage()).basicRemove(otherEnd, msgs);
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				return ((InternalEList<?>)getTerminologyPackage()).basicRemove(otherEnd, msgs);
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
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION:
				return getAssuranceCasePackageCitation();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				return getAssuranceCasePackage();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__INTERFACE:
				return getInterface();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				return getArgumentPackage();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE:
				return getArtefactPackage();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				return getTerminologyPackage();
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
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION:
				getAssuranceCasePackageCitation().clear();
				getAssuranceCasePackageCitation().addAll((Collection<? extends AssuranceCasePackageCitation>)newValue);
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				getAssuranceCasePackage().clear();
				getAssuranceCasePackage().addAll((Collection<? extends AssuranceCasePackage>)newValue);
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends AssuranceCasePackageInterface>)newValue);
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				getArgumentPackage().clear();
				getArgumentPackage().addAll((Collection<? extends ArgumentPackage>)newValue);
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE:
				getArtefactPackage().clear();
				getArtefactPackage().addAll((Collection<? extends ArtefactPackage>)newValue);
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				getTerminologyPackage().clear();
				getTerminologyPackage().addAll((Collection<? extends TerminologyPackage>)newValue);
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
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION:
				getAssuranceCasePackageCitation().clear();
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				getAssuranceCasePackage().clear();
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__INTERFACE:
				getInterface().clear();
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				getArgumentPackage().clear();
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE:
				getArtefactPackage().clear();
				return;
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				getTerminologyPackage().clear();
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
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION:
				return assuranceCasePackageCitation != null && !assuranceCasePackageCitation.isEmpty();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
				return assuranceCasePackage != null && !assuranceCasePackage.isEmpty();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
				return argumentPackage != null && !argumentPackage.isEmpty();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE:
				return artefactPackage != null && !artefactPackage.isEmpty();
			case PackagesPackage.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
				return terminologyPackage != null && !terminologyPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssuranceCasePackageImpl
