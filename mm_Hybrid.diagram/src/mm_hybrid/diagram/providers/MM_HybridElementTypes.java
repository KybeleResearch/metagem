/*
 * 
 */
package mm_hybrid.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MM_HybridElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private MM_HybridElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Module_79 = getElementType("mm_Hybrid.diagram.Module_79"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Rule_1001 = getElementType("mm_Hybrid.diagram.Rule_1001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InMetaModel_1002 = getElementType("mm_Hybrid.diagram.InMetaModel_1002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutMetaModel_1003 = getElementType("mm_Hybrid.diagram.OutMetaModel_1003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SourceElementRule_2001 = getElementType("mm_Hybrid.diagram.SourceElementRule_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Guard_2002 = getElementType("mm_Hybrid.diagram.Guard_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TargetElementRule_2003 = getElementType("mm_Hybrid.diagram.TargetElementRule_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Module_79, mm_hybrid.MM_HybridPackage.eINSTANCE
					.getModule());

			elements.put(Rule_1001, mm_hybrid.MM_HybridPackage.eINSTANCE
					.getRule());

			elements.put(InMetaModel_1002, mm_hybrid.MM_HybridPackage.eINSTANCE
					.getInMetaModel());

			elements.put(OutMetaModel_1003,
					mm_hybrid.MM_HybridPackage.eINSTANCE.getOutMetaModel());

			elements
					.put(SourceElementRule_2001,
							mm_hybrid.MM_HybridPackage.eINSTANCE
									.getSourceElementRule());

			elements.put(Guard_2002, mm_hybrid.MM_HybridPackage.eINSTANCE
					.getGuard());

			elements
					.put(TargetElementRule_2003,
							mm_hybrid.MM_HybridPackage.eINSTANCE
									.getTargetElementRule());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Module_79);
			KNOWN_ELEMENT_TYPES.add(Rule_1001);
			KNOWN_ELEMENT_TYPES.add(InMetaModel_1002);
			KNOWN_ELEMENT_TYPES.add(OutMetaModel_1003);
			KNOWN_ELEMENT_TYPES.add(SourceElementRule_2001);
			KNOWN_ELEMENT_TYPES.add(Guard_2002);
			KNOWN_ELEMENT_TYPES.add(TargetElementRule_2003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
