# Username Processor

## Functional Requirements

Implement a method called `findFirstUsername` on the
`UsernameProcessor` class.

The method takes a `List<String>` containing usernames and should:

1. Use `findFirst()` to retrieve the first username from the list.
2. Return the first username if one exists.
3. Return `"Anonymous"` if the list is empty or no username is found.

The solution must use the Java Stream `findFirst()` method.

## Expected Code Snippet

### UsernameProcessor.java

```java
package sprint;

import java.util.List;

public class UsernameProcessor {
    public String findFirstUsername(List<String> usernames) {
        // solution code here
    }
}

Usage
Main.java
import sprint.UsernameProcessor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UsernameProcessor processor = new UsernameProcessor();

        List<String> usernames = Arrays.asList(
            "usr",
            "user12",
            "test",
            "validUser",
            "12345"
        );

        String firstUsername =
                processor.findFirstUsername(usernames);

        System.out.println(firstUsername);
    }
}

Build and Run
From the UsernameProcessor directory:

javac -d build Main.java
java -cp ./build Main

Expected output:

usr

How It Works
The solution uses a Java Stream to find the first username.

Creating the Stream
usernames.stream()

Creates a stream from the list of usernames.

Finding the First Element
.findFirst()

Returns an Optional<String> containing the first username if one
exists.

For example:

["usr", "user12", "test"]

produces an Optional containing:

usr

If the list is empty, the Optional contains no value.

Providing a Default Value
.orElse("Anonymous")

Returns the username when one exists. If the Optional is empty,
it returns "Anonymous" instead.

For example:

["usr", "user12", "test"] → usr
[]                         → Anonymous

Helpful Tips
findFirst() returns an Optional rather than returning the value
directly. This allows Java to safely represent the case where no
element exists.

The orElse() method provides a fallback value when the Optional
is empty.

Useful Links
Java Stream findFirst()
Java Optional
