Array Sorter

A Java exercise for practicing arrays, loops, comparisons, swapping, and implementing a sorting algorithm manually.

Functional Requirements

Implement a class ArraySorter with a method sortArray that takes a double array arr.

The method should:

Sort the array in ascending order.
Perform the sorting in place without creating a new array.
Return the sorted array.
Implement the sorting logic manually.
Not use built-in Java sorting methods such as Arrays.sort().
Implementation
ArraySorter.java
package sprint;

public class ArraySorter {

    public double[] sortArray(double[] arr) {

        // Compare each element with the remaining elements
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current element is the smallest
            int minIndex = i;

            // Find the smallest value in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the current element with the smallest value found
            double temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Return the sorted array
        return arr;
    }
}

Usage

The following Main.java can be used to test the ArraySorter class.

Main.java
import sprint.ArraySorter;

public class Main {

    public static void main(String[] args) {
        ArraySorter sorter = new ArraySorter();

        double[] unsorted = {5.5, 2.2, 8.8, 1.1, 3.3};

        double[] sorted = sorter.sortArray(unsorted);

        for (double num : sorted) {
            System.out.print(num + " ");
        }
    }
}

Build and Run

From the directory containing Main.java and the sprint package:

Compile
javac -d build Main.java ArraySorter.java

Run
java -cp ./build Main

Expected Output
1.1 2.2 3.3 5.5 8.8

How It Works

The implementation uses a sorting technique based on selection sort.

For each position in the array, the algorithm searches the remaining unsorted portion for the smallest value.

For example:

5.5  2.2  8.8  1.1  3.3


The smallest value is 1.1, so it is swapped with the first element:

1.1  2.2  8.8  5.5  3.3


The algorithm then moves to the next position and finds the smallest value in the remaining portion.

This continues until the entire array is sorted.

In-Place Sorting

The requirement specifies that no new array should be created.

The implementation therefore modifies the original array directly by swapping elements.

The swap uses a temporary variable:

double temp = arr[i];
arr[i] = arr[minIndex];
arr[minIndex] = temp;


The temporary variable prevents the original value of arr[i] from being lost during the swap.

Built-in Sorting Methods

Java provides built-in sorting methods such as:

Arrays.sort(arr);


However, Arrays.sort() is not used in this exercise because the purpose is to practice implementing the sorting logic manually.

Helpful Tips
Comparing Elements

Array elements can be compared directly:

if (arr[j] < arr[minIndex]) {
    minIndex = j;
}

Swapping Elements

When swapping two values, use a temporary variable to preserve one of the values before replacing it.

Array Indexing

Array indices start at 0.

For example:

Index:  0    1    2    3    4
Value:  5.5  2.2  8.8  1.1  3.3

Useful Links
Basic Sorting Algorithms
Java Arrays