package behavioural.interpreter;

public class InterpreterClient {

    public String interpret(String str) {
        Expression exp;
        //create rules for expressions
        int c = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(c);
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(c);
        } else {
            return str;
        }
        return exp.interpret(new InterpreterContext());
    }

    public static void main(String[] args) {
        String str1 = "15 in Binary";
        String str2 = "15 in Hexadecimal";
        InterpreterClient ec = new InterpreterClient();
        System.out.println(str1 + "= " + ec.interpret(str1));
        System.out.println(str2 + "= " + ec.interpret(str2));
    }
}

