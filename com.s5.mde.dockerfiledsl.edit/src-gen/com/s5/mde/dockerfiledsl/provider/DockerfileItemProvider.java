/**
 */
package com.s5.mde.dockerfiledsl.provider;

import com.s5.mde.dockerfiledsl.Dockerfile;
import com.s5.mde.dockerfiledsl.DockerfiledslFactory;
import com.s5.mde.dockerfiledsl.DockerfiledslPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.s5.mde.dockerfiledsl.Dockerfile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerfileItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerfileItemProvider(AdapterFactory adapterFactory) {
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

			addPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dockerfile_path_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dockerfile_path_feature",
								"_UI_Dockerfile_type"),
						DockerfiledslPackage.Literals.DOCKERFILE__PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS);
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
	 * This returns Dockerfile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dockerfile"));
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
		String label = ((Dockerfile) object).getPath();
		return label == null || label.length() == 0 ? getString("_UI_Dockerfile_type")
				: getString("_UI_Dockerfile_type") + " " + label;
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

		switch (notification.getFeatureID(Dockerfile.class)) {
		case DockerfiledslPackage.DOCKERFILE__PATH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DockerfiledslPackage.DOCKERFILE__INSTRUCTIONS:
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

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createHEALTHCHECK()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createADD()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createSHELL()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createFROM()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createCMD()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createCOPY()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createWORKDIR()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createSTOPSIGNAL()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createUSER()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createENV()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createONBUILD()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createVOLUME()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createLABEL()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createEXPOSE()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createRUN()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createENTRYPOINT()));

		newChildDescriptors.add(createChildParameter(DockerfiledslPackage.Literals.DOCKERFILE__INSTRUCTIONS,
				DockerfiledslFactory.eINSTANCE.createARG()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DockerfiledslEditPlugin.INSTANCE;
	}

}
