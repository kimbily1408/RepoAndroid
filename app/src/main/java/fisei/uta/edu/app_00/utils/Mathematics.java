package fisei.uta.edu.app_00.utils;

public class Mathematics {
    public long Factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static long Power  (int base, int exponent) {
     long result = 1;

     for (int i = 1; i <= exponent; i++) {
         result *= base;
     }
     return result;
    }
}
