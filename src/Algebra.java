
public class Algebra {

  private double round(double val, int decimalPoints) {
    double factor = Math.pow(10, decimalPoints);
    val = val * factor;
    double rounded = (double)(val - (int) val > 0.5 ? (int)val + 1 : (int)val);
    return rounded / factor;
  }

  public static double computeZeros(Function function, double lowerLimit, double upperLimit) throws InvalidInputsException {

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

}
