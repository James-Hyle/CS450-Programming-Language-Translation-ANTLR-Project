package optim;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.*;

public class Optimizer4 extends ClassVisitor {
    public Optimizer4(ClassVisitor cv) {
        super(ASM9, cv);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
                                     String signature, String[] exceptions) {
        MethodVisitor mv;
        mv = cv.visitMethod(access, name, desc, signature, exceptions);
        if (mv != null) {
            mv = new LoadDup(mv);
        }
        return mv;
    }

    private class LoadDup extends MethodVisitor {
        protected boolean seenIload;
        protected boolean seenAload = false;
        protected boolean seenField = false;
        protected boolean seenSecondAload = false;
        protected int iloadIndex = -1;
        protected int aloadIndex = -1;
        protected String fOwner, fName, fDesc;

        public LoadDup(MethodVisitor mv) {
            super(ASM9, mv);
        }

        public void visitFrame(int type, int numLocal, Object[] local, int numStack, Object[] stack) {
            visitInsn();
            mv.visitFrame(type, numLocal, local, numStack, stack);
        }

        @Override
        public void visitInsn(int opcode) {
            visitInsn();
            super.visitInsn(opcode);
        }

        protected void visitInsn() {
            if (seenIload) {
                super.visitVarInsn(ILOAD, iloadIndex);
            }
            if (seenAload) {
                super.visitVarInsn(ALOAD, aloadIndex);
            }
            if (seenField) {
                super.visitFieldInsn(GETFIELD, fOwner, fName, fDesc);
            }
            if (seenSecondAload) {
                super.visitVarInsn(ALOAD, aloadIndex);
            }

            seenIload = false;
            iloadIndex = -1;
            aloadIndex = -1;
            seenAload = seenField = seenSecondAload = false;
            fOwner = fName = fDesc = null;
        }

        @Override
        public void visitIntInsn(int opcode, int operand) {
            visitInsn();
            mv.visitIntInsn(opcode, operand);
        }

        @Override
        public void visitVarInsn(int opcode, int varIndex) {
            if (opcode == ILOAD) {
                if (seenIload && varIndex == iloadIndex) {
                    super.visitVarInsn(ILOAD, iloadIndex);
                    super.visitInsn(DUP);
                    seenIload = false;
                    iloadIndex = -1;
                    return;
                }
                visitInsn();
                seenIload = true;
                iloadIndex = varIndex;
                return;
            }
            if (opcode == ALOAD) {
                if (seenField && !seenSecondAload && varIndex == aloadIndex) {
                    seenSecondAload = true;
                    return;
                }
                visitInsn();
                seenAload = true;
                aloadIndex = varIndex;
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
            if (opc == GETFIELD) {
                if (seenAload && !seenField) {
                    seenField = true;
                    fOwner = owner; fName = name; fDesc = desc;
                    return;
                }
                if (seenSecondAload && owner.equals(fOwner) && name.equals(fName) && desc.equals(fDesc)) {
                    super.visitVarInsn(ALOAD, aloadIndex);
                    super.visitFieldInsn(GETFIELD, fOwner, fName, fDesc);
                    super.visitInsn(DUP);
                    seenAload = seenField = seenSecondAload = false;
                    aloadIndex = -1;
                    fOwner = fName = fDesc = null;
                    return;
                }
            }
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
