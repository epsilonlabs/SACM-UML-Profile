/**
 */
package GSN.Commons.impl;

import GSN.Commons.CommonsPackage;
import GSN.Commons.Description;
import GSN.Commons.ImplementationConstraint;
import GSN.Commons.ModelElement;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Commons.impl.ModelElementImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link GSN.Commons.impl.ModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link GSN.Commons.impl.ModelElementImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link GSN.Commons.impl.ModelElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link GSN.Commons.impl.ModelElementImpl#getInplementationConstraint <em>Inplementation Constraint</em>}</li>
 *   <li>{@link GSN.Commons.impl.ModelElementImpl#getUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends SACMElementImpl implements ModelElement {
	/**
	 * The default value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected static final String GID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected String gid = GID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getInplementationConstraint() <em>Inplementation Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInplementationConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationConstraint> inplementationConstraint;

	/**
	 * The default value of the '{@link #getUninstantiated() <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUninstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNINSTANTIATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUninstantiated() <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUninstantiated()
	 * @generated
	 * @ordered
	 */
	protected Boolean uninstantiated = UNINSTANTIATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonsPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGid() {
		return gid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGid(String newGid) {
		String oldGid = gid;
		gid = newGid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.MODEL_ELEMENT__GID, oldGid, gid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.MODEL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.MODEL_ELEMENT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonsPackage.MODEL_ELEMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonsPackage.MODEL_ELEMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonsPackage.MODEL_ELEMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.MODEL_ELEMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationConstraint> getInplementationConstraint() {
		if (inplementationConstraint == null) {
			inplementationConstraint = new EObjectContainmentEList<ImplementationConstraint>(ImplementationConstraint.class, this, CommonsPackage.MODEL_ELEMENT__INPLEMENTATION_CONSTRAINT);
		}
		return inplementationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUninstantiated() {
		return uninstantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUninstantiated(Boolean newUninstantiated) {
		Boolean oldUninstantiated = uninstantiated;
		uninstantiated = newUninstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.MODEL_ELEMENT__UNINSTANTIATED, oldUninstantiated, uninstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonsPackage.MODEL_ELEMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case CommonsPackage.MODEL_ELEMENT__INPLEMENTATION_CONSTRAINT:
				return ((InternalEList<?>)getInplementationConstraint()).basicRemove(otherEnd, msgs);
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
			case CommonsPackage.MODEL_ELEMENT__GID:
				return getGid();
			case CommonsPackage.MODEL_ELEMENT__NAME:
				return getName();
			case CommonsPackage.MODEL_ELEMENT__IS_ABSTRACT:
				return getIsAbstract();
			case CommonsPackage.MODEL_ELEMENT__DESCRIPTION:
				return getDescription();
			case CommonsPackage.MODEL_ELEMENT__INPLEMENTATION_CONSTRAINT:
				return getInplementationConstraint();
			case CommonsPackage.MODEL_ELEMENT__UNINSTANTIATED:
				return getUninstantiated();
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
			case CommonsPackage.MODEL_ELEMENT__GID:
				setGid((String)newValue);
				return;
			case CommonsPackage.MODEL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CommonsPackage.MODEL_ELEMENT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case CommonsPackage.MODEL_ELEMENT__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case CommonsPackage.MODEL_ELEMENT__INPLEMENTATION_CONSTRAINT:
				getInplementationConstraint().clear();
				getInplementationConstraint().addAll((Collection<? extends ImplementationConstraint>)newValue);
				return;
			case CommonsPackage.MODEL_ELEMENT__UNINSTANTIATED:
				setUninstantiated((Boolean)newValue);
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
			case CommonsPackage.MODEL_ELEMENT__GID:
				setGid(GID_EDEFAULT);
				return;
			case CommonsPackage.MODEL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonsPackage.MODEL_ELEMENT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case CommonsPackage.MODEL_ELEMENT__DESCRIPTION:
				setDescription((Description)null);
				return;
			case CommonsPackage.MODEL_ELEMENT__INPLEMENTATION_CONSTRAINT:
				getInplementationConstraint().clear();
				return;
			case CommonsPackage.MODEL_ELEMENT__UNINSTANTIATED:
				setUninstantiated(UNINSTANTIATED_EDEFAULT);
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
			case CommonsPackage.MODEL_ELEMENT__GID:
				return GID_EDEFAULT == null ? gid != null : !GID_EDEFAULT.equals(gid);
			case CommonsPackage.MODEL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonsPackage.MODEL_ELEMENT__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case CommonsPackage.MODEL_ELEMENT__DESCRIPTION:
				return description != null;
			case CommonsPackage.MODEL_ELEMENT__INPLEMENTATION_CONSTRAINT:
				return inplementationConstraint != null && !inplementationConstraint.isEmpty();
			case CommonsPackage.MODEL_ELEMENT__UNINSTANTIATED:
				return UNINSTANTIATED_EDEFAULT == null ? uninstantiated != null : !UNINSTANTIATED_EDEFAULT.equals(uninstantiated);
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
		result.append(" (gid: ");
		result.append(gid);
		result.append(", name: ");
		result.append(name);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", uninstantiated: ");
		result.append(uninstantiated);
		result.append(')');
		return result.toString();
	}

} //ModelElementImpl
