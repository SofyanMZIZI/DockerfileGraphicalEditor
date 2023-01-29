/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FROM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.FROM#getPlatfom <em>Platfom</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.FROM#getImage <em>Image</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.FROM#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getFROM()
 * @model
 * @generated
 */
public interface FROM extends Instruction {
	/**
	 * Returns the value of the '<em><b>Platfom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platfom</em>' containment reference.
	 * @see #setPlatfom(Platform)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getFROM_Platfom()
	 * @model containment="true"
	 * @generated
	 */
	Platform getPlatfom();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.FROM#getPlatfom <em>Platfom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platfom</em>' containment reference.
	 * @see #getPlatfom()
	 * @generated
	 */
	void setPlatfom(Platform value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Image)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getFROM_Image()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.FROM#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getFROM_Name()
	 * @model containment="true"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.FROM#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

} // FROM
