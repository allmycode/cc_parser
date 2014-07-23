/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.analysis;

import expression.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAGrammar(AGrammar node);
    void caseAExpdef(AExpdef node);
    void caseACaseVariant(ACaseVariant node);
    void caseAPlusExp(APlusExp node);
    void caseAMinusExp(AMinusExp node);
    void caseADivExp(ADivExp node);
    void caseAMultExp(AMultExp node);
    void caseAIfExp(AIfExp node);
    void caseACaseExp(ACaseExp node);
    void caseAIdExp(AIdExp node);
    void caseANumberExp(ANumberExp node);

    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTSemi(TSemi node);
    void caseTArrow(TArrow node);
    void caseTAssign(TAssign node);
    void caseTId(TId node);
    void caseTIf(TIf node);
    void caseTThen(TThen node);
    void caseTElse(TElse node);
    void caseTCase(TCase node);
    void caseTBlank(TBlank node);
    void caseTNumber(TNumber node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}