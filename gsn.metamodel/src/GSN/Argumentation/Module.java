/**
 */
package GSN.Argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.Module#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends ArgumentPackage {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference list.
	 * The list contents are of type {@link GSN.Argumentation.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference list.
	 * @see GSN.Argumentation.ArgumentationPackage#getModule_Module()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModule();

} // Module
