/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.Interval#getStr <em>Str</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends EObject {
	/**
	 * Returns the value of the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str</em>' attribute.
	 * @see #setStr(String)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getInterval_Str()
	 * @model required="true"
	 * @generated
	 */
	String getStr();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.Interval#getStr <em>Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str</em>' attribute.
	 * @see #getStr()
	 * @generated
	 */
	void setStr(String value);

} // Interval
