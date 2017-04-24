/**
 */
package GSN.Argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.ArgumentPackage#getArgumentAsset <em>Argument Asset</em>}</li>
 *   <li>{@link GSN.Argumentation.ArgumentPackage#getArgumentPackage <em>Argument Package</em>}</li>
 *   <li>{@link GSN.Argumentation.ArgumentPackage#getInterface <em>Interface</em>}</li>
 *   <li>{@link GSN.Argumentation.ArgumentPackage#getArgumentPackageCitation <em>Argument Package Citation</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getArgumentPackage()
 * @model abstract="true"
 * @generated
 */
public interface ArgumentPackage extends ArgumentationElement {
	/**
	 * Returns the value of the '<em><b>Argument Asset</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Argumentation.ArgumentAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Asset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Asset</em>' containment reference list.
	 * @see GSN.Argumentation.ArgumentationPackage#getArgumentPackage_ArgumentAsset()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentAsset> getArgumentAsset();

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
	 * @see GSN.Argumentation.ArgumentationPackage#getArgumentPackage_ArgumentPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentPackage> getArgumentPackage();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link GSN.Argumentation.ArgumentPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see GSN.Argumentation.ArgumentationPackage#getArgumentPackage_Interface()
	 * @model
	 * @generated
	 */
	EList<ArgumentPackageInterface> getInterface();

	/**
	 * Returns the value of the '<em><b>Argument Package Citation</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Argumentation.ArgumentPackageCitation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Package Citation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Package Citation</em>' containment reference list.
	 * @see GSN.Argumentation.ArgumentationPackage#getArgumentPackage_ArgumentPackageCitation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentPackageCitation> getArgumentPackageCitation();

} // ArgumentPackage
