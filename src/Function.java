import java.util.HashMap;

/*
 * The Function class defines all individual function operations, like +,-,*,/ and more.
 * All functions are a combination of operations applied to two individual terms of an equation, so
 * each function class can compute its value while also executing all the computations beneath it. In
 * this sense, its functionality is like that of a binary tree. To ensure smooth operations, all variables,
 * operators, and individual numbers should also be defined as Functions but they should simply return their original.
 * This means that all elements used to create any function - numbers, variables, and operators - are defined by Function
 * objects. This is convenient since everything can then be stored in a single Stack for RPN parsing.
 */

public class Function {
	
  // All the variables in this function and their values (things like x, y, z, a, b, you get the idea)
	static HashMap<String, Double> variables = new HashMap<String, Double>();

  // All the supported mathematical operations that only act on a single number
	final static String[] singleOperators = {"sin", "cos", "tan", "arcsin", "arccos", "arctan", "abs"};

  // All the supported mathematical operations that act on two numbers 
	final static String[] dualOperators = {"+", "-", "*", "/", "^", "log"};
	
  // This hashmap stores previous x values and their respective y values. Whenever the function is computed, 
  // at a certain "x" value, the "x" value and "y" value are stored in this hashmap. Then, if the computation
  // is called again at the same "x" value, the compute function will detect that and return the previously computed value.
  HashMap<String, HashMap<Double, Double>> varPastValues = new HashMap<String, HashMap<Double, Double>>();

	private double number;
	private boolean isNumber;
	
	private String variable;
	private boolean isVariable;

  private String operator;
  private boolean isOperatorOnly = false;
	
	private Function a;
	private Function b;
	private String operation;
	

  // The constructor for numbers
	public Function(double number) {
		this.number = number;
		this.isNumber = true;
	}
	
  // The constructor for variables
	public Function(String variable) {
		this.variable = variable;
		isVariable = true;
	}

  // The constructor for operators - the isOperator argument is only to avoid constructor conflicts (with the one above)
  public Function(String operator, boolean isOperator) {
    this.operator = operator;
    this.isOperatorOnly = true;
  }
	
  // The constructor for functions that are single operation expressions (like sin, cos, and anything else in the singleOperators array)
	public Function(Function a, Function operation) {
		this.a = a;
		try {
      this.operation = operation.getOperator();
    } catch (OperatorOnlyException e) {
      System.out.println("Function operation is not an operator only");
    }
	}
	
  // The constructor for functions that are double operation expressions (like *, +, -, and anything else in the dualOperators array)
	public Function(Function a, Function b, Function operation) {
		this.a = a;
		this.b = b;
      try {
        this.operation = operation.getOperator();
      } catch (OperatorOnlyException e) {
        System.out.println("Function operation is not an operator only");
      }
	}
	
  // This method allows you to set the value of a variable in your function for computation
  public static void setVariable(String var, double value) {
    variables.put(var, value);
  }

  // If the Function object is an operator, this will return the operator in string form
  public String getOperator() throws OperatorOnlyException{
    if (isOperatorOnly)
      return operator;
    else {
      throw new OperatorOnlyException();
    }
  }

  // Simple method to tell if a Function object is an operator or something else
  public boolean isOperator() {
    return isOperatorOnly;
  }

  // If multiple variables are being used in a function, then all of their values for a certain computation can be 
  // passed to the function through this method. It makes use of varargs so that an arbitrary number of variables 
  // can be defined.
  @SafeVarargs
	public final static void setVariable(HashMap<String, Double>...vars) {
    for (int x = 0; x < vars.length; x++) {
      for (String var : vars[x].keySet()) {
        setVariable(var, vars[x].get(var));
      }
    }
	}
	
  // This is the main computation method. It computes the function by evaluating the monomial or binomial expression passed
  // to the constructor (depending on what type of expression it is). Since a Function object may be composed of other 
  // Function objects, each compute call also computes the values of the numbers / variables that make it up (even if they are
  // just numbers).
	public double compute() throws VariableDefinitionException, ArithmeticException, OperatorOnlyException {

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
    else if (isOperatorOnly) {
      throw new OperatorOnlyException();
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
      if (this.b.compute() == 0) {
        throw new ArithmeticException(); 
      } else {
			  solution = this.a.compute() / this.b.compute();
      }
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

  // If the function only has x as a variable (x is a magic variable), this method sets "x" to the
  // value passed to the method in order to make usage more simple.
  public double compute(double val) throws ArithmeticException, OperatorOnlyException {
    setVariable("x", val);
    double solution = 0.0;
    try {
      solution = compute();
    } catch (VariableDefinitionException e)  {
      System.out.println(e);
    }
    return solution;
  }

  // This method checks if the function has previously been computed at a value and either falls back on a previous computation
  // (stored in the varPastValues hashmap) or computes a new value based on whether that computation has been performed previously.
  @SafeVarargs
	public final double compute(HashMap<String, Double>...functionVars) throws VariableDefinitionException, ArithmeticException, OperatorOnlyException {

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

  // This method is to verify whether an operation is for dual operators or not
  public static boolean validMultiComputeOperation(String operation) {
    return operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("^") || operation.equals("log");
  }

  // This method is to verify whether an operation is for single operators or not
  public static boolean validSingleComputeOperation(String operation) {
    return operation.equals("sin") || operation.equals("cos") || operation.equals("tan") || operation.equals("asin") || operation.equals("acos") || operation.equals("atan");
  }

}