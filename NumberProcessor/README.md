# Number Processor

Filters a list of integers and calculates the product of the remaining
numbers using Java Streams and `reduce()`.

## Functional Requirements

Implement a method `processNumbers` on the `NumberProcessor` class.

The method should:

- Accept a `List<Integer>` as input.
- Filter out all numbers less than `10`.
- Calculate the product of the remaining numbers using the Stream `reduce()` method.
- Return the result as an `Optional<Integer>`.
- Return an empty `Optional` if no numbers remain after filtering.

## Implementation

```java
package sprint;

import java.util.List;
import java.util.Optional;

public class NumberProcessor {

    public Optional<Integer> processNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n >= 10)
                .reduce((a, b) -> a * b);
    }
}

Usage
Create a Main.java file:

import sprint.NumberProcessor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        List<Integer> numbers = Arrays.asList(3, 5, 12, 20, 7, 10);

        Optional<Integer> result = processor.processNumbers(numbers);

        System.out.println(result);
    }
}

Build and Run
From the NumberProcessor directory:

javac -d build NumberProcessor.java Main.java
java -cp build Main

Expected output:

Optional[2400]

The values below 10 (3, 5, and 7) are removed, leaving:

12, 20, 10

Their product is:

12 × 20 × 10 = 2400

Key Concepts
filter()
filter() keeps only elements that satisfy a condition:

.filter(n -> n >= 10)

reduce()
reduce() combines the remaining elements into a single result:

.reduce((a, b) -> a * b)

For this exercise, the remaining numbers are multiplied together.

Optional
Because there may be no numbers remaining after filtering, reduce() returns an Optional<Integer> rather than an Integer.

Useful Links
Java Streams
Stream reduce()
Java Optional