public class Statistics {

	// HELPER METHOD 
    /**
	 * Returns the mean (average) of a <code>double</code> array, in a <code>double</code> format. 
	 * @param inputData , a <code>double</code> array. 
	 * @return the mean of <strong>inputData</strong>. 
	 */
	public static double computeMean(double[] inputData) {
		double sum = 0;

		for (int i = 0; i < inputData.length; i++) {
			sum += inputData[i];
		}

		return ((sum * 1.0) / inputData.length);

	}

	// HELPER METHOD 
    /**
	 * Returns the variance of a <code>double</code> array, in a <code>double</code> format. 
	 * @param inputData , a <code>double</code> array. 
	 * @return the variance of <strong>inputData</strong>. 
	 */
	public static double computeVariance(double[] inputData) {
		double sumDiff = 0.0;

		for (int i = 0; i < inputData.length; i++) {
			sumDiff += ((inputData[i] - computeMean(inputData)) * (inputData[i] - computeMean(inputData)));
		}

		return sumDiff / (inputData.length - 1);

	}

	// HELPER METHOD 
	/**
	 * Returns the standard deviation of a <code>double</code> array, in a <code>double</code> format. 
	 * @param inputData , a <code>double</code> array. 
	 * @return the standard deviation of <strong>inputData</strong>. 
	 */
	public static double computeStandardDeviation(double[] inputData) {
		// assert variance != 0;
		return Math.sqrt(computeVariance(inputData));
	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
    /**
	 * Returns the standard error (Se) of the residuals, in a <code>double</code> format. 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @return Se with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static double computeSe(double[] indVar, double[] depVar) {

		return Math.sqrt((computeSumOfResidualsSquared(indVar, depVar)) / (depVar.length - 2));

	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
	/**
	 * Returns the sum of the residuals squared of the residuals, in a <code>double</code> format. 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @return sum of the residuals squared with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static double computeSumOfResidualsSquared(double[] indVar, double[] depVar) {

		double sum = 0.0;

		double[] temp = computeResidualValues(indVar, depVar);

		for (int i = 0; i < temp.length; i++) {
			sum += (Math.pow(temp[i], 2));
		}

		return sum;

	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
	/**
	 * Returns a <code>double</code> array containing the residual values. 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @return an array containing the residual values with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static double[] computeResidualValues(double[] indVar, double[] depVar) {

		double[] res = new double[indVar.length];

		for (int i = 0; i < res.length; i++) {
			res[i] = (depVar[i] - computeLSRLOutput(indVar, depVar, indVar[i])); 
		}

		return res;

	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
	/**
	 * Returns a <code>double</code> array containing the predicted y-values (ŷ). 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @return an array containing the predicted y-values with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static double[] computeYPredictedValues(double[] indVar, double[] depVar) {

		double[] res = new double[indVar.length];

		for (int i = 0; i < res.length; i++) {
			res[i] = computeLSRLOutput(indVar, depVar, indVar[i]); 
		}

		return res;

	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
	/**
	 * Returns a <code>double</code> which represents the predicted y-value (ŷ) when an x-value is inputted into the least-squares regression line (LSRL). 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @param input , a <code>double</code> which is the value to be inputted into the LSRL. 
	 * @return the predicted y-value with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static double computeLSRLOutput(double[] indVar, double[] depVar, double input) {

		return ((computeA(indVar, depVar)) + (computeB(indVar, depVar) * input));

	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
	/**
	 * Returns the least-squares regression line (LSRL) equation, in a <code>String</code> format. 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @return the LSRL equation with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static String displayLSRLEquation(double[] indVar, double[] depVar) {

		String res = "";

		res = "ŷ = " + (computeA(indVar, depVar)) + " + " + (computeB(indVar, depVar)) + "x";

		if (computeB(indVar, depVar) < 0) {
			res = "ŷ = " + (computeA(indVar, depVar)) + " - " + (-1 * computeB(indVar, depVar)) + "x";
		} else if (computeB(indVar, depVar) >= 0) {
			res = "ŷ = " + (computeA(indVar, depVar)) + " + " + (computeB(indVar, depVar)) + "x";
		}

		return res;

	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
	/**
	 * Returns the y-intercept of the least-squares regression line (LSRL) equation, in a <code>double</code> format. 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @return the y-intercept of the LSRL equation with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static double computeA(double[] indVar, double[] depVar) {

		return (computeMean(depVar)) - ((computeB(indVar, depVar)) * (computeMean(indVar)));

	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
	/**
	 * Returns the slope of the least-squares regression line (LSRL) equation, in a <code>double</code> format. 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @return the slope of the LSRL equation with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static double computeB(double[] indVar, double[] depVar) {

		double r = computeR(indVar, depVar);

		double b = r * (computeStandardDeviation(depVar) / computeStandardDeviation(indVar));

		return b;

	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
	/**
	 * Returns the correlation coefficient (r-value) of the relationship between the independent and dependent variables, in a <code>double</code> format. 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @return the r-value of the LSRL with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static double computeR(double[] indVar, double[] depVar) {

		double sumOfProducts = 0.0;

		double arr1Bar = computeMean(indVar);
		double arr1Sigma = computeStandardDeviation(indVar);

		double arr2Bar = computeMean(depVar);
		double arr2Sigma = computeStandardDeviation(depVar);

		for (int i = 0; i < indVar.length; i++) { // both arrays must have the same length
			sumOfProducts += ((indVar[i] - arr1Bar) / (arr1Sigma))
					* ((depVar[i] - arr2Bar) / (arr2Sigma));
		}

		return sumOfProducts / (indVar.length - 1);

	}

	// USER CALLED METHOD - LINEAR REGRESSION 
	// TO BE PRINTED WITH THE OTHER LINEAR REGRESSION USER CALLED METHODS 
	/**
	 * Returns the r^2-value of the relationship between the independent and dependent variables, in a <code>double</code> format. 
	 * <p>
	 * This method uses linear regression to model the relationship between the 2 variables (least-squares regression line format: ŷ = a + bx). 
	 * @param indVar , a <code>double</code> array containing the independent variable values. 
	 * @param depVar , a <code>double</code> array containing the dependent variable values. 
	 * @return the r^2-value of the LSRL with respect to <strong>indVar</strong> and <strong>depVar</strong>. 
	 */
	public static double computeRSquaredValue(double[] indVar, double[] depVar) {

		return Math.pow((computeR(indVar, depVar)), 2.0);

	}

////////////////////////////////////////////////////////////////////////////////////////////////
// everything below this is part of significance test functions 

	// HELPER METHOD 
    /**
	 * Returns the output (in a <code>double</code> format) of the probability density function (for normal distributions). 
	 * <p>
	 * This method assumes that µ=0 and σ=1. 
	 * @param inputZ , the input value
	 * @return the normal probability density function's output when <strong>inputZ</strong> is the input. 
	 */
	private static double NormalPDF(double inputZ) {

		double constant = (1) / (Math.sqrt(2 * Math.PI));
		double exponent = (Math.pow(inputZ, 2.0)) / (-2);

		return (constant) * (Math.pow(Math.E, exponent));

	}

	// HELPER METHOD AND A USER CALLED METHOD 
    /**
	 * Returns the probability between two z-scores for the probability density function (for normal distributions) using a midpoint Riemann sum. 
	 * <p>
	 * This method assumes that µ=0 and σ=1. 
	 * <p>
	 * Enter large absolute value z-scores for the bounds, for improper integral approximation. 
	 * @param inputZLow , the low bound z-score. 
	 * @param inputZHigh , the high bound z-score. 
	 * @return the probability between <strong>inputZLow</strong> and <strong>inputZHigh</strong>. 
	 */
	public static double computeZProbMidpointRiemann(double inputZLow, double inputZHigh) {

		double sum = 0.0;

		double increment = (inputZHigh - inputZLow)/(Math.pow(10, 7));
		//double increment = 1.0 / (Math.pow(10, 7));

		for (double i = (inputZLow + (increment / 2)); i < inputZHigh; i += increment) {
			sum += (NormalPDF(i) * increment);
		}

		return sum;

	}

	// USER CALLED METHOD 
    /**
	 * Returns the final decision (a <code>String</code>) of the significance test for means, utilizing the z-distribution. 
	 * <p>
	 * For this method: 
	 * <p>
	 * <ul>
	 * 	<li>the null hypothesis should state that the population mean is equal to a certain value. </li>
	 * 		<ul>
	 * 			<li>the alternate hypothesis should state that the population mean is greater than a certain value. </li></ul></ul>
	 * The decision could be to either reject the null hypothesis or fail to reject the null hypothesis. 
	 * @param mu , the population mean to be tested. 
	 * @param sigma , the population standard deviation. 
	 * @param sampleMean , the mean of the sample. 
	 * @param sampleSize , the size of the sample. 
	 * @param alpha , the significance level (α) of the test. 
	 * @return the final decision of the significance test. 
	 */
	public static String computeZMeansTestHaGreaterThanValue(double mu, double sigma, double sampleMean, int sampleSize, double alpha) {

		double zCritical = (sampleMean - mu) / (sigma / (Math.sqrt(sampleSize)));

		double pValue = computeZProbMidpointRiemann(zCritical, 1000.0);

		if (pValue < alpha) {
			return "There is statistically significant evidence that Ha > H0... reject H0";
		} else if (pValue > alpha) {
			return "There is no statistically significant evidence that Ha > H0... fail to reject H0";
		} else if (pValue == alpha) {
			return "";
		}

		return "";

	}

	// USER CALLED METHOD 
    /**
	 * Returns the final decision (a <code>String</code>) of the significance test for means, utilizing the z-distribution. 
	 * <p>
	 * For this method: 
	 * <p>
	 * <ul>
	 * 	<li>the null hypothesis should state that the population mean is equal to a certain value. </li>
	 * 		<ul>
	 * 			<li>the alternate hypothesis should state that the population mean is less than a certain value. </li></ul></ul>
	 * The decision could be to either reject the null hypothesis or fail to reject the null hypothesis. 
	 * @param mu , the population mean to be tested. 
	 * @param sigma , the population standard deviation. 
	 * @param sampleMean , the mean of the sample. 
	 * @param sampleSize , the size of the sample. 
	 * @param alpha , the significance level (α) of the test. 
	 * @return the final decision of the significance test. 
	 */
	public static String computeZMeansTestHaLessThanValue(double mu, double sigma, double sampleMean, int sampleSize, double alpha) {

		double zCritical = (sampleMean - mu) / (sigma / (Math.sqrt(sampleSize)));

		double pValue = computeZProbMidpointRiemann(-1000.0, zCritical);

		if (pValue < alpha) {
			return "There is statistically significant evidence that Ha < H0... reject H0";
		} else if (pValue > alpha) {
			return "There is no statistically significant evidence that Ha < H0... fail to reject H0";
		} else if (pValue == alpha) {
			return "";
		}

		return "";

	}

	// USER CALLED METHOD 
	/**
	 * Returns the final decision (a <code>String</code>) of the significance test for means, utilizing the z-distribution. 
	 * <p>
	 * For this method: 
	 * <p>
	 * <ul>
	 * 	<li>the null hypothesis should state that the population mean is equal to a certain value. </li>
	 * 		<ul>
	 * 			<li>the alternate hypothesis should state that the population mean is not equal to a certain value. </li></ul></ul>
	 * The decision could be to either reject the null hypothesis or fail to reject the null hypothesis. 
	 * @param mu , the population mean to be tested. 
	 * @param sigma , the population standard deviation. 
	 * @param sampleMean , the mean of the sample. 
	 * @param sampleSize , the size of the sample. 
	 * @param alpha , the significance level (α) of the test. 
	 * @return the final decision of the significance test. 
	 */
	public static String computeZMeansTestHaNotEqualToValue(double mu, double sigma, double sampleMean, int sampleSize, double alpha) {

		double zCritical = (sampleMean - mu) / (sigma / (Math.sqrt(sampleSize)));

		double pValue = (computeZProbMidpointRiemann((Math.abs(zCritical)), 1000.0)) * 2.0;

		if (pValue < alpha) {
			return "There is statistically significant evidence that Ha ≠ H0... reject H0";
		} else if (pValue > alpha) {
			return "There is no statistically significant evidence that Ha ≠ H0... fail to reject H0";
		} else if (pValue == alpha) {
			return "";
		}

		return "";

	}
    
}
