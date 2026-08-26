package Combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<String> combN(int n) {

        List<String> combinations = new ArrayList<>();

        // If n is invalid return empty list
        if (n <= 0) {
            return combinations;
        }

        generateCombinations(
                combinations,
                "",
                0,
                n
        );

        return combinations;
    }


    private void generateCombinations(
            List<String> combinations,
            String current,
            int start,
            int n
    ) {

        // Base case: combination has reached required length
        if (current.length() == n) {
            combinations.add(current);
            return;
        }


        // Try digits from start to 9
        for (int digit = start; digit <= 9; digit++) {

            generateCombinations(
                    combinations,
                    current + digit,
                    digit + 1,
                    n
            );

        }
    }
}