# Recursive Occurrence Counter

This sprint implements a recursive method for counting how many times a specified integer occurs in an array.

## Requirements

The `OccurrenceCounter` class provides a `countOccurrences` method that:

- Takes an integer array, an element to search for, and a starting index.
- Recursively searches the array from the given index.
- Returns the number of occurrences of the specified element.
- Returns `0` for:
  - `null` arrays
  - Empty arrays
  - Negative indices
  - Out-of-bounds indices
- Uses recursion instead of `for`, `while`, or `do-while` loops.

## Implementation

```java
package sprint;

public class OccurrenceCounter {

    public int countOccurrences(int[] arr, int element, int index) {

        if (arr == null || arr.length == 0 || index < 0 || index >= arr.length) {
            return 0;
        }

        int count = (arr[index] == element) ? 1 : 0;

        return count + countOccurrences(arr, element, index + 1);
    }
}

Usage
Create a Main.java file:

import sprint.OccurrenceCounter;

public class Main {

    public static void main(String[] args) {
        OccurrenceCounter counter = new OccurrenceCounter();

        int[] arr = {1, 2, 3, 2, 4, 2, 5};

        System.out.println(counter.countOccurrences(arr, 2, 0));
        System.out.println(counter.countOccurrences(arr, 6, 0));
        System.out.println(counter.countOccurrences(null, 1, 0));
        System.out.println(counter.countOccurrences(new int[]{}, 1, 0));
    }
}

Build and Run
From the OccurrenceCounter directory:

javac -d build OccurrenceCounter.java Main.java
java -cp build Main

Expected output:

3
0
0
0

How It Works
The method checks the current array position and determines whether it matches the target element.

If it matches, the current count is 1; otherwise, it is 0.

The method then recursively calls itself with index + 1:

return count + countOccurrences(arr, element, index + 1);

The recursion stops when the index reaches the end of the array.

Key Concepts
Recursion
Base cases
Array indexing
Conditional expressions
Recursive accumulation
Useful Links
Recursion in Java