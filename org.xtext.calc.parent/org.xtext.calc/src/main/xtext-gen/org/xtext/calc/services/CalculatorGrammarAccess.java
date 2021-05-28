/*
 * generated by Xtext 2.25.0
 */
package org.xtext.calc.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CalculatorGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class CalculationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.Calculation");
		private final Assignment cStatementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_0 = (RuleCall)cStatementsAssignment.eContents().get(0);
		
		//Calculation:
		//    statements+=Statement*;
		@Override public ParserRule getRule() { return rule; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment() { return cStatementsAssignment; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_0() { return cStatementsStatementParserRuleCall_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEvaluationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Statement:
		//    Definition | Evaluation;
		@Override public ParserRule getRule() { return rule; }
		
		//Definition | Evaluation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Definition
		public RuleCall getDefinitionParserRuleCall_0() { return cDefinitionParserRuleCall_0; }
		
		//Evaluation
		public RuleCall getEvaluationParserRuleCall_1() { return cEvaluationParserRuleCall_1; }
	}
	public class AbstractDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.AbstractDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDeclaredParameterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractDefinition:
		//    Definition | DeclaredParameter;
		@Override public ParserRule getRule() { return rule; }
		
		//Definition | DeclaredParameter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Definition
		public RuleCall getDefinitionParserRuleCall_0() { return cDefinitionParserRuleCall_0; }
		
		//DeclaredParameter
		public RuleCall getDeclaredParameterParserRuleCall_1() { return cDeclaredParameterParserRuleCall_1; }
	}
	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.Definition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cNativeAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final Keyword cNativeNativeKeyword_0_0_0 = (Keyword)cNativeAssignment_0_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Assignment cIsFunctionAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final Keyword cIsFunctionLeftParenthesisKeyword_0_2_0 = (Keyword)cIsFunctionAssignment_0_2.eContents().get(0);
		private final Group cGroup_0_3 = (Group)cGroup_0.eContents().get(3);
		private final Assignment cParamsAssignment_0_3_0 = (Assignment)cGroup_0_3.eContents().get(0);
		private final RuleCall cParamsDeclaredParameterParserRuleCall_0_3_0_0 = (RuleCall)cParamsAssignment_0_3_0.eContents().get(0);
		private final Group cGroup_0_3_1 = (Group)cGroup_0_3.eContents().get(1);
		private final Keyword cCommaKeyword_0_3_1_0 = (Keyword)cGroup_0_3_1.eContents().get(0);
		private final Assignment cParamsAssignment_0_3_1_1 = (Assignment)cGroup_0_3_1.eContents().get(1);
		private final RuleCall cParamsDeclaredParameterParserRuleCall_0_3_1_1_0 = (RuleCall)cParamsAssignment_0_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_4 = (Keyword)cGroup_0.eContents().get(4);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLetKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Assignment cIsFunctionAssignment_1_2_0 = (Assignment)cGroup_1_2.eContents().get(0);
		private final Keyword cIsFunctionLeftParenthesisKeyword_1_2_0_0 = (Keyword)cIsFunctionAssignment_1_2_0.eContents().get(0);
		private final Group cGroup_1_2_1 = (Group)cGroup_1_2.eContents().get(1);
		private final Assignment cParamsAssignment_1_2_1_0 = (Assignment)cGroup_1_2_1.eContents().get(0);
		private final RuleCall cParamsDeclaredParameterParserRuleCall_1_2_1_0_0 = (RuleCall)cParamsAssignment_1_2_1_0.eContents().get(0);
		private final Group cGroup_1_2_1_1 = (Group)cGroup_1_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_2_1_1_0 = (Keyword)cGroup_1_2_1_1.eContents().get(0);
		private final Assignment cParamsAssignment_1_2_1_1_1 = (Assignment)cGroup_1_2_1_1.eContents().get(1);
		private final RuleCall cParamsDeclaredParameterParserRuleCall_1_2_1_1_1_0 = (RuleCall)cParamsAssignment_1_2_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_2_2 = (Keyword)cGroup_1_2.eContents().get(2);
		private final Keyword cColonKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cExpressionAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cExpressionExpressionParserRuleCall_1_4_0 = (RuleCall)cExpressionAssignment_1_4.eContents().get(0);
		
		//Definition:
		//    native?='native' name=ID isFunction?='(' (params+=DeclaredParameter (',' params+=DeclaredParameter)*)? ')' |
		//    'let' name=ID (isFunction?='(' (params+=DeclaredParameter (',' params+=DeclaredParameter)*)? ')')? ':' expression=Expression;
		@Override public ParserRule getRule() { return rule; }
		
		//native?='native' name=ID isFunction?='(' (params+=DeclaredParameter (',' params+=DeclaredParameter)*)? ')' |
		//'let' name=ID (isFunction?='(' (params+=DeclaredParameter (',' params+=DeclaredParameter)*)? ')')? ':' expression=Expression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//native?='native' name=ID isFunction?='(' (params+=DeclaredParameter (',' params+=DeclaredParameter)*)? ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//native?='native'
		public Assignment getNativeAssignment_0_0() { return cNativeAssignment_0_0; }
		
		//'native'
		public Keyword getNativeNativeKeyword_0_0_0() { return cNativeNativeKeyword_0_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//isFunction?='('
		public Assignment getIsFunctionAssignment_0_2() { return cIsFunctionAssignment_0_2; }
		
		//'('
		public Keyword getIsFunctionLeftParenthesisKeyword_0_2_0() { return cIsFunctionLeftParenthesisKeyword_0_2_0; }
		
		//(params+=DeclaredParameter (',' params+=DeclaredParameter)*)?
		public Group getGroup_0_3() { return cGroup_0_3; }
		
		//params+=DeclaredParameter
		public Assignment getParamsAssignment_0_3_0() { return cParamsAssignment_0_3_0; }
		
		//DeclaredParameter
		public RuleCall getParamsDeclaredParameterParserRuleCall_0_3_0_0() { return cParamsDeclaredParameterParserRuleCall_0_3_0_0; }
		
		//(',' params+=DeclaredParameter)*
		public Group getGroup_0_3_1() { return cGroup_0_3_1; }
		
		//','
		public Keyword getCommaKeyword_0_3_1_0() { return cCommaKeyword_0_3_1_0; }
		
		//params+=DeclaredParameter
		public Assignment getParamsAssignment_0_3_1_1() { return cParamsAssignment_0_3_1_1; }
		
		//DeclaredParameter
		public RuleCall getParamsDeclaredParameterParserRuleCall_0_3_1_1_0() { return cParamsDeclaredParameterParserRuleCall_0_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_4() { return cRightParenthesisKeyword_0_4; }
		
		//'let' name=ID (isFunction?='(' (params+=DeclaredParameter (',' params+=DeclaredParameter)*)? ')')? ':' expression=Expression
		public Group getGroup_1() { return cGroup_1; }
		
		//'let'
		public Keyword getLetKeyword_1_0() { return cLetKeyword_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_1_0() { return cNameIDTerminalRuleCall_1_1_0; }
		
		//(isFunction?='(' (params+=DeclaredParameter (',' params+=DeclaredParameter)*)? ')')?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//isFunction?='('
		public Assignment getIsFunctionAssignment_1_2_0() { return cIsFunctionAssignment_1_2_0; }
		
		//'('
		public Keyword getIsFunctionLeftParenthesisKeyword_1_2_0_0() { return cIsFunctionLeftParenthesisKeyword_1_2_0_0; }
		
		//(params+=DeclaredParameter (',' params+=DeclaredParameter)*)?
		public Group getGroup_1_2_1() { return cGroup_1_2_1; }
		
		//params+=DeclaredParameter
		public Assignment getParamsAssignment_1_2_1_0() { return cParamsAssignment_1_2_1_0; }
		
		//DeclaredParameter
		public RuleCall getParamsDeclaredParameterParserRuleCall_1_2_1_0_0() { return cParamsDeclaredParameterParserRuleCall_1_2_1_0_0; }
		
		//(',' params+=DeclaredParameter)*
		public Group getGroup_1_2_1_1() { return cGroup_1_2_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_2_1_1_0() { return cCommaKeyword_1_2_1_1_0; }
		
		//params+=DeclaredParameter
		public Assignment getParamsAssignment_1_2_1_1_1() { return cParamsAssignment_1_2_1_1_1; }
		
		//DeclaredParameter
		public RuleCall getParamsDeclaredParameterParserRuleCall_1_2_1_1_1_0() { return cParamsDeclaredParameterParserRuleCall_1_2_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2_2() { return cRightParenthesisKeyword_1_2_2; }
		
		//':'
		public Keyword getColonKeyword_1_3() { return cColonKeyword_1_3; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_1_4() { return cExpressionAssignment_1_4; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_4_0() { return cExpressionExpressionParserRuleCall_1_4_0; }
	}
	public class DeclaredParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.DeclaredParameter");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//DeclaredParameter:
		//    name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class EvaluationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.Evaluation");
		private final Assignment cExpressionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_0 = (RuleCall)cExpressionAssignment.eContents().get(0);
		
		//Evaluation:
		//    expression=Expression;
		@Override public ParserRule getRule() { return rule; }
		
		//expression=Expression
		public Assignment getExpressionAssignment() { return cExpressionAssignment; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_0() { return cExpressionExpressionParserRuleCall_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.Expression");
		private final RuleCall cAdditionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expression:
		//    Addition;
		@Override public ParserRule getRule() { return rule; }
		
		//Addition
		public RuleCall getAdditionParserRuleCall() { return cAdditionParserRuleCall; }
	}
	public class AdditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.Addition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Action cBinaryExpressionLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final Alternatives cOperatorAlternatives_1_0_1_0 = (Alternatives)cOperatorAssignment_1_0_1.eContents().get(0);
		private final Keyword cOperatorPlusSignKeyword_1_0_1_0_0 = (Keyword)cOperatorAlternatives_1_0_1_0.eContents().get(0);
		private final Keyword cOperatorHyphenMinusKeyword_1_0_1_0_1 = (Keyword)cOperatorAlternatives_1_0_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightMultiplicationParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		
		//Addition returns Expression:
		//    Multiplication ->({BinaryExpression.left=current} operator=('+' | '-') right=Multiplication)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Multiplication ->({BinaryExpression.left=current} operator=('+' | '-') right=Multiplication)*
		public Group getGroup() { return cGroup; }
		
		//Multiplication
		public RuleCall getMultiplicationParserRuleCall_0() { return cMultiplicationParserRuleCall_0; }
		
		//->({BinaryExpression.left=current} operator=('+' | '-') right=Multiplication)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{BinaryExpression.left=current} operator=('+' | '-') right=Multiplication
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{BinaryExpression.left=current}
		public Action getBinaryExpressionLeftAction_1_0_0() { return cBinaryExpressionLeftAction_1_0_0; }
		
		//operator=('+' | '-')
		public Assignment getOperatorAssignment_1_0_1() { return cOperatorAssignment_1_0_1; }
		
		//('+' | '-')
		public Alternatives getOperatorAlternatives_1_0_1_0() { return cOperatorAlternatives_1_0_1_0; }
		
		//'+'
		public Keyword getOperatorPlusSignKeyword_1_0_1_0_0() { return cOperatorPlusSignKeyword_1_0_1_0_0; }
		
		//'-'
		public Keyword getOperatorHyphenMinusKeyword_1_0_1_0_1() { return cOperatorHyphenMinusKeyword_1_0_1_0_1; }
		
		//right=Multiplication
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//Multiplication
		public RuleCall getRightMultiplicationParserRuleCall_1_0_2_0() { return cRightMultiplicationParserRuleCall_1_0_2_0; }
	}
	public class MultiplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.Multiplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cUnaryExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cBinaryExpressionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOperatorAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cOperatorAlternatives_1_1_0 = (Alternatives)cOperatorAssignment_1_1.eContents().get(0);
		private final Keyword cOperatorAsteriskKeyword_1_1_0_0 = (Keyword)cOperatorAlternatives_1_1_0.eContents().get(0);
		private final Keyword cOperatorSolidusKeyword_1_1_0_1 = (Keyword)cOperatorAlternatives_1_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightUnaryExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Multiplication returns Expression:
		//    UnaryExpression ({BinaryExpression.left=current} operator=('*' | '/') right=UnaryExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//UnaryExpression ({BinaryExpression.left=current} operator=('*' | '/') right=UnaryExpression)*
		public Group getGroup() { return cGroup; }
		
		//UnaryExpression
		public RuleCall getUnaryExpressionParserRuleCall_0() { return cUnaryExpressionParserRuleCall_0; }
		
		//({BinaryExpression.left=current} operator=('*' | '/') right=UnaryExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{BinaryExpression.left=current}
		public Action getBinaryExpressionLeftAction_1_0() { return cBinaryExpressionLeftAction_1_0; }
		
		//operator=('*' | '/')
		public Assignment getOperatorAssignment_1_1() { return cOperatorAssignment_1_1; }
		
		//('*' | '/')
		public Alternatives getOperatorAlternatives_1_1_0() { return cOperatorAlternatives_1_1_0; }
		
		//'*'
		public Keyword getOperatorAsteriskKeyword_1_1_0_0() { return cOperatorAsteriskKeyword_1_1_0_0; }
		
		//'/'
		public Keyword getOperatorSolidusKeyword_1_1_0_1() { return cOperatorSolidusKeyword_1_1_0_1; }
		
		//right=UnaryExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//UnaryExpression
		public RuleCall getRightUnaryExpressionParserRuleCall_1_2_0() { return cRightUnaryExpressionParserRuleCall_1_2_0; }
	}
	public class UnaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.UnaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cUnaryExpressionAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cOperatorAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Keyword cOperatorHyphenMinusKeyword_0_1_0 = (Keyword)cOperatorAssignment_0_1.eContents().get(0);
		private final Assignment cExpressionAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cExpressionPrimaryExpressionParserRuleCall_0_2_0 = (RuleCall)cExpressionAssignment_0_2.eContents().get(0);
		private final RuleCall cPrimaryExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//UnaryExpression returns Expression:
		//    ({UnaryExpression} operator='-' expression=PrimaryExpression) |
		//    PrimaryExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//({UnaryExpression} operator='-' expression=PrimaryExpression) |
		//PrimaryExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//({UnaryExpression} operator='-' expression=PrimaryExpression)
		public Group getGroup_0() { return cGroup_0; }
		
		//{UnaryExpression}
		public Action getUnaryExpressionAction_0_0() { return cUnaryExpressionAction_0_0; }
		
		//operator='-'
		public Assignment getOperatorAssignment_0_1() { return cOperatorAssignment_0_1; }
		
		//'-'
		public Keyword getOperatorHyphenMinusKeyword_0_1_0() { return cOperatorHyphenMinusKeyword_0_1_0; }
		
		//expression=PrimaryExpression
		public Assignment getExpressionAssignment_0_2() { return cExpressionAssignment_0_2; }
		
		//PrimaryExpression
		public RuleCall getExpressionPrimaryExpressionParserRuleCall_0_2_0() { return cExpressionPrimaryExpressionParserRuleCall_0_2_0; }
		
		//PrimaryExpression
		public RuleCall getPrimaryExpressionParserRuleCall_1() { return cPrimaryExpressionParserRuleCall_1; }
	}
	public class PrimaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.PrimaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cNumberLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFeatureCallParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//PrimaryExpression returns Expression:
		//    '(' Expression ')' |
		//    NumberLiteral |
		//    FeatureCall;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Expression ')' |
		//NumberLiteral |
		//FeatureCall
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' Expression ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_0_1() { return cExpressionParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//NumberLiteral
		public RuleCall getNumberLiteralParserRuleCall_1() { return cNumberLiteralParserRuleCall_1; }
		
		//FeatureCall
		public RuleCall getFeatureCallParserRuleCall_2() { return cFeatureCallParserRuleCall_2; }
	}
	public class FeatureCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.FeatureCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFeatureAbstractDefinitionCrossReference_0_0 = (CrossReference)cFeatureAssignment_0.eContents().get(0);
		private final RuleCall cFeatureAbstractDefinitionIDTerminalRuleCall_0_0_1 = (RuleCall)cFeatureAbstractDefinitionCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Group cGroup_1_0_1 = (Group)cGroup_1_0.eContents().get(1);
		private final Assignment cArgsAssignment_1_0_1_0 = (Assignment)cGroup_1_0_1.eContents().get(0);
		private final RuleCall cArgsExpressionParserRuleCall_1_0_1_0_0 = (RuleCall)cArgsAssignment_1_0_1_0.eContents().get(0);
		private final Group cGroup_1_0_1_1 = (Group)cGroup_1_0_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_0_1_1_0 = (Keyword)cGroup_1_0_1_1.eContents().get(0);
		private final Assignment cArgsAssignment_1_0_1_1_1 = (Assignment)cGroup_1_0_1_1.eContents().get(1);
		private final RuleCall cArgsExpressionParserRuleCall_1_0_1_1_1_0 = (RuleCall)cArgsAssignment_1_0_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		
		//FeatureCall :
		//    feature=[AbstractDefinition] ->('(' (args+=Expression (',' args+=Expression)*)? ')')?;
		@Override public ParserRule getRule() { return rule; }
		
		//feature=[AbstractDefinition] ->('(' (args+=Expression (',' args+=Expression)*)? ')')?
		public Group getGroup() { return cGroup; }
		
		//feature=[AbstractDefinition]
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//[AbstractDefinition]
		public CrossReference getFeatureAbstractDefinitionCrossReference_0_0() { return cFeatureAbstractDefinitionCrossReference_0_0; }
		
		//ID
		public RuleCall getFeatureAbstractDefinitionIDTerminalRuleCall_0_0_1() { return cFeatureAbstractDefinitionIDTerminalRuleCall_0_0_1; }
		
		//->('(' (args+=Expression (',' args+=Expression)*)? ')')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'(' (args+=Expression (',' args+=Expression)*)? ')'
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0_0() { return cLeftParenthesisKeyword_1_0_0; }
		
		//(args+=Expression (',' args+=Expression)*)?
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//args+=Expression
		public Assignment getArgsAssignment_1_0_1_0() { return cArgsAssignment_1_0_1_0; }
		
		//Expression
		public RuleCall getArgsExpressionParserRuleCall_1_0_1_0_0() { return cArgsExpressionParserRuleCall_1_0_1_0_0; }
		
		//(',' args+=Expression)*
		public Group getGroup_1_0_1_1() { return cGroup_1_0_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_0_1_1_0() { return cCommaKeyword_1_0_1_1_0; }
		
		//args+=Expression
		public Assignment getArgsAssignment_1_0_1_1_1() { return cArgsAssignment_1_0_1_1_1; }
		
		//Expression
		public RuleCall getArgsExpressionParserRuleCall_1_0_1_1_1_0() { return cArgsExpressionParserRuleCall_1_0_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_0_2() { return cRightParenthesisKeyword_1_0_2; }
	}
	public class NumberLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.NumberLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueNumberParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//NumberLiteral:
		//    value=Number;
		@Override public ParserRule getRule() { return rule; }
		
		//value=Number
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//Number
		public RuleCall getValueNumberParserRuleCall_0() { return cValueNumberParserRuleCall_0; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.calc.Calculator.Number");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Number:
		//    INT ('.' INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//INT ('.' INT)?
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//('.' INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
	}
	
	
	private final CalculationElements pCalculation;
	private final StatementElements pStatement;
	private final AbstractDefinitionElements pAbstractDefinition;
	private final DefinitionElements pDefinition;
	private final DeclaredParameterElements pDeclaredParameter;
	private final EvaluationElements pEvaluation;
	private final ExpressionElements pExpression;
	private final AdditionElements pAddition;
	private final MultiplicationElements pMultiplication;
	private final UnaryExpressionElements pUnaryExpression;
	private final PrimaryExpressionElements pPrimaryExpression;
	private final FeatureCallElements pFeatureCall;
	private final NumberLiteralElements pNumberLiteral;
	private final NumberElements pNumber;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CalculatorGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pCalculation = new CalculationElements();
		this.pStatement = new StatementElements();
		this.pAbstractDefinition = new AbstractDefinitionElements();
		this.pDefinition = new DefinitionElements();
		this.pDeclaredParameter = new DeclaredParameterElements();
		this.pEvaluation = new EvaluationElements();
		this.pExpression = new ExpressionElements();
		this.pAddition = new AdditionElements();
		this.pMultiplication = new MultiplicationElements();
		this.pUnaryExpression = new UnaryExpressionElements();
		this.pPrimaryExpression = new PrimaryExpressionElements();
		this.pFeatureCall = new FeatureCallElements();
		this.pNumberLiteral = new NumberLiteralElements();
		this.pNumber = new NumberElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.calc.Calculator".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Calculation:
	//    statements+=Statement*;
	public CalculationElements getCalculationAccess() {
		return pCalculation;
	}
	
	public ParserRule getCalculationRule() {
		return getCalculationAccess().getRule();
	}
	
	//Statement:
	//    Definition | Evaluation;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//AbstractDefinition:
	//    Definition | DeclaredParameter;
	public AbstractDefinitionElements getAbstractDefinitionAccess() {
		return pAbstractDefinition;
	}
	
	public ParserRule getAbstractDefinitionRule() {
		return getAbstractDefinitionAccess().getRule();
	}
	
	//Definition:
	//    native?='native' name=ID isFunction?='(' (params+=DeclaredParameter (',' params+=DeclaredParameter)*)? ')' |
	//    'let' name=ID (isFunction?='(' (params+=DeclaredParameter (',' params+=DeclaredParameter)*)? ')')? ':' expression=Expression;
	public DefinitionElements getDefinitionAccess() {
		return pDefinition;
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}
	
	//DeclaredParameter:
	//    name=ID;
	public DeclaredParameterElements getDeclaredParameterAccess() {
		return pDeclaredParameter;
	}
	
	public ParserRule getDeclaredParameterRule() {
		return getDeclaredParameterAccess().getRule();
	}
	
	//Evaluation:
	//    expression=Expression;
	public EvaluationElements getEvaluationAccess() {
		return pEvaluation;
	}
	
	public ParserRule getEvaluationRule() {
		return getEvaluationAccess().getRule();
	}
	
	//Expression:
	//    Addition;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Addition returns Expression:
	//    Multiplication ->({BinaryExpression.left=current} operator=('+' | '-') right=Multiplication)*;
	public AdditionElements getAdditionAccess() {
		return pAddition;
	}
	
	public ParserRule getAdditionRule() {
		return getAdditionAccess().getRule();
	}
	
	//Multiplication returns Expression:
	//    UnaryExpression ({BinaryExpression.left=current} operator=('*' | '/') right=UnaryExpression)*;
	public MultiplicationElements getMultiplicationAccess() {
		return pMultiplication;
	}
	
	public ParserRule getMultiplicationRule() {
		return getMultiplicationAccess().getRule();
	}
	
	//UnaryExpression returns Expression:
	//    ({UnaryExpression} operator='-' expression=PrimaryExpression) |
	//    PrimaryExpression;
	public UnaryExpressionElements getUnaryExpressionAccess() {
		return pUnaryExpression;
	}
	
	public ParserRule getUnaryExpressionRule() {
		return getUnaryExpressionAccess().getRule();
	}
	
	//PrimaryExpression returns Expression:
	//    '(' Expression ')' |
	//    NumberLiteral |
	//    FeatureCall;
	public PrimaryExpressionElements getPrimaryExpressionAccess() {
		return pPrimaryExpression;
	}
	
	public ParserRule getPrimaryExpressionRule() {
		return getPrimaryExpressionAccess().getRule();
	}
	
	//FeatureCall :
	//    feature=[AbstractDefinition] ->('(' (args+=Expression (',' args+=Expression)*)? ')')?;
	public FeatureCallElements getFeatureCallAccess() {
		return pFeatureCall;
	}
	
	public ParserRule getFeatureCallRule() {
		return getFeatureCallAccess().getRule();
	}
	
	//NumberLiteral:
	//    value=Number;
	public NumberLiteralElements getNumberLiteralAccess() {
		return pNumberLiteral;
	}
	
	public ParserRule getNumberLiteralRule() {
		return getNumberLiteralAccess().getRule();
	}
	
	//Number:
	//    INT ('.' INT)?;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}