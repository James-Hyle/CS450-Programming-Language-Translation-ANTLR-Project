package esjc.codegen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import esjc.type.*;
import esjc.type.Type;
import org.eclipse.jdt.core.dom.*;

import esjc.symboltable.ExtendedSymbolTable;
import esjc.type.checker.ExtendedTypeTable;
import esjc.util.Pair;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;

/**
 * This class is used to translate an ExtendedStaticJava {@link CompilationUnit}
 * to {@link ExtendedClassByteCodes} that represent a Java 1.5 class files.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ExtendedByteCodeGenerator extends ByteCodeGenerator {
    /**
     * Declared as protected to disallow creation of this object outside from the
     * methods of this class.
     */
    protected ExtendedByteCodeGenerator() {
    }

    /**
     * Generates a {@link ExtendedClassByteCodes} that represents the class files
     * for the given ExtendedStaticJava {@link CompilationUnit} with the given
     * {@link ExtendedSymbolTable} and {@link ExtendedTypeTable}.
     *
     * @param cu  The StaticJava {@link CompilationUnit}.
     * @param est The {@link ExtendedSymbolTable} of the {@link CompilationUnit}.
     * @param ett The {@link ExtendedTypeTable} of the {@link CompilationUnit}.
     * @return The {@link ExtendedClassByteCodes} that represents the class files
     * for the given ExtendedStaticJava {@link CompilationUnit} with the
     * given {@link ExtendedSymbolTable} and {@link ExtendedTypeTable}.
     * @throws Error If the generator encounter unexpected error.
     */
    public static ExtendedClassByteCodes generate(final CompilationUnit cu,
                                                  final ExtendedSymbolTable est,
                                                  final ExtendedTypeTable ett) throws Error {
        assert (cu != null) && (est != null) && (ett != null);

        final Visitor v = new Visitor(est, ett);
        cu.accept(v);
        final ExtendedClassByteCodes result = new ExtendedClassByteCodes(
                v.mainClassName, v.mainClassBytes, v.otherClasses);
        v.dispose();
        return result;
    }

    /**
     * The visitor for {@link ASTNode} to generate bytecodes.
     *
     * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
     */
    protected static class Visitor extends ByteCodeGenerator.Visitor {
        public
        Map<String, byte[]> otherClasses = new HashMap<String, byte[]>();

        protected Map<String, TypeDeclaration> classMap;

        protected Map<Pair<String, String>, FieldDeclaration> fieldMap;

        protected Visitor(final ExtendedSymbolTable st, final ExtendedTypeTable tt) {
            super(st, tt);
            this.classMap = st.classMap;
            this.fieldMap = st.fieldMap;
        }

        @Override
        protected void dispose() {
            super.dispose();
            this.classMap = null;
            this.fieldMap = null;
        }

        @Override
        public boolean visit(final ConditionalExpression node) {
            Label elseLabel = new Label();
            Label endLabel = new Label();

            node.getExpression().accept(this);
            this.mv.visitJumpInsn(Opcodes.IFLE, elseLabel);

            node.getThenExpression().accept(this);
            this.mv.visitJumpInsn(Opcodes.GOTO, endLabel);

            this.mv.visitLabel(elseLabel);
            node.getElseExpression().accept(this);

            this.mv.visitLabel(endLabel);

            return false;
        }

        @Override
        public boolean visit(final PostfixExpression node) {
            Expression operand = node.getOperand();
            PostfixExpression.Operator op = node.getOperator();

            int incDec = (op == PostfixExpression.Operator.INCREMENT) ? 1 : -1;

            if (operand instanceof SimpleName sn) {
                Integer slot = this.localIndexMap.get(sn.getIdentifier());
                this.mv.visitIincInsn(slot, incDec);
            } else if (operand instanceof FieldAccess fa) {
                fa.getExpression().accept(this);
                this.mv.visitInsn(Opcodes.DUP);
                Type receiverType = this.typeMap.get(fa.getExpression());
                String name = fa.getName().getIdentifier();
                String desc = convertType(this.typeMap.get(fa));

                this.mv.visitFieldInsn(Opcodes.GETFIELD, receiverType.name, name, desc);
                generateIntConst(incDec);
                this.mv.visitInsn(Opcodes.IADD);
                this.mv.visitFieldInsn(Opcodes.PUTFIELD, receiverType.name, name, desc);
            }
            return false;
        }

        @Override
        public boolean visit(final ArrayCreation node) {
            final ArrayInitializer init = node.getInitializer();
            final Type elemType = ((esjc.type.ArrayType) this.typeMap.get(node)).baseType;

            if (init != null) {
                final List<?> exps = init.expressions();
                generateIntConst(exps.size());

                int storeOpcode;
                if (elemType instanceof IntType) {
                    this.mv.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_INT);
                    storeOpcode = Opcodes.IASTORE;
                } else if (elemType instanceof BooleanType) {
                    this.mv.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_BOOLEAN);
                    storeOpcode = Opcodes.BASTORE;
                } else {
                    this.mv.visitTypeInsn(Opcodes.ANEWARRAY, elemType.name);
                    storeOpcode = Opcodes.AASTORE;
                }

                for (int i = 0; i < exps.size(); i++) {
                    this.mv.visitInsn(Opcodes.DUP);
                    generateIntConst(i);
                    ((Expression) exps.get(i)).accept(this);
                    this.mv.visitInsn(storeOpcode);
                }
            } else {
                ((Expression) node.dimensions().get(0)).accept(this);
                if (elemType instanceof IntType) {
                    this.mv.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_INT);
                } else if (elemType instanceof BooleanType) {
                    this.mv.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_BOOLEAN);
                } else {
                    this.mv.visitTypeInsn(Opcodes.ANEWARRAY, elemType.name);
                }
            }
            return false;
        }

        @Override
        public boolean visit(final ArrayInitializer node) {
            final List<?> exps = node.expressions();
            final Type elemType = ((esjc.type.ArrayType) this.typeMap.get(node)).baseType;

            generateIntConst(exps.size());

            int storeOpcode;
            if (elemType instanceof IntType) {
                this.mv.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_INT);
                storeOpcode = Opcodes.IASTORE;
            } else if (elemType instanceof BooleanType) {
                this.mv.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_BOOLEAN);
                storeOpcode = Opcodes.BASTORE;
            } else {
                this.mv.visitTypeInsn(Opcodes.ANEWARRAY, elemType.name);
                storeOpcode = Opcodes.AASTORE;
            }

            for (int i = 0; i < exps.size(); i++) {
                this.mv.visitInsn(Opcodes.DUP);
                generateIntConst(i);
                ((Expression) exps.get(i)).accept(this);
                this.mv.visitInsn(storeOpcode);
            }
            return false;
        }

        @Override
        public boolean visit(final ClassInstanceCreation node) {
            final String className = node.getType().toString();
            this.mv.visitTypeInsn(Opcodes.NEW, className);
            this.mv.visitInsn(Opcodes.DUP);
            this.mv.visitMethodInsn(Opcodes.INVOKESPECIAL, className, "<init>", "()V", false);
            return false;
        }

        @Override
        public boolean visit(final TypeDeclaration node) {
            for (final Object o : node.modifiers()) {
                final Modifier modifier = (Modifier) o;
                if (modifier.isPublic()) {
                    return super.visit(node);
                }
            }

            final String name = node.getName().getIdentifier();
            this.cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
            this.cw.visit(
                    Opcodes.V1_5,
                    Opcodes.ACC_SUPER,
                    name,
                    null,
                    "java/lang/Object",
                    null);
            this.cw.visitSource(null, null);
            generateConstructor(name);
            for (final Object o : node.bodyDeclarations()) {
                ((ASTNode) o).accept(this);
            }

            this.cw.visitEnd();
            final byte[] bytes = this.cw.toByteArray();
            this.cw = null;
            this.otherClasses.put(name, bytes);
            return false;
        }

        @Override
        public boolean visit(final ArrayAccess node) {
            node.getArray().accept(this);
            node.getIndex().accept(this);

            final Type t = this.typeMap.get(node);
            if (t instanceof IntType) {
                this.mv.visitInsn(Opcodes.IALOAD);
            } else if (t instanceof BooleanType) {
                this.mv.visitInsn(Opcodes.BALOAD);
            } else {
                this.mv.visitInsn(Opcodes.AALOAD);
            }
            return false;
        }

        @Override
        public boolean visit(final ForStatement node) {
            Label startLabel = new Label();
            Label endLabel = new Label();
            Label updateLabel = new Label();

            for (Object o : node.initializers()) {
                ((Expression) o).accept(this);
                if (this.typeMap.get(o) != null) {
                    this.mv.visitInsn(Opcodes.POP);
                }
            }

            this.mv.visitLabel(startLabel);

            if (node.getExpression() != null) {
                node.getExpression().accept(this);
                this.mv.visitJumpInsn(Opcodes.IFEQ, endLabel);
            }

            node.getBody().accept(this);

            this.mv.visitLabel(updateLabel);
            for (Object o : node.updaters()) {
                ((Expression) o).accept(this);
                if (this.typeMap.get(o) != null) {
                    this.mv.visitInsn(Opcodes.POP);
                }
            }

            this.mv.visitJumpInsn(Opcodes.GOTO, startLabel);
            this.mv.visitLabel(endLabel);

            return false;
        }

        @Override
        public boolean visit(final DoStatement node) {
            final Label loopLabel = new Label();
            this.mv.visitLabel(loopLabel);
            node.getBody().accept(this);
            node.getExpression().accept(this);
            this.mv.visitJumpInsn(Opcodes.IFNE, loopLabel);
            return false;
        }

        public boolean visit(final NullLiteral node) {
            this.mv.visitInsn(Opcodes.ACONST_NULL);
            return false;
        }

        @Override
        public boolean visit(final FieldAccess node) {
            node.getExpression().accept(this);
            final String name = this.typeMap.get(node.getExpression()).toString();
            final String iden = node.getName().getIdentifier();
            final String desc = convertType(this.typeMap.get(node));
            this.mv.visitFieldInsn(Opcodes.GETFIELD, name, iden, desc);
            return false;
        }
    }
}
