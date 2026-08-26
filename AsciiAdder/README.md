# Ascii Adder

## Characters Are Numbers?

Implement an `AsciiAdder` class that performs arithmetic on a character's numeric value.

## Requirements

The `addAscii` method should:

- Accept a `char` and an `int` as parameters.
- Add the integer value to the character's numeric value.
- Return the resulting character.
- Support both positive and negative integer values.
- Use explicit casting to convert the arithmetic result back to `char`.

## Example

```java
AsciiAdder.addAscii('z', 1);

The result is:

{

Key Concepts
char arithmetic
Explicit casting
Character encoding
ASCII and Unicode
Build and Run
Example Main.java:

import sprint.AsciiAdder;

public class Main {

    public static void main(String[] args) {
        AsciiAdder adder = new AsciiAdder();

        System.out.println(adder.addAscii('a', 1));
        System.out.println(adder.addAscii('z', 1));
        System.out.println(adder.addAscii('d', -1));
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Useful Links
Character encoding
Unicode
ASCII