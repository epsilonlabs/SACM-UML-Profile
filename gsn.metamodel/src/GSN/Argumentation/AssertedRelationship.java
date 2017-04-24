/**
 */
package GSN.Argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asserted Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.AssertedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link GSN.Argumentation.AssertedRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link GSN.Argumentation.AssertedRelationship#getRequires <em>Requires</em>}</li>
 *   <li>{@link GSN.Argumentation.AssertedRelationship#getMany <em>Many</em>}</li>
 *   <li>{@link GSN.Argumentation.AssertedRelationship#getOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getAssertedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface AssertedRelationship extends Assertion {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link GSN.Argumentation.ArgumentAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see GSN.Argumentation.ArgumentationPackage#getAssertedRelationship_Source()
	 * @model
	 * @generated
	 */
	EList<ArgumentAsset> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link GSN.Argumentation.ArgumentAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see GSN.Argumentation.ArgumentationPackage#getAssertedRelationship_Target()
	 * @model
	 * @generated
	 */
	EList<ArgumentAsset> getTarget();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' attribute.
	 * @see #setRequires(Integer)
	 * @see GSN.Argumentation.ArgumentationPackage#getAssertedRelationship_Requires()
	 * @model default="-1"
	 * @generated
	 */
	Integer getRequires();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.AssertedRelationship#getRequires <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' attribute.
	 * @see #getRequires()
	 * @generated
	 */
	void setRequires(Integer value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(Boolean)
	 * @see GSN.Argumentation.ArgumentationPackage#getAssertedRelationship_Many()
	 * @model default="false"
	 * @generated
	 */
	Boolean getMany();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.AssertedRelationship#getMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #getMany()
	 * @generated
	 */
	void setMany(Boolean value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(Boolean)
	 * @see GSN.Argumentation.ArgumentationPackage#getAssertedRelationship_Optional()
	 * @model default="false"
	 * @generated
	 */
	Boolean getOptional();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.AssertedRelationship#getOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(Boolean value);

} // AssertedRelationship
