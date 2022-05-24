import java.util.HashMap;
import java.util.ArrayList;

public class Calculus {
	
  /**
   * Returns the approximate area under the curve between 2 x-values, when given a function. 
   * @param function , the function of interest (must be a <code>Function</code> object). 
   * @param lowBound , the low bound x-value for the definite integral. 
   * @param highBound , the high bound x-value for the definite integral. 
   * @return the area under the curve between <strong>lowBound</strong> and <strong>highBound</strong>, with respect to <strong>function</strong>. 
   */
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

  public static String computeImproperIntegral(Function function, String lowBound, String highBound) {

    if (lowBound.equals("-infty")) {
      return computeDefiniteIntegral(function, -10000.0, Double.parseDouble(highBound)) + ""; 
    } else if (highBound.equals("+infty")) {
      return computeDefiniteIntegral(function, Double.parseDouble(lowBound), 10000.0) + ""; 
    }

    return ""; 

  }
	
  /**
   * Returns the derivative of a function at a specific x-value. 
   * @param function , the function of interest (must be a <strong>Function</strong> object). 
   * @param inputValue , the x-value where the derivative is to be computed. 
   * @return , the slope of <strong>function</strong> at <strong>inputValue</strong>. 
   */
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

  /**
   * Returns the definite sum (series) of a function from a low bound x-value to a high-bound x-value. 
   * @param function , the function of interest (must be a <code>Function</code> object). 
   * @param lowerBound , the low bound x-value of the sum. 
   * @param upperBound , the high bound x-value of the sum. 
   * @return the series of <strong>function</strong>, with respect to <strong>lowerBound</strong> and <strong>upperBound</strong>. 
   */
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

  public static String computeLeftSideLimitNOUNDEFINEDCHECK(Function function, double xVal) {

    HashMap<String, Double> point = new HashMap<String, Double>(); 
    point.put("x", xVal); 
    double xTracker = xVal - 1; 

    try {

      while (xTracker < xVal) {
        if (computeDerivativeAtAPoint(function, xTracker) > 100)
          return "+∞"; 
        if (computeDerivativeAtAPoint(function, xTracker) < 100)
          return "-∞"; 
        xTracker += 0.0000001;  
      }

      HashMap<String, Double> res = new HashMap<String, Double>(); 
      res.put("x", xTracker); 
      return function.compute(res) + ""; 

    } catch (VariableDefinitionException e) {
      System.out.println(e); 
    }

    return ""; 

  }

  public static String computeLeftSideLimit(Function function, double point) {
    double undefinedCheck = (3.0) / (0 * 2); 
    HashMap<String, Double> pointInFunction = new HashMap<String, Double>(); 
    pointInFunction.put("x", point); 
    double xTracker = point-1; 
    try {
      
      if ((function.compute(pointInFunction) == undefinedCheck) || (Double.isNaN(function.compute(pointInFunction)))) {
        xTracker = point - 1; 
        
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

  /**
   * Returns the end behavior of a function (the y-value of the asymptote), when the x-direction of the limit is specified. 
   * @param function , the function of interest (must be a <strong>Function</strong> object). 
   * @param positiveInfinity , a <code>boolean</code> that is <code>true</code> when x-values approach positive infinity and <code>false</code> when x-values approach negative infinity. 
   * @return the y-value of the asymptote, with respect to the value of <strong>positiveInfinity</strong>. 
   * @throws VariableDefinitionException
   */
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
