/**
 * generated by Xtext 2.25.0
 */
package org.xtext.calc.webCalc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.calc.webCalc.Definition#isNative <em>Native</em>}</li>
 *   <li>{@link org.xtext.calc.webCalc.Definition#isIsFunction <em>Is Function</em>}</li>
 *   <li>{@link org.xtext.calc.webCalc.Definition#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.xtext.calc.webCalc.WebCalcPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends Statement, AbstractDefinition
{
  /**
   * Returns the value of the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Native</em>' attribute.
   * @see #setNative(boolean)
   * @see org.xtext.calc.webCalc.WebCalcPackage#getDefinition_Native()
   * @model
   * @generated
   */
  boolean isNative();

  /**
   * Sets the value of the '{@link org.xtext.calc.webCalc.Definition#isNative <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Native</em>' attribute.
   * @see #isNative()
   * @generated
   */
  void setNative(boolean value);

  /**
   * Returns the value of the '<em><b>Is Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Function</em>' attribute.
   * @see #setIsFunction(boolean)
   * @see org.xtext.calc.webCalc.WebCalcPackage#getDefinition_IsFunction()
   * @model
   * @generated
   */
  boolean isIsFunction();

  /**
   * Sets the value of the '{@link org.xtext.calc.webCalc.Definition#isIsFunction <em>Is Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Function</em>' attribute.
   * @see #isIsFunction()
   * @generated
   */
  void setIsFunction(boolean value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.calc.webCalc.DeclaredParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.calc.webCalc.WebCalcPackage#getDefinition_Params()
   * @model containment="true"
   * @generated
   */
  EList<DeclaredParameter> getParams();

} // Definition
