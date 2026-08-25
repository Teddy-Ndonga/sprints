# Array Modifier

A Java exercise for practicing `ArrayList`, indexes, element removal, wrapper classes, and autoboxing/unboxing.

## Functional Requirements

Implement a static method `removeElementsBetween` for the `ArrayModifier` class.

The method accepts:

- An `ArrayList<Double>` called `list`
- An integer `index1`
- An integer `index2`

The method should:

- Remove elements from `index1` inclusive to `index2` exclusive.
- Return the same modified list.
- Swap `index1` and `index2` if `index1` is greater than `index2`.
- Adjust indexes that are outside the valid range of the list.
- Handle indexes that are equal.
- Handle indexes that are outside the list bounds without throwing an exception.

## Implementation

### `ArrayModifier.java`

```java
package sprint;

import java.util.ArrayList;

public class ArrayModifier {

    public static ArrayList<Double> removeElementsBetween(
            ArrayList<Double> list, int index1, int index2) {

        // Swap indexes if they are in the wrong order
        if (index1 > index2) {
            int temp = index1;
            index1 = index2;
            index2 = temp;
        }

        // Adjust indexes to stay within the list bounds
        if (index1 < 0) {
            index1 = 0;
        }

        if (index2 > list.size()) {
            index2 = list.size();
        }

        // Remove elements from index1 (inclusive) to index2 (exclusive)
        while (index1 < index2) {
            list.remove(index1);
            index2--;
        }

        // Return the modified list
        return list;
    }
}

Usage
The following Main.java can be used to test the ArrayModifier class.

Main.java
import sprint.ArrayModifier;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        list.add(1.5);
        list.add(2.5);
        list.add(3.5);
        list.add(4.5);
        list.add(5.5);

        ArrayList<Double> result =
                ArrayModifier.removeElementsBetween(list, 1, 3);

        for (double num : result) {
            System.out.print(num + " ");
        }
    }
}

Build and Run
From the directory containing Main.java and the sprint package:

Compile
javac -d build Main.java ArrayModifier.java

Run
java -cp ./build Main

Expected Output
1.5 4.5 5.5

How It Works
The method removes elements from index1 up to, but not including, index2.

For example, given:

Index:  0    1    2    3    4
Value:  1.5  2.5  3.5  4.5  5.5

Calling:

ArrayModifier.removeElementsBetween(list, 1, 3);

removes the elements at indexes 1 and 2:

2.5
3.5

The resulting list is:

1.5 4.5 5.5

The starting index is inclusive, while the ending index is exclusive.

Handling Index Order
If index1 is greater than index2, the method swaps them:

if (index1 > index2) {
    int temp = index1;
    index1 = index2;
    index2 = temp;
}

For example:

index1 = 3
index2 = 1

becomes:

index1 = 1
index2 = 3

Handling Out-of-Bounds Indexes
Negative index1 values are adjusted to 0:

if (index1 < 0) {
    index1 = 0;
}

If index2 is greater than the list size, it is adjusted to the list size:

if (index2 > list.size()) {
    index2 = list.size();
}

This prevents the indexes from exceeding the valid range.

Equal Indexes
If index1 and index2 are the same, no elements are removed because the range is empty.

For example:

removeElementsBetween(list, 2, 2);

leaves the list unchanged.

Helpful Tips
ArrayList
ArrayList provides useful methods for manipulating lists, including:

list.add(element);
list.remove(index);
list.get(index);
list.size();

Wrapper Classes
Java's ArrayList stores objects rather than primitive types.

Instead of:

ArrayList<double>

the wrapper class Double is used:

ArrayList<Double>

Java automatically converts between double and Double when appropriate. This is known as autoboxing and unboxing.

Useful Links
Java ArrayList
Autoboxing and Unboxing