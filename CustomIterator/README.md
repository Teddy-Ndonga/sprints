# Custom Iterator

Implements the Java `Iterator<Integer>` interface to provide sequential
access to a list of integers.

## Functional Requirements

Implement a `CustomIterator` class that:

- Implements the `Iterator<Integer>` interface.
- Stores a list of integers.
- Keeps track of the current position using an index.
- Implements `hasNext()` to determine whether another element is available.
- Implements `next()` to return the next element.
- Throws `NoSuchElementException` when `next()` is called after all elements have been consumed.
- Initializes the index to `0` in the constructor.

## Implementation

```java
package sprint;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomIterator implements Iterator<Integer> {

    private List<Integer> numbers;
    private int index;

    public CustomIterator(List<Integer> numbers) {
        this.numbers = numbers;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < numbers.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return numbers.get(index++);
    }
}

Usage
Create a Main.java file:

import sprint.CustomIterator;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        CustomIterator iterator = new CustomIterator(numbers);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

Build and Run
From the CustomIterator directory:

javac -d build CustomIterator.java Main.java
java -cp build Main

Expected output:

1
2
3
4
5

How It Works
Constructor
The constructor receives the list and starts the iterator at index 0:

public CustomIterator(List<Integer> numbers) {
    this.numbers = numbers;
    this.index = 0;
}

hasNext()
hasNext() checks whether the current index is still inside the list:

return index < numbers.size();

It returns:

true when another element is available.
false when all elements have been visited.
next()
next() first checks whether another element exists:

if (!hasNext()) {
    throw new NoSuchElementException();
}

If an element is available, it returns the current element and increments
the index:

return numbers.get(index++);

This allows the iterator to move through the list one element at a time.

Key Concepts
Java interfaces
Iterator<Integer>
implements
Constructors
List.get()
hasNext()
next()
NoSuchElementException
Useful Links
Java Constructor
Java Interface
Java Iterator Interface
Java throw keyword