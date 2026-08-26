package TextStats;

public class TextStats {

    public String analyzeText(String text) {
        int letters = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }

        return "Letters: " + letters +
               ", Digits: " + digits +
               ", Spaces: " + spaces;
    }
}
