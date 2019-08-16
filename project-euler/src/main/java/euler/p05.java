package euler;

import java.util.ArrayList;
import org.apache.commons.math3.primes.Primes;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class p05 {

    public static ArrayList<Integer> listOfSmallerPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = 2; i <= n; ++i) {
            if (Primes.isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static ArrayList<Integer> lookForMaxPowerNeeded(int n) {
        ArrayList<Integer> exponents = new ArrayList<Integer>();

        for (int i = 2; i<= n; ++i){
            // TODO
        }
        return exponents;
    }

    public static void main(String[] args) {
        
    }
}