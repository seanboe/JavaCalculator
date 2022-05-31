import java.util.Stack;
import java.util.ArrayList;

public class InfixParser {
    

    public InfixParser() {}

    //Parse method with support for functions
    public static String parsev2(String infix) {


      Stack<Character> stack = new Stack<Character>();
      ArrayList<Character> result = new ArrayList<Character>();

      ArrayList<Character> tokens = arraytolist(infix.toCharArray());

      //Main algorithm
      for (char token : tokens) {

        if (isNumber(token)) {
          result.add(token);
          continue;
        }
        if (isFunction(token)) {
          stack.push(token);
          continue;
        }

        if (token=='(') {
          stack.push(token);
          continue;
        }

        if (token==')') {
          char current = stack.pop();
          while (!(token==')')) {
            if (!(token==',')) {
              result.add(token);
            }
            current = stack.pop();
          }
          continue;
        }

        


      }



      

      return "";
    }

    public static boolean isNumber(char token) {
      return Character.isDigit(token);
    }

    public static boolean isFunction(char token) {
      if (token=='s' || token=='c' || token=='t') {
        return true;
      }
      return false;
    }

    public static ArrayList<Character> arraytolist(char[] array) {
      ArrayList<Character> list = new ArrayList<Character>();

      for (char c : array) {
        list.add(c);
      }

      return list;
    }




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

        infix = infix + ")";

        for (int i = 0; i<infix.length(); i++) {
          try {
            if (Character.isDigit(infix.substring(i, i+1).charAt(0)) && infix.substring(i+1, i+2).charAt(0)=='x') {
              infix = infix.substring(0, i+1) + "*" + infix.substring(i+1);
              continue;
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
        }

        for (int i = 0; i<infix.length(); i++) {
            String token = infix.substring(i, i+1);
            if (Character.isDigit(token.charAt(0)) || token.equals("x")) {
                
                try {
                  if (Character.isDigit(infix.substring(i+1, i+2).charAt(0))) {
                    rpn += token;
                  } else {
                    rpn += (token + " ");
                  }
                } catch (Exception e) {
                  rpn += (token + " ");
                }
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
   // Updated rpn parsing stuff - will update on tuesday in class
    public static ArrayList<Function> stringRPNtoList(String rpnInput) {

      ArrayList<Function> output = new ArrayList<Function>();
    
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

    public static Function RPNCruncher(ArrayList<Function> rpnList) {
      Stack<Function> evalStack = new Stack<Function>();
  
      int startSize = rpnList.size();
  
      for (int x = 0; x < startSize; x++) {
  
        evalStack.push(rpnList.remove(0));
  
        int stackSize = evalStack.size();
        if (stackSize >= 2) {
  
          Function last = evalStack.pop();
  
          if (!last.isOperator()) {
            evalStack.push(last);
            continue;
          }
  
          Function secondLast = evalStack.pop();
  
          try {
            if (Function.validSingleComputeOperation(last.getOperator())) {
              evalStack.push(new Function(secondLast, last));
            }
            else if (Function.validMultiComputeOperation(last.getOperator()) && stackSize >= 3) {
              Function thirdLast = evalStack.pop();
              evalStack.push(new Function(thirdLast, secondLast, last));
            }
          } catch (OperatorOnlyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }
  
      return evalStack.pop();
  
    }

}

