/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL.impl;

import ETL.ETLPackage;
import ETL.Operation;
import ETL.SimpleStatement;
import ETL.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ETL.impl.OperationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ETL.impl.OperationImpl#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BlockImpl implements Operation {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected SimpleStatement context;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected SimpleStatement return_;

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
		return ETLPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleStatement getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(SimpleStatement newContext, NotificationChain msgs) {
		SimpleStatement oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(SimpleStatement newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleStatement getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturn(SimpleStatement newReturn, NotificationChain msgs) {
		SimpleStatement oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION__RETURN, oldReturn, newReturn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(SimpleStatement newReturn) {
		if (newReturn != return_) {
			NotificationChain msgs = null;
			if (return_ != null)
				msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION__RETURN, null, msgs);
			if (newReturn != null)
				msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION__RETURN, null, msgs);
			msgs = basicSetReturn(newReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION__RETURN, newReturn, newReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ETLPackage.OPERATION__CONTEXT:
				return basicSetContext(null, msgs);
			case ETLPackage.OPERATION__RETURN:
				return basicSetReturn(null, msgs);
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
			case ETLPackage.OPERATION__CONTEXT:
				return getContext();
			case ETLPackage.OPERATION__RETURN:
				return getReturn();
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
			case ETLPackage.OPERATION__CONTEXT:
				setContext((SimpleStatement)newValue);
				return;
			case ETLPackage.OPERATION__RETURN:
				setReturn((SimpleStatement)newValue);
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
			case ETLPackage.OPERATION__CONTEXT:
				setContext((SimpleStatement)null);
				return;
			case ETLPackage.OPERATION__RETURN:
				setReturn((SimpleStatement)null);
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
			case ETLPackage.OPERATION__CONTEXT:
				return context != null;
			case ETLPackage.OPERATION__RETURN:
				return return_ != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
