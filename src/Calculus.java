import java.util.HashMap;
import java.util.ArrayList;

public class Calculus {
	
  /**
   * Returns the approximate area under the curve between 2 x-values, when given a function. 
   * @param function , the function of interest (must be a <code>Function</code> object). 
   * @param lowBound , the low bound x-value for the definite integral. 
   * @param highBound , the high bound x-value for the definite integral. 
   * @return the area under the curve between <strong>lowBound</strong> and <strong>highBound</strong>, with respect to <strong>function</strong>. 
   * @throws OperatorOnlyException
   * @throws ArithmeticException
   */
	public static double computeDefiniteIntegral(Function function, double lowBound, double highBound) throws ArithmeticException, OperatorOnlyException {
				
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

  // /**
  //  * Returns the total area under a function or the area under a curve from a constant to +∞ or from -∞ to a constant, depending on the specification. 
  //  * @param function , the function of interest (must be a <code>Function</code> object). 
  //  * @param lowBound , the low bound of the integral. It is a <code>String</code> (must be either "-inf" or a real number in <code>String</code> format). 
  //  * @param highBound , the high bound of the integral. It is a <code>String</code> (must be either "+inf" or a real number in <code>String</code> format). 
  //  * @return the area under <strong>function</strong>, with respect to <strong>lowBound</strong> and <strong>highBound</strong>. 
  //  * @throws OperatorOnlyException
  //  * @throws ArithmeticException
  //  * @throws NumberFormatException
  //  * @throws VariableDefinitionException
  //  */
  // public static String computeImproperIntegral(Function function, double bound, String direction) throws NumberFormatException, ArithmeticException, OperatorOnlyException, VariableDefinitionException {

  //   final double offset = 1.0;
  //   double output = 0;

  //   double time = System.currentTimeMillis();

  //   if (direction.equals("-")) {
  //     for (double x = bound; x > -10000; x -= offset) {
  //       System.out.println("neg");
  //       if (Math.abs(computeDerivativeAtAPoint(function, x)) < 0.0000001) {
  //         if (time - System.currentTimeMillis() > 5000) 
  //           break;
  //         return (output > 1000000 ? "undef" : output + "");
  //       }
  //       output += function.compute(x);
  //     }
  //   }
  //   else if (direction.equals("+")) {
  //     System.out.println("pos");
  //     for (double x = bound; x < 10000; x += offset) {
  //       if (Math.abs(computeDerivativeAtAPoint(function, x)) < 0.0000001) {
  //         if (time - System.currentTimeMillis() > 5000) 
  //           break;
  //         return (output > 1000000 ? "undef" : output + " " + x);
  //         }
  //       output += function.compute(x);
  //     }
  //   }
    
  //   return "undef";
  // }
	
  /**
   * Returns the derivative of a function at a specific x-value. 
   * @param function , the function of interest (must be a <strong>Function</strong> object). 
   * @param inputValue , the x-value where the derivative is to be computed. 
   * @return , the slope of <strong>function</strong> at <strong>inputValue</strong>. 
   * @throws OperatorOnlyException
   * @throws ArithmeticException
   */
	public static double computeDerivativeAtAPoint(Function function, double inputValue) throws ArithmeticException, OperatorOnlyException, VariableDefinitionException {
		
    double solution = 0.0;

    final double offset = 0.00000000001;

    HashMap<String, Double> temp1 = new HashMap<String, Double>(); 
    temp1.put("x", inputValue); 

    HashMap<String, Double> temp2 = new HashMap<String, Double>(); 
    temp2.put("x", inputValue + offset); 

		solution = (function.compute(inputValue + offset) - function.compute(inputValue)) / (offset); 
    return solution;
		
		//return solution; 
		
	}

  /**
   * Returns the definite sum (series) of a function from a low bound x-value to a high-bound x-value. 
   * @param function , the function of interest (must be a <code>Function</code> object). 
   * @param lowerBound , the low bound x-value of the sum. 
   * @param upperBound , the high bound x-value of the sum. 
   * @return the series of <strong>function</strong>, with respect to <strong>lowerBound</strong> and <strong>upperBound</strong>. 
   * @throws OperatorOnlyException
   * @throws ArithmeticException
   */
  public static double computeSum(Function function, int lowerBound, int upperBound) throws ArithmeticException, OperatorOnlyException {

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

  /**
   * Returns the end behavior of a function (the y-value of the asymptote), when the x-direction of the limit is specified. 
   * @param function , the function of interest (must be a <strong>Function</strong> object). 
   * @param positiveInfinity , a <code>boolean</code> that is <code>true</code> when x-values approach positive infinity and <code>false</code> when x-values approach negative infinity. 
   * @return the y-value of the asymptote, with respect to the value of <strong>positiveInfinity</strong>. 
   * @throws VariableDefinitionException
   * @throws OperatorOnlyException
   * @throws ArithmeticException
   */
  public static double computeEndBehavior(Function function, boolean positiveInfinity) throws VariableDefinitionException, ArithmeticException, OperatorOnlyException{

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
 