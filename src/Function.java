import java.util.HashMap;


/*
 * The Function class defines all individual function operations, like +,-,*,/ and more.
 * All functions are a combination of operations applied to two individual terms of an equation, so
 * each function class can compute its value while also executing all the computations beneath it. In
 * this sense, its functionality is like that of a binary tree. To ensure smooth operations, all variables
 * and individual numbers should also be defined as Functions but they should simply return their original.
 */

public class Function {
	
	static HashMap<String, Double> variables = new HashMap<String, Double>();
	
	private double number;
	private boolean isNumber;
	
	private String variable;
	private boolean isVariable;
	
	private Function a;
	private Function b;
	private String operation;
	
	public Function(double number) {
		this.number = number;
		this.isNumber = true;
	}
	
	public Function(String variable) {
		this.variable = variable;
		isVariable = true;
	}
	
	public Function(Function a, String operation) {
		this.a = a;
		this.operation = operation;
	}
	
	public Function(Function a, Function b, String operation) {
		this.a = a;
		this.b = b;
		this.operation = operation;
	}
	
	public static void setVariable(String name, double value) {
		variables.put(name, value);
	}
	
	public double compute() throws VariableNotDeclaredException {
		
		if (isNumber) {
			return number;
		}		
		else if (isVariable) {
			if (variables.get(variable) != null) {
				return variables.get(variable);
			}
			else {
				throw new VariableNotDeclaredException(variable);
			}
		}
		
		double solution = 0;
		
		switch(operation) {
		case "+":
			solution = this.a.compute() + this.b.compute();
		case "-":
			solution = this.a.compute() - this.b.compute();
		case "*":
			solution = this.a.compute() * this.b.compute();
		case "/":
			solution = this.a.compute() / this.b.compute();
		case "sin":
			solution = Math.sin(a.compute());
		case "cos":
			solution = Math.cos(a.compute());
		case "tan":
			solution = Math.tan(a.compute());
		case "asin":
			solution = Math.asin(a.compute());
		case "acos":
			solution = Math.acos(a.compute());
		case "atan":
			solution = Math.atan(a.compute());
		case "abs":
			solution = Math.abs(a.compute());
		}
		
		return solution;
		
	}
	
}
