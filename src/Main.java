import java.util.HashMap;
import java.util.Scanner;

import javax.crypto.spec.GCMParameterSpec;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function f1 = new Function("x");
		Function f2 = new Function(2);
		Function f = new Function(f1, f2, "+");

		System.out.println(f.compute(5));


		
		
		// HashMap<String, Function> functions = new HashMap<String, Function>();
		
		
		// Function num1 = new Function(5);
    // try{System.out.println(num1.compute());}catch(VariableDefinitionException e){};
    // // System.exit(1);


		// Function num2 = new Function("x");
    // try{System.out.println(num2.compute());}catch(VariableDefinitionException e){System.out.println(e);};
    // // System.exit(-1);

		// Function.setVariable("x", 7);

		// Function actual = new Function(num1, num2, "*");

    // try {
    //   System.out.println(actual.compute());
    // } catch(VariableDefinitionException e) {
    //   System.out.println(e);
    // }
		
    // System.out.println(Calculus.computeDefiniteIntegral(actual, 0, 10));

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


    // try {
    //   System.out.println(Algebra.bisectionZeros(g, -10, 10));
    // } catch (InvalidInputsException h) {
    //   // TODO Auto-generated catch block
    //   h.printStackTrace();
    // }

    // Function q = new Function("x");
    // Function w = new Function(2);
    // Function func = new Function(q, w, "^");

    // try {
    //   System.out.println(Algebra.computeZeros(func, 2));
    // } catch (Exception asdf) {
    //   asdf.printStackTrace();
    // }
		
	// }
	
	
	
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
}
