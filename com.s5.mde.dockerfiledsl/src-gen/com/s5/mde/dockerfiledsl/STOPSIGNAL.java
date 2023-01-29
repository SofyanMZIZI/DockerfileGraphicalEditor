/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STOPSIGNAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.STOPSIGNAL#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSTOPSIGNAL()
 * @model
 * @generated
 */
public interface STOPSIGNAL extends Instruction {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference.
	 * @see #setSignal(Signal)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSTOPSIGNAL_Signal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.STOPSIGNAL#getSignal <em>Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' containment reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // STOPSIGNAL
