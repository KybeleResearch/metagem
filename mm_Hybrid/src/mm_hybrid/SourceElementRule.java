/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Element Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.SourceElementRule#getGuard <em>Guard</em>}</li>
 *   <li>{@link mm_hybrid.SourceElementRule#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link mm_hybrid.SourceElementRule#getRightPattern <em>Right Pattern</em>}</li>
 *   <li>{@link mm_hybrid.SourceElementRule#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getSourceElementRule()
 * @model annotation="gmf.node label='name_element' label.icon='false' border.color='31,73,125' color='218,238,243'"
 * @generated
 */
public interface SourceElementRule extends Element {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.Guard}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.Guard#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getSourceElementRule_Guard()
	 * @see mm_hybrid.Guard#getSourceElement
	 * @model opposite="sourceElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<Guard> getGuard();

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.InMetaModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(InMetaModel)
	 * @see mm_hybrid.MM_HybridPackage#getSourceElementRule_Metamodel()
	 * @see mm_hybrid.InMetaModel#getElements
	 * @model opposite="elements" required="true"
	 * @generated
	 */
	InMetaModel getMetamodel();

	/**
	 * Sets the value of the '{@link mm_hybrid.SourceElementRule#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(InMetaModel value);

	/**
	 * Returns the value of the '<em><b>Right Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.RightPattern#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Pattern</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Pattern</em>' container reference.
	 * @see #setRightPattern(RightPattern)
	 * @see mm_hybrid.MM_HybridPackage#getSourceElementRule_RightPattern()
	 * @see mm_hybrid.RightPattern#getSourceElement
	 * @model opposite="sourceElement" transient="false"
	 * @generated
	 */
	RightPattern getRightPattern();

	/**
	 * Sets the value of the '{@link mm_hybrid.SourceElementRule#getRightPattern <em>Right Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Pattern</em>' container reference.
	 * @see #getRightPattern()
	 * @generated
	 */
	void setRightPattern(RightPattern value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.Rule#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see mm_hybrid.MM_HybridPackage#getSourceElementRule_Rule()
	 * @see mm_hybrid.Rule#getIn
	 * @model opposite="in" required="true" transient="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link mm_hybrid.SourceElementRule#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

} // SourceElementRule
