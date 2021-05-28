package org.xtext.calc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.calc.services.CalculatorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCalculatorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "')'", "','", "'let'", "':'", "'('", "'.'", "'native'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(CalculatorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCalculation"
    // InternalCalculator.g:54:1: entryRuleCalculation : ruleCalculation EOF ;
    public final void entryRuleCalculation() throws RecognitionException {
        try {
            // InternalCalculator.g:55:1: ( ruleCalculation EOF )
            // InternalCalculator.g:56:1: ruleCalculation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCalculation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalculation"


    // $ANTLR start "ruleCalculation"
    // InternalCalculator.g:63:1: ruleCalculation : ( ( rule__Calculation__StatementsAssignment )* ) ;
    public final void ruleCalculation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:67:2: ( ( ( rule__Calculation__StatementsAssignment )* ) )
            // InternalCalculator.g:68:2: ( ( rule__Calculation__StatementsAssignment )* )
            {
            // InternalCalculator.g:68:2: ( ( rule__Calculation__StatementsAssignment )* )
            // InternalCalculator.g:69:3: ( rule__Calculation__StatementsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculationAccess().getStatementsAssignment()); 
            }
            // InternalCalculator.g:70:3: ( rule__Calculation__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||LA1_0==12||LA1_0==17||LA1_0==19||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalculator.g:70:4: rule__Calculation__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Calculation__StatementsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculationAccess().getStatementsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalculation"


    // $ANTLR start "entryRuleStatement"
    // InternalCalculator.g:79:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalCalculator.g:80:1: ( ruleStatement EOF )
            // InternalCalculator.g:81:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCalculator.g:88:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:92:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalCalculator.g:93:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalCalculator.g:93:2: ( ( rule__Statement__Alternatives ) )
            // InternalCalculator.g:94:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalCalculator.g:95:3: ( rule__Statement__Alternatives )
            // InternalCalculator.g:95:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDefinition"
    // InternalCalculator.g:104:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalCalculator.g:105:1: ( ruleDefinition EOF )
            // InternalCalculator.g:106:1: ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalCalculator.g:113:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:117:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalCalculator.g:118:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalCalculator.g:118:2: ( ( rule__Definition__Alternatives ) )
            // InternalCalculator.g:119:3: ( rule__Definition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            }
            // InternalCalculator.g:120:3: ( rule__Definition__Alternatives )
            // InternalCalculator.g:120:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDeclaredParameter"
    // InternalCalculator.g:129:1: entryRuleDeclaredParameter : ruleDeclaredParameter EOF ;
    public final void entryRuleDeclaredParameter() throws RecognitionException {
        try {
            // InternalCalculator.g:130:1: ( ruleDeclaredParameter EOF )
            // InternalCalculator.g:131:1: ruleDeclaredParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaredParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // InternalCalculator.g:138:1: ruleDeclaredParameter : ( ( rule__DeclaredParameter__NameAssignment ) ) ;
    public final void ruleDeclaredParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:142:2: ( ( ( rule__DeclaredParameter__NameAssignment ) ) )
            // InternalCalculator.g:143:2: ( ( rule__DeclaredParameter__NameAssignment ) )
            {
            // InternalCalculator.g:143:2: ( ( rule__DeclaredParameter__NameAssignment ) )
            // InternalCalculator.g:144:3: ( rule__DeclaredParameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); 
            }
            // InternalCalculator.g:145:3: ( rule__DeclaredParameter__NameAssignment )
            // InternalCalculator.g:145:4: rule__DeclaredParameter__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredParameter__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleEvaluation"
    // InternalCalculator.g:154:1: entryRuleEvaluation : ruleEvaluation EOF ;
    public final void entryRuleEvaluation() throws RecognitionException {
        try {
            // InternalCalculator.g:155:1: ( ruleEvaluation EOF )
            // InternalCalculator.g:156:1: ruleEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEvaluationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEvaluation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEvaluationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // InternalCalculator.g:163:1: ruleEvaluation : ( ( rule__Evaluation__ExpressionAssignment ) ) ;
    public final void ruleEvaluation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:167:2: ( ( ( rule__Evaluation__ExpressionAssignment ) ) )
            // InternalCalculator.g:168:2: ( ( rule__Evaluation__ExpressionAssignment ) )
            {
            // InternalCalculator.g:168:2: ( ( rule__Evaluation__ExpressionAssignment ) )
            // InternalCalculator.g:169:3: ( rule__Evaluation__ExpressionAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEvaluationAccess().getExpressionAssignment()); 
            }
            // InternalCalculator.g:170:3: ( rule__Evaluation__ExpressionAssignment )
            // InternalCalculator.g:170:4: rule__Evaluation__ExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__ExpressionAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEvaluationAccess().getExpressionAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleExpression"
    // InternalCalculator.g:179:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalCalculator.g:180:1: ( ruleExpression EOF )
            // InternalCalculator.g:181:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCalculator.g:188:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:192:2: ( ( ruleAddition ) )
            // InternalCalculator.g:193:2: ( ruleAddition )
            {
            // InternalCalculator.g:193:2: ( ruleAddition )
            // InternalCalculator.g:194:3: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalCalculator.g:204:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalCalculator.g:205:1: ( ruleAddition EOF )
            // InternalCalculator.g:206:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalCalculator.g:213:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:217:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalCalculator.g:218:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalCalculator.g:218:2: ( ( rule__Addition__Group__0 ) )
            // InternalCalculator.g:219:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalCalculator.g:220:3: ( rule__Addition__Group__0 )
            // InternalCalculator.g:220:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalCalculator.g:229:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalCalculator.g:230:1: ( ruleMultiplication EOF )
            // InternalCalculator.g:231:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalCalculator.g:238:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:242:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalCalculator.g:243:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalCalculator.g:243:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalCalculator.g:244:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalCalculator.g:245:3: ( rule__Multiplication__Group__0 )
            // InternalCalculator.g:245:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalCalculator.g:254:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalCalculator.g:255:1: ( ruleUnaryExpression EOF )
            // InternalCalculator.g:256:1: ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalCalculator.g:263:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:267:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalCalculator.g:268:2: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalCalculator.g:268:2: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalCalculator.g:269:3: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalCalculator.g:270:3: ( rule__UnaryExpression__Alternatives )
            // InternalCalculator.g:270:4: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalCalculator.g:279:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalCalculator.g:280:1: ( rulePrimaryExpression EOF )
            // InternalCalculator.g:281:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalCalculator.g:288:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:292:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalCalculator.g:293:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalCalculator.g:293:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalCalculator.g:294:3: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalCalculator.g:295:3: ( rule__PrimaryExpression__Alternatives )
            // InternalCalculator.g:295:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFeatureCall"
    // InternalCalculator.g:304:1: entryRuleFeatureCall : ruleFeatureCall EOF ;
    public final void entryRuleFeatureCall() throws RecognitionException {
        try {
            // InternalCalculator.g:305:1: ( ruleFeatureCall EOF )
            // InternalCalculator.g:306:1: ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeatureCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // InternalCalculator.g:313:1: ruleFeatureCall : ( ( rule__FeatureCall__Group__0 ) ) ;
    public final void ruleFeatureCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:317:2: ( ( ( rule__FeatureCall__Group__0 ) ) )
            // InternalCalculator.g:318:2: ( ( rule__FeatureCall__Group__0 ) )
            {
            // InternalCalculator.g:318:2: ( ( rule__FeatureCall__Group__0 ) )
            // InternalCalculator.g:319:3: ( rule__FeatureCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getGroup()); 
            }
            // InternalCalculator.g:320:3: ( rule__FeatureCall__Group__0 )
            // InternalCalculator.g:320:4: rule__FeatureCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalCalculator.g:329:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalCalculator.g:330:1: ( ruleNumberLiteral EOF )
            // InternalCalculator.g:331:1: ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalCalculator.g:338:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:342:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalCalculator.g:343:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalCalculator.g:343:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalCalculator.g:344:3: ( rule__NumberLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            }
            // InternalCalculator.g:345:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalCalculator.g:345:4: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNumber"
    // InternalCalculator.g:354:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalCalculator.g:355:1: ( ruleNumber EOF )
            // InternalCalculator.g:356:1: ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalCalculator.g:363:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:367:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalCalculator.g:368:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalCalculator.g:368:2: ( ( rule__Number__Group__0 ) )
            // InternalCalculator.g:369:3: ( rule__Number__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getGroup()); 
            }
            // InternalCalculator.g:370:3: ( rule__Number__Group__0 )
            // InternalCalculator.g:370:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalCalculator.g:378:1: rule__Statement__Alternatives : ( ( ruleDefinition ) | ( ruleEvaluation ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:382:1: ( ( ruleDefinition ) | ( ruleEvaluation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17||LA2_0==21) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_ID)||LA2_0==12||LA2_0==19) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCalculator.g:383:2: ( ruleDefinition )
                    {
                    // InternalCalculator.g:383:2: ( ruleDefinition )
                    // InternalCalculator.g:384:3: ruleDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculator.g:389:2: ( ruleEvaluation )
                    {
                    // InternalCalculator.g:389:2: ( ruleEvaluation )
                    // InternalCalculator.g:390:3: ruleEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEvaluation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getEvaluationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalCalculator.g:399:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:403:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCalculator.g:404:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalCalculator.g:404:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalCalculator.g:405:3: ( rule__Definition__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    }
                    // InternalCalculator.g:406:3: ( rule__Definition__Group_0__0 )
                    // InternalCalculator.g:406:4: rule__Definition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculator.g:410:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalCalculator.g:410:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalCalculator.g:411:3: ( rule__Definition__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    }
                    // InternalCalculator.g:412:3: ( rule__Definition__Group_1__0 )
                    // InternalCalculator.g:412:4: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_0_1_0"
    // InternalCalculator.g:420:1: rule__Addition__OperatorAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:424:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCalculator.g:425:2: ( '+' )
                    {
                    // InternalCalculator.g:425:2: ( '+' )
                    // InternalCalculator.g:426:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculator.g:431:2: ( '-' )
                    {
                    // InternalCalculator.g:431:2: ( '-' )
                    // InternalCalculator.g:432:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_0_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalCalculator.g:441:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:445:1: ( ( '*' ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCalculator.g:446:2: ( '*' )
                    {
                    // InternalCalculator.g:446:2: ( '*' )
                    // InternalCalculator.g:447:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculator.g:452:2: ( '/' )
                    {
                    // InternalCalculator.g:452:2: ( '/' )
                    // InternalCalculator.g:453:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalCalculator.g:462:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:466:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( rulePrimaryExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_ID)||LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCalculator.g:467:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalCalculator.g:467:2: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalCalculator.g:468:3: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalCalculator.g:469:3: ( rule__UnaryExpression__Group_0__0 )
                    // InternalCalculator.g:469:4: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculator.g:473:2: ( rulePrimaryExpression )
                    {
                    // InternalCalculator.g:473:2: ( rulePrimaryExpression )
                    // InternalCalculator.g:474:3: rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalCalculator.g:483:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberLiteral ) | ( ruleFeatureCall ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:487:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberLiteral ) | ( ruleFeatureCall ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCalculator.g:488:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalCalculator.g:488:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalCalculator.g:489:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalCalculator.g:490:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalCalculator.g:490:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculator.g:494:2: ( ruleNumberLiteral )
                    {
                    // InternalCalculator.g:494:2: ( ruleNumberLiteral )
                    // InternalCalculator.g:495:3: ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculator.g:500:2: ( ruleFeatureCall )
                    {
                    // InternalCalculator.g:500:2: ( ruleFeatureCall )
                    // InternalCalculator.g:501:3: ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Definition__Group_0__0"
    // InternalCalculator.g:510:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:514:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalCalculator.g:515:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0"


    // $ANTLR start "rule__Definition__Group_0__0__Impl"
    // InternalCalculator.g:522:1: rule__Definition__Group_0__0__Impl : ( ( rule__Definition__NativeAssignment_0_0 ) ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:526:1: ( ( ( rule__Definition__NativeAssignment_0_0 ) ) )
            // InternalCalculator.g:527:1: ( ( rule__Definition__NativeAssignment_0_0 ) )
            {
            // InternalCalculator.g:527:1: ( ( rule__Definition__NativeAssignment_0_0 ) )
            // InternalCalculator.g:528:2: ( rule__Definition__NativeAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getNativeAssignment_0_0()); 
            }
            // InternalCalculator.g:529:2: ( rule__Definition__NativeAssignment_0_0 )
            // InternalCalculator.g:529:3: rule__Definition__NativeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NativeAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getNativeAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0__Impl"


    // $ANTLR start "rule__Definition__Group_0__1"
    // InternalCalculator.g:537:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:541:1: ( rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 )
            // InternalCalculator.g:542:2: rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1"


    // $ANTLR start "rule__Definition__Group_0__1__Impl"
    // InternalCalculator.g:549:1: rule__Definition__Group_0__1__Impl : ( ( rule__Definition__NameAssignment_0_1 ) ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:553:1: ( ( ( rule__Definition__NameAssignment_0_1 ) ) )
            // InternalCalculator.g:554:1: ( ( rule__Definition__NameAssignment_0_1 ) )
            {
            // InternalCalculator.g:554:1: ( ( rule__Definition__NameAssignment_0_1 ) )
            // InternalCalculator.g:555:2: ( rule__Definition__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getNameAssignment_0_1()); 
            }
            // InternalCalculator.g:556:2: ( rule__Definition__NameAssignment_0_1 )
            // InternalCalculator.g:556:3: rule__Definition__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1__Impl"


    // $ANTLR start "rule__Definition__Group_0__2"
    // InternalCalculator.g:564:1: rule__Definition__Group_0__2 : rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 ;
    public final void rule__Definition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:568:1: ( rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 )
            // InternalCalculator.g:569:2: rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2"


    // $ANTLR start "rule__Definition__Group_0__2__Impl"
    // InternalCalculator.g:576:1: rule__Definition__Group_0__2__Impl : ( ( rule__Definition__IsFunctionAssignment_0_2 ) ) ;
    public final void rule__Definition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:580:1: ( ( ( rule__Definition__IsFunctionAssignment_0_2 ) ) )
            // InternalCalculator.g:581:1: ( ( rule__Definition__IsFunctionAssignment_0_2 ) )
            {
            // InternalCalculator.g:581:1: ( ( rule__Definition__IsFunctionAssignment_0_2 ) )
            // InternalCalculator.g:582:2: ( rule__Definition__IsFunctionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getIsFunctionAssignment_0_2()); 
            }
            // InternalCalculator.g:583:2: ( rule__Definition__IsFunctionAssignment_0_2 )
            // InternalCalculator.g:583:3: rule__Definition__IsFunctionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__IsFunctionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getIsFunctionAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2__Impl"


    // $ANTLR start "rule__Definition__Group_0__3"
    // InternalCalculator.g:591:1: rule__Definition__Group_0__3 : rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 ;
    public final void rule__Definition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:595:1: ( rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 )
            // InternalCalculator.g:596:2: rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__3"


    // $ANTLR start "rule__Definition__Group_0__3__Impl"
    // InternalCalculator.g:603:1: rule__Definition__Group_0__3__Impl : ( ( rule__Definition__Group_0_3__0 )? ) ;
    public final void rule__Definition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:607:1: ( ( ( rule__Definition__Group_0_3__0 )? ) )
            // InternalCalculator.g:608:1: ( ( rule__Definition__Group_0_3__0 )? )
            {
            // InternalCalculator.g:608:1: ( ( rule__Definition__Group_0_3__0 )? )
            // InternalCalculator.g:609:2: ( rule__Definition__Group_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getGroup_0_3()); 
            }
            // InternalCalculator.g:610:2: ( rule__Definition__Group_0_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCalculator.g:610:3: rule__Definition__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getGroup_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__3__Impl"


    // $ANTLR start "rule__Definition__Group_0__4"
    // InternalCalculator.g:618:1: rule__Definition__Group_0__4 : rule__Definition__Group_0__4__Impl ;
    public final void rule__Definition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:622:1: ( rule__Definition__Group_0__4__Impl )
            // InternalCalculator.g:623:2: rule__Definition__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__4"


    // $ANTLR start "rule__Definition__Group_0__4__Impl"
    // InternalCalculator.g:629:1: rule__Definition__Group_0__4__Impl : ( ')' ) ;
    public final void rule__Definition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:633:1: ( ( ')' ) )
            // InternalCalculator.g:634:1: ( ')' )
            {
            // InternalCalculator.g:634:1: ( ')' )
            // InternalCalculator.g:635:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__4__Impl"


    // $ANTLR start "rule__Definition__Group_0_3__0"
    // InternalCalculator.g:645:1: rule__Definition__Group_0_3__0 : rule__Definition__Group_0_3__0__Impl rule__Definition__Group_0_3__1 ;
    public final void rule__Definition__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:649:1: ( rule__Definition__Group_0_3__0__Impl rule__Definition__Group_0_3__1 )
            // InternalCalculator.g:650:2: rule__Definition__Group_0_3__0__Impl rule__Definition__Group_0_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0_3__0"


    // $ANTLR start "rule__Definition__Group_0_3__0__Impl"
    // InternalCalculator.g:657:1: rule__Definition__Group_0_3__0__Impl : ( ( rule__Definition__ParamsAssignment_0_3_0 ) ) ;
    public final void rule__Definition__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:661:1: ( ( ( rule__Definition__ParamsAssignment_0_3_0 ) ) )
            // InternalCalculator.g:662:1: ( ( rule__Definition__ParamsAssignment_0_3_0 ) )
            {
            // InternalCalculator.g:662:1: ( ( rule__Definition__ParamsAssignment_0_3_0 ) )
            // InternalCalculator.g:663:2: ( rule__Definition__ParamsAssignment_0_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getParamsAssignment_0_3_0()); 
            }
            // InternalCalculator.g:664:2: ( rule__Definition__ParamsAssignment_0_3_0 )
            // InternalCalculator.g:664:3: rule__Definition__ParamsAssignment_0_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ParamsAssignment_0_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getParamsAssignment_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0_3__0__Impl"


    // $ANTLR start "rule__Definition__Group_0_3__1"
    // InternalCalculator.g:672:1: rule__Definition__Group_0_3__1 : rule__Definition__Group_0_3__1__Impl ;
    public final void rule__Definition__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:676:1: ( rule__Definition__Group_0_3__1__Impl )
            // InternalCalculator.g:677:2: rule__Definition__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0_3__1"


    // $ANTLR start "rule__Definition__Group_0_3__1__Impl"
    // InternalCalculator.g:683:1: rule__Definition__Group_0_3__1__Impl : ( ( rule__Definition__Group_0_3_1__0 )* ) ;
    public final void rule__Definition__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:687:1: ( ( ( rule__Definition__Group_0_3_1__0 )* ) )
            // InternalCalculator.g:688:1: ( ( rule__Definition__Group_0_3_1__0 )* )
            {
            // InternalCalculator.g:688:1: ( ( rule__Definition__Group_0_3_1__0 )* )
            // InternalCalculator.g:689:2: ( rule__Definition__Group_0_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getGroup_0_3_1()); 
            }
            // InternalCalculator.g:690:2: ( rule__Definition__Group_0_3_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCalculator.g:690:3: rule__Definition__Group_0_3_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Definition__Group_0_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getGroup_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0_3__1__Impl"


    // $ANTLR start "rule__Definition__Group_0_3_1__0"
    // InternalCalculator.g:699:1: rule__Definition__Group_0_3_1__0 : rule__Definition__Group_0_3_1__0__Impl rule__Definition__Group_0_3_1__1 ;
    public final void rule__Definition__Group_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:703:1: ( rule__Definition__Group_0_3_1__0__Impl rule__Definition__Group_0_3_1__1 )
            // InternalCalculator.g:704:2: rule__Definition__Group_0_3_1__0__Impl rule__Definition__Group_0_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group_0_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0_3_1__0"


    // $ANTLR start "rule__Definition__Group_0_3_1__0__Impl"
    // InternalCalculator.g:711:1: rule__Definition__Group_0_3_1__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:715:1: ( ( ',' ) )
            // InternalCalculator.g:716:1: ( ',' )
            {
            // InternalCalculator.g:716:1: ( ',' )
            // InternalCalculator.g:717:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommaKeyword_0_3_1_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getCommaKeyword_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0_3_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_0_3_1__1"
    // InternalCalculator.g:726:1: rule__Definition__Group_0_3_1__1 : rule__Definition__Group_0_3_1__1__Impl ;
    public final void rule__Definition__Group_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:730:1: ( rule__Definition__Group_0_3_1__1__Impl )
            // InternalCalculator.g:731:2: rule__Definition__Group_0_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0_3_1__1"


    // $ANTLR start "rule__Definition__Group_0_3_1__1__Impl"
    // InternalCalculator.g:737:1: rule__Definition__Group_0_3_1__1__Impl : ( ( rule__Definition__ParamsAssignment_0_3_1_1 ) ) ;
    public final void rule__Definition__Group_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:741:1: ( ( ( rule__Definition__ParamsAssignment_0_3_1_1 ) ) )
            // InternalCalculator.g:742:1: ( ( rule__Definition__ParamsAssignment_0_3_1_1 ) )
            {
            // InternalCalculator.g:742:1: ( ( rule__Definition__ParamsAssignment_0_3_1_1 ) )
            // InternalCalculator.g:743:2: ( rule__Definition__ParamsAssignment_0_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getParamsAssignment_0_3_1_1()); 
            }
            // InternalCalculator.g:744:2: ( rule__Definition__ParamsAssignment_0_3_1_1 )
            // InternalCalculator.g:744:3: rule__Definition__ParamsAssignment_0_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ParamsAssignment_0_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getParamsAssignment_0_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0_3_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_1__0"
    // InternalCalculator.g:753:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:757:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalCalculator.g:758:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0"


    // $ANTLR start "rule__Definition__Group_1__0__Impl"
    // InternalCalculator.g:765:1: rule__Definition__Group_1__0__Impl : ( 'let' ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:769:1: ( ( 'let' ) )
            // InternalCalculator.g:770:1: ( 'let' )
            {
            // InternalCalculator.g:770:1: ( 'let' )
            // InternalCalculator.g:771:2: 'let'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getLetKeyword_1_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getLetKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_1__1"
    // InternalCalculator.g:780:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:784:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalCalculator.g:785:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1"


    // $ANTLR start "rule__Definition__Group_1__1__Impl"
    // InternalCalculator.g:792:1: rule__Definition__Group_1__1__Impl : ( ( rule__Definition__NameAssignment_1_1 ) ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:796:1: ( ( ( rule__Definition__NameAssignment_1_1 ) ) )
            // InternalCalculator.g:797:1: ( ( rule__Definition__NameAssignment_1_1 ) )
            {
            // InternalCalculator.g:797:1: ( ( rule__Definition__NameAssignment_1_1 ) )
            // InternalCalculator.g:798:2: ( rule__Definition__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getNameAssignment_1_1()); 
            }
            // InternalCalculator.g:799:2: ( rule__Definition__NameAssignment_1_1 )
            // InternalCalculator.g:799:3: rule__Definition__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_1__2"
    // InternalCalculator.g:807:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:811:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalCalculator.g:812:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2"


    // $ANTLR start "rule__Definition__Group_1__2__Impl"
    // InternalCalculator.g:819:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__Group_1_2__0 )? ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:823:1: ( ( ( rule__Definition__Group_1_2__0 )? ) )
            // InternalCalculator.g:824:1: ( ( rule__Definition__Group_1_2__0 )? )
            {
            // InternalCalculator.g:824:1: ( ( rule__Definition__Group_1_2__0 )? )
            // InternalCalculator.g:825:2: ( rule__Definition__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getGroup_1_2()); 
            }
            // InternalCalculator.g:826:2: ( rule__Definition__Group_1_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCalculator.g:826:3: rule__Definition__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2__Impl"


    // $ANTLR start "rule__Definition__Group_1__3"
    // InternalCalculator.g:834:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:838:1: ( rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 )
            // InternalCalculator.g:839:2: rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3"


    // $ANTLR start "rule__Definition__Group_1__3__Impl"
    // InternalCalculator.g:846:1: rule__Definition__Group_1__3__Impl : ( ':' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:850:1: ( ( ':' ) )
            // InternalCalculator.g:851:1: ( ':' )
            {
            // InternalCalculator.g:851:1: ( ':' )
            // InternalCalculator.g:852:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getColonKeyword_1_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getColonKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3__Impl"


    // $ANTLR start "rule__Definition__Group_1__4"
    // InternalCalculator.g:861:1: rule__Definition__Group_1__4 : rule__Definition__Group_1__4__Impl ;
    public final void rule__Definition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:865:1: ( rule__Definition__Group_1__4__Impl )
            // InternalCalculator.g:866:2: rule__Definition__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4"


    // $ANTLR start "rule__Definition__Group_1__4__Impl"
    // InternalCalculator.g:872:1: rule__Definition__Group_1__4__Impl : ( ( rule__Definition__ExpressionAssignment_1_4 ) ) ;
    public final void rule__Definition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:876:1: ( ( ( rule__Definition__ExpressionAssignment_1_4 ) ) )
            // InternalCalculator.g:877:1: ( ( rule__Definition__ExpressionAssignment_1_4 ) )
            {
            // InternalCalculator.g:877:1: ( ( rule__Definition__ExpressionAssignment_1_4 ) )
            // InternalCalculator.g:878:2: ( rule__Definition__ExpressionAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getExpressionAssignment_1_4()); 
            }
            // InternalCalculator.g:879:2: ( rule__Definition__ExpressionAssignment_1_4 )
            // InternalCalculator.g:879:3: rule__Definition__ExpressionAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ExpressionAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getExpressionAssignment_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4__Impl"


    // $ANTLR start "rule__Definition__Group_1_2__0"
    // InternalCalculator.g:888:1: rule__Definition__Group_1_2__0 : rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 ;
    public final void rule__Definition__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:892:1: ( rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 )
            // InternalCalculator.g:893:2: rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__0"


    // $ANTLR start "rule__Definition__Group_1_2__0__Impl"
    // InternalCalculator.g:900:1: rule__Definition__Group_1_2__0__Impl : ( ( rule__Definition__IsFunctionAssignment_1_2_0 ) ) ;
    public final void rule__Definition__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:904:1: ( ( ( rule__Definition__IsFunctionAssignment_1_2_0 ) ) )
            // InternalCalculator.g:905:1: ( ( rule__Definition__IsFunctionAssignment_1_2_0 ) )
            {
            // InternalCalculator.g:905:1: ( ( rule__Definition__IsFunctionAssignment_1_2_0 ) )
            // InternalCalculator.g:906:2: ( rule__Definition__IsFunctionAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getIsFunctionAssignment_1_2_0()); 
            }
            // InternalCalculator.g:907:2: ( rule__Definition__IsFunctionAssignment_1_2_0 )
            // InternalCalculator.g:907:3: rule__Definition__IsFunctionAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__IsFunctionAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getIsFunctionAssignment_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_1_2__1"
    // InternalCalculator.g:915:1: rule__Definition__Group_1_2__1 : rule__Definition__Group_1_2__1__Impl rule__Definition__Group_1_2__2 ;
    public final void rule__Definition__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:919:1: ( rule__Definition__Group_1_2__1__Impl rule__Definition__Group_1_2__2 )
            // InternalCalculator.g:920:2: rule__Definition__Group_1_2__1__Impl rule__Definition__Group_1_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__1"


    // $ANTLR start "rule__Definition__Group_1_2__1__Impl"
    // InternalCalculator.g:927:1: rule__Definition__Group_1_2__1__Impl : ( ( rule__Definition__Group_1_2_1__0 )? ) ;
    public final void rule__Definition__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:931:1: ( ( ( rule__Definition__Group_1_2_1__0 )? ) )
            // InternalCalculator.g:932:1: ( ( rule__Definition__Group_1_2_1__0 )? )
            {
            // InternalCalculator.g:932:1: ( ( rule__Definition__Group_1_2_1__0 )? )
            // InternalCalculator.g:933:2: ( rule__Definition__Group_1_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getGroup_1_2_1()); 
            }
            // InternalCalculator.g:934:2: ( rule__Definition__Group_1_2_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculator.g:934:3: rule__Definition__Group_1_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getGroup_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_1_2__2"
    // InternalCalculator.g:942:1: rule__Definition__Group_1_2__2 : rule__Definition__Group_1_2__2__Impl ;
    public final void rule__Definition__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:946:1: ( rule__Definition__Group_1_2__2__Impl )
            // InternalCalculator.g:947:2: rule__Definition__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__2"


    // $ANTLR start "rule__Definition__Group_1_2__2__Impl"
    // InternalCalculator.g:953:1: rule__Definition__Group_1_2__2__Impl : ( ')' ) ;
    public final void rule__Definition__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:957:1: ( ( ')' ) )
            // InternalCalculator.g:958:1: ( ')' )
            {
            // InternalCalculator.g:958:1: ( ')' )
            // InternalCalculator.g:959:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_2_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__2__Impl"


    // $ANTLR start "rule__Definition__Group_1_2_1__0"
    // InternalCalculator.g:969:1: rule__Definition__Group_1_2_1__0 : rule__Definition__Group_1_2_1__0__Impl rule__Definition__Group_1_2_1__1 ;
    public final void rule__Definition__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:973:1: ( rule__Definition__Group_1_2_1__0__Impl rule__Definition__Group_1_2_1__1 )
            // InternalCalculator.g:974:2: rule__Definition__Group_1_2_1__0__Impl rule__Definition__Group_1_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_1_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_1__0"


    // $ANTLR start "rule__Definition__Group_1_2_1__0__Impl"
    // InternalCalculator.g:981:1: rule__Definition__Group_1_2_1__0__Impl : ( ( rule__Definition__ParamsAssignment_1_2_1_0 ) ) ;
    public final void rule__Definition__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:985:1: ( ( ( rule__Definition__ParamsAssignment_1_2_1_0 ) ) )
            // InternalCalculator.g:986:1: ( ( rule__Definition__ParamsAssignment_1_2_1_0 ) )
            {
            // InternalCalculator.g:986:1: ( ( rule__Definition__ParamsAssignment_1_2_1_0 ) )
            // InternalCalculator.g:987:2: ( rule__Definition__ParamsAssignment_1_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getParamsAssignment_1_2_1_0()); 
            }
            // InternalCalculator.g:988:2: ( rule__Definition__ParamsAssignment_1_2_1_0 )
            // InternalCalculator.g:988:3: rule__Definition__ParamsAssignment_1_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ParamsAssignment_1_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getParamsAssignment_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_1_2_1__1"
    // InternalCalculator.g:996:1: rule__Definition__Group_1_2_1__1 : rule__Definition__Group_1_2_1__1__Impl ;
    public final void rule__Definition__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1000:1: ( rule__Definition__Group_1_2_1__1__Impl )
            // InternalCalculator.g:1001:2: rule__Definition__Group_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_1__1"


    // $ANTLR start "rule__Definition__Group_1_2_1__1__Impl"
    // InternalCalculator.g:1007:1: rule__Definition__Group_1_2_1__1__Impl : ( ( rule__Definition__Group_1_2_1_1__0 )* ) ;
    public final void rule__Definition__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1011:1: ( ( ( rule__Definition__Group_1_2_1_1__0 )* ) )
            // InternalCalculator.g:1012:1: ( ( rule__Definition__Group_1_2_1_1__0 )* )
            {
            // InternalCalculator.g:1012:1: ( ( rule__Definition__Group_1_2_1_1__0 )* )
            // InternalCalculator.g:1013:2: ( rule__Definition__Group_1_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getGroup_1_2_1_1()); 
            }
            // InternalCalculator.g:1014:2: ( rule__Definition__Group_1_2_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCalculator.g:1014:3: rule__Definition__Group_1_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Definition__Group_1_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getGroup_1_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_1_2_1_1__0"
    // InternalCalculator.g:1023:1: rule__Definition__Group_1_2_1_1__0 : rule__Definition__Group_1_2_1_1__0__Impl rule__Definition__Group_1_2_1_1__1 ;
    public final void rule__Definition__Group_1_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1027:1: ( rule__Definition__Group_1_2_1_1__0__Impl rule__Definition__Group_1_2_1_1__1 )
            // InternalCalculator.g:1028:2: rule__Definition__Group_1_2_1_1__0__Impl rule__Definition__Group_1_2_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group_1_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_1_1__0"


    // $ANTLR start "rule__Definition__Group_1_2_1_1__0__Impl"
    // InternalCalculator.g:1035:1: rule__Definition__Group_1_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_1_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1039:1: ( ( ',' ) )
            // InternalCalculator.g:1040:1: ( ',' )
            {
            // InternalCalculator.g:1040:1: ( ',' )
            // InternalCalculator.g:1041:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_1_1_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_1_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_1_2_1_1__1"
    // InternalCalculator.g:1050:1: rule__Definition__Group_1_2_1_1__1 : rule__Definition__Group_1_2_1_1__1__Impl ;
    public final void rule__Definition__Group_1_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1054:1: ( rule__Definition__Group_1_2_1_1__1__Impl )
            // InternalCalculator.g:1055:2: rule__Definition__Group_1_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_1_1__1"


    // $ANTLR start "rule__Definition__Group_1_2_1_1__1__Impl"
    // InternalCalculator.g:1061:1: rule__Definition__Group_1_2_1_1__1__Impl : ( ( rule__Definition__ParamsAssignment_1_2_1_1_1 ) ) ;
    public final void rule__Definition__Group_1_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1065:1: ( ( ( rule__Definition__ParamsAssignment_1_2_1_1_1 ) ) )
            // InternalCalculator.g:1066:1: ( ( rule__Definition__ParamsAssignment_1_2_1_1_1 ) )
            {
            // InternalCalculator.g:1066:1: ( ( rule__Definition__ParamsAssignment_1_2_1_1_1 ) )
            // InternalCalculator.g:1067:2: ( rule__Definition__ParamsAssignment_1_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getParamsAssignment_1_2_1_1_1()); 
            }
            // InternalCalculator.g:1068:2: ( rule__Definition__ParamsAssignment_1_2_1_1_1 )
            // InternalCalculator.g:1068:3: rule__Definition__ParamsAssignment_1_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ParamsAssignment_1_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getParamsAssignment_1_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2_1_1__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalCalculator.g:1077:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1081:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalCalculator.g:1082:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalCalculator.g:1089:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1093:1: ( ( ruleMultiplication ) )
            // InternalCalculator.g:1094:1: ( ruleMultiplication )
            {
            // InternalCalculator.g:1094:1: ( ruleMultiplication )
            // InternalCalculator.g:1095:2: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalCalculator.g:1104:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1108:1: ( rule__Addition__Group__1__Impl )
            // InternalCalculator.g:1109:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalCalculator.g:1115:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1119:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalCalculator.g:1120:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalCalculator.g:1120:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalCalculator.g:1121:2: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalCalculator.g:1122:2: ( rule__Addition__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalCalculator.g:1122:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalCalculator.g:1131:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1135:1: ( rule__Addition__Group_1__0__Impl )
            // InternalCalculator.g:1136:2: rule__Addition__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalCalculator.g:1142:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Group_1_0__0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1146:1: ( ( ( rule__Addition__Group_1_0__0 ) ) )
            // InternalCalculator.g:1147:1: ( ( rule__Addition__Group_1_0__0 ) )
            {
            // InternalCalculator.g:1147:1: ( ( rule__Addition__Group_1_0__0 ) )
            // InternalCalculator.g:1148:2: ( rule__Addition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }
            // InternalCalculator.g:1149:2: ( rule__Addition__Group_1_0__0 )
            // InternalCalculator.g:1149:3: rule__Addition__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__0"
    // InternalCalculator.g:1158:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1162:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // InternalCalculator.g:1163:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Addition__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__0"


    // $ANTLR start "rule__Addition__Group_1_0__0__Impl"
    // InternalCalculator.g:1170:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1174:1: ( ( () ) )
            // InternalCalculator.g:1175:1: ( () )
            {
            // InternalCalculator.g:1175:1: ( () )
            // InternalCalculator.g:1176:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getBinaryExpressionLeftAction_1_0_0()); 
            }
            // InternalCalculator.g:1177:2: ()
            // InternalCalculator.g:1177:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getBinaryExpressionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__1"
    // InternalCalculator.g:1185:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1189:1: ( rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 )
            // InternalCalculator.g:1190:2: rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Addition__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__1"


    // $ANTLR start "rule__Addition__Group_1_0__1__Impl"
    // InternalCalculator.g:1197:1: rule__Addition__Group_1_0__1__Impl : ( ( rule__Addition__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1201:1: ( ( ( rule__Addition__OperatorAssignment_1_0_1 ) ) )
            // InternalCalculator.g:1202:1: ( ( rule__Addition__OperatorAssignment_1_0_1 ) )
            {
            // InternalCalculator.g:1202:1: ( ( rule__Addition__OperatorAssignment_1_0_1 ) )
            // InternalCalculator.g:1203:2: ( rule__Addition__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalCalculator.g:1204:2: ( rule__Addition__OperatorAssignment_1_0_1 )
            // InternalCalculator.g:1204:3: rule__Addition__OperatorAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__2"
    // InternalCalculator.g:1212:1: rule__Addition__Group_1_0__2 : rule__Addition__Group_1_0__2__Impl ;
    public final void rule__Addition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1216:1: ( rule__Addition__Group_1_0__2__Impl )
            // InternalCalculator.g:1217:2: rule__Addition__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__2"


    // $ANTLR start "rule__Addition__Group_1_0__2__Impl"
    // InternalCalculator.g:1223:1: rule__Addition__Group_1_0__2__Impl : ( ( rule__Addition__RightAssignment_1_0_2 ) ) ;
    public final void rule__Addition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1227:1: ( ( ( rule__Addition__RightAssignment_1_0_2 ) ) )
            // InternalCalculator.g:1228:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            {
            // InternalCalculator.g:1228:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            // InternalCalculator.g:1229:2: ( rule__Addition__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 
            }
            // InternalCalculator.g:1230:2: ( rule__Addition__RightAssignment_1_0_2 )
            // InternalCalculator.g:1230:3: rule__Addition__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalCalculator.g:1239:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1243:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalCalculator.g:1244:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalCalculator.g:1251:1: rule__Multiplication__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1255:1: ( ( ruleUnaryExpression ) )
            // InternalCalculator.g:1256:1: ( ruleUnaryExpression )
            {
            // InternalCalculator.g:1256:1: ( ruleUnaryExpression )
            // InternalCalculator.g:1257:2: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getUnaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getUnaryExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalCalculator.g:1266:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1270:1: ( rule__Multiplication__Group__1__Impl )
            // InternalCalculator.g:1271:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalCalculator.g:1277:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1281:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalCalculator.g:1282:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalCalculator.g:1282:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalCalculator.g:1283:2: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalCalculator.g:1284:2: ( rule__Multiplication__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=13 && LA14_0<=14)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCalculator.g:1284:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalCalculator.g:1293:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1297:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalCalculator.g:1298:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalCalculator.g:1305:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1309:1: ( ( () ) )
            // InternalCalculator.g:1310:1: ( () )
            {
            // InternalCalculator.g:1310:1: ( () )
            // InternalCalculator.g:1311:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getBinaryExpressionLeftAction_1_0()); 
            }
            // InternalCalculator.g:1312:2: ()
            // InternalCalculator.g:1312:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getBinaryExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalCalculator.g:1320:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1324:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalCalculator.g:1325:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalCalculator.g:1332:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1336:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalCalculator.g:1337:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalCalculator.g:1337:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalCalculator.g:1338:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            }
            // InternalCalculator.g:1339:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalCalculator.g:1339:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalCalculator.g:1347:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1351:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalCalculator.g:1352:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalCalculator.g:1358:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1362:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalCalculator.g:1363:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalCalculator.g:1363:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalCalculator.g:1364:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            }
            // InternalCalculator.g:1365:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalCalculator.g:1365:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // InternalCalculator.g:1374:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1378:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalCalculator.g:1379:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0"


    // $ANTLR start "rule__UnaryExpression__Group_0__0__Impl"
    // InternalCalculator.g:1386:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1390:1: ( ( () ) )
            // InternalCalculator.g:1391:1: ( () )
            {
            // InternalCalculator.g:1391:1: ( () )
            // InternalCalculator.g:1392:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0()); 
            }
            // InternalCalculator.g:1393:2: ()
            // InternalCalculator.g:1393:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__1"
    // InternalCalculator.g:1401:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1405:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalCalculator.g:1406:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__UnaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__1"


    // $ANTLR start "rule__UnaryExpression__Group_0__1__Impl"
    // InternalCalculator.g:1413:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1417:1: ( ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) ) )
            // InternalCalculator.g:1418:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            {
            // InternalCalculator.g:1418:1: ( ( rule__UnaryExpression__OperatorAssignment_0_1 ) )
            // InternalCalculator.g:1419:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalCalculator.g:1420:2: ( rule__UnaryExpression__OperatorAssignment_0_1 )
            // InternalCalculator.g:1420:3: rule__UnaryExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperatorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__2"
    // InternalCalculator.g:1428:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1432:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalCalculator.g:1433:2: rule__UnaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__2"


    // $ANTLR start "rule__UnaryExpression__Group_0__2__Impl"
    // InternalCalculator.g:1439:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1443:1: ( ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) ) )
            // InternalCalculator.g:1444:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            {
            // InternalCalculator.g:1444:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_2 ) )
            // InternalCalculator.g:1445:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2()); 
            }
            // InternalCalculator.g:1446:2: ( rule__UnaryExpression__ExpressionAssignment_0_2 )
            // InternalCalculator.g:1446:3: rule__UnaryExpression__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalCalculator.g:1455:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1459:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalCalculator.g:1460:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalCalculator.g:1467:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1471:1: ( ( '(' ) )
            // InternalCalculator.g:1472:1: ( '(' )
            {
            // InternalCalculator.g:1472:1: ( '(' )
            // InternalCalculator.g:1473:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalCalculator.g:1482:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1486:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalCalculator.g:1487:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalCalculator.g:1494:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1498:1: ( ( ruleExpression ) )
            // InternalCalculator.g:1499:1: ( ruleExpression )
            {
            // InternalCalculator.g:1499:1: ( ruleExpression )
            // InternalCalculator.g:1500:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalCalculator.g:1509:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1513:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalCalculator.g:1514:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalCalculator.g:1520:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1524:1: ( ( ')' ) )
            // InternalCalculator.g:1525:1: ( ')' )
            {
            // InternalCalculator.g:1525:1: ( ')' )
            // InternalCalculator.g:1526:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__FeatureCall__Group__0"
    // InternalCalculator.g:1536:1: rule__FeatureCall__Group__0 : rule__FeatureCall__Group__0__Impl rule__FeatureCall__Group__1 ;
    public final void rule__FeatureCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1540:1: ( rule__FeatureCall__Group__0__Impl rule__FeatureCall__Group__1 )
            // InternalCalculator.g:1541:2: rule__FeatureCall__Group__0__Impl rule__FeatureCall__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FeatureCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__0"


    // $ANTLR start "rule__FeatureCall__Group__0__Impl"
    // InternalCalculator.g:1548:1: rule__FeatureCall__Group__0__Impl : ( ( rule__FeatureCall__FeatureAssignment_0 ) ) ;
    public final void rule__FeatureCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1552:1: ( ( ( rule__FeatureCall__FeatureAssignment_0 ) ) )
            // InternalCalculator.g:1553:1: ( ( rule__FeatureCall__FeatureAssignment_0 ) )
            {
            // InternalCalculator.g:1553:1: ( ( rule__FeatureCall__FeatureAssignment_0 ) )
            // InternalCalculator.g:1554:2: ( rule__FeatureCall__FeatureAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getFeatureAssignment_0()); 
            }
            // InternalCalculator.g:1555:2: ( rule__FeatureCall__FeatureAssignment_0 )
            // InternalCalculator.g:1555:3: rule__FeatureCall__FeatureAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__FeatureAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getFeatureAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group__1"
    // InternalCalculator.g:1563:1: rule__FeatureCall__Group__1 : rule__FeatureCall__Group__1__Impl ;
    public final void rule__FeatureCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1567:1: ( rule__FeatureCall__Group__1__Impl )
            // InternalCalculator.g:1568:2: rule__FeatureCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__1"


    // $ANTLR start "rule__FeatureCall__Group__1__Impl"
    // InternalCalculator.g:1574:1: rule__FeatureCall__Group__1__Impl : ( ( rule__FeatureCall__Group_1__0 )? ) ;
    public final void rule__FeatureCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1578:1: ( ( ( rule__FeatureCall__Group_1__0 )? ) )
            // InternalCalculator.g:1579:1: ( ( rule__FeatureCall__Group_1__0 )? )
            {
            // InternalCalculator.g:1579:1: ( ( rule__FeatureCall__Group_1__0 )? )
            // InternalCalculator.g:1580:2: ( rule__FeatureCall__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getGroup_1()); 
            }
            // InternalCalculator.g:1581:2: ( rule__FeatureCall__Group_1__0 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalCalculator.g:1581:3: rule__FeatureCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureCall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__1__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1__0"
    // InternalCalculator.g:1590:1: rule__FeatureCall__Group_1__0 : rule__FeatureCall__Group_1__0__Impl ;
    public final void rule__FeatureCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1594:1: ( rule__FeatureCall__Group_1__0__Impl )
            // InternalCalculator.g:1595:2: rule__FeatureCall__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1__0"


    // $ANTLR start "rule__FeatureCall__Group_1__0__Impl"
    // InternalCalculator.g:1601:1: rule__FeatureCall__Group_1__0__Impl : ( ( rule__FeatureCall__Group_1_0__0 ) ) ;
    public final void rule__FeatureCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1605:1: ( ( ( rule__FeatureCall__Group_1_0__0 ) ) )
            // InternalCalculator.g:1606:1: ( ( rule__FeatureCall__Group_1_0__0 ) )
            {
            // InternalCalculator.g:1606:1: ( ( rule__FeatureCall__Group_1_0__0 ) )
            // InternalCalculator.g:1607:2: ( rule__FeatureCall__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getGroup_1_0()); 
            }
            // InternalCalculator.g:1608:2: ( rule__FeatureCall__Group_1_0__0 )
            // InternalCalculator.g:1608:3: rule__FeatureCall__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1_0__0"
    // InternalCalculator.g:1617:1: rule__FeatureCall__Group_1_0__0 : rule__FeatureCall__Group_1_0__0__Impl rule__FeatureCall__Group_1_0__1 ;
    public final void rule__FeatureCall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1621:1: ( rule__FeatureCall__Group_1_0__0__Impl rule__FeatureCall__Group_1_0__1 )
            // InternalCalculator.g:1622:2: rule__FeatureCall__Group_1_0__0__Impl rule__FeatureCall__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
            rule__FeatureCall__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0__0"


    // $ANTLR start "rule__FeatureCall__Group_1_0__0__Impl"
    // InternalCalculator.g:1629:1: rule__FeatureCall__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__FeatureCall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1633:1: ( ( '(' ) )
            // InternalCalculator.g:1634:1: ( '(' )
            {
            // InternalCalculator.g:1634:1: ( '(' )
            // InternalCalculator.g:1635:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getLeftParenthesisKeyword_1_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getLeftParenthesisKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1_0__1"
    // InternalCalculator.g:1644:1: rule__FeatureCall__Group_1_0__1 : rule__FeatureCall__Group_1_0__1__Impl rule__FeatureCall__Group_1_0__2 ;
    public final void rule__FeatureCall__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1648:1: ( rule__FeatureCall__Group_1_0__1__Impl rule__FeatureCall__Group_1_0__2 )
            // InternalCalculator.g:1649:2: rule__FeatureCall__Group_1_0__1__Impl rule__FeatureCall__Group_1_0__2
            {
            pushFollow(FOLLOW_17);
            rule__FeatureCall__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0__1"


    // $ANTLR start "rule__FeatureCall__Group_1_0__1__Impl"
    // InternalCalculator.g:1656:1: rule__FeatureCall__Group_1_0__1__Impl : ( ( rule__FeatureCall__Group_1_0_1__0 )? ) ;
    public final void rule__FeatureCall__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1660:1: ( ( ( rule__FeatureCall__Group_1_0_1__0 )? ) )
            // InternalCalculator.g:1661:1: ( ( rule__FeatureCall__Group_1_0_1__0 )? )
            {
            // InternalCalculator.g:1661:1: ( ( rule__FeatureCall__Group_1_0_1__0 )? )
            // InternalCalculator.g:1662:2: ( rule__FeatureCall__Group_1_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getGroup_1_0_1()); 
            }
            // InternalCalculator.g:1663:2: ( rule__FeatureCall__Group_1_0_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_ID)||LA16_0==12||LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCalculator.g:1663:3: rule__FeatureCall__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureCall__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getGroup_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0__1__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1_0__2"
    // InternalCalculator.g:1671:1: rule__FeatureCall__Group_1_0__2 : rule__FeatureCall__Group_1_0__2__Impl ;
    public final void rule__FeatureCall__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1675:1: ( rule__FeatureCall__Group_1_0__2__Impl )
            // InternalCalculator.g:1676:2: rule__FeatureCall__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0__2"


    // $ANTLR start "rule__FeatureCall__Group_1_0__2__Impl"
    // InternalCalculator.g:1682:1: rule__FeatureCall__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__FeatureCall__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1686:1: ( ( ')' ) )
            // InternalCalculator.g:1687:1: ( ')' )
            {
            // InternalCalculator.g:1687:1: ( ')' )
            // InternalCalculator.g:1688:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_0_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0__2__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1_0_1__0"
    // InternalCalculator.g:1698:1: rule__FeatureCall__Group_1_0_1__0 : rule__FeatureCall__Group_1_0_1__0__Impl rule__FeatureCall__Group_1_0_1__1 ;
    public final void rule__FeatureCall__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1702:1: ( rule__FeatureCall__Group_1_0_1__0__Impl rule__FeatureCall__Group_1_0_1__1 )
            // InternalCalculator.g:1703:2: rule__FeatureCall__Group_1_0_1__0__Impl rule__FeatureCall__Group_1_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__FeatureCall__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0_1__0"


    // $ANTLR start "rule__FeatureCall__Group_1_0_1__0__Impl"
    // InternalCalculator.g:1710:1: rule__FeatureCall__Group_1_0_1__0__Impl : ( ( rule__FeatureCall__ArgsAssignment_1_0_1_0 ) ) ;
    public final void rule__FeatureCall__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1714:1: ( ( ( rule__FeatureCall__ArgsAssignment_1_0_1_0 ) ) )
            // InternalCalculator.g:1715:1: ( ( rule__FeatureCall__ArgsAssignment_1_0_1_0 ) )
            {
            // InternalCalculator.g:1715:1: ( ( rule__FeatureCall__ArgsAssignment_1_0_1_0 ) )
            // InternalCalculator.g:1716:2: ( rule__FeatureCall__ArgsAssignment_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getArgsAssignment_1_0_1_0()); 
            }
            // InternalCalculator.g:1717:2: ( rule__FeatureCall__ArgsAssignment_1_0_1_0 )
            // InternalCalculator.g:1717:3: rule__FeatureCall__ArgsAssignment_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__ArgsAssignment_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getArgsAssignment_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1_0_1__1"
    // InternalCalculator.g:1725:1: rule__FeatureCall__Group_1_0_1__1 : rule__FeatureCall__Group_1_0_1__1__Impl ;
    public final void rule__FeatureCall__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1729:1: ( rule__FeatureCall__Group_1_0_1__1__Impl )
            // InternalCalculator.g:1730:2: rule__FeatureCall__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0_1__1"


    // $ANTLR start "rule__FeatureCall__Group_1_0_1__1__Impl"
    // InternalCalculator.g:1736:1: rule__FeatureCall__Group_1_0_1__1__Impl : ( ( rule__FeatureCall__Group_1_0_1_1__0 )* ) ;
    public final void rule__FeatureCall__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1740:1: ( ( ( rule__FeatureCall__Group_1_0_1_1__0 )* ) )
            // InternalCalculator.g:1741:1: ( ( rule__FeatureCall__Group_1_0_1_1__0 )* )
            {
            // InternalCalculator.g:1741:1: ( ( rule__FeatureCall__Group_1_0_1_1__0 )* )
            // InternalCalculator.g:1742:2: ( rule__FeatureCall__Group_1_0_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getGroup_1_0_1_1()); 
            }
            // InternalCalculator.g:1743:2: ( rule__FeatureCall__Group_1_0_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCalculator.g:1743:3: rule__FeatureCall__Group_1_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__FeatureCall__Group_1_0_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getGroup_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1_0_1_1__0"
    // InternalCalculator.g:1752:1: rule__FeatureCall__Group_1_0_1_1__0 : rule__FeatureCall__Group_1_0_1_1__0__Impl rule__FeatureCall__Group_1_0_1_1__1 ;
    public final void rule__FeatureCall__Group_1_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1756:1: ( rule__FeatureCall__Group_1_0_1_1__0__Impl rule__FeatureCall__Group_1_0_1_1__1 )
            // InternalCalculator.g:1757:2: rule__FeatureCall__Group_1_0_1_1__0__Impl rule__FeatureCall__Group_1_0_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__FeatureCall__Group_1_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0_1_1__0"


    // $ANTLR start "rule__FeatureCall__Group_1_0_1_1__0__Impl"
    // InternalCalculator.g:1764:1: rule__FeatureCall__Group_1_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__FeatureCall__Group_1_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1768:1: ( ( ',' ) )
            // InternalCalculator.g:1769:1: ( ',' )
            {
            // InternalCalculator.g:1769:1: ( ',' )
            // InternalCalculator.g:1770:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getCommaKeyword_1_0_1_1_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getCommaKeyword_1_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0_1_1__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1_0_1_1__1"
    // InternalCalculator.g:1779:1: rule__FeatureCall__Group_1_0_1_1__1 : rule__FeatureCall__Group_1_0_1_1__1__Impl ;
    public final void rule__FeatureCall__Group_1_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1783:1: ( rule__FeatureCall__Group_1_0_1_1__1__Impl )
            // InternalCalculator.g:1784:2: rule__FeatureCall__Group_1_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0_1_1__1"


    // $ANTLR start "rule__FeatureCall__Group_1_0_1_1__1__Impl"
    // InternalCalculator.g:1790:1: rule__FeatureCall__Group_1_0_1_1__1__Impl : ( ( rule__FeatureCall__ArgsAssignment_1_0_1_1_1 ) ) ;
    public final void rule__FeatureCall__Group_1_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1794:1: ( ( ( rule__FeatureCall__ArgsAssignment_1_0_1_1_1 ) ) )
            // InternalCalculator.g:1795:1: ( ( rule__FeatureCall__ArgsAssignment_1_0_1_1_1 ) )
            {
            // InternalCalculator.g:1795:1: ( ( rule__FeatureCall__ArgsAssignment_1_0_1_1_1 ) )
            // InternalCalculator.g:1796:2: ( rule__FeatureCall__ArgsAssignment_1_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getArgsAssignment_1_0_1_1_1()); 
            }
            // InternalCalculator.g:1797:2: ( rule__FeatureCall__ArgsAssignment_1_0_1_1_1 )
            // InternalCalculator.g:1797:3: rule__FeatureCall__ArgsAssignment_1_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__ArgsAssignment_1_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getArgsAssignment_1_0_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1_0_1_1__1__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalCalculator.g:1806:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1810:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalCalculator.g:1811:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Number__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalCalculator.g:1818:1: rule__Number__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1822:1: ( ( RULE_INT ) )
            // InternalCalculator.g:1823:1: ( RULE_INT )
            {
            // InternalCalculator.g:1823:1: ( RULE_INT )
            // InternalCalculator.g:1824:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalCalculator.g:1833:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1837:1: ( rule__Number__Group__1__Impl )
            // InternalCalculator.g:1838:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalCalculator.g:1844:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1848:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // InternalCalculator.g:1849:1: ( ( rule__Number__Group_1__0 )? )
            {
            // InternalCalculator.g:1849:1: ( ( rule__Number__Group_1__0 )? )
            // InternalCalculator.g:1850:2: ( rule__Number__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getGroup_1()); 
            }
            // InternalCalculator.g:1851:2: ( rule__Number__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCalculator.g:1851:3: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // InternalCalculator.g:1860:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1864:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalCalculator.g:1865:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Number__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // InternalCalculator.g:1872:1: rule__Number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1876:1: ( ( '.' ) )
            // InternalCalculator.g:1877:1: ( '.' )
            {
            // InternalCalculator.g:1877:1: ( '.' )
            // InternalCalculator.g:1878:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // InternalCalculator.g:1887:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1891:1: ( rule__Number__Group_1__1__Impl )
            // InternalCalculator.g:1892:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // InternalCalculator.g:1898:1: rule__Number__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1902:1: ( ( RULE_INT ) )
            // InternalCalculator.g:1903:1: ( RULE_INT )
            {
            // InternalCalculator.g:1903:1: ( RULE_INT )
            // InternalCalculator.g:1904:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__Calculation__StatementsAssignment"
    // InternalCalculator.g:1914:1: rule__Calculation__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Calculation__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1918:1: ( ( ruleStatement ) )
            // InternalCalculator.g:1919:2: ( ruleStatement )
            {
            // InternalCalculator.g:1919:2: ( ruleStatement )
            // InternalCalculator.g:1920:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculationAccess().getStatementsStatementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculationAccess().getStatementsStatementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculation__StatementsAssignment"


    // $ANTLR start "rule__Definition__NativeAssignment_0_0"
    // InternalCalculator.g:1929:1: rule__Definition__NativeAssignment_0_0 : ( ( 'native' ) ) ;
    public final void rule__Definition__NativeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1933:1: ( ( ( 'native' ) ) )
            // InternalCalculator.g:1934:2: ( ( 'native' ) )
            {
            // InternalCalculator.g:1934:2: ( ( 'native' ) )
            // InternalCalculator.g:1935:3: ( 'native' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getNativeNativeKeyword_0_0_0()); 
            }
            // InternalCalculator.g:1936:3: ( 'native' )
            // InternalCalculator.g:1937:4: 'native'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getNativeNativeKeyword_0_0_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getNativeNativeKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getNativeNativeKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NativeAssignment_0_0"


    // $ANTLR start "rule__Definition__NameAssignment_0_1"
    // InternalCalculator.g:1948:1: rule__Definition__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1952:1: ( ( RULE_ID ) )
            // InternalCalculator.g:1953:2: ( RULE_ID )
            {
            // InternalCalculator.g:1953:2: ( RULE_ID )
            // InternalCalculator.g:1954:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_0_1"


    // $ANTLR start "rule__Definition__IsFunctionAssignment_0_2"
    // InternalCalculator.g:1963:1: rule__Definition__IsFunctionAssignment_0_2 : ( ( '(' ) ) ;
    public final void rule__Definition__IsFunctionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1967:1: ( ( ( '(' ) ) )
            // InternalCalculator.g:1968:2: ( ( '(' ) )
            {
            // InternalCalculator.g:1968:2: ( ( '(' ) )
            // InternalCalculator.g:1969:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_0_2_0()); 
            }
            // InternalCalculator.g:1970:3: ( '(' )
            // InternalCalculator.g:1971:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_0_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_0_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__IsFunctionAssignment_0_2"


    // $ANTLR start "rule__Definition__ParamsAssignment_0_3_0"
    // InternalCalculator.g:1982:1: rule__Definition__ParamsAssignment_0_3_0 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ParamsAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:1986:1: ( ( ruleDeclaredParameter ) )
            // InternalCalculator.g:1987:2: ( ruleDeclaredParameter )
            {
            // InternalCalculator.g:1987:2: ( ruleDeclaredParameter )
            // InternalCalculator.g:1988:3: ruleDeclaredParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_0_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaredParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_0_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ParamsAssignment_0_3_0"


    // $ANTLR start "rule__Definition__ParamsAssignment_0_3_1_1"
    // InternalCalculator.g:1997:1: rule__Definition__ParamsAssignment_0_3_1_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ParamsAssignment_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2001:1: ( ( ruleDeclaredParameter ) )
            // InternalCalculator.g:2002:2: ( ruleDeclaredParameter )
            {
            // InternalCalculator.g:2002:2: ( ruleDeclaredParameter )
            // InternalCalculator.g:2003:3: ruleDeclaredParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_0_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaredParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_0_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ParamsAssignment_0_3_1_1"


    // $ANTLR start "rule__Definition__NameAssignment_1_1"
    // InternalCalculator.g:2012:1: rule__Definition__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2016:1: ( ( RULE_ID ) )
            // InternalCalculator.g:2017:2: ( RULE_ID )
            {
            // InternalCalculator.g:2017:2: ( RULE_ID )
            // InternalCalculator.g:2018:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_1_1"


    // $ANTLR start "rule__Definition__IsFunctionAssignment_1_2_0"
    // InternalCalculator.g:2027:1: rule__Definition__IsFunctionAssignment_1_2_0 : ( ( '(' ) ) ;
    public final void rule__Definition__IsFunctionAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2031:1: ( ( ( '(' ) ) )
            // InternalCalculator.g:2032:2: ( ( '(' ) )
            {
            // InternalCalculator.g:2032:2: ( ( '(' ) )
            // InternalCalculator.g:2033:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_1_2_0_0()); 
            }
            // InternalCalculator.g:2034:3: ( '(' )
            // InternalCalculator.g:2035:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_1_2_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_1_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getIsFunctionLeftParenthesisKeyword_1_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__IsFunctionAssignment_1_2_0"


    // $ANTLR start "rule__Definition__ParamsAssignment_1_2_1_0"
    // InternalCalculator.g:2046:1: rule__Definition__ParamsAssignment_1_2_1_0 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ParamsAssignment_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2050:1: ( ( ruleDeclaredParameter ) )
            // InternalCalculator.g:2051:2: ( ruleDeclaredParameter )
            {
            // InternalCalculator.g:2051:2: ( ruleDeclaredParameter )
            // InternalCalculator.g:2052:3: ruleDeclaredParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_1_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaredParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_1_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ParamsAssignment_1_2_1_0"


    // $ANTLR start "rule__Definition__ParamsAssignment_1_2_1_1_1"
    // InternalCalculator.g:2061:1: rule__Definition__ParamsAssignment_1_2_1_1_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ParamsAssignment_1_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2065:1: ( ( ruleDeclaredParameter ) )
            // InternalCalculator.g:2066:2: ( ruleDeclaredParameter )
            {
            // InternalCalculator.g:2066:2: ( ruleDeclaredParameter )
            // InternalCalculator.g:2067:3: ruleDeclaredParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_1_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaredParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getParamsDeclaredParameterParserRuleCall_1_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ParamsAssignment_1_2_1_1_1"


    // $ANTLR start "rule__Definition__ExpressionAssignment_1_4"
    // InternalCalculator.g:2076:1: rule__Definition__ExpressionAssignment_1_4 : ( ruleExpression ) ;
    public final void rule__Definition__ExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2080:1: ( ( ruleExpression ) )
            // InternalCalculator.g:2081:2: ( ruleExpression )
            {
            // InternalCalculator.g:2081:2: ( ruleExpression )
            // InternalCalculator.g:2082:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ExpressionAssignment_1_4"


    // $ANTLR start "rule__DeclaredParameter__NameAssignment"
    // InternalCalculator.g:2091:1: rule__DeclaredParameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__DeclaredParameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2095:1: ( ( RULE_ID ) )
            // InternalCalculator.g:2096:2: ( RULE_ID )
            {
            // InternalCalculator.g:2096:2: ( RULE_ID )
            // InternalCalculator.g:2097:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredParameter__NameAssignment"


    // $ANTLR start "rule__Evaluation__ExpressionAssignment"
    // InternalCalculator.g:2106:1: rule__Evaluation__ExpressionAssignment : ( ruleExpression ) ;
    public final void rule__Evaluation__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2110:1: ( ( ruleExpression ) )
            // InternalCalculator.g:2111:2: ( ruleExpression )
            {
            // InternalCalculator.g:2111:2: ( ruleExpression )
            // InternalCalculator.g:2112:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__ExpressionAssignment"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_0_1"
    // InternalCalculator.g:2121:1: rule__Addition__OperatorAssignment_1_0_1 : ( ( rule__Addition__OperatorAlternatives_1_0_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2125:1: ( ( ( rule__Addition__OperatorAlternatives_1_0_1_0 ) ) )
            // InternalCalculator.g:2126:2: ( ( rule__Addition__OperatorAlternatives_1_0_1_0 ) )
            {
            // InternalCalculator.g:2126:2: ( ( rule__Addition__OperatorAlternatives_1_0_1_0 ) )
            // InternalCalculator.g:2127:3: ( rule__Addition__OperatorAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_0_1_0()); 
            }
            // InternalCalculator.g:2128:3: ( rule__Addition__OperatorAlternatives_1_0_1_0 )
            // InternalCalculator.g:2128:4: rule__Addition__OperatorAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_0_2"
    // InternalCalculator.g:2136:1: rule__Addition__RightAssignment_1_0_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2140:1: ( ( ruleMultiplication ) )
            // InternalCalculator.g:2141:2: ( ruleMultiplication )
            {
            // InternalCalculator.g:2141:2: ( ruleMultiplication )
            // InternalCalculator.g:2142:3: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_0_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalCalculator.g:2151:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2155:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalCalculator.g:2156:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalCalculator.g:2156:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalCalculator.g:2157:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            }
            // InternalCalculator.g:2158:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalCalculator.g:2158:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalCalculator.g:2166:1: rule__Multiplication__RightAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2170:1: ( ( ruleUnaryExpression ) )
            // InternalCalculator.g:2171:2: ( ruleUnaryExpression )
            {
            // InternalCalculator.g:2171:2: ( ruleUnaryExpression )
            // InternalCalculator.g:2172:3: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__OperatorAssignment_0_1"
    // InternalCalculator.g:2181:1: rule__UnaryExpression__OperatorAssignment_0_1 : ( ( '-' ) ) ;
    public final void rule__UnaryExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2185:1: ( ( ( '-' ) ) )
            // InternalCalculator.g:2186:2: ( ( '-' ) )
            {
            // InternalCalculator.g:2186:2: ( ( '-' ) )
            // InternalCalculator.g:2187:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperatorHyphenMinusKeyword_0_1_0()); 
            }
            // InternalCalculator.g:2188:3: ( '-' )
            // InternalCalculator.g:2189:4: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperatorHyphenMinusKeyword_0_1_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperatorHyphenMinusKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperatorHyphenMinusKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OperatorAssignment_0_1"


    // $ANTLR start "rule__UnaryExpression__ExpressionAssignment_0_2"
    // InternalCalculator.g:2200:1: rule__UnaryExpression__ExpressionAssignment_0_2 : ( rulePrimaryExpression ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2204:1: ( ( rulePrimaryExpression ) )
            // InternalCalculator.g:2205:2: ( rulePrimaryExpression )
            {
            // InternalCalculator.g:2205:2: ( rulePrimaryExpression )
            // InternalCalculator.g:2206:3: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ExpressionAssignment_0_2"


    // $ANTLR start "rule__FeatureCall__FeatureAssignment_0"
    // InternalCalculator.g:2215:1: rule__FeatureCall__FeatureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureCall__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2219:1: ( ( ( RULE_ID ) ) )
            // InternalCalculator.g:2220:2: ( ( RULE_ID ) )
            {
            // InternalCalculator.g:2220:2: ( ( RULE_ID ) )
            // InternalCalculator.g:2221:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getFeatureAbstractDefinitionCrossReference_0_0()); 
            }
            // InternalCalculator.g:2222:3: ( RULE_ID )
            // InternalCalculator.g:2223:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getFeatureAbstractDefinitionIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getFeatureAbstractDefinitionIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getFeatureAbstractDefinitionCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__FeatureAssignment_0"


    // $ANTLR start "rule__FeatureCall__ArgsAssignment_1_0_1_0"
    // InternalCalculator.g:2234:1: rule__FeatureCall__ArgsAssignment_1_0_1_0 : ( ruleExpression ) ;
    public final void rule__FeatureCall__ArgsAssignment_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2238:1: ( ( ruleExpression ) )
            // InternalCalculator.g:2239:2: ( ruleExpression )
            {
            // InternalCalculator.g:2239:2: ( ruleExpression )
            // InternalCalculator.g:2240:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__ArgsAssignment_1_0_1_0"


    // $ANTLR start "rule__FeatureCall__ArgsAssignment_1_0_1_1_1"
    // InternalCalculator.g:2249:1: rule__FeatureCall__ArgsAssignment_1_0_1_1_1 : ( ruleExpression ) ;
    public final void rule__FeatureCall__ArgsAssignment_1_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2253:1: ( ( ruleExpression ) )
            // InternalCalculator.g:2254:2: ( ruleExpression )
            {
            // InternalCalculator.g:2254:2: ( ruleExpression )
            // InternalCalculator.g:2255:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_0_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getArgsExpressionParserRuleCall_1_0_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__ArgsAssignment_1_0_1_1_1"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalCalculator.g:2264:1: rule__NumberLiteral__ValueAssignment : ( ruleNumber ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculator.g:2268:1: ( ( ruleNumber ) )
            // InternalCalculator.g:2269:2: ( ruleNumber )
            {
            // InternalCalculator.g:2269:2: ( ruleNumber )
            // InternalCalculator.g:2270:3: ruleNumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"

    // $ANTLR start synpred14_InternalCalculator
    public final void synpred14_InternalCalculator_fragment() throws RecognitionException {   
        // InternalCalculator.g:1122:3: ( rule__Addition__Group_1__0 )
        // InternalCalculator.g:1122:3: rule__Addition__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Addition__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalCalculator

    // $ANTLR start synpred16_InternalCalculator
    public final void synpred16_InternalCalculator_fragment() throws RecognitionException {   
        // InternalCalculator.g:1581:3: ( rule__FeatureCall__Group_1__0 )
        // InternalCalculator.g:1581:3: rule__FeatureCall__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__FeatureCall__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalCalculator

    // Delegated rules

    public final boolean synpred16_InternalCalculator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalCalculator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalCalculator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalCalculator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\4\4\uffff\1\0\5\uffff";
    static final String dfa_4s = "\1\25\4\uffff\1\0\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_6s = "\5\uffff\1\0\5\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\5\uffff\1\12\1\5\2\uffff\3\1\1\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1122:2: ( rule__Addition__Group_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalCalculator()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\2\15\uffff";
    static final String dfa_10s = "\1\4\1\0\14\uffff";
    static final String dfa_11s = "\1\25\1\0\14\uffff";
    static final String dfa_12s = "\2\uffff\1\2\12\uffff\1\1";
    static final String dfa_13s = "\1\uffff\1\0\14\uffff}>";
    static final String[] dfa_14s = {
            "\2\2\5\uffff\7\2\1\uffff\1\1\1\uffff\1\2",
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1581:2: ( rule__FeatureCall__Group_1__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalCalculator()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000002A1032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000002A1030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000002A9030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});

}