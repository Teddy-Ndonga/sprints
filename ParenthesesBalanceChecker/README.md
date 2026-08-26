# Recursive Parentheses Balance Checker

This sprint implements a recursive method for determining whether parentheses in a string are balanced.

## Requirements

The `ParenthesesBalanceChecker` class provides an `isBalanced` method that:

- Accepts a `String` as input.
- Returns `false` for `null` input.
- Ignores non-parenthesis characters.
- Detects unbalanced opening and closing parentheses.
- Detects incorrectly ordered parentheses such as `")("`.
- Returns `true` for an empty string.
- Uses recursion instead of `for`, `while`, or `do-while` loops.

## Implementation

```java
package sprint;

public class ParenthesesBalanceChecker {

    public boolean isBalanced(String str) {
        if (str == null) {
            return false;
        }

        return checkBalance(str, 0, 0);
    }

    private boolean checkBalance(String str, int index, int balance) {

        if (balance < 0) {
            return false;
        }

        if (index == str.length()) {
            return balance == 0;
        }

        char current = str.charAt(index);

        if (current == '(') {
            return checkBalance(str, index + 1, balance + 1);
        }

        if (current == ')') {
            return checkBalance(str, index + 1, balance - 1);
        }

        return checkBalance(str, index + 1, balance);
    }
}

Usage
Create a Main.java file:

import sprint.ParenthesesBalanceChecker;

public class Main {

    public static void main(String[] args) {
        ParenthesesBalanceChecker checker = new ParenthesesBalanceChecker();

        System.out.println(checker.isBalanced("(())"));
        System.out.println(checker.isBalanced("(a()b()c)"));
        System.out.println(checker.isBalanced("(()"));
        System.out.println(checker.isBalanced(")("));
        System.out.println(checker.isBalanced(""));
        System.out.println(checker.isBalanced(null));
    }
}

Build and Run
From the ParenthesesBalanceChecker directory:

javac -d build ParenthesesBalanceChecker.java Main.java
java -cp build Main

Expected output:

true
true
false
false
true
false

How It Works
The recursive helper keeps track of two pieces of information:

index — the current position in the string.
balance — the difference between opening and closing parentheses encountered so far.
An opening parenthesis increases the balance:

balance + 1

A closing parenthesis decreases it:

balance - 1

If the balance ever becomes negative, a closing parenthesis appeared before a matching opening parenthesis, so the string is immediately considered unbalanced.

When the end of the string is reached, the parentheses are balanced only when:

balance == 0

Non-parenthesis characters are ignored and the recursion simply moves to the next character.

Key Concepts
Recursion
Recursive helper methods
Base cases
String traversal
Character inspection
State tracking
Balanced parentheses
Useful Links
Recursion in Java