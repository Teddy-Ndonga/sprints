package ArraySorter;

public class ArraySorter {

    public double[] sortArray(double[] arr) {

        // Compare each element with the remaining elements
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current element is the smallest
            int minIndex = i;

            // Find the smallest value in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the current element with the smallest value found
            double temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Return the sorted array
        return arr;
    }
}