import java.math.BigInteger;

public class ExpEvaluator extends ExpBaseVisitor<BigInteger>{
    public static BigInteger eval(final String exp) throws Exception {
        return new ExpEvaluator().visit(ExpParseUtil.parse(exp));
    }
    private ExpEvaluator() {}
    @Override
    public BigInteger visitBinaryExp(final ExpParser.BinaryExpContext ctx){
        final BigInteger v1 = visit(ctx.lhs);
        final BigInteger v2 = visit(ctx.rhs);
        final String op = ctx.op.getText();
        switch(op){
            case "+": return v1.add(v2);
            case "-": return v1.subtract(v2);
            case "*": return v1.multiply(v2);
            case "%": return v1.remainder(v2);
            case "/": return v1.divide(v2);
        }
        throw new RuntimeException("Unhandeled operator: " + op);
    }
    @Override
    public BigInteger visitIntLiteral(final ExpParser.IntLiteralContext ctx){
        return new BigInteger(ctx.INT().getText());
    }
    @Override
    public BigInteger visitParentExp(final ExpParser.ParentExpContext ctx){
        return visit(ctx.exp());
    }
}
