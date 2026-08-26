# Basic FizzBuzz

## Description

This exercise implements a `BasicFizzBuzz` class that returns different strings depending on whether a number is divisible by 3, 5, or both.

## Requirements

The `fizzBuzz` method:

- Returns `"Fizz"` when the number is divisible by 3 only.
- Returns `"Buzz"` when the number is divisible by 5 only.
- Returns `"FizzBuzz"` when the number is divisible by both 3 and 5.
- Returns the number itself as a `String` when neither condition applies.

## Examples

```java
BasicFizzBuzz fizzBuzz = new BasicFizzBuzz();

System.out.println(fizzBuzz.fizzBuzz(3));
System.out.println(fizzBuzz.fizzBuzz(5));
System.out.println(fizzBuzz.fizzBuzz(15));
System.out.println(fizzBuzz.fizzBuzz(7));

Output:

Fizz
Buzz
FizzBuzz
7

Key Concepts
if / else if / else
Modulus operator %
Multiple conditions
Logical && operator
Converting an integer to a string
Condition ordering
The check for divisibility by both 3 and 5 must happen before checking the individual conditions.

Build and Run
Create a Main.java file:

import sprint.BasicFizzBuzz;

public class Main {

    public static void main(String[] args) {
        BasicFizzBuzz fizzBuzz = new BasicFizzBuzz();

        System.out.println(fizzBuzz.fizzBuzz(3));
        System.out.println(fizzBuzz.fizzBuzz(5));
        System.out.println(fizzBuzz.fizzBuzz(15));
        System.out.println(fizzBuzz.fizzBuzz(7));
    }
}

Compile and run:

javac -d build Main.java
java -cp ./build Main

Expected output:

Fizz
Buzz
FizzBuzz
7