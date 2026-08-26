# Area Calculator

## Functional Requirements

Implement overloaded methods in a class called `AreaCalculator` to calculate
the area of a square, rectangle, and circle using method overloading.

Each method should:

- Return a `double` representing the calculated area.
- Round the result to 2 decimal places.
- Use method overloading with different parameter lists.

For the circle calculation:

- The calculation should only proceed when the boolean parameter is `true`.
- If the boolean parameter is `false`, the method should return `NaN`.

## Implementation

```java
package sprint;

public class AreaCalculator {

    // Square
    public static double calculateArea(double side) {
        return Math.round(side * side * 100.0) / 100.0;
    }

    // Rectangle
    public static double calculateArea(double length, double width) {
        return Math.round(length * width * 100.0) / 100.0;
    }

    // Circle
    public static double calculateArea(double radius, boolean calculate) {
        if (!calculate) {
            return Double.NaN;
        }

        double area = Math.PI * radius * radius;
        return Math.round(area * 100.0) / 100.0;
    }
}

Usage
Create a Main.java file in the sprints directory:

import sprint.AreaCalculator;

public class Main {

    public static void main(String[] args) {
        double squareArea = AreaCalculator.calculateArea(5);
        System.out.println("Area of square: " + squareArea);

        double rectangleArea = AreaCalculator.calculateArea(5, 10);
        System.out.println("Area of rectangle: " + rectangleArea);

        double circleArea = AreaCalculator.calculateArea(7, true);
        System.out.println("Area of circle: " + circleArea);

        double invalidCircleArea = AreaCalculator.calculateArea(7, false);
        System.out.println("Area of circle boolean=false: " + invalidCircleArea);
    }
}

Build and Run
From the sprints directory:

javac -d build Main.java AreaCalculator/AreaCalculator.java

Then:

java -cp build Main

Expected output:

Area of square: 25.0
Area of rectangle: 50.0
Area of circle: 153.94
Area of circle boolean=false: NaN

Key Concepts
Method Overloading
Method overloading allows multiple methods to have the same name as long
as their parameter lists are different.

In this exercise:

calculateArea(double side)
calculateArea(double length, double width)
calculateArea(double radius, boolean calculate)

The return type alone cannot be used to overload a method.

Rounding
The results are rounded to two decimal places using:

Math.round(value * 100.0) / 100.0

Double.NaN
Double.NaN represents "Not a Number" and is returned when the circle
calculation is disabled.

Helpful Tips
Method overloading is based on different parameter lists, not return types.
Math.round() can be combined with multiplication and division to round
values to two decimal places.
The static methods can be called directly using the class name.
Useful Links
Defining Methods
Method Overloading
Math.round()