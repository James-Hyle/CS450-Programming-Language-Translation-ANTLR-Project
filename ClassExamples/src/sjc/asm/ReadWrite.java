package sjc.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.ASM9;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader("inputs.Simple");
        ClassWriter cw = new ClassWriter(cr, 0);
        ClassVisitor cv = new ClassVisitor(ASM9, cw){};//use anonymous class that can access protected constructor
        cr.accept(cv,0);
        FileOutputStream stream = new FileOutputStream("./out/inputs/Simple.class");
        stream.write(cw.toByteArray());
    }
}
