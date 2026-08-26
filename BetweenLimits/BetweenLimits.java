package BetweenLimits;

public class BetweenLimits {

    public String findRange(char from, char to) {

        int start = Math.min(from, to);
        int end = Math.max(from, to);

        StringBuilder result = new StringBuilder();

        for (int i = start + 1; i < end; i++) {
            result.append((char) i);
        }

        return result.toString();
    }
}
