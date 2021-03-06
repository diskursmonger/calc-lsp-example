/*
 * generated by Xtext 2.25.0
 */
grammar InternalCalculator;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.calc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.calc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.calc.services.CalculatorGrammarAccess;

}

@parser::members {

 	private CalculatorGrammarAccess grammarAccess;

    public InternalCalculatorParser(TokenStream input, CalculatorGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Calculation";
   	}

   	@Override
   	protected CalculatorGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCalculation
entryRuleCalculation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCalculationRule()); }
	iv_ruleCalculation=ruleCalculation
	{ $current=$iv_ruleCalculation.current; }
	EOF;

// Rule Calculation
ruleCalculation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getCalculationAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getCalculationRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"org.xtext.calc.Calculator.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0());
		}
		this_Definition_0=ruleDefinition
		{
			$current = $this_Definition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1());
		}
		this_Evaluation_1=ruleEvaluation
		{
			$current = $this_Evaluation_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_native_0_0='native'
					{
						newLeafNode(lv_native_0_0, grammarAccess.getDefinitionAccess().getNativeNativeKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
						setWithLastConsumed($current, "native", lv_native_0_0 != null, "native");
					}
				)
			)
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_isFunction_2_0='('
					{
						newLeafNode(lv_isFunction_2_0, grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
						setWithLastConsumed($current, "isFunction", lv_isFunction_2_0 != null, "(");
					}
				)
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_0_3_0_0());
						}
						lv_params_3_0=ruleDeclaredParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDefinitionRule());
							}
							add(
								$current,
								"params",
								lv_params_3_0,
								"org.xtext.calc.Calculator.DeclaredParameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_4=','
					{
						newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getCommaKeyword_0_3_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_0_3_1_1_0());
							}
							lv_params_5_0=ruleDeclaredParameter
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getDefinitionRule());
								}
								add(
									$current,
									"params",
									lv_params_5_0,
									"org.xtext.calc.Calculator.DeclaredParameter");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)?
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_0_4());
			}
		)
		    |
		(
			otherlv_7='let'
			{
				newLeafNode(otherlv_7, grammarAccess.getDefinitionAccess().getLetKeyword_1_0());
			}
			(
				(
					lv_name_8_0=RULE_ID
					{
						newLeafNode(lv_name_8_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefinitionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_8_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					(
						lv_isFunction_9_0='('
						{
							newLeafNode(lv_isFunction_9_0, grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_1_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDefinitionRule());
							}
							setWithLastConsumed($current, "isFunction", lv_isFunction_9_0 != null, "(");
						}
					)
				)
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_1_2_1_0_0());
							}
							lv_params_10_0=ruleDeclaredParameter
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getDefinitionRule());
								}
								add(
									$current,
									"params",
									lv_params_10_0,
									"org.xtext.calc.Calculator.DeclaredParameter");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_11=','
						{
							newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_1_2_1_1_1_0());
								}
								lv_params_12_0=ruleDeclaredParameter
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getDefinitionRule());
									}
									add(
										$current,
										"params",
										lv_params_12_0,
										"org.xtext.calc.Calculator.DeclaredParameter");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_13=')'
				{
					newLeafNode(otherlv_13, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_2_2());
				}
			)?
			otherlv_14=':'
			{
				newLeafNode(otherlv_14, grammarAccess.getDefinitionAccess().getColonKeyword_1_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_1_4_0());
					}
					lv_expression_15_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinitionRule());
						}
						set(
							$current,
							"expression",
							lv_expression_15_0,
							"org.xtext.calc.Calculator.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDeclaredParameter
entryRuleDeclaredParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclaredParameterRule()); }
	iv_ruleDeclaredParameter=ruleDeclaredParameter
	{ $current=$iv_ruleDeclaredParameter.current; }
	EOF;

// Rule DeclaredParameter
ruleDeclaredParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDeclaredParameterRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleEvaluation
entryRuleEvaluation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEvaluationRule()); }
	iv_ruleEvaluation=ruleEvaluation
	{ $current=$iv_ruleEvaluation.current; }
	EOF;

