# Number Filter

Generates a list of random integers and performs filtering, prime-number
detection, sorting, and average calculations.

## Functional Requirements

Implement a `NumberFilter` class that generates random integers between
`-1000` and `1000` and provides methods to process them.

The class should:

- Generate a specified number of random integers.
- Use a seed to make random number generation reproducible.
- Return all prime numbers.
- Return numbers divisible by `3` but not by `5`.
- Return numbers that are not divisible by `3` or `5`, sorted in descending order.
- Calculate the average of the remaining numbers.
- Return `0` when there are no remaining numbers.

## Implementation

```java
package sprint;

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
            list.add(random.nextInt(2001) - 1000);
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

        for (int number : numbers) {
            if (number % 3 != 0 && number % 5 != 0) {
                result.add(number);
            }
        }

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

Usage
Create a Main.java file:

import sprint.NumberFilter;

public class Main {

    public static void main(String[] args) {
        NumberFilter filter = new NumberFilter(20, 12345L);

        System.out.println("Prime numbers:");
        System.out.println(filter.getAllPrimeNumbers());

        System.out.println("\nDivisible by 3 but not 5:");
        System.out.println(filter.getDivisibleBy3ButNot5());

        System.out.println("\nRemaining numbers sorted descending:");
        System.out.println(filter.getSortedRemainingNumbers());

        System.out.println("\nAverage of remaining numbers:");
        System.out.println(filter.computeAverageOfRemainingNumbers());
    }
}

Build and Run
From the NumberFilter directory:

javac -d build NumberFilter.java Main.java
java -cp build Main

The seed makes the generated sequence reproducible, so using the same
count and seed produces the same numbers.

How It Works
Random Number Generation
The constructor generates the requested number of integers:

new NumberFilter(20, 12345L);

The expression:

random.nextInt(2001) - 1000

produces values from -1000 through 1000.

Prime Numbers
getAllPrimeNumbers() checks every generated number and keeps only
prime numbers.

Numbers below 2 are not prime.

Divisible by 3 but Not 5
getDivisibleBy3ButNot5() keeps numbers satisfying:

number % 3 == 0 && number % 5 != 0

For example:

9 is included.
15 is excluded because it is also divisible by 5.
10 is excluded because it is not divisible by 3.
Remaining Numbers
getSortedRemainingNumbers() keeps numbers that are:

number % 3 != 0 && number % 5 != 0

The resulting list is then sorted in descending order using a manually
implemented bubble sort.

Average
computeAverageOfRemainingNumbers() calculates the average of the same
numbers returned by getSortedRemainingNumbers().

If the list is empty, the method returns:

0

Key Concepts
ArrayList
List
Random
Random seeds
Prime-number detection
Modulo operator
Filtering
Bubble sort
Average calculation
Private helper methods
Useful Links
Java List
Java ArrayList
Java Random