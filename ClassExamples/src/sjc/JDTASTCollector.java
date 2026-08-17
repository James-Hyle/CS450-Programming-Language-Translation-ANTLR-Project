package sjc;

import jdt.CollectInt;
import jdt.CollectName;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.junit.Assert;
import org.junit.Test;
import sjc.ast.ASTUtil;

/**
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class JDTASTCollector {
  public static void testPass(final String filename) {
    try {
      String filePath = System.getProperty("user.dir") + "/inputs/" + filename;
      final CompilationUnit cu = ASTUtil.ast(filePath);
      System.out.println("Integer Literals:");
      System.out.println(CollectInt.collect(cu));
      System.out.flush();
      System.out.println("Simple Names:");
      System.out.println(CollectName.collect(cu));
      System.out.flush();

    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    JDTASTCollector.testPass("Factorial.java");
  }
  @Test
  public void testPower() {
    JDTASTCollector.testPass("Power.java");
  }
}
