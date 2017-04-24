/**
 */
package GSN.Artefact.impl;

import GSN.Artefact.Artefact;
import GSN.Artefact.ArtefactEvent;
import GSN.Artefact.ArtefactPackage;
import GSN.Artefact.ArtefactProperty;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artefact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.impl.ArtefactImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link GSN.Artefact.impl.ArtefactImpl#getDate <em>Date</em>}</li>
 *   <li>{@link GSN.Artefact.impl.ArtefactImpl#getArtefactProperty <em>Artefact Property</em>}</li>
 *   <li>{@link GSN.Artefact.impl.ArtefactImpl#getArtefactEvent <em>Artefact Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtefactImpl extends ArtefactAssetImpl implements Artefact {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtefactProperty() <em>Artefact Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefactProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactProperty> artefactProperty;

	/**
	 * The cached value of the '{@link #getArtefactEvent() <em>Artefact Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtefactEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtefactEvent> artefactEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtefactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtefactPackage.Literals.ARTEFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtefactPackage.ARTEFACT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtefactPackage.ARTEFACT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactProperty> getArtefactProperty() {
		if (artefactProperty == null) {
			artefactProperty = new EObjectContainmentEList<ArtefactProperty>(ArtefactProperty.class, this, ArtefactPackage.ARTEFACT__ARTEFACT_PROPERTY);
		}
		return artefactProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtefactEvent> getArtefactEvent() {
		if (artefactEvent == null) {
			artefactEvent = new EObjectContainmentEList<ArtefactEvent>(ArtefactEvent.class, this, ArtefactPackage.ARTEFACT__ARTEFACT_EVENT);
		}
		return artefactEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArtefactPackage.ARTEFACT__ARTEFACT_PROPERTY:
				return ((InternalEList<?>)getArtefactProperty()).basicRemove(otherEnd, msgs);
			case ArtefactPackage.ARTEFACT__ARTEFACT_EVENT:
				return ((InternalEList<?>)getArtefactEvent()).basicRemove(otherEnd, msgs);
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
			case ArtefactPackage.ARTEFACT__VERSION:
				return getVersion();
			case ArtefactPackage.ARTEFACT__DATE:
				return getDate();
			case ArtefactPackage.ARTEFACT__ARTEFACT_PROPERTY:
				return getArtefactProperty();
			case ArtefactPackage.ARTEFACT__ARTEFACT_EVENT:
				return getArtefactEvent();
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
			case ArtefactPackage.ARTEFACT__VERSION:
				setVersion((String)newValue);
				return;
			case ArtefactPackage.ARTEFACT__DATE:
				setDate((Date)newValue);
				return;
			case ArtefactPackage.ARTEFACT__ARTEFACT_PROPERTY:
				getArtefactProperty().clear();
				getArtefactProperty().addAll((Collection<? extends ArtefactProperty>)newValue);
				return;
			case ArtefactPackage.ARTEFACT__ARTEFACT_EVENT:
				getArtefactEvent().clear();
				getArtefactEvent().addAll((Collection<? extends ArtefactEvent>)newValue);
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
			case ArtefactPackage.ARTEFACT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ArtefactPackage.ARTEFACT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ArtefactPackage.ARTEFACT__ARTEFACT_PROPERTY:
				getArtefactProperty().clear();
				return;
			case ArtefactPackage.ARTEFACT__ARTEFACT_EVENT:
				getArtefactEvent().clear();
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
			case ArtefactPackage.ARTEFACT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ArtefactPackage.ARTEFACT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ArtefactPackage.ARTEFACT__ARTEFACT_PROPERTY:
				return artefactProperty != null && !artefactProperty.isEmpty();
			case ArtefactPackage.ARTEFACT__ARTEFACT_EVENT:
				return artefactEvent != null && !artefactEvent.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //ArtefactImpl
