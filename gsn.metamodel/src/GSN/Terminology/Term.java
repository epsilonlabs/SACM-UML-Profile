/**
 */
package GSN.Terminology;

import GSN.Commons.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Terminology.Term#getValue <em>Value</em>}</li>
 *   <li>{@link GSN.Terminology.Term#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link GSN.Terminology.Term#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see GSN.Terminology.TerminologyPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see GSN.Terminology.TerminologyPackage#getTerm_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link GSN.Terminology.Term#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Reference</em>' attribute.
	 * @see #setExternalReference(String)
	 * @see GSN.Terminology.TerminologyPackage#getTerm_ExternalReference()
	 * @model
	 * @generated
	 */
	String getExternalReference();

	/**
	 * Sets the value of the '{@link GSN.Terminology.Term#getExternalReference <em>External Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Reference</em>' attribute.
	 * @see #getExternalReference()
	 * @generated
	 */
	void setExternalReference(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(ModelElement)
	 * @see GSN.Terminology.TerminologyPackage#getTerm_Origin()
	 * @model
	 * @generated
	 */
	ModelElement getOrigin();

	/**
	 * Sets the value of the '{@link GSN.Terminology.Term#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(ModelElement value);

} // Term
