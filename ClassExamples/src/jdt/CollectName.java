package jdt;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.SimpleName;

public class CollectName {
  /**
   * The visitor for {@link ASTNode} to collect Simple Names.
   */
  protected static class Visitor extends ASTVisitor {
    public ArrayList<String> result = new ArrayList<>();
    @Override
    public boolean visit(final SimpleName node) {
      this.result.add(node.getIdentifier());
      return false;
    }
  }

  public static ArrayList<String> collect(final CompilationUnit cu) {
    assert cu != null;
    final Visitor v = new Visitor();
    final ArrayList<String> r = v.result;
    cu.accept(v);
    return r;
  }

  /**
   * Declared as protected to disallow creation of this object outside from the
   * methods of this class.
   */
  protected CollectName() {
  }
}
