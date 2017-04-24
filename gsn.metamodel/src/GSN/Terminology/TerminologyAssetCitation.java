/**
 */
package GSN.Terminology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Terminology.TerminologyAssetCitation#getCitedElement <em>Cited Element</em>}</li>
 * </ul>
 *
 * @see GSN.Terminology.TerminologyPackage#getTerminologyAssetCitation()
 * @model abstract="true"
 * @generated
 */
public interface TerminologyAssetCitation extends ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Element</em>' reference.
	 * @see #setCitedElement(TerminologyAsset)
	 * @see GSN.Terminology.TerminologyPackage#getTerminologyAssetCitation_CitedElement()
	 * @model required="true"
	 * @generated
	 */
	TerminologyAsset getCitedElement();

	/**
	 * Sets the value of the '{@link GSN.Terminology.TerminologyAssetCitation#getCitedElement <em>Cited Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Element</em>' reference.
	 * @see #getCitedElement()
	 * @generated
	 */
	void setCitedElement(TerminologyAsset value);

} // TerminologyAssetCitation
