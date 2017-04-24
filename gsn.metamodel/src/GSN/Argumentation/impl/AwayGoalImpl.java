/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentationPackage;
import GSN.Argumentation.AwayGoal;
import GSN.Argumentation.Goal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Away Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.AwayGoalImpl#getAwayGoal <em>Away Goal</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.AwayGoalImpl#getModuleIdentifier <em>Module Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwayGoalImpl extends ArgumentAssetCitationImpl implements AwayGoal {
	/**
	 * The cached value of the '{@link #getAwayGoal() <em>Away Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal awayGoal;

	/**
	 * The default value of the '{@link #getModuleIdentifier() <em>Module Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleIdentifier() <em>Module Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String moduleIdentifier = MODULE_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwayGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.AWAY_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getAwayGoal() {
		if (awayGoal != null && awayGoal.eIsProxy()) {
			InternalEObject oldAwayGoal = (InternalEObject)awayGoal;
			awayGoal = (Goal)eResolveProxy(oldAwayGoal);
			if (awayGoal != oldAwayGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentationPackage.AWAY_GOAL__AWAY_GOAL, oldAwayGoal, awayGoal));
			}
		}
		return awayGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetAwayGoal() {
		return awayGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayGoal(Goal newAwayGoal) {
		Goal oldAwayGoal = awayGoal;
		awayGoal = newAwayGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.AWAY_GOAL__AWAY_GOAL, oldAwayGoal, awayGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleIdentifier() {
		return moduleIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleIdentifier(String newModuleIdentifier) {
		String oldModuleIdentifier = moduleIdentifier;
		moduleIdentifier = newModuleIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.AWAY_GOAL__MODULE_IDENTIFIER, oldModuleIdentifier, moduleIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.AWAY_GOAL__AWAY_GOAL:
				if (resolve) return getAwayGoal();
				return basicGetAwayGoal();
			case ArgumentationPackage.AWAY_GOAL__MODULE_IDENTIFIER:
				return getModuleIdentifier();
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
			case ArgumentationPackage.AWAY_GOAL__AWAY_GOAL:
				setAwayGoal((Goal)newValue);
				return;
			case ArgumentationPackage.AWAY_GOAL__MODULE_IDENTIFIER:
				setModuleIdentifier((String)newValue);
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
			case ArgumentationPackage.AWAY_GOAL__AWAY_GOAL:
				setAwayGoal((Goal)null);
				return;
			case ArgumentationPackage.AWAY_GOAL__MODULE_IDENTIFIER:
				setModuleIdentifier(MODULE_IDENTIFIER_EDEFAULT);
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
			case ArgumentationPackage.AWAY_GOAL__AWAY_GOAL:
				return awayGoal != null;
			case ArgumentationPackage.AWAY_GOAL__MODULE_IDENTIFIER:
				return MODULE_IDENTIFIER_EDEFAULT == null ? moduleIdentifier != null : !MODULE_IDENTIFIER_EDEFAULT.equals(moduleIdentifier);
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
		result.append(" (moduleIdentifier: ");
		result.append(moduleIdentifier);
		result.append(')');
		return result.toString();
	}

} //AwayGoalImpl
