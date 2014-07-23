/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.analysis;

import java.util.*;
import expression.node.*;

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
            List<PExpdef> copy = new ArrayList<PExpdef>(node.getExpdef());
            for(PExpdef e : copy)
            {
                e.apply(this);
            }
        }
        outAGrammar(node);
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
