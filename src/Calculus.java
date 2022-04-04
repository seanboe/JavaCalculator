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
	
}