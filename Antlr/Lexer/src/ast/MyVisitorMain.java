package ast;

public class MyVisitorMain {
    public static void main(String[] args) throws Exception {
        String exp = "2+2+(x * y)";
        Exp astExp = AstBuilder.ast(exp);
        MyCounter.collect(astExp);
        System.out.println(MyCounter.lit);
        System.out.println(MyCounter.nums);
    }
}
