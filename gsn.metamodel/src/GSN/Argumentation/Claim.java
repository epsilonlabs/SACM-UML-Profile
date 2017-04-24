/**
 */
package GSN.Argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.Claim#getAssumed <em>Assumed</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getClaim()
 * @model abstract="true"
 * @generated
 */
public interface Claim extends Assertion {
	/**
	 * Returns the value of the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumed</em>' attribute.
	 * @see #setAssumed(Boolean)
	 * @see GSN.Argumentation.ArgumentationPackage#getClaim_Assumed()
	 * @model
	 * @generated
	 */
	Boolean getAssumed();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.Claim#getAssumed <em>Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumed</em>' attribute.
	 * @see #getAssumed()
	 * @generated
	 */
	void setAssumed(Boolean value);

} // Claim
