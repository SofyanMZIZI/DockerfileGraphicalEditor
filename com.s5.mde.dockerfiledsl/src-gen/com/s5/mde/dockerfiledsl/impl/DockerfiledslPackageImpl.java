/**
 */
package com.s5.mde.dockerfiledsl.impl;

import com.s5.mde.dockerfiledsl.Checksum;
import com.s5.mde.dockerfiledsl.Command;
import com.s5.mde.dockerfiledsl.Data;
import com.s5.mde.dockerfiledsl.Dest;
import com.s5.mde.dockerfiledsl.Dockerfile;
import com.s5.mde.dockerfiledsl.DockerfiledslFactory;
import com.s5.mde.dockerfiledsl.DockerfiledslPackage;
import com.s5.mde.dockerfiledsl.ExecForm;
import com.s5.mde.dockerfiledsl.Group;
import com.s5.mde.dockerfiledsl.Image;
import com.s5.mde.dockerfiledsl.Instruction;
import com.s5.mde.dockerfiledsl.Interval;
import com.s5.mde.dockerfiledsl.Key;
import com.s5.mde.dockerfiledsl.KeyValue;
import com.s5.mde.dockerfiledsl.Main;
import com.s5.mde.dockerfiledsl.Name;
import com.s5.mde.dockerfiledsl.Option;
import com.s5.mde.dockerfiledsl.Path;
import com.s5.mde.dockerfiledsl.Platform;
import com.s5.mde.dockerfiledsl.Port;
import com.s5.mde.dockerfiledsl.Protocol;
import com.s5.mde.dockerfiledsl.Retries;
import com.s5.mde.dockerfiledsl.SchellForm;
import com.s5.mde.dockerfiledsl.Signal;
import com.s5.mde.dockerfiledsl.Signals;
import com.s5.mde.dockerfiledsl.Src;
import com.s5.mde.dockerfiledsl.StartPeriod;
import com.s5.mde.dockerfiledsl.Tag;
import com.s5.mde.dockerfiledsl.Timeout;
import com.s5.mde.dockerfiledsl.Usr;
import com.s5.mde.dockerfiledsl.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerfiledslPackageImpl extends EPackageImpl implements DockerfiledslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schellFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workdirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopsignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onbuildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checksumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass execFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entrypointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DockerfiledslPackageImpl() {
		super(eNS_URI, DockerfiledslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DockerfiledslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DockerfiledslPackage init() {
		if (isInited)
			return (DockerfiledslPackage) EPackage.Registry.INSTANCE.getEPackage(DockerfiledslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDockerfiledslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DockerfiledslPackageImpl theDockerfiledslPackage = registeredDockerfiledslPackage instanceof DockerfiledslPackageImpl
				? (DockerfiledslPackageImpl) registeredDockerfiledslPackage
				: new DockerfiledslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDockerfiledslPackage.createPackageContents();

		// Initialize created meta-data
		theDockerfiledslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDockerfiledslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DockerfiledslPackage.eNS_URI, theDockerfiledslPackage);
		return theDockerfiledslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHEALTHCHECK() {
		return healthcheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHEALTHCHECK_Option() {
		return (EReference) healthcheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHEALTHCHECK_Cmd() {
		return (EReference) healthcheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADD() {
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADD_Src() {
		return (EReference) addEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADD_Dest() {
		return (EReference) addEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADD_Checksum() {
		return (EReference) addEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADD_User() {
		return (EReference) addEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADD_Group() {
		return (EReference) addEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSHELL() {
		return shellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSHELL_Cmd() {
		return (EReference) shellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchellForm() {
		return schellFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchellForm_Executable() {
		return (EAttribute) schellFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchellForm_Cmd() {
		return (EAttribute) schellFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartPeriod() {
		return startPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartPeriod_Str() {
		return (EAttribute) startPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFROM() {
		return fromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFROM_Platfom() {
		return (EReference) fromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFROM_Image() {
		return (EReference) fromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFROM_Name() {
		return (EReference) fromEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCMD() {
		return cmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMD_Command() {
		return (EReference) cmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCOPY() {
		return copyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOPY_Src() {
		return (EReference) copyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOPY_Dest() {
		return (EReference) copyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOPY_User() {
		return (EReference) copyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCOPY_Group() {
		return (EReference) copyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Str() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWORKDIR() {
		return workdirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWORKDIR_Path() {
		return (EReference) workdirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTOPSIGNAL() {
		return stopsignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTOPSIGNAL_Signal() {
		return (EReference) stopsignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValue() {
		return keyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValue_Key() {
		return (EReference) keyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValue_Value() {
		return (EReference) keyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUSER() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUSER_User() {
		return (EReference) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUSER_Group() {
		return (EReference) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrc() {
		return srcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_Str() {
		return (EAttribute) pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENV() {
		return envEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENV_Keyvalues() {
		return (EReference) envEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignal_Sig() {
		return (EAttribute) signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getONBUILD() {
		return onbuildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getONBUILD_Instructions() {
		return (EReference) onbuildEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetries() {
		return retriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetries_Str() {
		return (EAttribute) retriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Str() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChecksum() {
		return checksumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChecksum_Str() {
		return (EAttribute) checksumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVOLUME() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVOLUME_Data() {
		return (EReference) volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocol() {
		return protocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocol_Str() {
		return (EAttribute) protocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecForm() {
		return execFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecForm_Args() {
		return (EAttribute) execFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLABEL() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLABEL_Keyvalues() {
		return (EReference) labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_Str() {
		return (EAttribute) nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Str() {
		return (EAttribute) groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEXPOSE() {
		return exposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPOSE_Port() {
		return (EReference) exposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEXPOSE_Protocol() {
		return (EReference) exposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRUN() {
		return runEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRUN_Command() {
		return (EReference) runEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENTRYPOINT() {
		return entrypointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENTRYPOINT_Command() {
		return (EReference) entrypointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Str() {
		return (EAttribute) keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Str() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Tag() {
		return (EReference) imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARG() {
		return argEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARG_Name() {
		return (EReference) argEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getARG_Value() {
		return (EReference) argEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatform_Str() {
		return (EAttribute) platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDest() {
		return destEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_Str() {
		return (EAttribute) intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeout() {
		return timeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeout_Str() {
		return (EAttribute) timeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerfile() {
		return dockerfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerfile_Path() {
		return (EAttribute) dockerfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerfile_Instructions() {
		return (EReference) dockerfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Interval() {
		return (EReference) optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Timeout() {
		return (EReference) optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Startperiod() {
		return (EReference) optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Retries() {
		return (EReference) optionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Str() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsr() {
		return usrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsr_Str() {
		return (EAttribute) usrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Dockerfile() {
		return (EReference) mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignals() {
		return signalsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfiledslFactory getDockerfiledslFactory() {
		return (DockerfiledslFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		healthcheckEClass = createEClass(HEALTHCHECK);
		createEReference(healthcheckEClass, HEALTHCHECK__OPTION);
		createEReference(healthcheckEClass, HEALTHCHECK__CMD);

		addEClass = createEClass(ADD);
		createEReference(addEClass, ADD__SRC);
		createEReference(addEClass, ADD__DEST);
		createEReference(addEClass, ADD__CHECKSUM);
		createEReference(addEClass, ADD__USER);
		createEReference(addEClass, ADD__GROUP);

		shellEClass = createEClass(SHELL);
		createEReference(shellEClass, SHELL__CMD);

		schellFormEClass = createEClass(SCHELL_FORM);
		createEAttribute(schellFormEClass, SCHELL_FORM__EXECUTABLE);
		createEAttribute(schellFormEClass, SCHELL_FORM__CMD);

		startPeriodEClass = createEClass(START_PERIOD);
		createEAttribute(startPeriodEClass, START_PERIOD__STR);

		fromEClass = createEClass(FROM);
		createEReference(fromEClass, FROM__PLATFOM);
		createEReference(fromEClass, FROM__IMAGE);
		createEReference(fromEClass, FROM__NAME);

		instructionEClass = createEClass(INSTRUCTION);

		cmdEClass = createEClass(CMD);
		createEReference(cmdEClass, CMD__COMMAND);

		copyEClass = createEClass(COPY);
		createEReference(copyEClass, COPY__SRC);
		createEReference(copyEClass, COPY__DEST);
		createEReference(copyEClass, COPY__USER);
		createEReference(copyEClass, COPY__GROUP);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__STR);

		workdirEClass = createEClass(WORKDIR);
		createEReference(workdirEClass, WORKDIR__PATH);

		stopsignalEClass = createEClass(STOPSIGNAL);
		createEReference(stopsignalEClass, STOPSIGNAL__SIGNAL);

		dataEClass = createEClass(DATA);

		keyValueEClass = createEClass(KEY_VALUE);
		createEReference(keyValueEClass, KEY_VALUE__KEY);
		createEReference(keyValueEClass, KEY_VALUE__VALUE);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__USER);
		createEReference(userEClass, USER__GROUP);

		srcEClass = createEClass(SRC);

		pathEClass = createEClass(PATH);
		createEAttribute(pathEClass, PATH__STR);

		commandEClass = createEClass(COMMAND);

		envEClass = createEClass(ENV);
		createEReference(envEClass, ENV__KEYVALUES);

		signalEClass = createEClass(SIGNAL);
		createEAttribute(signalEClass, SIGNAL__SIG);

		onbuildEClass = createEClass(ONBUILD);
		createEReference(onbuildEClass, ONBUILD__INSTRUCTIONS);

		retriesEClass = createEClass(RETRIES);
		createEAttribute(retriesEClass, RETRIES__STR);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__STR);

		checksumEClass = createEClass(CHECKSUM);
		createEAttribute(checksumEClass, CHECKSUM__STR);

		volumeEClass = createEClass(VOLUME);
		createEReference(volumeEClass, VOLUME__DATA);

		protocolEClass = createEClass(PROTOCOL);
		createEAttribute(protocolEClass, PROTOCOL__STR);

		execFormEClass = createEClass(EXEC_FORM);
		createEAttribute(execFormEClass, EXEC_FORM__ARGS);

		labelEClass = createEClass(LABEL);
		createEReference(labelEClass, LABEL__KEYVALUES);

		nameEClass = createEClass(NAME);
		createEAttribute(nameEClass, NAME__STR);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__STR);

		exposeEClass = createEClass(EXPOSE);
		createEReference(exposeEClass, EXPOSE__PORT);
		createEReference(exposeEClass, EXPOSE__PROTOCOL);

		runEClass = createEClass(RUN);
		createEReference(runEClass, RUN__COMMAND);

		entrypointEClass = createEClass(ENTRYPOINT);
		createEReference(entrypointEClass, ENTRYPOINT__COMMAND);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__STR);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__STR);
		createEReference(imageEClass, IMAGE__TAG);

		argEClass = createEClass(ARG);
		createEReference(argEClass, ARG__NAME);
		createEReference(argEClass, ARG__VALUE);

		platformEClass = createEClass(PLATFORM);
		createEAttribute(platformEClass, PLATFORM__STR);

		destEClass = createEClass(DEST);

		intervalEClass = createEClass(INTERVAL);
		createEAttribute(intervalEClass, INTERVAL__STR);

		timeoutEClass = createEClass(TIMEOUT);
		createEAttribute(timeoutEClass, TIMEOUT__STR);

		dockerfileEClass = createEClass(DOCKERFILE);
		createEAttribute(dockerfileEClass, DOCKERFILE__PATH);
		createEReference(dockerfileEClass, DOCKERFILE__INSTRUCTIONS);

		optionEClass = createEClass(OPTION);
		createEReference(optionEClass, OPTION__INTERVAL);
		createEReference(optionEClass, OPTION__TIMEOUT);
		createEReference(optionEClass, OPTION__STARTPERIOD);
		createEReference(optionEClass, OPTION__RETRIES);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__STR);

		usrEClass = createEClass(USR);
		createEAttribute(usrEClass, USR__STR);

		mainEClass = createEClass(MAIN);
		createEReference(mainEClass, MAIN__DOCKERFILE);

		// Create enums
		signalsEEnum = createEEnum(SIGNALS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		healthcheckEClass.getESuperTypes().add(this.getInstruction());
		addEClass.getESuperTypes().add(this.getInstruction());
		shellEClass.getESuperTypes().add(this.getInstruction());
		schellFormEClass.getESuperTypes().add(this.getCommand());
		fromEClass.getESuperTypes().add(this.getInstruction());
		cmdEClass.getESuperTypes().add(this.getInstruction());
		copyEClass.getESuperTypes().add(this.getInstruction());
		workdirEClass.getESuperTypes().add(this.getInstruction());
		stopsignalEClass.getESuperTypes().add(this.getInstruction());
		dataEClass.getESuperTypes().add(this.getPath());
		userEClass.getESuperTypes().add(this.getInstruction());
		srcEClass.getESuperTypes().add(this.getPath());
		envEClass.getESuperTypes().add(this.getInstruction());
		onbuildEClass.getESuperTypes().add(this.getInstruction());
		volumeEClass.getESuperTypes().add(this.getInstruction());
		execFormEClass.getESuperTypes().add(this.getCommand());
		labelEClass.getESuperTypes().add(this.getInstruction());
		exposeEClass.getESuperTypes().add(this.getInstruction());
		runEClass.getESuperTypes().add(this.getInstruction());
		entrypointEClass.getESuperTypes().add(this.getInstruction());
		argEClass.getESuperTypes().add(this.getInstruction());
		destEClass.getESuperTypes().add(this.getPath());

		// Initialize classes, features, and operations; add parameters
		initEClass(healthcheckEClass, com.s5.mde.dockerfiledsl.HEALTHCHECK.class, "HEALTHCHECK", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHEALTHCHECK_Option(), this.getOption(), null, "option", null, 0, 1,
				com.s5.mde.dockerfiledsl.HEALTHCHECK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHEALTHCHECK_Cmd(), this.getCMD(), null, "cmd", null, 0, 1,
				com.s5.mde.dockerfiledsl.HEALTHCHECK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addEClass, com.s5.mde.dockerfiledsl.ADD.class, "ADD", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getADD_Src(), this.getSrc(), null, "src", null, 1, 1, com.s5.mde.dockerfiledsl.ADD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADD_Dest(), this.getDest(), null, "dest", null, 1, 1, com.s5.mde.dockerfiledsl.ADD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADD_Checksum(), this.getChecksum(), null, "checksum", null, 1, 1,
				com.s5.mde.dockerfiledsl.ADD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADD_User(), this.getUsr(), null, "user", null, 1, 1, com.s5.mde.dockerfiledsl.ADD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADD_Group(), this.getGroup(), null, "group", null, 1, 1, com.s5.mde.dockerfiledsl.ADD.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shellEClass, com.s5.mde.dockerfiledsl.SHELL.class, "SHELL", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSHELL_Cmd(), this.getExecForm(), null, "cmd", null, 0, 1,
				com.s5.mde.dockerfiledsl.SHELL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schellFormEClass, SchellForm.class, "SchellForm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchellForm_Executable(), ecorePackage.getEString(), "executable", null, 0, 1,
				SchellForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchellForm_Cmd(), ecorePackage.getEString(), "cmd", null, 1, 1, SchellForm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startPeriodEClass, StartPeriod.class, "StartPeriod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartPeriod_Str(), ecorePackage.getEString(), "str", null, 1, 1, StartPeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromEClass, com.s5.mde.dockerfiledsl.FROM.class, "FROM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFROM_Platfom(), this.getPlatform(), null, "platfom", null, 0, 1,
				com.s5.mde.dockerfiledsl.FROM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFROM_Image(), this.getImage(), null, "image", null, 1, 1, com.s5.mde.dockerfiledsl.FROM.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFROM_Name(), this.getName_(), null, "name", null, 0, 1, com.s5.mde.dockerfiledsl.FROM.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(cmdEClass, com.s5.mde.dockerfiledsl.CMD.class, "CMD", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMD_Command(), this.getCommand(), null, "command", null, 1, 1,
				com.s5.mde.dockerfiledsl.CMD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyEClass, com.s5.mde.dockerfiledsl.COPY.class, "COPY", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCOPY_Src(), this.getSrc(), null, "src", null, 1, 1, com.s5.mde.dockerfiledsl.COPY.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOPY_Dest(), this.getDest(), null, "dest", null, 1, 1, com.s5.mde.dockerfiledsl.COPY.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOPY_User(), this.getUsr(), null, "user", null, 1, 1, com.s5.mde.dockerfiledsl.COPY.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCOPY_Group(), this.getGroup(), null, "group", null, 1, 1, com.s5.mde.dockerfiledsl.COPY.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Str(), ecorePackage.getEString(), "str", null, 1, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workdirEClass, com.s5.mde.dockerfiledsl.WORKDIR.class, "WORKDIR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWORKDIR_Path(), this.getPath(), null, "path", null, 1, 1,
				com.s5.mde.dockerfiledsl.WORKDIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopsignalEClass, com.s5.mde.dockerfiledsl.STOPSIGNAL.class, "STOPSIGNAL", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSTOPSIGNAL_Signal(), this.getSignal(), null, "signal", null, 1, 1,
				com.s5.mde.dockerfiledsl.STOPSIGNAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyValueEClass, KeyValue.class, "KeyValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyValue_Key(), this.getKey(), null, "key", null, 1, 1, KeyValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getKeyValue_Value(), this.getValue(), null, "value", null, 1, 1, KeyValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(userEClass, com.s5.mde.dockerfiledsl.USER.class, "USER", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUSER_User(), this.getUsr(), null, "user", null, 1, 1, com.s5.mde.dockerfiledsl.USER.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUSER_Group(), this.getGroup(), null, "group", null, 0, 1, com.s5.mde.dockerfiledsl.USER.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcEClass, Src.class, "Src", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPath_Str(), ecorePackage.getEString(), "str", null, 1, 1, Path.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(envEClass, com.s5.mde.dockerfiledsl.ENV.class, "ENV", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getENV_Keyvalues(), this.getKeyValue(), null, "keyvalues", null, 1, -1,
				com.s5.mde.dockerfiledsl.ENV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignal_Sig(), this.getSignals(), "sig", null, 1, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onbuildEClass, com.s5.mde.dockerfiledsl.ONBUILD.class, "ONBUILD", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getONBUILD_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1,
				com.s5.mde.dockerfiledsl.ONBUILD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retriesEClass, Retries.class, "Retries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetries_Str(), ecorePackage.getEString(), "str", null, 1, 1, Retries.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Str(), ecorePackage.getEString(), "str", null, 1, 1, Value.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checksumEClass, Checksum.class, "Checksum", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChecksum_Str(), ecorePackage.getEString(), "str", null, 1, 1, Checksum.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, com.s5.mde.dockerfiledsl.VOLUME.class, "VOLUME", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVOLUME_Data(), this.getData(), null, "data", null, 1, -1,
				com.s5.mde.dockerfiledsl.VOLUME.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocol_Str(), ecorePackage.getEString(), "str", null, 1, 1, Protocol.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(execFormEClass, ExecForm.class, "ExecForm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecForm_Args(), ecorePackage.getEString(), "args", null, 2, -1, ExecForm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, com.s5.mde.dockerfiledsl.LABEL.class, "LABEL", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLABEL_Keyvalues(), this.getKeyValue(), null, "keyvalues", null, 1, -1,
				com.s5.mde.dockerfiledsl.LABEL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getName_Str(), ecorePackage.getEString(), "str", null, 1, 1, Name.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Str(), ecorePackage.getEString(), "str", null, 1, 1, Group.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exposeEClass, com.s5.mde.dockerfiledsl.EXPOSE.class, "EXPOSE", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEXPOSE_Port(), this.getPort(), null, "port", null, 1, 1,
				com.s5.mde.dockerfiledsl.EXPOSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEXPOSE_Protocol(), this.getProtocol(), null, "protocol", null, 0, 1,
				com.s5.mde.dockerfiledsl.EXPOSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runEClass, com.s5.mde.dockerfiledsl.RUN.class, "RUN", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRUN_Command(), this.getCommand(), null, "command", null, 1, 1,
				com.s5.mde.dockerfiledsl.RUN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entrypointEClass, com.s5.mde.dockerfiledsl.ENTRYPOINT.class, "ENTRYPOINT", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getENTRYPOINT_Command(), this.getCommand(), null, "command", null, 1, 1,
				com.s5.mde.dockerfiledsl.ENTRYPOINT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Str(), ecorePackage.getEString(), "str", null, 1, 1, Key.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Str(), ecorePackage.getEString(), "str", null, 1, 1, Image.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImage_Tag(), this.getTag(), null, "tag", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argEClass, com.s5.mde.dockerfiledsl.ARG.class, "ARG", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getARG_Name(), this.getName_(), null, "name", null, 1, 1, com.s5.mde.dockerfiledsl.ARG.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getARG_Value(), this.getValue(), null, "value", null, 0, 1, com.s5.mde.dockerfiledsl.ARG.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatform_Str(), ecorePackage.getEString(), "str", null, 0, 1, Platform.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(destEClass, Dest.class, "Dest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterval_Str(), ecorePackage.getEString(), "str", null, 1, 1, Interval.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeoutEClass, Timeout.class, "Timeout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeout_Str(), ecorePackage.getEString(), "str", null, 1, 1, Timeout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerfileEClass, Dockerfile.class, "Dockerfile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerfile_Path(), ecorePackage.getEString(), "path", null, 0, 1, Dockerfile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerfile_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1,
				Dockerfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOption_Interval(), this.getInterval(), null, "interval", null, 0, 1, Option.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Timeout(), this.getTimeout(), null, "timeout", null, 0, 1, Option.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOption_Startperiod(), this.getStartPeriod(), null, "startperiod", null, 0, 1, Option.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Retries(), this.getRetries(), null, "retries", null, 0, 1, Option.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Str(), ecorePackage.getEString(), "str", null, 1, 1, Tag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usrEClass, Usr.class, "Usr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsr_Str(), ecorePackage.getEString(), "str", null, 1, 1, Usr.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMain_Dockerfile(), this.getDockerfile(), null, "dockerfile", null, 1, 1, Main.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(signalsEEnum, Signals.class, "Signals");
		addEEnumLiteral(signalsEEnum, Signals.SIGHUP);
		addEEnumLiteral(signalsEEnum, Signals.SIGINT);
		addEEnumLiteral(signalsEEnum, Signals.SIGQUIT);
		addEEnumLiteral(signalsEEnum, Signals.SIGILL);
		addEEnumLiteral(signalsEEnum, Signals.SIGTRAP);
		addEEnumLiteral(signalsEEnum, Signals.SIGABRT);
		addEEnumLiteral(signalsEEnum, Signals.SIGBUS);
		addEEnumLiteral(signalsEEnum, Signals.SIGFPE);
		addEEnumLiteral(signalsEEnum, Signals.SIGKILL);
		addEEnumLiteral(signalsEEnum, Signals.SIGUSR1);
		addEEnumLiteral(signalsEEnum, Signals.SIGSEGV);
		addEEnumLiteral(signalsEEnum, Signals.SIGUSR2);
		addEEnumLiteral(signalsEEnum, Signals.SIGPIPE);
		addEEnumLiteral(signalsEEnum, Signals.SIGALRM);
		addEEnumLiteral(signalsEEnum, Signals.SIGTERM);
		addEEnumLiteral(signalsEEnum, Signals.SIGSTKFLT);
		addEEnumLiteral(signalsEEnum, Signals.SIGCHLD);
		addEEnumLiteral(signalsEEnum, Signals.SIGCONT);
		addEEnumLiteral(signalsEEnum, Signals.SIGSTOP);
		addEEnumLiteral(signalsEEnum, Signals.SIGTSTP);
		addEEnumLiteral(signalsEEnum, Signals.SIGTTIN);
		addEEnumLiteral(signalsEEnum, Signals.SIGTTOU);
		addEEnumLiteral(signalsEEnum, Signals.SIGURG);
		addEEnumLiteral(signalsEEnum, Signals.SIGXCPU);
		addEEnumLiteral(signalsEEnum, Signals.SIGXFSZ);
		addEEnumLiteral(signalsEEnum, Signals.SIGVTALRM);
		addEEnumLiteral(signalsEEnum, Signals.SIGPROF);
		addEEnumLiteral(signalsEEnum, Signals.SIGWINCH);
		addEEnumLiteral(signalsEEnum, Signals.SIGIO);
		addEEnumLiteral(signalsEEnum, Signals.SIGPWR);
		addEEnumLiteral(signalsEEnum, Signals.SIGSYS);
		addEEnumLiteral(signalsEEnum, Signals.SIGRTMIN);
		addEEnumLiteral(signalsEEnum, Signals.SIGRTMAX);

		// Create resource
		createResource(eNS_URI);
	}

} //DockerfiledslPackageImpl
