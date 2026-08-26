# Digit Digger

## Description

The `DigitSum` exercise implements a method that calculates the sum of all digits in an integer.

The `sumOfDigits` method accepts an integer and returns the sum of its digits.

## Requirements

- Calculate the sum of every digit in the number.
- Handle positive numbers.
- Handle negative numbers by using their absolute value.
- Return `0` when the input is `0`.

## Examples

```java
System.out.println(DigitSum.sumOfDigits(1234));
System.out.println(DigitSum.sumOfDigits(38659));
System.out.println(DigitSum.sumOfDigits(-1234));

Output:

10
31
10

How It Works
The last digit can be extracted using the modulo operator:

number % 10

The last digit can then be removed using integer division:

number /= 10;

The process continues until the number becomes 0.

For example, 1234 is processed as:

1234 % 10 = 4
123 % 10  = 3
12 % 10   = 2
1 % 10    = 1

4 + 3 + 2 + 1 = 10

Key Concepts
while loops
Modulo operator %
Integer division
Math.abs()
Digit extraction
Accumulation
Build and Run
From the project root:

javac -d build Main.java
java -cp ./build Main

