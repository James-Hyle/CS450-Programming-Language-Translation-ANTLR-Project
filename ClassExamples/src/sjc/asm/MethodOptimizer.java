package sjc.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import static org.objectweb.asm.Opcodes.IADD;
import static org.objectweb.asm.Opcodes.ICONST_0;
import static org.objectweb.asm.Opcodes.ASM9;

public class MethodOptimizer extends ClassVisitor {
    public MethodOptimizer(ClassVisitor cv){
        super(ASM9, cv);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
                                     String signature, String[] exceptions) {
        MethodVisitor mv;
        mv = cv.visitMethod(access, name, desc, signature, exceptions);
        if(mv != null){
           mv = new RemoveAddZero(mv);
        }
        return mv;
    }

    private class RemoveAddZero extends MethodVisitor {
        protected final static int SEEN_NOTHING = 0;
        protected final static int SEEN_ICONST_0 = 1;
        protected int state;

        public RemoveAddZero(MethodVisitor mv){
            super(ASM9, mv);
        }

        @Override
        public void visitInsn(int opcode){
            if(state == SEEN_ICONST_0){
                if(opcode == IADD){
                    state = SEEN_NOTHING;
                    return;
                }
            }
            visitInsn();

            if(opcode == ICONST_0){
                state = SEEN_ICONST_0;
                return;
            }
            mv.visitInsn(opcode);
        }

        protected void visitInsn(){
            if(state == SEEN_ICONST_0){
                mv.visitInsn(ICONST_0);
            }
            state = SEEN_NOTHING;
        }

        @Override
        public void visitIntInsn(int opcode, int operand){
            visitInsn();
            mv.visitIntInsn(opcode,operand);
        }

        @Override
        public void visitVarInsn(int opcode, int varIndex) {
            visitInsn();
            mv.visitVarInsn(opcode, varIndex);
        }
        @Override
        public void visitTypeInsn(int opcode, String desc){
            visitInsn();
            mv.visitTypeInsn(opcode, desc);
        }

        @Override
        public void visitFieldInsn(int opc, String owner, String name, String desc){
            visitInsn();
            mv.visitFieldInsn(opc, owner, name, desc);
        }

        @Override
        public void visitMethodInsn(int opc, String owner, String name, String desc){
            visitInsn();
            mv.visitMethodInsn(opc,owner,name, desc);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label){
            visitInsn();
            visitJumpInsn(opcode, label);
        }

        public void visitLabel(Label label){
            visitInsn();
            visitLabel(label);
        }

        public void visitLdcInsn(Object cst){
            visitInsn();
            visitLdcInsn(cst);
        }
        public void visitIincInsn(int var, int increment){
            visitInsn();
            visitIincInsn(var, increment);
        }
    }
}
