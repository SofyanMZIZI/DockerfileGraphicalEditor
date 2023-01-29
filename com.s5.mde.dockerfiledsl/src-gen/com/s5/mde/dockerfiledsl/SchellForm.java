/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schell Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.SchellForm#getExecutable <em>Executable</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.SchellForm#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSchellForm()
 * @model
 * @generated
 */
public interface SchellForm extends Command {
	/**
	 * Returns the value of the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' attribute.
	 * @see #setExecutable(String)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSchellForm_Executable()
	 * @model
	 * @generated
	 */
	String getExecutable();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.SchellForm#getExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' attribute.
	 * @see #getExecutable()
	 * @generated
	 */
	void setExecutable(String value);

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' attribute.
	 * @see #setCmd(String)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSchellForm_Cmd()
	 * @model required="true"
	 * @generated
	 */
	String getCmd();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.SchellForm#getCmd <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' attribute.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(String value);

} // SchellForm
