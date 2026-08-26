package Transformer;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Transformer {

    public static int[] transform(int[] input) {

        // Step 1: Remove duplicates
        Set<Integer> unique = new LinkedHashSet<>();

        for (int number : input) {
            unique.add(number);
        }

        int[] result = new int[unique.size()];

        int index = 0;
        for (int number : unique) {
            result[index++] = number;
        }


        // Step 2: Sort in descending order
        Arrays.sort(result);

        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }


        // Step 3: Replace every third element
        for (int i = 2; i < result.length; i += 3) {
            result[i] = result[i - 2] + result[i - 1];
        }


        // Step 4: Reverse the array
        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }


        return result;
    }
}