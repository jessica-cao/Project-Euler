package euler;

import java.util.ArrayList;

import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.util.CombinatoricsUtils;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class p05s {

    public static long calculateFactorial(int n) {
        long factorial = CombinatoricsUtils.factorial(n);
        return factorial;
    }

    public static ArrayList<Integer> listOfPrimes(int n) {
        ArrayList<Integer>primes = new ArrayList<Integer>();

        for(int i = 2; i <= n; i++) {
            if (Primes.isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static ArrayList<Integer> largestPowersBelowLimit(int n) {
        ArrayList<Integer> primes = listOfPrimes(n);
        ArrayList<Integer> largestPrimePowers = new ArrayList<Integer>();
        
        for (int i : primes) {
            int powerSoFar = i;
            while ((powerSoFar * i) <= n) {
                powerSoFar *= i;
            }
            System.out.println(powerSoFar);
            largestPrimePowers.add(powerSoFar);
        }
        return largestPrimePowers;
    }

    public static long smallestDivisibleNumber(int n) {
        ArrayList<Integer> factors =largestPowersBelowLimit(n);
        long number = 1;

        for (int i : factors) {
            number *= i;
        }

        return number;
    }



    public static void main(String[] args) {
        System.out.println(smallestDivisibleNumber(20));
    }
}
