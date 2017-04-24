/**
 */
package GSN.Artefact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.ArtefactAssetCitation#getCitedAsset <em>Cited Asset</em>}</li>
 * </ul>
 *
 * @see GSN.Artefact.ArtefactPackage#getArtefactAssetCitation()
 * @model abstract="true"
 * @generated
 */
public interface ArtefactAssetCitation extends ArtefactAsset {
	/**
	 * Returns the value of the '<em><b>Cited Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Asset</em>' reference.
	 * @see #setCitedAsset(ArtefactAsset)
	 * @see GSN.Artefact.ArtefactPackage#getArtefactAssetCitation_CitedAsset()
	 * @model required="true"
	 * @generated
	 */
	ArtefactAsset getCitedAsset();

	/**
	 * Sets the value of the '{@link GSN.Artefact.ArtefactAssetCitation#getCitedAsset <em>Cited Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Asset</em>' reference.
	 * @see #getCitedAsset()
	 * @generated
	 */
	void setCitedAsset(ArtefactAsset value);

} // ArtefactAssetCitation
