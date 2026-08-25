package ArrayInitializer;

public class ArrayInitializer {

    public int[] fillArray(int max) {
        // Return an empty array if the size is < 1
        if (max < 1) {
            return new int[0];
        }

        // Create an array with the requested size
        int[] numbers = new int[max];

        // Fill the array with values from 1 to max
        for (int i = 0; i < max; i++) {
            numbers[i] = i + 1;
        }

        return numbers;
    }
}