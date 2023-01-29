/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage
 * @generated
 */
public interface DockerfiledslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerfiledslFactory eINSTANCE = com.s5.mde.dockerfiledsl.impl.DockerfiledslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HEALTHCHECK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HEALTHCHECK</em>'.
	 * @generated
	 */
	HEALTHCHECK createHEALTHCHECK();

	/**
	 * Returns a new object of class '<em>ADD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADD</em>'.
	 * @generated
	 */
	ADD createADD();

	/**
	 * Returns a new object of class '<em>SHELL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SHELL</em>'.
	 * @generated
	 */
	SHELL createSHELL();

	/**
	 * Returns a new object of class '<em>Schell Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schell Form</em>'.
	 * @generated
	 */
	SchellForm createSchellForm();

	/**
	 * Returns a new object of class '<em>Start Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Period</em>'.
	 * @generated
	 */
	StartPeriod createStartPeriod();

	/**
	 * Returns a new object of class '<em>FROM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FROM</em>'.
	 * @generated
	 */
	FROM createFROM();

	/**
	 * Returns a new object of class '<em>CMD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMD</em>'.
	 * @generated
	 */
	CMD createCMD();

	/**
	 * Returns a new object of class '<em>COPY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>COPY</em>'.
	 * @generated
	 */
	COPY createCOPY();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>WORKDIR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WORKDIR</em>'.
	 * @generated
	 */
	WORKDIR createWORKDIR();

	/**
	 * Returns a new object of class '<em>STOPSIGNAL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STOPSIGNAL</em>'.
	 * @generated
	 */
	STOPSIGNAL createSTOPSIGNAL();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value</em>'.
	 * @generated
	 */
	KeyValue createKeyValue();

	/**
	 * Returns a new object of class '<em>USER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>USER</em>'.
	 * @generated
	 */
	USER createUSER();

	/**
	 * Returns a new object of class '<em>Src</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src</em>'.
	 * @generated
	 */
	Src createSrc();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>ENV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ENV</em>'.
	 * @generated
	 */
	ENV createENV();

	/**
	 * Returns a new object of class '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal</em>'.
	 * @generated
	 */
	Signal createSignal();

	/**
	 * Returns a new object of class '<em>ONBUILD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ONBUILD</em>'.
	 * @generated
	 */
	ONBUILD createONBUILD();

	/**
	 * Returns a new object of class '<em>Retries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retries</em>'.
	 * @generated
	 */
	Retries createRetries();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Checksum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checksum</em>'.
	 * @generated
	 */
	Checksum createChecksum();

	/**
	 * Returns a new object of class '<em>VOLUME</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VOLUME</em>'.
	 * @generated
	 */
	VOLUME createVOLUME();

	/**
	 * Returns a new object of class '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol</em>'.
	 * @generated
	 */
	Protocol createProtocol();

	/**
	 * Returns a new object of class '<em>Exec Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exec Form</em>'.
	 * @generated
	 */
	ExecForm createExecForm();

	/**
	 * Returns a new object of class '<em>LABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LABEL</em>'.
	 * @generated
	 */
	LABEL createLABEL();

	/**
	 * Returns a new object of class '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name</em>'.
	 * @generated
	 */
	Name createName();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>EXPOSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EXPOSE</em>'.
	 * @generated
	 */
	EXPOSE createEXPOSE();

	/**
	 * Returns a new object of class '<em>RUN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RUN</em>'.
	 * @generated
	 */
	RUN createRUN();

	/**
	 * Returns a new object of class '<em>ENTRYPOINT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ENTRYPOINT</em>'.
	 * @generated
	 */
	ENTRYPOINT createENTRYPOINT();

	/**
	 * Returns a new object of class '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key</em>'.
	 * @generated
	 */
	Key createKey();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>ARG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ARG</em>'.
	 * @generated
	 */
	ARG createARG();

	/**
	 * Returns a new object of class '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform</em>'.
	 * @generated
	 */
	Platform createPlatform();

	/**
	 * Returns a new object of class '<em>Dest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dest</em>'.
	 * @generated
	 */
	Dest createDest();

	/**
	 * Returns a new object of class '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval</em>'.
	 * @generated
	 */
	Interval createInterval();

	/**
	 * Returns a new object of class '<em>Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout</em>'.
	 * @generated
	 */
	Timeout createTimeout();

	/**
	 * Returns a new object of class '<em>Dockerfile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dockerfile</em>'.
	 * @generated
	 */
	Dockerfile createDockerfile();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Usr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usr</em>'.
	 * @generated
	 */
	Usr createUsr();

	/**
	 * Returns a new object of class '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main</em>'.
	 * @generated
	 */
	Main createMain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DockerfiledslPackage getDockerfiledslPackage();

} //DockerfiledslFactory
