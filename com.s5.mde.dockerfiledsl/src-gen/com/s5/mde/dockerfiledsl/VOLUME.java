/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VOLUME</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.VOLUME#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getVOLUME()
 * @model
 * @generated
 */
public interface VOLUME extends Instruction {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link com.s5.mde.dockerfiledsl.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getVOLUME_Data()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Data> getData();

} // VOLUME
