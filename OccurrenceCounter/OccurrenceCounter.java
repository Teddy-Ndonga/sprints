package OccurrenceCounter;

public class OccurrenceCounter {

    public int countOccurrences(int[] arr, int element, int index) {

        if (arr == null || arr.length == 0 || index < 0 || index >= arr.length) {
            return 0;
        }

        int count = (arr[index] == element) ? 1 : 0;

        return count + countOccurrences(arr, element, index + 1);
    }

}