# Word Tally

## Description

`WordCounter` counts the number of words in a given sentence.

A word is defined as a sequence of letters. Non-letter characters are treated as separators between words.

## Requirements

Implement a `WordCounter` class with a `countWords` method that:

- Takes a `String` sentence as input.
- Returns the number of words in the sentence.
- Treats a sequence of letters as one word.
- Handles multiple spaces and other non-letter characters.
- Returns `0` for a null or empty string.

## Examples

```java
WordCounter counter = new WordCounter();

counter.countWords("Hello world");
// 2

counter.countWords("I like coding in Java");
// 5

counter.countWords("");
// 0

Approach
The method iterates through the sentence one character at a time.

Character.isLetter() is used to determine whether a character belongs to a word.

A boolean variable tracks whether the current position is already inside a word. A new word is counted whenever a letter is encountered after a non-letter character.

Key Concepts
String
Character.isLetter()
for loops
if-then-else
Boolean state tracking
Edge-case handling
Useful Links
Java String
Java Character.isLetter()