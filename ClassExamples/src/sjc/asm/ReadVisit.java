package sjc.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.ASM9;

public class ReadVisit {
    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader("inputs.Simple");
        ClassPrinter cp = new ClassPrinter();
        cr.accept(cp,0);
    }
}
