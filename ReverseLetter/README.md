# Reverse Letter

## Functional Requirements

Implement a `ReverseLetter` class with a `reverseLetter` method that:

- Takes a single `char` representing a lowercase letter from `a` to `z`.
- Returns the corresponding reverse letter in the alphabet.
- Uses character arithmetic to determine the reversed letter.

## Examples

```java
reverseLetter('a');

Returns:

z

reverseLetter('b');

Returns:

y

reverseLetter('c');

Returns:

x

How It Works
The method calculates how far the input character is from a, then subtracts that distance from z.

For example:

a → z
b → y
c → x

The expression:

'z' - (c - 'a')

performs the required character arithmetic, and the result is explicitly cast back to char.

Build and Run
Example Main.java:

import sprint.ReverseLetter;

public class Main {

    public static void main(String[] args) {
        System.out.println(ReverseLetter.reverseLetter('a'));
        System.out.println(ReverseLetter.reverseLetter('b'));
        System.out.println(ReverseLetter.reverseLetter('c'));
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Expected output:

z
y
x

Key Concepts
Character arithmetic
char values
Explicit casting
Alphabet positions