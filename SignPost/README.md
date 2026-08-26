# Sign Post

## Functional Requirements

Implement a `SignPost` class with a `getArea` method that calculates the area of a rectangle capable of containing a multi-line string.

The method should:

- Accept a multi-line `String`.
- Treat each line as a row of the sign.
- Find the longest line to determine the width.
- Count the number of lines to determine the height.
- Return the area as an `int`.

The area is calculated as:

```text
area = width × height

Example
Given:

getArea("It works\non my\nmachine");

The lines are:

It works
on my
machine

The longest line has 7 characters and there are 3 lines.

Therefore:

7 × 3 = 21

Note: The exercise's stated example says 24, but based on the supplied input and the stated width × height requirements, the calculated area is 21.

How It Works
The string is split into individual lines using the newline character:

String[] lines = multiLiner.split("\n");

The longest line determines the width:

width = Math.max(width, line.length());

The number of lines determines the height:

int height = lines.length;

Finally, the area is calculated:

return width * height;

Build and Run
Example Main.java:

import sprint.SignPost;

public class Main {

    public static void main(String[] args) {
        SignPost signPost = new SignPost();

        System.out.println(
            signPost.getArea("It works\non my\nmachine")
        );
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Key Concepts
String splitting
Multi-line strings
Arrays
String.length()
Finding a maximum value
Basic area calculation