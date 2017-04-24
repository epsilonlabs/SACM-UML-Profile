/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentationPackage;
import GSN.Argumentation.AwayContext;
import GSN.Argumentation.Context;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Away Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.AwayContextImpl#getAwayContext <em>Away Context</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.AwayContextImpl#getModuleIdentifier <em>Module Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwayContextImpl extends ArgumentAssetCitationImpl implements AwayContext {
	/**
	 * The cached value of the '{@link #getAwayContext() <em>Away Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayContext()
	 * @generated
	 * @ordered
	 */
	protected Context awayContext;

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
	protected AwayContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.AWAY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getAwayContext() {
		if (awayContext != null && awayContext.eIsProxy()) {
			InternalEObject oldAwayContext = (InternalEObject)awayContext;
			awayContext = (Context)eResolveProxy(oldAwayContext);
			if (awayContext != oldAwayContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentationPackage.AWAY_CONTEXT__AWAY_CONTEXT, oldAwayContext, awayContext));
			}
		}
		return awayContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetAwayContext() {
		return awayContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayContext(Context newAwayContext) {
		Context oldAwayContext = awayContext;
		awayContext = newAwayContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.AWAY_CONTEXT__AWAY_CONTEXT, oldAwayContext, awayContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.AWAY_CONTEXT__MODULE_IDENTIFIER, oldModuleIdentifier, moduleIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.AWAY_CONTEXT__AWAY_CONTEXT:
				if (resolve) return getAwayContext();
				return basicGetAwayContext();
			case ArgumentationPackage.AWAY_CONTEXT__MODULE_IDENTIFIER:
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
			case ArgumentationPackage.AWAY_CONTEXT__AWAY_CONTEXT:
				setAwayContext((Context)newValue);
				return;
			case ArgumentationPackage.AWAY_CONTEXT__MODULE_IDENTIFIER:
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
			case ArgumentationPackage.AWAY_CONTEXT__AWAY_CONTEXT:
				setAwayContext((Context)null);
				return;
			case ArgumentationPackage.AWAY_CONTEXT__MODULE_IDENTIFIER:
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
			case ArgumentationPackage.AWAY_CONTEXT__AWAY_CONTEXT:
				return awayContext != null;
			case ArgumentationPackage.AWAY_CONTEXT__MODULE_IDENTIFIER:
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

} //AwayContextImpl
