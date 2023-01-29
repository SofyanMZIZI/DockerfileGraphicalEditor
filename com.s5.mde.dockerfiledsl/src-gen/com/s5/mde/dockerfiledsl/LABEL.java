/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LABEL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.LABEL#getKeyvalues <em>Keyvalues</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getLABEL()
 * @model
 * @generated
 */
public interface LABEL extends Instruction {
	/**
	 * Returns the value of the '<em><b>Keyvalues</b></em>' containment reference list.
	 * The list contents are of type {@link com.s5.mde.dockerfiledsl.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyvalues</em>' containment reference list.
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getLABEL_Keyvalues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<KeyValue> getKeyvalues();

} // LABEL
