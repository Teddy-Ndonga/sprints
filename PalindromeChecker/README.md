# Palindrome Checker

A Java exercise that checks whether a string is a palindrome while ignoring spaces, punctuation, and letter casing.

## Functional Requirements

Implement an `isPalindrome` method that:

- Accepts a `String` as input.
- Returns `true` if the input is a palindrome.
- Returns `false` if the input is not a palindrome.
- Ignores spaces and punctuation.
- Ignores differences in letter casing.
- Handles empty strings.
- Handles strings containing only non-alphanumeric characters.

## Implementation

The solution first cleans the input by removing all non-alphanumeric characters and converting the remaining characters to lowercase.

It then uses two pointers:

- `left` starts at the beginning of the string.
- `right` starts at the end of the string.
- The characters at both positions are compared.
- The pointers move toward the center until the entire string has been checked.

```java
package sprint;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {

        // Remove spaces and punctuation, convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {

            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

Usage
Create a Main.java file:

import sprint.PalindromeChecker;

public class Main {

    public static void main(String[] args) {
        String testString1 = "A man, a plan, a canal, Panama";
        String testString2 = "Hello, World!";

        System.out.println(PalindromeChecker.isPalindrome(testString1));
        System.out.println(PalindromeChecker.isPalindrome(testString2));
    }
}

Build and Run
From the sprints directory:

javac -d build Main.java PalindromeChecker/PalindromeChecker.java
java -cp build Main

Expected output:

true
false

How It Works
Cleaning the String
The regular expression:

[^a-zA-Z0-9]

matches anything that is not a letter or number.

For example:

A man, a plan, a canal: Panama

becomes:

amanaplanacanalpanama

The result is then converted to lowercase.

Comparing From Both Ends
The cleaned string is checked from both directions:

a m a n a p l a n a c a n a l p a n a m a
↑                                         ↑
left                                    right

If the characters don't match, the method immediately returns false.

If all characters match, it returns true.

Edge Cases
An empty string returns true because there are no characters that contradict the palindrome condition.

A string containing only punctuation also becomes an empty string after cleaning and therefore returns true.

Key Concepts
String
Regular expressions
replaceAll()
toLowerCase()
charAt()
Two-pointer technique
while loops
Useful Links
Palindrome
Regular Expressions