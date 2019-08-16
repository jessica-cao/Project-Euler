package euler;

import java.awt.List;
import java.math.*;
import org.apache.commons.math3.primes.Primes;

public class p03 {

    public static long largestPrimeDivisor() {
        long LIMIT = 600851475143L;

        List<long> loPrimeDivisors = Primes.primeFactors(LIMIT);
        int countPrimeDivisors = loPrimeDivisors.countItems();
        long largest = 0L;
        
        for (int i = 0; i < countPrimeDivisors; ++i) {
            if (loPrimeDivisors[i] > largest) {
                largest = loPrimeDivisors[i];
            }
        }

        System.out.println(largest);
        return largest;

    }

    public static void main(String[] args) {
        largestPrimeDivisor();
    }
}