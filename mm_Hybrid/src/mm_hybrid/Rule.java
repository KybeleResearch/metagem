/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.Rule#getName_rule <em>Name rule</em>}</li>
 *   <li>{@link mm_hybrid.Rule#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mm_hybrid.Rule#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getIn <em>In</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getOut <em>Out</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getExtends <em>Extends</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getIsExtended <em>Is Extended</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getRightPattern <em>Right Pattern</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getComment <em>Comment</em>}</li>
 *   <li>{@link mm_hybrid.Rule#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getRule()
 * @model annotation="gmf.node label='name_rule' label.icon='false' border.color='204,153,0' color='253,229,141'"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name rule</em>' attribute.
	 * @see #setName_rule(String)
	 * @see mm_hybrid.MM_HybridPackage#getRule_Name_rule()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName_rule();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#getName_rule <em>Name rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name rule</em>' attribute.
	 * @see #getName_rule()
	 * @generated
	 */
	void setName_rule(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see mm_hybrid.MM_HybridPackage#getRule_IsAbstract()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Main</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main</em>' attribute.
	 * @see #setIsMain(boolean)
	 * @see mm_hybrid.MM_HybridPackage#getRule_IsMain()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMain();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#isIsMain <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main</em>' attribute.
	 * @see #isIsMain()
	 * @generated
	 */
	void setIsMain(boolean value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.SourceElementRule}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.SourceElementRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRule_In()
	 * @see mm_hybrid.SourceElementRule#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceElementRule> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.TargetElementRule}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.TargetElementRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRule_Out()
	 * @see mm_hybrid.TargetElementRule#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	EList<TargetElementRule> getOut();

	/**
	 * Returns the value of the '<em><b>Type Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link mm_hybrid.TypeAtribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Attribute</em>' attribute.
	 * @see mm_hybrid.TypeAtribute
	 * @see #setTypeAttribute(TypeAtribute)
	 * @see mm_hybrid.MM_HybridPackage#getRule_TypeAttribute()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	TypeAtribute getTypeAttribute();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#getTypeAttribute <em>Type Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Attribute</em>' attribute.
	 * @see mm_hybrid.TypeAtribute
	 * @see #getTypeAttribute()
	 * @generated
	 */
	void setTypeAttribute(TypeAtribute value);

	/**
	 * Returns the value of the '<em><b>Type Element</b></em>' attribute.
	 * The literals are from the enumeration {@link mm_hybrid.TypeElem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Element</em>' attribute.
	 * @see mm_hybrid.TypeElem
	 * @see #setTypeElement(TypeElem)
	 * @see mm_hybrid.MM_HybridPackage#getRule_TypeElement()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	TypeElem getTypeElement();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#getTypeElement <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Element</em>' attribute.
	 * @see mm_hybrid.TypeElem
	 * @see #getTypeElement()
	 * @generated
	 */
	void setTypeElement(TypeElem value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.Rule#getIsExtended <em>Is Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Rule)
	 * @see mm_hybrid.MM_HybridPackage#getRule_Extends()
	 * @see mm_hybrid.Rule#getIsExtended
	 * @model opposite="isExtended"
	 * @generated
	 */
	Rule getExtends();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Rule value);

	/**
	 * Returns the value of the '<em><b>Is Extended</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.Rule}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.Rule#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extended</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRule_IsExtended()
	 * @see mm_hybrid.Rule#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<Rule> getIsExtended();

	/**
	 * Returns the value of the '<em><b>Right Pattern</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.RightPattern}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.RightPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Pattern</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Pattern</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRule_RightPattern()
	 * @see mm_hybrid.RightPattern#getRule
	 * @model opposite="rule"
	 * @generated
	 */
	EList<RightPattern> getRightPattern();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see mm_hybrid.MM_HybridPackage#getRule_Comment()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.Module#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see mm_hybrid.MM_HybridPackage#getRule_Module()
	 * @see mm_hybrid.Module#getRule
	 * @model opposite="rule" required="true" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link mm_hybrid.Rule#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // Rule
