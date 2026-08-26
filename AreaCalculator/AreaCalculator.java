package AreaCalculator;

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