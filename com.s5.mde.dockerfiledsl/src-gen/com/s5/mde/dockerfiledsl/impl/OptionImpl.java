/**
 */
package com.s5.mde.dockerfiledsl.impl;

import com.s5.mde.dockerfiledsl.DockerfiledslPackage;
import com.s5.mde.dockerfiledsl.Interval;
import com.s5.mde.dockerfiledsl.Option;
import com.s5.mde.dockerfiledsl.Retries;
import com.s5.mde.dockerfiledsl.StartPeriod;
import com.s5.mde.dockerfiledsl.Timeout;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.OptionImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.OptionImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.OptionImpl#getStartperiod <em>Startperiod</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.OptionImpl#getRetries <em>Retries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends MinimalEObjectImpl.Container implements Option {
	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected Interval interval;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected Timeout timeout;

	/**
	 * The cached value of the '{@link #getStartperiod() <em>Startperiod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartperiod()
	 * @generated
	 * @ordered
	 */
	protected StartPeriod startperiod;

	/**
	 * The cached value of the '{@link #getRetries() <em>Retries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected Retries retries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerfiledslPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterval(Interval newInterval, NotificationChain msgs) {
		Interval oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.OPTION__INTERVAL, oldInterval, newInterval);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(Interval newInterval) {
		if (newInterval != interval) {
			NotificationChain msgs = null;
			if (interval != null)
				msgs = ((InternalEObject) interval).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.OPTION__INTERVAL, null, msgs);
			if (newInterval != null)
				msgs = ((InternalEObject) newInterval).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.OPTION__INTERVAL, null, msgs);
			msgs = basicSetInterval(newInterval, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.OPTION__INTERVAL, newInterval,
					newInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timeout getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeout(Timeout newTimeout, NotificationChain msgs) {
		Timeout oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.OPTION__TIMEOUT, oldTimeout, newTimeout);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(Timeout newTimeout) {
		if (newTimeout != timeout) {
			NotificationChain msgs = null;
			if (timeout != null)
				msgs = ((InternalEObject) timeout).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.OPTION__TIMEOUT, null, msgs);
			if (newTimeout != null)
				msgs = ((InternalEObject) newTimeout).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.OPTION__TIMEOUT, null, msgs);
			msgs = basicSetTimeout(newTimeout, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.OPTION__TIMEOUT, newTimeout,
					newTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartPeriod getStartperiod() {
		return startperiod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartperiod(StartPeriod newStartperiod, NotificationChain msgs) {
		StartPeriod oldStartperiod = startperiod;
		startperiod = newStartperiod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.OPTION__STARTPERIOD, oldStartperiod, newStartperiod);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartperiod(StartPeriod newStartperiod) {
		if (newStartperiod != startperiod) {
			NotificationChain msgs = null;
			if (startperiod != null)
				msgs = ((InternalEObject) startperiod).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.OPTION__STARTPERIOD, null, msgs);
			if (newStartperiod != null)
				msgs = ((InternalEObject) newStartperiod).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.OPTION__STARTPERIOD, null, msgs);
			msgs = basicSetStartperiod(newStartperiod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.OPTION__STARTPERIOD,
					newStartperiod, newStartperiod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retries getRetries() {
		return retries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetries(Retries newRetries, NotificationChain msgs) {
		Retries oldRetries = retries;
		retries = newRetries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.OPTION__RETRIES, oldRetries, newRetries);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetries(Retries newRetries) {
		if (newRetries != retries) {
			NotificationChain msgs = null;
			if (retries != null)
				msgs = ((InternalEObject) retries).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.OPTION__RETRIES, null, msgs);
			if (newRetries != null)
				msgs = ((InternalEObject) newRetries).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.OPTION__RETRIES, null, msgs);
			msgs = basicSetRetries(newRetries, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.OPTION__RETRIES, newRetries,
					newRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockerfiledslPackage.OPTION__INTERVAL:
			return basicSetInterval(null, msgs);
		case DockerfiledslPackage.OPTION__TIMEOUT:
			return basicSetTimeout(null, msgs);
		case DockerfiledslPackage.OPTION__STARTPERIOD:
			return basicSetStartperiod(null, msgs);
		case DockerfiledslPackage.OPTION__RETRIES:
			return basicSetRetries(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockerfiledslPackage.OPTION__INTERVAL:
			return getInterval();
		case DockerfiledslPackage.OPTION__TIMEOUT:
			return getTimeout();
		case DockerfiledslPackage.OPTION__STARTPERIOD:
			return getStartperiod();
		case DockerfiledslPackage.OPTION__RETRIES:
			return getRetries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DockerfiledslPackage.OPTION__INTERVAL:
			setInterval((Interval) newValue);
			return;
		case DockerfiledslPackage.OPTION__TIMEOUT:
			setTimeout((Timeout) newValue);
			return;
		case DockerfiledslPackage.OPTION__STARTPERIOD:
			setStartperiod((StartPeriod) newValue);
			return;
		case DockerfiledslPackage.OPTION__RETRIES:
			setRetries((Retries) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DockerfiledslPackage.OPTION__INTERVAL:
			setInterval((Interval) null);
			return;
		case DockerfiledslPackage.OPTION__TIMEOUT:
			setTimeout((Timeout) null);
			return;
		case DockerfiledslPackage.OPTION__STARTPERIOD:
			setStartperiod((StartPeriod) null);
			return;
		case DockerfiledslPackage.OPTION__RETRIES:
			setRetries((Retries) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DockerfiledslPackage.OPTION__INTERVAL:
			return interval != null;
		case DockerfiledslPackage.OPTION__TIMEOUT:
			return timeout != null;
		case DockerfiledslPackage.OPTION__STARTPERIOD:
			return startperiod != null;
		case DockerfiledslPackage.OPTION__RETRIES:
			return retries != null;
		}
		return super.eIsSet(featureID);
	}

} //OptionImpl
