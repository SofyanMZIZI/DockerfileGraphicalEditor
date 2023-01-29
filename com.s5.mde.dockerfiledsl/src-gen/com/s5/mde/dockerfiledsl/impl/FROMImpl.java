/**
 */
package com.s5.mde.dockerfiledsl.impl;

import com.s5.mde.dockerfiledsl.DockerfiledslPackage;
import com.s5.mde.dockerfiledsl.FROM;
import com.s5.mde.dockerfiledsl.Image;
import com.s5.mde.dockerfiledsl.Name;
import com.s5.mde.dockerfiledsl.Platform;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FROM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.FROMImpl#getPlatfom <em>Platfom</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.FROMImpl#getImage <em>Image</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.FROMImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FROMImpl extends InstructionImpl implements FROM {
	/**
	 * The cached value of the '{@link #getPlatfom() <em>Platfom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatfom()
	 * @generated
	 * @ordered
	 */
	protected Platform platfom;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FROMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerfiledslPackage.Literals.FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform getPlatfom() {
		return platfom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatfom(Platform newPlatfom, NotificationChain msgs) {
		Platform oldPlatfom = platfom;
		platfom = newPlatfom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.FROM__PLATFOM, oldPlatfom, newPlatfom);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatfom(Platform newPlatfom) {
		if (newPlatfom != platfom) {
			NotificationChain msgs = null;
			if (platfom != null)
				msgs = ((InternalEObject) platfom).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.FROM__PLATFOM, null, msgs);
			if (newPlatfom != null)
				msgs = ((InternalEObject) newPlatfom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.FROM__PLATFOM, null, msgs);
			msgs = basicSetPlatfom(newPlatfom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.FROM__PLATFOM, newPlatfom,
					newPlatfom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Image newImage, NotificationChain msgs) {
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.FROM__IMAGE, oldImage, newImage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Image newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject) image).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.FROM__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject) newImage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.FROM__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.FROM__IMAGE, newImage,
					newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.FROM__NAME, oldName, newName);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.FROM__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.FROM__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.FROM__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockerfiledslPackage.FROM__PLATFOM:
			return basicSetPlatfom(null, msgs);
		case DockerfiledslPackage.FROM__IMAGE:
			return basicSetImage(null, msgs);
		case DockerfiledslPackage.FROM__NAME:
			return basicSetName(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockerfiledslPackage.FROM__PLATFOM:
			return getPlatfom();
		case DockerfiledslPackage.FROM__IMAGE:
			return getImage();
		case DockerfiledslPackage.FROM__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DockerfiledslPackage.FROM__PLATFOM:
			setPlatfom((Platform) newValue);
			return;
		case DockerfiledslPackage.FROM__IMAGE:
			setImage((Image) newValue);
			return;
		case DockerfiledslPackage.FROM__NAME:
			setName((Name) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DockerfiledslPackage.FROM__PLATFOM:
			setPlatfom((Platform) null);
			return;
		case DockerfiledslPackage.FROM__IMAGE:
			setImage((Image) null);
			return;
		case DockerfiledslPackage.FROM__NAME:
			setName((Name) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DockerfiledslPackage.FROM__PLATFOM:
			return platfom != null;
		case DockerfiledslPackage.FROM__IMAGE:
			return image != null;
		case DockerfiledslPackage.FROM__NAME:
			return name != null;
		}
		return super.eIsSet(featureID);
	}

} //FROMImpl
