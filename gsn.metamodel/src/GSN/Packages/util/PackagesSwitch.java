/**
 */
package GSN.Packages.util;

import GSN.Artefact.ArtefactElement;

import GSN.Commons.ModelElement;
import GSN.Commons.SACMElement;

import GSN.Packages.*;

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
 * @see GSN.Packages.PackagesPackage
 * @generated
 */
public class PackagesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PackagesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesSwitch() {
		if (modelPackage == null) {
			modelPackage = PackagesPackage.eINSTANCE;
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
			case PackagesPackage.ASSURANCE_CASE_PACKAGE: {
				AssuranceCasePackage assuranceCasePackage = (AssuranceCasePackage)theEObject;
				T result = caseAssuranceCasePackage(assuranceCasePackage);
				if (result == null) result = caseArtefactElement(assuranceCasePackage);
				if (result == null) result = caseModelElement(assuranceCasePackage);
				if (result == null) result = caseSACMElement(assuranceCasePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagesPackage.ASSURANCE_CASE_PACKAGE_INTERFACE: {
				AssuranceCasePackageInterface assuranceCasePackageInterface = (AssuranceCasePackageInterface)theEObject;
				T result = caseAssuranceCasePackageInterface(assuranceCasePackageInterface);
				if (result == null) result = caseAssuranceCasePackage(assuranceCasePackageInterface);
				if (result == null) result = caseArtefactElement(assuranceCasePackageInterface);
				if (result == null) result = caseModelElement(assuranceCasePackageInterface);
				if (result == null) result = caseSACMElement(assuranceCasePackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagesPackage.ASSURANCE_CASE_PACKAGE_CITATION: {
				AssuranceCasePackageCitation assuranceCasePackageCitation = (AssuranceCasePackageCitation)theEObject;
				T result = caseAssuranceCasePackageCitation(assuranceCasePackageCitation);
				if (result == null) result = caseAssuranceCasePackage(assuranceCasePackageCitation);
				if (result == null) result = caseArtefactElement(assuranceCasePackageCitation);
				if (result == null) result = caseModelElement(assuranceCasePackageCitation);
				if (result == null) result = caseSACMElement(assuranceCasePackageCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assurance Case Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assurance Case Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssuranceCasePackage(AssuranceCasePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assurance Case Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assurance Case Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssuranceCasePackageInterface(AssuranceCasePackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assurance Case Package Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assurance Case Package Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssuranceCasePackageCitation(AssuranceCasePackageCitation object) {
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
	public T caseArtefactElement(ArtefactElement object) {
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

} //PackagesSwitch
