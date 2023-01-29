/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.Main#getDockerfile <em>Dockerfile</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject {

	/**
	 * Returns the value of the '<em><b>Dockerfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dockerfile</em>' containment reference.
	 * @see #setDockerfile(Dockerfile)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getMain_Dockerfile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dockerfile getDockerfile();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.Main#getDockerfile <em>Dockerfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dockerfile</em>' containment reference.
	 * @see #getDockerfile()
	 * @generated
	 */
	void setDockerfile(Dockerfile value);
} // Main
