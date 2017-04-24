/**
 */
package GSN.Argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.Strategy#getUndeveloped <em>Undeveloped</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends ArgumentReasoning {
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
	 * @see GSN.Argumentation.ArgumentationPackage#getStrategy_Undeveloped()
	 * @model
	 * @generated
	 */
	Boolean getUndeveloped();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.Strategy#getUndeveloped <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeveloped</em>' attribute.
	 * @see #getUndeveloped()
	 * @generated
	 */
	void setUndeveloped(Boolean value);

} // Strategy
