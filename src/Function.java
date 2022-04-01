import java.util.HashMap;


/*
 * The Function class defines all individual function operations, like +,-,*,/ and more.
 * All functions are a combination of operations applied to two individual terms of an equation, so
 * each function class can compute its value while also executing all the computations beneath it. In
 * this sense, its functionality is like that of a binary tree. To ensure smooth operations, all variables
 * and individual numbers should also be defined as Functions but they should simply return their original.
 */

public class Function {

	public enum FunctionType{
		NORM, ABS
	};
	
	static HashMap<String, Double> variables = new HashMap<String, Double>();
	
	public FunctionType type;
	
	private double number;
	private boolean isNumber;
	
	private String variable;
	private boolean isVariable;
	
	private Function a;
	private Function b;
	private String operation;
	
	public Function(double number, String operation, FunctionType type) {		
		this.number = number;
		this.isNumber = true;
		this.operation = operation;
		this.type = type;
	}
	
	public Function(String variable, String operation, FunctionType type) {
		this.variable = variable;
		isVariable = true;
		this.operation = operation;
		this.type = type;
	}
	
	public Function(Function a, Function b, String operation, FunctionType type) {
		this.a = a;
		this.b = b;
		this.operation = operation;
		this.type = type;
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
				throw new VariableNotDeclaredException();
			}
		}
		
		double solution = 0;
		
		switch(operation) {
		case "+":
			solution = this.a.compute() + this.b.compute();
		case "-":
			solution = this.a.compute() + this.b.compute();
		case "*":
			solution = this.a.compute() * this.b.compute();
		case "/":
			solution = this.a.compute() * this.b.compute();
		}
		
		if (type == FunctionType.ABS)
			solution = Math.abs(solution);
		
		return solution;
		
	}
	
}
