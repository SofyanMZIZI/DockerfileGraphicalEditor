/**
 */
package com.s5.mde.dockerfiledsl.provider;

import com.s5.mde.dockerfiledsl.ADD;
import com.s5.mde.dockerfiledsl.DockerfiledslFactory;
import com.s5.mde.dockerfiledsl.DockerfiledslPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.s5.mde.dockerfiledsl.ADD} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ADDItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADDItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DockerfiledslPackage.Literals.ADD__SRC);
			childrenFeatures.add(DockerfiledslPackage.Literals.ADD__DEST);
			childrenFeatures.add(DockerfiledslPackage.Literals.ADD__CHECKSUM);
			childrenFeatures.add(DockerfiledslPackage.Literals.ADD__USER);
			childrenFeatures.add(DockerfiledslPackage.Literals.ADD__GROUP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ADD.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ADD"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ADD_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ADD.class)) {
		case DockerfiledslPackage.ADD__SRC:
		case DockerfiledslPackage.ADD__DEST:
		case DockerfiledslPackage.ADD__CHECKSUM:
		case DockerfiledslPackage.ADD__USER:
		case DockerfiledslPackage.ADD__GROUP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.ADD__SRC,
				DockerfiledslFactory.eINSTANCE.createSrc()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.ADD__DEST,
				DockerfiledslFactory.eINSTANCE.createDest()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.ADD__CHECKSUM,
				DockerfiledslFactory.eINSTANCE.createChecksum()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.ADD__USER,
				DockerfiledslFactory.eINSTANCE.createUsr()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.ADD__GROUP,
				DockerfiledslFactory.eINSTANCE.createGroup()));
	}

}
