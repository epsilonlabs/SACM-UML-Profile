/**
 */
package GSN.Argumentation.impl;

import GSN.Argumentation.ArgumentAsset;
import GSN.Argumentation.ArgumentationPackage;
import GSN.Argumentation.AssertedRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asserted Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.impl.AssertedRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.AssertedRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.AssertedRelationshipImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.AssertedRelationshipImpl#getMany <em>Many</em>}</li>
 *   <li>{@link GSN.Argumentation.impl.AssertedRelationshipImpl#getOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssertedRelationshipImpl extends AssertionImpl implements AssertedRelationship {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentAsset> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentAsset> target;

	/**
	 * The default value of the '{@link #getRequires() <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUIRES_EDEFAULT = new Integer(-1);

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected Integer requires = REQUIRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMany()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MANY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMany()
	 * @generated
	 * @ordered
	 */
	protected Boolean many = MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OPTIONAL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected Boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ASSERTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentAsset> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<ArgumentAsset>(ArgumentAsset.class, this, ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentAsset> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<ArgumentAsset>(ArgumentAsset.class, this, ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRequires() {
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequires(Integer newRequires) {
		Integer oldRequires = requires;
		requires = newRequires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ASSERTED_RELATIONSHIP__REQUIRES, oldRequires, requires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMany() {
		return many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany(Boolean newMany) {
		Boolean oldMany = many;
		many = newMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ASSERTED_RELATIONSHIP__MANY, oldMany, many));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(Boolean newOptional) {
		Boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.ASSERTED_RELATIONSHIP__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE:
				return getSource();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET:
				return getTarget();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__REQUIRES:
				return getRequires();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__MANY:
				return getMany();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__OPTIONAL:
				return getOptional();
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
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ArgumentAsset>)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ArgumentAsset>)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__REQUIRES:
				setRequires((Integer)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__MANY:
				setMany((Boolean)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__OPTIONAL:
				setOptional((Boolean)newValue);
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
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET:
				getTarget().clear();
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__REQUIRES:
				setRequires(REQUIRES_EDEFAULT);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__MANY:
				setMany(MANY_EDEFAULT);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
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
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__REQUIRES:
				return REQUIRES_EDEFAULT == null ? requires != null : !REQUIRES_EDEFAULT.equals(requires);
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__MANY:
				return MANY_EDEFAULT == null ? many != null : !MANY_EDEFAULT.equals(many);
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__OPTIONAL:
				return OPTIONAL_EDEFAULT == null ? optional != null : !OPTIONAL_EDEFAULT.equals(optional);
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
		result.append(" (requires: ");
		result.append(requires);
		result.append(", many: ");
		result.append(many);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //AssertedRelationshipImpl
