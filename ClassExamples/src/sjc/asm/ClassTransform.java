package sjc.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM9;

public class ClassTransform extends ClassVisitor {
    public ClassTransform(ClassVisitor cv){
        super(ASM9, cv);
    }

    //removing field "count" by not traversing it
@Override
    public FieldVisitor visitField(int access, String name, String desc,
                                   String sign, Object value){
        if(!name.equals("count")){
            return cv.visitField(access,name,desc, sign, value);
        }
        return null;
}

    //After removing the static field only the code won't run
    //Exception in thread "main" java.lang.NoSuchFieldError: count
    //        at inputs.Power.<clinit>(Power.java:4)
    //Also need remove <clinit>, which is a static initalization method
    //remove method by not visiting it
    @Override
    public MethodVisitor visitMethod(int access, String name,
                                     String desc, String signature, String[] excp){
        MethodVisitor mv = null;
        System.out.println("name " + name);
        if(!name.equals("<clinit>")){
            mv = cv.visitMethod(access, name, desc, signature, excp);
        }
        return mv;
    }

    //creating a new field at the end of the class traversal
    @Override
    public void visitEnd(){
        FieldVisitor fv = cv.visitField(9, "id", "I", null, null);
        if(fv != null){
            fv.visitEnd();//done with the field creation
        }
        //end class visit performed by ClassWriter
        cv.visitEnd();
    }
}
