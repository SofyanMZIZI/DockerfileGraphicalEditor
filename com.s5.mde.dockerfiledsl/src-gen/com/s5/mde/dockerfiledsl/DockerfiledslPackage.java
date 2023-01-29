/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.s5.mde.dockerfiledsl.DockerfiledslFactory
 * @model kind="package"
 * @generated
 */
public interface DockerfiledslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dockerfiledsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.s5.com/mde/dockerfiledsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dockerfiledsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerfiledslPackage eINSTANCE = com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.InstructionImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 6;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.HEALTHCHECKImpl <em>HEALTHCHECK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.HEALTHCHECKImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getHEALTHCHECK()
	 * @generated
	 */
	int HEALTHCHECK = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK__OPTION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK__CMD = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HEALTHCHECK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>HEALTHCHECK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ADDImpl <em>ADD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ADDImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getADD()
	 * @generated
	 */
	int ADD = 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__SRC = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__DEST = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__CHECKSUM = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__USER = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__GROUP = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ADD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>ADD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.SHELLImpl <em>SHELL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.SHELLImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSHELL()
	 * @generated
	 */
	int SHELL = 2;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL__CMD = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SHELL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SHELL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.CommandImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 17;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.SchellFormImpl <em>Schell Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.SchellFormImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSchellForm()
	 * @generated
	 */
	int SCHELL_FORM = 3;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHELL_FORM__EXECUTABLE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHELL_FORM__CMD = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schell Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHELL_FORM_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schell Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHELL_FORM_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.StartPeriodImpl <em>Start Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.StartPeriodImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getStartPeriod()
	 * @generated
	 */
	int START_PERIOD = 4;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PERIOD__STR = 0;

	/**
	 * The number of structural features of the '<em>Start Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PERIOD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Start Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.FROMImpl <em>FROM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.FROMImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getFROM()
	 * @generated
	 */
	int FROM = 5;

	/**
	 * The feature id for the '<em><b>Platfom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PLATFOM = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__IMAGE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__NAME = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FROM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FROM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.CMDImpl <em>CMD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.CMDImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getCMD()
	 * @generated
	 */
	int CMD = 7;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD__COMMAND = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CMD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CMD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.COPYImpl <em>COPY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.COPYImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getCOPY()
	 * @generated
	 */
	int COPY = 8;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__SRC = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__DEST = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__USER = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__GROUP = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>COPY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>COPY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.PortImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 9;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__STR = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.WORKDIRImpl <em>WORKDIR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.WORKDIRImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getWORKDIR()
	 * @generated
	 */
	int WORKDIR = 10;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKDIR__PATH = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WORKDIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKDIR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>WORKDIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKDIR_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.STOPSIGNALImpl <em>STOPSIGNAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.STOPSIGNALImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSTOPSIGNAL()
	 * @generated
	 */
	int STOPSIGNAL = 11;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOPSIGNAL__SIGNAL = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>STOPSIGNAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOPSIGNAL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>STOPSIGNAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOPSIGNAL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.PathImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 16;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STR = 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.DataImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getData()
	 * @generated
	 */
	int DATA = 12;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__STR = PATH__STR;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = PATH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.KeyValueImpl <em>Key Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.KeyValueImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getKeyValue()
	 * @generated
	 */
	int KEY_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.USERImpl <em>USER</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.USERImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getUSER()
	 * @generated
	 */
	int USER = 14;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GROUP = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>USER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>USER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.SrcImpl <em>Src</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.SrcImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSrc()
	 * @generated
	 */
	int SRC = 15;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC__STR = PATH__STR;

	/**
	 * The number of structural features of the '<em>Src</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_FEATURE_COUNT = PATH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_OPERATION_COUNT = PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ENVImpl <em>ENV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ENVImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getENV()
	 * @generated
	 */
	int ENV = 18;

	/**
	 * The feature id for the '<em><b>Keyvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV__KEYVALUES = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ENV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ENV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.SignalImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 19;

	/**
	 * The feature id for the '<em><b>Sig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SIG = 0;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ONBUILDImpl <em>ONBUILD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ONBUILDImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getONBUILD()
	 * @generated
	 */
	int ONBUILD = 20;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBUILD__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ONBUILD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBUILD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ONBUILD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONBUILD_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.RetriesImpl <em>Retries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.RetriesImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getRetries()
	 * @generated
	 */
	int RETRIES = 21;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIES__STR = 0;

	/**
	 * The number of structural features of the '<em>Retries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Retries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ValueImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 22;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STR = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ChecksumImpl <em>Checksum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ChecksumImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getChecksum()
	 * @generated
	 */
	int CHECKSUM = 23;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM__STR = 0;

	/**
	 * The number of structural features of the '<em>Checksum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Checksum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.VOLUMEImpl <em>VOLUME</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.VOLUMEImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getVOLUME()
	 * @generated
	 */
	int VOLUME = 24;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__DATA = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VOLUME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VOLUME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ProtocolImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 25;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__STR = 0;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ExecFormImpl <em>Exec Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ExecFormImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getExecForm()
	 * @generated
	 */
	int EXEC_FORM = 26;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_FORM__ARGS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exec Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_FORM_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exec Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_FORM_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.LABELImpl <em>LABEL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.LABELImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getLABEL()
	 * @generated
	 */
	int LABEL = 27;

	/**
	 * The feature id for the '<em><b>Keyvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__KEYVALUES = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LABEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LABEL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.NameImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 28;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__STR = 0;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.GroupImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 29;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__STR = 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.EXPOSEImpl <em>EXPOSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.EXPOSEImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getEXPOSE()
	 * @generated
	 */
	int EXPOSE = 30;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE__PORT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE__PROTOCOL = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EXPOSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EXPOSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.RUNImpl <em>RUN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.RUNImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getRUN()
	 * @generated
	 */
	int RUN = 31;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__COMMAND = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RUN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RUN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ENTRYPOINTImpl <em>ENTRYPOINT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ENTRYPOINTImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getENTRYPOINT()
	 * @generated
	 */
	int ENTRYPOINT = 32;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT__COMMAND = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ENTRYPOINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ENTRYPOINT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.KeyImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 33;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__STR = 0;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ImageImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 34;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STR = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.ARGImpl <em>ARG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.ARGImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getARG()
	 * @generated
	 */
	int ARG = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG__NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ARG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ARG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.PlatformImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 36;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__STR = 0;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.DestImpl <em>Dest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.DestImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getDest()
	 * @generated
	 */
	int DEST = 37;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEST__STR = PATH__STR;

	/**
	 * The number of structural features of the '<em>Dest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEST_FEATURE_COUNT = PATH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEST_OPERATION_COUNT = PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.IntervalImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 38;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__STR = 0;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.TimeoutImpl <em>Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.TimeoutImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getTimeout()
	 * @generated
	 */
	int TIMEOUT = 39;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT__STR = 0;

	/**
	 * The number of structural features of the '<em>Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.DockerfileImpl <em>Dockerfile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfileImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getDockerfile()
	 * @generated
	 */
	int DOCKERFILE = 40;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__PATH = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE__INSTRUCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Dockerfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dockerfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKERFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.OptionImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 41;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TIMEOUT = 1;

	/**
	 * The feature id for the '<em><b>Startperiod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__STARTPERIOD = 2;

	/**
	 * The feature id for the '<em><b>Retries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__RETRIES = 3;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.TagImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 42;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__STR = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.UsrImpl <em>Usr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.UsrImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getUsr()
	 * @generated
	 */
	int USR = 43;

	/**
	 * The feature id for the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USR__STR = 0;

	/**
	 * The number of structural features of the '<em>Usr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Usr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.impl.MainImpl
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 44;

	/**
	 * The feature id for the '<em><b>Dockerfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__DOCKERFILE = 0;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.s5.mde.dockerfiledsl.Signals <em>Signals</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.s5.mde.dockerfiledsl.Signals
	 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSignals()
	 * @generated
	 */
	int SIGNALS = 45;

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.HEALTHCHECK <em>HEALTHCHECK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HEALTHCHECK</em>'.
	 * @see com.s5.mde.dockerfiledsl.HEALTHCHECK
	 * @generated
	 */
	EClass getHEALTHCHECK();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.HEALTHCHECK#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see com.s5.mde.dockerfiledsl.HEALTHCHECK#getOption()
	 * @see #getHEALTHCHECK()
	 * @generated
	 */
	EReference getHEALTHCHECK_Option();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.HEALTHCHECK#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmd</em>'.
	 * @see com.s5.mde.dockerfiledsl.HEALTHCHECK#getCmd()
	 * @see #getHEALTHCHECK()
	 * @generated
	 */
	EReference getHEALTHCHECK_Cmd();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.ADD <em>ADD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADD</em>'.
	 * @see com.s5.mde.dockerfiledsl.ADD
	 * @generated
	 */
	EClass getADD();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.ADD#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see com.s5.mde.dockerfiledsl.ADD#getSrc()
	 * @see #getADD()
	 * @generated
	 */
	EReference getADD_Src();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.ADD#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dest</em>'.
	 * @see com.s5.mde.dockerfiledsl.ADD#getDest()
	 * @see #getADD()
	 * @generated
	 */
	EReference getADD_Dest();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.ADD#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checksum</em>'.
	 * @see com.s5.mde.dockerfiledsl.ADD#getChecksum()
	 * @see #getADD()
	 * @generated
	 */
	EReference getADD_Checksum();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.ADD#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see com.s5.mde.dockerfiledsl.ADD#getUser()
	 * @see #getADD()
	 * @generated
	 */
	EReference getADD_User();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.ADD#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see com.s5.mde.dockerfiledsl.ADD#getGroup()
	 * @see #getADD()
	 * @generated
	 */
	EReference getADD_Group();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.SHELL <em>SHELL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SHELL</em>'.
	 * @see com.s5.mde.dockerfiledsl.SHELL
	 * @generated
	 */
	EClass getSHELL();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.SHELL#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmd</em>'.
	 * @see com.s5.mde.dockerfiledsl.SHELL#getCmd()
	 * @see #getSHELL()
	 * @generated
	 */
	EReference getSHELL_Cmd();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.SchellForm <em>Schell Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schell Form</em>'.
	 * @see com.s5.mde.dockerfiledsl.SchellForm
	 * @generated
	 */
	EClass getSchellForm();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.SchellForm#getExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executable</em>'.
	 * @see com.s5.mde.dockerfiledsl.SchellForm#getExecutable()
	 * @see #getSchellForm()
	 * @generated
	 */
	EAttribute getSchellForm_Executable();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.SchellForm#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see com.s5.mde.dockerfiledsl.SchellForm#getCmd()
	 * @see #getSchellForm()
	 * @generated
	 */
	EAttribute getSchellForm_Cmd();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.StartPeriod <em>Start Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Period</em>'.
	 * @see com.s5.mde.dockerfiledsl.StartPeriod
	 * @generated
	 */
	EClass getStartPeriod();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.StartPeriod#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.StartPeriod#getStr()
	 * @see #getStartPeriod()
	 * @generated
	 */
	EAttribute getStartPeriod_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.FROM <em>FROM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FROM</em>'.
	 * @see com.s5.mde.dockerfiledsl.FROM
	 * @generated
	 */
	EClass getFROM();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.FROM#getPlatfom <em>Platfom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platfom</em>'.
	 * @see com.s5.mde.dockerfiledsl.FROM#getPlatfom()
	 * @see #getFROM()
	 * @generated
	 */
	EReference getFROM_Platfom();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.FROM#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see com.s5.mde.dockerfiledsl.FROM#getImage()
	 * @see #getFROM()
	 * @generated
	 */
	EReference getFROM_Image();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.FROM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see com.s5.mde.dockerfiledsl.FROM#getName()
	 * @see #getFROM()
	 * @generated
	 */
	EReference getFROM_Name();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see com.s5.mde.dockerfiledsl.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.CMD <em>CMD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMD</em>'.
	 * @see com.s5.mde.dockerfiledsl.CMD
	 * @generated
	 */
	EClass getCMD();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.CMD#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see com.s5.mde.dockerfiledsl.CMD#getCommand()
	 * @see #getCMD()
	 * @generated
	 */
	EReference getCMD_Command();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.COPY <em>COPY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>COPY</em>'.
	 * @see com.s5.mde.dockerfiledsl.COPY
	 * @generated
	 */
	EClass getCOPY();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.COPY#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see com.s5.mde.dockerfiledsl.COPY#getSrc()
	 * @see #getCOPY()
	 * @generated
	 */
	EReference getCOPY_Src();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.COPY#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dest</em>'.
	 * @see com.s5.mde.dockerfiledsl.COPY#getDest()
	 * @see #getCOPY()
	 * @generated
	 */
	EReference getCOPY_Dest();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.COPY#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see com.s5.mde.dockerfiledsl.COPY#getUser()
	 * @see #getCOPY()
	 * @generated
	 */
	EReference getCOPY_User();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.COPY#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see com.s5.mde.dockerfiledsl.COPY#getGroup()
	 * @see #getCOPY()
	 * @generated
	 */
	EReference getCOPY_Group();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see com.s5.mde.dockerfiledsl.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Port#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Port#getStr()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.WORKDIR <em>WORKDIR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WORKDIR</em>'.
	 * @see com.s5.mde.dockerfiledsl.WORKDIR
	 * @generated
	 */
	EClass getWORKDIR();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.WORKDIR#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see com.s5.mde.dockerfiledsl.WORKDIR#getPath()
	 * @see #getWORKDIR()
	 * @generated
	 */
	EReference getWORKDIR_Path();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.STOPSIGNAL <em>STOPSIGNAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STOPSIGNAL</em>'.
	 * @see com.s5.mde.dockerfiledsl.STOPSIGNAL
	 * @generated
	 */
	EClass getSTOPSIGNAL();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.STOPSIGNAL#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal</em>'.
	 * @see com.s5.mde.dockerfiledsl.STOPSIGNAL#getSignal()
	 * @see #getSTOPSIGNAL()
	 * @generated
	 */
	EReference getSTOPSIGNAL_Signal();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see com.s5.mde.dockerfiledsl.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value</em>'.
	 * @see com.s5.mde.dockerfiledsl.KeyValue
	 * @generated
	 */
	EClass getKeyValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.KeyValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see com.s5.mde.dockerfiledsl.KeyValue#getKey()
	 * @see #getKeyValue()
	 * @generated
	 */
	EReference getKeyValue_Key();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.KeyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.s5.mde.dockerfiledsl.KeyValue#getValue()
	 * @see #getKeyValue()
	 * @generated
	 */
	EReference getKeyValue_Value();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.USER <em>USER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>USER</em>'.
	 * @see com.s5.mde.dockerfiledsl.USER
	 * @generated
	 */
	EClass getUSER();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.USER#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see com.s5.mde.dockerfiledsl.USER#getUser()
	 * @see #getUSER()
	 * @generated
	 */
	EReference getUSER_User();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.USER#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see com.s5.mde.dockerfiledsl.USER#getGroup()
	 * @see #getUSER()
	 * @generated
	 */
	EReference getUSER_Group();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Src <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src</em>'.
	 * @see com.s5.mde.dockerfiledsl.Src
	 * @generated
	 */
	EClass getSrc();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see com.s5.mde.dockerfiledsl.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Path#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Path#getStr()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see com.s5.mde.dockerfiledsl.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.ENV <em>ENV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENV</em>'.
	 * @see com.s5.mde.dockerfiledsl.ENV
	 * @generated
	 */
	EClass getENV();

	/**
	 * Returns the meta object for the containment reference list '{@link com.s5.mde.dockerfiledsl.ENV#getKeyvalues <em>Keyvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyvalues</em>'.
	 * @see com.s5.mde.dockerfiledsl.ENV#getKeyvalues()
	 * @see #getENV()
	 * @generated
	 */
	EReference getENV_Keyvalues();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see com.s5.mde.dockerfiledsl.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Signal#getSig <em>Sig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sig</em>'.
	 * @see com.s5.mde.dockerfiledsl.Signal#getSig()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Sig();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.ONBUILD <em>ONBUILD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ONBUILD</em>'.
	 * @see com.s5.mde.dockerfiledsl.ONBUILD
	 * @generated
	 */
	EClass getONBUILD();

	/**
	 * Returns the meta object for the containment reference list '{@link com.s5.mde.dockerfiledsl.ONBUILD#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see com.s5.mde.dockerfiledsl.ONBUILD#getInstructions()
	 * @see #getONBUILD()
	 * @generated
	 */
	EReference getONBUILD_Instructions();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Retries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retries</em>'.
	 * @see com.s5.mde.dockerfiledsl.Retries
	 * @generated
	 */
	EClass getRetries();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Retries#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Retries#getStr()
	 * @see #getRetries()
	 * @generated
	 */
	EAttribute getRetries_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see com.s5.mde.dockerfiledsl.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Value#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Value#getStr()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Checksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checksum</em>'.
	 * @see com.s5.mde.dockerfiledsl.Checksum
	 * @generated
	 */
	EClass getChecksum();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Checksum#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Checksum#getStr()
	 * @see #getChecksum()
	 * @generated
	 */
	EAttribute getChecksum_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.VOLUME <em>VOLUME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VOLUME</em>'.
	 * @see com.s5.mde.dockerfiledsl.VOLUME
	 * @generated
	 */
	EClass getVOLUME();

	/**
	 * Returns the meta object for the containment reference list '{@link com.s5.mde.dockerfiledsl.VOLUME#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see com.s5.mde.dockerfiledsl.VOLUME#getData()
	 * @see #getVOLUME()
	 * @generated
	 */
	EReference getVOLUME_Data();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see com.s5.mde.dockerfiledsl.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Protocol#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Protocol#getStr()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.ExecForm <em>Exec Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exec Form</em>'.
	 * @see com.s5.mde.dockerfiledsl.ExecForm
	 * @generated
	 */
	EClass getExecForm();

	/**
	 * Returns the meta object for the attribute list '{@link com.s5.mde.dockerfiledsl.ExecForm#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see com.s5.mde.dockerfiledsl.ExecForm#getArgs()
	 * @see #getExecForm()
	 * @generated
	 */
	EAttribute getExecForm_Args();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.LABEL <em>LABEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LABEL</em>'.
	 * @see com.s5.mde.dockerfiledsl.LABEL
	 * @generated
	 */
	EClass getLABEL();

	/**
	 * Returns the meta object for the containment reference list '{@link com.s5.mde.dockerfiledsl.LABEL#getKeyvalues <em>Keyvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyvalues</em>'.
	 * @see com.s5.mde.dockerfiledsl.LABEL#getKeyvalues()
	 * @see #getLABEL()
	 * @generated
	 */
	EReference getLABEL_Keyvalues();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see com.s5.mde.dockerfiledsl.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Name#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Name#getStr()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see com.s5.mde.dockerfiledsl.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Group#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Group#getStr()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.EXPOSE <em>EXPOSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EXPOSE</em>'.
	 * @see com.s5.mde.dockerfiledsl.EXPOSE
	 * @generated
	 */
	EClass getEXPOSE();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.EXPOSE#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see com.s5.mde.dockerfiledsl.EXPOSE#getPort()
	 * @see #getEXPOSE()
	 * @generated
	 */
	EReference getEXPOSE_Port();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.EXPOSE#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see com.s5.mde.dockerfiledsl.EXPOSE#getProtocol()
	 * @see #getEXPOSE()
	 * @generated
	 */
	EReference getEXPOSE_Protocol();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.RUN <em>RUN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RUN</em>'.
	 * @see com.s5.mde.dockerfiledsl.RUN
	 * @generated
	 */
	EClass getRUN();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.RUN#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see com.s5.mde.dockerfiledsl.RUN#getCommand()
	 * @see #getRUN()
	 * @generated
	 */
	EReference getRUN_Command();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.ENTRYPOINT <em>ENTRYPOINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENTRYPOINT</em>'.
	 * @see com.s5.mde.dockerfiledsl.ENTRYPOINT
	 * @generated
	 */
	EClass getENTRYPOINT();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.ENTRYPOINT#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see com.s5.mde.dockerfiledsl.ENTRYPOINT#getCommand()
	 * @see #getENTRYPOINT()
	 * @generated
	 */
	EReference getENTRYPOINT_Command();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see com.s5.mde.dockerfiledsl.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Key#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Key#getStr()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see com.s5.mde.dockerfiledsl.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Image#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Image#getStr()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Str();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.Image#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tag</em>'.
	 * @see com.s5.mde.dockerfiledsl.Image#getTag()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Tag();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.ARG <em>ARG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARG</em>'.
	 * @see com.s5.mde.dockerfiledsl.ARG
	 * @generated
	 */
	EClass getARG();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.ARG#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see com.s5.mde.dockerfiledsl.ARG#getName()
	 * @see #getARG()
	 * @generated
	 */
	EReference getARG_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.ARG#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.s5.mde.dockerfiledsl.ARG#getValue()
	 * @see #getARG()
	 * @generated
	 */
	EReference getARG_Value();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see com.s5.mde.dockerfiledsl.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Platform#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Platform#getStr()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Dest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dest</em>'.
	 * @see com.s5.mde.dockerfiledsl.Dest
	 * @generated
	 */
	EClass getDest();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see com.s5.mde.dockerfiledsl.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Interval#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Interval#getStr()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout</em>'.
	 * @see com.s5.mde.dockerfiledsl.Timeout
	 * @generated
	 */
	EClass getTimeout();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Timeout#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Timeout#getStr()
	 * @see #getTimeout()
	 * @generated
	 */
	EAttribute getTimeout_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Dockerfile <em>Dockerfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dockerfile</em>'.
	 * @see com.s5.mde.dockerfiledsl.Dockerfile
	 * @generated
	 */
	EClass getDockerfile();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Dockerfile#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.s5.mde.dockerfiledsl.Dockerfile#getPath()
	 * @see #getDockerfile()
	 * @generated
	 */
	EAttribute getDockerfile_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link com.s5.mde.dockerfiledsl.Dockerfile#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see com.s5.mde.dockerfiledsl.Dockerfile#getInstructions()
	 * @see #getDockerfile()
	 * @generated
	 */
	EReference getDockerfile_Instructions();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see com.s5.mde.dockerfiledsl.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.Option#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see com.s5.mde.dockerfiledsl.Option#getInterval()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Interval();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.Option#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see com.s5.mde.dockerfiledsl.Option#getTimeout()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.Option#getStartperiod <em>Startperiod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Startperiod</em>'.
	 * @see com.s5.mde.dockerfiledsl.Option#getStartperiod()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Startperiod();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.Option#getRetries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retries</em>'.
	 * @see com.s5.mde.dockerfiledsl.Option#getRetries()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Retries();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see com.s5.mde.dockerfiledsl.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Tag#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Tag#getStr()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Usr <em>Usr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usr</em>'.
	 * @see com.s5.mde.dockerfiledsl.Usr
	 * @generated
	 */
	EClass getUsr();

	/**
	 * Returns the meta object for the attribute '{@link com.s5.mde.dockerfiledsl.Usr#getStr <em>Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str</em>'.
	 * @see com.s5.mde.dockerfiledsl.Usr#getStr()
	 * @see #getUsr()
	 * @generated
	 */
	EAttribute getUsr_Str();

	/**
	 * Returns the meta object for class '{@link com.s5.mde.dockerfiledsl.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see com.s5.mde.dockerfiledsl.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the containment reference '{@link com.s5.mde.dockerfiledsl.Main#getDockerfile <em>Dockerfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dockerfile</em>'.
	 * @see com.s5.mde.dockerfiledsl.Main#getDockerfile()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Dockerfile();

	/**
	 * Returns the meta object for enum '{@link com.s5.mde.dockerfiledsl.Signals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signals</em>'.
	 * @see com.s5.mde.dockerfiledsl.Signals
	 * @generated
	 */
	EEnum getSignals();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DockerfiledslFactory getDockerfiledslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.HEALTHCHECKImpl <em>HEALTHCHECK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.HEALTHCHECKImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getHEALTHCHECK()
		 * @generated
		 */
		EClass HEALTHCHECK = eINSTANCE.getHEALTHCHECK();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTHCHECK__OPTION = eINSTANCE.getHEALTHCHECK_Option();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTHCHECK__CMD = eINSTANCE.getHEALTHCHECK_Cmd();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ADDImpl <em>ADD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ADDImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getADD()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getADD();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__SRC = eINSTANCE.getADD_Src();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__DEST = eINSTANCE.getADD_Dest();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__CHECKSUM = eINSTANCE.getADD_Checksum();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__USER = eINSTANCE.getADD_User();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__GROUP = eINSTANCE.getADD_Group();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.SHELLImpl <em>SHELL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.SHELLImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSHELL()
		 * @generated
		 */
		EClass SHELL = eINSTANCE.getSHELL();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHELL__CMD = eINSTANCE.getSHELL_Cmd();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.SchellFormImpl <em>Schell Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.SchellFormImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSchellForm()
		 * @generated
		 */
		EClass SCHELL_FORM = eINSTANCE.getSchellForm();

		/**
		 * The meta object literal for the '<em><b>Executable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHELL_FORM__EXECUTABLE = eINSTANCE.getSchellForm_Executable();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHELL_FORM__CMD = eINSTANCE.getSchellForm_Cmd();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.StartPeriodImpl <em>Start Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.StartPeriodImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getStartPeriod()
		 * @generated
		 */
		EClass START_PERIOD = eINSTANCE.getStartPeriod();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_PERIOD__STR = eINSTANCE.getStartPeriod_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.FROMImpl <em>FROM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.FROMImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getFROM()
		 * @generated
		 */
		EClass FROM = eINSTANCE.getFROM();

		/**
		 * The meta object literal for the '<em><b>Platfom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__PLATFOM = eINSTANCE.getFROM_Platfom();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__IMAGE = eINSTANCE.getFROM_Image();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__NAME = eINSTANCE.getFROM_Name();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.InstructionImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.CMDImpl <em>CMD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.CMDImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getCMD()
		 * @generated
		 */
		EClass CMD = eINSTANCE.getCMD();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD__COMMAND = eINSTANCE.getCMD_Command();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.COPYImpl <em>COPY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.COPYImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getCOPY()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCOPY();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__SRC = eINSTANCE.getCOPY_Src();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__DEST = eINSTANCE.getCOPY_Dest();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__USER = eINSTANCE.getCOPY_User();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__GROUP = eINSTANCE.getCOPY_Group();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.PortImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__STR = eINSTANCE.getPort_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.WORKDIRImpl <em>WORKDIR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.WORKDIRImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getWORKDIR()
		 * @generated
		 */
		EClass WORKDIR = eINSTANCE.getWORKDIR();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKDIR__PATH = eINSTANCE.getWORKDIR_Path();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.STOPSIGNALImpl <em>STOPSIGNAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.STOPSIGNALImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSTOPSIGNAL()
		 * @generated
		 */
		EClass STOPSIGNAL = eINSTANCE.getSTOPSIGNAL();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOPSIGNAL__SIGNAL = eINSTANCE.getSTOPSIGNAL_Signal();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.DataImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.KeyValueImpl <em>Key Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.KeyValueImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getKeyValue()
		 * @generated
		 */
		EClass KEY_VALUE = eINSTANCE.getKeyValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE__KEY = eINSTANCE.getKeyValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_VALUE__VALUE = eINSTANCE.getKeyValue_Value();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.USERImpl <em>USER</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.USERImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getUSER()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUSER();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USER = eINSTANCE.getUSER_User();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__GROUP = eINSTANCE.getUSER_Group();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.SrcImpl <em>Src</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.SrcImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSrc()
		 * @generated
		 */
		EClass SRC = eINSTANCE.getSrc();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.PathImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__STR = eINSTANCE.getPath_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.CommandImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ENVImpl <em>ENV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ENVImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getENV()
		 * @generated
		 */
		EClass ENV = eINSTANCE.getENV();

		/**
		 * The meta object literal for the '<em><b>Keyvalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV__KEYVALUES = eINSTANCE.getENV_Keyvalues();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.SignalImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Sig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__SIG = eINSTANCE.getSignal_Sig();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ONBUILDImpl <em>ONBUILD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ONBUILDImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getONBUILD()
		 * @generated
		 */
		EClass ONBUILD = eINSTANCE.getONBUILD();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONBUILD__INSTRUCTIONS = eINSTANCE.getONBUILD_Instructions();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.RetriesImpl <em>Retries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.RetriesImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getRetries()
		 * @generated
		 */
		EClass RETRIES = eINSTANCE.getRetries();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRIES__STR = eINSTANCE.getRetries_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ValueImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__STR = eINSTANCE.getValue_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ChecksumImpl <em>Checksum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ChecksumImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getChecksum()
		 * @generated
		 */
		EClass CHECKSUM = eINSTANCE.getChecksum();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKSUM__STR = eINSTANCE.getChecksum_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.VOLUMEImpl <em>VOLUME</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.VOLUMEImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getVOLUME()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVOLUME();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__DATA = eINSTANCE.getVOLUME_Data();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ProtocolImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__STR = eINSTANCE.getProtocol_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ExecFormImpl <em>Exec Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ExecFormImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getExecForm()
		 * @generated
		 */
		EClass EXEC_FORM = eINSTANCE.getExecForm();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEC_FORM__ARGS = eINSTANCE.getExecForm_Args();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.LABELImpl <em>LABEL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.LABELImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getLABEL()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLABEL();

		/**
		 * The meta object literal for the '<em><b>Keyvalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__KEYVALUES = eINSTANCE.getLABEL_Keyvalues();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.NameImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME__STR = eINSTANCE.getName_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.GroupImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__STR = eINSTANCE.getGroup_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.EXPOSEImpl <em>EXPOSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.EXPOSEImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getEXPOSE()
		 * @generated
		 */
		EClass EXPOSE = eINSTANCE.getEXPOSE();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSE__PORT = eINSTANCE.getEXPOSE_Port();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSE__PROTOCOL = eINSTANCE.getEXPOSE_Protocol();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.RUNImpl <em>RUN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.RUNImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getRUN()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRUN();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__COMMAND = eINSTANCE.getRUN_Command();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ENTRYPOINTImpl <em>ENTRYPOINT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ENTRYPOINTImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getENTRYPOINT()
		 * @generated
		 */
		EClass ENTRYPOINT = eINSTANCE.getENTRYPOINT();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRYPOINT__COMMAND = eINSTANCE.getENTRYPOINT_Command();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.KeyImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__STR = eINSTANCE.getKey_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ImageImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__STR = eINSTANCE.getImage_Str();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__TAG = eINSTANCE.getImage_Tag();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.ARGImpl <em>ARG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.ARGImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getARG()
		 * @generated
		 */
		EClass ARG = eINSTANCE.getARG();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARG__NAME = eINSTANCE.getARG_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARG__VALUE = eINSTANCE.getARG_Value();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.PlatformImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__STR = eINSTANCE.getPlatform_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.DestImpl <em>Dest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.DestImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getDest()
		 * @generated
		 */
		EClass DEST = eINSTANCE.getDest();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.IntervalImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__STR = eINSTANCE.getInterval_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.TimeoutImpl <em>Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.TimeoutImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getTimeout()
		 * @generated
		 */
		EClass TIMEOUT = eINSTANCE.getTimeout();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEOUT__STR = eINSTANCE.getTimeout_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.DockerfileImpl <em>Dockerfile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfileImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getDockerfile()
		 * @generated
		 */
		EClass DOCKERFILE = eINSTANCE.getDockerfile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKERFILE__PATH = eINSTANCE.getDockerfile_Path();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKERFILE__INSTRUCTIONS = eINSTANCE.getDockerfile_Instructions();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.OptionImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__INTERVAL = eINSTANCE.getOption_Interval();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__TIMEOUT = eINSTANCE.getOption_Timeout();

		/**
		 * The meta object literal for the '<em><b>Startperiod</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__STARTPERIOD = eINSTANCE.getOption_Startperiod();

		/**
		 * The meta object literal for the '<em><b>Retries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__RETRIES = eINSTANCE.getOption_Retries();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.TagImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__STR = eINSTANCE.getTag_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.UsrImpl <em>Usr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.UsrImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getUsr()
		 * @generated
		 */
		EClass USR = eINSTANCE.getUsr();

		/**
		 * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USR__STR = eINSTANCE.getUsr_Str();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.impl.MainImpl
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Dockerfile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__DOCKERFILE = eINSTANCE.getMain_Dockerfile();

		/**
		 * The meta object literal for the '{@link com.s5.mde.dockerfiledsl.Signals <em>Signals</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.s5.mde.dockerfiledsl.Signals
		 * @see com.s5.mde.dockerfiledsl.impl.DockerfiledslPackageImpl#getSignals()
		 * @generated
		 */
		EEnum SIGNALS = eINSTANCE.getSignals();

	}

} //DockerfiledslPackage
