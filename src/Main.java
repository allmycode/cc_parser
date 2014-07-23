import expression.lexer.Lexer;
import expression.lexer.LexerException;
import expression.node.Start;
import expression.parser.Parser;
import expression.parser.ParserException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws ParserException, IOException, LexerException {
        Parser p = new Parser(new Lexer(new PushbackReader( new InputStreamReader(CMain.class.getResourceAsStream("expr.txt")))));
        final Start start = p.parse();
        start.apply(new Printer());
        start.apply(new Translation());
    }
}
