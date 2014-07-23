/* This file was generated by SableCC (http://www.sablecc.org/). */

package configuration.analysis;

import java.util.*;
import configuration.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPGrammar().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAGrammar(AGrammar node)
    {
        defaultIn(node);
    }

    public void outAGrammar(AGrammar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGrammar(AGrammar node)
    {
        inAGrammar(node);
        {
            List<PDef> copy = new ArrayList<PDef>(node.getDef());
            for(PDef e : copy)
            {
                e.apply(this);
            }
        }
        outAGrammar(node);
    }

    public void inATypeDef(ATypeDef node)
    {
        defaultIn(node);
    }

    public void outATypeDef(ATypeDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATypeDef(ATypeDef node)
    {
        inATypeDef(node);
        if(node.getI() != null)
        {
            node.getI().apply(this);
        }
        {
            List<PFieldDef> copy = new ArrayList<PFieldDef>(node.getF());
            for(PFieldDef e : copy)
            {
                e.apply(this);
            }
        }
        outATypeDef(node);
    }

    public void inAInstanceDef(AInstanceDef node)
    {
        defaultIn(node);
    }

    public void outAInstanceDef(AInstanceDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInstanceDef(AInstanceDef node)
    {
        inAInstanceDef(node);
        if(node.getO() != null)
        {
            node.getO().apply(this);
        }
        if(node.getT() != null)
        {
            node.getT().apply(this);
        }
        {
            List<PExpdef> copy = new ArrayList<PExpdef>(node.getExpdef());
            for(PExpdef e : copy)
            {
                e.apply(this);
            }
        }
        outAInstanceDef(node);
    }

    public void inAExpdefDef(AExpdefDef node)
    {
        defaultIn(node);
    }

    public void outAExpdefDef(AExpdefDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpdefDef(AExpdefDef node)
    {
        inAExpdefDef(node);
        if(node.getExpdef() != null)
        {
            node.getExpdef().apply(this);
        }
        outAExpdefDef(node);
    }

    public void inASimpleFieldDef(ASimpleFieldDef node)
    {
        defaultIn(node);
    }

    public void outASimpleFieldDef(ASimpleFieldDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleFieldDef(ASimpleFieldDef node)
    {
        inASimpleFieldDef(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outASimpleFieldDef(node);
    }

    public void inAWithDefaultFieldDef(AWithDefaultFieldDef node)
    {
        defaultIn(node);
    }

    public void outAWithDefaultFieldDef(AWithDefaultFieldDef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWithDefaultFieldDef(AWithDefaultFieldDef node)
    {
        inAWithDefaultFieldDef(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getDefault() != null)
        {
            node.getDefault().apply(this);
        }
        outAWithDefaultFieldDef(node);
    }

    public void inAExpdef(AExpdef node)
    {
        defaultIn(node);
    }

    public void outAExpdef(AExpdef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpdef(AExpdef node)
    {
        inAExpdef(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpdef(node);
    }

    public void inACaseVariant(ACaseVariant node)
    {
        defaultIn(node);
    }

    public void outACaseVariant(ACaseVariant node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaseVariant(ACaseVariant node)
    {
        inACaseVariant(node);
        if(node.getCondition() != null)
        {
            node.getCondition().apply(this);
        }
        if(node.getOutcome() != null)
        {
            node.getOutcome().apply(this);
        }
        outACaseVariant(node);
    }

    public void inAPlusExp(APlusExp node)
    {
        defaultIn(node);
    }

    public void outAPlusExp(APlusExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExp(APlusExp node)
    {
        inAPlusExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAPlusExp(node);
    }

    public void inAMinusExp(AMinusExp node)
    {
        defaultIn(node);
    }

    public void outAMinusExp(AMinusExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExp(AMinusExp node)
    {
        inAMinusExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMinusExp(node);
    }

    public void inADivExp(ADivExp node)
    {
        defaultIn(node);
    }

    public void outADivExp(ADivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        inADivExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outADivExp(node);
    }

    public void inAMultExp(AMultExp node)
    {
        defaultIn(node);
    }

    public void outAMultExp(AMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        inAMultExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAMultExp(node);
    }

    public void inAIfExp(AIfExp node)
    {
        defaultIn(node);
    }

    public void outAIfExp(AIfExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfExp(AIfExp node)
    {
        inAIfExp(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getThenPart() != null)
        {
            node.getThenPart().apply(this);
        }
        if(node.getElsePart() != null)
        {
            node.getElsePart().apply(this);
        }
        outAIfExp(node);
    }

    public void inACaseExp(ACaseExp node)
    {
        defaultIn(node);
    }

    public void outACaseExp(ACaseExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaseExp(ACaseExp node)
    {
        inACaseExp(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        {
            List<PCaseVariant> copy = new ArrayList<PCaseVariant>(node.getCaseVariant());
            for(PCaseVariant e : copy)
            {
                e.apply(this);
            }
        }
        outACaseExp(node);
    }

    public void inAEquExp(AEquExp node)
    {
        defaultIn(node);
    }

    public void outAEquExp(AEquExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEquExp(AEquExp node)
    {
        inAEquExp(node);
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        outAEquExp(node);
    }

    public void inAIdExp(AIdExp node)
    {
        defaultIn(node);
    }

    public void outAIdExp(AIdExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdExp(AIdExp node)
    {
        inAIdExp(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdExp(node);
    }

    public void inAStringExp(AStringExp node)
    {
        defaultIn(node);
    }

    public void outAStringExp(AStringExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringExp(AStringExp node)
    {
        inAStringExp(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringExp(node);
    }

    public void inANumberExp(ANumberExp node)
    {
        defaultIn(node);
    }

    public void outANumberExp(ANumberExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberExp(ANumberExp node)
    {
        inANumberExp(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberExp(node);
    }
}