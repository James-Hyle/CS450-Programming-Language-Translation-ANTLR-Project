package sjc.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.io.FileOutputStream;
import java.io.IOException;

import static org.objectweb.asm.Opcodes.ASM9;

public class ReadTranform {
    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader("inputs.Power");
        ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_FRAMES);
        ClassTransform tr = new ClassTransform(cw);
        cr.accept(tr,0);
        FileOutputStream stream = new FileOutputStream("./out/inputs/Power.class");
        stream.write(cw.toByteArray());
    }
}
