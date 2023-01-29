/**
 */
package com.s5.mde.dockerfiledsl.impl;

import com.s5.mde.dockerfiledsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerfiledslFactoryImpl extends EFactoryImpl implements DockerfiledslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DockerfiledslFactory init() {
		try {
			DockerfiledslFactory theDockerfiledslFactory = (DockerfiledslFactory) EPackage.Registry.INSTANCE
					.getEFactory(DockerfiledslPackage.eNS_URI);
			if (theDockerfiledslFactory != null) {
				return theDockerfiledslFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DockerfiledslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfiledslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DockerfiledslPackage.HEALTHCHECK:
			return createHEALTHCHECK();
		case DockerfiledslPackage.ADD:
			return createADD();
		case DockerfiledslPackage.SHELL:
			return createSHELL();
		case DockerfiledslPackage.SCHELL_FORM:
			return createSchellForm();
		case DockerfiledslPackage.START_PERIOD:
			return createStartPeriod();
		case DockerfiledslPackage.FROM:
			return createFROM();
		case DockerfiledslPackage.CMD:
			return createCMD();
		case DockerfiledslPackage.COPY:
			return createCOPY();
		case DockerfiledslPackage.PORT:
			return createPort();
		case DockerfiledslPackage.WORKDIR:
			return createWORKDIR();
		case DockerfiledslPackage.STOPSIGNAL:
			return createSTOPSIGNAL();
		case DockerfiledslPackage.DATA:
			return createData();
		case DockerfiledslPackage.KEY_VALUE:
			return createKeyValue();
		case DockerfiledslPackage.USER:
			return createUSER();
		case DockerfiledslPackage.SRC:
			return createSrc();
		case DockerfiledslPackage.PATH:
			return createPath();
		case DockerfiledslPackage.ENV:
			return createENV();
		case DockerfiledslPackage.SIGNAL:
			return createSignal();
		case DockerfiledslPackage.ONBUILD:
			return createONBUILD();
		case DockerfiledslPackage.RETRIES:
			return createRetries();
		case DockerfiledslPackage.VALUE:
			return createValue();
		case DockerfiledslPackage.CHECKSUM:
			return createChecksum();
		case DockerfiledslPackage.VOLUME:
			return createVOLUME();
		case DockerfiledslPackage.PROTOCOL:
			return createProtocol();
		case DockerfiledslPackage.EXEC_FORM:
			return createExecForm();
		case DockerfiledslPackage.LABEL:
			return createLABEL();
		case DockerfiledslPackage.NAME:
			return createName();
		case DockerfiledslPackage.GROUP:
			return createGroup();
		case DockerfiledslPackage.EXPOSE:
			return createEXPOSE();
		case DockerfiledslPackage.RUN:
			return createRUN();
		case DockerfiledslPackage.ENTRYPOINT:
			return createENTRYPOINT();
		case DockerfiledslPackage.KEY:
			return createKey();
		case DockerfiledslPackage.IMAGE:
			return createImage();
		case DockerfiledslPackage.ARG:
			return createARG();
		case DockerfiledslPackage.PLATFORM:
			return createPlatform();
		case DockerfiledslPackage.DEST:
			return createDest();
		case DockerfiledslPackage.INTERVAL:
			return createInterval();
		case DockerfiledslPackage.TIMEOUT:
			return createTimeout();
		case DockerfiledslPackage.DOCKERFILE:
			return createDockerfile();
		case DockerfiledslPackage.OPTION:
			return createOption();
		case DockerfiledslPackage.TAG:
			return createTag();
		case DockerfiledslPackage.USR:
			return createUsr();
		case DockerfiledslPackage.MAIN:
			return createMain();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DockerfiledslPackage.SIGNALS:
			return createSignalsFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DockerfiledslPackage.SIGNALS:
			return convertSignalsToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HEALTHCHECK createHEALTHCHECK() {
		HEALTHCHECKImpl healthcheck = new HEALTHCHECKImpl();
		return healthcheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADD createADD() {
		ADDImpl add = new ADDImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SHELL createSHELL() {
		SHELLImpl shell = new SHELLImpl();
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchellForm createSchellForm() {
		SchellFormImpl schellForm = new SchellFormImpl();
		return schellForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartPeriod createStartPeriod() {
		StartPeriodImpl startPeriod = new StartPeriodImpl();
		return startPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FROM createFROM() {
		FROMImpl from = new FROMImpl();
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMD createCMD() {
		CMDImpl cmd = new CMDImpl();
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COPY createCOPY() {
		COPYImpl copy = new COPYImpl();
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WORKDIR createWORKDIR() {
		WORKDIRImpl workdir = new WORKDIRImpl();
		return workdir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STOPSIGNAL createSTOPSIGNAL() {
		STOPSIGNALImpl stopsignal = new STOPSIGNALImpl();
		return stopsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USER createUSER() {
		USERImpl user = new USERImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Src createSrc() {
		SrcImpl src = new SrcImpl();
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENV createENV() {
		ENVImpl env = new ENVImpl();
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ONBUILD createONBUILD() {
		ONBUILDImpl onbuild = new ONBUILDImpl();
		return onbuild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retries createRetries() {
		RetriesImpl retries = new RetriesImpl();
		return retries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checksum createChecksum() {
		ChecksumImpl checksum = new ChecksumImpl();
		return checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VOLUME createVOLUME() {
		VOLUMEImpl volume = new VOLUMEImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecForm createExecForm() {
		ExecFormImpl execForm = new ExecFormImpl();
		return execForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LABEL createLABEL() {
		LABELImpl label = new LABELImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXPOSE createEXPOSE() {
		EXPOSEImpl expose = new EXPOSEImpl();
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RUN createRUN() {
		RUNImpl run = new RUNImpl();
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENTRYPOINT createENTRYPOINT() {
		ENTRYPOINTImpl entrypoint = new ENTRYPOINTImpl();
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARG createARG() {
		ARGImpl arg = new ARGImpl();
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dest createDest() {
		DestImpl dest = new DestImpl();
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timeout createTimeout() {
		TimeoutImpl timeout = new TimeoutImpl();
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dockerfile createDockerfile() {
		DockerfileImpl dockerfile = new DockerfileImpl();
		return dockerfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usr createUsr() {
		UsrImpl usr = new UsrImpl();
		return usr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signals createSignalsFromString(EDataType eDataType, String initialValue) {
		Signals result = Signals.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfiledslPackage getDockerfiledslPackage() {
		return (DockerfiledslPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DockerfiledslPackage getPackage() {
		return DockerfiledslPackage.eINSTANCE;
	}

} //DockerfiledslFactoryImpl
