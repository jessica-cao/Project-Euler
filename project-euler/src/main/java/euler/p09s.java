package euler;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

public class p09s {

    public static int productOfabc() {
        int a = 0;
        int b = 0;
        int c = 0;
        int s = 1000;
        Boolean triplesFound = false;

        for (a = 0; a < (s / 3); ++a) {
            for (b = 0; b < (s / 2); ++b) {
                c = s - a - b;
                if (a * a + b * b == c * c) {
                    triplesFound = true;
                    break;
                }
            }
            if (triplesFound == true) {
                break;
            }
        }

        int product = a * b * c;
        return product;
    }

    public static void main(String[] args) {
        productOfabc();
    }
}