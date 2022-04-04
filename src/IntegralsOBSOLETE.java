
public class IntegralsOBSOLETE {
	
	private Function function; 
	
	public IntegralsOBSOLETE() {
		
		
		
	}
	
	public double function(Function function) {
		
//		double constant = (1) / (Math.sqrt(2 * Math.PI)); 
//		double exponent = (Math.pow(inputZ, 2.0)) / (-2); 
//		
//		return (constant) * (Math.pow(Math.E, exponent)); 
		
	} 
	
	public double computeLeftRiemann(double inputZLow, double inputZHigh) {
		
		double sum = 0.0; 
		
		//double increment = (inputZHigh - inputZLow)/(Math.pow(10, 7)); 
		double increment = 1.0 / (Math.pow(10, 7)); 

		for (double i = inputZLow; i < inputZHigh; i += increment) {
			sum += ((NormalPDF(i)) * (increment)); 
		}
		
		return sum; 
	}
	
	public double computeRightRiemann(double inputZLow, double inputZHigh) {
		
		double sum = 0.0; 
		
		//double increment = (inputZHigh - inputZLow)/(Math.pow(10, 7)); 
		double increment = 1.0 / (Math.pow(10, 7)); 
		
		for (double i = (inputZLow + increment); i <= inputZHigh; i += increment) {
			sum += (NormalPDF(i) * increment); 
		}
		
		return sum; 
		
	}
	
	public double computeAverageLeftRightRiemann(double inputZLow, double inputZHigh) {
		return ((computeRightRiemann(inputZLow, inputZHigh)) + 
											(computeLeftRiemann(inputZLow, inputZHigh))) / 2; 
	}
	
	public double computeMidpointRiemann(double inputZLow, double inputZHigh) {
		
		double sum = 0.0;
		
		//double increment = (inputZHigh - inputZLow)/(Math.pow(10, 7)); 
		double increment = 1.0 / (Math.pow(10, 7)); 
		
		for (double i = (inputZLow + (increment/2)); i < inputZHigh; i+= increment) {
			sum += (NormalPDF(i) * increment); 
		}
		
		return sum; 
		
	}
	
	public double computeTrapezoidRiemann(double inputZLow, double inputZHigh) {
		
		double sum = 0.0; 
		
		//double increment = (inputZHigh - inputZLow)/(Math.pow(10, 7)); 
		double increment = 1.0 / (Math.pow(10, 7)); 
				
		for (double i = inputZLow; i < (inputZHigh-increment); i += increment) {
			sum += ((0.5) * (NormalPDF(i) + NormalPDF(i + increment)) * (increment)); 
		}
		
		return sum; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
