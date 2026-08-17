package sjc.asm;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class ReadTransformM {

    public static void main(String[] args) throws IOException {
        ClassPrinter cp = new ClassPrinter();
        ClassReader cr = new ClassReader("inputs.Simple");
        cr.accept(cp, 0);
        ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_FRAMES);
        MethodTransform ra = new MethodTransform(cw);
        cr.accept(ra, 0);
        FileOutputStream stream = new FileOutputStream("./out/inputs/Simple.class");
        stream.write(cw.toByteArray());
    }
}
