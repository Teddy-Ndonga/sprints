# AverageCalculator

## Average Calculator

A Java exercise that calculates the average of three floating-point numbers.

## Requirements

Implement an `AverageCalculator` class with a `calculateAverage` method that:

- Accepts three `float` parameters.
- Calculates the average of the three numbers.
- Returns the result as a `float`.

Example:

```java
AverageCalculator calculator = new AverageCalculator();

System.out.println(
    calculator.calculateAverage(4.0f, 5.0f, 6.0f)
);

Expected output:

5.0

Implementation
public float calculateAverage(float num1, float num2, float num3) {
    return (num1 + num2 + num3) / 3;
}

Because the parameters are float values, the calculation produces a floating-point result.

Build and Run
Example Main.java:

import sprint.AverageCalculator;

public class Main {

    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();

        float average = calculator.calculateAverage(
            4.0f,
            5.0f,
            6.0f
        );

        System.out.println(average);
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Expected output:

5.0

Concepts Practiced
Java classes
Methods
Method parameters
float primitive type
Floating-point arithmetic
Division
Average calculations
Floating-point precision