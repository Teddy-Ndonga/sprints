# Letter Lens

## Description

The `CharCounter` exercise implements a method that counts how many times a target character occurs in a string.

The comparison is case-insensitive.

## Requirements

- Accept a `String` and a target `char`.
- Count occurrences of the target character.
- Treat uppercase and lowercase versions of the character as the same.
- Return `0` for a `null` or empty string.

## Examples

```java
CharCounter counter = new CharCounter();

System.out.println(counter.countOccurrences("Banana", 'a'));
System.out.println(counter.countOccurrences("Hello WORLD", 'o'));

Output:

3
2

How It Works
The target character is converted to lowercase:

char lowerTarget = Character.toLowerCase(target);

Each character in the input is then converted to lowercase before comparison.

For example:

"Banana", 'a'

B → b → no match
a → a → match
n → n → no match
a → a → match
n → n → no match
a → a → match

Total: 3

Key Concepts
for loops
Strings
charAt()
Character.toLowerCase()
Case-insensitive comparison
Counting occurrences
Null and empty-string handling
Build and Run
From the project root:

javac -d build Main.java
java -cp ./build Main

