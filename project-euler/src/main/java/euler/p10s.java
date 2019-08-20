package euler;

import org.apache.commons.math3.primes.Primes;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

public class p10s {
    public static long sumOfPrimes(int n) {
        long sum = 0L;
        int currentPrime = 3;
        int nthPrime = 1;

        while(Primes.nextPrime(currentPrime) <= n) {
            if (nthPrime == 1) {
                sum += 2;
                ++nthPrime;
            } else if (nthPrime == 2) {
                sum += 3;
                ++nthPrime;
            } else {
                currentPrime = Primes.nextPrime(currentPrime + 1);
                sum += currentPrime;
            }
        }

        return sum;
        
    }

    public static void main(String[] args) {
        System.out.println("?????");
        //System.out.println(sumOfPrimes(2000000));
    }
}