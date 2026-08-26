# Prime Finder

## Functional Requirements

Implement a `findPrimesUpTo` method that takes an integer `limit` as input
and returns a list containing all prime numbers up to that limit.

The method should:

- Start checking numbers from 2.
- Determine whether each number is prime.
- Add prime numbers to the result list.
- Return the list of prime numbers.
- Use a helper method to keep the prime-checking logic separate.

## Implementation

```java
package sprint;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

    public static List<Integer> findPrimesUpTo(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

Usage
Create a Main.java file in the sprints directory:

import sprint.PrimeFinder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int limit = 30;

        List<Integer> primes = PrimeFinder.findPrimesUpTo(limit);

        System.out.println(primes);
    }
}

Build and Run
From the sprints directory:

javac -d build Main.java PrimeFinder/PrimeFinder.java

Run the program:

java -cp build Main

Expected output:

[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]

How It Works
findPrimesUpTo() checks every number from 2 through the supplied
limit.

For each number, it calls the private isPrime() helper method.

if (isPrime(i)) {
    primes.add(i);
}

The helper method checks whether a number has any divisor other than
1 and itself.

for (int i = 2; i * i <= number; i++) {
    if (number % i == 0) {
        return false;
    }
}

Only divisors up to the square root of the number need to be checked.
If no divisor is found, the number is prime.

Encapsulation
The isPrime() method is declared private because it is an internal
implementation detail of PrimeFinder.

Users of the class only need to interact with:

PrimeFinder.findPrimesUpTo(limit);

They do not need direct access to the helper method.

Helpful Tips
Prime numbers are greater than or equal to 2.
A number is prime if it has no divisors other than 1 and itself.
Checking up to the square root of a number avoids unnecessary checks.
Private helper methods can keep complex logic separate from the public
interface.
Useful Links
Nesting of Methods
Encapsulation in Java