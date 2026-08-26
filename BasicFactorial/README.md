# Basic Factorial

## Description

`BasicFactorial` calculates the factorial of a non-negative integer using a `for` loop.

A factorial is the product of all positive integers from `1` up to the given number.

For example:

```text
5! = 5 × 4 × 3 × 2 × 1 = 120

Requirements
Implement a BasicFactorial class with a calculateBasicFactorial method that:

Takes an integer n as input.
Returns the factorial of n.
Returns 1 when n is 0.
Returns 1 when n is 1.
Returns 0 when n is negative.
Examples
BasicFactorial calculator = new BasicFactorial();

calculator.calculateBasicFactorial(0);
// 1

calculator.calculateBasicFactorial(1);
// 1

calculator.calculateBasicFactorial(5);
// 120

calculator.calculateBasicFactorial(-3);
// 0

How It Works
The method first checks whether the input is negative.

For valid input, the result starts at 1. A for loop then multiplies the result by each number from 2 through n.

The loop does not need to run for 0 or 1, leaving the result as 1.

The shorthand multiplication assignment operator is used:

result *= i;

Key Concepts
Factorials
for loops
if statements
Multiplication assignment *=
Base cases
Handling invalid input
Useful Links
Factorial explanation