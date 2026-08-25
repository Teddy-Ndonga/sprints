Array Adder

A Java exercise for practicing arrays, array lengths, loops, static methods, and combining arrays.

Functional Requirements

Implement a static method concatArrays for the ArrayAdder class.

The method takes two integer arrays, arr1 and arr2, as parameters.

It should:

Create a new array containing the elements of both arrays.
Add the elements of arr2 after the elements of arr1.
Return the new combined array.
Leave the original arrays unchanged.
Implementation
ArrayAdder.java
package sprint;

public class ArrayAdder {

    public static int[] concatArrays(int[] arr1, int[] arr2) {

        // Create a new array large enough for both arrays
        int[] result = new int[arr1.length + arr2.length];

        // Copy elements from the first array
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        // Return the combined array
        return result;
    }
}

Usage

The following Main.java can be used to test the ArrayAdder class.

Main.java
import sprint.ArrayAdder;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result = ArrayAdder.concatArrays(arr1, arr2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

Build and Run

From the directory containing Main.java and the sprint package:

Compile
javac -d build Main.java ArrayAdder.java

Run
java -cp ./build Main

Expected Output
1 2 3 4 5 6

How It Works

The method first creates a new array large enough to contain both input arrays:

int[] result = new int[arr1.length + arr2.length];


If arr1 contains three elements and arr2 contains three elements, the new array will have six elements.

The first loop copies the elements from arr1 into the beginning of the new array:

for (int i = 0; i < arr1.length; i++) {
    result[i] = arr1[i];
}


The second loop copies the elements from arr2 immediately after the elements from arr1:

for (int i = 0; i < arr2.length; i++) {
    result[arr1.length + i] = arr2[i];
}


For example:

arr1:   1  2  3
arr2:   4  5  6

result: 1  2  3  4  5  6


A new array is returned, so the original arrays are not modified.

Helpful Tips
Array Lengths

The length of an array can be accessed using .length:

arr1.length


For example:

int[] numbers = {1, 2, 3};

System.out.println(numbers.length);


produces:

3

static Methods

The concatArrays method is declared as static:

public static int[] concatArrays(...)


A static method can be called directly using the class name without creating an instance:

ArrayAdder.concatArrays(arr1, arr2);


You do not need to write:

ArrayAdder adder = new ArrayAdder();

Useful Links
Java Arrays
The static Keyword