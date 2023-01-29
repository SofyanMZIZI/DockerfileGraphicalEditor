/**
 */
package com.s5.mde.dockerfiledsl.impl;

import com.s5.mde.dockerfiledsl.CMD;
import com.s5.mde.dockerfiledsl.DockerfiledslPackage;
import com.s5.mde.dockerfiledsl.HEALTHCHECK;
import com.s5.mde.dockerfiledsl.Option;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEALTHCHECK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.HEALTHCHECKImpl#getOption <em>Option</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.HEALTHCHECKImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HEALTHCHECKImpl extends InstructionImpl implements HEALTHCHECK {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected Option option;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected CMD cmd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HEALTHCHECKImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerfiledslPackage.Literals.HEALTHCHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(Option newOption, NotificationChain msgs) {
		Option oldOption = option;
		option = newOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.HEALTHCHECK__OPTION, oldOption, newOption);
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
	public void setOption(Option newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject) option).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.HEALTHCHECK__OPTION, null, msgs);
			if (newOption != null)
				msgs = ((InternalEObject) newOption).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.HEALTHCHECK__OPTION, null, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.HEALTHCHECK__OPTION, newOption,
					newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMD getCmd() {
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmd(CMD newCmd, NotificationChain msgs) {
		CMD oldCmd = cmd;
		cmd = newCmd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.HEALTHCHECK__CMD, oldCmd, newCmd);
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
	public void setCmd(CMD newCmd) {
		if (newCmd != cmd) {
			NotificationChain msgs = null;
			if (cmd != null)
				msgs = ((InternalEObject) cmd).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.HEALTHCHECK__CMD, null, msgs);
			if (newCmd != null)
				msgs = ((InternalEObject) newCmd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.HEALTHCHECK__CMD, null, msgs);
			msgs = basicSetCmd(newCmd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.HEALTHCHECK__CMD, newCmd,
					newCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockerfiledslPackage.HEALTHCHECK__OPTION:
			return basicSetOption(null, msgs);
		case DockerfiledslPackage.HEALTHCHECK__CMD:
			return basicSetCmd(null, msgs);
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
		case DockerfiledslPackage.HEALTHCHECK__OPTION:
			return getOption();
		case DockerfiledslPackage.HEALTHCHECK__CMD:
			return getCmd();
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
		case DockerfiledslPackage.HEALTHCHECK__OPTION:
			setOption((Option) newValue);
			return;
		case DockerfiledslPackage.HEALTHCHECK__CMD:
			setCmd((CMD) newValue);
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
		case DockerfiledslPackage.HEALTHCHECK__OPTION:
			setOption((Option) null);
			return;
		case DockerfiledslPackage.HEALTHCHECK__CMD:
			setCmd((CMD) null);
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
		case DockerfiledslPackage.HEALTHCHECK__OPTION:
			return option != null;
		case DockerfiledslPackage.HEALTHCHECK__CMD:
			return cmd != null;
		}
		return super.eIsSet(featureID);
	}

} //HEALTHCHECKImpl
