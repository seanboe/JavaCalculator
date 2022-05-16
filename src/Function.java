import java.util.HashMap;

/*
 * The Function class defines all individual function operations, like +,-,*,/ and more.
 * All functions are a combination of operations applied to two individual terms of an equation, so
 * each function class can compute its value while also executing all the computations beneath it. In
 * this sense, its functionality is like that of a binary tree. To ensure smooth operations, all variables
 * and individual numbers should also be defined as Functions but they should simply return their original.
 */

public class Function {
	
  // Static stuff (global)
	static HashMap<String, Double> variables = new HashMap<String, Double>();
	final static String[] singleOperators = {"sin", "cos", "tan", "arcsin", "arccos", "arctan", "abs"};
	final static String[] dualOperators = {"+", "-", "*", "/", "^", "log"};
	
	
  // This hashmap stores previous x values and their respective y values
  HashMap<String, HashMap<Double, Double>> varPastValues = new HashMap<String, HashMap<Double, Double>>();

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
	
  public static void setVariable(String var, double value) {
    variables.put(var, value);
  }

  @SafeVarargs
	public final static void setVariable(HashMap<String, Double>...vars) {
    for (int x = 0; x < vars.length; x++) {
      for (String var : vars[x].keySet()) {
        setVariable(var, vars[x].get(var));
      }
    }
	}
	
	public double compute() throws VariableDefinitionException {

		if (isNumber) {
			return number;
		}
		else if (isVariable) {
			if (variables.get(variable) != null) {
				return variables.get(variable);
			}
			else {
				throw new VariableDefinitionException();
			}
		}
		
		double solution = 0;
		
		switch(operation) {
		case "+":
			solution = this.a.compute() + this.b.compute();
      break;
		case "-":
			solution = this.a.compute() - this.b.compute();
      break;
		case "*":
			solution = this.a.compute() * this.b.compute();
      break;
		case "/":
			solution = this.a.compute() / this.b.compute();
      break;
		case "^":
			solution = Math.pow(a.compute(), b.compute());
      break;
		case "log":
			solution = Math.log(a.compute()) / Math.log(b.compute());
      break;
		case "sin":
			solution = Math.sin(a.compute());
      break;
		case "cos":
			solution = Math.cos(a.compute());
      break;
		case "tan":
			solution = Math.tan(a.compute());
      break;
		case "asin":
			solution = Math.asin(a.compute());
      break;
		case "acos":
			solution = Math.acos(a.compute());
      break;
		case "atan":
			solution = Math.atan(a.compute());
      break;
		case "abs":
			solution = Math.abs(a.compute());
      break;
		}
		
		return solution;
		
	}

  @SafeVarargs
	public final double compute(HashMap<String, Double>...functionVars) throws VariableDefinitionException {

    for (int x = 0; x < functionVars.length; x++) {

      // This loop only runs once since there is only one thing in the hashmap at
      // each index. This loop is only to derefence the first value.
      for (String givenVar : functionVars[x].keySet()) {
        double givenXPoint = functionVars[x].get(givenVar);

        for (String knownVar : varPastValues.keySet()) {
          if (!knownVar.equals(givenVar))
            continue;

          for (Double knownX : varPastValues.get(knownVar).keySet()) {
            if (knownX == givenXPoint) {
              // This number has been computed before!
              return varPastValues.get(knownVar).get(knownX);
            }
          }
        }

      }
    }

    // If we're here, then the point has never been computed before!

    setVariable(functionVars);
    double solution = compute();

    // Store the solutions in the past variable values hashMap
    for (int x = 0; x < functionVars.length; x++) {
      for (String givenVar : functionVars[x].keySet()) {

        HashMap<Double, Double> newPoint = new HashMap<Double, Double>();
        newPoint.put(functionVars[x].get(givenVar), solution);

        varPastValues.put(givenVar, newPoint);
      }
    }

    return solution;
  }
	
}