/**
 */
package GSN.Argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.AwayGoal#getAwayGoal <em>Away Goal</em>}</li>
 *   <li>{@link GSN.Argumentation.AwayGoal#getModuleIdentifier <em>Module Identifier</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getAwayGoal()
 * @model
 * @generated
 */
public interface AwayGoal extends ArgumentAssetCitation {
	/**
	 * Returns the value of the '<em><b>Away Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Away Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Goal</em>' reference.
	 * @see #setAwayGoal(Goal)
	 * @see GSN.Argumentation.ArgumentationPackage#getAwayGoal_AwayGoal()
	 * @model
	 * @generated
	 */
	Goal getAwayGoal();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.AwayGoal#getAwayGoal <em>Away Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Goal</em>' reference.
	 * @see #getAwayGoal()
	 * @generated
	 */
	void setAwayGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Identifier</em>' attribute.
	 * @see #setModuleIdentifier(String)
	 * @see GSN.Argumentation.ArgumentationPackage#getAwayGoal_ModuleIdentifier()
	 * @model
	 * @generated
	 */
	String getModuleIdentifier();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.AwayGoal#getModuleIdentifier <em>Module Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Identifier</em>' attribute.
	 * @see #getModuleIdentifier()
	 * @generated
	 */
	void setModuleIdentifier(String value);

} // AwayGoal
