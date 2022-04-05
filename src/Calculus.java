import java.util.HashMap;

public class Calculus {
	
	public static double computeDefiniteIntegral(Function function, double lowBound, double highBound) {
		
		// MIDPOINT RIEMANN SUM 
		
		double sum = 0.0;
		
		//double increment = (inputZHigh - inputZLow)/(Math.pow(10, 7)); 
		double increment = 1.0 / (Math.pow(10, 3)); 
		
		for (double i = (lowBound + (increment/2)); i < highBound; i+= increment) {
			
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
		
		try {
			HashMap<String, Double> temp1 = new HashMap<String, Double>(); 
			temp1.put("x", inputValue); 
			HashMap<String, Double> temp2 = new HashMap<String, Double>(); 
			temp2.put("x", inputValue + 0.000000000000001); 
			return (function.compute(temp2) - function.compute(temp1)) / (0.000000000000001); 
		} catch (VariableDefinitionException e) {
			System.out.println(e); 
		}
		
		return 0.0; 
		
	}
	
}