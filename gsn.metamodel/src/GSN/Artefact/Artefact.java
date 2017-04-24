/**
 */
package GSN.Artefact;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.Artefact#getVersion <em>Version</em>}</li>
 *   <li>{@link GSN.Artefact.Artefact#getDate <em>Date</em>}</li>
 *   <li>{@link GSN.Artefact.Artefact#getArtefactProperty <em>Artefact Property</em>}</li>
 *   <li>{@link GSN.Artefact.Artefact#getArtefactEvent <em>Artefact Event</em>}</li>
 * </ul>
 *
 * @see GSN.Artefact.ArtefactPackage#getArtefact()
 * @model abstract="true"
 * @generated
 */
public interface Artefact extends ArtefactAsset {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see GSN.Artefact.ArtefactPackage#getArtefact_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link GSN.Artefact.Artefact#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see GSN.Artefact.ArtefactPackage#getArtefact_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link GSN.Artefact.Artefact#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Artefact Property</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artefact Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefact Property</em>' containment reference list.
	 * @see GSN.Artefact.ArtefactPackage#getArtefact_ArtefactProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtefactProperty> getArtefactProperty();

	/**
	 * Returns the value of the '<em><b>Artefact Event</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artefact Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefact Event</em>' containment reference list.
	 * @see GSN.Artefact.ArtefactPackage#getArtefact_ArtefactEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtefactEvent> getArtefactEvent();

} // Artefact
