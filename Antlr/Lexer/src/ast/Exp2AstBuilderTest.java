package ast;

import org.junit.Assert;
import org.junit.Test;

import static ast.BinaryOp.ADD;
import static ast.BinaryOp.MUL;
import static ast.ExpFactory.*;

public class Exp2AstBuilderTest {
    @Test
    public void test1(){
        testPass(bin(lit(3), MUL, bin(lit(6), ADD, id("x"))), "3*(6+x)");
    }
    @Test
    public void test2() {
        testPass(bin(bin(id("a"), ADD, id("b")), ADD, id("c")), "a+b+c");
    }

//    @Test
//    public void test3() {
//        testPass(bin(lit(4), MIN, id("a")));
//    }

    @Test
    public void test4() {

    }
    public void testPass(final Exp expected, final String exp){
        try{
            final Exp result = AstBuilder.ast(exp);
            Assert.assertEquals(expected.toString(), result.toString());
        } catch (final Exception e){
            Assert.assertTrue(false);
        }
    }
}
