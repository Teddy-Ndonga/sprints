# Number Comparator

## Description

This exercise implements a `NumberComparator` class that compares an integer with a floating-point number and identifies which value is greater.

## Requirements

The `whichIsGreater` method:

- Returns `"Integer"` if the integer is larger.
- Returns `"Float"` if the float is larger.
- Returns `"Same"` if both values are equal.

## Examples

```java
NumberComparator comparator = new NumberComparator();

System.out.println(comparator.whichIsGreater(2, 3.0));
System.out.println(comparator.whichIsGreater(5, 4.9999999));
System.out.println(comparator.whichIsGreater(5, 5.0));

Output:

Float
Integer
Same

Key Concepts
if statements
else if
else
Comparing int and double values
Type promotion
String return values
Java automatically promotes the integer when comparing it with the double, allowing the two values to be compared directly.

Build and Run
Create a Main.java file:

import sprint.NumberComparator;

public class Main {

    public static void main(String[] args) {
        NumberComparator comparator = new NumberComparator();

        System.out.println(comparator.whichIsGreater(2, 3.0));
        System.out.println(comparator.whichIsGreater(5, 4.9999999));
        System.out.println(comparator.whichIsGreater(5, 5.0));
    }
}

Compile and run:

javac -d build Main.java
java -cp ./build Main

Expected output:

Float
Integer
Same

