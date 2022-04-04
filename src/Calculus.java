
public class Calculus {
	
	public double computeDefiniteIntegral(Function function, double inputLowBound, double inputHighBound) {
		
		// MIDPOINT RIEMANN SUM 
		
		double sum = 0.0;
		
		//double increment = (inputZHigh - inputZLow)/(Math.pow(10, 7)); 
		double increment = 1.0 / (Math.pow(10, 2)); 
		
		for (double i = (inputLowBound + (increment/2)); i < inputHighBound; i+= increment) {
			sum += (function.compute(i) * increment); 
		}
		
		return sum;  
		
	}

}