package PrimeChecker;

public class PrimeChecker {

    public static boolean isPrime(int number) {

        // Prime numbers must be greater than 1
        if (number <= 1) {
            return false;
        }

        // 2 is the only even prime number
        if (number == 2) {
            return true;
        }

        // Other even numbers are not prime
        if (number % 2 == 0) {
            return false;
        }

        // Check odd factors up to the square root
        int limit = (int) Math.sqrt(number);

        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
