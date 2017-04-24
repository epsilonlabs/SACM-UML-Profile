/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentationPackage;
import GSN.Argumentation.Context;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.ContextImpl#getIsPublic <em>Is Public</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.ContextImpl#getRefersToExternalMaterial <em>Refers To External Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends ArgumentAssetImpl implements Context {
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
	 * The default value of the '{@link #getRefersToExternalMaterial() <em>Refers To External Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersToExternalMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REFERS_TO_EXTERNAL_MATERIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefersToExternalMaterial() <em>Refers To External Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersToExternalMaterial()
	 * @generated
	 * @ordered
	 */
	protected Boolean refersToExternalMaterial = REFERS_TO_EXTERNAL_MATERIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.CONTEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.CONTEXT__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRefersToExternalMaterial() {
		return refersToExternalMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersToExternalMaterial(Boolean newRefersToExternalMaterial) {
		Boolean oldRefersToExternalMaterial = refersToExternalMaterial;
		refersToExternalMaterial = newRefersToExternalMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL, oldRefersToExternalMaterial, refersToExternalMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.CONTEXT__IS_PUBLIC:
				return getIsPublic();
			case ArgumentationPackage.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL:
				return getRefersToExternalMaterial();
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
			case ArgumentationPackage.CONTEXT__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case ArgumentationPackage.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL:
				setRefersToExternalMaterial((Boolean)newValue);
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
			case ArgumentationPackage.CONTEXT__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case ArgumentationPackage.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL:
				setRefersToExternalMaterial(REFERS_TO_EXTERNAL_MATERIAL_EDEFAULT);
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
			case ArgumentationPackage.CONTEXT__IS_PUBLIC:
				return IS_PUBLIC_EDEFAULT == null ? isPublic != null : !IS_PUBLIC_EDEFAULT.equals(isPublic);
			case ArgumentationPackage.CONTEXT__REFERS_TO_EXTERNAL_MATERIAL:
				return REFERS_TO_EXTERNAL_MATERIAL_EDEFAULT == null ? refersToExternalMaterial != null : !REFERS_TO_EXTERNAL_MATERIAL_EDEFAULT.equals(refersToExternalMaterial);
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
		result.append(", refersToExternalMaterial: ");
		result.append(refersToExternalMaterial);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
