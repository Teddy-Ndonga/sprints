# Number Printer

## Description

This exercise implements a `NumberPrinter` class with a `printNums` method that prints a sequence of numbers from `0` through the supplied integer.

If the supplied integer is negative, the method prints an error message instead.

## Requirements

The `printNums` method:

- Accepts an integer.
- Prints numbers from `0` up to and including the supplied integer.
- Prints each number on a new line.
- Prints `Negative numbers are not allowed` when the input is negative.
- Returns no value, so the method uses `void`.

## Examples

```java
NumberPrinter printer = new NumberPrinter();

printer.printNums(5);

Output:

0
1
2
3
4
5

For a negative number:

printer.printNums(-3);

Output:

Negative numbers are not allowed

Key Concepts
void methods
if / else
for loops
Integer comparisons
System.out.println()
Build and Run
Create a Main.java file:

import sprint.NumberPrinter;

public class Main {

    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        printer.printNums(5);
        printer.printNums(-3);
    }
}

Compile and run:

javac -d build Main.java
java -cp ./build Main

Expected output:

0
1
2
3
4
5
Negative numbers are not allowed