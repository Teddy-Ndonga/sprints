# StrConcat

## String Concat

A Java exercise that combines two strings with a specified delimiter between them.

## Requirements

Implement a `StrConcat` class with a `concatWithDelimiter` method that:

- Takes two `String` parameters.
- Takes a `char` delimiter.
- Places the delimiter between the two strings.
- Returns the resulting concatenated string.

Example:

```java
StrConcat concat = new StrConcat();

System.out.println(
    concat.concatWithDelimiter("kood", "School", '/')
);

Expected output:

kood/School

Implementation
public String concatWithDelimiter(String str1, String str2, char delimiter) {
    return str1 + delimiter + str2;
}

Java allows strings and characters to be combined using the + operator.

Build and Run
Example Main.java:

import sprint.StrConcat;

public class Main {

    public static void main(String[] args) {
        StrConcat concat = new StrConcat();

        System.out.println(
            concat.concatWithDelimiter("kood", "School", '/')
        );
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Expected output:

kood/School

Concepts Practiced
Java classes
Methods
Method parameters
String
char
String concatenation
The + operator