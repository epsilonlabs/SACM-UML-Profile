/**
 */
package GSN.Terminology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Terminology.ExpressionElement#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see GSN.Terminology.TerminologyPackage#getExpressionElement()
 * @model abstract="true"
 * @generated
 */
public interface ExpressionElement extends TerminologyAsset {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link GSN.Terminology.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see GSN.Terminology.TerminologyPackage#getExpressionElement_Category()
	 * @model
	 * @generated
	 */
	EList<Category> getCategory();

} // ExpressionElement
