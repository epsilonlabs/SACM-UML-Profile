/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentationPackage;
import GSN.Argumentation.Goal;

import GSN.Terminology.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.GoalImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.GoalImpl#getIsPublic <em>Is Public</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.GoalImpl#getUndeveloped <em>Undeveloped</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.GoalImpl#getToBeSupportedByContract <em>To Be Supported By Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends ClaimImpl implements Goal {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected Role roles;

	/**
	 * The default value of the '{@link #getIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PUBLIC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPublic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getUndeveloped() <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndeveloped()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNDEVELOPED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUndeveloped() <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndeveloped()
	 * @generated
	 * @ordered
	 */
	protected Boolean undeveloped = UNDEVELOPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getToBeSupportedByContract() <em>To Be Supported By Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBeSupportedByContract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToBeSupportedByContract() <em>To Be Supported By Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBeSupportedByContract()
	 * @generated
	 * @ordered
	 */
	protected Boolean toBeSupportedByContract = TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoles(Role newRoles, NotificationChain msgs) {
		Role oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentationPackage.GOAL__ROLES, oldRoles, newRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(Role newRoles) {
		if (newRoles != roles) {
			NotificationChain msgs = null;
			if (roles != null)
				msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArgumentationPackage.GOAL__ROLES, null, msgs);
			if (newRoles != null)
				msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArgumentationPackage.GOAL__ROLES, null, msgs);
			msgs = basicSetRoles(newRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.GOAL__ROLES, newRoles, newRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublic(Boolean newIsPublic) {
		Boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.GOAL__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUndeveloped() {
		return undeveloped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndeveloped(Boolean newUndeveloped) {
		Boolean oldUndeveloped = undeveloped;
		undeveloped = newUndeveloped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.GOAL__UNDEVELOPED, oldUndeveloped, undeveloped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getToBeSupportedByContract() {
		return toBeSupportedByContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeSupportedByContract(Boolean newToBeSupportedByContract) {
		Boolean oldToBeSupportedByContract = toBeSupportedByContract;
		toBeSupportedByContract = newToBeSupportedByContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.GOAL__TO_BE_SUPPORTED_BY_CONTRACT, oldToBeSupportedByContract, toBeSupportedByContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArgumentationPackage.GOAL__ROLES:
				return basicSetRoles(null, msgs);
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
			case ArgumentationPackage.GOAL__ROLES:
				return getRoles();
			case ArgumentationPackage.GOAL__IS_PUBLIC:
				return getIsPublic();
			case ArgumentationPackage.GOAL__UNDEVELOPED:
				return getUndeveloped();
			case ArgumentationPackage.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				return getToBeSupportedByContract();
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
			case ArgumentationPackage.GOAL__ROLES:
				setRoles((Role)newValue);
				return;
			case ArgumentationPackage.GOAL__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case ArgumentationPackage.GOAL__UNDEVELOPED:
				setUndeveloped((Boolean)newValue);
				return;
			case ArgumentationPackage.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				setToBeSupportedByContract((Boolean)newValue);
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
			case ArgumentationPackage.GOAL__ROLES:
				setRoles((Role)null);
				return;
			case ArgumentationPackage.GOAL__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case ArgumentationPackage.GOAL__UNDEVELOPED:
				setUndeveloped(UNDEVELOPED_EDEFAULT);
				return;
			case ArgumentationPackage.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				setToBeSupportedByContract(TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT);
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
			case ArgumentationPackage.GOAL__ROLES:
				return roles != null;
			case ArgumentationPackage.GOAL__IS_PUBLIC:
				return IS_PUBLIC_EDEFAULT == null ? isPublic != null : !IS_PUBLIC_EDEFAULT.equals(isPublic);
			case ArgumentationPackage.GOAL__UNDEVELOPED:
				return UNDEVELOPED_EDEFAULT == null ? undeveloped != null : !UNDEVELOPED_EDEFAULT.equals(undeveloped);
			case ArgumentationPackage.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				return TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT == null ? toBeSupportedByContract != null : !TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT.equals(toBeSupportedByContract);
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
		result.append(" (isPublic: ");
		result.append(isPublic);
		result.append(", undeveloped: ");
		result.append(undeveloped);
		result.append(", toBeSupportedByContract: ");
		result.append(toBeSupportedByContract);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
