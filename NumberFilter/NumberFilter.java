package NumberFilter;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class NumberFilter {

    private List<Integer> numbers;

    public NumberFilter(int count, long seed) {
        numbers = generateRandomNumbers(count, seed);
    }

    private List<Integer> generateRandomNumbers(int count, long seed) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random(seed);

        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(2001) - 1000); // -1000 to 1000
        }

        return list;
    }

    public List<Integer> getAllPrimeNumbers() {
        List<Integer> primes = new ArrayList<>();

        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }

        return primes;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> getDivisibleBy3ButNot5() {
        List<Integer> result = new ArrayList<>();

        for (int number : numbers) {
            if (number % 3 == 0 && number % 5 != 0) {
                result.add(number);
            }
        }

        return result;
    }

    public List<Integer> getSortedRemainingNumbers() {
        List<Integer> result = new ArrayList<>();

        // Keep numbers not divisible by 3 or 5
        for (int number : numbers) {
            if (number % 3 != 0 && number % 5 != 0) {
                result.add(number);
            }
        }

        // Bubble sort (descending)
        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = 0; j < result.size() - 1 - i; j++) {
                if (result.get(j) < result.get(j + 1)) {
                    int temp = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, temp);
                }
            }
        }

        return result;
    }

    public double computeAverageOfRemainingNumbers() {
        List<Integer> remaining = getSortedRemainingNumbers();

        if (remaining.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (int number : remaining) {
            sum += number;
        }

        return sum / remaining.size();
    }
}