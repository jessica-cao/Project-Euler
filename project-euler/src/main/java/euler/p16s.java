package euler;

import java.math.BigInteger;

/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
*/

public class p16s {

    public static int sumOfDigits() {
        int sum = 0;
        BigInteger power = (new BigInteger("2")).pow(1000);
        String powerStr = power.toString();
        final int LEN = powerStr.length();
        for (int i = 0; i < LEN; ++i) {
            sum += Integer.parseInt(Character.toString(powerStr.charAt(i)));
        }
        return sum;

    }

    public static void main(String[] args) {
        sumOfDigits();
    }
}