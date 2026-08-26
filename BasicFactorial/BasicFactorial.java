package BasicFactorial;

public class BasicFactorial {

    public int calculateBasicFactorial(int n) {

        // Return zero for invalid negative inputs
        if (n < 0) {
            return 0;
        }

        // Base case: 0! and 1! are both 1
        int result = 1;

        // Calculate the factorial
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
