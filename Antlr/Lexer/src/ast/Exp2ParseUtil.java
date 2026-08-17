package ast;

import org.antlr.v4.runtime.*;

public class Exp2ParseUtil {
    public static Exp2Parser.ExpContext parse(final String exp) throws Exception {
        final CodePointCharStream input = CharStreams.fromString(exp);
        final Exp2Lexer lexer = new Exp2Lexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final Exp2Parser parser = new Exp2Parser(tokens);
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
