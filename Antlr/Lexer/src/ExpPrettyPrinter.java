public class ExpPrettyPrinter extends ExpBaseVisitor<String>{
    public static String print(final String exp) throws Exception {
        return new ExpPrettyPrinter().visit(ExpParseUtil.parse(exp));
    }
    private ExpPrettyPrinter() {}
    @Override
    public String visitBinaryExp(final ExpParser.BinaryExpContext ctx){
        final String lhs = visit(ctx.lhs);
        final String rhs = visit(ctx.rhs);
        final String op = ctx.op.getText();
        return lhs + " " + op + " " + rhs;
    }

    @Override
    public String visitIntLiteral(final ExpParser.IntLiteralContext ctx){
        return ctx.INT().getText();
    }

    @Override
    public String visitParentExp(final ExpParser.ParentExpContext ctx){
        return visit(ctx.exp());
    }
}
