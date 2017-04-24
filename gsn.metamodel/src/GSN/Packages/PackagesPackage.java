/**
 */
package GSN.Packages;

import GSN.Artefact.ArtefactPackage;

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
 * @see GSN.Packages.PackagesFactory
 * @model kind="package"
 * @generated
 */
public interface PackagesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Packages";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.goalstructuringnotation.info/1.0/packages";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GSN_Packages";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackagesPackage eINSTANCE = GSN.Packages.impl.PackagesPackageImpl.init();

	/**
	 * The meta object id for the '{@link GSN.Packages.impl.AssuranceCasePackageImpl <em>Assurance Case Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Packages.impl.AssuranceCasePackageImpl
	 * @see GSN.Packages.impl.PackagesPackageImpl#getAssuranceCasePackage()
	 * @generated
	 */
	int ASSURANCE_CASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__GID = ArtefactPackage.ARTEFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__NAME = ArtefactPackage.ARTEFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__IS_ABSTRACT = ArtefactPackage.ARTEFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__DESCRIPTION = ArtefactPackage.ARTEFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__INPLEMENTATION_CONSTRAINT = ArtefactPackage.ARTEFACT_ELEMENT__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__UNINSTANTIATED = ArtefactPackage.ARTEFACT_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Assurance Case Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION = ArtefactPackage.ARTEFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assurance Case Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE = ArtefactPackage.ARTEFACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__INTERFACE = ArtefactPackage.ARTEFACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE = ArtefactPackage.ARTEFACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artefact Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE = ArtefactPackage.ARTEFACT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Terminology Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE = ArtefactPackage.ARTEFACT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Assurance Case Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_FEATURE_COUNT = ArtefactPackage.ARTEFACT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link GSN.Packages.impl.AssuranceCasePackageInterfaceImpl <em>Assurance Case Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Packages.impl.AssuranceCasePackageInterfaceImpl
	 * @see GSN.Packages.impl.PackagesPackageImpl#getAssuranceCasePackageInterface()
	 * @generated
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__GID = ASSURANCE_CASE_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__NAME = ASSURANCE_CASE_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__IS_ABSTRACT = ASSURANCE_CASE_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__DESCRIPTION = ASSURANCE_CASE_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__INPLEMENTATION_CONSTRAINT = ASSURANCE_CASE_PACKAGE__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__UNINSTANTIATED = ASSURANCE_CASE_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Assurance Case Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__ASSURANCE_CASE_PACKAGE_CITATION = ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION;

	/**
	 * The feature id for the '<em><b>Assurance Case Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__ASSURANCE_CASE_PACKAGE = ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__INTERFACE = ASSURANCE_CASE_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__ARGUMENT_PACKAGE = ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Artefact Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__ARTEFACT_PACKAGE = ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Terminology Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__TERMINOLOGY_PACKAGE = ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE;

	/**
	 * The number of structural features of the '<em>Assurance Case Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE_FEATURE_COUNT = ASSURANCE_CASE_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Packages.impl.AssuranceCasePackageCitationImpl <em>Assurance Case Package Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Packages.impl.AssuranceCasePackageCitationImpl
	 * @see GSN.Packages.impl.PackagesPackageImpl#getAssuranceCasePackageCitation()
	 * @generated
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__GID = ASSURANCE_CASE_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__NAME = ASSURANCE_CASE_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__IS_ABSTRACT = ASSURANCE_CASE_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__DESCRIPTION = ASSURANCE_CASE_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__INPLEMENTATION_CONSTRAINT = ASSURANCE_CASE_PACKAGE__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__UNINSTANTIATED = ASSURANCE_CASE_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Assurance Case Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__ASSURANCE_CASE_PACKAGE_CITATION = ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION;

	/**
	 * The feature id for the '<em><b>Assurance Case Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__ASSURANCE_CASE_PACKAGE = ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__INTERFACE = ASSURANCE_CASE_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__ARGUMENT_PACKAGE = ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Artefact Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__ARTEFACT_PACKAGE = ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Terminology Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__TERMINOLOGY_PACKAGE = ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE;

	/**
	 * The feature id for the '<em><b>Cited Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION__CITED_PACKAGE = ASSURANCE_CASE_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assurance Case Package Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_CITATION_FEATURE_COUNT = ASSURANCE_CASE_PACKAGE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link GSN.Packages.AssuranceCasePackage <em>Assurance Case Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assurance Case Package</em>'.
	 * @see GSN.Packages.AssuranceCasePackage
	 * @generated
	 */
	EClass getAssuranceCasePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Packages.AssuranceCasePackage#getAssuranceCasePackageCitation <em>Assurance Case Package Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assurance Case Package Citation</em>'.
	 * @see GSN.Packages.AssuranceCasePackage#getAssuranceCasePackageCitation()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_AssuranceCasePackageCitation();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Packages.AssuranceCasePackage#getAssuranceCasePackage <em>Assurance Case Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assurance Case Package</em>'.
	 * @see GSN.Packages.AssuranceCasePackage#getAssuranceCasePackage()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_AssuranceCasePackage();

	/**
	 * Returns the meta object for the reference list '{@link GSN.Packages.AssuranceCasePackage#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface</em>'.
	 * @see GSN.Packages.AssuranceCasePackage#getInterface()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Packages.AssuranceCasePackage#getArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Package</em>'.
	 * @see GSN.Packages.AssuranceCasePackage#getArgumentPackage()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_ArgumentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Packages.AssuranceCasePackage#getArtefactPackage <em>Artefact Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artefact Package</em>'.
	 * @see GSN.Packages.AssuranceCasePackage#getArtefactPackage()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_ArtefactPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Packages.AssuranceCasePackage#getTerminologyPackage <em>Terminology Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Package</em>'.
	 * @see GSN.Packages.AssuranceCasePackage#getTerminologyPackage()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_TerminologyPackage();

	/**
	 * Returns the meta object for class '{@link GSN.Packages.AssuranceCasePackageInterface <em>Assurance Case Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assurance Case Package Interface</em>'.
	 * @see GSN.Packages.AssuranceCasePackageInterface
	 * @generated
	 */
	EClass getAssuranceCasePackageInterface();

	/**
	 * Returns the meta object for class '{@link GSN.Packages.AssuranceCasePackageCitation <em>Assurance Case Package Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assurance Case Package Citation</em>'.
	 * @see GSN.Packages.AssuranceCasePackageCitation
	 * @generated
	 */
	EClass getAssuranceCasePackageCitation();

	/**
	 * Returns the meta object for the reference '{@link GSN.Packages.AssuranceCasePackageCitation#getCitedPackage <em>Cited Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cited Package</em>'.
	 * @see GSN.Packages.AssuranceCasePackageCitation#getCitedPackage()
	 * @see #getAssuranceCasePackageCitation()
	 * @generated
	 */
	EReference getAssuranceCasePackageCitation_CitedPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackagesFactory getPackagesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GSN.Packages.impl.AssuranceCasePackageImpl <em>Assurance Case Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Packages.impl.AssuranceCasePackageImpl
		 * @see GSN.Packages.impl.PackagesPackageImpl#getAssuranceCasePackage()
		 * @generated
		 */
		EClass ASSURANCE_CASE_PACKAGE = eINSTANCE.getAssuranceCasePackage();

		/**
		 * The meta object literal for the '<em><b>Assurance Case Package Citation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE_CITATION = eINSTANCE.getAssuranceCasePackage_AssuranceCasePackageCitation();

		/**
		 * The meta object literal for the '<em><b>Assurance Case Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE = eINSTANCE.getAssuranceCasePackage_AssuranceCasePackage();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__INTERFACE = eINSTANCE.getAssuranceCasePackage_Interface();

		/**
		 * The meta object literal for the '<em><b>Argument Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE = eINSTANCE.getAssuranceCasePackage_ArgumentPackage();

		/**
		 * The meta object literal for the '<em><b>Artefact Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__ARTEFACT_PACKAGE = eINSTANCE.getAssuranceCasePackage_ArtefactPackage();

		/**
		 * The meta object literal for the '<em><b>Terminology Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE = eINSTANCE.getAssuranceCasePackage_TerminologyPackage();

		/**
		 * The meta object literal for the '{@link GSN.Packages.impl.AssuranceCasePackageInterfaceImpl <em>Assurance Case Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Packages.impl.AssuranceCasePackageInterfaceImpl
		 * @see GSN.Packages.impl.PackagesPackageImpl#getAssuranceCasePackageInterface()
		 * @generated
		 */
		EClass ASSURANCE_CASE_PACKAGE_INTERFACE = eINSTANCE.getAssuranceCasePackageInterface();

		/**
		 * The meta object literal for the '{@link GSN.Packages.impl.AssuranceCasePackageCitationImpl <em>Assurance Case Package Citation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Packages.impl.AssuranceCasePackageCitationImpl
		 * @see GSN.Packages.impl.PackagesPackageImpl#getAssuranceCasePackageCitation()
		 * @generated
		 */
		EClass ASSURANCE_CASE_PACKAGE_CITATION = eINSTANCE.getAssuranceCasePackageCitation();

		/**
		 * The meta object literal for the '<em><b>Cited Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE_CITATION__CITED_PACKAGE = eINSTANCE.getAssuranceCasePackageCitation_CitedPackage();

	}

} //PackagesPackage
