import java.util.Stack;
import java.util.ArrayList;

public class InfixParser {
    

    public InfixParser() {}

    // This method returns the precedence (computational value by the order of operations) for each operator.
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

    // This method uses the shunting yard algorithm to parse infix expressions to rpn, which can more easily be 
    // parsed into Function objects. The alrogithm works by grouping operational values / numbers together through 
    // the use of a stack.
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

    // Returns an ArrayList of all the operators that can be used in the algorithm for cleaner code
    public static ArrayList<String> generateOperators() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<Function.dualOperators.length; i++) {
            list.add(Function.dualOperators[i]);
        }
        return list;
    }

    // Returns whether an operator is associated to the mathematical character to the left of it.
    public static boolean hasLeftAssociativity(String ch) {
        if (ch.equals("+") || ch.equals("-") || ch.equals("/") || ch.equals("*") || ch.equals("^")) {
            return true;
        } else {
            return false;
        }
    }

    // This converts a string rpn input into a stack of variables, numbers, or operators for easier simplification to
    // a Function object. It works by parsing around spaces, which sepearate the rpn input string, and determining
    // what type of mathematical expression they are in order to convert them to Function objects individually (see
    // the Function class for more detail on this).
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

    // This method simplifies everything on the rpn stack (as parsed by stringRPNToStack) into a single Function object 
    // for simple computation.
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

}

