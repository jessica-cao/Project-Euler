package euler;

public class p01 {

    public static int sumOfMultiplesOf3And5Under1000() {
        int sum = 0;

        for(int i = 1; i < 1000; ++i) {
            if (i % 3 == 0 | i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        sumOfMultiplesOf3And5Under1000();
    }

}