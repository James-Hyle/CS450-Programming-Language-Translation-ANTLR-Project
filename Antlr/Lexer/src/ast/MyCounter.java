package ast;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class MyCounter<T> extends ExpBaseVisitor<T> {
    protected static int lit;
    protected static int nums;

    private static Set<T> counterSet = new HashSet<>();

    public static void collect(Exp exp) {
        if (visitIntLiteral(exp)) {
            counterSet.add(exp);
        }  else if (exp instanceof IntLiteral) {
            nums = nums + 1;
        }
    }
}
