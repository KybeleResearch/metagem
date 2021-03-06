/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL.provider;

import RubyTL.Binding;
import RubyTL.ExpGet;
import RubyTL.ExpVariable;
import RubyTL.RubyTLFactory;
import RubyTL.RubyTLPackage;

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
 * This is the item provider adapter for a {@link RubyTL.Binding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingItemProvider(AdapterFactory adapterFactory) {
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

			addPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_property_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_property_feature", "_UI_Binding_type"),
				 RubyTLPackage.Literals.BINDING__PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RubyTLPackage.Literals.BINDING__TARGET);
			childrenFeatures.add(RubyTLPackage.Literals.BINDING__SOURCE);
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
	 * This returns Binding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Binding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public String getText(Object object) {
		String label = "";
		if(((Binding)object).getProperty()!=null)
			label=((Binding)object).getProperty();
		
		String source="";
		if(((Binding)object).getSource()!=null){
			if(((Binding)object).getSource().getClass().getName().equals("RubyTL.impl.ExpGetImpl")){
				ExpGet get=(ExpGet) ((Binding)object).getSource();
				String sourceGet="";
				if(get.getSource()!=null){
					ExpVariable var=get.getSource();
					if(var.getVariable()!=null){
						sourceGet=var.getVariable().getName()+".";
					}
				}
				source=sourceGet+get.getProperty();
			}else{ //ExpVariable
				ExpVariable var=(ExpVariable) ((Binding)object).getSource();
				if(var.getVariable()!=null){
					source=var.getVariable().getName();
				}
			}
		}
		
		String target="";
		if(((Binding)object).getTarget()!=null){
			if(((Binding)object).getTarget().getClass().getName().equals("RubyTL.impl.ExpGetImpl")){
				ExpGet get=(ExpGet) ((Binding)object).getTarget();
				String sourceGet="";
				if(get.getSource()!=null){
					ExpVariable var=get.getSource();
					if(var.getVariable()!=null){
						sourceGet=var.getVariable().getName()+".";
					}
				}
				target=sourceGet+get.getProperty();
			}else{ //ExpVariable
				ExpVariable var=(ExpVariable) ((Binding)object).getTarget();
				if(var.getVariable()!=null){
					target=var.getVariable().getName();
				}
			}
		}
		
		String label2=" ("+source+"->"+target+")";
		label+=label2;
		return label == null || label.length() == 0 ?
			getString("_UI_Binding_type") :
			getString("_UI_Binding_type") + " " +label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Binding.class)) {
			case RubyTLPackage.BINDING__PROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RubyTLPackage.BINDING__TARGET:
			case RubyTLPackage.BINDING__SOURCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RubyTLPackage.Literals.BINDING__TARGET,
				 RubyTLFactory.eINSTANCE.createExpVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RubyTLPackage.Literals.BINDING__TARGET,
				 RubyTLFactory.eINSTANCE.createExpGet()));

		newChildDescriptors.add
			(createChildParameter
				(RubyTLPackage.Literals.BINDING__SOURCE,
				 RubyTLFactory.eINSTANCE.createExpVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RubyTLPackage.Literals.BINDING__SOURCE,
				 RubyTLFactory.eINSTANCE.createExpGet()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == RubyTLPackage.Literals.BINDING__TARGET ||
			childFeature == RubyTLPackage.Literals.BINDING__SOURCE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RubyTLEditPlugin.INSTANCE;
	}

}
