package WordCounter;

public class WordCounter {
    public int countWords(String sentence) {

        // Handle null or empty string
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        int wordCount = 0;
        boolean inWord = false;

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Check if current character is a letter
            if (Character.isLetter(ch)) {
                // If we were not inside a word, it means the word starts here
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                // Character is not a letter, so the word has ended
                inWord = false;
            }
        }

        return wordCount;
    }
}
