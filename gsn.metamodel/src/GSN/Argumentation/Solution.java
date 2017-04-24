/**
 */
package GSN.Argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.Solution#getIsPublic <em>Is Public</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends ArtefactElementCitation {
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
	 * @see GSN.Argumentation.ArgumentationPackage#getSolution_IsPublic()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsPublic();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.Solution#getIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #getIsPublic()
	 * @generated
	 */
	void setIsPublic(Boolean value);

} // Solution
