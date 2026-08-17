package esjc.type.checker;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import esjc.type.*;
import esjc.type.ArrayType;
import esjc.type.Type;
import org.eclipse.jdt.core.dom.*;

import esjc.symboltable.SymbolTable;
import esjc.symboltable.ExtendedSymbolTable;
import esjc.util.Pair;

/**
 * This class is used to type check a StaticJava {@link CompilationUnit} with a
 * given {@link SymbolTable}.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ExtendedTypeChecker extends TypeChecker {
  /**
   * Declared as protected to disallow creation of this object outside from the
   * methods of this class.
   */
  protected ExtendedTypeChecker() {
  }

  /**
   * Type checks an ExtendedStaticJava {@link CompilationUnit} with the given
   * {@link ExtendedSymbolTable} and the given {@link TypeFactory}. It also
   * resolves {@link MethodInvocation} of library call (and put its mapping in
   * the {@link ExtendedSymbolTable}).
   *
   * @param tf
   *          The {@link TypeFactory}.
   * @param cu
   *          The StaticJava {@link CompilationUnit}.
   * @param symbolTable
   *          The {@link ExtendedSymbolTable} of the {@link CompilationUnit}
   * @return The {@link ExtendedTypeTable}.
   * @throws Error
   *           If the type checker encounter type error in the
   *           {@link CompilationUnit}.
   */
  public static
  ExtendedTypeTable check(final TypeFactory tf,
                          final CompilationUnit cu,
                          final ExtendedSymbolTable symbolTable) throws Error {
    assert (tf != null) && (cu != null) && (symbolTable != null);

    final Visitor v = new Visitor(tf, symbolTable);
    cu.accept(v);
    final ExtendedTypeTable result = new ExtendedTypeTable(v.resultTypeMap,
            v.resultMethodTypeMap);
    v.dispose();
    return result;
  }

  /**
   * The visitor for {@link ASTNode} to type check an ExtendedStaticJava
   * {@link CompilationUnit}.
   *
   * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
   */
  protected static class Visitor extends TypeChecker.Visitor {
    protected Map<String, TypeDeclaration> classMap;

    protected Map<Pair<String, String>, FieldDeclaration> fieldMap;
    protected Visitor(final TypeFactory tf, final ExtendedSymbolTable est) {
      super(tf, est);
      this.classMap = est.classMap;
      this.fieldMap = est.fieldMap;
      for (final Pair<String, String> p : est.fieldMap.keySet()) {
        final FieldDeclaration fd = est.fieldMap.get(p);
        final Type t = convertType(fd, fd.getType());
        final String className = p.first;
        final String fieldName = p.second;
        final ClassType ct = tf.getClassType(className);
        ct.fieldTypeMap.put(fieldName, t);
      }
    }

    @Override
    protected Type convertType(final ASTNode node, final org.eclipse.jdt.core.dom.Type t) {
      if (t instanceof SimpleType st) {
        final String name = st.getName().getFullyQualifiedName();
        if (this.classMap.containsKey(name)) {
          return this.tf.getClassType(name);
        }
      }
      return super.convertType(node, t);
    }
    //eas -- see new and updated methods below - the originally submitted methods are commented out.
    @Override
    protected void typeCheckMethodInvocation(final MethodInvocation node,
                                             final String className, final String methodName, final Type[] argTypes,
                                             final Method m) {
      final Class[] paramTypeClasses = m.getParameterTypes();
      final int numOfParams = paramTypeClasses.length;
      if (argTypes.length != numOfParams) {
        throw new Error(node, "Wrong number of arguments to invoke method \""
                + methodName + "\" in \"" + node + "\"");
      }
      final java.util.List<Type> paramTypes = new ArrayList<Type>();
      for (int i = 0; i < numOfParams; i++) {
        final Type t = convertType(node, paramTypeClasses[i]);
        if ((argTypes[i] instanceof NullType)
                && (t instanceof NonPrimitiveType)) {
          // OK
        } else if (t != argTypes[i]) {
          throw new Error(node, "Type mismatch the " + i + " argument in \""
                  + node + "\"");
        }
        paramTypes.add(t);
      }
      final Type returnType = convertType(node, m.getReturnType());
      if (!this.resultMethodTypeMap.containsKey(m)) {
        this.resultMethodTypeMap.put(m, new Pair<Type, List<Type>>(returnType, paramTypes));
      }
      setResult(node, returnType);
    }

    @Override
    protected void typeCheckMethodInvocation(final MethodInvocation node,
                                             final String className, final String methodName, final Type[] argTypes,
                                             final MethodDeclaration md) {
      final int numOfParams = md.parameters().size();
      if (argTypes.length != numOfParams) {
        throw new Error(node, "Wrong number of arguments to invoke method \""
                + methodName + "\" in \"" + node + "\"");
      }
      for (int i = 0; i < numOfParams; i++) {
        final Type t = convertType(node, ((SingleVariableDeclaration) md
                .parameters().get(i)).getType());
        if ((argTypes[i] instanceof NullType)
                && (t instanceof NonPrimitiveType)) {
          // OK
        } else if (t != argTypes[i]) {
          throw new Error(node, "Type mismatch the " + i + " argument in \""
                  + node + "\"");
        }
      }
      final Type returnType = convertType(node, md.getReturnType2());
      setResult(node, returnType);
    }
    @Override
    public boolean visit(final DoStatement node) {
      node.getBody().accept(this);
      node.getExpression().accept(this);
      final Type t = getResult();
      if (t != this.tf.Boolean) {
        throw new Error(node,
                "Expecting a boolean type expression as the condition of a while-statement: \""
                        + node.getExpression() + "\"");
      }
      return false;
    }

//    @Override
//    public boolean visit(final ExpressionStatement node) {
//      Expression exp = node.getExpression();
//      exp.accept(this);
//      if (exp instanceof PostfixExpression) {
//        getResult();
//      }
//      return false;
//    }

    @Override
    public boolean visit(final ExpressionStatement node) {
      final Expression e = node.getExpression();
      if (e instanceof PostfixExpression) {
        e.accept(this);
        // postfix expression statement should not have a resulting
        // type.
        assert getResult() == null;
        return false;
      } else {
        return super.visit(node);
      }
    }

    @Override
    public boolean visit(final PostfixExpression node) {
      node.getOperand().accept(this);
      final Type t = getResult();
      if (t != this.tf.Int) {
        throw new Error(node,
                "Expecting an int type expression as the operand of \'"
                        + node.getOperator() + "\': \"" + node.getOperand() + "\"");
      }
      // no need to set the type result for postfix expressions since
      // postfix expressions in StaticJava are statements,
      // i.e., they are evaluated for their side-effects.
      return false;
    }

    @Override
    public boolean visit(final PrefixExpression node) {
      final PrefixExpression.Operator op = node.getOperator();
      if (op == PrefixExpression.Operator.COMPLEMENT) {
        node.getOperand().accept(this);
        final Type t = getResult();
        if (t != this.tf.Int) {
          throw new Error(node,
                  "Expecting an int type expression as the operand of \"" + op
                          + "\" in \"" + node + "\"");
        }
        setResult(node, this.tf.Int);
        return false;
      } else {
        return super.visit(node);
      }
    }

    @Override
    public boolean visit(final ReturnStatement node) {
      final Expression e = node.getExpression();
      if ((this.methodReturnType != this.tf.Void) && (e != null)) {
        e.accept(this);
        final Type t = getResult();
        if ((t instanceof NullType)
                && (this.methodReturnType instanceof NonPrimitiveType)) {
          // ok
        } else if (t != this.methodReturnType) {
          throw new Error(node, "Expecting " + this.methodReturnType.name
                  + " return expression in \"" + node + "\"");
        }
      } else {
        super.visit(node);
      }
      return false;
    }

    @Override
    public boolean visit(final Assignment node) {
      node.getLeftHandSide().accept(this);
      final Type lhsType = getResult();
      node.getRightHandSide().accept(this);
      final Type rhsType = getResult();
      if ((rhsType instanceof NullType)
              && (lhsType instanceof NonPrimitiveType)) {
        // no need to set the type result for assignments since
        // assignments in StaticJava are statements,
        // i.e., they are evaluated for their side-effects.
        return false;
      } else if (lhsType != rhsType) {
        throw new Error(node, "Type mismatch in \"" + node + "\": " + lhsType
                + " = " + rhsType);
      }
      // no need to set the type result for assignments since
      // assignments in StaticJava are statements,
      // i.e., they are evaluated for their side-effects.
      return false;
    }

    @Override
    public boolean visit(final InfixExpression node) {
      final InfixExpression.Operator op = node.getOperator();
      if ((op == InfixExpression.Operator.AND)
              || (op == InfixExpression.Operator.OR)
              || (op == InfixExpression.Operator.LEFT_SHIFT)
              || (op == InfixExpression.Operator.RIGHT_SHIFT_SIGNED)
              || (op == InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED)
              || (op == InfixExpression.Operator.XOR)) {
        node.getLeftOperand().accept(this);
        final Type lhsType = getResult();
        node.getRightOperand().accept(this);
        final Type rhsType = getResult();
        if (lhsType != this.tf.Int) {
          throw new Error(node,
                  "Expecting an int type expression as the left-hand operand of \""
                          + op + "\" in \"" + node + "\"");
        }
        if (rhsType != this.tf.Int) {
          throw new Error(node,
                  "Expecting an int type expression as the right-hand operand of \""
                          + op + "\" in \"" + node + "\"");
        }
        setResult(node, this.tf.Int);
        return false;
      } else if ((op == InfixExpression.Operator.EQUALS)
              || (op == InfixExpression.Operator.NOT_EQUALS)) {
        node.getLeftOperand().accept(this);
        final Type lhsType = getResult();
        node.getRightOperand().accept(this);
        final Type rhsType = getResult();
        if (((lhsType instanceof NullType) && (rhsType instanceof NonPrimitiveType))
                || ((rhsType instanceof NullType) && (lhsType instanceof NonPrimitiveType))) {
          // OK
        } else if (lhsType != rhsType) {
          throw new Error(node, "Type mismatch in \"" + node + "\": " + lhsType
                  + " " + op + " " + rhsType);
        }
        setResult(node, this.tf.Boolean);
        return false;
      } else {
        return super.visit(node);
      }
    }

//    @Override
//    public boolean visit(final ConditionalExpression node) {
//
//      node.getExpression().accept(this);
//      Type type = getResult();
//
//      if (type != this.tf.Boolean) {
//        throw new Error(node,
//                "Expecting a boolean condition in \"" + node + "\"");
//      }
//
//      node.getThenExpression().accept(this);
//      Type thenType = getResult();
//
//      node.getElseExpression().accept(this);
//      Type elseType = getResult();
//
//      if (thenType != elseType) {
//        throw new Error(node,
//                "Type mismatch in conditional expression \"" + node + "\"");
//      }
//
//      setResult(node, thenType);
//      return false;
//    }

    @Override
    public boolean visit(final ConditionalExpression node) {
      node.getExpression().accept(this);
      final Type eType = getResult();
      if (eType != this.tf.Boolean) {
        throw new Error(node,
                "Expecting a boolean type expression as the condition in \'" + node
                        + "\"");
      }
      node.getThenExpression().accept(this);
      final Type thenType = getResult();
      node.getElseExpression().accept(this);
      final Type elseType = getResult();
      if ((thenType instanceof NullType)
              && (elseType instanceof NonPrimitiveType)) {
        setResult(node, elseType);
        return false;
      } else if ((thenType instanceof NonPrimitiveType)
              && (elseType instanceof NullType)) {
        setResult(node, thenType);
        return false;
      } else if (thenType != elseType) {
        throw new Error(node, "Type mismatch for conditional expression \'"
                + node + "\": " + thenType + " : " + elseType);
      }
      setResult(node, thenType);
      return false;
    }

//    @Override
//    public boolean visit(final ArrayCreation node) {
//
//      final org.eclipse.jdt.core.dom.ArrayType type = node.getType();
//      final BaseType bt = (BaseType) convertType(node, type.getElementType());
//
//      for (Object dim : node.dimensions()) {
//        Expression exp = (Expression) dim;
//        exp.accept(this);
//        if (getResult() != this.tf.Int) {
//          throw new Error(node,
//                  "Expecting int expression as array dimension in \"" + node + "\"");
//        }
//      }
//
//      if (node.getInitializer() != null) {
//        node.getInitializer().accept(this);
//        getResult();
//      }
//
//      setResult(node, this.tf.getArrayType(bt));
//      return false;
//    }

    @Override
    public boolean visit(final ArrayCreation node) {
      final ArrayType at = (ArrayType) convertType(node, node.getType());
      final ArrayInitializer a = node.getInitializer();
      if (a == null) {
        ((ASTNode) node.dimensions().get(0)).accept(this);
        final Type t = getResult();
        if (t != this.tf.Int) {
          throw new Error(node,
                  "Expecting an int type expression for the array length in \'"
                          + node + "\'");
        }
      } else {
        final BaseType bt = at.baseType;
        int i = 0;
        for (final Object o : a.expressions()) {
          ((ASTNode) o).accept(this);
          final Type t = getResult();
          if ((t instanceof NullType) && (bt instanceof NonPrimitiveType)) {
            // ok
          } else if (t != bt) {
            throw new Error(node, "Type mismatch in array initializer element "
                    + i + " in \'" + node + "\': " + bt + " : " + t);
          }
          i++;
        }
      }
      setResult(node, at);
      return false;
    }

//    @Override
//    public boolean visit(final FieldAccess node) {
//      node.getExpression().accept(this);
//      final Type objectType = getResult();
//
//      if (!(objectType instanceof ClassType classType)) {
//        throw new Error(node, "Cannot access field on non-class type in \"" + node + "\"");
//      }
//
//      final String fieldName = node.getName().getIdentifier();
//      Type fieldType = classType.fieldTypeMap.get(fieldName);
//
//      if (fieldType == null) {
//        throw new Error(node, "Unresolved field \"" + fieldName + "\" in class \"" + classType.name + "\"");
//      }
//
//      this.resultingType = fieldType;
//      return false;
//    }

    @Override
    public boolean visit(final FieldAccess node) {
      node.getExpression().accept(this);
      final Type t = getResult();
      if (!(t instanceof ClassType)) {
        throw new Error(node,
                "Expecting a class type expression in field access: \'" + node
                        + "\'");
      }
      final ClassType ct = (ClassType) t;
      final String fieldName = node.getName().getIdentifier();
      final Type fieldType = ct.fieldTypeMap.get(fieldName);
      if (fieldType == null) {
        throw new Error(node,
                "Undeclared field in field access of class type \'" + ct + "\': \'"
                        + node + "\'");
      }
      setResult(node, fieldType);
      this.symbolMap.put(node, this.fieldMap.get(new Pair<String, String>(
              ct.name, fieldName)));
      return false;
    }

    @Override
    public boolean visit(final ArrayInitializer node) {

      for (Object obj : node.expressions()) {
        Expression e = (Expression) obj;
        e.accept(this);
        getResult();
      }

      this.resultingType = null;
      return false;
    }

//    @Override
//    public boolean visit(final NullLiteral node) {
//      this.resultTypeMap.put(node, null);
//      this.resultingType = null;
//      return false;
//    }

    @Override
    public boolean visit(final NullLiteral node) {
      setResult(node, this.tf.Null);
      return false;
    }

//    @Override
//    public boolean visit(final ClassInstanceCreation node) {
//      final String name = ((SimpleType) node.getType()).getName().getFullyQualifiedName();
//      this.resultingType = this.tf.getClassType(name);
//      return false;
//    }

    @Override
    public boolean visit(final ClassInstanceCreation node) {
      final String className = ((SimpleType) node.getType()).getName()
              .getFullyQualifiedName();
      if (!this.classMap.containsKey(className)) {
        throw new Error(node, "Undeclared class type in \'" + node + "\"");
      }
      setResult(node, this.tf.getClassType(className));
      this.symbolMap.put(node, this.classMap.get(className));
      return false;
    }

    @Override
    public boolean visit(final ArrayAccess node) {
      node.getArray().accept(this);
      final Type arrayType = getResult();

      if (!(arrayType instanceof ArrayType at)) {
        throw new Error(node,
                "Expecting an array type expression for array access in \""
                        + node + "\"");
      }

      node.getIndex().accept(this);
      final Type indexType = getResult();

      if (indexType != this.tf.Int) {
        throw new Error(node,
                "Expecting an int type expression as array index in \""
                        + node + "\"");
      }

      setResult(node, at.baseType);
      return false;
    }

    @Override
    protected void dispose() {
      super.dispose();

      this.classMap = null;
      this.fieldMap = null;
    }
  }
}
