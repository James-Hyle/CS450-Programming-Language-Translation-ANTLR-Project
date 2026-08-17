package sjc.symboltable;

import java.util.Map;
import java.util.TreeSet;
import java.util.Collection;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;

/**
 * This class represents a symbol table for a StaticJava {@link CompilationUnit}
 * .
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class SymbolTable {
  /**
   * Holds the map of:
   * <ul>
   * <li>a {@link SimpleName} expression, i.e., a reference to a field, a method
   * parameter, or a local variable, to its corresponding
   * {@link FieldDeclaration}, {@link SingleVariableDeclaration}, or
   * {@link VariableDeclarationStatement}, respectively, and</li>
   * <li>a {@link MethodInvocation} expression to its corresponding
   * {@link MethodDeclaration} or {@link java.lang.reflect.Method}. Note that
   * {@link MethodInvocation} that refers to {@link java.lang.reflect.Method} in
   * the library is resolved in the type checking phase.</li>
   * </ul>
   */
  public final
  Map<ASTNode, Object> symbolMap;

  /**
   * Constructs a symbol table for a StaticJava {@link CompilationUnit}.
   * 
   * @param symbolMap
   *          The symbol map.
   */
  protected SymbolTable(final Map<ASTNode, Object> symbolMap) {
    assert (symbolMap != null) && checkNonNullElements(symbolMap);
    this.symbolMap = symbolMap;
  }

  /**
   * Returns the {@link String} representation of this symbol table.
   * 
   * @return The {@link String} representation of this symbol table.
   */
  @Override
  public
  String toString() {
    final String lineSep = System.getProperty("line.separator");
    final StringBuilder sb = new StringBuilder();
    final TreeSet<String> set = new TreeSet<>();
    for (final ASTNode n : this.symbolMap.keySet()) {
      final Object o = this.symbolMap.get(n);
      set.add("\"" + getFirstLine(n) + "\" in \""
          + getFirstLine(n.getParent()) + "\" ==> " + getFirstLine(o));
    }
    for (final String s : set) {
      sb.append(s);
      sb.append(lineSep);
    }
    return sb.toString();
  }

  public static boolean checkNonNullElements(
          @SuppressWarnings("rawtypes") final Map m) {
    if (m == null) {
      return false;
    }
    if (!checkNonNullElements(m.keySet())) {
      return false;
    }
    return checkNonNullElements(m.values());
  }

  public static boolean checkNonNullElements(
          @SuppressWarnings("rawtypes") final Collection c) {
    if (c == null) {
      return false;
    }
    for (final Object o : c) {
      if (o == null) {
        return false;
      }
    }
    return true;
  }

  public static
  String getFirstLine(final Object o) {
    assert o != null;
    final String nText = o.toString();
    final int index = nText.indexOf('\n');
    return index >= 0 ? nText.substring(0, index) : nText;
  }
}
