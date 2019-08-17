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

        for(int i = 2; i <= 20; i++) {
            if (Primes.isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static long smallestDivisibleNumber(int n) {
        ArrayList<Integer> primes = listOfPrimes(n);
        long smallerDivisibleNumber = calculateFactorial(n);
        for (int i : primes) {
            if (i <= (n / 2) && !(smallerDivisibleNumber % i == 0)) {

            } else {
                return smallerDivisibleNumber;
            }

            

        }


        return smallerDivisibleNumber;
    }



    public static void main(String[] args) {
        smallestDivisibleNumber(20);
    }
}
