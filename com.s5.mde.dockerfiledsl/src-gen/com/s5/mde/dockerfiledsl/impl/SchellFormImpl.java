/**
 */
package com.s5.mde.dockerfiledsl.impl;

import com.s5.mde.dockerfiledsl.DockerfiledslPackage;
import com.s5.mde.dockerfiledsl.SchellForm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schell Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.SchellFormImpl#getExecutable <em>Executable</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.SchellFormImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchellFormImpl extends CommandImpl implements SchellForm {
	/**
	 * The default value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutable()
	 * @generated
	 * @ordered
	 */
	protected String executable = EXECUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected static final String CMD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected String cmd = CMD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchellFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerfiledslPackage.Literals.SCHELL_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutable(String newExecutable) {
		String oldExecutable = executable;
		executable = newExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.SCHELL_FORM__EXECUTABLE,
					oldExecutable, executable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCmd() {
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmd(String newCmd) {
		String oldCmd = cmd;
		cmd = newCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.SCHELL_FORM__CMD, oldCmd, cmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockerfiledslPackage.SCHELL_FORM__EXECUTABLE:
			return getExecutable();
		case DockerfiledslPackage.SCHELL_FORM__CMD:
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
		case DockerfiledslPackage.SCHELL_FORM__EXECUTABLE:
			setExecutable((String) newValue);
			return;
		case DockerfiledslPackage.SCHELL_FORM__CMD:
			setCmd((String) newValue);
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
		case DockerfiledslPackage.SCHELL_FORM__EXECUTABLE:
			setExecutable(EXECUTABLE_EDEFAULT);
			return;
		case DockerfiledslPackage.SCHELL_FORM__CMD:
			setCmd(CMD_EDEFAULT);
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
		case DockerfiledslPackage.SCHELL_FORM__EXECUTABLE:
			return EXECUTABLE_EDEFAULT == null ? executable != null : !EXECUTABLE_EDEFAULT.equals(executable);
		case DockerfiledslPackage.SCHELL_FORM__CMD:
			return CMD_EDEFAULT == null ? cmd != null : !CMD_EDEFAULT.equals(cmd);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (executable: ");
		result.append(executable);
		result.append(", cmd: ");
		result.append(cmd);
		result.append(')');
		return result.toString();
	}

} //SchellFormImpl
