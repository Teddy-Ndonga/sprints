package SmallestDivisor;

public class SmallestDivisor {

    public int smallestDivisor(int number) {

        if (number <= 1) {
            return 1;
        }

        if (number % 2 == 0) {
            return 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return i;
            }
        }

        return number;
    }
}
