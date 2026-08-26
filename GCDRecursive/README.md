# Recursive GCD

Implement a recursive method that calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.

## Requirements

The `GCDRecursive` class provides a `gcd` method that:

- Accepts two integer values.
- Returns their greatest common divisor.
- Uses the Euclidean algorithm.
- Uses recursion to solve the problem.
- Does not use `for`, `while`, or `do-while` loops.
- Handles negative input values.
- Returns the absolute value of the other number when one number is zero.
- Returns `0` when both numbers are zero.

## Implementation

```java
package sprint;

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

Usage
Create a Main.java file:

import sprint.GCDRecursive;

public class Main {

    public static void main(String[] args) {
        GCDRecursive calculator = new GCDRecursive();

        System.out.println(calculator.gcd(48, 18));
        System.out.println(calculator.gcd(100, 75));
    }
}

Build and Run
From the GCDRecursive directory:

javac -d build Main.java
java -cp ./build Main

Output:

6
25

How It Works
The Euclidean algorithm repeatedly replaces the two numbers with:

gcd(a, b) = gcd(b, a % b)

The recursion stops when b becomes 0.

For example:

gcd(48, 18)
→ gcd(18, 12)
→ gcd(12, 6)
→ gcd(6, 0)
→ 6

The result is 6.

Edge Cases
gcd(48, 18)   → 6
gcd(100, 75)  → 25
gcd(-48, 18)  → 6
gcd(48, -18)  → 6
gcd(0, 10)    → 10
gcd(10, 0)    → 10
gcd(0, 0)     → 0

Key Concepts
Recursion
Euclidean algorithm
Greatest common divisor
Modulo operator
Base cases
Handling negative values
Useful Links
Recursion in Java
Euclidean Algorithm