/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.ARG#getName <em>Name</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.ARG#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getARG()
 * @model
 * @generated
 */
public interface ARG extends Instruction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getARG_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.ARG#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getARG_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.ARG#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // ARG
