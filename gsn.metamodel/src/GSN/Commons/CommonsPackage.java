/**
 */
package GSN.Commons;

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
 * @see GSN.Commons.CommonsFactory
 * @model kind="package"
 * @generated
 */
public interface CommonsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Commons";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.goalstructuringnotation.info/1.0/commons";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GSN_Commons";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonsPackage eINSTANCE = GSN.Commons.impl.CommonsPackageImpl.init();

	/**
	 * The meta object id for the '{@link GSN.Commons.impl.SACMElementImpl <em>SACM Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Commons.impl.SACMElementImpl
	 * @see GSN.Commons.impl.CommonsPackageImpl#getSACMElement()
	 * @generated
	 */
	int SACM_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>SACM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link GSN.Commons.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Commons.impl.ModelElementImpl
	 * @see GSN.Commons.impl.CommonsPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__GID = SACM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = SACM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_ABSTRACT = SACM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = SACM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inplementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__INPLEMENTATION_CONSTRAINT = SACM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__UNINSTANTIATED = SACM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = SACM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link GSN.Commons.impl.UtilityElementImpl <em>Utility Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Commons.impl.UtilityElementImpl
	 * @see GSN.Commons.impl.CommonsPackageImpl#getUtilityElement()
	 * @generated
	 */
	int UTILITY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>SExpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT__SEXPRESSION = SACM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT__EXPRESSION = SACM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Utility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT_FEATURE_COUNT = SACM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GSN.Commons.impl.ImplementationConstraintImpl <em>Implementation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Commons.impl.ImplementationConstraintImpl
	 * @see GSN.Commons.impl.CommonsPackageImpl#getImplementationConstraint()
	 * @generated
	 */
	int IMPLEMENTATION_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>SExpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT__SEXPRESSION = UTILITY_ELEMENT__SEXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT__EXPRESSION = UTILITY_ELEMENT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Implementation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_CONSTRAINT_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Commons.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Commons.impl.DescriptionImpl
	 * @see GSN.Commons.impl.CommonsPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>SExpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__SEXPRESSION = UTILITY_ELEMENT__SEXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__EXPRESSION = UTILITY_ELEMENT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Commons.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Commons.impl.NoteImpl
	 * @see GSN.Commons.impl.CommonsPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 5;

	/**
	 * The feature id for the '<em><b>SExpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__SEXPRESSION = UTILITY_ELEMENT__SEXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__EXPRESSION = UTILITY_ELEMENT__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN.Commons.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN.Commons.impl.TaggedValueImpl
	 * @see GSN.Commons.impl.CommonsPackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 6;

	/**
	 * The feature id for the '<em><b>SExpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__SEXPRESSION = UTILITY_ELEMENT__SEXPRESSION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__EXPRESSION = UTILITY_ELEMENT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>SKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__SKEY = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__KEY = UTILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link GSN.Commons.SACMElement <em>SACM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SACM Element</em>'.
	 * @see GSN.Commons.SACMElement
	 * @generated
	 */
	EClass getSACMElement();

	/**
	 * Returns the meta object for class '{@link GSN.Commons.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see GSN.Commons.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Commons.ModelElement#getGid <em>Gid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gid</em>'.
	 * @see GSN.Commons.ModelElement#getGid()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Gid();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Commons.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GSN.Commons.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Commons.ModelElement#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see GSN.Commons.ModelElement#getIsAbstract()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_IsAbstract();

	/**
	 * Returns the meta object for the containment reference '{@link GSN.Commons.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see GSN.Commons.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN.Commons.ModelElement#getInplementationConstraint <em>Inplementation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inplementation Constraint</em>'.
	 * @see GSN.Commons.ModelElement#getInplementationConstraint()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_InplementationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Commons.ModelElement#getUninstantiated <em>Uninstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uninstantiated</em>'.
	 * @see GSN.Commons.ModelElement#getUninstantiated()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Uninstantiated();

	/**
	 * Returns the meta object for class '{@link GSN.Commons.UtilityElement <em>Utility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utility Element</em>'.
	 * @see GSN.Commons.UtilityElement
	 * @generated
	 */
	EClass getUtilityElement();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Commons.UtilityElement#getSExpression <em>SExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SExpression</em>'.
	 * @see GSN.Commons.UtilityElement#getSExpression()
	 * @see #getUtilityElement()
	 * @generated
	 */
	EAttribute getUtilityElement_SExpression();

	/**
	 * Returns the meta object for the containment reference '{@link GSN.Commons.UtilityElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see GSN.Commons.UtilityElement#getExpression()
	 * @see #getUtilityElement()
	 * @generated
	 */
	EReference getUtilityElement_Expression();

	/**
	 * Returns the meta object for class '{@link GSN.Commons.ImplementationConstraint <em>Implementation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Constraint</em>'.
	 * @see GSN.Commons.ImplementationConstraint
	 * @generated
	 */
	EClass getImplementationConstraint();

	/**
	 * Returns the meta object for class '{@link GSN.Commons.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see GSN.Commons.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link GSN.Commons.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see GSN.Commons.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for class '{@link GSN.Commons.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see GSN.Commons.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link GSN.Commons.TaggedValue#getSKey <em>SKey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SKey</em>'.
	 * @see GSN.Commons.TaggedValue#getSKey()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_SKey();

	/**
	 * Returns the meta object for the containment reference '{@link GSN.Commons.TaggedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see GSN.Commons.TaggedValue#getKey()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EReference getTaggedValue_Key();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonsFactory getCommonsFactory();

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
		 * The meta object literal for the '{@link GSN.Commons.impl.SACMElementImpl <em>SACM Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Commons.impl.SACMElementImpl
		 * @see GSN.Commons.impl.CommonsPackageImpl#getSACMElement()
		 * @generated
		 */
		EClass SACM_ELEMENT = eINSTANCE.getSACMElement();

		/**
		 * The meta object literal for the '{@link GSN.Commons.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Commons.impl.ModelElementImpl
		 * @see GSN.Commons.impl.CommonsPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__GID = eINSTANCE.getModelElement_Gid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__IS_ABSTRACT = eINSTANCE.getModelElement_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Inplementation Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__INPLEMENTATION_CONSTRAINT = eINSTANCE.getModelElement_InplementationConstraint();

		/**
		 * The meta object literal for the '<em><b>Uninstantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__UNINSTANTIATED = eINSTANCE.getModelElement_Uninstantiated();

		/**
		 * The meta object literal for the '{@link GSN.Commons.impl.UtilityElementImpl <em>Utility Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Commons.impl.UtilityElementImpl
		 * @see GSN.Commons.impl.CommonsPackageImpl#getUtilityElement()
		 * @generated
		 */
		EClass UTILITY_ELEMENT = eINSTANCE.getUtilityElement();

		/**
		 * The meta object literal for the '<em><b>SExpression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILITY_ELEMENT__SEXPRESSION = eINSTANCE.getUtilityElement_SExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILITY_ELEMENT__EXPRESSION = eINSTANCE.getUtilityElement_Expression();

		/**
		 * The meta object literal for the '{@link GSN.Commons.impl.ImplementationConstraintImpl <em>Implementation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Commons.impl.ImplementationConstraintImpl
		 * @see GSN.Commons.impl.CommonsPackageImpl#getImplementationConstraint()
		 * @generated
		 */
		EClass IMPLEMENTATION_CONSTRAINT = eINSTANCE.getImplementationConstraint();

		/**
		 * The meta object literal for the '{@link GSN.Commons.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Commons.impl.DescriptionImpl
		 * @see GSN.Commons.impl.CommonsPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link GSN.Commons.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Commons.impl.NoteImpl
		 * @see GSN.Commons.impl.CommonsPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '{@link GSN.Commons.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN.Commons.impl.TaggedValueImpl
		 * @see GSN.Commons.impl.CommonsPackageImpl#getTaggedValue()
		 * @generated
		 */
		EClass TAGGED_VALUE = eINSTANCE.getTaggedValue();

		/**
		 * The meta object literal for the '<em><b>SKey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__SKEY = eINSTANCE.getTaggedValue_SKey();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGGED_VALUE__KEY = eINSTANCE.getTaggedValue_Key();

	}

} //CommonsPackage
