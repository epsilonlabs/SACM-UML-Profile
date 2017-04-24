/**
 */
package GSN.Commons;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Commons.ModelElement#getGid <em>Gid</em>}</li>
 *   <li>{@link GSN.Commons.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link GSN.Commons.ModelElement#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link GSN.Commons.ModelElement#getDescription <em>Description</em>}</li>
 *   <li>{@link GSN.Commons.ModelElement#getInplementationConstraint <em>Inplementation Constraint</em>}</li>
 *   <li>{@link GSN.Commons.ModelElement#getUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @see GSN.Commons.CommonsPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends SACMElement {
	/**
	 * Returns the value of the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gid</em>' attribute.
	 * @see #setGid(String)
	 * @see GSN.Commons.CommonsPackage#getModelElement_Gid()
	 * @model
	 * @generated
	 */
	String getGid();

	/**
	 * Sets the value of the '{@link GSN.Commons.ModelElement#getGid <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gid</em>' attribute.
	 * @see #getGid()
	 * @generated
	 */
	void setGid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GSN.Commons.CommonsPackage#getModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GSN.Commons.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see GSN.Commons.CommonsPackage#getModelElement_IsAbstract()
	 * @model
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link GSN.Commons.ModelElement#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see GSN.Commons.CommonsPackage#getModelElement_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link GSN.Commons.ModelElement#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Commons.ImplementationConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inplementation Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inplementation Constraint</em>' containment reference list.
	 * @see GSN.Commons.CommonsPackage#getModelElement_InplementationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationConstraint> getInplementationConstraint();

	/**
	 * Returns the value of the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uninstantiated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uninstantiated</em>' attribute.
	 * @see #setUninstantiated(Boolean)
	 * @see GSN.Commons.CommonsPackage#getModelElement_Uninstantiated()
	 * @model
	 * @generated
	 */
	Boolean getUninstantiated();

	/**
	 * Sets the value of the '{@link GSN.Commons.ModelElement#getUninstantiated <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uninstantiated</em>' attribute.
	 * @see #getUninstantiated()
	 * @generated
	 */
	void setUninstantiated(Boolean value);

} // ModelElement
