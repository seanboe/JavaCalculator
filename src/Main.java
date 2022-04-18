import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Function x = new Function("x"); 
    Function numerator = new Function(1); 
    Function function = new Function(numerator, x, "/"); 

    HashMap<String, Double> thePoint = new HashMap<String, Double>(); 
    thePoint.put("x", 10.0); 

    try {
	  Calculus calcObj = new Calculus(); 
		System.out.println(calcObj.computeLeftSideLimit(function, 0.0)); 
    	System.out.println(function.compute(thePoint));
    } catch (VariableDefinitionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
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
