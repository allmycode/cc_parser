import configuration.analysis.DepthFirstAdapter;
import configuration.node.Node;

import java.util.Stack;

public class CPrinter extends DepthFirstAdapter {
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
