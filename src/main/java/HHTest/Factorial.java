package HHTest;

import java.math.BigInteger;

public class Factorial {

    public static long calculate(long n) {
      long result = 1;

      for(long i = 2; i <= n; i++) {
          result = result * i;
      }
      return result;
    }
}
