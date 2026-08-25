package StringConcatenator;

public class StringConcatenator {

    public String concatenate(String... strings) {

        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            result.append(str);
        }

        return result.toString();
    }
}