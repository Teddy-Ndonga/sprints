package AnagramChecker;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String string1, String string2) {

        // Convert both strings to lowercase
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (string1.length() != string2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        // Sort the arrays
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare sorted arrays
        return Arrays.equals(chars1, chars2);
    }
}