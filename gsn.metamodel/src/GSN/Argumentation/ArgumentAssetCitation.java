/**
 */
package GSN.Argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Asset Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GSN.Argumentation.ArgumentAssetCitation#getCitedAsset <em>Cited Asset</em>}</li>
 * </ul>
 *
 * @see GSN.Argumentation.ArgumentationPackage#getArgumentAssetCitation()
 * @model abstract="true"
 * @generated
 */
public interface ArgumentAssetCitation extends ArgumentAsset {
	/**
	 * Returns the value of the '<em><b>Cited Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Asset</em>' reference.
	 * @see #setCitedAsset(ArgumentAsset)
	 * @see GSN.Argumentation.ArgumentationPackage#getArgumentAssetCitation_CitedAsset()
	 * @model required="true"
	 * @generated
	 */
	ArgumentAsset getCitedAsset();

	/**
	 * Sets the value of the '{@link GSN.Argumentation.ArgumentAssetCitation#getCitedAsset <em>Cited Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Asset</em>' reference.
	 * @see #getCitedAsset()
	 * @generated
	 */
	void setCitedAsset(ArgumentAsset value);

} // ArgumentAssetCitation
