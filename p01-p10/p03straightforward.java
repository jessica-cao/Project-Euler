import java.awt.List;
import java.math.*;
import org.apache.commons.math3.primes.Primes;

public class p03straightforward {

    public static long largestPrimeDivisor() {
        Primes o = new Primes();
        long LIMIT = 600851475143L;

        List<Long> loPrimeDivisors = primeFactors(LIMIT);
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