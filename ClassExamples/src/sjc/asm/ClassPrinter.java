package sjc.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM9;

public class ClassPrinter extends ClassVisitor{
    public ClassPrinter(){
        super(ASM9);
    }

    public void visit (int version, int access, String name,
                       String signature, String superName,
                       String[] interfaces){
        System.out.println(name + " extends " + superName + "{");
    }
    public void visitSource(String source, String debug){}

    public MethodVisitor visitMethod(int access, String name,
                                     String desc, String signature,
                                     String[] exceptions){
        System.out.println("   " + name + desc + " cv " + this);
        return null;
    }

    public void visitEnd(){
        System.out.println("}");
    }
}
