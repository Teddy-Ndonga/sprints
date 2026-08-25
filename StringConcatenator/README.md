# String Concatenator

A Java exercise for practicing variable-length arguments (`varargs`), `StringBuilder`, loops, and string manipulation.

## Functional Requirements

Implement a method `concatenate` for the `StringConcatenator` class.

The method should:

- Accept a variable number of `String` arguments.
- Concatenate all provided strings in their original order.
- Return the resulting string.

## Implementation

### `StringConcatenator.java`

```java
package sprint;

public class StringConcatenator {

    public String concatenate(String... strings) {

        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            result.append(str);
        }

        return result.toString();
    }
}

Usage
The following Main.java can be used to test the StringConcatenator class.

Main.java
import sprint.StringConcatenator;

public class Main {

    public static void main(String[] args) {
        StringConcatenator stringConcatenator = new StringConcatenator();

        String result = stringConcatenator.concatenate(
            "Hello",
            ", ",
            "varArgs",
            "!"
        );

        System.out.println(result);
    }
}

Build and Run
From the directory containing Main.java and the sprint package:

Compile
javac -d build Main.java StringConcatenator.java

Run
java -cp ./build Main

Expected Output
Hello, varArgs!

How It Works
The concatenate method uses Java's varargs syntax:

String... strings

This allows the method to accept any number of String arguments.

For example:

stringConcatenator.concatenate("Hello", ", ", "World", "!");

Inside the method, the varargs parameter can be treated like an array. This makes it possible to iterate over each string:

for (String str : strings) {
    result.append(str);
}

Each string is appended to the StringBuilder in the order it was provided.

Varargs
A parameter declared with ... allows a method to receive a variable number of arguments.

For example:

public String concatenate(String... strings)

can accept:

concatenate("Hello");

or:

concatenate("Hello", " ", "World");

or:

concatenate("A", "B", "C", "D", "E");

Inside the method, strings behaves like a String[].

StringBuilder
The implementation uses StringBuilder to construct the resulting string:

StringBuilder result = new StringBuilder();

Each string is then appended:

result.append(str);

Finally, toString() converts the StringBuilder into a regular String:

return result.toString();

Using StringBuilder for repeated concatenation is generally more efficient than repeatedly using the + operator inside a loop.

Helpful Tips
Varargs Are Arrays
A varargs parameter can be iterated over just like an array:

for (String str : strings) {
    // process str
}

Preserving Order
The strings should be appended in the same order they are received.

For:

"Hello", ", ", "World", "!"

the result should be:

Hello, World!

Useful Links
Varargs in Java
StringBuilder in Java