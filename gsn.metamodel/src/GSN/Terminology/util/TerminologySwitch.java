/**
 */
package GSN.Terminology.util;

import GSN.Commons.ModelElement;
import GSN.Commons.SACMElement;

import GSN.Terminology.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see GSN.Terminology.TerminologyPackage
 * @generated
 */
public class TerminologySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TerminologyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologySwitch() {
		if (modelPackage == null) {
			modelPackage = TerminologyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TerminologyPackage.TERMINOLOGY_ELEMENT: {
				TerminologyElement terminologyElement = (TerminologyElement)theEObject;
				T result = caseTerminologyElement(terminologyElement);
				if (result == null) result = caseModelElement(terminologyElement);
				if (result == null) result = caseSACMElement(terminologyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.TERMINOLOGY_PACKAGE: {
				TerminologyPackage terminologyPackage = (TerminologyPackage)theEObject;
				T result = caseTerminologyPackage(terminologyPackage);
				if (result == null) result = caseTerminologyElement(terminologyPackage);
				if (result == null) result = caseModelElement(terminologyPackage);
				if (result == null) result = caseSACMElement(terminologyPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.TERMINOLOGY_PACKAGE_CITATION: {
				TerminologyPackageCitation terminologyPackageCitation = (TerminologyPackageCitation)theEObject;
				T result = caseTerminologyPackageCitation(terminologyPackageCitation);
				if (result == null) result = caseTerminologyPackage(terminologyPackageCitation);
				if (result == null) result = caseTerminologyElement(terminologyPackageCitation);
				if (result == null) result = caseModelElement(terminologyPackageCitation);
				if (result == null) result = caseSACMElement(terminologyPackageCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.TERMINOLOGY_ASSET: {
				TerminologyAsset terminologyAsset = (TerminologyAsset)theEObject;
				T result = caseTerminologyAsset(terminologyAsset);
				if (result == null) result = caseTerminologyElement(terminologyAsset);
				if (result == null) result = caseModelElement(terminologyAsset);
				if (result == null) result = caseSACMElement(terminologyAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseTerminologyAsset(category);
				if (result == null) result = caseTerminologyElement(category);
				if (result == null) result = caseModelElement(category);
				if (result == null) result = caseSACMElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.EXPRESSION_ELEMENT: {
				ExpressionElement expressionElement = (ExpressionElement)theEObject;
				T result = caseExpressionElement(expressionElement);
				if (result == null) result = caseTerminologyAsset(expressionElement);
				if (result == null) result = caseTerminologyElement(expressionElement);
				if (result == null) result = caseModelElement(expressionElement);
				if (result == null) result = caseSACMElement(expressionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseExpressionElement(expression);
				if (result == null) result = caseTerminologyAsset(expression);
				if (result == null) result = caseTerminologyElement(expression);
				if (result == null) result = caseModelElement(expression);
				if (result == null) result = caseSACMElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseExpressionElement(term);
				if (result == null) result = caseTerminologyAsset(term);
				if (result == null) result = caseTerminologyElement(term);
				if (result == null) result = caseModelElement(term);
				if (result == null) result = caseSACMElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseTerm(role);
				if (result == null) result = caseExpressionElement(role);
				if (result == null) result = caseTerminologyAsset(role);
				if (result == null) result = caseTerminologyElement(role);
				if (result == null) result = caseModelElement(role);
				if (result == null) result = caseSACMElement(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologyPackage.TERMINOLOGY_ASSET_CITATION: {
				TerminologyAssetCitation terminologyAssetCitation = (TerminologyAssetCitation)theEObject;
				T result = caseTerminologyAssetCitation(terminologyAssetCitation);
				if (result == null) result = caseExpressionElement(terminologyAssetCitation);
				if (result == null) result = caseTerminologyAsset(terminologyAssetCitation);
				if (result == null) result = caseTerminologyElement(terminologyAssetCitation);
				if (result == null) result = caseModelElement(terminologyAssetCitation);
				if (result == null) result = caseSACMElement(terminologyAssetCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyElement(TerminologyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyPackage(TerminologyPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyPackageCitation(TerminologyPackageCitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyAsset(TerminologyAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionElement(ExpressionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyAssetCitation(TerminologyAssetCitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACMElement(SACMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TerminologySwitch
