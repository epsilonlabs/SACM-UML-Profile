/**
 */
package GSN.Argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.AwaySolution#getAwaySolution <em>Away Solution</em>}</li>
 *   <li>{@link GSN.Argumentation.AwaySolution#getModuleIdentifier <em>Module Identifier</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getAwaySolution()
 * @model
 * @generated
 */
public interface AwaySolution extends ArgumentAssetCitation {
	/**
	 * Returns the value of the '<em><b>Away Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Away Solution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Solution</em>' reference.
	 * @see #setAwaySolution(Solution)
	 * @see GSN.Argumentation.ArgumentationPackage#getAwaySolution_AwaySolution()
	 * @model
	 * @generated
	 */
	Solution getAwaySolution();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.AwaySolution#getAwaySolution <em>Away Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Solution</em>' reference.
	 * @see #getAwaySolution()
	 * @generated
	 */
	void setAwaySolution(Solution value);

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
	 * @see GSN.Argumentation.ArgumentationPackage#getAwaySolution_ModuleIdentifier()
	 * @model
	 * @generated
	 */
	String getModuleIdentifier();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.AwaySolution#getModuleIdentifier <em>Module Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Identifier</em>' attribute.
	 * @see #getModuleIdentifier()
	 * @generated
	 */
	void setModuleIdentifier(String value);

} // AwaySolution
