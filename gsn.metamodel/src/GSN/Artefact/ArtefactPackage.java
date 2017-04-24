/**
 */
package GSN.Artefact;

import GSN.Commons.CommonsPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Artefact.ArtefactPackage#getArtefactPackageCitation <em>Artefact Package Citation</em>}</li>
 *   <li>{@link GSN.Artefact.ArtefactPackage#getArtefactAsset <em>Artefact Asset</em>}</li>
 *   <li>{@link GSN.Artefact.ArtefactPackage#getArtefactPackage <em>Artefact Package</em>}</li>
 *   <li>{@link GSN.Artefact.ArtefactPackage#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see GSN.Artefact.ArtefactPackage#getArtefactPackage()
 * @model abstract="true"
 * @generated
 */
public interface ArtefactPackage extends ArtefactElement {
	/**
	 * Returns the value of the '<em><b>Artefact Package</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefact Package</em>' containment reference list.
	 * @see GSN.Artefact.ArtefactPackage#getArtefactPackage_ArtefactPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtefactPackage> getArtefactPackage();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see GSN.Artefact.ArtefactPackage#getArtefactPackage_Interface()
	 * @model
	 * @generated
	 */
	EList<ArtefactPackageInterface> getInterface();

	/**
	 * Returns the value of the '<em><b>Artefact Package Citation</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactPackageCitation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefact Package Citation</em>' containment reference list.
	 * @see GSN.Artefact.ArtefactPackage#getArtefactPackage_ArtefactPackageCitation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtefactPackageCitation> getArtefactPackageCitation();

	/**
	 * Returns the value of the '<em><b>Artefact Asset</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefact Asset</em>' containment reference list.
	 * @see GSN.Artefact.ArtefactPackage#getArtefactPackage_ArtefactAsset()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtefactAsset> getArtefactAsset();

} //ArtefactPackage
