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

  public static String computeDefiniteLimit(Function function, double point) {
    if (computeLeftSideLimit(function, point).equals(computeRightSideLimit(function, point)))
      return computeLeftSideLimit(function, point) + ""; 
    return "limit does not exist"; 
  }

  public static String computeLeftSideLimit(Function function, double point) {

    double undefinedCheck = (3.0) / (0 * 2); 
    HashMap<String, Double> pointInFunction = new HashMap<String, Double>(); 
    pointInFunction.put("x", point); 

    try {
      if ((function.compute(pointInFunction) == undefinedCheck) || (Double.isNaN(function.compute(pointInFunction)))) {
        double xTracker = point - 1; 
        
        while (xTracker < point) {
          if (computeDerivativeAtAPoint(function, xTracker) > 100) 
            return "+∞"; 
          if ((computeDerivativeAtAPoint(function, xTracker)) < -100) 
            return "-∞"; 
          
          xTracker += 0.0000001; 
        }

      } else {
        return function.compute(pointInFunction) + ""; 
      }
    } catch (VariableDefinitionException e) {
      System.out.println(e); 
    }

    return ""; 

  }

  public static String computeRightSideLimit(Function function, double point) {

    double undefinedCheck = (3.0) / (0 * 2); 
    HashMap<String, Double> pointInFunction = new HashMap<String, Double>(); 
    pointInFunction.put("x", point); 

    try {
      if ((function.compute(pointInFunction) == undefinedCheck) || (Double.isNaN(function.compute(pointInFunction)))) {
        double xTracker = point + 1; 
        
        while (xTracker > point) {
          if (computeDerivativeAtAPoint(function, xTracker) > 100) 
            return "+∞"; 
          if ((computeDerivativeAtAPoint(function, xTracker)) < -100) 
            return "-∞"; 
          
          xTracker -= 0.0000001; 
        }

      } else {
        return function.compute(pointInFunction) + ""; 
      }
    } catch (VariableDefinitionException e) {
      System.out.println(e); 
    }

    return ""; 

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
