/**
 */
package GSN.Packages;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Case Package Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Packages.AssuranceCasePackageCitation#getCitedPackage <em>Cited Package</em>}</li>
 * </ul>
 *
 * @see GSN.Packages.PackagesPackage#getAssuranceCasePackageCitation()
 * @model abstract="true"
 * @generated
 */
public interface AssuranceCasePackageCitation extends AssuranceCasePackage {
	/**
	 * Returns the value of the '<em><b>Cited Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Package</em>' reference.
	 * @see #setCitedPackage(AssuranceCasePackage)
	 * @see GSN.Packages.PackagesPackage#getAssuranceCasePackageCitation_CitedPackage()
	 * @model required="true"
	 * @generated
	 */
	AssuranceCasePackage getCitedPackage();

	/**
	 * Sets the value of the '{@link GSN.Packages.AssuranceCasePackageCitation#getCitedPackage <em>Cited Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Package</em>' reference.
	 * @see #getCitedPackage()
	 * @generated
	 */
	void setCitedPackage(AssuranceCasePackage value);

} // AssuranceCasePackageCitation
