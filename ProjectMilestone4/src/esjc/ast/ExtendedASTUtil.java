package esjc.ast;

import esjc.parser.ExtendedParserUtil;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class ExtendedASTUtil {
  public static CompilationUnit ast(final String filename) throws Exception {
    return ExtendedStaticJavaASTBuilder.ast(ExtendedParserUtil.parse(filename));
  }
}
