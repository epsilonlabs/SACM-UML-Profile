/**
 */
package GSN.Artefact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.ArtefactAssetRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link GSN.Artefact.ArtefactAssetRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see GSN.Artefact.ArtefactPackage#getArtefactAssetRelationship()
 * @model abstract="true"
 * @generated
 */
public interface ArtefactAssetRelationship extends ArtefactAsset {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see GSN.Artefact.ArtefactPackage#getArtefactAssetRelationship_Source()
	 * @model
	 * @generated
	 */
	EList<ArtefactAsset> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see GSN.Artefact.ArtefactPackage#getArtefactAssetRelationship_Target()
	 * @model
	 * @generated
	 */
	EList<ArtefactAsset> getTarget();

} // ArtefactAssetRelationship
