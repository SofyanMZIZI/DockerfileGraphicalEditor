/**
 */
package com.s5.mde.dockerfiledsl.impl;

import com.s5.mde.dockerfiledsl.Dockerfile;
import com.s5.mde.dockerfiledsl.DockerfiledslPackage;
import com.s5.mde.dockerfiledsl.Main;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.MainImpl#getDockerfile <em>Dockerfile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainImpl extends MinimalEObjectImpl.Container implements Main {
	/**
	 * The cached value of the '{@link #getDockerfile() <em>Dockerfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerfile()
	 * @generated
	 * @ordered
	 */
	protected Dockerfile dockerfile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerfiledslPackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dockerfile getDockerfile() {
		return dockerfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDockerfile(Dockerfile newDockerfile, NotificationChain msgs) {
		Dockerfile oldDockerfile = dockerfile;
		dockerfile = newDockerfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.MAIN__DOCKERFILE, oldDockerfile, newDockerfile);
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
	public void setDockerfile(Dockerfile newDockerfile) {
		if (newDockerfile != dockerfile) {
			NotificationChain msgs = null;
			if (dockerfile != null)
				msgs = ((InternalEObject) dockerfile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.MAIN__DOCKERFILE, null, msgs);
			if (newDockerfile != null)
				msgs = ((InternalEObject) newDockerfile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.MAIN__DOCKERFILE, null, msgs);
			msgs = basicSetDockerfile(newDockerfile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.MAIN__DOCKERFILE, newDockerfile,
					newDockerfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockerfiledslPackage.MAIN__DOCKERFILE:
			return basicSetDockerfile(null, msgs);
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
		case DockerfiledslPackage.MAIN__DOCKERFILE:
			return getDockerfile();
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
		case DockerfiledslPackage.MAIN__DOCKERFILE:
			setDockerfile((Dockerfile) newValue);
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
		case DockerfiledslPackage.MAIN__DOCKERFILE:
			setDockerfile((Dockerfile) null);
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
		case DockerfiledslPackage.MAIN__DOCKERFILE:
			return dockerfile != null;
		}
		return super.eIsSet(featureID);
	}

} //MainImpl
