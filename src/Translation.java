import expression.node.ACaseExp;
import expression.node.AIfExp;
import expression.node.AMinusExp;
import expression.node.PCaseVariant;
import expression.parser.ParserException;
import expression.analysis.DepthFirstAdapter;
import expression.node.AExpdef;
import expression.node.AGrammar;
import expression.node.AIdExp;
import expression.node.AMultExp;
import expression.node.ANumberExp;
import expression.node.APlusExp;
import expression.node.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Translation extends DepthFirstAdapter {
    int level = 0;
    Stack<Integer> stack = new Stack<Integer>();
    Map<String, Integer> names = new HashMap<String, Integer>();

    String name;
    @Override
    public void inAExpdef(AExpdef node) {
        super.inAExpdef(node);
        name = node.getName().getText();
    }

    @Override
    public void outAExpdef(AExpdef node) {
        super.outAExpdef(node);
        final Integer value = stack.pop();
        System.out.println("Value of " + name + " = " + value);
        names.put(name, value);
    }

    @Override
    public void outAPlusExp(APlusExp node) {
        super.outAPlusExp(node);
        int r = stack.pop();
        int l = stack.pop();
        stack.push(l+r);
    }

    @Override
    public void outAMinusExp(AMinusExp node) {
        super.outAMinusExp(node);
        int r = stack.pop();
        int l = stack.pop();
        stack.push(l-r);
    }

    @Override
    public void outAMultExp(AMultExp node) {
        super.outAMultExp(node);
        int r = stack.pop();
        int l = stack.pop();
        stack.push(l*r);
    }

    @Override
    public void caseANumberExp(ANumberExp node) {
        super.caseANumberExp(node);
        int n = Integer.parseInt(node.getNumber().getText());
        stack.push(n);
    }

    @Override
    public void caseAIdExp(AIdExp node) {
        super.caseAIdExp(node);
        final String text = node.getId().getText().trim();
        Integer val = names.get(text);
        if (val != null) {
            stack.push(val);
        } else if ("def".equals(text)) {
            stack.push(100);
        } else {
            throw new RuntimeException(new ParserException(node.getId(), "[" + node.getId().getLine() + "," + node.getId().getPos() + "] wrong identifier " + text));
        }
    }

    @Override
    public void inAIfExp(AIfExp node) {
        super.inAIfExp(node);
    }

    @Override
    public void outAIfExp(AIfExp node) {
        super.outAIfExp(node);
        Integer else_part = stack.pop();
        Integer then_part = stack.pop();
        Integer condition = stack.pop();
        if (condition > 0)
            stack.push(then_part);
        else 
            stack.push(else_part);
    }

    class CaseAdapter  extends  DepthFirstAdapter{
    };

    @Override
    public void caseACaseExp(ACaseExp node)
    {
        inACaseExp(node);
        CaseAdapter caseTraversal = new CaseAdapter();

        if(node.getName() != null)
        {
            node.getName().apply(caseTraversal);
        }
        System.out.println("Case by " + node.getName().getText());
        {
            List<PCaseVariant> copy = new ArrayList<PCaseVariant>(node.getCaseVariant());
            for(PCaseVariant e : copy)
            {
                e.apply(caseTraversal);
            }
        }

        stack.push(99);
        outACaseExp(node);
    }
}
