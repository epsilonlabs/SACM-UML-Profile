/**
 */
package GSN.Packages;

import GSN.Argumentation.ArgumentPackage;

import GSN.Artefact.ArtefactElement;
import GSN.Artefact.ArtefactPackage;

import GSN.Terminology.TerminologyPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Case Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Packages.AssuranceCasePackage#getAssuranceCasePackageCitation <em>Assurance Case Package Citation</em>}</li>
 *   <li>{@link GSN.Packages.AssuranceCasePackage#getAssuranceCasePackage <em>Assurance Case Package</em>}</li>
 *   <li>{@link GSN.Packages.AssuranceCasePackage#getInterface <em>Interface</em>}</li>
 *   <li>{@link GSN.Packages.AssuranceCasePackage#getArgumentPackage <em>Argument Package</em>}</li>
 *   <li>{@link GSN.Packages.AssuranceCasePackage#getArtefactPackage <em>Artefact Package</em>}</li>
 *   <li>{@link GSN.Packages.AssuranceCasePackage#getTerminologyPackage <em>Terminology Package</em>}</li>
 * </ul>
 *
 * @see GSN.Packages.PackagesPackage#getAssuranceCasePackage()
 * @model abstract="true"
 * @generated
 */
public interface AssuranceCasePackage extends ArtefactElement {
	/**
	 * Returns the value of the '<em><b>Assurance Case Package Citation</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Packages.AssuranceCasePackageCitation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Case Package Citation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Case Package Citation</em>' containment reference list.
	 * @see GSN.Packages.PackagesPackage#getAssuranceCasePackage_AssuranceCasePackageCitation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssuranceCasePackageCitation> getAssuranceCasePackageCitation();

	/**
	 * Returns the value of the '<em><b>Assurance Case Package</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Packages.AssuranceCasePackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Case Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Case Package</em>' containment reference list.
	 * @see GSN.Packages.PackagesPackage#getAssuranceCasePackage_AssuranceCasePackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssuranceCasePackage> getAssuranceCasePackage();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link GSN.Packages.AssuranceCasePackageInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see GSN.Packages.PackagesPackage#getAssuranceCasePackage_Interface()
	 * @model
	 * @generated
	 */
	EList<AssuranceCasePackageInterface> getInterface();

	/**
	 * Returns the value of the '<em><b>Argument Package</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Argumentation.ArgumentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Package</em>' containment reference list.
	 * @see GSN.Packages.PackagesPackage#getAssuranceCasePackage_ArgumentPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentPackage> getArgumentPackage();

	/**
	 * Returns the value of the '<em><b>Artefact Package</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Artefact.ArtefactPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artefact Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefact Package</em>' containment reference list.
	 * @see GSN.Packages.PackagesPackage#getAssuranceCasePackage_ArtefactPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtefactPackage> getArtefactPackage();

	/**
	 * Returns the value of the '<em><b>Terminology Package</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Terminology.TerminologyPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Package</em>' containment reference list.
	 * @see GSN.Packages.PackagesPackage#getAssuranceCasePackage_TerminologyPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyPackage> getTerminologyPackage();

} // AssuranceCasePackage
