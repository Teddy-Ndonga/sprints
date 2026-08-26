# Factorial Calculation

Implement a recursive method that calculates the factorial of a given integer.

## Requirements

The `Factorial` class provides a `calculateFactorial` method that:

- Returns the factorial of `n`.
- Returns `0` when `n` is negative.
- Returns `1` when `n` is `0` or `1`.
- Uses recursion to calculate the factorial.
- Does not use `for`, `while`, or `do-while` loops.

## Implementation

```java
package sprint;

public class Factorial {

    public int calculateFactorial(int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }
}

Usage
Create a Main.java file:

import sprint.Factorial;

public class Main {

    public static void main(String[] args) {
        Factorial calculator = new Factorial();

        System.out.println(calculator.calculateFactorial(5));
        System.out.println(calculator.calculateFactorial(-3));
    }
}

Build and Run
From the Factorial directory:

javac -d build Main.java
java -cp ./build Main

Output:

120
0

How It Works
The factorial of a positive integer is calculated recursively:

5! = 5 × 4 × 3 × 2 × 1

The method repeatedly calls itself with n - 1 until it reaches the base case.

For example:

calculateFactorial(5)
5 × calculateFactorial(4)
5 × 4 × calculateFactorial(3)
5 × 4 × 3 × calculateFactorial(2)
5 × 4 × 3 × 2 × calculateFactorial(1)
5 × 4 × 3 × 2 × 1
= 120

Edge Cases
calculateFactorial(0) → 1
calculateFactorial(1) → 1
calculateFactorial(-3) → 0
Key Concepts
Recursion
Base cases
Recursive cases
Method calls
Integer arithmetic
Useful Links
Factorial
Recursion