/**
 */
package GSN.Argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Package Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.ArgumentPackageCitation#getCitedPackage <em>Cited Package</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getArgumentPackageCitation()
 * @model abstract="true"
 * @generated
 */
public interface ArgumentPackageCitation extends ArgumentPackage {
	/**
	 * Returns the value of the '<em><b>Cited Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Package</em>' reference.
	 * @see #setCitedPackage(ArgumentPackage)
	 * @see GSN.Argumentation.ArgumentationPackage#getArgumentPackageCitation_CitedPackage()
	 * @model required="true"
	 * @generated
	 */
	ArgumentPackage getCitedPackage();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.ArgumentPackageCitation#getCitedPackage <em>Cited Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Package</em>' reference.
	 * @see #getCitedPackage()
	 * @generated
	 */
	void setCitedPackage(ArgumentPackage value);

} // ArgumentPackageCitation
