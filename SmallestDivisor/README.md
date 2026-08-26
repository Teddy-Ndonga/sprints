# Divisor Discovery

## Description

The `SmallestDivisor` exercise implements a method that finds the smallest divisor of a number greater than 1.

The `smallestDivisor` method accepts an integer and returns its smallest divisor.

## Requirements

- Return the smallest divisor of the given number.
- Numbers less than or equal to `1` return `1`.
- Check `2` separately.
- Check odd divisors up to the square root of the number.
- Return the number itself when it is prime.

## Examples

```java
SmallestDivisor calculator = new SmallestDivisor();

System.out.println(calculator.smallestDivisor(15));
System.out.println(calculator.smallestDivisor(49));

Output:

3
7

How It Works
For 15:

15 % 2 != 0
15 % 3 == 0

Therefore, the smallest divisor is 3.

For 49:

49 % 2 != 0
49 % 3 != 0
49 % 5 != 0
49 % 7 == 0

Therefore, the smallest divisor is 7.

If no divisor is found before reaching the square root, the number is prime and the number itself is returned.

Key Concepts
Divisibility
Prime numbers
for loops
Modulo operator %
Math.sqrt()
Efficient divisor searching
Build and Run
From the project root:

javac -d build Main.java
java -cp ./build Main