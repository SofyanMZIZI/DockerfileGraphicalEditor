/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.Signal#getSig <em>Sig</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends EObject {
	/**
	 * Returns the value of the '<em><b>Sig</b></em>' attribute.
	 * The literals are from the enumeration {@link com.s5.mde.dockerfiledsl.Signals}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sig</em>' attribute.
	 * @see com.s5.mde.dockerfiledsl.Signals
	 * @see #setSig(Signals)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getSignal_Sig()
	 * @model required="true"
	 * @generated
	 */
	Signals getSig();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.Signal#getSig <em>Sig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig</em>' attribute.
	 * @see com.s5.mde.dockerfiledsl.Signals
	 * @see #getSig()
	 * @generated
	 */
	void setSig(Signals value);

} // Signal
