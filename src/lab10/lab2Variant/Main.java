package lab10.lab2Variant;

import java.lang.Math;

public class Main {
  public static void main(String args[]){
    CalculatingFunction count6 = (double a, double b, double c, double d) -> {
      double absoluteValue = Math.abs(b / a);
      double logAbsoluteValue = Math.log( absoluteValue );
      double innerExpression = Math.sin(c) + Math.exp(d);
      double sqrtInnerExpression = Math.sqrt( innerExpression );
      double result = 3 * (logAbsoluteValue + sqrtInnerExpression);
      return result;
    };

    CalculatingFunction count15 = (double a, double b, double c, double d) ->{
      double tanA = Math.tan(a);
      double absoluteArccosB = Math.abs(Math.acos(b));
      double sqrtResult = Math.sqrt(tanA / absoluteArccosB);
      double expDifference = Math.exp(c - a);
      double sinhD = Math.sinh(d);
      double powerResult = Math.pow(expDifference * sinhD, 1.0 / 3.0);
      double result = 2 * sqrtResult - 3 * powerResult;
      return result;
    };

    CalculatingFunction count24 = (double a, double b, double c, double d) -> {
      double cosB = Math.cos(b);
      double sqrtA = Math.sqrt(a);
      double sinSqrtA = Math.sin(sqrtA);
      double logC = Math.log(c);
      double expD = Math.exp(d);
      double den = 2 * logC + expD;
      double result = (cosB + sinSqrtA) / den;
      return result;
    };

    System.out.println(count6.apply(-1.23, -0.34, 0.707, 2.312));
    System.out.println(count15.apply( 1.25, 3.09, 4.25, 0.56 ));
    System.out.println(count24.apply( 0.345, -2.25, 2.65, 3.99 ));
  }


}