# Word Length Analyzer

Analyzes a list of words and groups them by their length using Java
Streams and Collectors.

## Functional Requirements

Implement a method `analyzeWordLengths` on the `WordLengthAnalyzer`
class.

The method should:

- Accept a `List<String>` containing words.
- Group the words according to their length.
- Count how many words belong to each length.
- Return a `Map<Integer, Integer>`.
- Use Java Streams and Collectors to perform the analysis.

## Implementation

```java
package sprint;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthAnalyzer {

    public Map<Integer, Integer> analyzeWordLengths(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                Long::intValue
                        )
                ));
    }
}

Usage
Create a Main.java file:

import sprint.WordLengthAnalyzer;

import java.util.Arrays;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        WordLengthAnalyzer analyzer = new WordLengthAnalyzer();

        Map<Integer, Integer> result =
                analyzer.analyzeWordLengths(
                        Arrays.asList(
                                "apple",
                                "banana",
                                "cherry",
                                "date",
                                "fig"
                        )
                );

        System.out.println(result);
    }
}

Build and Run
From the WordLengthAnalyzer directory:

javac -d build WordLengthAnalyzer.java Main.java
java -cp build Main

Expected output:

{3=1, 4=1, 5=1, 6=2}

The order of the entries may vary because the result is a Map.

How It Works
groupingBy()
groupingBy() groups elements according to a characteristic.

Here, String::length is used to group words by their length:

Collectors.groupingBy(String::length, ...)

For example:

apple  → 5
banana → 6
cherry → 6
date   → 4
fig    → 3

This produces groups based on the word length.

counting()
counting() counts how many elements are present in each group:

Collectors.counting()

The count initially has the type Long.

collectingAndThen()
collectingAndThen() allows the result of one collector to be transformed.

In this exercise, it converts the Long produced by counting() into an Integer:

Collectors.collectingAndThen(
    Collectors.counting(),
    Long::intValue
)

Therefore, the final result has the required type:

Map<Integer, Integer>

Key Concepts
Java Streams
Collectors.groupingBy()
Collectors.counting()
Collectors.collectingAndThen()
Method references
Java Map
Useful Links
Java Streams and Collectors
Guide to Java Streams
Java Map Interface