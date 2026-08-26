# Text Statistics Calculator

## Functional Requirements

Implement a `TextStats` class with an `analyzeText` method that analyzes a string and counts:

- Letters
- Digits
- Space characters

The method returns the results in the following format:

```text
Letters: X, Digits: Y, Spaces: Z

Examples
analyzeText("Hello World 2024!");

Returns:

Letters: 10, Digits: 4, Spaces: 2

analyzeText("Java123");

Returns:

Letters: 4, Digits: 3, Spaces: 0

analyzeText("42");

Returns:

Letters: 0, Digits: 2, Spaces: 0

analyzeText("");

Returns:

Letters: 0, Digits: 0, Spaces: 0

How It Works
The method loops through each character in the input string:

for (int i = 0; i < text.length(); i++) {
    char ch = text.charAt(i);
}

Character.isLetter() is used to identify letters:

Character.isLetter(ch)

Character.isDigit() is used to identify digits:

Character.isDigit(ch)

A space is identified using:

ch == ' '

Each matching character increments its corresponding counter.

Build and Run
Example Main.java:

import sprint.TextStats;

public class Main {

    public static void main(String[] args) {
        TextStats stats = new TextStats();

        System.out.println(
            stats.analyzeText("Hello World 2024!")
        );

        System.out.println(
            stats.analyzeText("Java123")
        );
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Expected output:

Letters: 10, Digits: 4, Spaces: 2
Letters: 4, Digits: 3, Spaces: 0

Key Concepts
for loops
String.length()
String.charAt()
Character.isLetter()
Character.isDigit()
Conditional statements
Counters
String concatenation