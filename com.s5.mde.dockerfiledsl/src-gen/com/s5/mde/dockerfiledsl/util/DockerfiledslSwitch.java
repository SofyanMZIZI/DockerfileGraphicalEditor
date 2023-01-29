/**
 */
package com.s5.mde.dockerfiledsl.util;

import com.s5.mde.dockerfiledsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage
 * @generated
 */
public class DockerfiledslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DockerfiledslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfiledslSwitch() {
		if (modelPackage == null) {
			modelPackage = DockerfiledslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DockerfiledslPackage.HEALTHCHECK: {
			HEALTHCHECK healthcheck = (HEALTHCHECK) theEObject;
			T result = caseHEALTHCHECK(healthcheck);
			if (result == null)
				result = caseInstruction(healthcheck);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.ADD: {
			ADD add = (ADD) theEObject;
			T result = caseADD(add);
			if (result == null)
				result = caseInstruction(add);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.SHELL: {
			SHELL shell = (SHELL) theEObject;
			T result = caseSHELL(shell);
			if (result == null)
				result = caseInstruction(shell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.SCHELL_FORM: {
			SchellForm schellForm = (SchellForm) theEObject;
			T result = caseSchellForm(schellForm);
			if (result == null)
				result = caseCommand(schellForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.START_PERIOD: {
			StartPeriod startPeriod = (StartPeriod) theEObject;
			T result = caseStartPeriod(startPeriod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.FROM: {
			FROM from = (FROM) theEObject;
			T result = caseFROM(from);
			if (result == null)
				result = caseInstruction(from);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.INSTRUCTION: {
			Instruction instruction = (Instruction) theEObject;
			T result = caseInstruction(instruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.CMD: {
			CMD cmd = (CMD) theEObject;
			T result = caseCMD(cmd);
			if (result == null)
				result = caseInstruction(cmd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.COPY: {
			COPY copy = (COPY) theEObject;
			T result = caseCOPY(copy);
			if (result == null)
				result = caseInstruction(copy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.WORKDIR: {
			WORKDIR workdir = (WORKDIR) theEObject;
			T result = caseWORKDIR(workdir);
			if (result == null)
				result = caseInstruction(workdir);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.STOPSIGNAL: {
			STOPSIGNAL stopsignal = (STOPSIGNAL) theEObject;
			T result = caseSTOPSIGNAL(stopsignal);
			if (result == null)
				result = caseInstruction(stopsignal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = casePath(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.KEY_VALUE: {
			KeyValue keyValue = (KeyValue) theEObject;
			T result = caseKeyValue(keyValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.USER: {
			USER user = (USER) theEObject;
			T result = caseUSER(user);
			if (result == null)
				result = caseInstruction(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.SRC: {
			Src src = (Src) theEObject;
			T result = caseSrc(src);
			if (result == null)
				result = casePath(src);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.PATH: {
			Path path = (Path) theEObject;
			T result = casePath(path);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.ENV: {
			ENV env = (ENV) theEObject;
			T result = caseENV(env);
			if (result == null)
				result = caseInstruction(env);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.SIGNAL: {
			Signal signal = (Signal) theEObject;
			T result = caseSignal(signal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.ONBUILD: {
			ONBUILD onbuild = (ONBUILD) theEObject;
			T result = caseONBUILD(onbuild);
			if (result == null)
				result = caseInstruction(onbuild);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.RETRIES: {
			Retries retries = (Retries) theEObject;
			T result = caseRetries(retries);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.CHECKSUM: {
			Checksum checksum = (Checksum) theEObject;
			T result = caseChecksum(checksum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.VOLUME: {
			VOLUME volume = (VOLUME) theEObject;
			T result = caseVOLUME(volume);
			if (result == null)
				result = caseInstruction(volume);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.PROTOCOL: {
			Protocol protocol = (Protocol) theEObject;
			T result = caseProtocol(protocol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.EXEC_FORM: {
			ExecForm execForm = (ExecForm) theEObject;
			T result = caseExecForm(execForm);
			if (result == null)
				result = caseCommand(execForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.LABEL: {
			LABEL label = (LABEL) theEObject;
			T result = caseLABEL(label);
			if (result == null)
				result = caseInstruction(label);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.NAME: {
			Name name = (Name) theEObject;
			T result = caseName(name);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.GROUP: {
			Group group = (Group) theEObject;
			T result = caseGroup(group);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.EXPOSE: {
			EXPOSE expose = (EXPOSE) theEObject;
			T result = caseEXPOSE(expose);
			if (result == null)
				result = caseInstruction(expose);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.RUN: {
			RUN run = (RUN) theEObject;
			T result = caseRUN(run);
			if (result == null)
				result = caseInstruction(run);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.ENTRYPOINT: {
			ENTRYPOINT entrypoint = (ENTRYPOINT) theEObject;
			T result = caseENTRYPOINT(entrypoint);
			if (result == null)
				result = caseInstruction(entrypoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.KEY: {
			Key key = (Key) theEObject;
			T result = caseKey(key);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.ARG: {
			ARG arg = (ARG) theEObject;
			T result = caseARG(arg);
			if (result == null)
				result = caseInstruction(arg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.PLATFORM: {
			Platform platform = (Platform) theEObject;
			T result = casePlatform(platform);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.DEST: {
			Dest dest = (Dest) theEObject;
			T result = caseDest(dest);
			if (result == null)
				result = casePath(dest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.INTERVAL: {
			Interval interval = (Interval) theEObject;
			T result = caseInterval(interval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.TIMEOUT: {
			Timeout timeout = (Timeout) theEObject;
			T result = caseTimeout(timeout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.DOCKERFILE: {
			Dockerfile dockerfile = (Dockerfile) theEObject;
			T result = caseDockerfile(dockerfile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.OPTION: {
			Option option = (Option) theEObject;
			T result = caseOption(option);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.TAG: {
			Tag tag = (Tag) theEObject;
			T result = caseTag(tag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.USR: {
			Usr usr = (Usr) theEObject;
			T result = caseUsr(usr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockerfiledslPackage.MAIN: {
			Main main = (Main) theEObject;
			T result = caseMain(main);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HEALTHCHECK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HEALTHCHECK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHEALTHCHECK(HEALTHCHECK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADD(ADD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SHELL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SHELL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSHELL(SHELL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schell Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schell Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchellForm(SchellForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartPeriod(StartPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FROM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FROM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFROM(FROM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CMD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CMD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCMD(CMD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>COPY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>COPY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCOPY(COPY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WORKDIR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WORKDIR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWORKDIR(WORKDIR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STOPSIGNAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STOPSIGNAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTOPSIGNAL(STOPSIGNAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValue(KeyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>USER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>USER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUSER(USER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrc(Src object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENV(ENV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ONBUILD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ONBUILD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseONBUILD(ONBUILD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetries(Retries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checksum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checksum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChecksum(Checksum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VOLUME</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VOLUME</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVOLUME(VOLUME object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocol(Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exec Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exec Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecForm(ExecForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LABEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LABEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLABEL(LABEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName(Name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXPOSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXPOSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXPOSE(EXPOSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RUN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RUN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRUN(RUN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENTRYPOINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENTRYPOINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENTRYPOINT(ENTRYPOINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKey(Key object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARG(ARG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDest(Dest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeout(Timeout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dockerfile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dockerfile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerfile(Dockerfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsr(Usr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMain(Main object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DockerfiledslSwitch
