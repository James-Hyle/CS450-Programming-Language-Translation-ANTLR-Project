package sjc.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import static org.objectweb.asm.Opcodes.ASM9;

public class MethodTransform extends ClassVisitor {
    public MethodTransform(ClassVisitor cv){
        super(ASM9, cv);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
                                     String signature, String[] exceptions) {
        MethodVisitor mv;
        mv = cv.visitMethod(access, name, desc, signature, exceptions);
        if(mv != null){
            mv = new UpdateInstr(mv);
        }
        return mv;
    }

    private class UpdateInstr extends MethodVisitor {
        public UpdateInstr(MethodVisitor mv) {
            super(ASM9, mv);
        }
        @Override
        public void visitInsn(int opcode){
            if(opcode != Opcodes.ISUB){
                mv.visitInsn(opcode);
            } else {
                mv.visitInsn(Opcodes.IADD);
            }
        }
    }
}
