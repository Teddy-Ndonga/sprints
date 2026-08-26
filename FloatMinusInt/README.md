# FloatMinusInt

## What's Your Type?

A Java exercise focused on primitive types, implicit casting, and explicit casting.

## Requirements

Implement a `FloatMinusInt` class with two methods:

### `subtractIntFromDoubleAndReturnDouble`

This method:

- Takes a `double` and an `int`.
- Subtracts the integer from the double.
- Returns the result as a `double`.
- Uses Java's implicit numeric conversion.

Example:

```java
FloatMinusInt calculator = new FloatMinusInt();

calculator.subtractIntFromDoubleAndReturnDouble(5.7, 2);

Result:

3.7

subtractIntFromDoubleAndReturnInt
This method:

Takes a double and an int.
Explicitly casts the double to an int.
Subtracts the integer from the cast value.
Returns the result as an int.
Example:

calculator.subtractIntFromDoubleAndReturnInt(8.9, 3);

Result:

5

Implementation
public double subtractIntFromDoubleAndReturnDouble(double floating, int integer) {
    return floating - integer;
}

public int subtractIntFromDoubleAndReturnInt(double floating, int integer) {
    return (int) floating - integer;
}

The first method relies on implicit casting because Java automatically promotes the int to a double during the subtraction.

The second method uses explicit casting with (int) before performing the subtraction.

Build and Run
Example Main.java:

import sprint.FloatMinusInt;

public class Main {

    public static void main(String[] args) {
        FloatMinusInt calculator = new FloatMinusInt();

        System.out.println(
            calculator.subtractIntFromDoubleAndReturnDouble(5.7, 2)
        );

        System.out.println(
            calculator.subtractIntFromDoubleAndReturnInt(8.9, 3)
        );
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Expected output:

3.7
5

Concepts Practiced
Primitive data types
double
int
Arithmetic operators
Implicit casting
Explicit casting
Type conversion in Java
