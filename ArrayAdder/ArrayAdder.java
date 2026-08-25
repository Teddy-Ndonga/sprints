package ArrayAdder;

public class ArrayAdder {

    public static int[] concatArrays(int[] arr1, int[] arr2) {

        // Create a new array large enough for both arrays
        int[] result = new int[arr1.length + arr2.length];

        // Copy elements from the first array
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        // Return the combined array
        return result;
    }
}