/**
 */
package com.s5.mde.dockerfiledsl.impl;

import com.s5.mde.dockerfiledsl.ADD;
import com.s5.mde.dockerfiledsl.Checksum;
import com.s5.mde.dockerfiledsl.Dest;
import com.s5.mde.dockerfiledsl.DockerfiledslPackage;
import com.s5.mde.dockerfiledsl.Group;
import com.s5.mde.dockerfiledsl.Src;
import com.s5.mde.dockerfiledsl.Usr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.ADDImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.ADDImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.ADDImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.ADDImpl#getUser <em>User</em>}</li>
 *   <li>{@link com.s5.mde.dockerfiledsl.impl.ADDImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ADDImpl extends InstructionImpl implements ADD {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Src src;

	/**
	 * The cached value of the '{@link #getDest() <em>Dest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected Dest dest;

	/**
	 * The cached value of the '{@link #getChecksum() <em>Checksum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected Checksum checksum;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected Usr user;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerfiledslPackage.Literals.ADD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Src getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Src newSrc, NotificationChain msgs) {
		Src oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.ADD__SRC, oldSrc, newSrc);
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
	public void setSrc(Src newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__SRC, null, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__SRC, null, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.ADD__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dest getDest() {
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDest(Dest newDest, NotificationChain msgs) {
		Dest oldDest = dest;
		dest = newDest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.ADD__DEST, oldDest, newDest);
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
	public void setDest(Dest newDest) {
		if (newDest != dest) {
			NotificationChain msgs = null;
			if (dest != null)
				msgs = ((InternalEObject) dest).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__DEST, null, msgs);
			if (newDest != null)
				msgs = ((InternalEObject) newDest).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__DEST, null, msgs);
			msgs = basicSetDest(newDest, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.ADD__DEST, newDest, newDest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checksum getChecksum() {
		return checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChecksum(Checksum newChecksum, NotificationChain msgs) {
		Checksum oldChecksum = checksum;
		checksum = newChecksum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.ADD__CHECKSUM, oldChecksum, newChecksum);
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
	public void setChecksum(Checksum newChecksum) {
		if (newChecksum != checksum) {
			NotificationChain msgs = null;
			if (checksum != null)
				msgs = ((InternalEObject) checksum).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__CHECKSUM, null, msgs);
			if (newChecksum != null)
				msgs = ((InternalEObject) newChecksum).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__CHECKSUM, null, msgs);
			msgs = basicSetChecksum(newChecksum, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.ADD__CHECKSUM, newChecksum,
					newChecksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usr getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(Usr newUser, NotificationChain msgs) {
		Usr oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.ADD__USER, oldUser, newUser);
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
	public void setUser(Usr newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject) newUser).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.ADD__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockerfiledslPackage.ADD__GROUP, oldGroup, newGroup);
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
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject) group).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject) newGroup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockerfiledslPackage.ADD__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerfiledslPackage.ADD__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockerfiledslPackage.ADD__SRC:
			return basicSetSrc(null, msgs);
		case DockerfiledslPackage.ADD__DEST:
			return basicSetDest(null, msgs);
		case DockerfiledslPackage.ADD__CHECKSUM:
			return basicSetChecksum(null, msgs);
		case DockerfiledslPackage.ADD__USER:
			return basicSetUser(null, msgs);
		case DockerfiledslPackage.ADD__GROUP:
			return basicSetGroup(null, msgs);
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
		case DockerfiledslPackage.ADD__SRC:
			return getSrc();
		case DockerfiledslPackage.ADD__DEST:
			return getDest();
		case DockerfiledslPackage.ADD__CHECKSUM:
			return getChecksum();
		case DockerfiledslPackage.ADD__USER:
			return getUser();
		case DockerfiledslPackage.ADD__GROUP:
			return getGroup();
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
		case DockerfiledslPackage.ADD__SRC:
			setSrc((Src) newValue);
			return;
		case DockerfiledslPackage.ADD__DEST:
			setDest((Dest) newValue);
			return;
		case DockerfiledslPackage.ADD__CHECKSUM:
			setChecksum((Checksum) newValue);
			return;
		case DockerfiledslPackage.ADD__USER:
			setUser((Usr) newValue);
			return;
		case DockerfiledslPackage.ADD__GROUP:
			setGroup((Group) newValue);
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
		case DockerfiledslPackage.ADD__SRC:
			setSrc((Src) null);
			return;
		case DockerfiledslPackage.ADD__DEST:
			setDest((Dest) null);
			return;
		case DockerfiledslPackage.ADD__CHECKSUM:
			setChecksum((Checksum) null);
			return;
		case DockerfiledslPackage.ADD__USER:
			setUser((Usr) null);
			return;
		case DockerfiledslPackage.ADD__GROUP:
			setGroup((Group) null);
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
		case DockerfiledslPackage.ADD__SRC:
			return src != null;
		case DockerfiledslPackage.ADD__DEST:
			return dest != null;
		case DockerfiledslPackage.ADD__CHECKSUM:
			return checksum != null;
		case DockerfiledslPackage.ADD__USER:
			return user != null;
		case DockerfiledslPackage.ADD__GROUP:
			return group != null;
		}
		return super.eIsSet(featureID);
	}

} //ADDImpl
