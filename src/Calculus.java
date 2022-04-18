import java.util.HashMap;
import java.util.ArrayList;

public class Calculus {
	
	public static double computeDefiniteIntegral(Function function, double lowBound, double highBound) {
				
		double sum = 0.0;
		
		double increment = 1.0 / (Math.pow(10, 3)); 
		
		for (double i = (lowBound + (increment/2)); i < highBound; i += increment) {
			
			HashMap<String, Double> temp = new HashMap<String, Double>();
			temp.put("x", i); 
			
      try {
        sum += (function.compute(temp) * increment); 
      } catch (VariableDefinitionException e) {
        System.out.println(e);
      }

		}
    	
		return sum;  	

	}
	
	public static double computeDerivativeAtAPoint(Function function, double inputValue) {
		
    double solution = 0.0;

    final double offset = 0.000000000000001;

    HashMap<String, Double> temp1 = new HashMap<String, Double>(); 
    temp1.put("x", inputValue); 

    HashMap<String, Double> temp2 = new HashMap<String, Double>(); 
    temp2.put("x", inputValue + offset); 

		try {
			solution = (function.compute(temp2) - function.compute(temp1)) / (0.000000000000001); 
		} catch (VariableDefinitionException e) {
			System.out.println(e); 
		}
		
		return solution; 
		
	}

  public static double computeSum(Function function, int lowerBound, int upperBound) {

    double sum = 0.0;

    for (int x = lowerBound; x <= upperBound; x++) {
      HashMap<String, Double> point = new HashMap<String, Double>();
      point.put("x", (double)x);
      try {
        sum += function.compute(point);
      } catch (VariableDefinitionException e) {
        System.out.println(e);
      }
    }

    return sum;

  }

  public static double computeFinitePiecewiseLimit(point) {
left(point)
right(point)

  }

  public static double computeFiniteLimit(Function function, double point) { // STILL A WIP 

    HashMap<String, Double> myPoint = new HashMap<String, Double>(); 
    myPoint.put("x", point); 
    double output = 0.0; 
    Double undefinedCheck = (3.0) / (0 * 2); 
    double increment = 0.0000001; 
    ArrayList<Double> leftPointChecker = new ArrayList<Double>(); 
    ArrayList<Double> rightPointChecker = new ArrayList<Double>(); 

    try { 
      if ((Double.isNaN(function.compute(myPoint))) || (function.compute(myPoint) == undefinedCheck)) {

        // evaluating left & right side limits to check equality 

		

      } else {
        output = function.compute(myPoint); 
      }
    } catch (VariableDefinitionException e) {
      System.out.println(e); 
    }

    return output; 

  }

  public static double computeEndBehavior(Function function, boolean positiveInfinity) throws VariableDefinitionException{

    double increment = Math.pow(10, 3) * (positiveInfinity ? 1.0 : -1.0);
    double x = increment;

    double derivativeThreshold = 0.0001;

    while (computeDerivativeAtAPoint(function, x) > derivativeThreshold) {
      x += increment;
    }

    HashMap<String, Double> point = new HashMap<String, Double>(); 
    point.put("x", x);

    return function.compute(point);
  }
	
}
