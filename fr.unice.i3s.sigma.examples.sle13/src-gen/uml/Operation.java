/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Operation#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UMLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Feature
{
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Classifier)
	 * @see uml.UMLPackage#getOperation_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	Classifier getReturnType();

	/**
	 * Sets the value of the '{@link uml.Operation#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Classifier value);

} // Operation