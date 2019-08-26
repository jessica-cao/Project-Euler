package euler;

import java.math.BigInteger;

import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.MathUtils;

/* 
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

*/

public class p20s {

    public static double doubleFactorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * doubleFactorial(n - 1);
        }
    }

    public static int sumOfDigits() {
        int sum = 0;
        double factorial = doubleFactorial(100);
        String factorialToString = Double.toString(factorial);
        final int LEN = factorialToString.length();

        for (int i = 0; i < LEN; ++i) {
            sum += Character.getNumericValue(factorialToString.charAt(i));
        }

        return sum;

    }

    public static void main(String[] args) {
        sumOfDigits();
        
    }
}