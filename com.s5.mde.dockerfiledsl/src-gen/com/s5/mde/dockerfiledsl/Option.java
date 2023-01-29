/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.Option#getInterval <em>Interval</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.Option#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.Option#getStartperiod <em>Startperiod</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.Option#getRetries <em>Retries</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference.
	 * @see #setInterval(Interval)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getOption_Interval()
	 * @model containment="true"
	 * @generated
	 */
	Interval getInterval();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.Option#getInterval <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' containment reference.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(Interval value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' containment reference.
	 * @see #setTimeout(Timeout)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getOption_Timeout()
	 * @model containment="true"
	 * @generated
	 */
	Timeout getTimeout();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.Option#getTimeout <em>Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' containment reference.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(Timeout value);

	/**
	 * Returns the value of the '<em><b>Startperiod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startperiod</em>' containment reference.
	 * @see #setStartperiod(StartPeriod)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getOption_Startperiod()
	 * @model containment="true"
	 * @generated
	 */
	StartPeriod getStartperiod();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.Option#getStartperiod <em>Startperiod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startperiod</em>' containment reference.
	 * @see #getStartperiod()
	 * @generated
	 */
	void setStartperiod(StartPeriod value);

	/**
	 * Returns the value of the '<em><b>Retries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retries</em>' containment reference.
	 * @see #setRetries(Retries)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getOption_Retries()
	 * @model containment="true"
	 * @generated
	 */
	Retries getRetries();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.Option#getRetries <em>Retries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retries</em>' containment reference.
	 * @see #getRetries()
	 * @generated
	 */
	void setRetries(Retries value);

} // Option
