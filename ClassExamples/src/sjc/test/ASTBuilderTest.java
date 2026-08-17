package sjc.test;

import org.junit.Assert;
import org.junit.Test;

import sjc.ast.ASTUtil;
import sjc.ast.StaticJavaASTBuilder;

/**
 * Test cases for {@link StaticJavaASTBuilder}.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ASTBuilderTest {
  public static void testPass(final String filename) {
    try {
      String filePath = System.getProperty("user.dir") + "/inputs/" + filename;
      System.out.println(ASTUtil.ast(filePath));
      System.out.flush();

    } catch (final Exception e) {
      e.printStackTrace();
      Assert.assertTrue(e.getMessage(), false);
    }
  }

  @Test
  public void testFactorial() {
    ASTBuilderTest.testPass("Factorial.java");
  }
}
