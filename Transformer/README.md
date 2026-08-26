# Transformer

A Java exercise for practicing arrays, sets, sorting, element replacement, and array reversal.

## Functional Requirements

Implement a class `Transformer` with a public static method `transform`.

The method accepts an integer array and returns a transformed integer array.

The transformation must be performed in the following order:

1. Remove duplicate values.
2. Sort the remaining values in descending order.
3. Replace every third element with the sum of the two preceding elements.
4. Reverse the resulting array.
5. Return the transformed array.

## Implementation

### `Transformer.java`

```java
package sprint;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Transformer {

    public static int[] transform(int[] input) {

        // Step 1: Remove duplicates
        Set<Integer> unique = new LinkedHashSet<>();

        for (int number : input) {
            unique.add(number);
        }

        int[] result = new int[unique.size()];

        int index = 0;
        for (int number : unique) {
            result[index++] = number;
        }

        // Step 2: Sort in descending order
        Arrays.sort(result);

        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }

        // Step 3: Replace every third element
        for (int i = 2; i < result.length; i += 3) {
            result[i] = result[i - 2] + result[i - 1];
        }

        // Step 4: Reverse the array
        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }

        return result;
    }
}

Usage
The following Main.java can be used to test the Transformer class.

Main.java
import sprint.Transformer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] input = {5, 3, 8, 3, 1, 8, 6, 2};

        int[] result = Transformer.transform(input);

        System.out.println(Arrays.toString(result));
    }
}

Build and Run
From the directory containing Main.java and the sprint package:

Compile
javac -d build Main.java Transformer.java

Run
java -cp ./build Main

How It Works
The transformation consists of four steps that must be performed in order.

1. Remove Duplicates
A LinkedHashSet is used to remove duplicate values:

Set<Integer> unique = new LinkedHashSet<>();

for (int number : input) {
    unique.add(number);
}

A set does not allow duplicate values.

LinkedHashSet also preserves the insertion order while the values are being collected.

The unique values are then copied into an integer array.

2. Sort in Descending Order
The array is first sorted using Arrays.sort():

Arrays.sort(result);

This produces ascending order.

The array is then reversed using element swapping to produce descending order.

For example:

Before:
[1, 2, 3, 5, 6, 8]

After:
[8, 6, 5, 3, 2, 1]

3. Replace Every Third Element
Every third element is replaced by the sum of the two elements immediately before it.

The loop starts at index 2 because index 2 represents the third element:

for (int i = 2; i < result.length; i += 3) {
    result[i] = result[i - 2] + result[i - 1];
}

For example:

[8, 6, 5, 3, 2, 1]

The third element is replaced:

8 + 6 = 14

Result:

[8, 6, 14, 3, 2, 5]

The next third element is then processed using the two elements immediately before it.

4. Reverse the Array
Finally, the transformed array is reversed:

for (int i = 0; i < result.length / 2; i++) {
    int temp = result[i];
    result[i] = result[result.length - 1 - i];
    result[result.length - 1 - i] = temp;
}

This swaps elements from opposite ends of the array until the middle is reached.

Key Concepts
Set
A Set stores unique values and does not allow duplicates.

Set<Integer> unique = new LinkedHashSet<>();

LinkedHashSet
LinkedHashSet is useful when you want the uniqueness behavior of a set while preserving insertion order.

Arrays.sort()
Arrays.sort() sorts an array into ascending order.

In this exercise, the resulting array is manually reversed afterward to achieve descending order.

Array Indexes
Java arrays use zero-based indexing.

Therefore:

Position	Index
First element	0
Second element	1
Third element	2
Fourth element	3

This is why the replacement loop starts at index 2.

Helpful Tips
Break complex transformations into separate steps.

When working with a transformation that has multiple requirements, the order of operations matters. Removing duplicates, sorting, replacing elements, and reversing the array in a different order can produce a different result.

Useful Links
Java Set Interface
LinkedHashSet
Arrays.sort()