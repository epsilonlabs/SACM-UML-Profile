/**
 */
package GSN.Argumentation;

import GSN.Terminology.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.Goal#getRoles <em>Roles</em>}</li>
 *   <li>{@link GSN.Argumentation.Goal#getIsPublic <em>Is Public</em>}</li>
 *   <li>{@link GSN.Argumentation.Goal#getUndeveloped <em>Undeveloped</em>}</li>
 *   <li>{@link GSN.Argumentation.Goal#getToBeSupportedByContract <em>To Be Supported By Contract</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Claim {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(Role)
	 * @see GSN.Argumentation.ArgumentationPackage#getGoal_Roles()
	 * @model containment="true"
	 * @generated
	 */
	Role getRoles();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.Goal#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(Role value);

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(Boolean)
	 * @see GSN.Argumentation.ArgumentationPackage#getGoal_IsPublic()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsPublic();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.Goal#getIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #getIsPublic()
	 * @generated
	 */
	void setIsPublic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undeveloped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undeveloped</em>' attribute.
	 * @see #setUndeveloped(Boolean)
	 * @see GSN.Argumentation.ArgumentationPackage#getGoal_Undeveloped()
	 * @model
	 * @generated
	 */
	Boolean getUndeveloped();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.Goal#getUndeveloped <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeveloped</em>' attribute.
	 * @see #getUndeveloped()
	 * @generated
	 */
	void setUndeveloped(Boolean value);

	/**
	 * Returns the value of the '<em><b>To Be Supported By Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Supported By Contract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Supported By Contract</em>' attribute.
	 * @see #setToBeSupportedByContract(Boolean)
	 * @see GSN.Argumentation.ArgumentationPackage#getGoal_ToBeSupportedByContract()
	 * @model
	 * @generated
	 */
	Boolean getToBeSupportedByContract();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.Goal#getToBeSupportedByContract <em>To Be Supported By Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Supported By Contract</em>' attribute.
	 * @see #getToBeSupportedByContract()
	 * @generated
	 */
	void setToBeSupportedByContract(Boolean value);

} // Goal
