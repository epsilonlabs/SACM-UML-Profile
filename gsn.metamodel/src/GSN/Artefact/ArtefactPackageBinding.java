/**
 */
package GSN.Artefact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.ArtefactPackageBinding#getParticipantpackage <em>Participantpackage</em>}</li>
 * </ul>
 *
 * @see GSN.Artefact.ArtefactPackage#getArtefactPackageBinding()
 * @model abstract="true"
 * @generated
 */
public interface ArtefactPackageBinding extends ArtefactPackage {
	/**
	 * Returns the value of the '<em><b>Participantpackage</b></em>' reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participantpackage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participantpackage</em>' reference list.
	 * @see GSN.Artefact.ArtefactPackage#getArtefactPackageBinding_Participantpackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<ArtefactPackage> getParticipantpackage();

} // ArtefactPackageBinding
