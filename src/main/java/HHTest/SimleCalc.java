package HHTest;

public class SimleCalc {

    public static long calc(String expression) {

     String[] str = expression.split("[+\\-*/]");

     if (expression.contains("+")) {
         return Long.valueOf(str[0]) + Long.valueOf(str[1]);
     } else if (expression.contains("-")) {
         return Long.valueOf(str[0]) - Long.valueOf(str[1]);
     } else if (expression.contains("*")) {
         return Long.valueOf(str[0]) * Long.valueOf(str[1]);
     } else if (expression.contains("/")) {
         return Long.valueOf(str[0]) / Long.valueOf(str[1]);
     }
     return 0;
    }

}
