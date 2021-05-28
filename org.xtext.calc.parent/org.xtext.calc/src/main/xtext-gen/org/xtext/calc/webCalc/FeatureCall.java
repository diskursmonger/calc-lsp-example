/**
 * generated by Xtext 2.25.0
 */
package org.xtext.calc.webCalc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.calc.webCalc.FeatureCall#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.calc.webCalc.FeatureCall#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.xtext.calc.webCalc.WebCalcPackage#getFeatureCall()
 * @model
 * @generated
 */
public interface FeatureCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(AbstractDefinition)
   * @see org.xtext.calc.webCalc.WebCalcPackage#getFeatureCall_Feature()
   * @model
   * @generated
   */
  AbstractDefinition getFeature();

  /**
   * Sets the value of the '{@link org.xtext.calc.webCalc.FeatureCall#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(AbstractDefinition value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.calc.webCalc.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.xtext.calc.webCalc.WebCalcPackage#getFeatureCall_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // FeatureCall
