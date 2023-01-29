/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WORKDIR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.WORKDIR#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getWORKDIR()
 * @model
 * @generated
 */
public interface WORKDIR extends Instruction {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Path)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getWORKDIR_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.WORKDIR#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

} // WORKDIR
