/**
 */
package GSN.Argumentation;

import GSN.Artefact.ArtefactElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefact Element Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.ArtefactElementCitation#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link GSN.Argumentation.ArtefactElementCitation#getCitedArtefact <em>Cited Artefact</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getArtefactElementCitation()
 * @model abstract="true"
 * @generated
 */
public interface ArtefactElementCitation extends ArgumentAsset {
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
	 * @see GSN.Argumentation.ArgumentationPackage#getArtefactElementCitation_ExternalReference()
	 * @model
	 * @generated
	 */
	String getExternalReference();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.ArtefactElementCitation#getExternalReference <em>External Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Reference</em>' attribute.
	 * @see #getExternalReference()
	 * @generated
	 */
	void setExternalReference(String value);

	/**
	 * Returns the value of the '<em><b>Cited Artefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited Artefact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Artefact</em>' reference.
	 * @see #setCitedArtefact(ArtefactElement)
	 * @see GSN.Argumentation.ArgumentationPackage#getArtefactElementCitation_CitedArtefact()
	 * @model
	 * @generated
	 */
	ArtefactElement getCitedArtefact();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.ArtefactElementCitation#getCitedArtefact <em>Cited Artefact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Artefact</em>' reference.
	 * @see #getCitedArtefact()
	 * @generated
	 */
	void setCitedArtefact(ArtefactElement value);

} // ArtefactElementCitation
