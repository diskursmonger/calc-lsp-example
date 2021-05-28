/**
 * generated by Xtext 2.25.0
 */
package org.xtext.calc.webCalc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.calc.webCalc.WebCalcFactory
 * @model kind="package"
 * @generated
 */
public interface WebCalcPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "webCalc";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/webcalc/WebCalc";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "webCalc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WebCalcPackage eINSTANCE = org.xtext.calc.webCalc.impl.WebCalcPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.CalculationImpl <em>Calculation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.CalculationImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getCalculation()
   * @generated
   */
  int CALCULATION = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Calculation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.StatementImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.AbstractDefinitionImpl <em>Abstract Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.AbstractDefinitionImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getAbstractDefinition()
   * @generated
   */
  int ABSTRACT_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.DefinitionImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__EXPRESSION = STATEMENT__EXPRESSION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NATIVE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__IS_FUNCTION = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__PARAMS = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.DeclaredParameterImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getDeclaredParameter()
   * @generated
   */
  int DECLARED_PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARED_PARAMETER__NAME = ABSTRACT_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Declared Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARED_PARAMETER_FEATURE_COUNT = ABSTRACT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.EvaluationImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 5;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EXPRESSION = STATEMENT__EXPRESSION;

  /**
   * The number of structural features of the '<em>Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.ExpressionImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.FeatureCallImpl <em>Feature Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.FeatureCallImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getFeatureCall()
   * @generated
   */
  int FEATURE_CALL = 7;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL__ARGS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.NumberLiteralImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.BinaryExpressionImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getBinaryExpression()
   * @generated
   */
  int BINARY_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.calc.webCalc.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.calc.webCalc.impl.UnaryExpressionImpl
   * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.Calculation <em>Calculation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Calculation</em>'.
   * @see org.xtext.calc.webCalc.Calculation
   * @generated
   */
  EClass getCalculation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.calc.webCalc.Calculation#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.calc.webCalc.Calculation#getStatements()
   * @see #getCalculation()
   * @generated
   */
  EReference getCalculation_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.calc.webCalc.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.calc.webCalc.Statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.calc.webCalc.Statement#getExpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.AbstractDefinition <em>Abstract Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Definition</em>'.
   * @see org.xtext.calc.webCalc.AbstractDefinition
   * @generated
   */
  EClass getAbstractDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.calc.webCalc.AbstractDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.calc.webCalc.AbstractDefinition#getName()
   * @see #getAbstractDefinition()
   * @generated
   */
  EAttribute getAbstractDefinition_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.xtext.calc.webCalc.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.calc.webCalc.Definition#isNative <em>Native</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Native</em>'.
   * @see org.xtext.calc.webCalc.Definition#isNative()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Native();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.calc.webCalc.Definition#isIsFunction <em>Is Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Function</em>'.
   * @see org.xtext.calc.webCalc.Definition#isIsFunction()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_IsFunction();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.calc.webCalc.Definition#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.calc.webCalc.Definition#getParams()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.DeclaredParameter <em>Declared Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declared Parameter</em>'.
   * @see org.xtext.calc.webCalc.DeclaredParameter
   * @generated
   */
  EClass getDeclaredParameter();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation</em>'.
   * @see org.xtext.calc.webCalc.Evaluation
   * @generated
   */
  EClass getEvaluation();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.calc.webCalc.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.FeatureCall <em>Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Call</em>'.
   * @see org.xtext.calc.webCalc.FeatureCall
   * @generated
   */
  EClass getFeatureCall();

  /**
   * Returns the meta object for the reference '{@link org.xtext.calc.webCalc.FeatureCall#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.xtext.calc.webCalc.FeatureCall#getFeature()
   * @see #getFeatureCall()
   * @generated
   */
  EReference getFeatureCall_Feature();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.calc.webCalc.FeatureCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.xtext.calc.webCalc.FeatureCall#getArgs()
   * @see #getFeatureCall()
   * @generated
   */
  EReference getFeatureCall_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.xtext.calc.webCalc.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.calc.webCalc.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.calc.webCalc.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expression</em>'.
   * @see org.xtext.calc.webCalc.BinaryExpression
   * @generated
   */
  EClass getBinaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.calc.webCalc.BinaryExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.calc.webCalc.BinaryExpression#getLeft()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.calc.webCalc.BinaryExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.calc.webCalc.BinaryExpression#getOperator()
   * @see #getBinaryExpression()
   * @generated
   */
  EAttribute getBinaryExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.calc.webCalc.BinaryExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.calc.webCalc.BinaryExpression#getRight()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.calc.webCalc.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.xtext.calc.webCalc.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.calc.webCalc.UnaryExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.calc.webCalc.UnaryExpression#getOperator()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.calc.webCalc.UnaryExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.calc.webCalc.UnaryExpression#getExpression()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Expression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WebCalcFactory getWebCalcFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.CalculationImpl <em>Calculation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.CalculationImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getCalculation()
     * @generated
     */
    EClass CALCULATION = eINSTANCE.getCalculation();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALCULATION__STATEMENTS = eINSTANCE.getCalculation_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.StatementImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRESSION = eINSTANCE.getStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.AbstractDefinitionImpl <em>Abstract Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.AbstractDefinitionImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getAbstractDefinition()
     * @generated
     */
    EClass ABSTRACT_DEFINITION = eINSTANCE.getAbstractDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DEFINITION__NAME = eINSTANCE.getAbstractDefinition_Name();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.DefinitionImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__NATIVE = eINSTANCE.getDefinition_Native();

    /**
     * The meta object literal for the '<em><b>Is Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__IS_FUNCTION = eINSTANCE.getDefinition_IsFunction();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__PARAMS = eINSTANCE.getDefinition_Params();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.DeclaredParameterImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getDeclaredParameter()
     * @generated
     */
    EClass DECLARED_PARAMETER = eINSTANCE.getDeclaredParameter();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.EvaluationImpl <em>Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.EvaluationImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getEvaluation()
     * @generated
     */
    EClass EVALUATION = eINSTANCE.getEvaluation();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.ExpressionImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.FeatureCallImpl <em>Feature Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.FeatureCallImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getFeatureCall()
     * @generated
     */
    EClass FEATURE_CALL = eINSTANCE.getFeatureCall();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CALL__FEATURE = eINSTANCE.getFeatureCall_Feature();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CALL__ARGS = eINSTANCE.getFeatureCall_Args();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.NumberLiteralImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.BinaryExpressionImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getBinaryExpression()
     * @generated
     */
    EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.calc.webCalc.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.calc.webCalc.impl.UnaryExpressionImpl
     * @see org.xtext.calc.webCalc.impl.WebCalcPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__EXPRESSION = eINSTANCE.getUnaryExpression_Expression();

  }

} //WebCalcPackage
