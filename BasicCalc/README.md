# Basic Calculator

## Description

This exercise implements a `BasicCalc` class that performs basic arithmetic operations based on a supplied operator.

## Requirements

The `doOperation` method accepts:

- An integer `a`
- A character `op` representing the arithmetic operation
- An integer `b`

Supported operators:

- `+` addition
- `-` subtraction
- `/` division
- `*` multiplication
- `%` modulo

The method returns `0` when:

- The operator is invalid.
- Division by zero is attempted.
- Modulo by zero is attempted.

## Examples

```java
BasicCalc calculator = new BasicCalc();

System.out.println(calculator.doOperation(10, '+', 5));
System.out.println(calculator.doOperation(10, '-', 5));
System.out.println(calculator.doOperation(10, '*', 5));
System.out.println(calculator.doOperation(10, '/', 2));
System.out.println(calculator.doOperation(10, '%', 3));
System.out.println(calculator.doOperation(10, '/', 0));

Output:

15
5
50
5
1
0

Key Concepts
switch statements
case
default
Arithmetic operators
Character comparison
Division by zero
Modulo operator
Build and Run
Create a Main.java file:

import sprint.BasicCalc;

public class Main {

    public static void main(String[] args) {
        BasicCalc calculator = new BasicCalc();

        System.out.println(calculator.doOperation(10, '+', 5));
        System.out.println(calculator.doOperation(10, '-', 5));
        System.out.println(calculator.doOperation(10, '*', 5));
        System.out.println(calculator.doOperation(10, '/', 2));
        System.out.println(calculator.doOperation(10, '%', 3));
        System.out.println(calculator.doOperation(10, '/', 0));
    }
}

Compile and run:

javac -d build Main.java
java -cp ./build Main

Expected output:

15
5
50
5
1
0