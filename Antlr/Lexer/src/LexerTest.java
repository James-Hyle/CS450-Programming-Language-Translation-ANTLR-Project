import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

import java.io.FileReader;
import java.io.IOException;

public class LexerTest {
    public static void main(String[] args) {
//        String path = "./src/Test.expr";
//        try {
//            final CodePointCharStream input = CharStreams.fromReader(new FileReader(path));
//            System.out.println("input" + input);
//            final TLexer lexer = new TLexer(input);
//            lexer.getAllTokens().forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }

        String extendPath = "./ast/Extend.expr";
        try {
            final CodePointCharStream input = CharStreams.fromReader(new FileReader(extendPath));
            System.out.println("input\n" + input);
            final TLexer lexer = new TLexer(input);
            lexer.getAllTokens().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException();
        }

//        String AddOpPath = "./src/AddOp.expr";
//        try {
//            final CodePointCharStream input = CharStreams.fromReader(new FileReader(AddOpPath));
//            System.out.println("input\n" + input);
//            final TLexer lexer = new TLexer(input);
//            lexer.getAllTokens().forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }
    }
}

