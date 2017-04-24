/**
 */
package GSN.Commons;

import GSN.Terminology.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utility Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Commons.UtilityElement#getSExpression <em>SExpression</em>}</li>
 *   <li>{@link GSN.Commons.UtilityElement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see GSN.Commons.CommonsPackage#getUtilityElement()
 * @model abstract="true"
 * @generated
 */
public interface UtilityElement extends SACMElement {
	/**
	 * Returns the value of the '<em><b>SExpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SExpression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SExpression</em>' attribute.
	 * @see #setSExpression(String)
	 * @see GSN.Commons.CommonsPackage#getUtilityElement_SExpression()
	 * @model
	 * @generated
	 */
	String getSExpression();

	/**
	 * Sets the value of the '{@link GSN.Commons.UtilityElement#getSExpression <em>SExpression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SExpression</em>' attribute.
	 * @see #getSExpression()
	 * @generated
	 */
	void setSExpression(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see GSN.Commons.CommonsPackage#getUtilityElement_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link GSN.Commons.UtilityElement#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // UtilityElement
