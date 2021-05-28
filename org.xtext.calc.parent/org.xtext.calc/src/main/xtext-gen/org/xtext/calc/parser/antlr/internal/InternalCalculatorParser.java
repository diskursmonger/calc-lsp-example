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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCalculatorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'native'", "'('", "','", "')'", "'let'", "':'", "'+'", "'-'", "'*'", "'/'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCalculatorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCalculatorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCalculatorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCalculator.g"; }



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




    // $ANTLR start "entryRuleCalculation"
    // InternalCalculator.g:64:1: entryRuleCalculation returns [EObject current=null] : iv_ruleCalculation= ruleCalculation EOF ;
    public final EObject entryRuleCalculation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculation = null;


        try {
            // InternalCalculator.g:64:52: (iv_ruleCalculation= ruleCalculation EOF )
            // InternalCalculator.g:65:2: iv_ruleCalculation= ruleCalculation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCalculationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCalculation=ruleCalculation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCalculation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculation"


    // $ANTLR start "ruleCalculation"
    // InternalCalculator.g:71:1: ruleCalculation returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleCalculation() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalCalculator.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalCalculator.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalCalculator.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=11 && LA1_0<=12)||LA1_0==15||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalculator.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalCalculator.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalCalculator.g:80:4: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getCalculationAccess().getStatementsStatementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getCalculationRule());
            	      				}
            	      				add(
            	      					current,
            	      					"statements",
            	      					lv_statements_0_0,
            	      					"org.xtext.calc.Calculator.Statement");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculation"


    // $ANTLR start "entryRuleStatement"
    // InternalCalculator.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalCalculator.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalCalculator.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCalculator.g:107:1: ruleStatement returns [EObject current=null] : (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Definition_0 = null;

        EObject this_Evaluation_1 = null;



        	enterRule();

        try {
            // InternalCalculator.g:113:2: ( (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation ) )
            // InternalCalculator.g:114:2: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            {
            // InternalCalculator.g:114:2: (this_Definition_0= ruleDefinition | this_Evaluation_1= ruleEvaluation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||LA2_0==15) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==12||LA2_0==18) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCalculator.g:115:3: this_Definition_0= ruleDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Definition_0=ruleDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Definition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCalculator.g:124:3: this_Evaluation_1= ruleEvaluation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Evaluation_1=ruleEvaluation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Evaluation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDefinition"
    // InternalCalculator.g:136:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalCalculator.g:136:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalCalculator.g:137:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalCalculator.g:143:1: ruleDefinition returns [EObject current=null] : ( ( ( (lv_native_0_0= 'native' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFunction_2_0= '(' ) ) ( ( (lv_params_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )* )? otherlv_6= ')' ) | (otherlv_7= 'let' ( (lv_name_8_0= RULE_ID ) ) ( ( (lv_isFunction_9_0= '(' ) ) ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_expression_15_0= ruleExpression ) ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_native_0_0=null;
        Token lv_name_1_0=null;
        Token lv_isFunction_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token lv_isFunction_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_10_0 = null;

        EObject lv_params_12_0 = null;

        EObject lv_expression_15_0 = null;



        	enterRule();

        try {
            // InternalCalculator.g:149:2: ( ( ( ( (lv_native_0_0= 'native' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFunction_2_0= '(' ) ) ( ( (lv_params_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )* )? otherlv_6= ')' ) | (otherlv_7= 'let' ( (lv_name_8_0= RULE_ID ) ) ( ( (lv_isFunction_9_0= '(' ) ) ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_expression_15_0= ruleExpression ) ) ) ) )
            // InternalCalculator.g:150:2: ( ( ( (lv_native_0_0= 'native' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFunction_2_0= '(' ) ) ( ( (lv_params_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )* )? otherlv_6= ')' ) | (otherlv_7= 'let' ( (lv_name_8_0= RULE_ID ) ) ( ( (lv_isFunction_9_0= '(' ) ) ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_expression_15_0= ruleExpression ) ) ) )
            {
            // InternalCalculator.g:150:2: ( ( ( (lv_native_0_0= 'native' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFunction_2_0= '(' ) ) ( ( (lv_params_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )* )? otherlv_6= ')' ) | (otherlv_7= 'let' ( (lv_name_8_0= RULE_ID ) ) ( ( (lv_isFunction_9_0= '(' ) ) ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_expression_15_0= ruleExpression ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCalculator.g:151:3: ( ( (lv_native_0_0= 'native' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFunction_2_0= '(' ) ) ( ( (lv_params_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )* )? otherlv_6= ')' )
                    {
                    // InternalCalculator.g:151:3: ( ( (lv_native_0_0= 'native' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFunction_2_0= '(' ) ) ( ( (lv_params_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )* )? otherlv_6= ')' )
                    // InternalCalculator.g:152:4: ( (lv_native_0_0= 'native' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_isFunction_2_0= '(' ) ) ( ( (lv_params_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )* )? otherlv_6= ')'
                    {
                    // InternalCalculator.g:152:4: ( (lv_native_0_0= 'native' ) )
                    // InternalCalculator.g:153:5: (lv_native_0_0= 'native' )
                    {
                    // InternalCalculator.g:153:5: (lv_native_0_0= 'native' )
                    // InternalCalculator.g:154:6: lv_native_0_0= 'native'
                    {
                    lv_native_0_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_native_0_0, grammarAccess.getDefinitionAccess().getNativeNativeKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDefinitionRule());
                      						}
                      						setWithLastConsumed(current, "native", lv_native_0_0 != null, "native");
                      					
                    }

                    }


                    }

                    // InternalCalculator.g:166:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalCalculator.g:167:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalCalculator.g:167:5: (lv_name_1_0= RULE_ID )
                    // InternalCalculator.g:168:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDefinitionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalCalculator.g:184:4: ( (lv_isFunction_2_0= '(' ) )
                    // InternalCalculator.g:185:5: (lv_isFunction_2_0= '(' )
                    {
                    // InternalCalculator.g:185:5: (lv_isFunction_2_0= '(' )
                    // InternalCalculator.g:186:6: lv_isFunction_2_0= '('
                    {
                    lv_isFunction_2_0=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isFunction_2_0, grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDefinitionRule());
                      						}
                      						setWithLastConsumed(current, "isFunction", lv_isFunction_2_0 != null, "(");
                      					
                    }

                    }


                    }

                    // InternalCalculator.g:198:4: ( ( (lv_params_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalCalculator.g:199:5: ( (lv_params_3_0= ruleDeclaredParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )*
                            {
                            // InternalCalculator.g:199:5: ( (lv_params_3_0= ruleDeclaredParameter ) )
                            // InternalCalculator.g:200:6: (lv_params_3_0= ruleDeclaredParameter )
                            {
                            // InternalCalculator.g:200:6: (lv_params_3_0= ruleDeclaredParameter )
                            // InternalCalculator.g:201:7: lv_params_3_0= ruleDeclaredParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_0_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_7);
                            lv_params_3_0=ruleDeclaredParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                              							}
                              							add(
                              								current,
                              								"params",
                              								lv_params_3_0,
                              								"org.xtext.calc.Calculator.DeclaredParameter");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalCalculator.g:218:5: (otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==13) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalCalculator.g:219:6: otherlv_4= ',' ( (lv_params_5_0= ruleDeclaredParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getCommaKeyword_0_3_1_0());
                            	      					
                            	    }
                            	    // InternalCalculator.g:223:6: ( (lv_params_5_0= ruleDeclaredParameter ) )
                            	    // InternalCalculator.g:224:7: (lv_params_5_0= ruleDeclaredParameter )
                            	    {
                            	    // InternalCalculator.g:224:7: (lv_params_5_0= ruleDeclaredParameter )
                            	    // InternalCalculator.g:225:8: lv_params_5_0= ruleDeclaredParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_0_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_7);
                            	    lv_params_5_0=ruleDeclaredParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDefinitionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"params",
                            	      									lv_params_5_0,
                            	      									"org.xtext.calc.Calculator.DeclaredParameter");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculator.g:250:3: (otherlv_7= 'let' ( (lv_name_8_0= RULE_ID ) ) ( ( (lv_isFunction_9_0= '(' ) ) ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_expression_15_0= ruleExpression ) ) )
                    {
                    // InternalCalculator.g:250:3: (otherlv_7= 'let' ( (lv_name_8_0= RULE_ID ) ) ( ( (lv_isFunction_9_0= '(' ) ) ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_expression_15_0= ruleExpression ) ) )
                    // InternalCalculator.g:251:4: otherlv_7= 'let' ( (lv_name_8_0= RULE_ID ) ) ( ( (lv_isFunction_9_0= '(' ) ) ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )? otherlv_13= ')' )? otherlv_14= ':' ( (lv_expression_15_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDefinitionAccess().getLetKeyword_1_0());
                      			
                    }
                    // InternalCalculator.g:255:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalCalculator.g:256:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalCalculator.g:256:5: (lv_name_8_0= RULE_ID )
                    // InternalCalculator.g:257:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_8_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDefinitionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_8_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalCalculator.g:273:4: ( ( (lv_isFunction_9_0= '(' ) ) ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )? otherlv_13= ')' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==12) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCalculator.g:274:5: ( (lv_isFunction_9_0= '(' ) ) ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )? otherlv_13= ')'
                            {
                            // InternalCalculator.g:274:5: ( (lv_isFunction_9_0= '(' ) )
                            // InternalCalculator.g:275:6: (lv_isFunction_9_0= '(' )
                            {
                            // InternalCalculator.g:275:6: (lv_isFunction_9_0= '(' )
                            // InternalCalculator.g:276:7: lv_isFunction_9_0= '('
                            {
                            lv_isFunction_9_0=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_isFunction_9_0, grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_1_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDefinitionRule());
                              							}
                              							setWithLastConsumed(current, "isFunction", lv_isFunction_9_0 != null, "(");
                              						
                            }

                            }


                            }

                            // InternalCalculator.g:288:5: ( ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )* )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==RULE_ID) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalCalculator.g:289:6: ( (lv_params_10_0= ruleDeclaredParameter ) ) (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )*
                                    {
                                    // InternalCalculator.g:289:6: ( (lv_params_10_0= ruleDeclaredParameter ) )
                                    // InternalCalculator.g:290:7: (lv_params_10_0= ruleDeclaredParameter )
                                    {
                                    // InternalCalculator.g:290:7: (lv_params_10_0= ruleDeclaredParameter )
                                    // InternalCalculator.g:291:8: lv_params_10_0= ruleDeclaredParameter
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_1_2_1_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_7);
                                    lv_params_10_0=ruleDeclaredParameter();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getDefinitionRule());
                                      								}
                                      								add(
                                      									current,
                                      									"params",
                                      									lv_params_10_0,
                                      									"org.xtext.calc.Calculator.DeclaredParameter");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }

                                    // InternalCalculator.g:308:6: (otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) ) )*
                                    loop5:
                                    do {
                                        int alt5=2;
                                        int LA5_0 = input.LA(1);

                                        if ( (LA5_0==13) ) {
                                            alt5=1;
                                        }


                                        switch (alt5) {
                                    	case 1 :
                                    	    // InternalCalculator.g:309:7: otherlv_11= ',' ( (lv_params_12_0= ruleDeclaredParameter ) )
                                    	    {
                                    	    otherlv_11=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      							newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_1_1_0());
                                    	      						
                                    	    }
                                    	    // InternalCalculator.g:313:7: ( (lv_params_12_0= ruleDeclaredParameter ) )
                                    	    // InternalCalculator.g:314:8: (lv_params_12_0= ruleDeclaredParameter )
                                    	    {
                                    	    // InternalCalculator.g:314:8: (lv_params_12_0= ruleDeclaredParameter )
                                    	    // InternalCalculator.g:315:9: lv_params_12_0= ruleDeclaredParameter
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      									newCompositeNode(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_1_2_1_1_1_0());
                                    	      								
                                    	    }
                                    	    pushFollow(FOLLOW_7);
                                    	    lv_params_12_0=ruleDeclaredParameter();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      									if (current==null) {
                                    	      										current = createModelElementForParent(grammarAccess.getDefinitionRule());
                                    	      									}
                                    	      									add(
                                    	      										current,
                                    	      										"params",
                                    	      										lv_params_12_0,
                                    	      										"org.xtext.calc.Calculator.DeclaredParameter");
                                    	      									afterParserOrEnumRuleCall();
                                    	      								
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop5;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_13=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_2_2());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDefinitionAccess().getColonKeyword_1_3());
                      			
                    }
                    // InternalCalculator.g:343:4: ( (lv_expression_15_0= ruleExpression ) )
                    // InternalCalculator.g:344:5: (lv_expression_15_0= ruleExpression )
                    {
                    // InternalCalculator.g:344:5: (lv_expression_15_0= ruleExpression )
                    // InternalCalculator.g:345:6: lv_expression_15_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_15_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_15_0,
                      							"org.xtext.calc.Calculator.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDeclaredParameter"
    // InternalCalculator.g:367:1: entryRuleDeclaredParameter returns [EObject current=null] : iv_ruleDeclaredParameter= ruleDeclaredParameter EOF ;
    public final EObject entryRuleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameter = null;


        try {
            // InternalCalculator.g:367:58: (iv_ruleDeclaredParameter= ruleDeclaredParameter EOF )
            // InternalCalculator.g:368:2: iv_ruleDeclaredParameter= ruleDeclaredParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredParameter=ruleDeclaredParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // InternalCalculator.g:374:1: ruleDeclaredParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCalculator.g:380:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCalculator.g:381:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCalculator.g:381:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCalculator.g:382:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCalculator.g:382:3: (lv_name_0_0= RULE_ID )
            // InternalCalculator.g:383:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDeclaredParameterRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleEvaluation"
    // InternalCalculator.g:402:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // InternalCalculator.g:402:51: (iv_ruleEvaluation= ruleEvaluation EOF )
            // InternalCalculator.g:403:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEvaluationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvaluation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // InternalCalculator.g:409:1: ruleEvaluation returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalCalculator.g:415:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalCalculator.g:416:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalCalculator.g:416:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalCalculator.g:417:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalCalculator.g:417:3: (lv_expression_0_0= ruleExpression )
            // InternalCalculator.g:418:4: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEvaluationRule());
              				}
              				set(
              					current,
              					"expression",
              					lv_expression_0_0,
              					"org.xtext.calc.Calculator.Expression");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleExpression"
    // InternalCalculator.g:438:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCalculator.g:438:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCalculator.g:439:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCalculator.g:445:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalCalculator.g:451:2: (this_Addition_0= ruleAddition )
            // InternalCalculator.g:452:2: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Addition_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalCalculator.g:463:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalCalculator.g:463:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalCalculator.g:464:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalCalculator.g:470:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( '+' | '-' )=> ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCalculator.g:476:2: ( (this_Multiplication_0= ruleMultiplication ( ( '+' | '-' )=> ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* ) )
            // InternalCalculator.g:477:2: (this_Multiplication_0= ruleMultiplication ( ( '+' | '-' )=> ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* )
            {
            // InternalCalculator.g:477:2: (this_Multiplication_0= ruleMultiplication ( ( '+' | '-' )=> ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* )
            // InternalCalculator.g:478:3: this_Multiplication_0= ruleMultiplication ( ( '+' | '-' )=> ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalculator.g:486:3: ( ( '+' | '-' )=> ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalCalculator.g:487:4: ( '+' | '-' )=> ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )
            	    {
            	    // InternalCalculator.g:488:4: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )
            	    // InternalCalculator.g:489:5: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalCalculator.g:489:5: ()
            	    // InternalCalculator.g:490:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAdditionAccess().getBinaryExpressionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalCalculator.g:496:5: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalCalculator.g:497:6: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalCalculator.g:497:6: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalCalculator.g:498:7: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalCalculator.g:498:7: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==17) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==18) ) {
            	        alt9=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalCalculator.g:499:8: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getAdditionRule());
            	              								}
            	              								setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCalculator.g:510:8: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getAdditionRule());
            	              								}
            	              								setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCalculator.g:523:5: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalCalculator.g:524:6: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalCalculator.g:524:6: (lv_right_3_0= ruleMultiplication )
            	    // InternalCalculator.g:525:7: lv_right_3_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"org.xtext.calc.Calculator.Multiplication");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalCalculator.g:548:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalCalculator.g:548:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalCalculator.g:549:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalCalculator.g:555:1: ruleMultiplication returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCalculator.g:561:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalCalculator.g:562:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalCalculator.g:562:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalCalculator.g:563:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalculator.g:571:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=19 && LA12_0<=20)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCalculator.g:572:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalCalculator.g:572:4: ()
            	    // InternalCalculator.g:573:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultiplicationAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCalculator.g:579:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalCalculator.g:580:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalCalculator.g:580:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalCalculator.g:581:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalCalculator.g:581:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==19) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==20) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalCalculator.g:582:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultiplicationRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCalculator.g:593:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultiplicationRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCalculator.g:606:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalCalculator.g:607:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalCalculator.g:607:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalCalculator.g:608:6: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.calc.Calculator.UnaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalCalculator.g:630:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalCalculator.g:630:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalCalculator.g:631:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalCalculator.g:637:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= '-' ) ) ( (lv_expression_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_expression_2_0 = null;

        EObject this_PrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalCalculator.g:643:2: ( ( ( () ( (lv_operator_1_0= '-' ) ) ( (lv_expression_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression ) )
            // InternalCalculator.g:644:2: ( ( () ( (lv_operator_1_0= '-' ) ) ( (lv_expression_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            {
            // InternalCalculator.g:644:2: ( ( () ( (lv_operator_1_0= '-' ) ) ( (lv_expression_2_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_3= rulePrimaryExpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==12) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCalculator.g:645:3: ( () ( (lv_operator_1_0= '-' ) ) ( (lv_expression_2_0= rulePrimaryExpression ) ) )
                    {
                    // InternalCalculator.g:645:3: ( () ( (lv_operator_1_0= '-' ) ) ( (lv_expression_2_0= rulePrimaryExpression ) ) )
                    // InternalCalculator.g:646:4: () ( (lv_operator_1_0= '-' ) ) ( (lv_expression_2_0= rulePrimaryExpression ) )
                    {
                    // InternalCalculator.g:646:4: ()
                    // InternalCalculator.g:647:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculator.g:653:4: ( (lv_operator_1_0= '-' ) )
                    // InternalCalculator.g:654:5: (lv_operator_1_0= '-' )
                    {
                    // InternalCalculator.g:654:5: (lv_operator_1_0= '-' )
                    // InternalCalculator.g:655:6: lv_operator_1_0= '-'
                    {
                    lv_operator_1_0=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_1_0, grammarAccess.getUnaryExpressionAccess().getOperatorHyphenMinusKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_1_0, "-");
                      					
                    }

                    }


                    }

                    // InternalCalculator.g:667:4: ( (lv_expression_2_0= rulePrimaryExpression ) )
                    // InternalCalculator.g:668:5: (lv_expression_2_0= rulePrimaryExpression )
                    {
                    // InternalCalculator.g:668:5: (lv_expression_2_0= rulePrimaryExpression )
                    // InternalCalculator.g:669:6: lv_expression_2_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"org.xtext.calc.Calculator.PrimaryExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCalculator.g:688:3: this_PrimaryExpression_3= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_3=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalCalculator.g:700:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalCalculator.g:700:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalCalculator.g:701:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalCalculator.g:707:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_FeatureCall_4= ruleFeatureCall ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_NumberLiteral_3 = null;

        EObject this_FeatureCall_4 = null;



        	enterRule();

        try {
            // InternalCalculator.g:713:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_FeatureCall_4= ruleFeatureCall ) )
            // InternalCalculator.g:714:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_FeatureCall_4= ruleFeatureCall )
            {
            // InternalCalculator.g:714:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_NumberLiteral_3= ruleNumberLiteral | this_FeatureCall_4= ruleFeatureCall )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCalculator.g:715:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalCalculator.g:715:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalCalculator.g:716:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculator.g:734:3: this_NumberLiteral_3= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_3=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCalculator.g:743:3: this_FeatureCall_4= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureCall_4=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FeatureCall_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFeatureCall"
    // InternalCalculator.g:755:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // InternalCalculator.g:755:52: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // InternalCalculator.g:756:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // InternalCalculator.g:762:1: ruleFeatureCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( '(' )=> (otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )? ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalCalculator.g:768:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( '(' )=> (otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )? ) )
            // InternalCalculator.g:769:2: ( ( (otherlv_0= RULE_ID ) ) ( ( '(' )=> (otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )? )
            {
            // InternalCalculator.g:769:2: ( ( (otherlv_0= RULE_ID ) ) ( ( '(' )=> (otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )? )
            // InternalCalculator.g:770:3: ( (otherlv_0= RULE_ID ) ) ( ( '(' )=> (otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )?
            {
            // InternalCalculator.g:770:3: ( (otherlv_0= RULE_ID ) )
            // InternalCalculator.g:771:4: (otherlv_0= RULE_ID )
            {
            // InternalCalculator.g:771:4: (otherlv_0= RULE_ID )
            // InternalCalculator.g:772:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFeatureCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFeatureCallAccess().getFeatureAbstractDefinitionCrossReference_0_0());
              				
            }

            }


            }

            // InternalCalculator.g:783:3: ( ( '(' )=> (otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalCalculator.g:784:4: ( '(' )=> (otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalCalculator.g:785:4: (otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
                    // InternalCalculator.g:786:5: otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getFeatureCallAccess().getLeftParenthesisKeyword_1_0_0());
                      				
                    }
                    // InternalCalculator.g:790:5: ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==12||LA16_0==18) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalCalculator.g:791:6: ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )*
                            {
                            // InternalCalculator.g:791:6: ( (lv_args_2_0= ruleExpression ) )
                            // InternalCalculator.g:792:7: (lv_args_2_0= ruleExpression )
                            {
                            // InternalCalculator.g:792:7: (lv_args_2_0= ruleExpression )
                            // InternalCalculator.g:793:8: lv_args_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_0_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_7);
                            lv_args_2_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getFeatureCallRule());
                              								}
                              								add(
                              									current,
                              									"args",
                              									lv_args_2_0,
                              									"org.xtext.calc.Calculator.Expression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalCalculator.g:810:6: (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==13) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalCalculator.g:811:7: otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) )
                            	    {
                            	    otherlv_3=(Token)match(input,13,FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_0_1_1_0());
                            	      						
                            	    }
                            	    // InternalCalculator.g:815:7: ( (lv_args_4_0= ruleExpression ) )
                            	    // InternalCalculator.g:816:8: (lv_args_4_0= ruleExpression )
                            	    {
                            	    // InternalCalculator.g:816:8: (lv_args_4_0= ruleExpression )
                            	    // InternalCalculator.g:817:9: lv_args_4_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_0_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_7);
                            	    lv_args_4_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getFeatureCallRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"args",
                            	      										lv_args_4_0,
                            	      										"org.xtext.calc.Calculator.Expression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_0_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalCalculator.g:846:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalCalculator.g:846:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalCalculator.g:847:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalCalculator.g:853:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalCalculator.g:859:2: ( ( (lv_value_0_0= ruleNumber ) ) )
            // InternalCalculator.g:860:2: ( (lv_value_0_0= ruleNumber ) )
            {
            // InternalCalculator.g:860:2: ( (lv_value_0_0= ruleNumber ) )
            // InternalCalculator.g:861:3: (lv_value_0_0= ruleNumber )
            {
            // InternalCalculator.g:861:3: (lv_value_0_0= ruleNumber )
            // InternalCalculator.g:862:4: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.xtext.calc.Calculator.Number");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNumber"
    // InternalCalculator.g:882:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalCalculator.g:882:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalCalculator.g:883:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalCalculator.g:889:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalCalculator.g:895:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalCalculator.g:896:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalCalculator.g:896:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalCalculator.g:897:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalCalculator.g:904:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCalculator.g:905:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_2, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // $ANTLR start synpred1_InternalCalculator
    public final void synpred1_InternalCalculator_fragment() throws RecognitionException {   
        // InternalCalculator.g:487:4: ( '+' | '-' )
        // InternalCalculator.g:
        {
        if ( (input.LA(1)>=17 && input.LA(1)<=18) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalCalculator

    // $ANTLR start synpred2_InternalCalculator
    public final void synpred2_InternalCalculator_fragment() throws RecognitionException {   
        // InternalCalculator.g:784:4: ( '(' )
        // InternalCalculator.g:784:5: '('
        {
        match(input,12,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalCalculator

    // Delegated rules

    public final boolean synpred1_InternalCalculator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCalculator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCalculator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCalculator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\4\3\uffff\1\0\6\uffff";
    static final String dfa_4s = "\1\22\3\uffff\1\0\6\uffff";
    static final String dfa_5s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_6s = "\1\0\3\uffff\1\1\6\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\5\uffff\5\1\1\uffff\1\12\1\4",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 486:3: ( ( '+' | '-' )=> ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                         
                        int index10_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_0==EOF||(LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=11 && LA10_0<=15)) ) {s = 1;}

                        else if ( (LA10_0==18) ) {s = 4;}

                        else if ( (LA10_0==17) && (synpred1_InternalCalculator())) {s = 10;}

                         
                        input.seek(index10_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalCalculator()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\2\15\uffff";
    static final String dfa_10s = "\1\4\1\0\14\uffff";
    static final String dfa_11s = "\1\24\1\0\14\uffff";
    static final String dfa_12s = "\2\uffff\1\2\12\uffff\1\1";
    static final String dfa_13s = "\1\uffff\1\0\14\uffff}>";
    static final String[] dfa_14s = {
            "\2\2\5\uffff\1\2\1\1\3\2\1\uffff\4\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "783:3: ( ( '(' )=> (otherlv_1= '(' ( ( (lv_args_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCalculator()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000049832L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000049830L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000069830L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001C9830L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000004D830L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000004F830L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});

}