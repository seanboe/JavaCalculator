import java.util.ArrayList;

public class Main {

  public static Stack<Function> RPNQueue = new Stack<Function>();
  public static ArrayList<Function> funcs = new ArrayList<Function>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//////////

    // Function num1 = new Function("x");
    // Function num2 = new Function(2);
    // Function func = new Function(num1, num2, "^");

    // Function a = new Function("x");
    // Function b = new Function(3);
    // Function c = new Function(a, b, "^");
    // Function d = new Function(10);
    // Function e = new Function(c, d, "-");
    // Function f = new Function(3);
    // Function g = new Function(e, f, "^");


    Function q = new Function("x");
    Function w = new Function(2);
    Function k = new Function("-", true);
    Function func = new Function(q, w, k);

    try {
      System.out.println(func.compute(10));
    } catch (ArithmeticException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (OperatorOnlyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    Stack<Function> blaze = stringRPNToStack("x 2 ^ ");
    System.out.println(blaze.size());

    try {
      crunchRPNStack(blaze);
    } catch (OperatorOnlyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    try {
      System.out.println(blaze.pop().compute(5));
    } catch (ArithmeticException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (OperatorOnlyException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }


	}

  public static Stack<Function> stringRPNToStack(String rpnInput) {
    Stack<Function> output = new Stack<Function>();

    if (!rpnInput.substring(rpnInput.length() - 1, rpnInput.length()).equals(" ")) {
      rpnInput += " ";
    }

    System.out.println(rpnInput + ";");

    while (rpnInput.indexOf(" ") >= 0) {
      String section = rpnInput.substring(0, rpnInput.indexOf(" "));

      System.out.println(section);

      if (Character.isDigit(section.charAt(0))) {
        System.out.println("number");
        output.push(new Function(Double.parseDouble(section)));
      }
      else if (Character.isAlphabetic(section.charAt(0))) {
        System.out.println("letter");
        output.push(new Function(section.charAt(0) + ""));
      }
      else if (Function.validMultiComputeOperation(section) || Function.validSingleComputeOperation(section)) {
        System.out.println("operation");
        output.push(new Function(section, true));
      }
      rpnInput = rpnInput.substring(rpnInput.indexOf(" ") + 1);
      System.out.println("New input: " + rpnInput);
    }

    return output;
  }


  // public static void stackCrunchTester() {
  //   Stack<Function> ghast = new Stack<Function>();

  //   ghast.push(new Function("x"));
  //   ghast.push(new Function(2));
  //   ghast.push(new Function("-", true));

  //   System.out.println(ghast.size());

  //   try {
  //     crunchRPNStack(ghast);
  //   } catch (OperatorOnlyException e) {
  //     // TODO Auto-generated catch block
  //     e.printStackTrace();
  //   }

  //   System.out.println(ghast.size());

  // }

  public static void crunchRPNStack(Stack<Function> stack) throws OperatorOnlyException {
    Function last = stack.pop();
    
    if (!last.isOperator())
      return;

    if (Function.validMultiComputeOperation(last.getOperator()) && (stack.size() >= 2)) {
      System.out.println("adjflksjf");


      Function secondLast = stack.pop();
      Function thirdLast = stack.pop();

      stack.push(new Function(thirdLast, secondLast, last));
    }
    else if (Function.validSingleComputeOperation(last.getOperator()) && (stack.size() >= 1)) {
      System.out.println("lsdkfsdkjf");

      Function secondLast = stack.pop();

      stack.push(new Function(secondLast, last));
    }

  }






	
	
	
	// // Just for temporary 
	// public static void cliRunnerDemo() {
		
	// 	// Stack that the RPN input is based on
	// 	Stack<String> RPNStack = new Stack<String>();
		
	// 	HashMap<String, Function> functions = new HashMap<String, Function>();
		
	// 	String message = "";
	// 	while (!message.equals("quit")) {
	// 		try {
	// 			Scanner scanner = new Scanner(System.in);
				
	// 			message = scanner.nextLine();				
	// 			if (message.equals("quit"))
	// 				continue;
				
	// 			RPNStack.push(message);			
				
				
	// 		} catch (Exception e) {
	// 			System.out.println(e);
	// 		}	
	// 	}		
		
	// }
	
	// // This function looks at the last couple things on the stack and evaluates them 
	// // According to reverse polish notation
	// public static void crunchStack(Stack<String> stack) {
		
	// 	Stack<String> temp = stack;
		
	// 	String first = temp.pop();
	// 	String second = temp.pop();
	// 	String third = temp.pop();
		
	// 	// check if the last item on the stack is an operator
	// 	if (isOperator(first)) {
	// 		// this means that it is an operator
			
	// 		// check if it is a single variable operator
	// 		if (isSingleVarOperator(first)) {
	// 			Function output = new Function(new Function(Double.parseDouble(second)), first);
	// 			stack.push(third);
	// 		}
	// 		else {
	// 			Function output = new Function(new Function(Double.parseDouble(second)), new Function(Double.parseDouble(third)), first);
	// 		}
	// 	}
		
	// }
	
	// public static boolean isOperator(String a) {
	// 	return true;
	// }
}
