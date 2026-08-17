import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;

public class ExpLiteralCollector extends ExpBaseVisitor<Void>{
    public static List<BigInteger> collect(final String exp) throws Exception {
        final ExpLiteralCollector elc = new ExpLiteralCollector();
        elc.visit(ExpParseUtil.parse(exp));
        return elc.literals;
    }

    private final List<BigInteger> literals = new ArrayList<BigInteger>();
    private ExpLiteralCollector() {}

    @Override
    public Void visitIntLiteral(ExpParser.IntLiteralContext ctx){
        literals.add(new BigInteger(ctx.INT().getText()));
        return null;
    }

}
