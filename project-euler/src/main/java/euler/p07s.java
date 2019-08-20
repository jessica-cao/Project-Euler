package euler;

import org.apache.commons.math3.primes.Primes;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

public class p07s {

    public static int nthPrime(int n) {

        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 3;
        } else {
            int nthPrime = 3;
            for (int i = 3; i<=n; ++i) {
                nthPrime = Primes.nextPrime(nthPrime + 1);
            }

            return nthPrime;

        }
    }

    public static void main(String[] args) {
        nthPrime(10001);
        
    }
}