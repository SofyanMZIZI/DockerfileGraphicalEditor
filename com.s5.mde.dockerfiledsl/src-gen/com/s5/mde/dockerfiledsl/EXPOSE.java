/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EXPOSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.EXPOSE#getPort <em>Port</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.EXPOSE#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getEXPOSE()
 * @model
 * @generated
 */
public interface EXPOSE extends Instruction {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(Port)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getEXPOSE_Port()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.EXPOSE#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(Protocol)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getEXPOSE_Protocol()
	 * @model containment="true"
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.EXPOSE#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

} // EXPOSE
