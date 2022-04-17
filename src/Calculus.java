import java.util.HashMap;

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

  public static double computeDefiniteLimit(Function function, double point) {

    HashMap<String, Double> myPoint = new HashMap<String, Double>(); 
    myPoint.put("x", point); 
    double output = 0.0; 

    try {
      if (Double.isNaN(function.compute(myPoint))) {
        // NEED TO ADD LOGIC 
      } else {
        output = function.compute(myPoint); 
      }
    } catch (VariableDefinitionException e) {
      System.out.println(e); 
    }

    return output; 

  }

  public static double computePositiveInfinityLimit(Function function) { // end behavior

    double estimator = 1.0 * (Math.pow(10, 5)); 
    HashMap<String, Double> myPoint = new HashMap<String, Double>(); 
    myPoint.put("x", estimator); 
    double output = 0.0; 

    try {
      output = function.compute(myPoint); 
      output = Math.round(output * 100.0) / 100.0; 
    } catch (VariableDefinitionException e) {
      System.out.println(e); 
    }

    return output; 

  }

  public static double computeNegativeInfinityLimit(Function function) { // end behavior

    double estimator = -1.0 * (Math.pow(10, 5)); 
    HashMap<String, Double> myPoint = new HashMap<String, Double>(); 
    myPoint.put("x", estimator); 
    double output = 0.0; 

    try {
      output = function.compute(myPoint); 
      output = Math.round(output * 100.0) / 100.0; 
    } catch (VariableDefinitionException e) {
      System.out.println(e); 
    }

    return output; 

  }
	
}