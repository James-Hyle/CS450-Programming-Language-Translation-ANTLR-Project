import java.io.FileReader;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MainExp {
    public static void main(String[] args) throws Exception {
        String path = "./inputs/test.exp";
        final CodePointCharStream input = CharStreams.fromReader(new FileReader(path));
        final ExpLexer lexer = new ExpLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final ExpParser parser = new ExpParser(tokens);
        ExpParser.StartContext st = parser.start();
        ExpParser.ExpContext exp = st.exp();
        System.out.println(exp.getClass());
        ExpParser.BinaryExpContext bExp = (ExpParser.BinaryExpContext) exp;
        System.out.println(bExp.op);
        System.out.println(bExp.lhs.getClass());
        System.out.println(bExp.rhs.getClass());
        TerminalNode eof = st.EOF();

    }
}