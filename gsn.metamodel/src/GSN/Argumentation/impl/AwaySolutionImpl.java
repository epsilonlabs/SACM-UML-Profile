/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentationPackage;
import GSN.Argumentation.AwaySolution;
import GSN.Argumentation.Solution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Away Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.AwaySolutionImpl#getAwaySolution <em>Away Solution</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.AwaySolutionImpl#getModuleIdentifier <em>Module Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwaySolutionImpl extends ArgumentAssetCitationImpl implements AwaySolution {
	/**
	 * The cached value of the '{@link #getAwaySolution() <em>Away Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwaySolution()
	 * @generated
	 * @ordered
	 */
	protected Solution awaySolution;

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
	protected AwaySolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.AWAY_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getAwaySolution() {
		if (awaySolution != null && awaySolution.eIsProxy()) {
			InternalEObject oldAwaySolution = (InternalEObject)awaySolution;
			awaySolution = (Solution)eResolveProxy(oldAwaySolution);
			if (awaySolution != oldAwaySolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentationPackage.AWAY_SOLUTION__AWAY_SOLUTION, oldAwaySolution, awaySolution));
			}
		}
		return awaySolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetAwaySolution() {
		return awaySolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwaySolution(Solution newAwaySolution) {
		Solution oldAwaySolution = awaySolution;
		awaySolution = newAwaySolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.AWAY_SOLUTION__AWAY_SOLUTION, oldAwaySolution, awaySolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.AWAY_SOLUTION__MODULE_IDENTIFIER, oldModuleIdentifier, moduleIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.AWAY_SOLUTION__AWAY_SOLUTION:
				if (resolve) return getAwaySolution();
				return basicGetAwaySolution();
			case ArgumentationPackage.AWAY_SOLUTION__MODULE_IDENTIFIER:
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
			case ArgumentationPackage.AWAY_SOLUTION__AWAY_SOLUTION:
				setAwaySolution((Solution)newValue);
				return;
			case ArgumentationPackage.AWAY_SOLUTION__MODULE_IDENTIFIER:
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
			case ArgumentationPackage.AWAY_SOLUTION__AWAY_SOLUTION:
				setAwaySolution((Solution)null);
				return;
			case ArgumentationPackage.AWAY_SOLUTION__MODULE_IDENTIFIER:
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
			case ArgumentationPackage.AWAY_SOLUTION__AWAY_SOLUTION:
				return awaySolution != null;
			case ArgumentationPackage.AWAY_SOLUTION__MODULE_IDENTIFIER:
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

} //AwaySolutionImpl
