package RecursivePalindrome;

public class RecursivePalindrome {

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        return isPalindromeHelper(str.toLowerCase(), 0, str.length() - 1);
    }

    private boolean isPalindromeHelper(String str, int start, int end) {

        // Move start forward if character is not a letter or digit
        if (start < end && !Character.isLetterOrDigit(str.charAt(start))) {
            return isPalindromeHelper(str, start + 1, end);
        }

        // Move end backward if character is not a letter or digit
        if (start < end && !Character.isLetterOrDigit(str.charAt(end))) {
            return isPalindromeHelper(str, start, end - 1);
        }

        // Base case: all characters checked
        if (start >= end) {
            return true;
        }

        // Characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return isPalindromeHelper(str, start + 1, end - 1);
    }
}