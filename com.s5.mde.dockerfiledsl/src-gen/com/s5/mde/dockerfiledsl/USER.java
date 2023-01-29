/**
 */
package com.s5.mde.dockerfiledsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>USER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.USER#getUser <em>User</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.USER#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getUSER()
 * @model
 * @generated
 */
public interface USER extends Instruction {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(Usr)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getUSER_User()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Usr getUser();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.USER#getUser <em>User</em>}' containment reference.
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
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getUSER_Group()
	 * @model containment="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.USER#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

} // USER
