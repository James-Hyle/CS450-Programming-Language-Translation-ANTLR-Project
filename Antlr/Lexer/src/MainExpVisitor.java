public class MainExpVisitor
{
    public static void main(String[] args) throws Exception {
        System.out.println("1 + 5 is " + ExpEvaluator.eval("1+5"));
        System.out.println("5 * 5 is " + ExpEvaluator.eval("5*5"));
        System.out.println("(5 % 4) is " + ExpEvaluator.eval("5 % 4"));
        System.out.println("10 / 2 is " + ExpEvaluator.eval("10 / 2"));

        System.out.println("\n1+(5) is " + ExpPrettyPrinter.print("1+(5)"));

        System.out.println("\n(1 + 5) * 5 is " + ExpEvaluator.eval("(1+5) * 5"));
        System.out.println("(1 + 5) * 5 is " + ExpPrettyPrinter.print("1 + 5 * 5"));

        System.out.println("\n(1) is " + ExpPrettyPrinter.print("(1)"));
    }
}
