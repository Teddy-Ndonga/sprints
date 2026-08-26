package ParenthesesBalanceChecker;

public class ParenthesesBalanceChecker {

    public boolean isBalanced(String str) {
        if (str == null) {
            return false;
        }

        return checkBalance(str, 0, 0);
    }

    private boolean checkBalance(String str, int index, int balance) {

        // Incorrect order: closing parenthesis before opening one
        if (balance < 0) {
            return false;
        }

        // Base case: reached end of string
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

        // Ignore non-parenthesis characters
        return checkBalance(str, index + 1, balance);
    }
}