import expression.analysis.DepthFirstAdapter;
import expression.node.AExpdef;
import expression.node.AMultExp;
import expression.node.ANumberExp;
import expression.node.APlusExp;
import expression.node.Node;

import java.util.Stack;

public class Printer extends DepthFirstAdapter {
    int level = 0;
    Stack<Integer> stack = new Stack<Integer>();

    @Override
    public void defaultIn(@SuppressWarnings("unused") Node node) {
        for (int i = 0; i < level; i++)
            System.out.print('\t');
        System.out.println(node.getClass().getSimpleName() +": " + node);
        level++;
    }

    @Override
    public void defaultOut(@SuppressWarnings("unused") Node node) {
        level--;
    }
}
