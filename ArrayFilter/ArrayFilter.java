package ArrayFilter;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilter {

    public int[][] filterBySum(int[][] array, int value) {

        List<int[]> filteredRows = new ArrayList<>();

        // Traverse each row
        for (int[] row : array) {

            int sum = 0;

            // Calculate row sum
            for (int number : row) {
                sum += number;
            }

            // Keep rows whose sum meets the requirement
            if (sum >= value) {
                filteredRows.add(row);
            }
        }

        // Convert List<int[]> back to int[][]
        int[][] result = new int[filteredRows.size()][];

        for (int i = 0; i < filteredRows.size(); i++) {
            result[i] = filteredRows.get(i);
        }

        return result;
    }
}