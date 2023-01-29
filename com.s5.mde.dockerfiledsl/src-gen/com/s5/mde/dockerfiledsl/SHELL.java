/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SHELL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.SHELL#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSHELL()
 * @model
 * @generated
 */
public interface SHELL extends Instruction {
	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' containment reference.
	 * @see #setCmd(ExecForm)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSHELL_Cmd()
	 * @model containment="true"
	 * @generated
	 */
	ExecForm getCmd();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.SHELL#getCmd <em>Cmd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' containment reference.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(ExecForm value);

} // SHELL
