import java.util.Stack;
import java.util.ArrayList;

public class Parserx {
    

    public Parserx() {
        
    }

    public int getPrecedence(String s) {
        char ch = s.charAt(0);
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '^')
            return 3;
        else
            return -1;
    }

    public void parse(String infix) {
        Stack<String> stack = new Stack<String>();
        ArrayList<String> operators = generateOperators();

        String rpn = "";

        //stack.push(")");
        infix = infix + ")";

        for (int i = 0; i<infix.length(); i++) {
            String token = infix.substring(i, i+1);
            if (Character.isDigit(token.charAt(0)) || token.equals("x")) {
                rpn = rpn + token;
            } else if (token.equals("(")) {
                stack.push("(");
            } else if (operators.contains(token)) {
                while (!stack.isEmpty() && getPrecedence(token)<=getPrecedence(stack.peek()) && hasLeftAssociativity(token)) {
                    rpn+=stack.pop();
                }
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    rpn+=stack.pop();
                }
            } 

        }
        while(!stack.isEmpty()) {
            if (stack.peek().equals("(") || stack.peek().equals(")")) {
                System.out.println("bracket");
                stack.pop();
                continue;
            }
            rpn+=stack.pop();
        }
        System.out.println(rpn);
    }

    public ArrayList<String> generateOperators() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<Function.dualOperators.length; i++) {
            list.add(Function.dualOperators[i]);
        }
        return list;
    }

    public boolean hasLeftAssociativity(String ch) {
        if (ch.equals("+") || ch.equals("-") || ch.equals("/") || ch.equals("*") || ch.equals("^")) {
            return true;
        } else {
            return false;
        }
    }

}
