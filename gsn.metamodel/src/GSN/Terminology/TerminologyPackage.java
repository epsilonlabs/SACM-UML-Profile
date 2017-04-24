/**
 */
package GSN.Terminology;

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
 *   <li>{@link GSN.Terminology.TerminologyPackage#getTerminologyAsset <em>Terminology Asset</em>}</li>
 *   <li>{@link GSN.Terminology.TerminologyPackage#getTerminologyPackage <em>Terminology Package</em>}</li>
 *   <li>{@link GSN.Terminology.TerminologyPackage#getTerminologyPackageCitation <em>Terminology Package Citation</em>}</li>
 * </ul>
 *
 * @see GSN.Terminology.TerminologyPackage#getTerminologyPackage()
 * @model abstract="true"
 * @generated
 */
public interface TerminologyPackage extends TerminologyElement {
	/**
	 * Returns the value of the '<em><b>Terminology Package</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Terminology.TerminologyPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Package</em>' containment reference list.
	 * @see GSN.Terminology.TerminologyPackage#getTerminologyPackage_TerminologyPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyPackage> getTerminologyPackage();

	/**
	 * Returns the value of the '<em><b>Terminology Package Citation</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Terminology.TerminologyPackageCitation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Package Citation</em>' containment reference list.
	 * @see GSN.Terminology.TerminologyPackage#getTerminologyPackage_TerminologyPackageCitation()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyPackageCitation> getTerminologyPackageCitation();

	/**
	 * Returns the value of the '<em><b>Terminology Asset</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Terminology.TerminologyAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Asset</em>' containment reference list.
	 * @see GSN.Terminology.TerminologyPackage#getTerminologyPackage_TerminologyAsset()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyAsset> getTerminologyAsset();

} //TerminologyPackage
