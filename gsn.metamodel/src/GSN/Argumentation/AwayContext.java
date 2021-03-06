/**
 */
package GSN.Argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.AwayContext#getAwayContext <em>Away Context</em>}</li>
 *   <li>{@link GSN.Argumentation.AwayContext#getModuleIdentifier <em>Module Identifier</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getAwayContext()
 * @model
 * @generated
 */
public interface AwayContext extends ArgumentAssetCitation {
	/**
	 * Returns the value of the '<em><b>Away Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Away Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Context</em>' reference.
	 * @see #setAwayContext(Context)
	 * @see GSN.Argumentation.ArgumentationPackage#getAwayContext_AwayContext()
	 * @model
	 * @generated
	 */
	Context getAwayContext();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.AwayContext#getAwayContext <em>Away Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Context</em>' reference.
	 * @see #getAwayContext()
	 * @generated
	 */
	void setAwayContext(Context value);

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
	 * @see GSN.Argumentation.ArgumentationPackage#getAwayContext_ModuleIdentifier()
	 * @model
	 * @generated
	 */
	String getModuleIdentifier();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.AwayContext#getModuleIdentifier <em>Module Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Identifier</em>' attribute.
	 * @see #getModuleIdentifier()
	 * @generated
	 */
	void setModuleIdentifier(String value);

} // AwayContext
