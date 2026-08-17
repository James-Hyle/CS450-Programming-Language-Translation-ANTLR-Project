package optim;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import java.util.HashSet;
import java.util.Set;

import static org.objectweb.asm.Opcodes.*;

public class Optimizer5 extends ClassVisitor {
    public Optimizer5(ClassVisitor cv) {
        super(ASM9, cv);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
                                     String signature, String[] exceptions) {
        MethodVisitor mv;
        mv = cv.visitMethod(access, name, desc, signature, exceptions);
        if (mv != null) {
            mv = new BooleanConvert(mv);
        }
        return mv;
    }

    private class BooleanConvert extends MethodVisitor {
        protected boolean seenLoad = false;
        protected boolean seenConst = false;
        protected int index = -1;
        protected final Set<Integer> intVars = new HashSet<>();

        public BooleanConvert(MethodVisitor mv) {
            super(ASM9, mv);
        }

        public void visitFrame(int type, int numLocal, Object[] local, int numStack, Object[] stack) {
            visitInsn();
            mv.visitFrame(type, numLocal, local, numStack, stack);
        }

        @Override
        public void visitInsn(int opcode) {
            if (opcode == ICONST_1 && seenLoad) {
                seenConst = true;
                return;
            }
            visitInsn();
            super.visitInsn(opcode);
        }

        protected void visitInsn() {
            if (seenLoad) {
                super.visitVarInsn(ILOAD, index);
            }
            if (seenConst) {
                super.visitInsn(ICONST_1);
            }
            seenLoad = false;
            seenConst = false;
            index = -1;
        }

        @Override
        public void visitIntInsn(int opcode, int operand) {
            visitInsn();
            mv.visitIntInsn(opcode, operand);
        }

        @Override
        public void visitVarInsn(int opcode, int varIndex) {
            if (opcode == ILOAD) {
                visitInsn();
                seenLoad = true;
                seenConst = false;
                index = varIndex;
                return;
            }
            visitInsn();
            super.visitVarInsn(opcode, varIndex);
        }

        @Override
        public void visitTypeInsn(int opcode, String desc) {
            visitInsn();
            mv.visitTypeInsn(opcode, desc);
        }

        @Override
        public void visitFieldInsn(int opc, String owner, String name, String desc) {
            visitInsn();
            mv.visitFieldInsn(opc, owner, name, desc);
        }

        @Override
        public void visitMethodInsn(int opc, String owner, String name, String desc) {
            visitInsn();
            mv.visitMethodInsn(opc, owner, name, desc);
        }

        @Override
        public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
            visitInsn();
            mv.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            if (seenLoad && seenConst && !intVars.contains(index) && (opcode == IF_ICMPEQ || opcode == IF_ICMPNE)) {
                super.visitVarInsn(ILOAD, index);

                if (opcode == IF_ICMPEQ) {
                    super.visitJumpInsn(IFNE, label);
                } else {
                    super.visitJumpInsn(IFEQ, label);
                }
                seenLoad = false;
                seenConst = false;
                index = -1;
                return;
            }
            visitInsn();
            super.visitJumpInsn(opcode, label);
        }

        public void visitLabel(Label label) {
            visitInsn();
            mv.visitLabel(label);
        }

        public void visitLdcInsn(Object cst) {
            visitInsn();
            mv.visitLdcInsn(cst);
        }

        public void visitIincInsn(int var, int increment) {
            intVars.add(var);
            visitInsn();
            mv.visitIincInsn(var, increment);
        }
    }
}
