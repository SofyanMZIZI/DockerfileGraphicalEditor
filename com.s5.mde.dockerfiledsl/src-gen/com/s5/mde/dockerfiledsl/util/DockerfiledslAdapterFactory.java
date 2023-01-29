/**
 */
package com.s5.mde.dockerfiledsl.util;

import com.s5.mde.dockerfiledsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage
 * @generated
 */
public class DockerfiledslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DockerfiledslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfiledslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DockerfiledslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerfiledslSwitch<Adapter> modelSwitch = new DockerfiledslSwitch<Adapter>() {
		@Override
		public Adapter caseHEALTHCHECK(HEALTHCHECK object) {
			return createHEALTHCHECKAdapter();
		}

		@Override
		public Adapter caseADD(ADD object) {
			return createADDAdapter();
		}

		@Override
		public Adapter caseSHELL(SHELL object) {
			return createSHELLAdapter();
		}

		@Override
		public Adapter caseSchellForm(SchellForm object) {
			return createSchellFormAdapter();
		}

		@Override
		public Adapter caseStartPeriod(StartPeriod object) {
			return createStartPeriodAdapter();
		}

		@Override
		public Adapter caseFROM(FROM object) {
			return createFROMAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseCMD(CMD object) {
			return createCMDAdapter();
		}

		@Override
		public Adapter caseCOPY(COPY object) {
			return createCOPYAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseWORKDIR(WORKDIR object) {
			return createWORKDIRAdapter();
		}

		@Override
		public Adapter caseSTOPSIGNAL(STOPSIGNAL object) {
			return createSTOPSIGNALAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseKeyValue(KeyValue object) {
			return createKeyValueAdapter();
		}

		@Override
		public Adapter caseUSER(USER object) {
			return createUSERAdapter();
		}

		@Override
		public Adapter caseSrc(Src object) {
			return createSrcAdapter();
		}

		@Override
		public Adapter casePath(Path object) {
			return createPathAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseENV(ENV object) {
			return createENVAdapter();
		}

		@Override
		public Adapter caseSignal(Signal object) {
			return createSignalAdapter();
		}

		@Override
		public Adapter caseONBUILD(ONBUILD object) {
			return createONBUILDAdapter();
		}

		@Override
		public Adapter caseRetries(Retries object) {
			return createRetriesAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseChecksum(Checksum object) {
			return createChecksumAdapter();
		}

		@Override
		public Adapter caseVOLUME(VOLUME object) {
			return createVOLUMEAdapter();
		}

		@Override
		public Adapter caseProtocol(Protocol object) {
			return createProtocolAdapter();
		}

		@Override
		public Adapter caseExecForm(ExecForm object) {
			return createExecFormAdapter();
		}

		@Override
		public Adapter caseLABEL(LABEL object) {
			return createLABELAdapter();
		}

		@Override
		public Adapter caseName(Name object) {
			return createNameAdapter();
		}

		@Override
		public Adapter caseGroup(Group object) {
			return createGroupAdapter();
		}

		@Override
		public Adapter caseEXPOSE(EXPOSE object) {
			return createEXPOSEAdapter();
		}

		@Override
		public Adapter caseRUN(RUN object) {
			return createRUNAdapter();
		}

		@Override
		public Adapter caseENTRYPOINT(ENTRYPOINT object) {
			return createENTRYPOINTAdapter();
		}

		@Override
		public Adapter caseKey(Key object) {
			return createKeyAdapter();
		}

		@Override
		public Adapter caseImage(Image object) {
			return createImageAdapter();
		}

		@Override
		public Adapter caseARG(ARG object) {
			return createARGAdapter();
		}

		@Override
		public Adapter casePlatform(Platform object) {
			return createPlatformAdapter();
		}

		@Override
		public Adapter caseDest(Dest object) {
			return createDestAdapter();
		}

		@Override
		public Adapter caseInterval(Interval object) {
			return createIntervalAdapter();
		}

		@Override
		public Adapter caseTimeout(Timeout object) {
			return createTimeoutAdapter();
		}

		@Override
		public Adapter caseDockerfile(Dockerfile object) {
			return createDockerfileAdapter();
		}

		@Override
		public Adapter caseOption(Option object) {
			return createOptionAdapter();
		}

		@Override
		public Adapter caseTag(Tag object) {
			return createTagAdapter();
		}

		@Override
		public Adapter caseUsr(Usr object) {
			return createUsrAdapter();
		}

		@Override
		public Adapter caseMain(Main object) {
			return createMainAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.HEALTHCHECK <em>HEALTHCHECK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.HEALTHCHECK
	 * @generated
	 */
	public Adapter createHEALTHCHECKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.ADD <em>ADD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.ADD
	 * @generated
	 */
	public Adapter createADDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.SHELL <em>SHELL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.SHELL
	 * @generated
	 */
	public Adapter createSHELLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.SchellForm <em>Schell Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.SchellForm
	 * @generated
	 */
	public Adapter createSchellFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.StartPeriod <em>Start Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.StartPeriod
	 * @generated
	 */
	public Adapter createStartPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.FROM <em>FROM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.FROM
	 * @generated
	 */
	public Adapter createFROMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.CMD <em>CMD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.CMD
	 * @generated
	 */
	public Adapter createCMDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.COPY <em>COPY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.COPY
	 * @generated
	 */
	public Adapter createCOPYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.WORKDIR <em>WORKDIR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.WORKDIR
	 * @generated
	 */
	public Adapter createWORKDIRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.STOPSIGNAL <em>STOPSIGNAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.STOPSIGNAL
	 * @generated
	 */
	public Adapter createSTOPSIGNALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.KeyValue
	 * @generated
	 */
	public Adapter createKeyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.USER <em>USER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.USER
	 * @generated
	 */
	public Adapter createUSERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Src <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Src
	 * @generated
	 */
	public Adapter createSrcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.ENV <em>ENV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.ENV
	 * @generated
	 */
	public Adapter createENVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.ONBUILD <em>ONBUILD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.ONBUILD
	 * @generated
	 */
	public Adapter createONBUILDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Retries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Retries
	 * @generated
	 */
	public Adapter createRetriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Checksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Checksum
	 * @generated
	 */
	public Adapter createChecksumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.VOLUME <em>VOLUME</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.VOLUME
	 * @generated
	 */
	public Adapter createVOLUMEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.ExecForm <em>Exec Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.ExecForm
	 * @generated
	 */
	public Adapter createExecFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.LABEL <em>LABEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.LABEL
	 * @generated
	 */
	public Adapter createLABELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Name
	 * @generated
	 */
	public Adapter createNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.EXPOSE <em>EXPOSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.EXPOSE
	 * @generated
	 */
	public Adapter createEXPOSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.RUN <em>RUN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.RUN
	 * @generated
	 */
	public Adapter createRUNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.ENTRYPOINT <em>ENTRYPOINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.ENTRYPOINT
	 * @generated
	 */
	public Adapter createENTRYPOINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Key
	 * @generated
	 */
	public Adapter createKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.ARG <em>ARG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.ARG
	 * @generated
	 */
	public Adapter createARGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Dest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Dest
	 * @generated
	 */
	public Adapter createDestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Timeout
	 * @generated
	 */
	public Adapter createTimeoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Dockerfile <em>Dockerfile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Dockerfile
	 * @generated
	 */
	public Adapter createDockerfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Usr <em>Usr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Usr
	 * @generated
	 */
	public Adapter createUsrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.s5.mde.dockerfiledsl.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.s5.mde.dockerfiledsl.Main
	 * @generated
	 */
	public Adapter createMainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DockerfiledslAdapterFactory
