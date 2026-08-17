import org.antlr.v4.runtime.*;

import java.io.FileReader;

public class ExpParseUtil {
    public static ExpParser.ExpContext parse(final String exp) throws Exception {
        final CodePointCharStream input = CharStreams.fromString(exp);
        final ExpLexer lexer = new ExpLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final ExpParser parser = new ExpParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener(){
            @Override
            public void syntaxError(final Recognizer<?,?> reconizer, final Object offedingSybmol,
                                    final int line, final int charPositonInLine, final String msg,
                                    final RecognitionException e){
                throw new RuntimeException("Parse err in " + exp + ": [" + line + "," + charPositonInLine
                +"]" + msg);
                }
            }
        );
        return parser.start().exp();
    }
}
