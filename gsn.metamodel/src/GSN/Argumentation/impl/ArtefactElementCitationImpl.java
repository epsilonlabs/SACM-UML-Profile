/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentationPackage;
import GSN.Argumentation.ArtefactElementCitation;

import GSN.Artefact.ArtefactElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artefact Element Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.ArtefactElementCitationImpl#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.ArtefactElementCitationImpl#getCitedArtefact <em>Cited Artefact</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtefactElementCitationImpl extends ArgumentAssetImpl implements ArtefactElementCitation {
	/**
	 * The default value of the '{@link #getExternalReference() <em>External Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected String externalReference = EXTERNAL_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCitedArtefact() <em>Cited Artefact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedArtefact()
	 * @generated
	 * @ordered
	 */
	protected ArtefactElement citedArtefact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactElementCitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ARTEFACT_ELEMENT_CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalReference() {
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalReference(String newExternalReference) {
		String oldExternalReference = externalReference;
		externalReference = newExternalReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__EXTERNAL_REFERENCE, oldExternalReference, externalReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactElement getCitedArtefact() {
		if (citedArtefact != null && citedArtefact.eIsProxy()) {
			InternalEObject oldCitedArtefact = (InternalEObject)citedArtefact;
			citedArtefact = (ArtefactElement)eResolveProxy(oldCitedArtefact);
			if (citedArtefact != oldCitedArtefact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT, oldCitedArtefact, citedArtefact));
			}
		}
		return citedArtefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtefactElement basicGetCitedArtefact() {
		return citedArtefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedArtefact(ArtefactElement newCitedArtefact) {
		ArtefactElement oldCitedArtefact = citedArtefact;
		citedArtefact = newCitedArtefact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT, oldCitedArtefact, citedArtefact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__EXTERNAL_REFERENCE:
				return getExternalReference();
			case ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT:
				if (resolve) return getCitedArtefact();
				return basicGetCitedArtefact();
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
			case ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__EXTERNAL_REFERENCE:
				setExternalReference((String)newValue);
				return;
			case ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT:
				setCitedArtefact((ArtefactElement)newValue);
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
			case ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__EXTERNAL_REFERENCE:
				setExternalReference(EXTERNAL_REFERENCE_EDEFAULT);
				return;
			case ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT:
				setCitedArtefact((ArtefactElement)null);
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
			case ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__EXTERNAL_REFERENCE:
				return EXTERNAL_REFERENCE_EDEFAULT == null ? externalReference != null : !EXTERNAL_REFERENCE_EDEFAULT.equals(externalReference);
			case ArgumentationPackage.ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT:
				return citedArtefact != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (externalReference: ");
		result.append(externalReference);
		result.append(')');
		return result.toString();
	}

} //ArtefactElementCitationImpl
