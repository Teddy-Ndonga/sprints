# List Manipulator

A Java exercise for practicing the `List` interface, list manipulation, conditional checks, and working with mutable collections.

## Functional Requirements

Implement a method `manipulateList` for the `ListManipulator` class that accepts a `List<String>` and performs the following operations in order:

1. Remove the last element from the list.
2. Set the new last element to:
   ```text
   "The size of the list is " + size of the list
3. Add the string "last" to the end of the list.
4. Set the first element to "first".
5. Return the manipulated list.
The method should handle an empty list gracefully without throwing an exception.

Implementation
ListManipulator.java
package sprint;

import java.util.List;

public class ListManipulator {

    public List<String> manipulateList(List<String> list) {

        // Remove last element only if list is not empty
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }

        // Set the new last element only if list is not empty
        if (!list.isEmpty()) {
            list.set(list.size() - 1,
                "The size of the list is " + list.size());
        }

        // Always add "last"
        list.add("last");

        // Set first element only if list is not empty
        list.set(0, "first");

        return list;
    }
}

Usage
The following Main.java can be used to test the ListManipulator class.

Main.java
import sprint.ListManipulator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        ListManipulator listManipulator = new ListManipulator();

        list = listManipulator.manipulateList(list);

        System.out.println(list);
    }
}

Build and Run
From the directory containing Main.java and the sprint package:

Compile
javac -d build Main.java ListManipulator.java

Run
java -cp ./build Main

Expected Output
[first, The size of the list is 2, last]

How It Works
The method modifies the supplied list directly.

Given the initial list:

[A, B, C]

1. Remove the last element
C is removed:

[A, B]

2. Set the new last element
The list now has a size of 2, so B becomes:

The size of the list is 2

The list becomes:

[A, The size of the list is 2]

3. Add "last"
[A, The size of the list is 2, last]

4. Set the first element
A is replaced with "first":

[first, The size of the list is 2, last]

This is the final result.

Handling an Empty List
The implementation checks whether the list is empty before attempting to remove or modify its last element:

if (!list.isEmpty()) {
    list.remove(list.size() - 1);
}

The same check is used before setting the new last element.

After that, "last" is added to the list, ensuring that the list contains an element before the first element is modified.

Helpful Tips
Checking Whether a List Is Empty
The List interface provides the isEmpty() method:

list.isEmpty()

It returns true when the list contains no elements and false otherwise.

Getting the List Size
The number of elements in a list can be obtained using:

list.size()

Accessing the Last Element
Because list indices start at 0, the last element can be accessed using:

list.get(list.size() - 1)

Similarly, the last element can be modified using:

list.set(list.size() - 1, "new value");

Useful Links
Java List Interface
Java Interfaces
