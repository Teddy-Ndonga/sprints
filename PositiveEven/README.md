# Positive Even

## Description

This exercise implements a `PositiveEven` class with a method that determines whether an integer is both positive and even.

## Requirements

The `isPositiveAndEven` method:

- Returns `true` when the number is positive and even.
- Returns `false` otherwise.
- Uses logical and arithmetic operators to perform the checks.

## Examples

```java
PositiveEven checker = new PositiveEven();

System.out.println(checker.isPositiveAndEven(2));
System.out.println(checker.isPositiveAndEven(5));

Output:

true
false

Key Concepts
if statements
Logical AND operator &&
Modulus operator %
Positive numbers
Even numbers
Boolean return values
Build and Run
Create a Main.java file:

import sprint.PositiveEven;

public class Main {

    public static void main(String[] args) {
        PositiveEven checker = new PositiveEven();

        System.out.println(checker.isPositiveAndEven(2));
        System.out.println(checker.isPositiveAndEven(5));
    }
}

Compile and run:

javac -d build Main.java
java -cp ./build Main

Expected output:

true
false