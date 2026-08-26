# String To Int Converter

## Functional Requirements

Implement a method called `convertStringListToIntList` on the
`StringToIntConverter` class.

The method takes a `List<String>` containing numerical values and
returns a `List<Integer>`.

The method should:

1. Convert each valid integer string to its integer equivalent.
2. Collect the converted values into a new list.
3. Use the Java Stream `.map()` method to perform the conversion.

All strings are guaranteed to contain valid integer values.

## Expected Code Snippet

### StringToIntConverter.java

```java
package sprint;

import java.util.List;

public class StringToIntConverter {
    public List<Integer> convertStringListToIntList(List<String> input) {
        // solution code here
    }
}

Usage
Main.java
import sprint.StringToIntConverter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringToIntConverter converter = new StringToIntConverter();

        List<String> input = Arrays.asList("23", "45", "-15");

        List<Integer> result =
                converter.convertStringListToIntList(input);

        System.out.println(result);
    }
}

Build and Run
From the StringToIntConverter directory:

javac -d build Main.java
java -cp ./build Main

Expected output:

[23, 45, -15]

How It Works
The solution uses a Java Stream to process every string in the input
list.

Stream
input.stream()

Creates a stream from the input list.

Map
.map(Integer::parseInt)

Converts each String into an Integer.

The method reference:

Integer::parseInt

is equivalent to:

s -> Integer.parseInt(s)

For example:

"23"  → 23
"45"  → 45
"-15" → -15

Collect
.toList()

Collects the converted integers into a new list.

Helpful Tips
The .map() operation is useful when each element in a stream needs to
be transformed into another value.

For example:

List<Integer> numbers = input.stream()
        .map(Integer::parseInt)
        .toList();

Method references can make stream operations shorter and more readable
when an existing method already performs the required operation.

Useful Links
Java Streams
Stream map()
Method References