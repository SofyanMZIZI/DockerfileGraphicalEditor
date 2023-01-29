/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COPY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.COPY#getSrc <em>Src</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.COPY#getDest <em>Dest</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.COPY#getUser <em>User</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.COPY#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getCOPY()
 * @model
 * @generated
 */
public interface COPY extends Instruction {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' containment reference.
	 * @see #setSrc(Src)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getCOPY_Src()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Src getSrc();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.COPY#getSrc <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' containment reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Src value);

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' containment reference.
	 * @see #setDest(Dest)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getCOPY_Dest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dest getDest();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.COPY#getDest <em>Dest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' containment reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(Dest value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(Usr)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getCOPY_User()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Usr getUser();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.COPY#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(Usr value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getCOPY_Group()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.COPY#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

} // COPY
