# Recursive Palindrome Checker

Implement a recursive method that determines whether a string is a palindrome.

## Requirements

The `RecursivePalindrome` class provides an `isPalindrome` method that:

- Returns `true` when the input is a palindrome.
- Returns `false` when the input is not a palindrome.
- Ignores spaces and non-alphanumeric characters.
- Ignores letter case.
- Handles empty strings.
- Handles strings containing a single character.
- Handles strings containing only whitespace or special characters.
- Returns `false` for `null` input.
- Uses recursion to perform the palindrome check.
- Does not use `for`, `while`, or `do-while` loops.

## Implementation

```java
package sprint;

public class RecursivePalindrome {

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        return isPalindromeHelper(str.toLowerCase(), 0, str.length() - 1);
    }

    private boolean isPalindromeHelper(String str, int start, int end) {

        if (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
            return isPalindromeHelper(str, start + 1, end);
        }

        if (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
            return isPalindromeHelper(str, start, end - 1);
        }

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeHelper(str, start + 1, end - 1);
    }
}

Usage
Create a Main.java file:

import sprint.RecursivePalindrome;

public class Main {

    public static void main(String[] args) {
        RecursivePalindrome checker = new RecursivePalindrome();

        System.out.println(
            checker.isPalindrome("A man, a plan, a canal: Panama")
        );

        System.out.println(
            checker.isPalindrome("race a car")
        );

        System.out.println(
            checker.isPalindrome("")
        );

        System.out.println(
            checker.isPalindrome("a")
        );

        System.out.println(
            checker.isPalindrome("   ")
        );

        System.out.println(
            checker.isPalindrome(null)
        );
    }
}

Build and Run
From the RecursivePalindrome directory:

javac -d build Main.java
java -cp ./build Main

Output:

true
false
true
true
true
false

How It Works
The helper method compares characters from both ends of the string.

For example:

racecar
↑     ↑
r     r

If the characters match, the method recursively moves toward the center:

racecar
 r   r
  a a
   c

The recursion stops when the two indexes meet or cross.

Non-alphanumeric characters are skipped, allowing strings such as:

A man, a plan, a canal: Panama

to be treated as:

amanaplanacanalpanama

Edge Cases
"" → true
"a" → true
" " → true
"!!!" → true
"racecar" → true
"race a car" → false
null → false
Key Concepts
Recursion
Helper methods
Base cases
String traversal
Character.isLetterOrDigit()
Case normalization
Two-pointer technique
Useful Links
Recursion in Java
Palindrome