// Rule Evaluation
ruleEvaluation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0());
			}
			lv_expression_0_0=ruleExpression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getEvaluationRule());
				}
				set(
					$current,
					"expression",
					lv_expression_0_0,
					"org.xtext.calc.Calculator.Expression");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall());
	}
	this_Addition_0=ruleAddition
	{
		$current = $this_Addition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	iv_ruleAddition=ruleAddition
	{ $current=$iv_ruleAddition.current; }
	EOF;

// Rule Addition
ruleAddition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
		}
		this_Multiplication_0=ruleMultiplication
		{
			$current = $this_Multiplication_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			('+' | '-')=>
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getAdditionAccess().getBinaryExpressionLeftAction_1_0_0(),
							$current);
					}
				)
				(
					(
						(
							lv_operator_2_1='+'
							{
								newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_0_1_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getAdditionRule());
								}
								setWithLastConsumed($current, "operator", lv_operator_2_1, null);
							}
							    |
							lv_operator_2_2='-'
							{
								newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_0_1_0_1());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getAdditionRule());
								}
								setWithLastConsumed($current, "operator", lv_operator_2_2, null);
							}
						)
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0());
						}
						lv_right_3_0=ruleMultiplication
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAdditionRule());
							}
							set(
								$current,
								"right",
								lv_right_3_0,
								"org.xtext.calc.Calculator.Multiplication");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	iv_ruleMultiplication=ruleMultiplication
	{ $current=$iv_ruleMultiplication.current; }
	EOF;

// Rule Multiplication
ruleMultiplication returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicationAccess().getUnaryExpressionParserRuleCall_0());
		}
		this_UnaryExpression_0=ruleUnaryExpression
		{
			$current = $this_UnaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplicationAccess().getBinaryExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_operator_2_1='*'
						{
							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicationRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_2_1, null);
						}
						    |
						lv_operator_2_2='/'
						{
							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultiplicationRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleUnaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.calc.Calculator.UnaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleUnaryExpression
entryRuleUnaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnaryExpressionRule()); }
	iv_ruleUnaryExpression=ruleUnaryExpression
	{ $current=$iv_ruleUnaryExpression.current; }
	EOF;

// Rule UnaryExpression
ruleUnaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_operator_1_0='-'
					{
						newLeafNode(lv_operator_1_0, grammarAccess.getUnaryExpressionAccess().getOperatorHyphenMinusKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUnaryExpressionRule());
						}
						setWithLastConsumed($current, "operator", lv_operator_1_0, "-");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_0_2_0());
					}
					lv_expression_2_0=rulePrimaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
						}
						set(
							$current,
							"expression",
							lv_expression_2_0,
							"org.xtext.calc.Calculator.PrimaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1());
		}
		this_PrimaryExpression_3=rulePrimaryExpression
		{
			$current = $this_PrimaryExpression_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	iv_rulePrimaryExpression=rulePrimaryExpression
	{ $current=$iv_rulePrimaryExpression.current; }
	EOF;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralParserRuleCall_1());
		}
		this_NumberLiteral_3=ruleNumberLiteral
		{
			$current = $this_NumberLiteral_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_2());
		}
		this_FeatureCall_4=ruleFeatureCall
		{
			$current = $this_FeatureCall_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFeatureCall
entryRuleFeatureCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureCallRule()); }
	iv_ruleFeatureCall=ruleFeatureCall
	{ $current=$iv_ruleFeatureCall.current; }
	EOF;

// Rule FeatureCall
ruleFeatureCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureCallRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFeatureCallAccess().getFeatureAbstractDefinitionCrossReference_0_0());
				}
			)
		)
		(
			('(')=>
			(
				otherlv_1='('
				{
					newLeafNode(otherlv_1, grammarAccess.getFeatureCallAccess().getLeftParenthesisKeyword_1_0_0());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_0_1_0_0());
							}
							lv_args_2_0=ruleExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFeatureCallRule());
								}
								add(
									$current,
									"args",
									lv_args_2_0,
									"org.xtext.calc.Calculator.Expression");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_3=','
						{
							newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_0_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_0_1_1_1_0());
								}
								lv_args_4_0=ruleExpression
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getFeatureCallRule());
									}
									add(
										$current,
										"args",
										lv_args_4_0,
										"org.xtext.calc.Calculator.Expression");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_5=')'
				{
					newLeafNode(otherlv_5, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_0_2());
				}
			)
		)?
	)
;

// Entry rule entryRuleNumberLiteral
entryRuleNumberLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberLiteralRule()); }
	iv_ruleNumberLiteral=ruleNumberLiteral
	{ $current=$iv_ruleNumberLiteral.current; }
	EOF;

// Rule NumberLiteral
ruleNumberLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0());
			}
			lv_value_0_0=ruleNumber
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"org.xtext.calc.Calculator.Number");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current.getText(); }
	EOF;

// Rule Number
ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_0());
			}
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1());
			}
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
