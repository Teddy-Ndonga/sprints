# Anagram Checker

A Java exercise that checks whether two strings are anagrams of each other.

## Functional Requirements

Implement an `areAnagrams` method that:

- Accepts two `String` values.
- Returns `true` if the strings contain the same characters in any order.
- Returns `false` if the strings contain different characters.
- Handles differences in letter casing.

For example:

```text
Listen
Silent

are anagrams because they contain the same characters.

Implementation
The solution first converts both strings to lowercase so that the comparison is not case-sensitive.

The strings are then converted into character arrays and sorted. If the sorted arrays are equal, the strings are anagrams.

package sprint;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String string1, String string2) {

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string1.length() != string2.length()) {
            return false;
        }

        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}

Usage
Create a Main.java file:

import sprint.AnagramChecker;

public class Main {

    public static void main(String[] args) {
        String string1 = "Listen";
        String string2 = "Silent";
        String string3 = "Hello";

        System.out.println(AnagramChecker.areAnagrams(string1, string2));
        System.out.println(AnagramChecker.areAnagrams(string1, string3));
    }
}

Build and Run
From the sprints directory:

javac -d build Main.java AnagramChecker/AnagramChecker.java
java -cp build Main

Expected output:

true
false

How It Works
1. Normalize the Case
Both strings are converted to lowercase:

string1 = string1.toLowerCase();
string2 = string2.toLowerCase();

This means:

Listen
Silent

can be compared as:

listen
silent

2. Check the Length
Anagrams must contain the same number of characters.

if (string1.length() != string2.length()) {
    return false;
}

If the lengths are different, the strings cannot be anagrams.

3. Convert to Character Arrays
char[] chars1 = string1.toCharArray();
char[] chars2 = string2.toCharArray();

This allows the characters to be sorted.

4. Sort the Characters
Arrays.sort(chars1);
Arrays.sort(chars2);

For example:

listen → eilnst
silent → eilnst

5. Compare the Arrays
return Arrays.equals(chars1, chars2);

If the sorted arrays contain the same characters, the strings are anagrams.

Key Concepts
String
toLowerCase()
toCharArray()
Character arrays
Arrays.sort()
Arrays.equals()
Case normalization
Useful Links
Anagram