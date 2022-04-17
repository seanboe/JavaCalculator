
public class Algebra {

  // Bisection zeros algorithm
  public static double bisectionZeros(Function function, double lowerLimit, double upperLimit) throws InvalidInputsException {

    // make sure that signs of the function at the lowerLimit and the upperLimit are opposite
    double lowerBound = lowerLimit;
    double upperBound = upperLimit;
    double center = (lowerLimit + upperLimit) / 2;

    double lowerVal = function.compute(lowerLimit);
    double upperVal = function.compute(upperLimit);
    double centerVal = function.compute(center);

    if (!(lowerVal < 0 && upperVal > 0) || (lowerVal > 0 && upperVal < 0))
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

  // Newton's method for bisections
  public static double computeZeros(Function function, double point) {



    return 0.0;
  }


}
