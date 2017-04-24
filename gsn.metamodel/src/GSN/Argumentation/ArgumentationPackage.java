/**
 */
package GSN.Argumentation;

import GSN.Commons.CommonsPackage;

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
 * @see GSN.Argumentation.ArgumentationFactory
 * @model kind="package"
 * @generated
 */
public interface ArgumentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Argumentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.goalstructuringnotation.info/1.0/argumentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GSN_Argumentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArgumentationPackage eINSTANCE = GSN.Argumentation.impl.ArgumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ArgumentationElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ArgumentationElementImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentationElement()
	 * @generated
	 */
	int ARGUMENTATION_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__GID = CommonsPackage.MODEL_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__NAME = CommonsPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__IS_ABSTRACT = CommonsPackage.MODEL_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__DESCRIPTION = CommonsPackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__INPLEMENTATION_CONSTRAINT = CommonsPackage.MODEL_ELEMENT__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__UNINSTANTIATED = CommonsPackage.MODEL_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__CONTENT = CommonsPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT_FEATURE_COUNT = CommonsPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ArgumentPackageImpl <em>Argument Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ArgumentPackageImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentPackage()
	 * @generated
	 */
	int ARGUMENT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__GID = ARGUMENTATION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__NAME = ARGUMENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__IS_ABSTRACT = ARGUMENTATION_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__DESCRIPTION = ARGUMENTATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__INPLEMENTATION_CONSTRAINT = ARGUMENTATION_ELEMENT__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__UNINSTANTIATED = ARGUMENTATION_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__CONTENT = ARGUMENTATION_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Argument Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__ARGUMENT_ASSET = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__ARGUMENT_PACKAGE = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__INTERFACE = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Argument Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_FEATURE_COUNT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ModuleImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GID = ARGUMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = ARGUMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_ABSTRACT = ARGUMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = ARGUMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INPLEMENTATION_CONSTRAINT = ARGUMENT_PACKAGE__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UNINSTANTIATED = ARGUMENT_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONTENT = ARGUMENT_PACKAGE__CONTENT;

	/**
	 * The feature id for the '<em><b>Argument Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ARGUMENT_ASSET = ARGUMENT_PACKAGE__ARGUMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ARGUMENT_PACKAGE = ARGUMENT_PACKAGE__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INTERFACE = ARGUMENT_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Argument Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ARGUMENT_PACKAGE_CITATION = ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE = ARGUMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = ARGUMENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ArgumentPackageCitationImpl <em>Argument Package Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ArgumentPackageCitationImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentPackageCitation()
	 * @generated
	 */
	int ARGUMENT_PACKAGE_CITATION = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__GID = ARGUMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__NAME = ARGUMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__IS_ABSTRACT = ARGUMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__DESCRIPTION = ARGUMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__INPLEMENTATION_CONSTRAINT = ARGUMENT_PACKAGE__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__UNINSTANTIATED = ARGUMENT_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__CONTENT = ARGUMENT_PACKAGE__CONTENT;

	/**
	 * The feature id for the '<em><b>Argument Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__ARGUMENT_ASSET = ARGUMENT_PACKAGE__ARGUMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__ARGUMENT_PACKAGE = ARGUMENT_PACKAGE__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__INTERFACE = ARGUMENT_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Argument Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__ARGUMENT_PACKAGE_CITATION = ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION;

	/**
	 * The feature id for the '<em><b>Cited Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE = ARGUMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Package Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_CITATION_FEATURE_COUNT = ARGUMENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ArgumentPackageBindingImpl <em>Argument Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ArgumentPackageBindingImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentPackageBinding()
	 * @generated
	 */
	int ARGUMENT_PACKAGE_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__GID = ARGUMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__NAME = ARGUMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__IS_ABSTRACT = ARGUMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__DESCRIPTION = ARGUMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__INPLEMENTATION_CONSTRAINT = ARGUMENT_PACKAGE__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__UNINSTANTIATED = ARGUMENT_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__CONTENT = ARGUMENT_PACKAGE__CONTENT;

	/**
	 * The feature id for the '<em><b>Argument Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__ARGUMENT_ASSET = ARGUMENT_PACKAGE__ARGUMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__ARGUMENT_PACKAGE = ARGUMENT_PACKAGE__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__INTERFACE = ARGUMENT_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Argument Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__ARGUMENT_PACKAGE_CITATION = ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = ARGUMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING_FEATURE_COUNT = ARGUMENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ContractImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__GID = ARGUMENT_PACKAGE_BINDING__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAME = ARGUMENT_PACKAGE_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__IS_ABSTRACT = ARGUMENT_PACKAGE_BINDING__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DESCRIPTION = ARGUMENT_PACKAGE_BINDING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INPLEMENTATION_CONSTRAINT = ARGUMENT_PACKAGE_BINDING__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__UNINSTANTIATED = ARGUMENT_PACKAGE_BINDING__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CONTENT = ARGUMENT_PACKAGE_BINDING__CONTENT;

	/**
	 * The feature id for the '<em><b>Argument Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ARGUMENT_ASSET = ARGUMENT_PACKAGE_BINDING__ARGUMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ARGUMENT_PACKAGE = ARGUMENT_PACKAGE_BINDING__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INTERFACE = ARGUMENT_PACKAGE_BINDING__INTERFACE;

	/**
	 * The feature id for the '<em><b>Argument Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ARGUMENT_PACKAGE_CITATION = ARGUMENT_PACKAGE_BINDING__ARGUMENT_PACKAGE_CITATION;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PARTICIPANT_PACKAGE = ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = ARGUMENT_PACKAGE_BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ArgumentPackageInterfaceImpl <em>Argument Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ArgumentPackageInterfaceImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentPackageInterface()
	 * @generated
	 */
	int ARGUMENT_PACKAGE_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__GID = ARGUMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__NAME = ARGUMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__IS_ABSTRACT = ARGUMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__DESCRIPTION = ARGUMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__INPLEMENTATION_CONSTRAINT = ARGUMENT_PACKAGE__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__UNINSTANTIATED = ARGUMENT_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__CONTENT = ARGUMENT_PACKAGE__CONTENT;

	/**
	 * The feature id for the '<em><b>Argument Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__ARGUMENT_ASSET = ARGUMENT_PACKAGE__ARGUMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__ARGUMENT_PACKAGE = ARGUMENT_PACKAGE__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__INTERFACE = ARGUMENT_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Argument Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__ARGUMENT_PACKAGE_CITATION = ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION;

	/**
	 * The number of structural features of the '<em>Argument Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE_FEATURE_COUNT = ARGUMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ArgumentAssetImpl <em>Argument Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ArgumentAssetImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentAsset()
	 * @generated
	 */
	int ARGUMENT_ASSET = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__GID = ARGUMENTATION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__NAME = ARGUMENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__IS_ABSTRACT = ARGUMENTATION_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__DESCRIPTION = ARGUMENTATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__INPLEMENTATION_CONSTRAINT = ARGUMENTATION_ELEMENT__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__UNINSTANTIATED = ARGUMENTATION_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__CONTENT = ARGUMENTATION_ELEMENT__CONTENT;

	/**
	 * The number of structural features of the '<em>Argument Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_FEATURE_COUNT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AssertionImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__GID = ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__NAME = ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__IS_ABSTRACT = ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__DESCRIPTION = ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__INPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__UNINSTANTIATED = ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__CONTENT = ARGUMENT_ASSET__CONTENT;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ArtefactElementCitationImpl <em>Artefact Element Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ArtefactElementCitationImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArtefactElementCitation()
	 * @generated
	 */
	int ARTEFACT_ELEMENT_CITATION = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION__GID = ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION__NAME = ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION__IS_ABSTRACT = ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION__DESCRIPTION = ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION__INPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION__UNINSTANTIATED = ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION__CONTENT = ARGUMENT_ASSET__CONTENT;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION__EXTERNAL_REFERENCE = ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cited Artefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT = ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Artefact Element Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_ELEMENT_CITATION_FEATURE_COUNT = ARGUMENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.SolutionImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 10;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__GID = ARTEFACT_ELEMENT_CITATION__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = ARTEFACT_ELEMENT_CITATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_ABSTRACT = ARTEFACT_ELEMENT_CITATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = ARTEFACT_ELEMENT_CITATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__INPLEMENTATION_CONSTRAINT = ARTEFACT_ELEMENT_CITATION__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__UNINSTANTIATED = ARTEFACT_ELEMENT_CITATION__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONTENT = ARTEFACT_ELEMENT_CITATION__CONTENT;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__EXTERNAL_REFERENCE = ARTEFACT_ELEMENT_CITATION__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Cited Artefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CITED_ARTEFACT = ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_PUBLIC = ARTEFACT_ELEMENT_CITATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = ARTEFACT_ELEMENT_CITATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ArgumentAssetCitationImpl <em>Argument Asset Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ArgumentAssetCitationImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentAssetCitation()
	 * @generated
	 */
	int ARGUMENT_ASSET_CITATION = 11;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_CITATION__GID = ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_CITATION__NAME = ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_CITATION__IS_ABSTRACT = ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_CITATION__DESCRIPTION = ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_CITATION__INPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_CITATION__UNINSTANTIATED = ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_CITATION__CONTENT = ARGUMENT_ASSET__CONTENT;

	/**
	 * The feature id for the '<em><b>Cited Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_CITATION__CITED_ASSET = ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Asset Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_CITATION_FEATURE_COUNT = ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AwayGoalImpl <em>Away Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AwayGoalImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAwayGoal()
	 * @generated
	 */
	int AWAY_GOAL = 12;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__GID = ARGUMENT_ASSET_CITATION__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__NAME = ARGUMENT_ASSET_CITATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IS_ABSTRACT = ARGUMENT_ASSET_CITATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__DESCRIPTION = ARGUMENT_ASSET_CITATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__INPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET_CITATION__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__UNINSTANTIATED = ARGUMENT_ASSET_CITATION__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__CONTENT = ARGUMENT_ASSET_CITATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Cited Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__CITED_ASSET = ARGUMENT_ASSET_CITATION__CITED_ASSET;

	/**
	 * The feature id for the '<em><b>Away Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__AWAY_GOAL = ARGUMENT_ASSET_CITATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__MODULE_IDENTIFIER = ARGUMENT_ASSET_CITATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_FEATURE_COUNT = ARGUMENT_ASSET_CITATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AwaySolutionImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAwaySolution()
	 * @generated
	 */
	int AWAY_SOLUTION = 13;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__GID = ARGUMENT_ASSET_CITATION__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__NAME = ARGUMENT_ASSET_CITATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IS_ABSTRACT = ARGUMENT_ASSET_CITATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__DESCRIPTION = ARGUMENT_ASSET_CITATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__INPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET_CITATION__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__UNINSTANTIATED = ARGUMENT_ASSET_CITATION__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__CONTENT = ARGUMENT_ASSET_CITATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Cited Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__CITED_ASSET = ARGUMENT_ASSET_CITATION__CITED_ASSET;

	/**
	 * The feature id for the '<em><b>Away Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__AWAY_SOLUTION = ARGUMENT_ASSET_CITATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__MODULE_IDENTIFIER = ARGUMENT_ASSET_CITATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_FEATURE_COUNT = ARGUMENT_ASSET_CITATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AwayContextImpl <em>Away Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AwayContextImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAwayContext()
	 * @generated
	 */
	int AWAY_CONTEXT = 14;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__GID = ARGUMENT_ASSET_CITATION__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__NAME = ARGUMENT_ASSET_CITATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IS_ABSTRACT = ARGUMENT_ASSET_CITATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__DESCRIPTION = ARGUMENT_ASSET_CITATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__INPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET_CITATION__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__UNINSTANTIATED = ARGUMENT_ASSET_CITATION__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__CONTENT = ARGUMENT_ASSET_CITATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Cited Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__CITED_ASSET = ARGUMENT_ASSET_CITATION__CITED_ASSET;

	/**
	 * The feature id for the '<em><b>Away Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__AWAY_CONTEXT = ARGUMENT_ASSET_CITATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__MODULE_IDENTIFIER = ARGUMENT_ASSET_CITATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_FEATURE_COUNT = ARGUMENT_ASSET_CITATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ModuleReferenceImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getModuleReference()
	 * @generated
	 */
	int MODULE_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__GID = ARGUMENT_PACKAGE_CITATION__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__NAME = ARGUMENT_PACKAGE_CITATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__IS_ABSTRACT = ARGUMENT_PACKAGE_CITATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__DESCRIPTION = ARGUMENT_PACKAGE_CITATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__INPLEMENTATION_CONSTRAINT = ARGUMENT_PACKAGE_CITATION__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__UNINSTANTIATED = ARGUMENT_PACKAGE_CITATION__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__CONTENT = ARGUMENT_PACKAGE_CITATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Argument Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__ARGUMENT_ASSET = ARGUMENT_PACKAGE_CITATION__ARGUMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__ARGUMENT_PACKAGE = ARGUMENT_PACKAGE_CITATION__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__INTERFACE = ARGUMENT_PACKAGE_CITATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Argument Package Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__ARGUMENT_PACKAGE_CITATION = ARGUMENT_PACKAGE_CITATION__ARGUMENT_PACKAGE_CITATION;

	/**
	 * The feature id for the '<em><b>Cited Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__CITED_PACKAGE = ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__MODULE = ARGUMENT_PACKAGE_CITATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE_FEATURE_COUNT = ARGUMENT_PACKAGE_CITATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ClaimImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 16;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__GID = ASSERTION__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__NAME = ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__IS_ABSTRACT = ASSERTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__DESCRIPTION = ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__INPLEMENTATION_CONSTRAINT = ASSERTION__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__UNINSTANTIATED = ASSERTION__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CONTENT = ASSERTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__ASSUMED = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.GoalImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 17;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GID = CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_ABSTRACT = CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__INPLEMENTATION_CONSTRAINT = CLAIM__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__UNINSTANTIATED = CLAIM__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTENT = CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSUMED = CLAIM__ASSUMED;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ROLES = CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_PUBLIC = CLAIM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__UNDEVELOPED = CLAIM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Be Supported By Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TO_BE_SUPPORTED_BY_CONTRACT = CLAIM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = CLAIM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.JustificationImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 18;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__GID = CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__NAME = CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IS_ABSTRACT = CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__INPLEMENTATION_CONSTRAINT = CLAIM__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__UNINSTANTIATED = CLAIM__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CONTENT = CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__ASSUMED = CLAIM__ASSUMED;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = CLAIM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AssumptionImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 19;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__GID = CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_ABSTRACT = CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__INPLEMENTATION_CONSTRAINT = CLAIM__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__UNINSTANTIATED = CLAIM__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTENT = CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ASSUMED = CLAIM__ASSUMED;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = CLAIM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ArgumentReasoningImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentReasoning()
	 * @generated
	 */
	int ARGUMENT_REASONING = 20;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__GID = ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__NAME = ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__IS_ABSTRACT = ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__DESCRIPTION = ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__INPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__UNINSTANTIATED = ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__CONTENT = ARGUMENT_ASSET__CONTENT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__STRUCTURE = ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING_FEATURE_COUNT = ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.StrategyImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 21;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__GID = ARGUMENT_REASONING__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = ARGUMENT_REASONING__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IS_ABSTRACT = ARGUMENT_REASONING__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = ARGUMENT_REASONING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__INPLEMENTATION_CONSTRAINT = ARGUMENT_REASONING__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__UNINSTANTIATED = ARGUMENT_REASONING__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONTENT = ARGUMENT_REASONING__CONTENT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRUCTURE = ARGUMENT_REASONING__STRUCTURE;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__UNDEVELOPED = ARGUMENT_REASONING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = ARGUMENT_REASONING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.ContextImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 22;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__GID = ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_ABSTRACT = ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__INPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__UNINSTANTIATED = ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTENT = ARGUMENT_ASSET__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_PUBLIC = ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers To External Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__REFERS_TO_EXTERNAL_MATERIAL = ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ARGUMENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AssertedRelationshipImpl <em>Asserted Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AssertedRelationshipImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedRelationship()
	 * @generated
	 */
	int ASSERTED_RELATIONSHIP = 23;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__GID = ASSERTION__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__NAME = ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__IS_ABSTRACT = ASSERTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__DESCRIPTION = ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__INPLEMENTATION_CONSTRAINT = ASSERTION__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__UNINSTANTIATED = ASSERTION__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__CONTENT = ASSERTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__SOURCE = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__TARGET = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__REQUIRES = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__MANY = ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__OPTIONAL = ASSERTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Asserted Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AssertedInferenceImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedInference()
	 * @generated
	 */
	int ASSERTED_INFERENCE = 24;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__INPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__REQUIRES = ASSERTED_RELATIONSHIP__REQUIRES;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__MANY = ASSERTED_RELATIONSHIP__MANY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__OPTIONAL = ASSERTED_RELATIONSHIP__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Asserted Inference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.SupportedByImpl <em>Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.SupportedByImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getSupportedBy()
	 * @generated
	 */
	int SUPPORTED_BY = 25;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__INPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__REQUIRES = ASSERTED_RELATIONSHIP__REQUIRES;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__MANY = ASSERTED_RELATIONSHIP__MANY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__OPTIONAL = ASSERTED_RELATIONSHIP__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AssertedEvidenceImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedEvidence()
	 * @generated
	 */
	int ASSERTED_EVIDENCE = 26;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__INPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__REQUIRES = ASSERTED_RELATIONSHIP__REQUIRES;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__MANY = ASSERTED_RELATIONSHIP__MANY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__OPTIONAL = ASSERTED_RELATIONSHIP__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Asserted Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AssertedChallengeImpl <em>Asserted Challenge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AssertedChallengeImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedChallenge()
	 * @generated
	 */
	int ASSERTED_CHALLENGE = 27;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__INPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__REQUIRES = ASSERTED_RELATIONSHIP__REQUIRES;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__MANY = ASSERTED_RELATIONSHIP__MANY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__OPTIONAL = ASSERTED_RELATIONSHIP__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Asserted Challenge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AssertedCounterEvidenceImpl <em>Asserted Counter Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AssertedCounterEvidenceImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedCounterEvidence()
	 * @generated
	 */
	int ASSERTED_COUNTER_EVIDENCE = 28;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__INPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__REQUIRES = ASSERTED_RELATIONSHIP__REQUIRES;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__MANY = ASSERTED_RELATIONSHIP__MANY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__OPTIONAL = ASSERTED_RELATIONSHIP__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Asserted Counter Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.AssertedContextImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedContext()
	 * @generated
	 */
	int ASSERTED_CONTEXT = 29;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__INPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__REQUIRES = ASSERTED_RELATIONSHIP__REQUIRES;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__MANY = ASSERTED_RELATIONSHIP__MANY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__OPTIONAL = ASSERTED_RELATIONSHIP__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Asserted Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Argumentation.impl.InContextOfImpl <em>In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Argumentation.impl.InContextOfImpl
	 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getInContextOf()
	 * @generated
	 */
	int IN_CONTEXT_OF = 30;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__GID = ASSERTED_CONTEXT__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__NAME = ASSERTED_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_ABSTRACT = ASSERTED_CONTEXT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__DESCRIPTION = ASSERTED_CONTEXT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__INPLEMENTATION_CONSTRAINT = ASSERTED_CONTEXT__INPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__UNINSTANTIATED = ASSERTED_CONTEXT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__CONTENT = ASSERTED_CONTEXT__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__SOURCE = ASSERTED_CONTEXT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__TARGET = ASSERTED_CONTEXT__TARGET;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__REQUIRES = ASSERTED_CONTEXT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__MANY = ASSERTED_CONTEXT__MANY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__OPTIONAL = ASSERTED_CONTEXT__OPTIONAL;

	/**
	 * The number of structural features of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_FEATURE_COUNT = ASSERTED_CONTEXT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ArgumentationElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see GSN.Argumentation.ArgumentationElement
	 * @generated
	 */
	EClass getArgumentationElement();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.ArgumentationElement#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see GSN.Argumentation.ArgumentationElement#getContent()
	 * @see #getArgumentationElement()
	 * @generated
	 */
	EAttribute getArgumentationElement_Content();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package</em>'.
	 * @see GSN.Argumentation.ArgumentPackage
	 * @generated
	 */
	EClass getArgumentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Argumentation.ArgumentPackage#getArgumentAsset <em>Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Asset</em>'.
	 * @see GSN.Argumentation.ArgumentPackage#getArgumentAsset()
	 * @see #getArgumentPackage()
	 * @generated
	 */
	EReference getArgumentPackage_ArgumentAsset();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Argumentation.ArgumentPackage#getArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Package</em>'.
	 * @see GSN.Argumentation.ArgumentPackage#getArgumentPackage()
	 * @see #getArgumentPackage()
	 * @generated
	 */
	EReference getArgumentPackage_ArgumentPackage();

	/**
	 * Returns the meta object for the reference list '{@link GSN.Argumentation.ArgumentPackage#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface</em>'.
	 * @see GSN.Argumentation.ArgumentPackage#getInterface()
	 * @see #getArgumentPackage()
	 * @generated
	 */
	EReference getArgumentPackage_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Argumentation.ArgumentPackage#getArgumentPackageCitation <em>Argument Package Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Package Citation</em>'.
	 * @see GSN.Argumentation.ArgumentPackage#getArgumentPackageCitation()
	 * @see #getArgumentPackage()
	 * @generated
	 */
	EReference getArgumentPackage_ArgumentPackageCitation();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see GSN.Argumentation.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Argumentation.Module#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see GSN.Argumentation.Module#getModule()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Module();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ArgumentPackageCitation <em>Argument Package Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package Citation</em>'.
	 * @see GSN.Argumentation.ArgumentPackageCitation
	 * @generated
	 */
	EClass getArgumentPackageCitation();

	/**
	 * Returns the meta object for the reference '{@link GSN.Argumentation.ArgumentPackageCitation#getCitedPackage <em>Cited Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cited Package</em>'.
	 * @see GSN.Argumentation.ArgumentPackageCitation#getCitedPackage()
	 * @see #getArgumentPackageCitation()
	 * @generated
	 */
	EReference getArgumentPackageCitation_CitedPackage();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ArgumentPackageBinding <em>Argument Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package Binding</em>'.
	 * @see GSN.Argumentation.ArgumentPackageBinding
	 * @generated
	 */
	EClass getArgumentPackageBinding();

	/**
	 * Returns the meta object for the reference list '{@link GSN.Argumentation.ArgumentPackageBinding#getParticipantPackage <em>Participant Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Package</em>'.
	 * @see GSN.Argumentation.ArgumentPackageBinding#getParticipantPackage()
	 * @see #getArgumentPackageBinding()
	 * @generated
	 */
	EReference getArgumentPackageBinding_ParticipantPackage();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see GSN.Argumentation.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ArgumentPackageInterface <em>Argument Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package Interface</em>'.
	 * @see GSN.Argumentation.ArgumentPackageInterface
	 * @generated
	 */
	EClass getArgumentPackageInterface();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ArgumentAsset <em>Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Asset</em>'.
	 * @see GSN.Argumentation.ArgumentAsset
	 * @generated
	 */
	EClass getArgumentAsset();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see GSN.Argumentation.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ArtefactElementCitation <em>Artefact Element Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact Element Citation</em>'.
	 * @see GSN.Argumentation.ArtefactElementCitation
	 * @generated
	 */
	EClass getArtefactElementCitation();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.ArtefactElementCitation#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Reference</em>'.
	 * @see GSN.Argumentation.ArtefactElementCitation#getExternalReference()
	 * @see #getArtefactElementCitation()
	 * @generated
	 */
	EAttribute getArtefactElementCitation_ExternalReference();

	/**
	 * Returns the meta object for the reference '{@link GSN.Argumentation.ArtefactElementCitation#getCitedArtefact <em>Cited Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cited Artefact</em>'.
	 * @see GSN.Argumentation.ArtefactElementCitation#getCitedArtefact()
	 * @see #getArtefactElementCitation()
	 * @generated
	 */
	EReference getArtefactElementCitation_CitedArtefact();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see GSN.Argumentation.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.Solution#getIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see GSN.Argumentation.Solution#getIsPublic()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_IsPublic();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ArgumentAssetCitation <em>Argument Asset Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Asset Citation</em>'.
	 * @see GSN.Argumentation.ArgumentAssetCitation
	 * @generated
	 */
	EClass getArgumentAssetCitation();

	/**
	 * Returns the meta object for the reference '{@link GSN.Argumentation.ArgumentAssetCitation#getCitedAsset <em>Cited Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cited Asset</em>'.
	 * @see GSN.Argumentation.ArgumentAssetCitation#getCitedAsset()
	 * @see #getArgumentAssetCitation()
	 * @generated
	 */
	EReference getArgumentAssetCitation_CitedAsset();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Goal</em>'.
	 * @see GSN.Argumentation.AwayGoal
	 * @generated
	 */
	EClass getAwayGoal();

	/**
	 * Returns the meta object for the reference '{@link GSN.Argumentation.AwayGoal#getAwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Away Goal</em>'.
	 * @see GSN.Argumentation.AwayGoal#getAwayGoal()
	 * @see #getAwayGoal()
	 * @generated
	 */
	EReference getAwayGoal_AwayGoal();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.AwayGoal#getModuleIdentifier <em>Module Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier</em>'.
	 * @see GSN.Argumentation.AwayGoal#getModuleIdentifier()
	 * @see #getAwayGoal()
	 * @generated
	 */
	EAttribute getAwayGoal_ModuleIdentifier();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Solution</em>'.
	 * @see GSN.Argumentation.AwaySolution
	 * @generated
	 */
	EClass getAwaySolution();

	/**
	 * Returns the meta object for the reference '{@link GSN.Argumentation.AwaySolution#getAwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Away Solution</em>'.
	 * @see GSN.Argumentation.AwaySolution#getAwaySolution()
	 * @see #getAwaySolution()
	 * @generated
	 */
	EReference getAwaySolution_AwaySolution();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.AwaySolution#getModuleIdentifier <em>Module Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier</em>'.
	 * @see GSN.Argumentation.AwaySolution#getModuleIdentifier()
	 * @see #getAwaySolution()
	 * @generated
	 */
	EAttribute getAwaySolution_ModuleIdentifier();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Context</em>'.
	 * @see GSN.Argumentation.AwayContext
	 * @generated
	 */
	EClass getAwayContext();

	/**
	 * Returns the meta object for the reference '{@link GSN.Argumentation.AwayContext#getAwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Away Context</em>'.
	 * @see GSN.Argumentation.AwayContext#getAwayContext()
	 * @see #getAwayContext()
	 * @generated
	 */
	EReference getAwayContext_AwayContext();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.AwayContext#getModuleIdentifier <em>Module Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Identifier</em>'.
	 * @see GSN.Argumentation.AwayContext#getModuleIdentifier()
	 * @see #getAwayContext()
	 * @generated
	 */
	EAttribute getAwayContext_ModuleIdentifier();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ModuleReference <em>Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Reference</em>'.
	 * @see GSN.Argumentation.ModuleReference
	 * @generated
	 */
	EClass getModuleReference();

	/**
	 * Returns the meta object for the reference '{@link GSN.Argumentation.ModuleReference#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see GSN.Argumentation.ModuleReference#getModule()
	 * @see #getModuleReference()
	 * @generated
	 */
	EReference getModuleReference_Module();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see GSN.Argumentation.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.Claim#getAssumed <em>Assumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assumed</em>'.
	 * @see GSN.Argumentation.Claim#getAssumed()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_Assumed();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see GSN.Argumentation.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the containment reference '{@link GSN.Argumentation.Goal#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roles</em>'.
	 * @see GSN.Argumentation.Goal#getRoles()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Roles();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.Goal#getIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see GSN.Argumentation.Goal#getIsPublic()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.Goal#getUndeveloped <em>Undeveloped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undeveloped</em>'.
	 * @see GSN.Argumentation.Goal#getUndeveloped()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Undeveloped();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.Goal#getToBeSupportedByContract <em>To Be Supported By Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Supported By Contract</em>'.
	 * @see GSN.Argumentation.Goal#getToBeSupportedByContract()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_ToBeSupportedByContract();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see GSN.Argumentation.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see GSN.Argumentation.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Reasoning</em>'.
	 * @see GSN.Argumentation.ArgumentReasoning
	 * @generated
	 */
	EClass getArgumentReasoning();

	/**
	 * Returns the meta object for the reference '{@link GSN.Argumentation.ArgumentReasoning#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure</em>'.
	 * @see GSN.Argumentation.ArgumentReasoning#getStructure()
	 * @see #getArgumentReasoning()
	 * @generated
	 */
	EReference getArgumentReasoning_Structure();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see GSN.Argumentation.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.Strategy#getUndeveloped <em>Undeveloped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undeveloped</em>'.
	 * @see GSN.Argumentation.Strategy#getUndeveloped()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Undeveloped();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see GSN.Argumentation.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.Context#getIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see GSN.Argumentation.Context#getIsPublic()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.Context#getRefersToExternalMaterial <em>Refers To External Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refers To External Material</em>'.
	 * @see GSN.Argumentation.Context#getRefersToExternalMaterial()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_RefersToExternalMaterial();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.AssertedRelationship <em>Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Relationship</em>'.
	 * @see GSN.Argumentation.AssertedRelationship
	 * @generated
	 */
	EClass getAssertedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link GSN.Argumentation.AssertedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see GSN.Argumentation.AssertedRelationship#getSource()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link GSN.Argumentation.AssertedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see GSN.Argumentation.AssertedRelationship#getTarget()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.AssertedRelationship#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires</em>'.
	 * @see GSN.Argumentation.AssertedRelationship#getRequires()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EAttribute getAssertedRelationship_Requires();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.AssertedRelationship#getMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see GSN.Argumentation.AssertedRelationship#getMany()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EAttribute getAssertedRelationship_Many();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Argumentation.AssertedRelationship#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see GSN.Argumentation.AssertedRelationship#getOptional()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EAttribute getAssertedRelationship_Optional();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Inference</em>'.
	 * @see GSN.Argumentation.AssertedInference
	 * @generated
	 */
	EClass getAssertedInference();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported By</em>'.
	 * @see GSN.Argumentation.SupportedBy
	 * @generated
	 */
	EClass getSupportedBy();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.AssertedEvidence <em>Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Evidence</em>'.
	 * @see GSN.Argumentation.AssertedEvidence
	 * @generated
	 */
	EClass getAssertedEvidence();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.AssertedChallenge <em>Asserted Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Challenge</em>'.
	 * @see GSN.Argumentation.AssertedChallenge
	 * @generated
	 */
	EClass getAssertedChallenge();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.AssertedCounterEvidence <em>Asserted Counter Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Counter Evidence</em>'.
	 * @see GSN.Argumentation.AssertedCounterEvidence
	 * @generated
	 */
	EClass getAssertedCounterEvidence();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Context</em>'.
	 * @see GSN.Argumentation.AssertedContext
	 * @generated
	 */
	EClass getAssertedContext();

	/**
	 * Returns the meta object for class '{@link GSN.Argumentation.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of</em>'.
	 * @see GSN.Argumentation.InContextOf
	 * @generated
	 */
	EClass getInContextOf();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArgumentationFactory getArgumentationFactory();

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
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ArgumentationElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ArgumentationElementImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentationElement()
		 * @generated
		 */
		EClass ARGUMENTATION_ELEMENT = eINSTANCE.getArgumentationElement();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENTATION_ELEMENT__CONTENT = eINSTANCE.getArgumentationElement_Content();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ArgumentPackageImpl <em>Argument Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ArgumentPackageImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentPackage()
		 * @generated
		 */
		EClass ARGUMENT_PACKAGE = eINSTANCE.getArgumentPackage();

		/**
		 * The meta object literal for the '<em><b>Argument Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_PACKAGE__ARGUMENT_ASSET = eINSTANCE.getArgumentPackage_ArgumentAsset();

		/**
		 * The meta object literal for the '<em><b>Argument Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_PACKAGE__ARGUMENT_PACKAGE = eINSTANCE.getArgumentPackage_ArgumentPackage();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_PACKAGE__INTERFACE = eINSTANCE.getArgumentPackage_Interface();

		/**
		 * The meta object literal for the '<em><b>Argument Package Citation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_PACKAGE__ARGUMENT_PACKAGE_CITATION = eINSTANCE.getArgumentPackage_ArgumentPackageCitation();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ModuleImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE = eINSTANCE.getModule_Module();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ArgumentPackageCitationImpl <em>Argument Package Citation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ArgumentPackageCitationImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentPackageCitation()
		 * @generated
		 */
		EClass ARGUMENT_PACKAGE_CITATION = eINSTANCE.getArgumentPackageCitation();

		/**
		 * The meta object literal for the '<em><b>Cited Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_PACKAGE_CITATION__CITED_PACKAGE = eINSTANCE.getArgumentPackageCitation_CitedPackage();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ArgumentPackageBindingImpl <em>Argument Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ArgumentPackageBindingImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentPackageBinding()
		 * @generated
		 */
		EClass ARGUMENT_PACKAGE_BINDING = eINSTANCE.getArgumentPackageBinding();

		/**
		 * The meta object literal for the '<em><b>Participant Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = eINSTANCE.getArgumentPackageBinding_ParticipantPackage();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ContractImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ArgumentPackageInterfaceImpl <em>Argument Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ArgumentPackageInterfaceImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentPackageInterface()
		 * @generated
		 */
		EClass ARGUMENT_PACKAGE_INTERFACE = eINSTANCE.getArgumentPackageInterface();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ArgumentAssetImpl <em>Argument Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ArgumentAssetImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentAsset()
		 * @generated
		 */
		EClass ARGUMENT_ASSET = eINSTANCE.getArgumentAsset();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AssertionImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ArtefactElementCitationImpl <em>Artefact Element Citation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ArtefactElementCitationImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArtefactElementCitation()
		 * @generated
		 */
		EClass ARTEFACT_ELEMENT_CITATION = eINSTANCE.getArtefactElementCitation();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT_ELEMENT_CITATION__EXTERNAL_REFERENCE = eINSTANCE.getArtefactElementCitation_ExternalReference();

		/**
		 * The meta object literal for the '<em><b>Cited Artefact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTEFACT_ELEMENT_CITATION__CITED_ARTEFACT = eINSTANCE.getArtefactElementCitation_CitedArtefact();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.SolutionImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__IS_PUBLIC = eINSTANCE.getSolution_IsPublic();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ArgumentAssetCitationImpl <em>Argument Asset Citation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ArgumentAssetCitationImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentAssetCitation()
		 * @generated
		 */
		EClass ARGUMENT_ASSET_CITATION = eINSTANCE.getArgumentAssetCitation();

		/**
		 * The meta object literal for the '<em><b>Cited Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_ASSET_CITATION__CITED_ASSET = eINSTANCE.getArgumentAssetCitation_CitedAsset();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AwayGoalImpl <em>Away Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AwayGoalImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAwayGoal()
		 * @generated
		 */
		EClass AWAY_GOAL = eINSTANCE.getAwayGoal();

		/**
		 * The meta object literal for the '<em><b>Away Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_GOAL__AWAY_GOAL = eINSTANCE.getAwayGoal_AwayGoal();

		/**
		 * The meta object literal for the '<em><b>Module Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_GOAL__MODULE_IDENTIFIER = eINSTANCE.getAwayGoal_ModuleIdentifier();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AwaySolutionImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAwaySolution()
		 * @generated
		 */
		EClass AWAY_SOLUTION = eINSTANCE.getAwaySolution();

		/**
		 * The meta object literal for the '<em><b>Away Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_SOLUTION__AWAY_SOLUTION = eINSTANCE.getAwaySolution_AwaySolution();

		/**
		 * The meta object literal for the '<em><b>Module Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_SOLUTION__MODULE_IDENTIFIER = eINSTANCE.getAwaySolution_ModuleIdentifier();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AwayContextImpl <em>Away Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AwayContextImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAwayContext()
		 * @generated
		 */
		EClass AWAY_CONTEXT = eINSTANCE.getAwayContext();

		/**
		 * The meta object literal for the '<em><b>Away Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_CONTEXT__AWAY_CONTEXT = eINSTANCE.getAwayContext_AwayContext();

		/**
		 * The meta object literal for the '<em><b>Module Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_CONTEXT__MODULE_IDENTIFIER = eINSTANCE.getAwayContext_ModuleIdentifier();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ModuleReferenceImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getModuleReference()
		 * @generated
		 */
		EClass MODULE_REFERENCE = eINSTANCE.getModuleReference();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_REFERENCE__MODULE = eINSTANCE.getModuleReference_Module();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ClaimImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '<em><b>Assumed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__ASSUMED = eINSTANCE.getClaim_Assumed();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.GoalImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ROLES = eINSTANCE.getGoal_Roles();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__IS_PUBLIC = eINSTANCE.getGoal_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Undeveloped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__UNDEVELOPED = eINSTANCE.getGoal_Undeveloped();

		/**
		 * The meta object literal for the '<em><b>To Be Supported By Contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__TO_BE_SUPPORTED_BY_CONTRACT = eINSTANCE.getGoal_ToBeSupportedByContract();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.JustificationImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AssumptionImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ArgumentReasoningImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getArgumentReasoning()
		 * @generated
		 */
		EClass ARGUMENT_REASONING = eINSTANCE.getArgumentReasoning();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_REASONING__STRUCTURE = eINSTANCE.getArgumentReasoning_Structure();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.StrategyImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Undeveloped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__UNDEVELOPED = eINSTANCE.getStrategy_Undeveloped();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.ContextImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__IS_PUBLIC = eINSTANCE.getContext_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Refers To External Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__REFERS_TO_EXTERNAL_MATERIAL = eINSTANCE.getContext_RefersToExternalMaterial();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AssertedRelationshipImpl <em>Asserted Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AssertedRelationshipImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedRelationship()
		 * @generated
		 */
		EClass ASSERTED_RELATIONSHIP = eINSTANCE.getAssertedRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTED_RELATIONSHIP__SOURCE = eINSTANCE.getAssertedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTED_RELATIONSHIP__TARGET = eINSTANCE.getAssertedRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTED_RELATIONSHIP__REQUIRES = eINSTANCE.getAssertedRelationship_Requires();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTED_RELATIONSHIP__MANY = eINSTANCE.getAssertedRelationship_Many();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTED_RELATIONSHIP__OPTIONAL = eINSTANCE.getAssertedRelationship_Optional();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AssertedInferenceImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedInference()
		 * @generated
		 */
		EClass ASSERTED_INFERENCE = eINSTANCE.getAssertedInference();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.SupportedByImpl <em>Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.SupportedByImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getSupportedBy()
		 * @generated
		 */
		EClass SUPPORTED_BY = eINSTANCE.getSupportedBy();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AssertedEvidenceImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedEvidence()
		 * @generated
		 */
		EClass ASSERTED_EVIDENCE = eINSTANCE.getAssertedEvidence();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AssertedChallengeImpl <em>Asserted Challenge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AssertedChallengeImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedChallenge()
		 * @generated
		 */
		EClass ASSERTED_CHALLENGE = eINSTANCE.getAssertedChallenge();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AssertedCounterEvidenceImpl <em>Asserted Counter Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AssertedCounterEvidenceImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedCounterEvidence()
		 * @generated
		 */
		EClass ASSERTED_COUNTER_EVIDENCE = eINSTANCE.getAssertedCounterEvidence();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.AssertedContextImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getAssertedContext()
		 * @generated
		 */
		EClass ASSERTED_CONTEXT = eINSTANCE.getAssertedContext();

		/**
		 * The meta object literal for the '{@link GSN.Argumentation.impl.InContextOfImpl <em>In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Argumentation.impl.InContextOfImpl
		 * @see GSN.Argumentation.impl.ArgumentationPackageImpl#getInContextOf()
		 * @generated
		 */
		EClass IN_CONTEXT_OF = eINSTANCE.getInContextOf();

	}

} //ArgumentationPackage
