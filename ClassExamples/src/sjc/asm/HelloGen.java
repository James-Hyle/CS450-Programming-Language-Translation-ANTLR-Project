package sjc.asm;

import org.objectweb.asm.*;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class HelloGen implements Opcodes {
    public static void main(String [] args) throws Exception {
        final byte[] helloClass = HelloGen.dump();
        //write to a binary file for execution
        FileOutputStream stream = new FileOutputStream("./out/Hello.class");
        stream.write(helloClass);
        //write to a text file for debugging
        final ClassReader cr = new ClassReader(helloClass);
        PrintWriter pw = new PrintWriter(new File("./out/Hello.txt"));
        final TraceClassVisitor tcv = new TraceClassVisitor(pw);
        cr.accept(tcv, 0);
    }

    public static byte[] dump() throws Exception {
        final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        MethodVisitor mv;

        cw.visit(Opcodes.V12, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, "Hello",
                null, "java/lang/Object", null);

        cw.visitSource("Hello.java", null);

        {
            mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitCode();
            final Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(1, l0);
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitMethodInsn(Opcodes.INVOKESPECIAL,"java/lang/Object", "<init>", "()V", false);
            mv.visitInsn(Opcodes.RETURN);
            final Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("this", "LHello;", null, l0, l1, 0);
            mv.visitMaxs(1,1);
            mv.visitEnd();
        }

        {
            mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                    "main", "([Ljava/lang/String;)V", null, null);
            mv.visitCode();
            final Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(3, l0);
            mv.visitLdcInsn("Hello");
            mv.visitVarInsn(Opcodes.ASTORE, 1);
            final Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(4, l1);
            mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System",  "out", "Ljava/io/PrintStream;");
            mv.visitVarInsn(Opcodes.ALOAD, 1);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
            final Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLineNumber(5,l2);
            mv.visitInsn(Opcodes.RETURN);
            final Label l3 = new Label();
            mv.visitLabel(l3);
            mv.visitLocalVariable("args", "[Ljava/lang/String;", null, l0, l3, 0);
            mv.visitLocalVariable("s", "Ljava/lang/String;", null, l1, l3, 1);
            mv.visitMaxs(2,2);
            mv.visitEnd();
        }

    cw.visitEnd();
    return cw.toByteArray();
    }
    
    public void method() {
    	int x, y;
    	x = 12;
    	y = 87;
    	x = 2*(x+y*(x-y));
    }
}
