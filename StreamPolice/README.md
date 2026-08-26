# Stream Police

## Functional Requirements

Implement a method `processNumbers` on the `StreamPolice` class that
processes a `List<Integer>` using Java Streams.

The method should:

1. Filter out all negative numbers.
2. Filter out numbers that are divisible by 5 but not divisible by 10.
3. Collect the remaining numbers into a new list.
4. Return the resulting list.

For example:

- `15` is removed because it is divisible by 5 but not by 10.
- `10` is kept because it is divisible by both 5 and 10.
- `20` is kept because it is divisible by both 5 and 10.
- Negative numbers such as `-10` and `-3` are removed.

## Expected Code Snippet

### StreamPolice.java

```java
package sprint;

import java.util.List;

public class StreamPolice {
    public List<Integer> processNumbers(List<Integer> numbers) {
        // solution code here
    }
}

Usage
Main.java
import sprint.StreamPolice;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StreamPolice processor = new StreamPolice();

        List<Integer> numbers = Arrays.asList(
            -10, 15, 20, 30, 8, -3, 5, 10, 50, 12
        );

        List<Integer> result = processor.processNumbers(numbers);

        System.out.println(result);
    }
}

Build and Run
From the StreamPolice directory:

javac -d build Main.java
java -cp ./build Main

Expected output:

[20, 30, 8, 10, 50, 12]

How It Works
The solution uses a Java Stream pipeline.

1. Filter negative numbers
.filter(n -> n >= 0)

Only numbers greater than or equal to zero are kept.

2. Remove numbers divisible by 5 but not by 10
.filter(n -> !(n % 5 == 0 && n % 10 != 0))

This removes numbers such as 5, 15, and 25, while keeping numbers
such as 10, 20, and 30.

3. Collect the result
.toList()

The remaining elements are collected into a new list.

Helpful Tips
Java Streams allow you to process collections through a sequence of
operations such as filter, map, and toList.

The filter operation keeps elements that satisfy a condition.

For example:

numbers.stream()
    .filter(n -> n >= 0)
    .toList();

The stream pipeline can contain multiple filters, allowing each
condition to be handled separately.

Useful Links
Java Streams
Filtering with Lambda Expressions