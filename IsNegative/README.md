# Is Negative?

## Functional Requirements

Implement an `IsNegative` class with a `checkIfNegative` method that:

- Accepts an integer `n`.
- Returns `true` if `n` is negative.
- Returns `false` if `n` is zero or positive.
- Uses an `if` statement to determine whether the number is negative.

## Examples

```java
checkIfNegative(-5);

Returns:

true

checkIfNegative(5);

Returns:

false

checkIfNegative(0);

Returns:

false

How It Works
The method checks whether the number is less than zero:

if (n < 0) {
    return true;
} else {
    return false;
}

Zero is neither negative nor positive, so 0 returns false.

Build and Run
Example Main.java:

import sprint.IsNegative;

public class Main {

    public static void main(String[] args) {
        IsNegative checker = new IsNegative();

        System.out.println(checker.checkIfNegative(-5));
        System.out.println(checker.checkIfNegative(5));
        System.out.println(checker.checkIfNegative(0));
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Expected output:

true
false
false

Key Concepts
if statements
else statements
Relational operators
Boolean return values
Negative and non-negative integers