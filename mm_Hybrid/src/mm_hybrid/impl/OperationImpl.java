/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;
import mm_hybrid.Element;
import mm_hybrid.MM_HybridPackage;
import mm_hybrid.Module;
import mm_hybrid.Operation;
import mm_hybrid.Return;

import mm_hybrid.RightPattern;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.OperationImpl#getName_operation <em>Name operation</em>}</li>
 *   <li>{@link mm_hybrid.impl.OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link mm_hybrid.impl.OperationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link mm_hybrid.impl.OperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link mm_hybrid.impl.OperationImpl#getRightPattern <em>Right Pattern</em>}</li>
 *   <li>{@link mm_hybrid.impl.OperationImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
	/**
	 * The default value of the '{@link #getName_operation() <em>Name operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_operation()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_operation() <em>Name operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_operation()
	 * @generated
	 * @ordered
	 */
	protected String name_operation = NAME_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Element context;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Return returnType;

	/**
	 * The cached value of the '{@link #getRightPattern() <em>Right Pattern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<RightPattern> rightPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_operation() {
		return name_operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_operation(String newName_operation) {
		String oldName_operation = name_operation;
		name_operation = newName_operation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.OPERATION__NAME_OPERATION,
					oldName_operation, name_operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.OPERATION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject) context;
			context = (Element) eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MM_HybridPackage.OPERATION__CONTEXT, oldContext,
							context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Element newContext) {
		Element oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.OPERATION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(Return newReturnType,
			NotificationChain msgs) {
		Return oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, MM_HybridPackage.OPERATION__RETURN_TYPE,
					oldReturnType, newReturnType);
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
	public void setReturnType(Return newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject) returnType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- MM_HybridPackage.OPERATION__RETURN_TYPE,
						null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject) newReturnType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- MM_HybridPackage.OPERATION__RETURN_TYPE,
						null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.OPERATION__RETURN_TYPE, newReturnType,
					newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightPattern> getRightPattern() {
		if (rightPattern == null) {
			rightPattern = new EObjectWithInverseResolvingEList.ManyInverse<RightPattern>(
					RightPattern.class, this,
					MM_HybridPackage.OPERATION__RIGHT_PATTERN,
					MM_HybridPackage.RIGHT_PATTERN__OPERATION);
		}
		return rightPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID != MM_HybridPackage.OPERATION__MODULE)
			return null;
		return (Module) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModule,
				MM_HybridPackage.OPERATION__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer()
				|| (eContainerFeatureID != MM_HybridPackage.OPERATION__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject) newModule)
						.eInverseAdd(this, MM_HybridPackage.MODULE__OPERATIONS,
								Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.OPERATION__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.OPERATION__RIGHT_PATTERN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRightPattern())
					.basicAdd(otherEnd, msgs);
		case MM_HybridPackage.OPERATION__MODULE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModule((Module) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.OPERATION__RETURN_TYPE:
			return basicSetReturnType(null, msgs);
		case MM_HybridPackage.OPERATION__RIGHT_PATTERN:
			return ((InternalEList<?>) getRightPattern()).basicRemove(otherEnd,
					msgs);
		case MM_HybridPackage.OPERATION__MODULE:
			return basicSetModule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case MM_HybridPackage.OPERATION__MODULE:
			return eInternalContainer().eInverseRemove(this,
					MM_HybridPackage.MODULE__OPERATIONS, Module.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MM_HybridPackage.OPERATION__NAME_OPERATION:
			return getName_operation();
		case MM_HybridPackage.OPERATION__BODY:
			return getBody();
		case MM_HybridPackage.OPERATION__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
		case MM_HybridPackage.OPERATION__RETURN_TYPE:
			return getReturnType();
		case MM_HybridPackage.OPERATION__RIGHT_PATTERN:
			return getRightPattern();
		case MM_HybridPackage.OPERATION__MODULE:
			return getModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MM_HybridPackage.OPERATION__NAME_OPERATION:
			setName_operation((String) newValue);
			return;
		case MM_HybridPackage.OPERATION__BODY:
			setBody((String) newValue);
			return;
		case MM_HybridPackage.OPERATION__CONTEXT:
			setContext((Element) newValue);
			return;
		case MM_HybridPackage.OPERATION__RETURN_TYPE:
			setReturnType((Return) newValue);
			return;
		case MM_HybridPackage.OPERATION__RIGHT_PATTERN:
			getRightPattern().clear();
			getRightPattern().addAll(
					(Collection<? extends RightPattern>) newValue);
			return;
		case MM_HybridPackage.OPERATION__MODULE:
			setModule((Module) newValue);
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
		case MM_HybridPackage.OPERATION__NAME_OPERATION:
			setName_operation(NAME_OPERATION_EDEFAULT);
			return;
		case MM_HybridPackage.OPERATION__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case MM_HybridPackage.OPERATION__CONTEXT:
			setContext((Element) null);
			return;
		case MM_HybridPackage.OPERATION__RETURN_TYPE:
			setReturnType((Return) null);
			return;
		case MM_HybridPackage.OPERATION__RIGHT_PATTERN:
			getRightPattern().clear();
			return;
		case MM_HybridPackage.OPERATION__MODULE:
			setModule((Module) null);
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
		case MM_HybridPackage.OPERATION__NAME_OPERATION:
			return NAME_OPERATION_EDEFAULT == null ? name_operation != null
					: !NAME_OPERATION_EDEFAULT.equals(name_operation);
		case MM_HybridPackage.OPERATION__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT
					.equals(body);
		case MM_HybridPackage.OPERATION__CONTEXT:
			return context != null;
		case MM_HybridPackage.OPERATION__RETURN_TYPE:
			return returnType != null;
		case MM_HybridPackage.OPERATION__RIGHT_PATTERN:
			return rightPattern != null && !rightPattern.isEmpty();
		case MM_HybridPackage.OPERATION__MODULE:
			return getModule() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name_operation: "); //$NON-NLS-1$
		result.append(name_operation);
		result.append(", body: "); //$NON-NLS-1$
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
