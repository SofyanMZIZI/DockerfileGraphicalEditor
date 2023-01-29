/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.KeyValue#getKey <em>Key</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.KeyValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getKeyValue()
 * @model
 * @generated
 */
public interface KeyValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Key)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getKeyValue_Key()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.KeyValue#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getKeyValue_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.KeyValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // KeyValue
