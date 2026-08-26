# Power Play

## Description

The `PowerCalculator` exercise implements a method that calculates the result of raising a base to an exponent.

The `calculatePower` method accepts:

- An integer `base`
- An integer `exponent`

It returns the calculated power as an `int`.

## Requirements

- Return `1` when the exponent is `0`.
- Calculate positive exponents using repeated multiplication.
- Handle negative exponents according to the exercise requirements.
- Return `0` for unsupported negative exponent cases.

## Example

```java
PowerCalculator calculator = new PowerCalculator();

System.out.println(calculator.calculatePower(2, 3));
System.out.println(calculator.calculatePower(5, 3));

Output:

8
125

Key Concepts
for loops
Integer arithmetic
Conditional statements
Exponentiation
Handling edge cases
Build and Run
From the project root:

javac -d build Main.java
java -cp ./build Main