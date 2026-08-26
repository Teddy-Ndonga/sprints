package GCDRecursive;

public class GCDRecursive {

    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            return 0;
        }

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

}