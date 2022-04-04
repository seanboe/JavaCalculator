import java.util.HashMap;

public class Calculus {
	
	public double computeDefiniteIntegral(Function function, double inputLowBound, double inputHighBound) {
		
		// MIDPOINT RIEMANN SUM 
		
		double sum = 0.0;
		
		//double increment = (inputZHigh - inputZLow)/(Math.pow(10, 7)); 
		double increment = 1.0 / (Math.pow(10, 2)); 
		
		for (double i = (inputLowBound + (increment/2)); i < inputHighBound; i+= increment) {
			
			HashMap<String, Double> temp = new HashMap<String, Double>();
			temp.put("x", i); 
			
			sum += (function.compute(temp) * increment); 
		} // WRONG SYNTAX FOR COMPUTE - NEED TO PASS IN HASHMAP STUFF 
		
		return sum;  
		
	}
	
	

}