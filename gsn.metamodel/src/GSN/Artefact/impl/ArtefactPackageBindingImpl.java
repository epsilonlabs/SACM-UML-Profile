/**
 */
package GSN.Artefact.impl;

import GSN.Artefact.ArtefactPackage;
import GSN.Artefact.ArtefactPackageBinding;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.impl.ArtefactPackageBindingImpl#getParticipantpackage <em>Participantpackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtefactPackageBindingImpl extends ArtefactPackageImpl implements ArtefactPackageBinding {
	/**
	 * The cached value of the '{@link #getParticipantpackage() <em>Participantpackage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantpackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactPackage> participantpackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactPackageBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtefactPackage.Literals.ARTEFACT_PACKAGE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactPackage> getParticipantpackage() {
		if (participantpackage == null) {
			participantpackage = new EObjectResolvingEList<ArtefactPackage>(ArtefactPackage.class, this, ArtefactPackage.ARTEFACT_PACKAGE_BINDING__PARTICIPANTPACKAGE);
		}
		return participantpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT_PACKAGE_BINDING__PARTICIPANTPACKAGE:
				return getParticipantpackage();
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
			case ArtefactPackage.ARTEFACT_PACKAGE_BINDING__PARTICIPANTPACKAGE:
				getParticipantpackage().clear();
				getParticipantpackage().addAll((Collection<? extends ArtefactPackage>)newValue);
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
			case ArtefactPackage.ARTEFACT_PACKAGE_BINDING__PARTICIPANTPACKAGE:
				getParticipantpackage().clear();
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
			case ArtefactPackage.ARTEFACT_PACKAGE_BINDING__PARTICIPANTPACKAGE:
				return participantpackage != null && !participantpackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtefactPackageBindingImpl
