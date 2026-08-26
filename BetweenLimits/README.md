# Between Limits

## Description

This exercise implements a `BetweenLimits` class that returns all characters between two supplied characters in ascending order.

The method works regardless of which character is supplied first.

## Requirements

The `findRange` method:

- Accepts two `char` parameters.
- Finds the lower and upper character values.
- Returns all characters strictly between them.
- Returns the characters in ascending order.
- Uses a `for` loop to iterate through the range.

## Examples

```java
BetweenLimits range = new BetweenLimits();

System.out.println(range.findRange('f', 'j'));
System.out.println(range.findRange('j', 'f'));

Output:

ghi
ghi

Key Concepts
char values
Character arithmetic
Math.min()
Math.max()
StringBuilder
for loops
Explicit casting from int to char
Characters can be treated as numeric values during arithmetic operations. This makes it possible to iterate through the characters between two limits.

Build and Run
Create a Main.java file:

import sprint.BetweenLimits;

public class Main {

    public static void main(String[] args) {
        BetweenLimits range = new BetweenLimits();

        System.out.println(range.findRange('f', 'j'));
        System.out.println(range.findRange('j', 'f'));
    }
}

Compile and run:

javac -d build Main.java
java -cp ./build Main

Expected output:

ghi
ghi