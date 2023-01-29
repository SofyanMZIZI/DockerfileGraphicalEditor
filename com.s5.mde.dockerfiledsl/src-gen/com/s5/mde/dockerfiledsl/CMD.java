/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.CMD#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getCMD()
 * @model
 * @generated
 */
public interface CMD extends Instruction {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(Command)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getCMD_Command()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.CMD#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

} // CMD
