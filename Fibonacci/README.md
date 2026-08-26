# Fibonacci Calculation

Implement a recursive method that calculates the Fibonacci number at a given index.

## Requirements

The `Fibonacci` class provides a `calculateFibonacci` method that:

- Returns the Fibonacci number at index `n`.
- Returns `-1` when `n` is negative.
- Returns `0` for index `0`.
- Returns `1` for index `1`.
- Uses recursion to calculate the Fibonacci number.
- Does not use `for`, `while`, or `do-while` loops.

## Implementation

```java
package sprint;

public class Fibonacci {

    public int calculateFibonacci(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return n;
        }

        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}

Usage
Create a Main.java file:

import sprint.Fibonacci;

public class Main {

    public static void main(String[] args) {
        Fibonacci calculator = new Fibonacci();

        System.out.println(calculator.calculateFibonacci(6));
        System.out.println(calculator.calculateFibonacci(-3));
    }
}

Build and Run
From the Fibonacci directory:

javac -d build Main.java
java -cp ./build Main

Output:

8
-1

How It Works
The Fibonacci sequence starts with:

0, 1, 1, 2, 3, 5, 8, 13, ...

Each number after the first two is calculated by adding the two preceding numbers:

F(n) = F(n - 1) + F(n - 2)

For example:

F(6)
= F(5) + F(4)
= 5 + 3
= 8

The recursion stops at the base cases:

F(0) = 0
F(1) = 1

Edge Cases
calculateFibonacci(0) → 0
calculateFibonacci(1) → 1
calculateFibonacci(6) → 8
calculateFibonacci(-3) → -1
Key Concepts
Recursion
Base cases
Recursive cases
Method calls
Fibonacci sequence
Useful Links
Fibonacci
Recursion