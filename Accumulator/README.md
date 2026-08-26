# Accumulator

## Description

This exercise implements an `Accumulator` class that calculates the sum of all integers from `0` through a supplied integer.

If the supplied integer is negative, the method returns `0`.

## Requirements

The `accumulate` method:

- Accepts an integer `n`.
- Adds all numbers from `0` to `n`, including `n`.
- Returns the calculated sum.
- Returns `0` when `n` is negative.
- Uses a `for` loop to calculate the sum.

## Examples

```java
Accumulator accumulator = new Accumulator();

System.out.println(accumulator.accumulate(4));
System.out.println(accumulator.accumulate(-3));

Output:

10
0

Key Concepts
for loops
Accumulating values
Integer arithmetic
Conditional statements
Edge-case handling
Build and Run
Create a Main.java file:

import sprint.Accumulator;

public class Main {

    public static void main(String[] args) {
        Accumulator accumulator = new Accumulator();

        System.out.println(accumulator.accumulate(4));
        System.out.println(accumulator.accumulate(-3));
    }
}

Compile and run:

javac -d build Main.java
java -cp ./build Main

Expected output:

10
0

