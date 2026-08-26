# MultiplyAndTell

## Multiply and Tell

A Java exercise that multiplies an integer by 2 and returns the result as part of a formatted string.

## Requirements

Implement a `MultiplyAndTell` class with a `printMult2Concat` method that:

- Takes an integer as an argument.
- Multiplies the integer by 2.
- Returns a string containing the multiplied value.
- Uses the format `"The result is "` followed by the result.

Example:

```java
MultiplyAndTell calculator = new MultiplyAndTell();

System.out.println(calculator.printMult2Concat(4));

Expected output:

The result is 8

Implementation
public String printMult2Concat(int number) {
    return "The result is " + number * 2;
}

The + operator is used to concatenate the string with the calculated integer.

Build and Run
Example Main.java:

import sprint.MultiplyAndTell;

public class Main {

    public static void main(String[] args) {
        MultiplyAndTell calculator = new MultiplyAndTell();

        System.out.println(calculator.printMult2Concat(4));
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Expected output:

The result is 8

Concepts Practiced
Java classes
Methods
Method parameters
Integer arithmetic
Multiplication
String concatenation
Return types
The + operator