package GCDCalculator;

public class GCDCalculator {

    public int gcd(int a, int b) {
        // Handle negative numbers to ensure a positive result
        a = Math.abs(a);
        b = Math.abs(b);

        // Loop until the remainder is zero
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}
