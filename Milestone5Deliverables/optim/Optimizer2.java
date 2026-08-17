package optim;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.*;

public class Optimizer2 extends ClassVisitor {
    public Optimizer2(ClassVisitor cv) {
        super(ASM9, cv);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
                                     String signature, String[] exceptions) {
        MethodVisitor mv;
        mv = cv.visitMethod(access, name, desc, signature, exceptions);
        if (mv != null) {
            mv = new RemoveAddZero(mv);
        }
        return mv;
    }

    private class RemoveAddZero extends MethodVisitor {
        protected boolean SEEN_ZERO = false;
        protected boolean SEEN_LOAD = false;
        protected int index = -1;

        public RemoveAddZero(MethodVisitor mv) {
            super(ASM9, mv);
        }

        public void visitFrame(int type, int numLocal, Object[] local, int numStack, Object[] stack) {
            visitInsn();
            mv.visitFrame(type, numLocal, local, numStack, stack);
        }

        @Override
        public void visitInsn(int opcode) {
            if (opcode == IADD && SEEN_LOAD) {
                super.visitVarInsn(ILOAD, index);
                SEEN_ZERO = false;
                SEEN_LOAD = false;
                index = -1;
                return;
            }
            visitInsn();

            if (opcode == ICONST_0) {
                SEEN_ZERO = true;
                return;
            }
            super.visitInsn(opcode);
        }

        protected void visitInsn() {
            if (SEEN_ZERO && !SEEN_LOAD) {
                super.visitInsn(ICONST_0);
            }
            else if (SEEN_ZERO) {
                super.visitInsn(ICONST_0);
                super.visitVarInsn(ILOAD, index);
            }

            SEEN_ZERO = false;
            SEEN_LOAD = false;
            index = -1;
        }

        @Override
        public void visitIntInsn(int opcode, int operand) {
            visitInsn();
            mv.visitIntInsn(opcode, operand);
        }

        @Override
        public void visitVarInsn(int opcode, int varIndex) {
            if (SEEN_ZERO && opcode == ILOAD) {
                SEEN_LOAD = true;
                index = varIndex;
                return;
            }
            visitInsn();
            mv.visitVarInsn(opcode, varIndex);
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
            visitInsn();
            mv.visitJumpInsn(opcode, label);
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
            visitInsn();
            mv.visitIincInsn(var, increment);
        }
    }
}
