import configuration.lexer.Lexer;
import configuration.lexer.LexerException;
import configuration.node.Start;
import configuration.parser.Parser;
import configuration.parser.ParserException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.List;

public class CMain {
    public static void main(String[] args) throws ParserException, IOException, LexerException {
        Parser p = new Parser(new Lexer(new PushbackReader( new InputStreamReader(CMain.class.getResourceAsStream("conf.cfg")))));
        final Start start = p.parse();

        start.apply(new CPrinter());

        final CTranslation traverse = new CTranslation();
        start.apply(traverse);

        List<COInstance> instances = new ArrayList<COInstance>();

        for (PCOInstance i : traverse.instances) {
            System.out.println("Instance " + i.name + " of type: " + i.type);
        }
    }
}
