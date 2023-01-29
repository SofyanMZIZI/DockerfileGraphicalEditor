/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.ExecForm#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getExecForm()
 * @model
 * @generated
 */
public interface ExecForm extends Command {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getExecForm_Args()
	 * @model lower="2"
	 * @generated
	 */
	EList<String> getArgs();

} // ExecForm
