# GCD

## Description

`GCDCalculator` calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.

The result is always returned as a non-negative integer.

## Requirements

Implement a `GCDCalculator` class with a `gcd` method that:

- Takes two integers as input.
- Returns their greatest common divisor.
- Handles negative input values.
- Uses the Euclidean algorithm.

## Examples

```java
GCDCalculator calculator = new GCDCalculator();

calculator.gcd(100, 10);
// 10

calculator.gcd(48, 18);
// 6

How It Works
The Euclidean algorithm repeatedly replaces the two numbers with:

a = b
b = a % b

The process continues until the remainder becomes 0. At that point, a contains the greatest common divisor.

Negative inputs are converted to their absolute values before the calculation.

Key Concepts
Greatest Common Divisor
Euclidean algorithm
Modulus operator %
while loops
Math.abs()
Integer arithmetic
Useful Links
Euclidean algorithm