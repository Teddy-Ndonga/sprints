# Array Filter

A Java exercise for practicing multidimensional arrays, nested loops, row traversal, and filtering based on calculated values.

## Functional Requirements

Implement a method `filterBySum` for the `ArrayFilter` class.

The method accepts:

- A two-dimensional integer array called `array`
- An integer called `value`

The method should:

- Calculate the sum of each row in the 2D array.
- Remove rows whose sum is lower than the given `value`.
- Keep rows whose sum is greater than or equal to `value`.
- Return the resulting 2D array.

## Implementation

### `ArrayFilter.java`

```java
package sprint;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilter {

    public int[][] filterBySum(int[][] array, int value) {

        List<int[]> filteredRows = new ArrayList<>();

        // Traverse each row
        for (int[] row : array) {

            int sum = 0;

            // Calculate row sum
            for (int number : row) {
                sum += number;
            }

            // Keep rows whose sum meets the requirement
            if (sum >= value) {
                filteredRows.add(row);
            }
        }

        // Convert List<int[]> back to int[][]
        int[][] result = new int[filteredRows.size()][];

        for (int i = 0; i < filteredRows.size(); i++) {
            result[i] = filteredRows.get(i);
        }

        return result;
    }
}

Usage
The following Main.java can be used to test the ArrayFilter class.

Main.java
import sprint.ArrayFilter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {1, 1, 1}
        };

        ArrayFilter arrayFilter = new ArrayFilter();

        int[][] filteredArray = arrayFilter.filterBySum(array, 10);

        for (int[] row : filteredArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}

Build and Run
From the directory containing Main.java and the sprint package:

Compile
javac -d build Main.java ArrayFilter.java

Run
java -cp ./build Main

Expected Output
[4, 5, 6]
[7, 8, 9]

How It Works
The method processes each row of the two-dimensional array individually.

Given:

[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
[1, 1, 1]

and a minimum value of 10, the method calculates the sum of each row.

Row	Sum	Keep?
[1, 2, 3]	6	No
[4, 5, 6]	15	Yes
[7, 8, 9]	24	Yes
[1, 1, 1]	3	No

Only rows whose sum is greater than or equal to 10 are retained:

[4, 5, 6]
[7, 8, 9]

Traversing a 2D Array
A two-dimensional array can be traversed using nested enhanced for loops.

The outer loop processes each row:

for (int[] row : array) {
    // process row
}

The inner loop processes each value within that row:

for (int number : row) {
    sum += number;
}

This allows the sum of every row to be calculated.

Filtering the Rows
Rows are added to the filtered collection only when their sum meets the required value:

if (sum >= value) {
    filteredRows.add(row);
}

The condition uses >=, meaning a row whose sum is exactly equal to value is also retained.

Converting the Result
The filtered rows are temporarily stored in a List<int[]>.

Once filtering is complete, the list is converted back into a two-dimensional array:

int[][] result = new int[filteredRows.size()][];

Each retained row is then placed into the resulting array.

Helpful Tips
Multidimensional Arrays
A two-dimensional array can be thought of as an array containing other arrays.

For example:

int[][] numbers = {
    {1, 2, 3},
    {4, 5, 6}
};

contains two rows.

The first row can be accessed using:

numbers[0]

and the second row using:

numbers[1]

Enhanced for Loops
Enhanced for loops make it easier to traverse arrays when the index is not required:

for (int[] row : array) {
    for (int number : row) {
        // process number
    }
}

Useful Links
Multidimensional Arrays in Java