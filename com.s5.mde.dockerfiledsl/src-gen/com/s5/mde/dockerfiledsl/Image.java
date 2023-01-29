/**
 */
package com.s5.mde.dockerfiledsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.Image#getStr <em>Str</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.Image#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends EObject {
	/**
	 * Returns the value of the '<em><b>Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str</em>' attribute.
	 * @see #setStr(String)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getImage_Str()
	 * @model required="true"
	 * @generated
	 */
	String getStr();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.Image#getStr <em>Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str</em>' attribute.
	 * @see #getStr()
	 * @generated
	 */
	void setStr(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference.
	 * @see #setTag(Tag)
	 * @see com.s5.mde.dockerfiledsl.DockerfiledslPackage#getImage_Tag()
	 * @model containment="true"
	 * @generated
	 */
	Tag getTag();

	/**
	 * Sets the value of the '{@link com.s5.mde.dockerfiledsl.Image#getTag <em>Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' containment reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Tag value);

} // Image
