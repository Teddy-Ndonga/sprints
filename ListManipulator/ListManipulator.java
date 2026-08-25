package ListManipulator;

import java.util.List;

public class ListManipulator {

    public List<String> manipulateList(List<String> list) {

        // Remove last element only if list is not empty
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }

        // Set the new last element only if list is not empty
        if (!list.isEmpty()) {
            list.set(list.size() - 1,
                "The size of the list is " + list.size());
        }

        // Always add "last"
        list.add("last");

        // Set first element only if list is not empty
        list.set(0, "first");

        return list;
    }
}