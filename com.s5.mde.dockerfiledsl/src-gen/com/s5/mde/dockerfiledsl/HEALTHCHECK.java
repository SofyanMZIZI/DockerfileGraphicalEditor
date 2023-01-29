/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HEALTHCHECK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.HEALTHCHECK#getOption <em>Option</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.HEALTHCHECK#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getHEALTHCHECK()
 * @model
 * @generated
 */
public interface HEALTHCHECK extends Instruction {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference.
	 * @see #setOption(Option)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getHEALTHCHECK_Option()
	 * @model containment="true"
	 * @generated
	 */
	Option getOption();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.HEALTHCHECK#getOption <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' containment reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Option value);

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' containment reference.
	 * @see #setCmd(CMD)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getHEALTHCHECK_Cmd()
	 * @model containment="true"
	 * @generated
	 */
	CMD getCmd();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.HEALTHCHECK#getCmd <em>Cmd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' containment reference.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(CMD value);

} // HEALTHCHECK
