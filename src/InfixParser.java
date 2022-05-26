import java.util.Stack;
import java.util.ArrayList;

public class InfixParser {
    

    public InfixParser() {}

    public static int getPrecedence(String s) {
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

    public static String parse(String infix) {
        Stack<String> stack = new Stack<String>();
        ArrayList<String> operators = generateOperators();

        String rpn = "";

        //stack.push(")");
        infix = infix + ")";

        for (int i = 0; i<infix.length(); i++) {
            String token = infix.substring(i, i+1);
            if (Character.isDigit(token.charAt(0)) || token.equals("x")) {
                rpn += (token + " ");
            } else if (token.equals("(")) {
                stack.push("(");
            } else if (operators.contains(token)) {
                while (!stack.isEmpty() && getPrecedence(token)<=getPrecedence(stack.peek()) && hasLeftAssociativity(token)) {
                    rpn += (stack.pop() + " ");
                }
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    rpn += (stack.pop() + " ");
                }
            } 

        }
        while(!stack.isEmpty()) {
            if (stack.peek().equals("(") || stack.peek().equals(")")) {
                stack.pop();
                continue;
            }
            rpn += (stack.pop() + " ");
        }
        return rpn;
      }

    public static ArrayList<String> generateOperators() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<Function.dualOperators.length; i++) {
            list.add(Function.dualOperators[i]);
        }
        return list;
    }

    public static boolean hasLeftAssociativity(String ch) {
        if (ch.equals("+") || ch.equals("-") || ch.equals("/") || ch.equals("*") || ch.equals("^")) {
            return true;
        } else {
            return false;
        }
    }

    public static Stack<Function> stringRPNToStack(String rpnInput) {
      Stack<Function> output = new Stack<Function>();
  
      if (!rpnInput.substring(rpnInput.length() - 1, rpnInput.length()).equals(" ")) {
        rpnInput += " ";
      }
  
      while (rpnInput.indexOf(" ") >= 0) {
        String section = rpnInput.substring(0, rpnInput.indexOf(" "));
  
        if (Character.isDigit(section.charAt(0))) {
          output.add(new Function(Double.parseDouble(section)));
        }
        else if (Character.isAlphabetic(section.charAt(0))) {
          output.add(new Function(section.charAt(0) + ""));
        }
        else if (Function.validMultiComputeOperation(section) || Function.validSingleComputeOperation(section)) {
          output.add(new Function(section, true));
        }
        rpnInput = rpnInput.substring(rpnInput.indexOf(" ") + 1);
      }
  
      return output;
    }

    public static int crunchRPNStack(Stack<Function> stack) throws OperatorOnlyException {

      int counter = 0;

      while (stack.size() > 1) {          

        int originalSize = stack.size();

        Function last = stack.pop();
        Function secondLast = stack.pop();

        if (secondLast.isOperator()) {
          stack.push(new Function(last, secondLast));
        }
        else if (originalSize >= 3) {
          Function thirdLast = stack.pop();
          if (thirdLast.isOperator()) {
            stack.push(new Function(last, secondLast, thirdLast));
          }
        }

        counter++;
      }

      return counter;

    }

    // private static String infixCleaner(String input) {

    // }
    



}

