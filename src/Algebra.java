public class Algebra {

  // Bisection zeros algorithm. This algorithm only works when the function crosses the x-axis completely (changes signs)
  public static double bisectionZeros(Function function, double lowerLimit, double upperLimit) throws InvalidInputsException, ArithmeticException, OperatorOnlyException {

    // make sure that signs of the function at the lowerLimit and the upperLimit are opposite
    double lowerBound = lowerLimit;
    double upperBound = upperLimit;
    double center = (lowerLimit + upperLimit) / 2;

    double lowerVal = function.compute(lowerLimit);
    double upperVal = function.compute(upperLimit);
    double centerVal = function.compute(center);

    if (!((lowerVal < 0 && upperVal > 0) || (lowerVal > 0 && upperVal < 0)))
      throw new InvalidInputsException();

    while ((int)(centerVal * 100000000) != 0) {

      if (centerVal > 0) {
        if (lowerVal <= 0)
          upperBound = center;
        else
          lowerBound = center;
      }
      else {
        if (lowerVal >= 0)
          upperBound = center;
        else
          lowerBound = center;
      }

      center = (upperBound + lowerBound) / 2;

      lowerVal = function.compute(lowerBound);
      upperVal = function.compute(upperBound);
      centerVal = function.compute(center);
    }

    return Math.round((center * 100000000)) / 100000000.0;

  }

  // Newton's method for bisections - point must be within 50 coordinate spaces! This algorithm looks at the derivative
  // of a function at a certain point nearby the root and then uses linear tangent lines to get closer to the root. It 
  // makes use of the bisection zeroes algorithm to find the root of the linear tangent line (since all linear functions)
  // cross the x-axis completely.
  public static double computeZeros(Function function, double point) throws InvalidInputsException, ArithmeticException, OperatorOnlyException {

    double threshold = 0.001;
    double posX = point;
    double slope = Calculus.computeDerivativeAtAPoint(function, posX);

    int counter = 0;

    // while (slope > threshold || function.compute(posX) == 0) {

    while (Math.abs(function.compute(posX)) >= threshold) {
      // System.out.println("x: " + posX + " slope: " + slope);

      // create a linear tangent line
      Function a = new Function("x");
      Function b = new Function(posX);
      Function k = new Function("-", true);
      Function c = new Function(a, b, k);
      Function d = new Function(slope);
      Function y = new Function("*", true);
      Function e = new Function(d, c, y);
      Function f = new Function(function.compute(posX));
      Function l = new Function("+", true);
      Function tangent = new Function(e, f, l);



      // Find the zero of the tangent using the bisection method
      try {
        posX = bisectionZeros(tangent, posX - 10, posX + 10);
      } catch (Exception asdf) {
        asdf.fillInStackTrace();
      }

      slope = Calculus.computeDerivativeAtAPoint(function, posX);

      counter++;
      if (counter > 15) {
        throw new InvalidInputsException();
        // return 10000;
      }
    }

    return Math.round(posX * 1000.0) / 1000.0;
  }


}
