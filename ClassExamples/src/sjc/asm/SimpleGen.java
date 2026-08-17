package sjc.asm;

import org.objectweb.asm.*;
import org.objectweb.asm.util.TraceClassVisitor;


import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleGen implements Opcodes {
    public static void main(String [] args) throws Exception {
        final byte[] simpleClass = SimpleGen.dump();
        //write to a binary file for execution
        FileOutputStream stream = new FileOutputStream("./out/Simple.class");
        stream.write(simpleClass);
        //write to a text file for debugging
        final ClassReader cr = new ClassReader(simpleClass);
        PrintWriter pw = new PrintWriter(new File("./out/Simple.txt"));
        final TraceClassVisitor tcv = new TraceClassVisitor(pw);
        cr.accept(tcv, 0);
    }


    public static byte[] dump() throws Exception {
        final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        MethodVisitor mv;

        cw.visit(Opcodes.V12, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, "Simple" , null , "java/lang/Object", null );

        cw.visitSource("Simple.java", null);
        {
            mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(3, l0);
            mv.visitVarInsn(Opcodes.ALOAD, 0);




        }

        cw.visitEnd();
        return cw.toByteArray();
    }
}
