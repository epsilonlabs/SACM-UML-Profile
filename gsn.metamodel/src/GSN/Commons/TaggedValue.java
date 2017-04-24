/**
 */
package GSN.Commons;

import GSN.Terminology.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Commons.TaggedValue#getSKey <em>SKey</em>}</li>
 *   <li>{@link GSN.Commons.TaggedValue#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see GSN.Commons.CommonsPackage#getTaggedValue()
 * @model abstract="true"
 * @generated
 */
public interface TaggedValue extends UtilityElement {
	/**
	 * Returns the value of the '<em><b>SKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SKey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SKey</em>' attribute.
	 * @see #setSKey(String)
	 * @see GSN.Commons.CommonsPackage#getTaggedValue_SKey()
	 * @model
	 * @generated
	 */
	String getSKey();

	/**
	 * Sets the value of the '{@link GSN.Commons.TaggedValue#getSKey <em>SKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SKey</em>' attribute.
	 * @see #getSKey()
	 * @generated
	 */
	void setSKey(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Expression)
	 * @see GSN.Commons.CommonsPackage#getTaggedValue_Key()
	 * @model containment="true"
	 * @generated
	 */
	Expression getKey();

	/**
	 * Sets the value of the '{@link GSN.Commons.TaggedValue#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Expression value);

} // TaggedValue
