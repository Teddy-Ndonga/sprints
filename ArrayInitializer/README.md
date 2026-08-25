Array Initializer

A small Java exercise for practicing arrays, loops, and basic input validation.

Functional Requirements

Implement a class ArrayInitializer with a method fillArray that takes an integer parameter max.

The method should:

Create an integer array of size max.
Fill the array with values from 1 to max.
Return the populated array.
Return an empty array if max is less than 1.
Implementation
ArrayInitializer.java
package ArrayInitializer;

public class ArrayInitializer {

    public int[] fillArray(int max) {
        // Return an empty array if the size is < 1
        if (max < 1) {
            return new int[0];
        }

        // Create an array with the requested size
        int[] numbers = new int[max];

        // Fill the array with values from 1 to max
        for (int i = 0; i < max; i++) {
            numbers[i] = i + 1;
        }

        return numbers;
    }
}

Usage

The following Main.java can be used to test the ArrayInitializer class.

Main.java
import sprint.ArrayInitializer;

public class Main {

    public static void main(String[] args) {
        ArrayInitializer initializer = new ArrayInitializer();

        int[] result = initializer.fillArray(5);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

Build and Run

From the directory containing Main.java and the sprint package:

Compile
javac -d build Main.java ArrayInitializer.java

Run
java -cp ./build Main

Expected Output
1 2 3 4 5

How It Works

The method first checks whether max is less than 1.

if (max < 1) {
    return new int[0];
}


If it is, an empty integer array is returned.

For a valid value of max, an array with max elements is created:

int[] numbers = new int[max];


The for loop then fills the array:

for (int i = 0; i < max; i++) {
    numbers[i] = i + 1;
}


The array index starts at 0, while the required values start at 1. Therefore, i + 1 is used to produce the values 1 through max.

Helpful Tips
Array Indexing

Array indices start from 0.

For example, an array containing five elements has these indices:

Index:  0  1  2  3  4
Value:  1  2  3  4  5


The first element is at index 0, not index 1.

Trying to access an index outside the array's bounds results in an ArrayIndexOutOfBoundsException.

Fixed Size

Once an array is created with a specific size, its size cannot be changed.

For example:

int[] numbers = new int[5];


creates an array that will always contain five elements.

Useful Links
Arrays in Java
Arrays in the Java Language Specification