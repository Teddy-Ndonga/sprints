package ArrayModifier;

import java.util.ArrayList;

public class ArrayModifier {

    public static ArrayList<Double> removeElementsBetween(ArrayList<Double> list, int index1, int index2) {

        // Swap indexes if they are in the wrong order
        if (index1 > index2) {
            int temp = index1;
            index1 = index2;
            index2 = temp;
        }

        // Adjust indexes to stay within the list bounds
        if (index1 < 0) {
            index1 = 0;
        }

        if (index2 > list.size()) {
            index2 = list.size();
        }

        // Remove elements from index1 (inclusive) to index2 (exclusive)
        while (index1 < index2) {
            list.remove(index1);
            index2--;
        }

        // Return the modified list
        return list;
    }
}