# Prime Finder

## Description

The `PrimeChecker` exercise implements a method that determines whether an integer is a prime number.

The `isPrime` method returns `true` when the number is prime and `false` otherwise.

## Requirements

- Numbers less than or equal to `1` are not prime.
- `2` is treated as the only even prime number.
- Other even numbers are not prime.
- Check possible odd divisors up to the square root of the number.
- Return `true` when no divisor is found.

## Examples

```java
System.out.println(PrimeChecker.isPrime(7));
System.out.println(PrimeChecker.isPrime(10));

Output:

true
false

How It Works
A prime number is greater than 1 and has no divisors other than 1 and itself.

Instead of checking every number up to the input, the implementation only checks possible divisors up to the square root.

For example, when checking 49:

√49 = 7

The method checks:

3
5
7

Since 49 % 7 == 0, the number is not prime.

For a prime such as 7, no divisor is found, so the method returns true.

Key Concepts
Prime numbers
for loops
Modulo operator %
Math.sqrt()
Conditional statements
Algorithm optimization
Build and Run
From the project root:

javac -d build Main.java
java -cp ./build Main