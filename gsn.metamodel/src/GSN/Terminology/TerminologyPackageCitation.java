/**
 */
package GSN.Terminology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Terminology.TerminologyPackageCitation#getCitedPackage <em>Cited Package</em>}</li>
 * </ul>
 *
 * @see GSN.Terminology.TerminologyPackage#getTerminologyPackageCitation()
 * @model abstract="true"
 * @generated
 */
public interface TerminologyPackageCitation extends TerminologyPackage {
	/**
	 * Returns the value of the '<em><b>Cited Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Package</em>' reference.
	 * @see #setCitedPackage(TerminologyPackage)
	 * @see GSN.Terminology.TerminologyPackage#getTerminologyPackageCitation_CitedPackage()
	 * @model
	 * @generated
	 */
	TerminologyPackage getCitedPackage();

	/**
	 * Sets the value of the '{@link GSN.Terminology.TerminologyPackageCitation#getCitedPackage <em>Cited Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Package</em>' reference.
	 * @see #getCitedPackage()
	 * @generated
	 */
	void setCitedPackage(TerminologyPackage value);

} // TerminologyPackageCitation
