package euler;

public class p02 {

    public static int evenSumFib() {
        int fib1 = 1;
        int fib2 = 1;
        int currentFib = 0;
        int sum = 0;

        while (currentFib < 4000000) {
            if (currentFib % 2 == 0) {
                sum += currentFib;
            }
            currentFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = currentFib;

        }

        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        evenSumFib();
    }
}