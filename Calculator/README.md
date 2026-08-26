# Calculator

## Two Plus Two

A simple Java exercise that introduces basic methods and integer arithmetic.

## Requirements

Implement a `Calculator` class with an `add` method that:

- Takes two integers as parameters.
- Returns the sum of the two integers.
- Uses an `int` return type.

For example:

```java
Calculator calculator = new Calculator();

System.out.println(calculator.add(2, 2));

Output:

4

Implementation
The add method adds the two supplied integers and returns the result.

public int add(int a, int b) {
    return a + b;
}

Build and Run
Example Main.java:

import sprint.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 2));
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Expected output:

4

Concepts Practiced
Java classes
Methods
Method parameters
Return types
Integer arithmetic
The + operator
