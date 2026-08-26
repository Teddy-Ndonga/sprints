# Give Me Three

This sprint implements a simple Java class with a method that returns the integer value `3`.

## Requirements

The `GiveMeThree` class provides a `returnThree` method that:

- Has an `int` return type.
- Returns the integer value `3`.

## Implementation

```java
package sprint;

public class GiveMeThree {

    public int returnThree() {
        return 3;
    }
}

Usage
Create a Main.java file:

import sprint.GiveMeThree;

public class Main {

    public static void main(String[] args) {
        GiveMeThree giveMeThree = new GiveMeThree();
        System.out.println(giveMeThree.returnThree());
    }
}

Build and Run
From the GiveMeThree directory:

javac -d build GiveMeThree.java Main.java
java -cp build Main

Expected output:

3

Key Concepts
Classes
Objects
Methods
Return types
int
The new keyword
Method invocation
Helpful Notes
A method's return type must match the type of value it returns.

For example:

public int returnThree() {
    return 3;
}

The method declares that it returns an int, and 3 is an integer value.

A method that does not return a value would instead use void:

public void doSomething() {
    // no return value
}